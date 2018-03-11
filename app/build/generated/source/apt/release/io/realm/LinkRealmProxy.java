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
public class LinkRealmProxy extends test.mingorto.crackersapp.model.attachment.Link
    implements RealmObjectProxy, LinkRealmProxyInterface {

    static final class LinkColumnInfo extends ColumnInfo {
        long urlIndex;
        long titleIndex;
        long nameIndex;
        long captionIndex;
        long descriptionIndex;
        long photoIndex;
        long isExternalIndex;

        LinkColumnInfo(SharedRealm realm, Table table) {
            super(7);
            this.urlIndex = addColumnDetails(table, "url", RealmFieldType.STRING);
            this.titleIndex = addColumnDetails(table, "title", RealmFieldType.STRING);
            this.nameIndex = addColumnDetails(table, "name", RealmFieldType.STRING);
            this.captionIndex = addColumnDetails(table, "caption", RealmFieldType.STRING);
            this.descriptionIndex = addColumnDetails(table, "description", RealmFieldType.STRING);
            this.photoIndex = addColumnDetails(table, "photo", RealmFieldType.OBJECT);
            this.isExternalIndex = addColumnDetails(table, "isExternal", RealmFieldType.INTEGER);
        }

        LinkColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LinkColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LinkColumnInfo src = (LinkColumnInfo) rawSrc;
            final LinkColumnInfo dst = (LinkColumnInfo) rawDst;
            dst.urlIndex = src.urlIndex;
            dst.titleIndex = src.titleIndex;
            dst.nameIndex = src.nameIndex;
            dst.captionIndex = src.captionIndex;
            dst.descriptionIndex = src.descriptionIndex;
            dst.photoIndex = src.photoIndex;
            dst.isExternalIndex = src.isExternalIndex;
        }
    }

    private LinkColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.Link> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("url");
        fieldNames.add("title");
        fieldNames.add("name");
        fieldNames.add("caption");
        fieldNames.add("description");
        fieldNames.add("photo");
        fieldNames.add("isExternal");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    LinkRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LinkColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.Link>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$caption() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.captionIndex);
    }

    @Override
    public void realmSet$caption(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.captionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.captionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.captionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.captionIndex, value);
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
    public test.mingorto.crackersapp.model.attachment.Photo realmGet$photo() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.photoIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.Photo.class, proxyState.getRow$realm().getLink(columnInfo.photoIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$photo(test.mingorto.crackersapp.model.attachment.Photo value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("photo")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.photoIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.photoIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.photoIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.photoIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$isExternal() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.isExternalIndex);
    }

    @Override
    public void realmSet$isExternal(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.isExternalIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.isExternalIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Link");
        builder.addProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("caption", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("photo", RealmFieldType.OBJECT, "Photo");
        builder.addProperty("isExternal", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static LinkColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Link")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Link' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Link");
        final long columnCount = table.getColumnCount();
        if (columnCount != 7) {
            if (columnCount < 7) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 7 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 7 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 7 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final LinkColumnInfo columnInfo = new LinkColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
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
        if (!columnTypes.containsKey("title")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'title' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("title") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'title' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.titleIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'title' is required. Either set @Required to field 'title' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("name")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("name") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.nameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'name' is required. Either set @Required to field 'name' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("caption")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'caption' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("caption") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'caption' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.captionIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'caption' is required. Either set @Required to field 'caption' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Photo' for field 'photo'");
        }
        if (!sharedRealm.hasTable("class_Photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Photo' for field 'photo'");
        }
        Table table_5 = sharedRealm.getTable("class_Photo");
        if (!table.getLinkTarget(columnInfo.photoIndex).hasSameSchema(table_5)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'photo': '" + table.getLinkTarget(columnInfo.photoIndex).getName() + "' expected - was '" + table_5.getName() + "'");
        }
        if (!columnTypes.containsKey("isExternal")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isExternal' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isExternal") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'isExternal' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.isExternalIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'isExternal' does support null values in the existing Realm file. Use corresponding boxed type for field 'isExternal' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Link";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.Link createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("photo")) {
            excludeFields.add("photo");
        }
        test.mingorto.crackersapp.model.attachment.Link obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Link.class, true, excludeFields);
        if (json.has("url")) {
            if (json.isNull("url")) {
                ((LinkRealmProxyInterface) obj).realmSet$url(null);
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((LinkRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((LinkRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("caption")) {
            if (json.isNull("caption")) {
                ((LinkRealmProxyInterface) obj).realmSet$caption(null);
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$caption((String) json.getString("caption"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                ((LinkRealmProxyInterface) obj).realmSet$description(null);
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                ((LinkRealmProxyInterface) obj).realmSet$photo(null);
            } else {
                test.mingorto.crackersapp.model.attachment.Photo photoObj = PhotoRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("photo"), update);
                ((LinkRealmProxyInterface) obj).realmSet$photo(photoObj);
            }
        }
        if (json.has("isExternal")) {
            if (json.isNull("isExternal")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isExternal' to null.");
            } else {
                ((LinkRealmProxyInterface) obj).realmSet$isExternal((int) json.getInt("isExternal"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.Link createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.Link obj = new test.mingorto.crackersapp.model.attachment.Link();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("url")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$url(null);
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$url((String) reader.nextString());
                }
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("caption")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$caption(null);
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$caption((String) reader.nextString());
                }
            } else if (name.equals("description")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$description(null);
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$description((String) reader.nextString());
                }
            } else if (name.equals("photo")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LinkRealmProxyInterface) obj).realmSet$photo(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.Photo photoObj = PhotoRealmProxy.createUsingJsonStream(realm, reader);
                    ((LinkRealmProxyInterface) obj).realmSet$photo(photoObj);
                }
            } else if (name.equals("isExternal")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isExternal' to null.");
                } else {
                    ((LinkRealmProxyInterface) obj).realmSet$isExternal((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.Link copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Link object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Link) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.Link copy(Realm realm, test.mingorto.crackersapp.model.attachment.Link newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.Link) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.Link realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.Link.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        LinkRealmProxyInterface realmObjectSource = (LinkRealmProxyInterface) newObject;
        LinkRealmProxyInterface realmObjectCopy = (LinkRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$url(realmObjectSource.realmGet$url());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$caption(realmObjectSource.realmGet$caption());
        realmObjectCopy.realmSet$description(realmObjectSource.realmGet$description());

        test.mingorto.crackersapp.model.attachment.Photo photoObj = realmObjectSource.realmGet$photo();
        if (photoObj == null) {
            realmObjectCopy.realmSet$photo(null);
        } else {
            test.mingorto.crackersapp.model.attachment.Photo cachephoto = (test.mingorto.crackersapp.model.attachment.Photo) cache.get(photoObj);
            if (cachephoto != null) {
                realmObjectCopy.realmSet$photo(cachephoto);
            } else {
                realmObjectCopy.realmSet$photo(PhotoRealmProxy.copyOrUpdate(realm, photoObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$isExternal(realmObjectSource.realmGet$isExternal());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.Link object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Link.class);
        long tableNativePtr = table.getNativePtr();
        LinkColumnInfo columnInfo = (LinkColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Link.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((LinkRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        String realmGet$title = ((LinkRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        String realmGet$name = ((LinkRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$caption = ((LinkRealmProxyInterface) object).realmGet$caption();
        if (realmGet$caption != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.captionIndex, rowIndex, realmGet$caption, false);
        }
        String realmGet$description = ((LinkRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        }

        test.mingorto.crackersapp.model.attachment.Photo photoObj = ((LinkRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoRealmProxy.insert(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.isExternalIndex, rowIndex, ((LinkRealmProxyInterface) object).realmGet$isExternal(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Link.class);
        long tableNativePtr = table.getNativePtr();
        LinkColumnInfo columnInfo = (LinkColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Link.class);
        test.mingorto.crackersapp.model.attachment.Link object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Link) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((LinkRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            String realmGet$title = ((LinkRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            String realmGet$name = ((LinkRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$caption = ((LinkRealmProxyInterface) object).realmGet$caption();
            if (realmGet$caption != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.captionIndex, rowIndex, realmGet$caption, false);
            }
            String realmGet$description = ((LinkRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            }

            test.mingorto.crackersapp.model.attachment.Photo photoObj = ((LinkRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoRealmProxy.insert(realm, photoObj, cache);
                }
                table.setLink(columnInfo.photoIndex, rowIndex, cachephoto, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.isExternalIndex, rowIndex, ((LinkRealmProxyInterface) object).realmGet$isExternal(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.Link object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Link.class);
        long tableNativePtr = table.getNativePtr();
        LinkColumnInfo columnInfo = (LinkColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Link.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((LinkRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        String realmGet$title = ((LinkRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        String realmGet$name = ((LinkRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$caption = ((LinkRealmProxyInterface) object).realmGet$caption();
        if (realmGet$caption != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.captionIndex, rowIndex, realmGet$caption, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.captionIndex, rowIndex, false);
        }
        String realmGet$description = ((LinkRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
        }

        test.mingorto.crackersapp.model.attachment.Photo photoObj = ((LinkRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoRealmProxy.insertOrUpdate(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.isExternalIndex, rowIndex, ((LinkRealmProxyInterface) object).realmGet$isExternal(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.Link.class);
        long tableNativePtr = table.getNativePtr();
        LinkColumnInfo columnInfo = (LinkColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.Link.class);
        test.mingorto.crackersapp.model.attachment.Link object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.Link) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((LinkRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            String realmGet$title = ((LinkRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            String realmGet$name = ((LinkRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$caption = ((LinkRealmProxyInterface) object).realmGet$caption();
            if (realmGet$caption != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.captionIndex, rowIndex, realmGet$caption, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.captionIndex, rowIndex, false);
            }
            String realmGet$description = ((LinkRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
            }

            test.mingorto.crackersapp.model.attachment.Photo photoObj = ((LinkRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoRealmProxy.insertOrUpdate(realm, photoObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.isExternalIndex, rowIndex, ((LinkRealmProxyInterface) object).realmGet$isExternal(), false);
        }
    }

    public static test.mingorto.crackersapp.model.attachment.Link createDetachedCopy(test.mingorto.crackersapp.model.attachment.Link realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.Link unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.Link();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.Link) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.Link) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        LinkRealmProxyInterface unmanagedCopy = (LinkRealmProxyInterface) unmanagedObject;
        LinkRealmProxyInterface realmSource = (LinkRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$caption(realmSource.realmGet$caption());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());

        // Deep copy of photo
        unmanagedCopy.realmSet$photo(PhotoRealmProxy.createDetachedCopy(realmSource.realmGet$photo(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isExternal(realmSource.realmGet$isExternal());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Link = proxy[");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{caption:");
        stringBuilder.append(realmGet$caption() != null ? realmGet$caption() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo:");
        stringBuilder.append(realmGet$photo() != null ? "Photo" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isExternal:");
        stringBuilder.append(realmGet$isExternal());
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
        LinkRealmProxy aLink = (LinkRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLink.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLink.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLink.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
