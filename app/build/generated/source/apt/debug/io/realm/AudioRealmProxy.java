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
public class AudioRealmProxy extends test.mingorto.crackersapp.model.attachment.Audio
    implements RealmObjectProxy, AudioRealmProxyInterface {

    static final class AudioColumnInfo extends ColumnInfo {
        long idIndex;
        long ownerIdIndex;
        long artistIndex;
        long titleIndex;
        long durationIndex;
        long dateIndex;
        long urlIndex;
        long lyricsIdIndex;
        long genreIdIndex;

        AudioColumnInfo(SharedRealm realm, Table table) {
            super(9);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.INTEGER);
            this.artistIndex = addColumnDetails(table, "artist", RealmFieldType.STRING);
            this.titleIndex = addColumnDetails(table, "title", RealmFieldType.STRING);
            this.durationIndex = addColumnDetails(table, "duration", RealmFieldType.INTEGER);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.urlIndex = addColumnDetails(table, "url", RealmFieldType.STRING);
            this.lyricsIdIndex = addColumnDetails(table, "lyricsId", RealmFieldType.INTEGER);
            this.genreIdIndex = addColumnDetails(table, "genreId", RealmFieldType.INTEGER);
        }

        AudioColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AudioColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AudioColumnInfo src = (AudioColumnInfo) rawSrc;
            final AudioColumnInfo dst = (AudioColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.artistIndex = src.artistIndex;
            dst.titleIndex = src.titleIndex;
            dst.durationIndex = src.durationIndex;
            dst.dateIndex = src.dateIndex;
            dst.urlIndex = src.urlIndex;
            dst.lyricsIdIndex = src.lyricsIdIndex;
            dst.genreIdIndex = src.genreIdIndex;
        }
    }

    private AudioColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.Audio> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("ownerId");
        fieldNames.add("artist");
        fieldNames.add("title");
        fieldNames.add("duration");
        fieldNames.add("date");
        fieldNames.add("url");
        fieldNames.add("lyricsId");
        fieldNames.add("genreId");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    AudioRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AudioColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.Audio>(this);
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
    public String realmGet$artist() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.artistIndex);
    }

    @Override
    public void realmSet$artist(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.artistIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.artistIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.artistIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.artistIndex, value);
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
    public int realmGet$lyricsId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.lyricsIdIndex);
    }

    @Override
    public void realmSet$lyricsId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lyricsIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lyricsIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$genreId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.genreIdIndex);
    }

    @Override
    public void realmSet$genreId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.genreIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.genreIdIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Audio");
        builder.addProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("ownerId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("artist", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("duration", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("lyricsId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("genreId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static AudioColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Audio")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Audio' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Audio");
        final long columnCount = table.getColumnCount();
        if (columnCount != 9) {
            if (columnCount < 9) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 9 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 9 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 9 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final AudioColumnInfo columnInfo = new AudioColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("artist")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'artist' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("artist") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'artist' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.artistIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'artist' is required. Either set @Required to field 'artist' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("date")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("date") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'date' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.dateIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'date' does support null values in the existing Realm file. Use corresponding boxed type for field 'date' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("lyricsId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'lyricsId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("lyricsId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'lyricsId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.lyricsIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'lyricsId' does support null values in the existing Realm file. Use corresponding boxed type for field 'lyricsId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("genreId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'genreId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("genreId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'genreId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.genreIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'genreId' does support null values in the existing Realm file. Use corresponding boxed type for field 'genreId' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Audio";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.Audio createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.attachment.Audio obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Audio.class, true, excludeFields);
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$ownerId((int) json.getInt("ownerId"));
            }
        }
        if (json.has("artist")) {
            if (json.isNull("artist")) {
                ((AudioRealmProxyInterface) obj).realmSet$artist(null);
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$artist((String) json.getString("artist"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((AudioRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$duration((int) json.getInt("duration"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((AudioRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("lyricsId")) {
            if (json.isNull("lyricsId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lyricsId' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$lyricsId((int) json.getInt("lyricsId"));
            }
        }
        if (json.has("genreId")) {
            if (json.isNull("genreId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'genreId' to null.");
            } else {
                ((AudioRealmProxyInterface) obj).realmSet$genreId((int) json.getInt("genreId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.Audio createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.Audio obj = new test.mingorto.crackersapp.model.attachment.Audio();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ownerId' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$ownerId((int) reader.nextInt());
                }
            } else if (name.equals("artist")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AudioRealmProxyInterface) obj).realmSet$artist(null);
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$artist((String) reader.nextString());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AudioRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("duration")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$duration((int) reader.nextInt());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AudioRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("lyricsId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lyricsId' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$lyricsId((int) reader.nextInt());
                }
            } else if (name.equals("genreId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'genreId' to null.");
                } else {
                    ((AudioRealmProxyInterface) obj).realmSet$genreId((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.Audio copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Audio object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Audio) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.Audio copy(Realm realm, test.mingorto.crackersapp.model.attachment.Audio newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Audio) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.Audio realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Audio.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        AudioRealmProxyInterface realmObjectSource = (AudioRealmProxyInterface) newObject;
        AudioRealmProxyInterface realmObjectCopy = (AudioRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$artist(realmObjectSource.realmGet$artist());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$duration(realmObjectSource.realmGet$duration());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$url(realmObjectSource.realmGet$url());
        realmObjectCopy.realmSet$lyricsId(realmObjectSource.realmGet$lyricsId());
        realmObjectCopy.realmSet$genreId(realmObjectSource.realmGet$genreId());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.Audio object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Audio.class);
        long tableNativePtr = table.getNativePtr();
        AudioColumnInfo columnInfo = (AudioColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Audio.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$artist = ((AudioRealmProxyInterface) object).realmGet$artist();
        if (realmGet$artist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistIndex, rowIndex, realmGet$artist, false);
        }
        String realmGet$title = ((AudioRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$date(), false);
        String realmGet$url = ((AudioRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lyricsIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$lyricsId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.genreIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$genreId(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Audio.class);
        long tableNativePtr = table.getNativePtr();
        AudioColumnInfo columnInfo = (AudioColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Audio.class);
        test.mingorto.crackersapp.model.attachment.Audio object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Audio) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$artist = ((AudioRealmProxyInterface) object).realmGet$artist();
            if (realmGet$artist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistIndex, rowIndex, realmGet$artist, false);
            }
            String realmGet$title = ((AudioRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$date(), false);
            String realmGet$url = ((AudioRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lyricsIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$lyricsId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.genreIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$genreId(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Audio object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Audio.class);
        long tableNativePtr = table.getNativePtr();
        AudioColumnInfo columnInfo = (AudioColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Audio.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$ownerId(), false);
        String realmGet$artist = ((AudioRealmProxyInterface) object).realmGet$artist();
        if (realmGet$artist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.artistIndex, rowIndex, realmGet$artist, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.artistIndex, rowIndex, false);
        }
        String realmGet$title = ((AudioRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$date(), false);
        String realmGet$url = ((AudioRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lyricsIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$lyricsId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.genreIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$genreId(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Audio.class);
        long tableNativePtr = table.getNativePtr();
        AudioColumnInfo columnInfo = (AudioColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Audio.class);
        test.mingorto.crackersapp.model.attachment.Audio object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Audio) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$ownerId(), false);
            String realmGet$artist = ((AudioRealmProxyInterface) object).realmGet$artist();
            if (realmGet$artist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.artistIndex, rowIndex, realmGet$artist, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.artistIndex, rowIndex, false);
            }
            String realmGet$title = ((AudioRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$date(), false);
            String realmGet$url = ((AudioRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lyricsIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$lyricsId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.genreIdIndex, rowIndex, ((AudioRealmProxyInterface) object).realmGet$genreId(), false);
        }
    }

    public static test.mingorto.crackersapp.model.attachment.Audio createDetachedCopy(test.mingorto.crackersapp.model.attachment.Audio realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.Audio unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.Audio();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.Audio) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.Audio) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        AudioRealmProxyInterface unmanagedCopy = (AudioRealmProxyInterface) unmanagedObject;
        AudioRealmProxyInterface realmSource = (AudioRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$artist(realmSource.realmGet$artist());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$lyricsId(realmSource.realmGet$lyricsId());
        unmanagedCopy.realmSet$genreId(realmSource.realmGet$genreId());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Audio = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ownerId:");
        stringBuilder.append(realmGet$ownerId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{artist:");
        stringBuilder.append(realmGet$artist() != null ? realmGet$artist() : "null");
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
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lyricsId:");
        stringBuilder.append(realmGet$lyricsId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{genreId:");
        stringBuilder.append(realmGet$genreId());
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
        AudioRealmProxy aAudio = (AudioRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAudio.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAudio.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAudio.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
