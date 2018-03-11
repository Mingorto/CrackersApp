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
public class ContactRealmProxy extends test.mingorto.crackersapp.model.Contact
    implements RealmObjectProxy, ContactRealmProxyInterface {

    static final class ContactColumnInfo extends ColumnInfo {
        long userIdIndex;
        long descIndex;

        ContactColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.userIdIndex = addColumnDetails(table, "userId", RealmFieldType.INTEGER);
            this.descIndex = addColumnDetails(table, "desc", RealmFieldType.STRING);
        }

        ContactColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactColumnInfo src = (ContactColumnInfo) rawSrc;
            final ContactColumnInfo dst = (ContactColumnInfo) rawDst;
            dst.userIdIndex = src.userIdIndex;
            dst.descIndex = src.descIndex;
        }
    }

    private ContactColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Contact> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("userId");
        fieldNames.add("desc");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ContactRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Contact>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descIndex);
    }

    @Override
    public void realmSet$desc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Contact");
        builder.addProperty("userId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static ContactColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Contact")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Contact' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Contact");
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

        final ContactColumnInfo columnInfo = new ContactColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("userId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'userId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("userId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'userId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.userIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'userId' does support null values in the existing Realm file. Use corresponding boxed type for field 'userId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("desc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'desc' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("desc") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'desc' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.descIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'desc' is required. Either set @Required to field 'desc' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Contact";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Contact createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Contact obj = realm.createObjectInternal(test.mingorto.crackersapp.model.Contact.class, true, excludeFields);
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
            } else {
                ((ContactRealmProxyInterface) obj).realmSet$userId((int) json.getInt("userId"));
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                ((ContactRealmProxyInterface) obj).realmSet$desc(null);
            } else {
                ((ContactRealmProxyInterface) obj).realmSet$desc((String) json.getString("desc"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Contact createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.Contact obj = new test.mingorto.crackersapp.model.Contact();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
                } else {
                    ((ContactRealmProxyInterface) obj).realmSet$userId((int) reader.nextInt());
                }
            } else if (name.equals("desc")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ContactRealmProxyInterface) obj).realmSet$desc(null);
                } else {
                    ((ContactRealmProxyInterface) obj).realmSet$desc((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.Contact copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Contact object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Contact) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.Contact copy(Realm realm, test.mingorto.crackersapp.model.Contact newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Contact) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Contact realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Contact.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ContactRealmProxyInterface realmObjectSource = (ContactRealmProxyInterface) newObject;
        ContactRealmProxyInterface realmObjectCopy = (ContactRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$desc(realmObjectSource.realmGet$desc());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Contact.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, ((ContactRealmProxyInterface) object).realmGet$userId(), false);
        String realmGet$desc = ((ContactRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Contact.class);
        test.mingorto.crackersapp.model.Contact object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, ((ContactRealmProxyInterface) object).realmGet$userId(), false);
            String realmGet$desc = ((ContactRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Contact.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, ((ContactRealmProxyInterface) object).realmGet$userId(), false);
        String realmGet$desc = ((ContactRealmProxyInterface) object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Contact.class);
        test.mingorto.crackersapp.model.Contact object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, ((ContactRealmProxyInterface) object).realmGet$userId(), false);
            String realmGet$desc = ((ContactRealmProxyInterface) object).realmGet$desc();
            if (realmGet$desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.Contact createDetachedCopy(test.mingorto.crackersapp.model.Contact realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Contact unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Contact();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Contact) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Contact) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ContactRealmProxyInterface unmanagedCopy = (ContactRealmProxyInterface) unmanagedObject;
        ContactRealmProxyInterface realmSource = (ContactRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$desc(realmSource.realmGet$desc());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Contact = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
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
        ContactRealmProxy aContact = (ContactRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContact.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContact.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContact.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
