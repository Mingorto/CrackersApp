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
public class PhotoRealmProxy extends test.mingorto.crackersapp.model.attachment.Photo
    implements RealmObjectProxy, PhotoRealmProxyInterface {

    static final class PhotoColumnInfo extends ColumnInfo {
        long idIndex;
        long albumIdIndex;
        long ownerIdIndex;
        long userIdIndex;
        long photo75Index;
        long photo130Index;
        long photo604Index;
        long photo807Index;
        long photo1280Index;
        long widthIndex;
        long heightIndex;
        long textIndex;
        long dateIndex;
        long accessKeyIndex;

        PhotoColumnInfo(SharedRealm realm, Table table) {
            super(14);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.albumIdIndex = addColumnDetails(table, "albumId", RealmFieldType.INTEGER);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.INTEGER);
            this.userIdIndex = addColumnDetails(table, "userId", RealmFieldType.INTEGER);
            this.photo75Index = addColumnDetails(table, "photo75", RealmFieldType.STRING);
            this.photo130Index = addColumnDetails(table, "photo130", RealmFieldType.STRING);
            this.photo604Index = addColumnDetails(table, "photo604", RealmFieldType.STRING);
            this.photo807Index = addColumnDetails(table, "photo807", RealmFieldType.STRING);
            this.photo1280Index = addColumnDetails(table, "photo1280", RealmFieldType.STRING);
            this.widthIndex = addColumnDetails(table, "width", RealmFieldType.INTEGER);
            this.heightIndex = addColumnDetails(table, "height", RealmFieldType.INTEGER);
            this.textIndex = addColumnDetails(table, "text", RealmFieldType.STRING);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.accessKeyIndex = addColumnDetails(table, "accessKey", RealmFieldType.STRING);
        }

        PhotoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PhotoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PhotoColumnInfo src = (PhotoColumnInfo) rawSrc;
            final PhotoColumnInfo dst = (PhotoColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.albumIdIndex = src.albumIdIndex;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.photo75Index = src.photo75Index;
            dst.photo130Index = src.photo130Index;
            dst.photo604Index = src.photo604Index;
            dst.photo807Index = src.photo807Index;
            dst.photo1280Index = src.photo1280Index;
            dst.widthIndex = src.widthIndex;
            dst.heightIndex = src.heightIndex;
            dst.textIndex = src.textIndex;
            dst.dateIndex = src.dateIndex;
            dst.accessKeyIndex = src.accessKeyIndex;
        }
    }

    private PhotoColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.Photo> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("albumId");
        fieldNames.add("ownerId");
        fieldNames.add("userId");
        fieldNames.add("photo75");
        fieldNames.add("photo130");
        fieldNames.add("photo604");
        fieldNames.add("photo807");
        fieldNames.add("photo1280");
        fieldNames.add("width");
        fieldNames.add("height");
        fieldNames.add("text");
        fieldNames.add("date");
        fieldNames.add("accessKey");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PhotoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PhotoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.Photo>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$albumId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.albumIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.albumIdIndex);
    }

    @Override
    public void realmSet$albumId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.albumIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.albumIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.albumIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.albumIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$ownerId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ownerIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.ownerIdIndex);
    }

    @Override
    public void realmSet$ownerId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ownerIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.ownerIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ownerIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.ownerIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.userIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo75() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo75Index);
    }

    @Override
    public void realmSet$photo75(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo75Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo75Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo75Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo75Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo130() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo130Index);
    }

    @Override
    public void realmSet$photo130(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo130Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo130Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo130Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo130Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo604() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo604Index);
    }

    @Override
    public void realmSet$photo604(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo604Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo604Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo604Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo604Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo807() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo807Index);
    }

    @Override
    public void realmSet$photo807(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo807Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo807Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo807Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo807Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo1280() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo1280Index);
    }

    @Override
    public void realmSet$photo1280(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo1280Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo1280Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo1280Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo1280Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$width() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.widthIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.widthIndex);
    }

    @Override
    public void realmSet$width(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.widthIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.widthIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.widthIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.widthIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$height() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.heightIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.heightIndex);
    }

    @Override
    public void realmSet$height(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.heightIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.heightIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.heightIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.heightIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$text() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textIndex);
    }

    @Override
    public void realmSet$text(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.textIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.textIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.textIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.textIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dateIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$accessKey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.accessKeyIndex);
    }

    @Override
    public void realmSet$accessKey(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.accessKeyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.accessKeyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.accessKeyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.accessKeyIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Photo");
        builder.addProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("albumId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("ownerId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("userId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo75", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo130", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo604", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo807", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo1280", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("width", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("height", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("accessKey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static PhotoColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Photo' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Photo");
        final long columnCount = table.getColumnCount();
        if (columnCount != 14) {
            if (columnCount < 14) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 14 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 14 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 14 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final PhotoColumnInfo columnInfo = new PhotoColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'id' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("albumId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'albumId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("albumId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'albumId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.albumIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'albumId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'albumId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("ownerId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'ownerId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("ownerId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'ownerId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.ownerIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'ownerId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'ownerId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("userId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'userId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("userId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'userId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.userIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'userId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'userId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo75")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo75' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo75") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo75' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo75Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo75' is required. Either set @Required to field 'photo75' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo130")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo130' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo130") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo130' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo130Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo130' is required. Either set @Required to field 'photo130' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo604")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo604' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo604") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo604' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo604Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo604' is required. Either set @Required to field 'photo604' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo807")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo807' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo807") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo807' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo807Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo807' is required. Either set @Required to field 'photo807' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo1280")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo1280' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo1280") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo1280' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo1280Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo1280' is required. Either set @Required to field 'photo1280' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("width")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'width' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("width") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'width' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.widthIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'width' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'width' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("height")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'height' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("height") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'height' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.heightIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'height' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'height' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("text")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'text' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("text") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'text' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.textIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'text' is required. Either set @Required to field 'text' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("date")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("date") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'date' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.dateIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'date' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'date' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("accessKey")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'accessKey' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("accessKey") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'accessKey' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.accessKeyIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'accessKey' is required. Either set @Required to field 'accessKey' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Photo";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.Photo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.attachment.Photo obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Photo.class, true, excludeFields);
        if (json.has("id")) {
            if (json.isNull("id")) {
                ((PhotoRealmProxyInterface) obj).realmSet$id(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("albumId")) {
            if (json.isNull("albumId")) {
                ((PhotoRealmProxyInterface) obj).realmSet$albumId(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$albumId((int) json.getInt("albumId"));
            }
        }
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                ((PhotoRealmProxyInterface) obj).realmSet$ownerId(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$ownerId((int) json.getInt("ownerId"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                ((PhotoRealmProxyInterface) obj).realmSet$userId(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$userId((int) json.getInt("userId"));
            }
        }
        if (json.has("photo75")) {
            if (json.isNull("photo75")) {
                ((PhotoRealmProxyInterface) obj).realmSet$photo75(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$photo75((String) json.getString("photo75"));
            }
        }
        if (json.has("photo130")) {
            if (json.isNull("photo130")) {
                ((PhotoRealmProxyInterface) obj).realmSet$photo130(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$photo130((String) json.getString("photo130"));
            }
        }
        if (json.has("photo604")) {
            if (json.isNull("photo604")) {
                ((PhotoRealmProxyInterface) obj).realmSet$photo604(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$photo604((String) json.getString("photo604"));
            }
        }
        if (json.has("photo807")) {
            if (json.isNull("photo807")) {
                ((PhotoRealmProxyInterface) obj).realmSet$photo807(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$photo807((String) json.getString("photo807"));
            }
        }
        if (json.has("photo1280")) {
            if (json.isNull("photo1280")) {
                ((PhotoRealmProxyInterface) obj).realmSet$photo1280(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$photo1280((String) json.getString("photo1280"));
            }
        }
        if (json.has("width")) {
            if (json.isNull("width")) {
                ((PhotoRealmProxyInterface) obj).realmSet$width(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$width((int) json.getInt("width"));
            }
        }
        if (json.has("height")) {
            if (json.isNull("height")) {
                ((PhotoRealmProxyInterface) obj).realmSet$height(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$height((int) json.getInt("height"));
            }
        }
        if (json.has("text")) {
            if (json.isNull("text")) {
                ((PhotoRealmProxyInterface) obj).realmSet$text(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$text((String) json.getString("text"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                ((PhotoRealmProxyInterface) obj).realmSet$date(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("accessKey")) {
            if (json.isNull("accessKey")) {
                ((PhotoRealmProxyInterface) obj).realmSet$accessKey(null);
            } else {
                ((PhotoRealmProxyInterface) obj).realmSet$accessKey((String) json.getString("accessKey"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.Photo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.Photo obj = new test.mingorto.crackersapp.model.attachment.Photo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("albumId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$albumId(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$albumId((int) reader.nextInt());
                }
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$ownerId(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$ownerId((int) reader.nextInt());
                }
            } else if (name.equals("userId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$userId(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$userId((int) reader.nextInt());
                }
            } else if (name.equals("photo75")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$photo75(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$photo75((String) reader.nextString());
                }
            } else if (name.equals("photo130")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$photo130(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$photo130((String) reader.nextString());
                }
            } else if (name.equals("photo604")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$photo604(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$photo604((String) reader.nextString());
                }
            } else if (name.equals("photo807")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$photo807(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$photo807((String) reader.nextString());
                }
            } else if (name.equals("photo1280")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$photo1280(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$photo1280((String) reader.nextString());
                }
            } else if (name.equals("width")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$width(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$width((int) reader.nextInt());
                }
            } else if (name.equals("height")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$height(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$height((int) reader.nextInt());
                }
            } else if (name.equals("text")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$text(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$text((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$date(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("accessKey")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoRealmProxyInterface) obj).realmSet$accessKey(null);
                } else {
                    ((PhotoRealmProxyInterface) obj).realmSet$accessKey((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.Photo copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Photo object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Photo) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.Photo copy(Realm realm, test.mingorto.crackersapp.model.attachment.Photo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Photo) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.Photo realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Photo.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        PhotoRealmProxyInterface realmObjectSource = (PhotoRealmProxyInterface) newObject;
        PhotoRealmProxyInterface realmObjectCopy = (PhotoRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$albumId(realmObjectSource.realmGet$albumId());
        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$photo75(realmObjectSource.realmGet$photo75());
        realmObjectCopy.realmSet$photo130(realmObjectSource.realmGet$photo130());
        realmObjectCopy.realmSet$photo604(realmObjectSource.realmGet$photo604());
        realmObjectCopy.realmSet$photo807(realmObjectSource.realmGet$photo807());
        realmObjectCopy.realmSet$photo1280(realmObjectSource.realmGet$photo1280());
        realmObjectCopy.realmSet$width(realmObjectSource.realmGet$width());
        realmObjectCopy.realmSet$height(realmObjectSource.realmGet$height());
        realmObjectCopy.realmSet$text(realmObjectSource.realmGet$text());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$accessKey(realmObjectSource.realmGet$accessKey());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.Photo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Photo.class);
        long tableNativePtr = table.getNativePtr();
        PhotoColumnInfo columnInfo = (PhotoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Photo.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((PhotoRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        }
        Number realmGet$albumId = ((PhotoRealmProxyInterface) object).realmGet$albumId();
        if (realmGet$albumId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.albumIdIndex, rowIndex, realmGet$albumId.longValue(), false);
        }
        Number realmGet$ownerId = ((PhotoRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
        }
        Number realmGet$userId = ((PhotoRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        }
        String realmGet$photo75 = ((PhotoRealmProxyInterface) object).realmGet$photo75();
        if (realmGet$photo75 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo75Index, rowIndex, realmGet$photo75, false);
        }
        String realmGet$photo130 = ((PhotoRealmProxyInterface) object).realmGet$photo130();
        if (realmGet$photo130 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
        }
        String realmGet$photo604 = ((PhotoRealmProxyInterface) object).realmGet$photo604();
        if (realmGet$photo604 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo604Index, rowIndex, realmGet$photo604, false);
        }
        String realmGet$photo807 = ((PhotoRealmProxyInterface) object).realmGet$photo807();
        if (realmGet$photo807 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo807Index, rowIndex, realmGet$photo807, false);
        }
        String realmGet$photo1280 = ((PhotoRealmProxyInterface) object).realmGet$photo1280();
        if (realmGet$photo1280 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo1280Index, rowIndex, realmGet$photo1280, false);
        }
        Number realmGet$width = ((PhotoRealmProxyInterface) object).realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, realmGet$width.longValue(), false);
        }
        Number realmGet$height = ((PhotoRealmProxyInterface) object).realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, realmGet$height.longValue(), false);
        }
        String realmGet$text = ((PhotoRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        }
        Number realmGet$date = ((PhotoRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
        }
        String realmGet$accessKey = ((PhotoRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Photo.class);
        long tableNativePtr = table.getNativePtr();
        PhotoColumnInfo columnInfo = (PhotoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Photo.class);
        test.mingorto.crackersapp.model.attachment.Photo object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Photo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((PhotoRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            }
            Number realmGet$albumId = ((PhotoRealmProxyInterface) object).realmGet$albumId();
            if (realmGet$albumId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.albumIdIndex, rowIndex, realmGet$albumId.longValue(), false);
            }
            Number realmGet$ownerId = ((PhotoRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
            }
            Number realmGet$userId = ((PhotoRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            }
            String realmGet$photo75 = ((PhotoRealmProxyInterface) object).realmGet$photo75();
            if (realmGet$photo75 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo75Index, rowIndex, realmGet$photo75, false);
            }
            String realmGet$photo130 = ((PhotoRealmProxyInterface) object).realmGet$photo130();
            if (realmGet$photo130 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
            }
            String realmGet$photo604 = ((PhotoRealmProxyInterface) object).realmGet$photo604();
            if (realmGet$photo604 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo604Index, rowIndex, realmGet$photo604, false);
            }
            String realmGet$photo807 = ((PhotoRealmProxyInterface) object).realmGet$photo807();
            if (realmGet$photo807 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo807Index, rowIndex, realmGet$photo807, false);
            }
            String realmGet$photo1280 = ((PhotoRealmProxyInterface) object).realmGet$photo1280();
            if (realmGet$photo1280 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo1280Index, rowIndex, realmGet$photo1280, false);
            }
            Number realmGet$width = ((PhotoRealmProxyInterface) object).realmGet$width();
            if (realmGet$width != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, realmGet$width.longValue(), false);
            }
            Number realmGet$height = ((PhotoRealmProxyInterface) object).realmGet$height();
            if (realmGet$height != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, realmGet$height.longValue(), false);
            }
            String realmGet$text = ((PhotoRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            }
            Number realmGet$date = ((PhotoRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
            }
            String realmGet$accessKey = ((PhotoRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Photo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Photo.class);
        long tableNativePtr = table.getNativePtr();
        PhotoColumnInfo columnInfo = (PhotoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Photo.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((PhotoRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        Number realmGet$albumId = ((PhotoRealmProxyInterface) object).realmGet$albumId();
        if (realmGet$albumId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.albumIdIndex, rowIndex, realmGet$albumId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.albumIdIndex, rowIndex, false);
        }
        Number realmGet$ownerId = ((PhotoRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
        }
        Number realmGet$userId = ((PhotoRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$photo75 = ((PhotoRealmProxyInterface) object).realmGet$photo75();
        if (realmGet$photo75 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo75Index, rowIndex, realmGet$photo75, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo75Index, rowIndex, false);
        }
        String realmGet$photo130 = ((PhotoRealmProxyInterface) object).realmGet$photo130();
        if (realmGet$photo130 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo130Index, rowIndex, false);
        }
        String realmGet$photo604 = ((PhotoRealmProxyInterface) object).realmGet$photo604();
        if (realmGet$photo604 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo604Index, rowIndex, realmGet$photo604, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo604Index, rowIndex, false);
        }
        String realmGet$photo807 = ((PhotoRealmProxyInterface) object).realmGet$photo807();
        if (realmGet$photo807 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo807Index, rowIndex, realmGet$photo807, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo807Index, rowIndex, false);
        }
        String realmGet$photo1280 = ((PhotoRealmProxyInterface) object).realmGet$photo1280();
        if (realmGet$photo1280 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo1280Index, rowIndex, realmGet$photo1280, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo1280Index, rowIndex, false);
        }
        Number realmGet$width = ((PhotoRealmProxyInterface) object).realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, realmGet$width.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.widthIndex, rowIndex, false);
        }
        Number realmGet$height = ((PhotoRealmProxyInterface) object).realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, realmGet$height.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.heightIndex, rowIndex, false);
        }
        String realmGet$text = ((PhotoRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
        }
        Number realmGet$date = ((PhotoRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        String realmGet$accessKey = ((PhotoRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Photo.class);
        long tableNativePtr = table.getNativePtr();
        PhotoColumnInfo columnInfo = (PhotoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Photo.class);
        test.mingorto.crackersapp.model.attachment.Photo object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Photo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((PhotoRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            Number realmGet$albumId = ((PhotoRealmProxyInterface) object).realmGet$albumId();
            if (realmGet$albumId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.albumIdIndex, rowIndex, realmGet$albumId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.albumIdIndex, rowIndex, false);
            }
            Number realmGet$ownerId = ((PhotoRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
            }
            Number realmGet$userId = ((PhotoRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$photo75 = ((PhotoRealmProxyInterface) object).realmGet$photo75();
            if (realmGet$photo75 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo75Index, rowIndex, realmGet$photo75, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo75Index, rowIndex, false);
            }
            String realmGet$photo130 = ((PhotoRealmProxyInterface) object).realmGet$photo130();
            if (realmGet$photo130 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo130Index, rowIndex, false);
            }
            String realmGet$photo604 = ((PhotoRealmProxyInterface) object).realmGet$photo604();
            if (realmGet$photo604 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo604Index, rowIndex, realmGet$photo604, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo604Index, rowIndex, false);
            }
            String realmGet$photo807 = ((PhotoRealmProxyInterface) object).realmGet$photo807();
            if (realmGet$photo807 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo807Index, rowIndex, realmGet$photo807, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo807Index, rowIndex, false);
            }
            String realmGet$photo1280 = ((PhotoRealmProxyInterface) object).realmGet$photo1280();
            if (realmGet$photo1280 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo1280Index, rowIndex, realmGet$photo1280, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo1280Index, rowIndex, false);
            }
            Number realmGet$width = ((PhotoRealmProxyInterface) object).realmGet$width();
            if (realmGet$width != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, realmGet$width.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.widthIndex, rowIndex, false);
            }
            Number realmGet$height = ((PhotoRealmProxyInterface) object).realmGet$height();
            if (realmGet$height != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, realmGet$height.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.heightIndex, rowIndex, false);
            }
            String realmGet$text = ((PhotoRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
            }
            Number realmGet$date = ((PhotoRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
            String realmGet$accessKey = ((PhotoRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.Photo createDetachedCopy(test.mingorto.crackersapp.model.attachment.Photo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.Photo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.Photo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.Photo) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.Photo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        PhotoRealmProxyInterface unmanagedCopy = (PhotoRealmProxyInterface) unmanagedObject;
        PhotoRealmProxyInterface realmSource = (PhotoRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$albumId(realmSource.realmGet$albumId());
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$photo75(realmSource.realmGet$photo75());
        unmanagedCopy.realmSet$photo130(realmSource.realmGet$photo130());
        unmanagedCopy.realmSet$photo604(realmSource.realmGet$photo604());
        unmanagedCopy.realmSet$photo807(realmSource.realmGet$photo807());
        unmanagedCopy.realmSet$photo1280(realmSource.realmGet$photo1280());
        unmanagedCopy.realmSet$width(realmSource.realmGet$width());
        unmanagedCopy.realmSet$height(realmSource.realmGet$height());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$accessKey(realmSource.realmGet$accessKey());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Photo = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{albumId:");
        stringBuilder.append(realmGet$albumId() != null ? realmGet$albumId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ownerId:");
        stringBuilder.append(realmGet$ownerId() != null ? realmGet$ownerId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo75:");
        stringBuilder.append(realmGet$photo75() != null ? realmGet$photo75() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo130:");
        stringBuilder.append(realmGet$photo130() != null ? realmGet$photo130() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo604:");
        stringBuilder.append(realmGet$photo604() != null ? realmGet$photo604() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo807:");
        stringBuilder.append(realmGet$photo807() != null ? realmGet$photo807() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo1280:");
        stringBuilder.append(realmGet$photo1280() != null ? realmGet$photo1280() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{width:");
        stringBuilder.append(realmGet$width() != null ? realmGet$width() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{height:");
        stringBuilder.append(realmGet$height() != null ? realmGet$height() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text() != null ? realmGet$text() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{accessKey:");
        stringBuilder.append(realmGet$accessKey() != null ? realmGet$accessKey() : "null");
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
        PhotoRealmProxy aPhoto = (PhotoRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPhoto.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPhoto.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPhoto.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
