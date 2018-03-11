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
public class PreviewRealmProxy extends test.mingorto.crackersapp.model.attachment.doc.Preview
    implements RealmObjectProxy, PreviewRealmProxyInterface {

    static final class PreviewColumnInfo extends ColumnInfo {
        long photoIndex;
        long videoIndex;

        PreviewColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.photoIndex = addColumnDetails(table, "photo", RealmFieldType.OBJECT);
            this.videoIndex = addColumnDetails(table, "video", RealmFieldType.OBJECT);
        }

        PreviewColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PreviewColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PreviewColumnInfo src = (PreviewColumnInfo) rawSrc;
            final PreviewColumnInfo dst = (PreviewColumnInfo) rawDst;
            dst.photoIndex = src.photoIndex;
            dst.videoIndex = src.videoIndex;
        }
    }

    private PreviewColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.doc.Preview> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("photo");
        fieldNames.add("video");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PreviewRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PreviewColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.doc.Preview>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public test.mingorto.crackersapp.model.attachment.doc.PhotoPreview realmGet$photo() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.photoIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class, proxyState.getRow$realm().getLink(columnInfo.photoIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$photo(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview value) {
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
    public test.mingorto.crackersapp.model.attachment.video.Video realmGet$video() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.videoIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.video.Video.class, proxyState.getRow$realm().getLink(columnInfo.videoIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$video(test.mingorto.crackersapp.model.attachment.video.Video value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("video")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.videoIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.videoIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.videoIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.videoIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Preview");
        builder.addLinkedProperty("photo", RealmFieldType.OBJECT, "PhotoPreview");
        builder.addLinkedProperty("video", RealmFieldType.OBJECT, "Video");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static PreviewColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Preview")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Preview' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Preview");
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

        final PreviewColumnInfo columnInfo = new PreviewColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'PhotoPreview' for field 'photo'");
        }
        if (!sharedRealm.hasTable("class_PhotoPreview")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_PhotoPreview' for field 'photo'");
        }
        Table table_0 = sharedRealm.getTable("class_PhotoPreview");
        if (!table.getLinkTarget(columnInfo.photoIndex).hasSameSchema(table_0)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'photo': '" + table.getLinkTarget(columnInfo.photoIndex).getName() + "' expected - was '" + table_0.getName() + "'");
        }
        if (!columnTypes.containsKey("video")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'video' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("video") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Video' for field 'video'");
        }
        if (!sharedRealm.hasTable("class_Video")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Video' for field 'video'");
        }
        Table table_1 = sharedRealm.getTable("class_Video");
        if (!table.getLinkTarget(columnInfo.videoIndex).hasSameSchema(table_1)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'video': '" + table.getLinkTarget(columnInfo.videoIndex).getName() + "' expected - was '" + table_1.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Preview";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.doc.Preview createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("photo")) {
            excludeFields.add("photo");
        }
        if (json.has("video")) {
            excludeFields.add("video");
        }
        test.mingorto.crackersapp.model.attachment.doc.Preview obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Preview.class, true, excludeFields);
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                ((PreviewRealmProxyInterface) obj).realmSet$photo(null);
            } else {
                test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = PhotoPreviewRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("photo"), update);
                ((PreviewRealmProxyInterface) obj).realmSet$photo(photoObj);
            }
        }
        if (json.has("video")) {
            if (json.isNull("video")) {
                ((PreviewRealmProxyInterface) obj).realmSet$video(null);
            } else {
                test.mingorto.crackersapp.model.attachment.video.Video videoObj = VideoRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("video"), update);
                ((PreviewRealmProxyInterface) obj).realmSet$video(videoObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.doc.Preview createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.doc.Preview obj = new test.mingorto.crackersapp.model.attachment.doc.Preview();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("photo")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PreviewRealmProxyInterface) obj).realmSet$photo(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = PhotoPreviewRealmProxy.createUsingJsonStream(realm, reader);
                    ((PreviewRealmProxyInterface) obj).realmSet$photo(photoObj);
                }
            } else if (name.equals("video")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PreviewRealmProxyInterface) obj).realmSet$video(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.video.Video videoObj = VideoRealmProxy.createUsingJsonStream(realm, reader);
                    ((PreviewRealmProxyInterface) obj).realmSet$video(videoObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Preview copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Preview object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Preview) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Preview copy(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Preview newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Preview) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.doc.Preview realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Preview.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        PreviewRealmProxyInterface realmObjectSource = (PreviewRealmProxyInterface) newObject;
        PreviewRealmProxyInterface realmObjectCopy = (PreviewRealmProxyInterface) realmObject;


        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = realmObjectSource.realmGet$photo();
        if (photoObj == null) {
            realmObjectCopy.realmSet$photo(null);
        } else {
            test.mingorto.crackersapp.model.attachment.doc.PhotoPreview cachephoto = (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) cache.get(photoObj);
            if (cachephoto != null) {
                realmObjectCopy.realmSet$photo(cachephoto);
            } else {
                realmObjectCopy.realmSet$photo(PhotoPreviewRealmProxy.copyOrUpdate(realm, photoObj, update, cache));
            }
        }

        test.mingorto.crackersapp.model.attachment.video.Video videoObj = realmObjectSource.realmGet$video();
        if (videoObj == null) {
            realmObjectCopy.realmSet$video(null);
        } else {
            test.mingorto.crackersapp.model.attachment.video.Video cachevideo = (test.mingorto.crackersapp.model.attachment.video.Video) cache.get(videoObj);
            if (cachevideo != null) {
                realmObjectCopy.realmSet$video(cachevideo);
            } else {
                realmObjectCopy.realmSet$video(VideoRealmProxy.copyOrUpdate(realm, videoObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Preview object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long tableNativePtr = table.getNativePtr();
        PreviewColumnInfo columnInfo = (PreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = ((PreviewRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoPreviewRealmProxy.insert(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        }

        test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((PreviewRealmProxyInterface) object).realmGet$video();
        if (videoObj != null) {
            Long cachevideo = cache.get(videoObj);
            if (cachevideo == null) {
                cachevideo = VideoRealmProxy.insert(realm, videoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long tableNativePtr = table.getNativePtr();
        PreviewColumnInfo columnInfo = (PreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        test.mingorto.crackersapp.model.attachment.doc.Preview object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Preview) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = ((PreviewRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoPreviewRealmProxy.insert(realm, photoObj, cache);
                }
                table.setLink(columnInfo.photoIndex, rowIndex, cachephoto, false);
            }

            test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((PreviewRealmProxyInterface) object).realmGet$video();
            if (videoObj != null) {
                Long cachevideo = cache.get(videoObj);
                if (cachevideo == null) {
                    cachevideo = VideoRealmProxy.insert(realm, videoObj, cache);
                }
                table.setLink(columnInfo.videoIndex, rowIndex, cachevideo, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Preview object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long tableNativePtr = table.getNativePtr();
        PreviewColumnInfo columnInfo = (PreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = ((PreviewRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoPreviewRealmProxy.insertOrUpdate(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((PreviewRealmProxyInterface) object).realmGet$video();
        if (videoObj != null) {
            Long cachevideo = cache.get(videoObj);
            if (cachevideo == null) {
                cachevideo = VideoRealmProxy.insertOrUpdate(realm, videoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.videoIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        long tableNativePtr = table.getNativePtr();
        PreviewColumnInfo columnInfo = (PreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        test.mingorto.crackersapp.model.attachment.doc.Preview object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Preview) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            test.mingorto.crackersapp.model.attachment.doc.PhotoPreview photoObj = ((PreviewRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoPreviewRealmProxy.insertOrUpdate(realm, photoObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((PreviewRealmProxyInterface) object).realmGet$video();
            if (videoObj != null) {
                Long cachevideo = cache.get(videoObj);
                if (cachevideo == null) {
                    cachevideo = VideoRealmProxy.insertOrUpdate(realm, videoObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.videoIndex, rowIndex);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Preview createDetachedCopy(test.mingorto.crackersapp.model.attachment.doc.Preview realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.doc.Preview unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.doc.Preview();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.doc.Preview) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.doc.Preview) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        PreviewRealmProxyInterface unmanagedCopy = (PreviewRealmProxyInterface) unmanagedObject;
        PreviewRealmProxyInterface realmSource = (PreviewRealmProxyInterface) realmObject;

        // Deep copy of photo
        unmanagedCopy.realmSet$photo(PhotoPreviewRealmProxy.createDetachedCopy(realmSource.realmGet$photo(), currentDepth + 1, maxDepth, cache));

        // Deep copy of video
        unmanagedCopy.realmSet$video(VideoRealmProxy.createDetachedCopy(realmSource.realmGet$video(), currentDepth + 1, maxDepth, cache));
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Preview = proxy[");
        stringBuilder.append("{photo:");
        stringBuilder.append(realmGet$photo() != null ? "PhotoPreview" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{video:");
        stringBuilder.append(realmGet$video() != null ? "Video" : "null");
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
        PreviewRealmProxy aPreview = (PreviewRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPreview.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPreview.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPreview.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
