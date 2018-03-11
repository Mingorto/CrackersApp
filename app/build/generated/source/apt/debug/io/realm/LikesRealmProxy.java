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
public class LikesRealmProxy extends test.mingorto.crackersapp.model.countable.Likes
    implements RealmObjectProxy, LikesRealmProxyInterface {

    static final class LikesColumnInfo extends ColumnInfo {
        long countIndex;
        long userLikesIndex;
        long canLikeIndex;
        long canPublishIndex;

        LikesColumnInfo(SharedRealm realm, Table table) {
            super(4);
            this.countIndex = addColumnDetails(table, "count", RealmFieldType.INTEGER);
            this.userLikesIndex = addColumnDetails(table, "userLikes", RealmFieldType.INTEGER);
            this.canLikeIndex = addColumnDetails(table, "canLike", RealmFieldType.INTEGER);
            this.canPublishIndex = addColumnDetails(table, "canPublish", RealmFieldType.INTEGER);
        }

        LikesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LikesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LikesColumnInfo src = (LikesColumnInfo) rawSrc;
            final LikesColumnInfo dst = (LikesColumnInfo) rawDst;
            dst.countIndex = src.countIndex;
            dst.userLikesIndex = src.userLikesIndex;
            dst.canLikeIndex = src.canLikeIndex;
            dst.canPublishIndex = src.canPublishIndex;
        }
    }

    private LikesColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.countable.Likes> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("count");
        fieldNames.add("userLikes");
        fieldNames.add("canLike");
        fieldNames.add("canPublish");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    LikesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LikesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.countable.Likes>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$count() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.countIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.countIndex);
    }

    @Override
    public void realmSet$count(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.countIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.countIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$userLikes() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.userLikesIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.userLikesIndex);
    }

    @Override
    public void realmSet$userLikes(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userLikesIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.userLikesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userLikesIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.userLikesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$canLike() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.canLikeIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.canLikeIndex);
    }

    @Override
    public void realmSet$canLike(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.canLikeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.canLikeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.canLikeIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.canLikeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$canPublish() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.canPublishIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.canPublishIndex);
    }

    @Override
    public void realmSet$canPublish(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.canPublishIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.canPublishIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.canPublishIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.canPublishIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Likes");
        builder.addProperty("count", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("userLikes", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("canLike", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("canPublish", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static LikesColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Likes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Likes' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Likes");
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

        final LikesColumnInfo columnInfo = new LikesColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("count")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'count' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("count") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'count' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.countIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'count' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'count' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("userLikes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'userLikes' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("userLikes") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'userLikes' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.userLikesIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'userLikes' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'userLikes' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("canLike")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'canLike' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("canLike") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'canLike' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.canLikeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'canLike' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'canLike' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("canPublish")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'canPublish' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("canPublish") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'canPublish' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.canPublishIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'canPublish' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'canPublish' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Likes";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.countable.Likes createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.countable.Likes obj = realm.createObjectInternal(test.mingorto.crackersapp.model.countable.Likes.class, true, excludeFields);
        if (json.has("count")) {
            if (json.isNull("count")) {
                ((LikesRealmProxyInterface) obj).realmSet$count(null);
            } else {
                ((LikesRealmProxyInterface) obj).realmSet$count((int) json.getInt("count"));
            }
        }
        if (json.has("userLikes")) {
            if (json.isNull("userLikes")) {
                ((LikesRealmProxyInterface) obj).realmSet$userLikes(null);
            } else {
                ((LikesRealmProxyInterface) obj).realmSet$userLikes((int) json.getInt("userLikes"));
            }
        }
        if (json.has("canLike")) {
            if (json.isNull("canLike")) {
                ((LikesRealmProxyInterface) obj).realmSet$canLike(null);
            } else {
                ((LikesRealmProxyInterface) obj).realmSet$canLike((int) json.getInt("canLike"));
            }
        }
        if (json.has("canPublish")) {
            if (json.isNull("canPublish")) {
                ((LikesRealmProxyInterface) obj).realmSet$canPublish(null);
            } else {
                ((LikesRealmProxyInterface) obj).realmSet$canPublish((int) json.getInt("canPublish"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.countable.Likes createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.countable.Likes obj = new test.mingorto.crackersapp.model.countable.Likes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("count")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LikesRealmProxyInterface) obj).realmSet$count(null);
                } else {
                    ((LikesRealmProxyInterface) obj).realmSet$count((int) reader.nextInt());
                }
            } else if (name.equals("userLikes")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LikesRealmProxyInterface) obj).realmSet$userLikes(null);
                } else {
                    ((LikesRealmProxyInterface) obj).realmSet$userLikes((int) reader.nextInt());
                }
            } else if (name.equals("canLike")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LikesRealmProxyInterface) obj).realmSet$canLike(null);
                } else {
                    ((LikesRealmProxyInterface) obj).realmSet$canLike((int) reader.nextInt());
                }
            } else if (name.equals("canPublish")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((LikesRealmProxyInterface) obj).realmSet$canPublish(null);
                } else {
                    ((LikesRealmProxyInterface) obj).realmSet$canPublish((int) reader.nextInt());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.countable.Likes copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.countable.Likes object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.countable.Likes) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.countable.Likes copy(Realm realm, test.mingorto.crackersapp.model.countable.Likes newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.countable.Likes) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.countable.Likes realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.countable.Likes.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        LikesRealmProxyInterface realmObjectSource = (LikesRealmProxyInterface) newObject;
        LikesRealmProxyInterface realmObjectCopy = (LikesRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$count(realmObjectSource.realmGet$count());
        realmObjectCopy.realmSet$userLikes(realmObjectSource.realmGet$userLikes());
        realmObjectCopy.realmSet$canLike(realmObjectSource.realmGet$canLike());
        realmObjectCopy.realmSet$canPublish(realmObjectSource.realmGet$canPublish());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.countable.Likes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Likes.class);
        long tableNativePtr = table.getNativePtr();
        LikesColumnInfo columnInfo = (LikesColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Likes.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((LikesRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        }
        Number realmGet$userLikes = ((LikesRealmProxyInterface) object).realmGet$userLikes();
        if (realmGet$userLikes != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userLikesIndex, rowIndex, realmGet$userLikes.longValue(), false);
        }
        Number realmGet$canLike = ((LikesRealmProxyInterface) object).realmGet$canLike();
        if (realmGet$canLike != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canLikeIndex, rowIndex, realmGet$canLike.longValue(), false);
        }
        Number realmGet$canPublish = ((LikesRealmProxyInterface) object).realmGet$canPublish();
        if (realmGet$canPublish != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPublishIndex, rowIndex, realmGet$canPublish.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Likes.class);
        long tableNativePtr = table.getNativePtr();
        LikesColumnInfo columnInfo = (LikesColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Likes.class);
        test.mingorto.crackersapp.model.countable.Likes object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.countable.Likes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((LikesRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            }
            Number realmGet$userLikes = ((LikesRealmProxyInterface) object).realmGet$userLikes();
            if (realmGet$userLikes != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userLikesIndex, rowIndex, realmGet$userLikes.longValue(), false);
            }
            Number realmGet$canLike = ((LikesRealmProxyInterface) object).realmGet$canLike();
            if (realmGet$canLike != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canLikeIndex, rowIndex, realmGet$canLike.longValue(), false);
            }
            Number realmGet$canPublish = ((LikesRealmProxyInterface) object).realmGet$canPublish();
            if (realmGet$canPublish != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPublishIndex, rowIndex, realmGet$canPublish.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.countable.Likes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Likes.class);
        long tableNativePtr = table.getNativePtr();
        LikesColumnInfo columnInfo = (LikesColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Likes.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$count = ((LikesRealmProxyInterface) object).realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
        }
        Number realmGet$userLikes = ((LikesRealmProxyInterface) object).realmGet$userLikes();
        if (realmGet$userLikes != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.userLikesIndex, rowIndex, realmGet$userLikes.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userLikesIndex, rowIndex, false);
        }
        Number realmGet$canLike = ((LikesRealmProxyInterface) object).realmGet$canLike();
        if (realmGet$canLike != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canLikeIndex, rowIndex, realmGet$canLike.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.canLikeIndex, rowIndex, false);
        }
        Number realmGet$canPublish = ((LikesRealmProxyInterface) object).realmGet$canPublish();
        if (realmGet$canPublish != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPublishIndex, rowIndex, realmGet$canPublish.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.canPublishIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.countable.Likes.class);
        long tableNativePtr = table.getNativePtr();
        LikesColumnInfo columnInfo = (LikesColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.countable.Likes.class);
        test.mingorto.crackersapp.model.countable.Likes object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.countable.Likes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$count = ((LikesRealmProxyInterface) object).realmGet$count();
            if (realmGet$count != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.countIndex, rowIndex, realmGet$count.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countIndex, rowIndex, false);
            }
            Number realmGet$userLikes = ((LikesRealmProxyInterface) object).realmGet$userLikes();
            if (realmGet$userLikes != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.userLikesIndex, rowIndex, realmGet$userLikes.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userLikesIndex, rowIndex, false);
            }
            Number realmGet$canLike = ((LikesRealmProxyInterface) object).realmGet$canLike();
            if (realmGet$canLike != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canLikeIndex, rowIndex, realmGet$canLike.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.canLikeIndex, rowIndex, false);
            }
            Number realmGet$canPublish = ((LikesRealmProxyInterface) object).realmGet$canPublish();
            if (realmGet$canPublish != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPublishIndex, rowIndex, realmGet$canPublish.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.canPublishIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.countable.Likes createDetachedCopy(test.mingorto.crackersapp.model.countable.Likes realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.countable.Likes unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.countable.Likes();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.countable.Likes) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.countable.Likes) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        LikesRealmProxyInterface unmanagedCopy = (LikesRealmProxyInterface) unmanagedObject;
        LikesRealmProxyInterface realmSource = (LikesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$count(realmSource.realmGet$count());
        unmanagedCopy.realmSet$userLikes(realmSource.realmGet$userLikes());
        unmanagedCopy.realmSet$canLike(realmSource.realmGet$canLike());
        unmanagedCopy.realmSet$canPublish(realmSource.realmGet$canPublish());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Likes = proxy[");
        stringBuilder.append("{count:");
        stringBuilder.append(realmGet$count() != null ? realmGet$count() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userLikes:");
        stringBuilder.append(realmGet$userLikes() != null ? realmGet$userLikes() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{canLike:");
        stringBuilder.append(realmGet$canLike() != null ? realmGet$canLike() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{canPublish:");
        stringBuilder.append(realmGet$canPublish() != null ? realmGet$canPublish() : "null");
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
        LikesRealmProxy aLikes = (LikesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLikes.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLikes.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLikes.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
