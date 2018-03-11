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
public class MemberRealmProxy extends test.mingorto.crackersapp.model.Member
    implements RealmObjectProxy, MemberRealmProxyInterface {

    static final class MemberColumnInfo extends ColumnInfo {
        long idIndex;
        long group_idIndex;
        long photoIndex;
        long firstNameIndex;
        long lastNameIndex;

        MemberColumnInfo(SharedRealm realm, Table table) {
            super(5);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.group_idIndex = addColumnDetails(table, "group_id", RealmFieldType.INTEGER);
            this.photoIndex = addColumnDetails(table, "photo", RealmFieldType.STRING);
            this.firstNameIndex = addColumnDetails(table, "firstName", RealmFieldType.STRING);
            this.lastNameIndex = addColumnDetails(table, "lastName", RealmFieldType.STRING);
        }

        MemberColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MemberColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MemberColumnInfo src = (MemberColumnInfo) rawSrc;
            final MemberColumnInfo dst = (MemberColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.group_idIndex = src.group_idIndex;
            dst.photoIndex = src.photoIndex;
            dst.firstNameIndex = src.firstNameIndex;
            dst.lastNameIndex = src.lastNameIndex;
        }
    }

    private MemberColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Member> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("group_id");
        fieldNames.add("photo");
        fieldNames.add("firstName");
        fieldNames.add("lastName");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    MemberRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MemberColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Member>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$group_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.group_idIndex);
    }

    @Override
    public void realmSet$group_id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.group_idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.group_idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoIndex);
    }

    @Override
    public void realmSet$photo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$firstName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.firstNameIndex);
    }

    @Override
    public void realmSet$firstName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.firstNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.firstNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.firstNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.firstNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastNameIndex);
    }

    @Override
    public void realmSet$lastName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastNameIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Member");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("group_id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("photo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("firstName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("lastName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static MemberColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Member")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Member' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Member");
        final long columnCount = table.getColumnCount();
        if (columnCount != 5) {
            if (columnCount < 5) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 5 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 5 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 5 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final MemberColumnInfo columnInfo = new MemberColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'id' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.idIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field id");
            }
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'id' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'id' does support null values in the existing Realm file. Use corresponding boxed type for field 'id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("group_id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'group_id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("group_id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'group_id' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.group_idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'group_id' does support null values in the existing Realm file. Use corresponding boxed type for field 'group_id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photoIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo' is required. Either set @Required to field 'photo' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("firstName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'firstName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("firstName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'firstName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.firstNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'firstName' is required. Either set @Required to field 'firstName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("lastName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'lastName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("lastName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'lastName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.lastNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'lastName' is required. Either set @Required to field 'lastName' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Member";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Member createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Member obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class), false, Collections.<String> emptyList());
                    obj = new io.realm.MemberRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.MemberRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Member.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.MemberRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Member.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("group_id")) {
            if (json.isNull("group_id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'group_id' to null.");
            } else {
                ((MemberRealmProxyInterface) obj).realmSet$group_id((int) json.getInt("group_id"));
            }
        }
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                ((MemberRealmProxyInterface) obj).realmSet$photo(null);
            } else {
                ((MemberRealmProxyInterface) obj).realmSet$photo((String) json.getString("photo"));
            }
        }
        if (json.has("firstName")) {
            if (json.isNull("firstName")) {
                ((MemberRealmProxyInterface) obj).realmSet$firstName(null);
            } else {
                ((MemberRealmProxyInterface) obj).realmSet$firstName((String) json.getString("firstName"));
            }
        }
        if (json.has("lastName")) {
            if (json.isNull("lastName")) {
                ((MemberRealmProxyInterface) obj).realmSet$lastName(null);
            } else {
                ((MemberRealmProxyInterface) obj).realmSet$lastName((String) json.getString("lastName"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Member createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.Member obj = new test.mingorto.crackersapp.model.Member();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((MemberRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("group_id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'group_id' to null.");
                } else {
                    ((MemberRealmProxyInterface) obj).realmSet$group_id((int) reader.nextInt());
                }
            } else if (name.equals("photo")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((MemberRealmProxyInterface) obj).realmSet$photo(null);
                } else {
                    ((MemberRealmProxyInterface) obj).realmSet$photo((String) reader.nextString());
                }
            } else if (name.equals("firstName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((MemberRealmProxyInterface) obj).realmSet$firstName(null);
                } else {
                    ((MemberRealmProxyInterface) obj).realmSet$firstName((String) reader.nextString());
                }
            } else if (name.equals("lastName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((MemberRealmProxyInterface) obj).realmSet$lastName(null);
                } else {
                    ((MemberRealmProxyInterface) obj).realmSet$lastName((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.Member copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Member object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Member) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.Member realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((MemberRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.MemberRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            } else {
                canUpdate = false;
            }
        }

        if (canUpdate) {
            return update(realm, realmObject, object, cache);
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static test.mingorto.crackersapp.model.Member copy(Realm realm, test.mingorto.crackersapp.model.Member newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Member) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Member realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Member.class, ((MemberRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        MemberRealmProxyInterface realmObjectSource = (MemberRealmProxyInterface) newObject;
        MemberRealmProxyInterface realmObjectCopy = (MemberRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$group_id(realmObjectSource.realmGet$group_id());
        realmObjectCopy.realmSet$photo(realmObjectSource.realmGet$photo());
        realmObjectCopy.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectCopy.realmSet$lastName(realmObjectSource.realmGet$lastName());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Member object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
        long tableNativePtr = table.getNativePtr();
        MemberColumnInfo columnInfo = (MemberColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((MemberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MemberRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((MemberRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.group_idIndex, rowIndex, ((MemberRealmProxyInterface) object).realmGet$group_id(), false);
        String realmGet$photo = ((MemberRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoIndex, rowIndex, realmGet$photo, false);
        }
        String realmGet$firstName = ((MemberRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        }
        String realmGet$lastName = ((MemberRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
        long tableNativePtr = table.getNativePtr();
        MemberColumnInfo columnInfo = (MemberColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Member object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Member) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((MemberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MemberRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((MemberRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.group_idIndex, rowIndex, ((MemberRealmProxyInterface) object).realmGet$group_id(), false);
            String realmGet$photo = ((MemberRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoIndex, rowIndex, realmGet$photo, false);
            }
            String realmGet$firstName = ((MemberRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            }
            String realmGet$lastName = ((MemberRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Member object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
        long tableNativePtr = table.getNativePtr();
        MemberColumnInfo columnInfo = (MemberColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((MemberRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MemberRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((MemberRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.group_idIndex, rowIndex, ((MemberRealmProxyInterface) object).realmGet$group_id(), false);
        String realmGet$photo = ((MemberRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoIndex, rowIndex, realmGet$photo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoIndex, rowIndex, false);
        }
        String realmGet$firstName = ((MemberRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
        }
        String realmGet$lastName = ((MemberRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Member.class);
        long tableNativePtr = table.getNativePtr();
        MemberColumnInfo columnInfo = (MemberColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Member.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Member object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Member) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((MemberRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((MemberRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((MemberRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.group_idIndex, rowIndex, ((MemberRealmProxyInterface) object).realmGet$group_id(), false);
            String realmGet$photo = ((MemberRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoIndex, rowIndex, realmGet$photo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoIndex, rowIndex, false);
            }
            String realmGet$firstName = ((MemberRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
            }
            String realmGet$lastName = ((MemberRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.Member createDetachedCopy(test.mingorto.crackersapp.model.Member realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Member unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Member();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Member) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Member) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        MemberRealmProxyInterface unmanagedCopy = (MemberRealmProxyInterface) unmanagedObject;
        MemberRealmProxyInterface realmSource = (MemberRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$group_id(realmSource.realmGet$group_id());
        unmanagedCopy.realmSet$photo(realmSource.realmGet$photo());
        unmanagedCopy.realmSet$firstName(realmSource.realmGet$firstName());
        unmanagedCopy.realmSet$lastName(realmSource.realmGet$lastName());
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.Member update(Realm realm, test.mingorto.crackersapp.model.Member realmObject, test.mingorto.crackersapp.model.Member newObject, Map<RealmModel, RealmObjectProxy> cache) {
        MemberRealmProxyInterface realmObjectTarget = (MemberRealmProxyInterface) realmObject;
        MemberRealmProxyInterface realmObjectSource = (MemberRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$group_id(realmObjectSource.realmGet$group_id());
        realmObjectTarget.realmSet$photo(realmObjectSource.realmGet$photo());
        realmObjectTarget.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectTarget.realmSet$lastName(realmObjectSource.realmGet$lastName());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Member = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{group_id:");
        stringBuilder.append(realmGet$group_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo:");
        stringBuilder.append(realmGet$photo() != null ? realmGet$photo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{firstName:");
        stringBuilder.append(realmGet$firstName() != null ? realmGet$firstName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastName:");
        stringBuilder.append(realmGet$lastName() != null ? realmGet$lastName() : "null");
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
        MemberRealmProxy aMember = (MemberRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMember.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMember.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMember.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
