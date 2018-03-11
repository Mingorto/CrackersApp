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
public class FileRealmProxy extends test.mingorto.crackersapp.model.attachment.video.File
    implements RealmObjectProxy, FileRealmProxyInterface {

    static final class FileColumnInfo extends ColumnInfo {
        long externalIndex;

        FileColumnInfo(SharedRealm realm, Table table) {
            super(1);
            this.externalIndex = addColumnDetails(table, "external", RealmFieldType.STRING);
        }

        FileColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FileColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FileColumnInfo src = (FileColumnInfo) rawSrc;
            final FileColumnInfo dst = (FileColumnInfo) rawDst;
            dst.externalIndex = src.externalIndex;
        }
    }

    private FileColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.video.File> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("external");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    FileRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FileColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.video.File>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$external() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.externalIndex);
    }

    @Override
    public void realmSet$external(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.externalIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.externalIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.externalIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.externalIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("File");
        builder.addProperty("external", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static FileColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_File")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'File' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_File");
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

        final FileColumnInfo columnInfo = new FileColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("external")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'external' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("external") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'external' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.externalIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'external' is required. Either set @Required to field 'external' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_File";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.video.File createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.attachment.video.File obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.video.File.class, true, excludeFields);
        if (json.has("external")) {
            if (json.isNull("external")) {
                ((FileRealmProxyInterface) obj).realmSet$external(null);
            } else {
                ((FileRealmProxyInterface) obj).realmSet$external((String) json.getString("external"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.video.File createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.video.File obj = new test.mingorto.crackersapp.model.attachment.video.File();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("external")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((FileRealmProxyInterface) obj).realmSet$external(null);
                } else {
                    ((FileRealmProxyInterface) obj).realmSet$external((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.video.File copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.video.File object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.video.File) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.video.File copy(Realm realm, test.mingorto.crackersapp.model.attachment.video.File newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.video.File) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.video.File realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.video.File.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        FileRealmProxyInterface realmObjectSource = (FileRealmProxyInterface) newObject;
        FileRealmProxyInterface realmObjectCopy = (FileRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$external(realmObjectSource.realmGet$external());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.video.File object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.File.class);
        long tableNativePtr = table.getNativePtr();
        FileColumnInfo columnInfo = (FileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.File.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$external = ((FileRealmProxyInterface) object).realmGet$external();
        if (realmGet$external != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.externalIndex, rowIndex, realmGet$external, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.File.class);
        long tableNativePtr = table.getNativePtr();
        FileColumnInfo columnInfo = (FileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.File.class);
        test.mingorto.crackersapp.model.attachment.video.File object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.video.File) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$external = ((FileRealmProxyInterface) object).realmGet$external();
            if (realmGet$external != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.externalIndex, rowIndex, realmGet$external, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.video.File object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.File.class);
        long tableNativePtr = table.getNativePtr();
        FileColumnInfo columnInfo = (FileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.File.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$external = ((FileRealmProxyInterface) object).realmGet$external();
        if (realmGet$external != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.externalIndex, rowIndex, realmGet$external, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.externalIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.File.class);
        long tableNativePtr = table.getNativePtr();
        FileColumnInfo columnInfo = (FileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.File.class);
        test.mingorto.crackersapp.model.attachment.video.File object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.video.File) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$external = ((FileRealmProxyInterface) object).realmGet$external();
            if (realmGet$external != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.externalIndex, rowIndex, realmGet$external, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.externalIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.video.File createDetachedCopy(test.mingorto.crackersapp.model.attachment.video.File realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.video.File unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.video.File();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.video.File) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.video.File) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        FileRealmProxyInterface unmanagedCopy = (FileRealmProxyInterface) unmanagedObject;
        FileRealmProxyInterface realmSource = (FileRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$external(realmSource.realmGet$external());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("File = proxy[");
        stringBuilder.append("{external:");
        stringBuilder.append(realmGet$external() != null ? realmGet$external() : "null");
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
        FileRealmProxy aFile = (FileRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aFile.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFile.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aFile.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
