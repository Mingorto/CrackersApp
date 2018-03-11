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
public class ProfileRealmProxy extends test.mingorto.crackersapp.model.Profile
    implements RealmObjectProxy, ProfileRealmProxyInterface {

    static final class ProfileColumnInfo extends ColumnInfo {
        long idIndex;
        long isContactIndex;
        long photo50Index;
        long photo100Index;
        long firstNameIndex;
        long lastNameIndex;
        long sexIndex;
        long screenNameIndex;
        long onlineIndex;
        long hiddenIndex;

        ProfileColumnInfo(SharedRealm realm, Table table) {
            super(10);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.isContactIndex = addColumnDetails(table, "isContact", RealmFieldType.BOOLEAN);
            this.photo50Index = addColumnDetails(table, "photo50", RealmFieldType.STRING);
            this.photo100Index = addColumnDetails(table, "photo100", RealmFieldType.STRING);
            this.firstNameIndex = addColumnDetails(table, "firstName", RealmFieldType.STRING);
            this.lastNameIndex = addColumnDetails(table, "lastName", RealmFieldType.STRING);
            this.sexIndex = addColumnDetails(table, "sex", RealmFieldType.INTEGER);
            this.screenNameIndex = addColumnDetails(table, "screenName", RealmFieldType.STRING);
            this.onlineIndex = addColumnDetails(table, "online", RealmFieldType.INTEGER);
            this.hiddenIndex = addColumnDetails(table, "hidden", RealmFieldType.INTEGER);
        }

        ProfileColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProfileColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProfileColumnInfo src = (ProfileColumnInfo) rawSrc;
            final ProfileColumnInfo dst = (ProfileColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.isContactIndex = src.isContactIndex;
            dst.photo50Index = src.photo50Index;
            dst.photo100Index = src.photo100Index;
            dst.firstNameIndex = src.firstNameIndex;
            dst.lastNameIndex = src.lastNameIndex;
            dst.sexIndex = src.sexIndex;
            dst.screenNameIndex = src.screenNameIndex;
            dst.onlineIndex = src.onlineIndex;
            dst.hiddenIndex = src.hiddenIndex;
        }
    }

    private ProfileColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Profile> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("isContact");
        fieldNames.add("photo50");
        fieldNames.add("photo100");
        fieldNames.add("firstName");
        fieldNames.add("lastName");
        fieldNames.add("sex");
        fieldNames.add("screenName");
        fieldNames.add("online");
        fieldNames.add("hidden");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ProfileRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProfileColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Profile>(this);
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
    public boolean realmGet$isContact() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isContactIndex);
    }

    @Override
    public void realmSet$isContact(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isContactIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isContactIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo50() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo50Index);
    }

    @Override
    public void realmSet$photo50(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo50Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo50Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo50Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo50Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo100() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo100Index);
    }

    @Override
    public void realmSet$photo100(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo100Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo100Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo100Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo100Index, value);
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$sex() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sexIndex);
    }

    @Override
    public void realmSet$sex(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sexIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sexIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$screenName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.screenNameIndex);
    }

    @Override
    public void realmSet$screenName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.screenNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.screenNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.screenNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.screenNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$online() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.onlineIndex);
    }

    @Override
    public void realmSet$online(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.onlineIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.onlineIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$hidden() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.hiddenIndex);
    }

    @Override
    public void realmSet$hidden(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.hiddenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.hiddenIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Profile");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("isContact", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("photo50", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo100", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("firstName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("lastName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("sex", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("screenName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("online", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("hidden", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static ProfileColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Profile")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Profile' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Profile");
        final long columnCount = table.getColumnCount();
        if (columnCount != 10) {
            if (columnCount < 10) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 10 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 10 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 10 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final ProfileColumnInfo columnInfo = new ProfileColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("isContact")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isContact' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isContact") != RealmFieldType.BOOLEAN) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'boolean' for field 'isContact' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.isContactIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'isContact' does support null values in the existing Realm file. Use corresponding boxed type for field 'isContact' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo50")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo50' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo50") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo50' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo50Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo50' is required. Either set @Required to field 'photo50' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo100")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo100' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo100") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo100' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo100Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo100' is required. Either set @Required to field 'photo100' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("sex")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'sex' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("sex") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'sex' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.sexIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'sex' does support null values in the existing Realm file. Use corresponding boxed type for field 'sex' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("screenName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'screenName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("screenName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'screenName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.screenNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'screenName' is required. Either set @Required to field 'screenName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("online")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'online' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("online") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'online' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.onlineIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'online' does support null values in the existing Realm file. Use corresponding boxed type for field 'online' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("hidden")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'hidden' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("hidden") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'hidden' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.hiddenIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'hidden' does support null values in the existing Realm file. Use corresponding boxed type for field 'hidden' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Profile";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Profile createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Profile obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ProfileRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.ProfileRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Profile.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ProfileRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Profile.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("isContact")) {
            if (json.isNull("isContact")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isContact' to null.");
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$isContact((boolean) json.getBoolean("isContact"));
            }
        }
        if (json.has("photo50")) {
            if (json.isNull("photo50")) {
                ((ProfileRealmProxyInterface) obj).realmSet$photo50(null);
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$photo50((String) json.getString("photo50"));
            }
        }
        if (json.has("photo100")) {
            if (json.isNull("photo100")) {
                ((ProfileRealmProxyInterface) obj).realmSet$photo100(null);
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$photo100((String) json.getString("photo100"));
            }
        }
        if (json.has("firstName")) {
            if (json.isNull("firstName")) {
                ((ProfileRealmProxyInterface) obj).realmSet$firstName(null);
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$firstName((String) json.getString("firstName"));
            }
        }
        if (json.has("lastName")) {
            if (json.isNull("lastName")) {
                ((ProfileRealmProxyInterface) obj).realmSet$lastName(null);
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$lastName((String) json.getString("lastName"));
            }
        }
        if (json.has("sex")) {
            if (json.isNull("sex")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$sex((int) json.getInt("sex"));
            }
        }
        if (json.has("screenName")) {
            if (json.isNull("screenName")) {
                ((ProfileRealmProxyInterface) obj).realmSet$screenName(null);
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$screenName((String) json.getString("screenName"));
            }
        }
        if (json.has("online")) {
            if (json.isNull("online")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'online' to null.");
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$online((int) json.getInt("online"));
            }
        }
        if (json.has("hidden")) {
            if (json.isNull("hidden")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hidden' to null.");
            } else {
                ((ProfileRealmProxyInterface) obj).realmSet$hidden((int) json.getInt("hidden"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Profile createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.Profile obj = new test.mingorto.crackersapp.model.Profile();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("isContact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isContact' to null.");
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$isContact((boolean) reader.nextBoolean());
                }
            } else if (name.equals("photo50")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfileRealmProxyInterface) obj).realmSet$photo50(null);
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$photo50((String) reader.nextString());
                }
            } else if (name.equals("photo100")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfileRealmProxyInterface) obj).realmSet$photo100(null);
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$photo100((String) reader.nextString());
                }
            } else if (name.equals("firstName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfileRealmProxyInterface) obj).realmSet$firstName(null);
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$firstName((String) reader.nextString());
                }
            } else if (name.equals("lastName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfileRealmProxyInterface) obj).realmSet$lastName(null);
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$lastName((String) reader.nextString());
                }
            } else if (name.equals("sex")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$sex((int) reader.nextInt());
                }
            } else if (name.equals("screenName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ProfileRealmProxyInterface) obj).realmSet$screenName(null);
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$screenName((String) reader.nextString());
                }
            } else if (name.equals("online")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'online' to null.");
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$online((int) reader.nextInt());
                }
            } else if (name.equals("hidden")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hidden' to null.");
                } else {
                    ((ProfileRealmProxyInterface) obj).realmSet$hidden((int) reader.nextInt());
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

    public static test.mingorto.crackersapp.model.Profile copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Profile object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Profile) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.Profile realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((ProfileRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.ProfileRealmProxy();
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

    public static test.mingorto.crackersapp.model.Profile copy(Realm realm, test.mingorto.crackersapp.model.Profile newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Profile) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Profile realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Profile.class, ((ProfileRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ProfileRealmProxyInterface realmObjectSource = (ProfileRealmProxyInterface) newObject;
        ProfileRealmProxyInterface realmObjectCopy = (ProfileRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$isContact(realmObjectSource.realmGet$isContact());
        realmObjectCopy.realmSet$photo50(realmObjectSource.realmGet$photo50());
        realmObjectCopy.realmSet$photo100(realmObjectSource.realmGet$photo100());
        realmObjectCopy.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectCopy.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectCopy.realmSet$sex(realmObjectSource.realmGet$sex());
        realmObjectCopy.realmSet$screenName(realmObjectSource.realmGet$screenName());
        realmObjectCopy.realmSet$online(realmObjectSource.realmGet$online());
        realmObjectCopy.realmSet$hidden(realmObjectSource.realmGet$hidden());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Profile object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((ProfileRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfileRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfileRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isContactIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$isContact(), false);
        String realmGet$photo50 = ((ProfileRealmProxyInterface) object).realmGet$photo50();
        if (realmGet$photo50 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
        }
        String realmGet$photo100 = ((ProfileRealmProxyInterface) object).realmGet$photo100();
        if (realmGet$photo100 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
        }
        String realmGet$firstName = ((ProfileRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        }
        String realmGet$lastName = ((ProfileRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$sex(), false);
        String realmGet$screenName = ((ProfileRealmProxyInterface) object).realmGet$screenName();
        if (realmGet$screenName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.onlineIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$online(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hiddenIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$hidden(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Profile object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Profile) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((ProfileRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfileRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfileRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isContactIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$isContact(), false);
            String realmGet$photo50 = ((ProfileRealmProxyInterface) object).realmGet$photo50();
            if (realmGet$photo50 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
            }
            String realmGet$photo100 = ((ProfileRealmProxyInterface) object).realmGet$photo100();
            if (realmGet$photo100 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
            }
            String realmGet$firstName = ((ProfileRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            }
            String realmGet$lastName = ((ProfileRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$sex(), false);
            String realmGet$screenName = ((ProfileRealmProxyInterface) object).realmGet$screenName();
            if (realmGet$screenName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.onlineIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$online(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hiddenIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$hidden(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Profile object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((ProfileRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfileRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfileRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isContactIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$isContact(), false);
        String realmGet$photo50 = ((ProfileRealmProxyInterface) object).realmGet$photo50();
        if (realmGet$photo50 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo50Index, rowIndex, false);
        }
        String realmGet$photo100 = ((ProfileRealmProxyInterface) object).realmGet$photo100();
        if (realmGet$photo100 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo100Index, rowIndex, false);
        }
        String realmGet$firstName = ((ProfileRealmProxyInterface) object).realmGet$firstName();
        if (realmGet$firstName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
        }
        String realmGet$lastName = ((ProfileRealmProxyInterface) object).realmGet$lastName();
        if (realmGet$lastName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$sex(), false);
        String realmGet$screenName = ((ProfileRealmProxyInterface) object).realmGet$screenName();
        if (realmGet$screenName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.screenNameIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.onlineIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$online(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hiddenIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$hidden(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Profile.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Profile object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Profile) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((ProfileRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((ProfileRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((ProfileRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isContactIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$isContact(), false);
            String realmGet$photo50 = ((ProfileRealmProxyInterface) object).realmGet$photo50();
            if (realmGet$photo50 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo50Index, rowIndex, false);
            }
            String realmGet$photo100 = ((ProfileRealmProxyInterface) object).realmGet$photo100();
            if (realmGet$photo100 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo100Index, rowIndex, false);
            }
            String realmGet$firstName = ((ProfileRealmProxyInterface) object).realmGet$firstName();
            if (realmGet$firstName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstNameIndex, rowIndex, realmGet$firstName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstNameIndex, rowIndex, false);
            }
            String realmGet$lastName = ((ProfileRealmProxyInterface) object).realmGet$lastName();
            if (realmGet$lastName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastNameIndex, rowIndex, realmGet$lastName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastNameIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$sex(), false);
            String realmGet$screenName = ((ProfileRealmProxyInterface) object).realmGet$screenName();
            if (realmGet$screenName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.screenNameIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.onlineIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$online(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hiddenIndex, rowIndex, ((ProfileRealmProxyInterface) object).realmGet$hidden(), false);
        }
    }

    public static test.mingorto.crackersapp.model.Profile createDetachedCopy(test.mingorto.crackersapp.model.Profile realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Profile unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Profile();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Profile) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Profile) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ProfileRealmProxyInterface unmanagedCopy = (ProfileRealmProxyInterface) unmanagedObject;
        ProfileRealmProxyInterface realmSource = (ProfileRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$isContact(realmSource.realmGet$isContact());
        unmanagedCopy.realmSet$photo50(realmSource.realmGet$photo50());
        unmanagedCopy.realmSet$photo100(realmSource.realmGet$photo100());
        unmanagedCopy.realmSet$firstName(realmSource.realmGet$firstName());
        unmanagedCopy.realmSet$lastName(realmSource.realmGet$lastName());
        unmanagedCopy.realmSet$sex(realmSource.realmGet$sex());
        unmanagedCopy.realmSet$screenName(realmSource.realmGet$screenName());
        unmanagedCopy.realmSet$online(realmSource.realmGet$online());
        unmanagedCopy.realmSet$hidden(realmSource.realmGet$hidden());
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.Profile update(Realm realm, test.mingorto.crackersapp.model.Profile realmObject, test.mingorto.crackersapp.model.Profile newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ProfileRealmProxyInterface realmObjectTarget = (ProfileRealmProxyInterface) realmObject;
        ProfileRealmProxyInterface realmObjectSource = (ProfileRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$isContact(realmObjectSource.realmGet$isContact());
        realmObjectTarget.realmSet$photo50(realmObjectSource.realmGet$photo50());
        realmObjectTarget.realmSet$photo100(realmObjectSource.realmGet$photo100());
        realmObjectTarget.realmSet$firstName(realmObjectSource.realmGet$firstName());
        realmObjectTarget.realmSet$lastName(realmObjectSource.realmGet$lastName());
        realmObjectTarget.realmSet$sex(realmObjectSource.realmGet$sex());
        realmObjectTarget.realmSet$screenName(realmObjectSource.realmGet$screenName());
        realmObjectTarget.realmSet$online(realmObjectSource.realmGet$online());
        realmObjectTarget.realmSet$hidden(realmObjectSource.realmGet$hidden());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Profile = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isContact:");
        stringBuilder.append(realmGet$isContact());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo50:");
        stringBuilder.append(realmGet$photo50() != null ? realmGet$photo50() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo100:");
        stringBuilder.append(realmGet$photo100() != null ? realmGet$photo100() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{firstName:");
        stringBuilder.append(realmGet$firstName() != null ? realmGet$firstName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastName:");
        stringBuilder.append(realmGet$lastName() != null ? realmGet$lastName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sex:");
        stringBuilder.append(realmGet$sex());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{screenName:");
        stringBuilder.append(realmGet$screenName() != null ? realmGet$screenName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{online:");
        stringBuilder.append(realmGet$online());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hidden:");
        stringBuilder.append(realmGet$hidden());
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
        ProfileRealmProxy aProfile = (ProfileRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aProfile.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aProfile.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aProfile.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
