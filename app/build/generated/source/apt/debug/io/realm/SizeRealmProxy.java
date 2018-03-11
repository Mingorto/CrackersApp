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
public class SizeRealmProxy extends test.mingorto.crackersapp.model.attachment.doc.Size
    implements RealmObjectProxy, SizeRealmProxyInterface {

    static final class SizeColumnInfo extends ColumnInfo {
        long srcIndex;
        long widthIndex;
        long heightIndex;
        long typeIndex;

        SizeColumnInfo(SharedRealm realm, Table table) {
            super(4);
            this.srcIndex = addColumnDetails(table, "src", RealmFieldType.STRING);
            this.widthIndex = addColumnDetails(table, "width", RealmFieldType.INTEGER);
            this.heightIndex = addColumnDetails(table, "height", RealmFieldType.INTEGER);
            this.typeIndex = addColumnDetails(table, "type", RealmFieldType.STRING);
        }

        SizeColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SizeColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SizeColumnInfo src = (SizeColumnInfo) rawSrc;
            final SizeColumnInfo dst = (SizeColumnInfo) rawDst;
            dst.srcIndex = src.srcIndex;
            dst.widthIndex = src.widthIndex;
            dst.heightIndex = src.heightIndex;
            dst.typeIndex = src.typeIndex;
        }
    }

    private SizeColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.doc.Size> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("src");
        fieldNames.add("width");
        fieldNames.add("height");
        fieldNames.add("type");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    SizeRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SizeColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.doc.Size>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$src() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.srcIndex);
    }

    @Override
    public void realmSet$src(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.srcIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.srcIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.srcIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.srcIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$width() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.widthIndex);
    }

    @Override
    public void realmSet$width(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.widthIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.widthIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$height() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.heightIndex);
    }

    @Override
    public void realmSet$height(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.heightIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.heightIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Size");
        builder.addProperty("src", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("width", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("height", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static SizeColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Size")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Size' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Size");
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

        final SizeColumnInfo columnInfo = new SizeColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("src")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'src' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("src") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'src' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.srcIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'src' is required. Either set @Required to field 'src' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("width")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'width' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("width") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'width' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.widthIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'width' does support null values in the existing Realm file. Use corresponding boxed type for field 'width' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("height")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'height' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("height") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'height' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.heightIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'height' does support null values in the existing Realm file. Use corresponding boxed type for field 'height' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("type")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'type' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("type") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'type' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.typeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'type' is required. Either set @Required to field 'type' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Size";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.doc.Size createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        test.mingorto.crackersapp.model.attachment.doc.Size obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Size.class, true, excludeFields);
        if (json.has("src")) {
            if (json.isNull("src")) {
                ((SizeRealmProxyInterface) obj).realmSet$src(null);
            } else {
                ((SizeRealmProxyInterface) obj).realmSet$src((String) json.getString("src"));
            }
        }
        if (json.has("width")) {
            if (json.isNull("width")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'width' to null.");
            } else {
                ((SizeRealmProxyInterface) obj).realmSet$width((int) json.getInt("width"));
            }
        }
        if (json.has("height")) {
            if (json.isNull("height")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'height' to null.");
            } else {
                ((SizeRealmProxyInterface) obj).realmSet$height((int) json.getInt("height"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                ((SizeRealmProxyInterface) obj).realmSet$type(null);
            } else {
                ((SizeRealmProxyInterface) obj).realmSet$type((String) json.getString("type"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.doc.Size createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.doc.Size obj = new test.mingorto.crackersapp.model.attachment.doc.Size();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("src")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((SizeRealmProxyInterface) obj).realmSet$src(null);
                } else {
                    ((SizeRealmProxyInterface) obj).realmSet$src((String) reader.nextString());
                }
            } else if (name.equals("width")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'width' to null.");
                } else {
                    ((SizeRealmProxyInterface) obj).realmSet$width((int) reader.nextInt());
                }
            } else if (name.equals("height")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'height' to null.");
                } else {
                    ((SizeRealmProxyInterface) obj).realmSet$height((int) reader.nextInt());
                }
            } else if (name.equals("type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((SizeRealmProxyInterface) obj).realmSet$type(null);
                } else {
                    ((SizeRealmProxyInterface) obj).realmSet$type((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Size copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Size object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Size) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Size copy(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Size newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.doc.Size) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.doc.Size realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.doc.Size.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        SizeRealmProxyInterface realmObjectSource = (SizeRealmProxyInterface) newObject;
        SizeRealmProxyInterface realmObjectCopy = (SizeRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$src(realmObjectSource.realmGet$src());
        realmObjectCopy.realmSet$width(realmObjectSource.realmGet$width());
        realmObjectCopy.realmSet$height(realmObjectSource.realmGet$height());
        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Size object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long tableNativePtr = table.getNativePtr();
        SizeColumnInfo columnInfo = (SizeColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$src = ((SizeRealmProxyInterface) object).realmGet$src();
        if (realmGet$src != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.srcIndex, rowIndex, realmGet$src, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$width(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$height(), false);
        String realmGet$type = ((SizeRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long tableNativePtr = table.getNativePtr();
        SizeColumnInfo columnInfo = (SizeColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        test.mingorto.crackersapp.model.attachment.doc.Size object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Size) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$src = ((SizeRealmProxyInterface) object).realmGet$src();
            if (realmGet$src != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.srcIndex, rowIndex, realmGet$src, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$width(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$height(), false);
            String realmGet$type = ((SizeRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.doc.Size object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long tableNativePtr = table.getNativePtr();
        SizeColumnInfo columnInfo = (SizeColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$src = ((SizeRealmProxyInterface) object).realmGet$src();
        if (realmGet$src != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.srcIndex, rowIndex, realmGet$src, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.srcIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$width(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$height(), false);
        String realmGet$type = ((SizeRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        long tableNativePtr = table.getNativePtr();
        SizeColumnInfo columnInfo = (SizeColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        test.mingorto.crackersapp.model.attachment.doc.Size object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.doc.Size) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$src = ((SizeRealmProxyInterface) object).realmGet$src();
            if (realmGet$src != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.srcIndex, rowIndex, realmGet$src, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.srcIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.widthIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$width(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.heightIndex, rowIndex, ((SizeRealmProxyInterface) object).realmGet$height(), false);
            String realmGet$type = ((SizeRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.doc.Size createDetachedCopy(test.mingorto.crackersapp.model.attachment.doc.Size realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.doc.Size unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.doc.Size();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.doc.Size) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.doc.Size) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        SizeRealmProxyInterface unmanagedCopy = (SizeRealmProxyInterface) unmanagedObject;
        SizeRealmProxyInterface realmSource = (SizeRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$src(realmSource.realmGet$src());
        unmanagedCopy.realmSet$width(realmSource.realmGet$width());
        unmanagedCopy.realmSet$height(realmSource.realmGet$height());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Size = proxy[");
        stringBuilder.append("{src:");
        stringBuilder.append(realmGet$src() != null ? realmGet$src() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{width:");
        stringBuilder.append(realmGet$width());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{height:");
        stringBuilder.append(realmGet$height());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
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
        SizeRealmProxy aSize = (SizeRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSize.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSize.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSize.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
