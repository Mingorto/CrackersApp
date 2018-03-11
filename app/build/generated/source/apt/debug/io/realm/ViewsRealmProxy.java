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
public class ViewsRealmProxy extends test.mingorto.crackersapp.model.Views
    implements RealmObjectProxy, ViewsRealmProxyInterface {

    static final class ViewsColumnInfo extends ColumnInfo {
        long countIndex;

        ViewsColumnInfo(SharedRealm realm, Table table) {
            super(1);
            this.countIndex = addColumnDetails(table, "count", RealmFieldType.INTEGER);
        }

        ViewsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ViewsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ViewsColumnInfo src = (ViewsColumnInfo) rawSrc;
            final ViewsColumnInfo dst = (ViewsColumnInfo) rawDst;
            dst.countIndex = src.countIndex;
        }
    }

    private ViewsColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Views> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("count");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ViewsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ViewsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Views>(this);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Views");
        builder.addProperty("count", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static ViewsColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Views")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Views' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Views");
        final long columnCount = table.getColumnCount();
        if (columnCount != 1) {
            if (columnCount < 1) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 1 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 1 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 1 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final ViewsColumnInfo columnInfo = new ViewsColumnInfo(sharedRealm, table);

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

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Views";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Views createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Views obj = realm.createObjectInternal(test.mingorto.crackersapp.model.Views.class, true, excludeFields);
        if (json.has("count")) {
            if (json.isNull("count")) {
                ((ViewsRealmProxyInterface) obj).realmSet$count(null);
            } else {
                ((ViewsRealmProxyInterface) obj).realmSet$count((int) json.getInt("count"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Views createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.Views obj = new test.mingorto.crackersapp.model.Views();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("count")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ViewsRealmProxyInterface) obj).realmSet$count(null);
                } else {
                    ((ViewsRealmProxyInterface) obj).realmSet$count((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.Views copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Views object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Views) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.Views copy(Realm realm, test.mingorto.crackersapp.model.Views newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Views) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Views realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Views.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ViewsRealmProxyInterface realmObjectSource = (ViewsRealmProxyInterface) newObject;
        ViewsRealmProxyInterface realmObjectCopy = (ViewsRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$count(realmObjectSource.realmGet$count());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Views object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Views.class);
        long tableNativePtr = table.getNativePtr();
        ViewsColumnInfo columnInfo = (ViewsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Views.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((ViewsRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Views.class);
        long tableNativePtr = table.getNativePtr();
        ViewsColumnInfo columnInfo = (ViewsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Views.class);
        test.mingorto.crackersapp.model.Views object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Views) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((ViewsRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Views object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Views.class);
        long tableNativePtr = table.getNativePtr();
        ViewsColumnInfo columnInfo = (ViewsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Views.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((ViewsRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Views.class);
        long tableNativePtr = table.getNativePtr();
        ViewsColumnInfo columnInfo = (ViewsColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Views.class);
        test.mingorto.crackersapp.model.Views object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Views) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((ViewsRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.Views createDetachedCopy(test.mingorto.crackersapp.model.Views realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Views unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Views();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Views) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Views) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ViewsRealmProxyInterface unmanagedCopy = (ViewsRealmProxyInterface) unmanagedObject;
        ViewsRealmProxyInterface realmSource = (ViewsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$count(realmSource.realmGet$count());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Views = proxy[");
        stringBuilder.append("{count:");
        stringBuilder.append(realmGet$count() != null ? realmGet$count() : "null");
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
        ViewsRealmProxy aViews = (ViewsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aViews.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aViews.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aViews.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
