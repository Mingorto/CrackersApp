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
public class PlaceRealmProxy extends test.mingorto.crackersapp.model.Place
    implements RealmObjectProxy, PlaceRealmProxyInterface {

    static final class PlaceColumnInfo extends ColumnInfo {
        long ownerIdIndex;
        long postIdIndex;

        PlaceColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.STRING);
            this.postIdIndex = addColumnDetails(table, "postId", RealmFieldType.STRING);
        }

        PlaceColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PlaceColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PlaceColumnInfo src = (PlaceColumnInfo) rawSrc;
            final PlaceColumnInfo dst = (PlaceColumnInfo) rawDst;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.postIdIndex = src.postIdIndex;
        }
    }

    private PlaceColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Place> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("ownerId");
        fieldNames.add("postId");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PlaceRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PlaceColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Place>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ownerId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ownerIdIndex);
    }

    @Override
    public void realmSet$ownerId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ownerIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.ownerIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ownerIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ownerIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$postId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.postIdIndex);
    }

    @Override
    public void realmSet$postId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.postIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.postIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.postIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.postIdIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Place");
        builder.addProperty("ownerId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("postId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static PlaceColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Place")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Place' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Place");
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

        final PlaceColumnInfo columnInfo = new PlaceColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("ownerId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'ownerId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("ownerId") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'ownerId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.ownerIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'ownerId' is required. Either set @Required to field 'ownerId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("postId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'postId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("postId") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'postId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.postIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'postId' is required. Either set @Required to field 'postId' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Place";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Place createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Place obj = realm.createObjectInternal(test.mingorto.crackersapp.model.Place.class, true, excludeFields);
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                ((PlaceRealmProxyInterface) obj).realmSet$ownerId(null);
            } else {
                ((PlaceRealmProxyInterface) obj).realmSet$ownerId((String) json.getString("ownerId"));
            }
        }
        if (json.has("postId")) {
            if (json.isNull("postId")) {
                ((PlaceRealmProxyInterface) obj).realmSet$postId(null);
            } else {
                ((PlaceRealmProxyInterface) obj).realmSet$postId((String) json.getString("postId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Place createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.Place obj = new test.mingorto.crackersapp.model.Place();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PlaceRealmProxyInterface) obj).realmSet$ownerId(null);
                } else {
                    ((PlaceRealmProxyInterface) obj).realmSet$ownerId((String) reader.nextString());
                }
            } else if (name.equals("postId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PlaceRealmProxyInterface) obj).realmSet$postId(null);
                } else {
                    ((PlaceRealmProxyInterface) obj).realmSet$postId((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.Place copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Place object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Place) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.Place copy(Realm realm, test.mingorto.crackersapp.model.Place newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Place) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Place realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Place.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        PlaceRealmProxyInterface realmObjectSource = (PlaceRealmProxyInterface) newObject;
        PlaceRealmProxyInterface realmObjectCopy = (PlaceRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$postId(realmObjectSource.realmGet$postId());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Place object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Place.class);
        long tableNativePtr = table.getNativePtr();
        PlaceColumnInfo columnInfo = (PlaceColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Place.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$ownerId = ((PlaceRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId, false);
        }
        String realmGet$postId = ((PlaceRealmProxyInterface) object).realmGet$postId();
        if (realmGet$postId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.postIdIndex, rowIndex, realmGet$postId, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Place.class);
        long tableNativePtr = table.getNativePtr();
        PlaceColumnInfo columnInfo = (PlaceColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Place.class);
        test.mingorto.crackersapp.model.Place object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Place) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$ownerId = ((PlaceRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId, false);
            }
            String realmGet$postId = ((PlaceRealmProxyInterface) object).realmGet$postId();
            if (realmGet$postId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.postIdIndex, rowIndex, realmGet$postId, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Place object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Place.class);
        long tableNativePtr = table.getNativePtr();
        PlaceColumnInfo columnInfo = (PlaceColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Place.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$ownerId = ((PlaceRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
        }
        String realmGet$postId = ((PlaceRealmProxyInterface) object).realmGet$postId();
        if (realmGet$postId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.postIdIndex, rowIndex, realmGet$postId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.postIdIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Place.class);
        long tableNativePtr = table.getNativePtr();
        PlaceColumnInfo columnInfo = (PlaceColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Place.class);
        test.mingorto.crackersapp.model.Place object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Place) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$ownerId = ((PlaceRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
            }
            String realmGet$postId = ((PlaceRealmProxyInterface) object).realmGet$postId();
            if (realmGet$postId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.postIdIndex, rowIndex, realmGet$postId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.postIdIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.Place createDetachedCopy(test.mingorto.crackersapp.model.Place realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Place unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Place();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Place) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Place) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        PlaceRealmProxyInterface unmanagedCopy = (PlaceRealmProxyInterface) unmanagedObject;
        PlaceRealmProxyInterface realmSource = (PlaceRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$postId(realmSource.realmGet$postId());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Place = proxy[");
        stringBuilder.append("{ownerId:");
        stringBuilder.append(realmGet$ownerId() != null ? realmGet$ownerId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{postId:");
        stringBuilder.append(realmGet$postId() != null ? realmGet$postId() : "null");
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

}
