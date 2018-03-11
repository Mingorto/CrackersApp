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
public class VideoRealmProxy extends test.mingorto.crackersapp.model.attachment.video.Video
    implements RealmObjectProxy, VideoRealmProxyInterface {

    static final class VideoColumnInfo extends ColumnInfo {
        long idIndex;
        long ownerIdIndex;
        long titleIndex;
        long durationIndex;
        long descriptionIndex;
        long dateIndex;
        long viewsIndex;
        long commentsIndex;
        long photo130Index;
        long photo320Index;
        long photo800Index;
        long playerIndex;
        long accessKeyIndex;
        long canAddIndex;
        long filesIndex;

        VideoColumnInfo(SharedRealm realm, Table table) {
            super(15);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.INTEGER);
            this.titleIndex = addColumnDetails(table, "title", RealmFieldType.STRING);
            this.durationIndex = addColumnDetails(table, "duration", RealmFieldType.INTEGER);
            this.descriptionIndex = addColumnDetails(table, "description", RealmFieldType.STRING);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.viewsIndex = addColumnDetails(table, "views", RealmFieldType.INTEGER);
            this.commentsIndex = addColumnDetails(table, "comments", RealmFieldType.INTEGER);
            this.photo130Index = addColumnDetails(table, "photo130", RealmFieldType.STRING);
            this.photo320Index = addColumnDetails(table, "photo320", RealmFieldType.STRING);
            this.photo800Index = addColumnDetails(table, "photo800", RealmFieldType.STRING);
            this.playerIndex = addColumnDetails(table, "player", RealmFieldType.STRING);
            this.accessKeyIndex = addColumnDetails(table, "accessKey", RealmFieldType.STRING);
            this.canAddIndex = addColumnDetails(table, "canAdd", RealmFieldType.INTEGER);
            this.filesIndex = addColumnDetails(table, "files", RealmFieldType.OBJECT);
        }

        VideoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new VideoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final VideoColumnInfo src = (VideoColumnInfo) rawSrc;
            final VideoColumnInfo dst = (VideoColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.titleIndex = src.titleIndex;
            dst.durationIndex = src.durationIndex;
            dst.descriptionIndex = src.descriptionIndex;
            dst.dateIndex = src.dateIndex;
            dst.viewsIndex = src.viewsIndex;
            dst.commentsIndex = src.commentsIndex;
            dst.photo130Index = src.photo130Index;
            dst.photo320Index = src.photo320Index;
            dst.photo800Index = src.photo800Index;
            dst.playerIndex = src.playerIndex;
            dst.accessKeyIndex = src.accessKeyIndex;
            dst.canAddIndex = src.canAddIndex;
            dst.filesIndex = src.filesIndex;
        }
    }

    private VideoColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.video.Video> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("ownerId");
        fieldNames.add("title");
        fieldNames.add("duration");
        fieldNames.add("description");
        fieldNames.add("date");
        fieldNames.add("views");
        fieldNames.add("comments");
        fieldNames.add("photo130");
        fieldNames.add("photo320");
        fieldNames.add("photo800");
        fieldNames.add("player");
        fieldNames.add("accessKey");
        fieldNames.add("canAdd");
        fieldNames.add("files");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    VideoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (VideoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.video.Video>(this);
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
    public int realmGet$duration() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.durationIndex);
    }

    @Override
    public void realmSet$duration(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.durationIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.durationIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionIndex);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionIndex, value);
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
    public int realmGet$views() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.viewsIndex);
    }

    @Override
    public void realmSet$views(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.viewsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.viewsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$comments() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.commentsIndex);
    }

    @Override
    public void realmSet$comments(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.commentsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.commentsIndex, value);
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
    public String realmGet$photo320() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo320Index);
    }

    @Override
    public void realmSet$photo320(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo320Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo320Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo320Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo320Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo800() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo800Index);
    }

    @Override
    public void realmSet$photo800(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo800Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo800Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo800Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo800Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$player() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.playerIndex);
    }

    @Override
    public void realmSet$player(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.playerIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.playerIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.playerIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.playerIndex, value);
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
    @SuppressWarnings("cast")
    public int realmGet$canAdd() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.canAddIndex);
    }

    @Override
    public void realmSet$canAdd(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.canAddIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.canAddIndex, value);
    }

    @Override
    public test.mingorto.crackersapp.model.attachment.video.File realmGet$files() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.filesIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.video.File.class, proxyState.getRow$realm().getLink(columnInfo.filesIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$files(test.mingorto.crackersapp.model.attachment.video.File value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("files")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.filesIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.filesIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.filesIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.filesIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Video");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("ownerId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("duration", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("views", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("comments", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("photo130", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo320", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo800", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("player", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("accessKey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("canAdd", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addLinkedProperty("files", RealmFieldType.OBJECT, "File");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static VideoColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Video")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Video' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Video");
        final long columnCount = table.getColumnCount();
        if (columnCount != 15) {
            if (columnCount < 15) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 15 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 15 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 15 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final VideoColumnInfo columnInfo = new VideoColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("duration")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'duration' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("duration") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'duration' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.durationIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'duration' does support null values in the existing Realm file. Use corresponding boxed type for field 'duration' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("description")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'description' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("description") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'description' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.descriptionIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'description' is required. Either set @Required to field 'description' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("views")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'views' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("views") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'views' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.viewsIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'views' does support null values in the existing Realm file. Use corresponding boxed type for field 'views' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("comments")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'comments' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("comments") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'comments' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.commentsIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'comments' does support null values in the existing Realm file. Use corresponding boxed type for field 'comments' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("photo320")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo320' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo320") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo320' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo320Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo320' is required. Either set @Required to field 'photo320' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo800")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo800' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo800") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo800' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo800Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo800' is required. Either set @Required to field 'photo800' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("player")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'player' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("player") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'player' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.playerIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'player' is required. Either set @Required to field 'player' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("canAdd")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'canAdd' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("canAdd") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'canAdd' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.canAddIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'canAdd' does support null values in the existing Realm file. Use corresponding boxed type for field 'canAdd' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("files")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'files' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("files") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'File' for field 'files'");
        }
        if (!sharedRealm.hasTable("class_File")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_File' for field 'files'");
        }
        Table table_14 = sharedRealm.getTable("class_File");
        if (!table.getLinkTarget(columnInfo.filesIndex).hasSameSchema(table_14)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'files': '" + table.getLinkTarget(columnInfo.filesIndex).getName() + "' expected - was '" + table_14.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Video";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.video.Video createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        test.mingorto.crackersapp.model.attachment.video.Video obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class), false, Collections.<String> emptyList());
                    obj = new io.realm.VideoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("files")) {
                excludeFields.add("files");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.VideoRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.video.Video.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.VideoRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.video.Video.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$ownerId((int) json.getInt("ownerId"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((VideoRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$duration((int) json.getInt("duration"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                ((VideoRealmProxyInterface) obj).realmSet$description(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("views")) {
            if (json.isNull("views")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'views' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$views((int) json.getInt("views"));
            }
        }
        if (json.has("comments")) {
            if (json.isNull("comments")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'comments' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$comments((int) json.getInt("comments"));
            }
        }
        if (json.has("photo130")) {
            if (json.isNull("photo130")) {
                ((VideoRealmProxyInterface) obj).realmSet$photo130(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$photo130((String) json.getString("photo130"));
            }
        }
        if (json.has("photo320")) {
            if (json.isNull("photo320")) {
                ((VideoRealmProxyInterface) obj).realmSet$photo320(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$photo320((String) json.getString("photo320"));
            }
        }
        if (json.has("photo800")) {
            if (json.isNull("photo800")) {
                ((VideoRealmProxyInterface) obj).realmSet$photo800(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$photo800((String) json.getString("photo800"));
            }
        }
        if (json.has("player")) {
            if (json.isNull("player")) {
                ((VideoRealmProxyInterface) obj).realmSet$player(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$player((String) json.getString("player"));
            }
        }
        if (json.has("accessKey")) {
            if (json.isNull("accessKey")) {
                ((VideoRealmProxyInterface) obj).realmSet$accessKey(null);
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$accessKey((String) json.getString("accessKey"));
            }
        }
        if (json.has("canAdd")) {
            if (json.isNull("canAdd")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'canAdd' to null.");
            } else {
                ((VideoRealmProxyInterface) obj).realmSet$canAdd((int) json.getInt("canAdd"));
            }
        }
        if (json.has("files")) {
            if (json.isNull("files")) {
                ((VideoRealmProxyInterface) obj).realmSet$files(null);
            } else {
                test.mingorto.crackersapp.model.attachment.video.File filesObj = FileRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("files"), update);
                ((VideoRealmProxyInterface) obj).realmSet$files(filesObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.video.Video createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.attachment.video.Video obj = new test.mingorto.crackersapp.model.attachment.video.Video();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$ownerId((int) reader.nextInt());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("duration")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$duration((int) reader.nextInt());
                }
            } else if (name.equals("description")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$description(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$description((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("views")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'views' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$views((int) reader.nextInt());
                }
            } else if (name.equals("comments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'comments' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$comments((int) reader.nextInt());
                }
            } else if (name.equals("photo130")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$photo130(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$photo130((String) reader.nextString());
                }
            } else if (name.equals("photo320")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$photo320(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$photo320((String) reader.nextString());
                }
            } else if (name.equals("photo800")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$photo800(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$photo800((String) reader.nextString());
                }
            } else if (name.equals("player")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$player(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$player((String) reader.nextString());
                }
            } else if (name.equals("accessKey")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$accessKey(null);
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$accessKey((String) reader.nextString());
                }
            } else if (name.equals("canAdd")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'canAdd' to null.");
                } else {
                    ((VideoRealmProxyInterface) obj).realmSet$canAdd((int) reader.nextInt());
                }
            } else if (name.equals("files")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((VideoRealmProxyInterface) obj).realmSet$files(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.video.File filesObj = FileRealmProxy.createUsingJsonStream(realm, reader);
                    ((VideoRealmProxyInterface) obj).realmSet$files(filesObj);
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

    public static test.mingorto.crackersapp.model.attachment.video.Video copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.video.Video object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.video.Video) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.attachment.video.Video realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((VideoRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.VideoRealmProxy();
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

    public static test.mingorto.crackersapp.model.attachment.video.Video copy(Realm realm, test.mingorto.crackersapp.model.attachment.video.Video newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.video.Video) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.video.Video realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.video.Video.class, ((VideoRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        VideoRealmProxyInterface realmObjectSource = (VideoRealmProxyInterface) newObject;
        VideoRealmProxyInterface realmObjectCopy = (VideoRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$duration(realmObjectSource.realmGet$duration());
        realmObjectCopy.realmSet$description(realmObjectSource.realmGet$description());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$views(realmObjectSource.realmGet$views());
        realmObjectCopy.realmSet$comments(realmObjectSource.realmGet$comments());
        realmObjectCopy.realmSet$photo130(realmObjectSource.realmGet$photo130());
        realmObjectCopy.realmSet$photo320(realmObjectSource.realmGet$photo320());
        realmObjectCopy.realmSet$photo800(realmObjectSource.realmGet$photo800());
        realmObjectCopy.realmSet$player(realmObjectSource.realmGet$player());
        realmObjectCopy.realmSet$accessKey(realmObjectSource.realmGet$accessKey());
        realmObjectCopy.realmSet$canAdd(realmObjectSource.realmGet$canAdd());

        test.mingorto.crackersapp.model.attachment.video.File filesObj = realmObjectSource.realmGet$files();
        if (filesObj == null) {
            realmObjectCopy.realmSet$files(null);
        } else {
            test.mingorto.crackersapp.model.attachment.video.File cachefiles = (test.mingorto.crackersapp.model.attachment.video.File) cache.get(filesObj);
            if (cachefiles != null) {
                realmObjectCopy.realmSet$files(cachefiles);
            } else {
                realmObjectCopy.realmSet$files(FileRealmProxy.copyOrUpdate(realm, filesObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.video.Video object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long tableNativePtr = table.getNativePtr();
        VideoColumnInfo columnInfo = (VideoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((VideoRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((VideoRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((VideoRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$title = ((VideoRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$duration(), false);
        String realmGet$description = ((VideoRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.viewsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$views(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$comments(), false);
        String realmGet$photo130 = ((VideoRealmProxyInterface) object).realmGet$photo130();
        if (realmGet$photo130 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
        }
        String realmGet$photo320 = ((VideoRealmProxyInterface) object).realmGet$photo320();
        if (realmGet$photo320 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo320Index, rowIndex, realmGet$photo320, false);
        }
        String realmGet$photo800 = ((VideoRealmProxyInterface) object).realmGet$photo800();
        if (realmGet$photo800 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo800Index, rowIndex, realmGet$photo800, false);
        }
        String realmGet$player = ((VideoRealmProxyInterface) object).realmGet$player();
        if (realmGet$player != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playerIndex, rowIndex, realmGet$player, false);
        }
        String realmGet$accessKey = ((VideoRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.canAddIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$canAdd(), false);

        test.mingorto.crackersapp.model.attachment.video.File filesObj = ((VideoRealmProxyInterface) object).realmGet$files();
        if (filesObj != null) {
            Long cachefiles = cache.get(filesObj);
            if (cachefiles == null) {
                cachefiles = FileRealmProxy.insert(realm, filesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.filesIndex, rowIndex, cachefiles, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long tableNativePtr = table.getNativePtr();
        VideoColumnInfo columnInfo = (VideoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.attachment.video.Video object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.video.Video) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((VideoRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((VideoRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((VideoRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$title = ((VideoRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$duration(), false);
            String realmGet$description = ((VideoRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.viewsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$views(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$comments(), false);
            String realmGet$photo130 = ((VideoRealmProxyInterface) object).realmGet$photo130();
            if (realmGet$photo130 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
            }
            String realmGet$photo320 = ((VideoRealmProxyInterface) object).realmGet$photo320();
            if (realmGet$photo320 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo320Index, rowIndex, realmGet$photo320, false);
            }
            String realmGet$photo800 = ((VideoRealmProxyInterface) object).realmGet$photo800();
            if (realmGet$photo800 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo800Index, rowIndex, realmGet$photo800, false);
            }
            String realmGet$player = ((VideoRealmProxyInterface) object).realmGet$player();
            if (realmGet$player != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playerIndex, rowIndex, realmGet$player, false);
            }
            String realmGet$accessKey = ((VideoRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.canAddIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$canAdd(), false);

            test.mingorto.crackersapp.model.attachment.video.File filesObj = ((VideoRealmProxyInterface) object).realmGet$files();
            if (filesObj != null) {
                Long cachefiles = cache.get(filesObj);
                if (cachefiles == null) {
                    cachefiles = FileRealmProxy.insert(realm, filesObj, cache);
                }
                table.setLink(columnInfo.filesIndex, rowIndex, cachefiles, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.video.Video object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long tableNativePtr = table.getNativePtr();
        VideoColumnInfo columnInfo = (VideoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((VideoRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((VideoRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((VideoRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$title = ((VideoRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$duration(), false);
        String realmGet$description = ((VideoRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.viewsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$views(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$comments(), false);
        String realmGet$photo130 = ((VideoRealmProxyInterface) object).realmGet$photo130();
        if (realmGet$photo130 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo130Index, rowIndex, false);
        }
        String realmGet$photo320 = ((VideoRealmProxyInterface) object).realmGet$photo320();
        if (realmGet$photo320 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo320Index, rowIndex, realmGet$photo320, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo320Index, rowIndex, false);
        }
        String realmGet$photo800 = ((VideoRealmProxyInterface) object).realmGet$photo800();
        if (realmGet$photo800 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo800Index, rowIndex, realmGet$photo800, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo800Index, rowIndex, false);
        }
        String realmGet$player = ((VideoRealmProxyInterface) object).realmGet$player();
        if (realmGet$player != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.playerIndex, rowIndex, realmGet$player, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.playerIndex, rowIndex, false);
        }
        String realmGet$accessKey = ((VideoRealmProxyInterface) object).realmGet$accessKey();
        if (realmGet$accessKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.canAddIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$canAdd(), false);

        test.mingorto.crackersapp.model.attachment.video.File filesObj = ((VideoRealmProxyInterface) object).realmGet$files();
        if (filesObj != null) {
            Long cachefiles = cache.get(filesObj);
            if (cachefiles == null) {
                cachefiles = FileRealmProxy.insertOrUpdate(realm, filesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.filesIndex, rowIndex, cachefiles, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.filesIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long tableNativePtr = table.getNativePtr();
        VideoColumnInfo columnInfo = (VideoColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.video.Video.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.attachment.video.Video object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.video.Video) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((VideoRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((VideoRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((VideoRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$title = ((VideoRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$duration(), false);
            String realmGet$description = ((VideoRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.viewsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$views(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$comments(), false);
            String realmGet$photo130 = ((VideoRealmProxyInterface) object).realmGet$photo130();
            if (realmGet$photo130 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo130Index, rowIndex, realmGet$photo130, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo130Index, rowIndex, false);
            }
            String realmGet$photo320 = ((VideoRealmProxyInterface) object).realmGet$photo320();
            if (realmGet$photo320 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo320Index, rowIndex, realmGet$photo320, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo320Index, rowIndex, false);
            }
            String realmGet$photo800 = ((VideoRealmProxyInterface) object).realmGet$photo800();
            if (realmGet$photo800 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo800Index, rowIndex, realmGet$photo800, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo800Index, rowIndex, false);
            }
            String realmGet$player = ((VideoRealmProxyInterface) object).realmGet$player();
            if (realmGet$player != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.playerIndex, rowIndex, realmGet$player, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.playerIndex, rowIndex, false);
            }
            String realmGet$accessKey = ((VideoRealmProxyInterface) object).realmGet$accessKey();
            if (realmGet$accessKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, realmGet$accessKey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.accessKeyIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.canAddIndex, rowIndex, ((VideoRealmProxyInterface) object).realmGet$canAdd(), false);

            test.mingorto.crackersapp.model.attachment.video.File filesObj = ((VideoRealmProxyInterface) object).realmGet$files();
            if (filesObj != null) {
                Long cachefiles = cache.get(filesObj);
                if (cachefiles == null) {
                    cachefiles = FileRealmProxy.insertOrUpdate(realm, filesObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.filesIndex, rowIndex, cachefiles, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.filesIndex, rowIndex);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.video.Video createDetachedCopy(test.mingorto.crackersapp.model.attachment.video.Video realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.video.Video unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.video.Video();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.video.Video) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.video.Video) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        VideoRealmProxyInterface unmanagedCopy = (VideoRealmProxyInterface) unmanagedObject;
        VideoRealmProxyInterface realmSource = (VideoRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$views(realmSource.realmGet$views());
        unmanagedCopy.realmSet$comments(realmSource.realmGet$comments());
        unmanagedCopy.realmSet$photo130(realmSource.realmGet$photo130());
        unmanagedCopy.realmSet$photo320(realmSource.realmGet$photo320());
        unmanagedCopy.realmSet$photo800(realmSource.realmGet$photo800());
        unmanagedCopy.realmSet$player(realmSource.realmGet$player());
        unmanagedCopy.realmSet$accessKey(realmSource.realmGet$accessKey());
        unmanagedCopy.realmSet$canAdd(realmSource.realmGet$canAdd());

        // Deep copy of files
        unmanagedCopy.realmSet$files(FileRealmProxy.createDetachedCopy(realmSource.realmGet$files(), currentDepth + 1, maxDepth, cache));
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.attachment.video.Video update(Realm realm, test.mingorto.crackersapp.model.attachment.video.Video realmObject, test.mingorto.crackersapp.model.attachment.video.Video newObject, Map<RealmModel, RealmObjectProxy> cache) {
        VideoRealmProxyInterface realmObjectTarget = (VideoRealmProxyInterface) realmObject;
        VideoRealmProxyInterface realmObjectSource = (VideoRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$duration(realmObjectSource.realmGet$duration());
        realmObjectTarget.realmSet$description(realmObjectSource.realmGet$description());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectTarget.realmSet$views(realmObjectSource.realmGet$views());
        realmObjectTarget.realmSet$comments(realmObjectSource.realmGet$comments());
        realmObjectTarget.realmSet$photo130(realmObjectSource.realmGet$photo130());
        realmObjectTarget.realmSet$photo320(realmObjectSource.realmGet$photo320());
        realmObjectTarget.realmSet$photo800(realmObjectSource.realmGet$photo800());
        realmObjectTarget.realmSet$player(realmObjectSource.realmGet$player());
        realmObjectTarget.realmSet$accessKey(realmObjectSource.realmGet$accessKey());
        realmObjectTarget.realmSet$canAdd(realmObjectSource.realmGet$canAdd());
        test.mingorto.crackersapp.model.attachment.video.File filesObj = realmObjectSource.realmGet$files();
        if (filesObj == null) {
            realmObjectTarget.realmSet$files(null);
        } else {
            test.mingorto.crackersapp.model.attachment.video.File cachefiles = (test.mingorto.crackersapp.model.attachment.video.File) cache.get(filesObj);
            if (cachefiles != null) {
                realmObjectTarget.realmSet$files(cachefiles);
            } else {
                realmObjectTarget.realmSet$files(FileRealmProxy.copyOrUpdate(realm, filesObj, true, cache));
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Video = proxy[");
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
        stringBuilder.append("{duration:");
        stringBuilder.append(realmGet$duration());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{views:");
        stringBuilder.append(realmGet$views());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{comments:");
        stringBuilder.append(realmGet$comments());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo130:");
        stringBuilder.append(realmGet$photo130() != null ? realmGet$photo130() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo320:");
        stringBuilder.append(realmGet$photo320() != null ? realmGet$photo320() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo800:");
        stringBuilder.append(realmGet$photo800() != null ? realmGet$photo800() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{player:");
        stringBuilder.append(realmGet$player() != null ? realmGet$player() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{accessKey:");
        stringBuilder.append(realmGet$accessKey() != null ? realmGet$accessKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{canAdd:");
        stringBuilder.append(realmGet$canAdd());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{files:");
        stringBuilder.append(realmGet$files() != null ? "File" : "null");
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
        VideoRealmProxy aVideo = (VideoRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aVideo.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aVideo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aVideo.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
