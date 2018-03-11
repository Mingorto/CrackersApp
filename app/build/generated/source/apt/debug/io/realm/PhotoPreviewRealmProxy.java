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
public class PhotoPreviewRealmProxy extends test.mingorto.crackersapp.model.attachment.doc.PhotoPreview
    implements RealmObjectProxy, PhotoPreviewRealmProxyInterface {

    static final class PhotoPreviewColumnInfo extends ColumnInfo {
        long sizesIndex;

        PhotoPreviewColumnInfo(SharedRealm realm, Table table) {
            super(1);
            this.sizesIndex = addColumnDetails(table, "sizes", RealmFieldType.LIST);
        }

        PhotoPreviewColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PhotoPreviewColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PhotoPreviewColumnInfo src = (PhotoPreviewColumnInfo) rawSrc;
            final PhotoPreviewColumnInfo dst = (PhotoPreviewColumnInfo) rawDst;
            dst.sizesIndex = src.sizesIndex;
        }
    }

    private PhotoPreviewColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.doc.PhotoPreview> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("sizes");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PhotoPreviewRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PhotoPreviewColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.doc.PhotoPreview>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> realmGet$sizes() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (sizesRealmList != null) {
            return sizesRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.sizesIndex);
            sizesRealmList = new RealmList<test.mingorto.crackersapp.model.attachment.doc.Size>(test.mingorto.crackersapp.model.attachment.doc.Size.class, linkView, proxyState.getRealm$realm());
            return sizesRealmList;
        }
    }

    @Override
    public void realmSet$sizes(RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("sizes")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> original = value;
                value = new RealmList<test.mingorto.crackersapp.model.attachment.doc.Size>();
                for (test.mingorto.crackersapp.model.attachment.doc.Size item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.sizesIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!(RealmObject.isManaged(linkedObject) && RealmObject.isValid(linkedObject))) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy) linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PhotoPreview");
        builder.addLinkedProperty("sizes", RealmFieldType.LIST, "Size");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static PhotoPreviewColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_PhotoPreview")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'PhotoPreview' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_PhotoPreview");
        final long columnCount = table.getColumnCount();
        if (columnCount != 1) {
            if (columnCount < 1) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 1 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 1 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 1 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final PhotoPreviewColumnInfo columnInfo = new PhotoPreviewColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("sizes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'sizes'");
        }
        if (columnTypes.get("sizes") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Size' for field 'sizes'");
        }
        if (!sharedRealm.hasTable("class_Size")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Size' for field 'sizes'");
        }
        Table table_0 = sharedRealm.getTable("class_Size");
        if (!table.getLinkTarget(columnInfo.sizesIndex).hasSameSchema(table_0)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'sizes': '" + table.getLinkTarget(columnInfo.sizesIndex).getName() + "' expected - was '" + table_0.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_PhotoPreview";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.doc.PhotoPreview createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("sizes")) {
            excludeFields.add("sizes");
        }
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class, true, excludeFields);
        if (json.has("sizes")) {
            if (json.isNull("sizes")) {
                ((PhotoPreviewRealmProxyInterface) obj).realmSet$sizes(null);
            } else {
                ((PhotoPreviewRealmProxyInterface) obj).realmGet$sizes().clear();
                JSONArray array = json.getJSONArray("sizes");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.attachment.doc.Size item = SizeRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((PhotoPreviewRealmProxyInterface) obj).realmGet$sizes().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.doc.PhotoPreview createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview obj = new test.mingorto.crackersapp.model.attachment.doc.PhotoPreview();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("sizes")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PhotoPreviewRealmProxyInterface) obj).realmSet$sizes(null);
                } else {
                    ((PhotoPreviewRealmProxyInterface) obj).realmSet$sizes(new RealmList<test.mingorto.crackersapp.model.attachment.doc.Size>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.attachment.doc.Size item = SizeRealmProxy.createUsingJsonStream(realm, reader);
                        ((PhotoPreviewRealmProxyInterface) obj).realmGet$sizes().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.doc.PhotoPreview copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.PhotoPreview object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.doc.PhotoPreview copy(Realm realm, test.mingorto.crackersapp.model.attachment.doc.PhotoPreview newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        PhotoPreviewRealmProxyInterface realmObjectSource = (PhotoPreviewRealmProxyInterface) newObject;
        PhotoPreviewRealmProxyInterface realmObjectCopy = (PhotoPreviewRealmProxyInterface) realmObject;


        RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesList = realmObjectSource.realmGet$sizes();
        if (sizesList != null) {
            RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesRealmList = realmObjectCopy.realmGet$sizes();
            for (int i = 0; i < sizesList.size(); i++) {
                test.mingorto.crackersapp.model.attachment.doc.Size sizesItem = sizesList.get(i);
                test.mingorto.crackersapp.model.attachment.doc.Size cachesizes = (test.mingorto.crackersapp.model.attachment.doc.Size) cache.get(sizesItem);
                if (cachesizes != null) {
                    sizesRealmList.add(cachesizes);
                } else {
                    sizesRealmList.add(SizeRealmProxy.copyOrUpdate(realm, sizesItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.doc.PhotoPreview object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long tableNativePtr = table.getNativePtr();
        PhotoPreviewColumnInfo columnInfo = (PhotoPreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesList = ((PhotoPreviewRealmProxyInterface) object).realmGet$sizes();
        if (sizesList != null) {
            long sizesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.sizesIndex, rowIndex);
            for (test.mingorto.crackersapp.model.attachment.doc.Size sizesItem : sizesList) {
                Long cacheItemIndexsizes = cache.get(sizesItem);
                if (cacheItemIndexsizes == null) {
                    cacheItemIndexsizes = SizeRealmProxy.insert(realm, sizesItem, cache);
                }
                LinkView.nativeAdd(sizesNativeLinkViewPtr, cacheItemIndexsizes);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long tableNativePtr = table.getNativePtr();
        PhotoPreviewColumnInfo columnInfo = (PhotoPreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesList = ((PhotoPreviewRealmProxyInterface) object).realmGet$sizes();
            if (sizesList != null) {
                long sizesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.sizesIndex, rowIndex);
                for (test.mingorto.crackersapp.model.attachment.doc.Size sizesItem : sizesList) {
                    Long cacheItemIndexsizes = cache.get(sizesItem);
                    if (cacheItemIndexsizes == null) {
                        cacheItemIndexsizes = SizeRealmProxy.insert(realm, sizesItem, cache);
                    }
                    LinkView.nativeAdd(sizesNativeLinkViewPtr, cacheItemIndexsizes);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.PhotoPreview object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long tableNativePtr = table.getNativePtr();
        PhotoPreviewColumnInfo columnInfo = (PhotoPreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        long sizesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.sizesIndex, rowIndex);
        LinkView.nativeClear(sizesNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesList = ((PhotoPreviewRealmProxyInterface) object).realmGet$sizes();
        if (sizesList != null) {
            for (test.mingorto.crackersapp.model.attachment.doc.Size sizesItem : sizesList) {
                Long cacheItemIndexsizes = cache.get(sizesItem);
                if (cacheItemIndexsizes == null) {
                    cacheItemIndexsizes = SizeRealmProxy.insertOrUpdate(realm, sizesItem, cache);
                }
                LinkView.nativeAdd(sizesNativeLinkViewPtr, cacheItemIndexsizes);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        long tableNativePtr = table.getNativePtr();
        PhotoPreviewColumnInfo columnInfo = (PhotoPreviewColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            long sizesNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.sizesIndex, rowIndex);
            LinkView.nativeClear(sizesNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> sizesList = ((PhotoPreviewRealmProxyInterface) object).realmGet$sizes();
            if (sizesList != null) {
                for (test.mingorto.crackersapp.model.attachment.doc.Size sizesItem : sizesList) {
                    Long cacheItemIndexsizes = cache.get(sizesItem);
                    if (cacheItemIndexsizes == null) {
                        cacheItemIndexsizes = SizeRealmProxy.insertOrUpdate(realm, sizesItem, cache);
                    }
                    LinkView.nativeAdd(sizesNativeLinkViewPtr, cacheItemIndexsizes);
                }
            }

        }
    }

    public static test.mingorto.crackersapp.model.attachment.doc.PhotoPreview createDetachedCopy(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.doc.PhotoPreview unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.doc.PhotoPreview();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        PhotoPreviewRealmProxyInterface unmanagedCopy = (PhotoPreviewRealmProxyInterface) unmanagedObject;
        PhotoPreviewRealmProxyInterface realmSource = (PhotoPreviewRealmProxyInterface) realmObject;

        // Deep copy of sizes
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$sizes(null);
        } else {
            RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> managedsizesList = realmSource.realmGet$sizes();
            RealmList<test.mingorto.crackersapp.model.attachment.doc.Size> unmanagedsizesList = new RealmList<test.mingorto.crackersapp.model.attachment.doc.Size>();
            unmanagedCopy.realmSet$sizes(unmanagedsizesList);
            int nextDepth = currentDepth + 1;
            int size = managedsizesList.size();
            for (int i = 0; i < size; i++) {
                test.mingorto.crackersapp.model.attachment.doc.Size item = SizeRealmProxy.createDetachedCopy(managedsizesList.get(i), nextDepth, maxDepth, cache);
                unmanagedsizesList.add(item);
            }
        }
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PhotoPreview = proxy[");
        stringBuilder.append("{sizes:");
        stringBuilder.append("RealmList<Size>[").append(realmGet$sizes().size()).append("]");
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
        PhotoPreviewRealmProxy aPhotoPreview = (PhotoPreviewRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPhotoPreview.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPhotoPreview.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPhotoPreview.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
