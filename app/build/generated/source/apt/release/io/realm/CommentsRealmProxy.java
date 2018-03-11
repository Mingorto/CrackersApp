package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class CommentsRealmProxy extends test.mingorto.crackersapp.model.countable.Comments
    implements RealmObjectProxy, CommentsRealmProxyInterface {

    static final class CommentsColumnInfo extends ColumnInfo {
        long countIndex;
        long canPostIndex;

        CommentsColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.countIndex = addColumnDetails(table, "count", RealmFieldType.INTEGER);
            this.canPostIndex = addColumnDetails(table, "canPost", RealmFieldType.INTEGER);
        }

        CommentsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CommentsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CommentsColumnInfo src = (CommentsColumnInfo) rawSrc;
            final CommentsColumnInfo dst = (CommentsColumnInfo) rawDst;
            dst.countIndex = src.countIndex;
            dst.canPostIndex = src.canPostIndex;
        }
    }

    private CommentsColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.countable.Comments> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("count");
        fieldNames.add("canPost");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CommentsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CommentsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.countable.Comments>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$count() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.countIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.countIndex);
    }

    @Override
    public void realmSet$count(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.countIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.countIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$canPost() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.canPostIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.canPostIndex);
    }

    @Override
    public void realmSet$canPost(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.canPostIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.canPostIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.canPostIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.canPostIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Comments");
        builder.addProperty("count", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("canPost", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static CommentsColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Comments")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Comments' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Comments");
        final long columnCount = table.getColumnCount();
        if (columnCount != 2) {
            if (columnCount < 2) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 2 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 2 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 2 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final CommentsColumnInfo columnInfo = new CommentsColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("count")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'count' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("count") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'count' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.countIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'count' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'count' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("canPost")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'canPost' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("canPost") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'canPost' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.canPostIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'canPost' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'canPost' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Comments";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.countable.Comments createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.countable.Comments obj = realm.createObjectInternal(test.mingorto.crackersapp.model.countable.Comments.class, true, excludeFields);
        if (json.has("count")) {
            if (json.isNull("count")) {
                ((CommentsRealmProxyInterface) obj).realmSet$count(null);
            } else {
                ((CommentsRealmProxyInterface) obj).realmSet$count((int) json.getInt("count"));
            }
        }
        if (json.has("canPost")) {
            if (json.isNull("canPost")) {
                ((CommentsRealmProxyInterface) obj).realmSet$canPost(null);
            } else {
                ((CommentsRealmProxyInterface) obj).realmSet$canPost((int) json.getInt("canPost"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.countable.Comments createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.countable.Comments obj = new test.mingorto.crackersapp.model.countable.Comments();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("count")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentsRealmProxyInterface) obj).realmSet$count(null);
                } else {
                    ((CommentsRealmProxyInterface) obj).realmSet$count((int) reader.nextInt());
                }
            } else if (name.equals("canPost")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentsRealmProxyInterface) obj).realmSet$canPost(null);
                } else {
                    ((CommentsRealmProxyInterface) obj).realmSet$canPost((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.countable.Comments copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.countable.Comments object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.countable.Comments) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.countable.Comments copy(Realm realm, test.mingorto.crackersapp.model.countable.Comments newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.countable.Comments) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.countable.Comments realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.countable.Comments.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        CommentsRealmProxyInterface realmObjectSource = (CommentsRealmProxyInterface) newObject;
        CommentsRealmProxyInterface realmObjectCopy = (CommentsRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$count(realmObjectSource.realmGet$count());
        realmObjectCopy.realmSet$canPost(realmObjectSource.realmGet$canPost());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.countable.Comments object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Comments.class);
        long tableNativePtr = table.getNativePtr();
        CommentsColumnInfo columnInfo = (CommentsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Comments.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((CommentsRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        }
        Number realmGet$canPost = ((CommentsRealmProxyInterface) object).realmGet$canPost();
        if (realmGet$canPost != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPostIndex, rowIndex, realmGet$canPost.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Comments.class);
        long tableNativePtr = table.getNativePtr();
        CommentsColumnInfo columnInfo = (CommentsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Comments.class);
        test.mingorto.crackersapp.model.countable.Comments object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.countable.Comments) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((CommentsRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            }
            Number realmGet$canPost = ((CommentsRealmProxyInterface) object).realmGet$canPost();
            if (realmGet$canPost != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPostIndex, rowIndex, realmGet$canPost.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.countable.Comments object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Comments.class);
        long tableNativePtr = table.getNativePtr();
        CommentsColumnInfo columnInfo = (CommentsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Comments.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((CommentsRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
        }
        Number realmGet$canPost = ((CommentsRealmProxyInterface) object).realmGet$canPost();
        if (realmGet$canPost != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPostIndex, rowIndex, realmGet$canPost.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.canPostIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Comments.class);
        long tableNativePtr = table.getNativePtr();
        CommentsColumnInfo columnInfo = (CommentsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Comments.class);
        test.mingorto.crackersapp.model.countable.Comments object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.countable.Comments) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((CommentsRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
            }
            Number realmGet$canPost = ((CommentsRealmProxyInterface) object).realmGet$canPost();
            if (realmGet$canPost != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPostIndex, rowIndex, realmGet$canPost.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.canPostIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.countable.Comments createDetachedCopy(test.mingorto.crackersapp.model.countable.Comments realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.countable.Comments unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.countable.Comments();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.countable.Comments) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.countable.Comments) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        CommentsRealmProxyInterface unmanagedCopy = (CommentsRealmProxyInterface) unmanagedObject;
        CommentsRealmProxyInterface realmSource = (CommentsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$count(realmSource.realmGet$count());
        unmanagedCopy.realmSet$canPost(realmSource.realmGet$canPost());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Comments = proxy[");
        stringBuilder.append("{count:");
        stringBuilder.append(realmGet$count() != null ? realmGet$count() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{canPost:");
        stringBuilder.append(realmGet$canPost() != null ? realmGet$canPost() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsRealmProxy aComments = (CommentsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aComments.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aComments.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aComments.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
