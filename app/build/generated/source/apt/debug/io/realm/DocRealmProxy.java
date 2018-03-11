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
public class DocRealmProxy extends test.mingorto.crackersapp.model.attachment.doc.Doc
    implements RealmObjectProxy, DocRealmProxyInterface {

    static final class DocColumnInfo extends ColumnInfo {
        long idIndex;
        long ownerIdIndex;
        long titleIndex;
        long sizeIndex;
        long extIndex;
        long urlIndex;
        long dateIndex;
        long mtypeIndex;
        long accessKeyIndex;
        long previewIndex;

        DocColumnInfo(SharedRealm realm, Table table) {
            super(10);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.INTEGER);
            this.titleIndex = addColumnDetails(table, "title", RealmFieldType.STRING);
            this.sizeIndex = addColumnDetails(table, "size", RealmFieldType.INTEGER);
            this.extIndex = addColumnDetails(table, "ext", RealmFieldType.STRING);
            this.urlIndex = addColumnDetails(table, "url", RealmFieldType.STRING);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.mtypeIndex = addColumnDetails(table, "mtype", RealmFieldType.INTEGER);
            this.accessKeyIndex = addColumnDetails(table, "accessKey", RealmFieldType.STRING);
            this.previewIndex = addColumnDetails(table, "preview", RealmFieldType.OBJECT);
        }

        DocColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DocColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DocColumnInfo src = (DocColumnInfo) rawSrc;
            final DocColumnInfo dst = (DocColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.titleIndex = src.titleIndex;
            dst.sizeIndex = src.sizeIndex;
            dst.extIndex = src.extIndex;
            dst.urlIndex = src.urlIndex;
            dst.dateIndex = src.dateIndex;
            dst.mtypeIndex = src.mtypeIndex;
            dst.accessKeyIndex = src.accessKeyIndex;
            dst.previewIndex = src.previewIndex;
        }
    }

    private DocColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.doc.Doc> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("ownerId");
        fieldNames.add("title");
        fieldNames.add("size");
        fieldNames.add("ext");
        fieldNames.add("url");
        fieldNames.add("date");
        fieldNames.add("mtype");
        fieldNames.add("accessKey");
        fieldNames.add("preview");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    DocRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DocColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.doc.Doc>(this);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$ownerId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.ownerIdIndex);
    }

    @Override
    public void realmSet$ownerId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.ownerIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.ownerIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.titleIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.titleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.titleIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$size() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sizeIndex);
    }

    @Override
    public void realmSet$size(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sizeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sizeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ext() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.extIndex);
    }

    @Override
    public void realmSet$ext(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.extIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.extIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.extIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.extIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$mtype() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.mtypeIndex);
    }

    @Override
    public void realmSet$mtype(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.mtypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.mtypeIndex, value);
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

    @Override
    public test.mingorto.crackersapp.model.attachment.doc.Preview realmGet$preview() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.previewIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.doc.Preview.class, proxyState.getRow$realm().getLink(columnInfo.previewIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$preview(test.mingorto.crackersapp.model.attachment.doc.Preview value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("preview")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.previewIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.previewIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.previewIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.previewIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Doc");
        builder.addProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("ownerId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("size", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("ext", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("mtype", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("accessKey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("preview", RealmFieldType.OBJECT, "Preview");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static DocColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Doc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Doc' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Doc");
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

        final DocColumnInfo columnInfo = new DocColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
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
        if (!columnTypes.containsKey("ownerId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'ownerId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("ownerId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'ownerId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.ownerIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'ownerId' does support null values in the existing Realm file. Use corresponding boxed type for field 'ownerId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("title")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'title' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("title") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'title' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.titleIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'title' is required. Either set @Required to field 'title' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("size")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'size' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("size") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'size' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.sizeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'size' does support null values in the existing Realm file. Use corresponding boxed type for field 'size' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("ext")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'ext' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("ext") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'ext' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.extIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'ext' is required. Either set @Required to field 'ext' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("url")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'url' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("url") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'url' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.urlIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'url' is required. Either set @Required to field 'url' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("date")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("date") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'date' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.dateIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'date' does support null values in the existing Realm file. Use corresponding boxed type for field 'date' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("mtype")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'mtype' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("mtype") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'mtype' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.mtypeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'mtype' does support null values in the existing Realm file. Use corresponding boxed type for field 'mtype' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("preview")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'preview' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("preview") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Preview' for field 'preview'");
        }
        if (!sharedRealm.hasTable("class_Preview")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Preview' for field 'preview'");
        }
        Table table_9 = sharedRealm.getTable("class_Preview");
        if (!table.getLinkTarget(columnInfo.previewIndex).hasSameSchema(table_9)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'preview': '" + table.getLinkTarget(columnInfo.previewIndex).getName() + "' expected - was '" + table_9.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Doc";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.doc.Doc createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("preview")) {
            excludeFields.add("preview");
        }
        test.mingorto.crackersapp.model.attachment.doc.Doc obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Doc.class, true, excludeFields);
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((DocRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
            } else {
                ((DocRealmProxyInterface) obj).realmSet$ownerId((int) json.getInt("ownerId"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((DocRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((DocRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("size")) {
            if (json.isNull("size")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'size' to null.");
            } else {
                ((DocRealmProxyInterface) obj).realmSet$size((int) json.getInt("size"));
            }
        }
        if (json.has("ext")) {
            if (json.isNull("ext")) {
                ((DocRealmProxyInterface) obj).realmSet$ext(null);
            } else {
                ((DocRealmProxyInterface) obj).realmSet$ext((String) json.getString("ext"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((DocRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((DocRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                ((DocRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("mtype")) {
            if (json.isNull("mtype")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mtype' to null.");
            } else {
                ((DocRealmProxyInterface) obj).realmSet$mtype((int) json.getInt("mtype"));
            }
        }
        if (json.has("accessKey")) {
            if (json.isNull("accessKey")) {
                ((DocRealmProxyInterface) obj).realmSet$accessKey(null);
            } else {
                ((DocRealmProxyInterface) obj).realmSet$accessKey((String) json.getString("accessKey"));
            }
        }
        if (json.has("preview")) {
            if (json.isNull("preview")) {
                ((DocRealmProxyInterface) obj).realmSet$preview(null);
            } else {
                test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = PreviewRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("preview"), update);
                ((DocRealmProxyInterface) obj).realmSet$preview(previewObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.doc.Doc createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.doc.Doc obj = new test.mingorto.crackersapp.model.attachment.doc.Doc();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$ownerId((int) reader.nextInt());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DocRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("size")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'size' to null.");
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$size((int) reader.nextInt());
                }
            } else if (name.equals("ext")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DocRealmProxyInterface) obj).realmSet$ext(null);
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$ext((String) reader.nextString());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DocRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("mtype")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'mtype' to null.");
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$mtype((int) reader.nextInt());
                }
            } else if (name.equals("accessKey")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DocRealmProxyInterface) obj).realmSet$accessKey(null);
                } else {
                    ((DocRealmProxyInterface) obj).realmSet$accessKey((String) reader.nextString());
                }
            } else if (name.equals("preview")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DocRealmProxyInterface) obj).realmSet$preview(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = PreviewRealmProxy.createUsingJsonStream(realm, reader);
                    ((DocRealmProxyInterface) obj).realmSet$preview(previewObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Doc copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Doc object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Doc) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Doc copy(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Doc newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Doc) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.doc.Doc realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Doc.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        DocRealmProxyInterface realmObjectSource = (DocRealmProxyInterface) newObject;
        DocRealmProxyInterface realmObjectCopy = (DocRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$size(realmObjectSource.realmGet$size());
        realmObjectCopy.realmSet$ext(realmObjectSource.realmGet$ext());
        realmObjectCopy.realmSet$url(realmObjectSource.realmGet$url());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$mtype(realmObjectSource.realmGet$mtype());
        realmObjectCopy.realmSet$accessKey(realmObjectSource.realmGet$accessKey());

        test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = realmObjectSource.realmGet$preview();
        if (previewObj == null) {
            realmObjectCopy.realmSet$preview(null);
        } else {
            test.mingorto.crackersapp.model.attachment.doc.Preview cachepreview = (test.mingorto.crackersapp.model.attachment.doc.Preview) cache.get(previewObj);
            if (cachepreview != null) {
                realmObjectCopy.realmSet$preview(cachepreview);
            } else {
                realmObjectCopy.realmSet$preview(PreviewRealmProxy.copyOrUpdate(realm, previewObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Doc object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long tableNativePtr = table.getNativePtr();
        DocColumnInfo columnInfo = (DocColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$title = ((DocRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sizeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$size(), false);
        String realmGet$ext = ((DocRealmProxyInterface) object).realmGet$ext();
        if (realmGet$ext != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.extIndex, rowIndex, realmGet$ext, false);
        }
        String realmGet$url = ((DocRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mtypeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$mtype(), false);
        String realmGet$accessKey = ((DocRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        }

        test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = ((DocRealmProxyInterface) object).realmGet$preview();
        if (previewObj != null) {
            Long cachepreview = cache.get(previewObj);
            if (cachepreview == null) {
                cachepreview = PreviewRealmProxy.insert(realm, previewObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.previewIndex, rowIndex, cachepreview, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long tableNativePtr = table.getNativePtr();
        DocColumnInfo columnInfo = (DocColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        test.mingorto.crackersapp.model.attachment.doc.Doc object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Doc) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$title = ((DocRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sizeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$size(), false);
            String realmGet$ext = ((DocRealmProxyInterface) object).realmGet$ext();
            if (realmGet$ext != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.extIndex, rowIndex, realmGet$ext, false);
            }
            String realmGet$url = ((DocRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mtypeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$mtype(), false);
            String realmGet$accessKey = ((DocRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            }

            test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = ((DocRealmProxyInterface) object).realmGet$preview();
            if (previewObj != null) {
                Long cachepreview = cache.get(previewObj);
                if (cachepreview == null) {
                    cachepreview = PreviewRealmProxy.insert(realm, previewObj, cache);
                }
                table.setLink(columnInfo.previewIndex, rowIndex, cachepreview, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Doc object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long tableNativePtr = table.getNativePtr();
        DocColumnInfo columnInfo = (DocColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$title = ((DocRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sizeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$size(), false);
        String realmGet$ext = ((DocRealmProxyInterface) object).realmGet$ext();
        if (realmGet$ext != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.extIndex, rowIndex, realmGet$ext, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.extIndex, rowIndex, false);
        }
        String realmGet$url = ((DocRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.mtypeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$mtype(), false);
        String realmGet$accessKey = ((DocRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
        }

        test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = ((DocRealmProxyInterface) object).realmGet$preview();
        if (previewObj != null) {
            Long cachepreview = cache.get(previewObj);
            if (cachepreview == null) {
                cachepreview = PreviewRealmProxy.insertOrUpdate(realm, previewObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.previewIndex, rowIndex, cachepreview, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.previewIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        long tableNativePtr = table.getNativePtr();
        DocColumnInfo columnInfo = (DocColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        test.mingorto.crackersapp.model.attachment.doc.Doc object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Doc) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$title = ((DocRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sizeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$size(), false);
            String realmGet$ext = ((DocRealmProxyInterface) object).realmGet$ext();
            if (realmGet$ext != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.extIndex, rowIndex, realmGet$ext, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.extIndex, rowIndex, false);
            }
            String realmGet$url = ((DocRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.mtypeIndex, rowIndex, ((DocRealmProxyInterface) object).realmGet$mtype(), false);
            String realmGet$accessKey = ((DocRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
            }

            test.mingorto.crackersapp.model.attachment.doc.Preview previewObj = ((DocRealmProxyInterface) object).realmGet$preview();
            if (previewObj != null) {
                Long cachepreview = cache.get(previewObj);
                if (cachepreview == null) {
                    cachepreview = PreviewRealmProxy.insertOrUpdate(realm, previewObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.previewIndex, rowIndex, cachepreview, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.previewIndex, rowIndex);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Doc createDetachedCopy(test.mingorto.crackersapp.model.attachment.doc.Doc realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.doc.Doc unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.doc.Doc();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.doc.Doc) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.doc.Doc) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        DocRealmProxyInterface unmanagedCopy = (DocRealmProxyInterface) unmanagedObject;
        DocRealmProxyInterface realmSource = (DocRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$size(realmSource.realmGet$size());
        unmanagedCopy.realmSet$ext(realmSource.realmGet$ext());
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$mtype(realmSource.realmGet$mtype());
        unmanagedCopy.realmSet$accessKey(realmSource.realmGet$accessKey());

        // Deep copy of preview
        unmanagedCopy.realmSet$preview(PreviewRealmProxy.createDetachedCopy(realmSource.realmGet$preview(), currentDepth + 1, maxDepth, cache));
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Doc = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ownerId:");
        stringBuilder.append(realmGet$ownerId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{size:");
        stringBuilder.append(realmGet$size());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ext:");
        stringBuilder.append(realmGet$ext() != null ? realmGet$ext() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mtype:");
        stringBuilder.append(realmGet$mtype());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{accessKey:");
        stringBuilder.append(realmGet$accessKey() != null ? realmGet$accessKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{preview:");
        stringBuilder.append(realmGet$preview() != null ? "Preview" : "null");
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
        DocRealmProxy aDoc = (DocRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aDoc.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDoc.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aDoc.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
