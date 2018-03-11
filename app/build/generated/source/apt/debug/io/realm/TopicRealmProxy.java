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
public class TopicRealmProxy extends test.mingorto.crackersapp.model.Topic
    implements RealmObjectProxy, TopicRealmProxyInterface {

    static final class TopicColumnInfo extends ColumnInfo {
        long idIndex;
        long titleIndex;
        long commentsIndex;
        long groupidIndex;

        TopicColumnInfo(SharedRealm realm, Table table) {
            super(4);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.titleIndex = addColumnDetails(table, "title", RealmFieldType.STRING);
            this.commentsIndex = addColumnDetails(table, "comments", RealmFieldType.INTEGER);
            this.groupidIndex = addColumnDetails(table, "groupid", RealmFieldType.INTEGER);
        }

        TopicColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TopicColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TopicColumnInfo src = (TopicColumnInfo) rawSrc;
            final TopicColumnInfo dst = (TopicColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.titleIndex = src.titleIndex;
            dst.commentsIndex = src.commentsIndex;
            dst.groupidIndex = src.groupidIndex;
        }
    }

    private TopicColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Topic> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("title");
        fieldNames.add("comments");
        fieldNames.add("groupid");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    TopicRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TopicColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Topic>(this);
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
    public int realmGet$groupid() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.groupidIndex);
    }

    @Override
    public void realmSet$groupid(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.groupidIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.groupidIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Topic");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("comments", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("groupid", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static TopicColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Topic")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Topic' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Topic");
        final long columnCount = table.getColumnCount();
        if (columnCount != 4) {
            if (columnCount < 4) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 4 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 4 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 4 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final TopicColumnInfo columnInfo = new TopicColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("title")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'title' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("title") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'title' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.titleIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'title' is required. Either set @Required to field 'title' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("groupid")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'groupid' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("groupid") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'groupid' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.groupidIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'groupid' does support null values in the existing Realm file. Use corresponding boxed type for field 'groupid' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Topic";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Topic createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.Topic obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class), false, Collections.<String> emptyList());
                    obj = new io.realm.TopicRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.TopicRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Topic.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.TopicRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Topic.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                ((TopicRealmProxyInterface) obj).realmSet$title(null);
            } else {
                ((TopicRealmProxyInterface) obj).realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("comments")) {
            if (json.isNull("comments")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'comments' to null.");
            } else {
                ((TopicRealmProxyInterface) obj).realmSet$comments((int) json.getInt("comments"));
            }
        }
        if (json.has("groupid")) {
            if (json.isNull("groupid")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'groupid' to null.");
            } else {
                ((TopicRealmProxyInterface) obj).realmSet$groupid((int) json.getInt("groupid"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Topic createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.Topic obj = new test.mingorto.crackersapp.model.Topic();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((TopicRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("title")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((TopicRealmProxyInterface) obj).realmSet$title(null);
                } else {
                    ((TopicRealmProxyInterface) obj).realmSet$title((String) reader.nextString());
                }
            } else if (name.equals("comments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'comments' to null.");
                } else {
                    ((TopicRealmProxyInterface) obj).realmSet$comments((int) reader.nextInt());
                }
            } else if (name.equals("groupid")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'groupid' to null.");
                } else {
                    ((TopicRealmProxyInterface) obj).realmSet$groupid((int) reader.nextInt());
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

    public static test.mingorto.crackersapp.model.Topic copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Topic object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Topic) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.Topic realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((TopicRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.TopicRealmProxy();
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

    public static test.mingorto.crackersapp.model.Topic copy(Realm realm, test.mingorto.crackersapp.model.Topic newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Topic) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Topic realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Topic.class, ((TopicRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        TopicRealmProxyInterface realmObjectSource = (TopicRealmProxyInterface) newObject;
        TopicRealmProxyInterface realmObjectCopy = (TopicRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$comments(realmObjectSource.realmGet$comments());
        realmObjectCopy.realmSet$groupid(realmObjectSource.realmGet$groupid());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Topic object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
        long tableNativePtr = table.getNativePtr();
        TopicColumnInfo columnInfo = (TopicColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((TopicRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((TopicRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((TopicRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$title = ((TopicRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$comments(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.groupidIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$groupid(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
        long tableNativePtr = table.getNativePtr();
        TopicColumnInfo columnInfo = (TopicColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Topic object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Topic) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((TopicRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((TopicRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((TopicRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$title = ((TopicRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$comments(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.groupidIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$groupid(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Topic object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
        long tableNativePtr = table.getNativePtr();
        TopicColumnInfo columnInfo = (TopicColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((TopicRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((TopicRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((TopicRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$title = ((TopicRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$comments(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.groupidIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$groupid(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Topic.class);
        long tableNativePtr = table.getNativePtr();
        TopicColumnInfo columnInfo = (TopicColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Topic.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Topic object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Topic) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((TopicRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((TopicRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((TopicRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$title = ((TopicRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.commentsIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$comments(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.groupidIndex, rowIndex, ((TopicRealmProxyInterface) object).realmGet$groupid(), false);
        }
    }

    public static test.mingorto.crackersapp.model.Topic createDetachedCopy(test.mingorto.crackersapp.model.Topic realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Topic unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Topic();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Topic) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Topic) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        TopicRealmProxyInterface unmanagedCopy = (TopicRealmProxyInterface) unmanagedObject;
        TopicRealmProxyInterface realmSource = (TopicRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$comments(realmSource.realmGet$comments());
        unmanagedCopy.realmSet$groupid(realmSource.realmGet$groupid());
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.Topic update(Realm realm, test.mingorto.crackersapp.model.Topic realmObject, test.mingorto.crackersapp.model.Topic newObject, Map<RealmModel, RealmObjectProxy> cache) {
        TopicRealmProxyInterface realmObjectTarget = (TopicRealmProxyInterface) realmObject;
        TopicRealmProxyInterface realmObjectSource = (TopicRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$comments(realmObjectSource.realmGet$comments());
        realmObjectTarget.realmSet$groupid(realmObjectSource.realmGet$groupid());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Topic = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{comments:");
        stringBuilder.append(realmGet$comments());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{groupid:");
        stringBuilder.append(realmGet$groupid());
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
        TopicRealmProxy aTopic = (TopicRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aTopic.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTopic.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aTopic.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
