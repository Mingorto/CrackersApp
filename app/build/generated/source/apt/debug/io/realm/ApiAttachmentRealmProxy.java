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
public class ApiAttachmentRealmProxy extends test.mingorto.crackersapp.model.attachment.ApiAttachment
    implements RealmObjectProxy, ApiAttachmentRealmProxyInterface {

    static final class ApiAttachmentColumnInfo extends ColumnInfo {
        long typeIndex;
        long photoIndex;
        long audioIndex;
        long videoIndex;
        long docIndex;
        long linkIndex;
        long pageIndex;

        ApiAttachmentColumnInfo(SharedRealm realm, Table table) {
            super(7);
            this.typeIndex = addColumnDetails(table, "type", RealmFieldType.STRING);
            this.photoIndex = addColumnDetails(table, "photo", RealmFieldType.OBJECT);
            this.audioIndex = addColumnDetails(table, "audio", RealmFieldType.OBJECT);
            this.videoIndex = addColumnDetails(table, "video", RealmFieldType.OBJECT);
            this.docIndex = addColumnDetails(table, "doc", RealmFieldType.OBJECT);
            this.linkIndex = addColumnDetails(table, "link", RealmFieldType.OBJECT);
            this.pageIndex = addColumnDetails(table, "page", RealmFieldType.OBJECT);
        }

        ApiAttachmentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ApiAttachmentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ApiAttachmentColumnInfo src = (ApiAttachmentColumnInfo) rawSrc;
            final ApiAttachmentColumnInfo dst = (ApiAttachmentColumnInfo) rawDst;
            dst.typeIndex = src.typeIndex;
            dst.photoIndex = src.photoIndex;
            dst.audioIndex = src.audioIndex;
            dst.videoIndex = src.videoIndex;
            dst.docIndex = src.docIndex;
            dst.linkIndex = src.linkIndex;
            dst.pageIndex = src.pageIndex;
        }
    }

    private ApiAttachmentColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.attachment.ApiAttachment> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("type");
        fieldNames.add("photo");
        fieldNames.add("audio");
        fieldNames.add("video");
        fieldNames.add("doc");
        fieldNames.add("link");
        fieldNames.add("page");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ApiAttachmentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ApiAttachmentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.attachment.ApiAttachment>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public test.mingorto.crackersapp.model.attachment.Audio realmGet$audio() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.audioIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.Audio.class, proxyState.getRow$realm().getLink(columnInfo.audioIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$audio(test.mingorto.crackersapp.model.attachment.Audio value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("audio")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.audioIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.audioIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.audioIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.audioIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
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

    @Override
    public test.mingorto.crackersapp.model.attachment.doc.Doc realmGet$doc() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.docIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.doc.Doc.class, proxyState.getRow$realm().getLink(columnInfo.docIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$doc(test.mingorto.crackersapp.model.attachment.doc.Doc value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("doc")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.docIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.docIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.docIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.docIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public test.mingorto.crackersapp.model.attachment.Link realmGet$link() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.linkIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.Link.class, proxyState.getRow$realm().getLink(columnInfo.linkIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$link(test.mingorto.crackersapp.model.attachment.Link value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("link")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.linkIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.linkIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.linkIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.linkIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public test.mingorto.crackersapp.model.attachment.Page realmGet$page() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.pageIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.attachment.Page.class, proxyState.getRow$realm().getLink(columnInfo.pageIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$page(test.mingorto.crackersapp.model.attachment.Page value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("page")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.pageIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.pageIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.pageIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.pageIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ApiAttachment");
        builder.addProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("photo", RealmFieldType.OBJECT, "Photo");
        builder.addLinkedProperty("audio", RealmFieldType.OBJECT, "Audio");
        builder.addLinkedProperty("video", RealmFieldType.OBJECT, "Video");
        builder.addLinkedProperty("doc", RealmFieldType.OBJECT, "Doc");
        builder.addLinkedProperty("link", RealmFieldType.OBJECT, "Link");
        builder.addLinkedProperty("page", RealmFieldType.OBJECT, "Page");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static ApiAttachmentColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_ApiAttachment")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ApiAttachment' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_ApiAttachment");
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

        final ApiAttachmentColumnInfo columnInfo = new ApiAttachmentColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
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
        if (!columnTypes.containsKey("photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Photo' for field 'photo'");
        }
        if (!sharedRealm.hasTable("class_Photo")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Photo' for field 'photo'");
        }
        Table table_1 = sharedRealm.getTable("class_Photo");
        if (!table.getLinkTarget(columnInfo.photoIndex).hasSameSchema(table_1)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'photo': '" + table.getLinkTarget(columnInfo.photoIndex).getName() + "' expected - was '" + table_1.getName() + "'");
        }
        if (!columnTypes.containsKey("audio")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'audio' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("audio") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Audio' for field 'audio'");
        }
        if (!sharedRealm.hasTable("class_Audio")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Audio' for field 'audio'");
        }
        Table table_2 = sharedRealm.getTable("class_Audio");
        if (!table.getLinkTarget(columnInfo.audioIndex).hasSameSchema(table_2)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'audio': '" + table.getLinkTarget(columnInfo.audioIndex).getName() + "' expected - was '" + table_2.getName() + "'");
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
        Table table_3 = sharedRealm.getTable("class_Video");
        if (!table.getLinkTarget(columnInfo.videoIndex).hasSameSchema(table_3)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'video': '" + table.getLinkTarget(columnInfo.videoIndex).getName() + "' expected - was '" + table_3.getName() + "'");
        }
        if (!columnTypes.containsKey("doc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'doc' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("doc") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Doc' for field 'doc'");
        }
        if (!sharedRealm.hasTable("class_Doc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Doc' for field 'doc'");
        }
        Table table_4 = sharedRealm.getTable("class_Doc");
        if (!table.getLinkTarget(columnInfo.docIndex).hasSameSchema(table_4)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'doc': '" + table.getLinkTarget(columnInfo.docIndex).getName() + "' expected - was '" + table_4.getName() + "'");
        }
        if (!columnTypes.containsKey("link")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'link' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("link") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Link' for field 'link'");
        }
        if (!sharedRealm.hasTable("class_Link")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Link' for field 'link'");
        }
        Table table_5 = sharedRealm.getTable("class_Link");
        if (!table.getLinkTarget(columnInfo.linkIndex).hasSameSchema(table_5)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'link': '" + table.getLinkTarget(columnInfo.linkIndex).getName() + "' expected - was '" + table_5.getName() + "'");
        }
        if (!columnTypes.containsKey("page")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'page' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("page") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Page' for field 'page'");
        }
        if (!sharedRealm.hasTable("class_Page")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Page' for field 'page'");
        }
        Table table_6 = sharedRealm.getTable("class_Page");
        if (!table.getLinkTarget(columnInfo.pageIndex).hasSameSchema(table_6)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'page': '" + table.getLinkTarget(columnInfo.pageIndex).getName() + "' expected - was '" + table_6.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_ApiAttachment";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.attachment.ApiAttachment createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(6);
        if (json.has("photo")) {
            excludeFields.add("photo");
        }
        if (json.has("audio")) {
            excludeFields.add("audio");
        }
        if (json.has("video")) {
            excludeFields.add("video");
        }
        if (json.has("doc")) {
            excludeFields.add("doc");
        }
        if (json.has("link")) {
            excludeFields.add("link");
        }
        if (json.has("page")) {
            excludeFields.add("page");
        }
        test.mingorto.crackersapp.model.attachment.ApiAttachment obj = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.ApiAttachment.class, true, excludeFields);
        if (json.has("type")) {
            if (json.isNull("type")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$type(null);
            } else {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$photo(null);
            } else {
                test.mingorto.crackersapp.model.attachment.Photo photoObj = PhotoRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("photo"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$photo(photoObj);
            }
        }
        if (json.has("audio")) {
            if (json.isNull("audio")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$audio(null);
            } else {
                test.mingorto.crackersapp.model.attachment.Audio audioObj = AudioRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("audio"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$audio(audioObj);
            }
        }
        if (json.has("video")) {
            if (json.isNull("video")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$video(null);
            } else {
                test.mingorto.crackersapp.model.attachment.video.Video videoObj = VideoRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("video"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$video(videoObj);
            }
        }
        if (json.has("doc")) {
            if (json.isNull("doc")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$doc(null);
            } else {
                test.mingorto.crackersapp.model.attachment.doc.Doc docObj = DocRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("doc"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$doc(docObj);
            }
        }
        if (json.has("link")) {
            if (json.isNull("link")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$link(null);
            } else {
                test.mingorto.crackersapp.model.attachment.Link linkObj = LinkRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("link"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$link(linkObj);
            }
        }
        if (json.has("page")) {
            if (json.isNull("page")) {
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$page(null);
            } else {
                test.mingorto.crackersapp.model.attachment.Page pageObj = PageRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("page"), update);
                ((ApiAttachmentRealmProxyInterface) obj).realmSet$page(pageObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.attachment.ApiAttachment createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        test.mingorto.crackersapp.model.attachment.ApiAttachment obj = new test.mingorto.crackersapp.model.attachment.ApiAttachment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$type(null);
                } else {
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$type((String) reader.nextString());
                }
            } else if (name.equals("photo")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$photo(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.Photo photoObj = PhotoRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$photo(photoObj);
                }
            } else if (name.equals("audio")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$audio(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.Audio audioObj = AudioRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$audio(audioObj);
                }
            } else if (name.equals("video")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$video(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.video.Video videoObj = VideoRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$video(videoObj);
                }
            } else if (name.equals("doc")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$doc(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.doc.Doc docObj = DocRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$doc(docObj);
                }
            } else if (name.equals("link")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$link(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.Link linkObj = LinkRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$link(linkObj);
                }
            } else if (name.equals("page")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$page(null);
                } else {
                    test.mingorto.crackersapp.model.attachment.Page pageObj = PageRealmProxy.createUsingJsonStream(realm, reader);
                    ((ApiAttachmentRealmProxyInterface) obj).realmSet$page(pageObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static test.mingorto.crackersapp.model.attachment.ApiAttachment copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.ApiAttachment object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.ApiAttachment) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static test.mingorto.crackersapp.model.attachment.ApiAttachment copy(Realm realm, test.mingorto.crackersapp.model.attachment.ApiAttachment newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.attachment.ApiAttachment) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.attachment.ApiAttachment realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.attachment.ApiAttachment.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ApiAttachmentRealmProxyInterface realmObjectSource = (ApiAttachmentRealmProxyInterface) newObject;
        ApiAttachmentRealmProxyInterface realmObjectCopy = (ApiAttachmentRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());

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

        test.mingorto.crackersapp.model.attachment.Audio audioObj = realmObjectSource.realmGet$audio();
        if (audioObj == null) {
            realmObjectCopy.realmSet$audio(null);
        } else {
            test.mingorto.crackersapp.model.attachment.Audio cacheaudio = (test.mingorto.crackersapp.model.attachment.Audio) cache.get(audioObj);
            if (cacheaudio != null) {
                realmObjectCopy.realmSet$audio(cacheaudio);
            } else {
                realmObjectCopy.realmSet$audio(AudioRealmProxy.copyOrUpdate(realm, audioObj, update, cache));
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

        test.mingorto.crackersapp.model.attachment.doc.Doc docObj = realmObjectSource.realmGet$doc();
        if (docObj == null) {
            realmObjectCopy.realmSet$doc(null);
        } else {
            test.mingorto.crackersapp.model.attachment.doc.Doc cachedoc = (test.mingorto.crackersapp.model.attachment.doc.Doc) cache.get(docObj);
            if (cachedoc != null) {
                realmObjectCopy.realmSet$doc(cachedoc);
            } else {
                realmObjectCopy.realmSet$doc(DocRealmProxy.copyOrUpdate(realm, docObj, update, cache));
            }
        }

        test.mingorto.crackersapp.model.attachment.Link linkObj = realmObjectSource.realmGet$link();
        if (linkObj == null) {
            realmObjectCopy.realmSet$link(null);
        } else {
            test.mingorto.crackersapp.model.attachment.Link cachelink = (test.mingorto.crackersapp.model.attachment.Link) cache.get(linkObj);
            if (cachelink != null) {
                realmObjectCopy.realmSet$link(cachelink);
            } else {
                realmObjectCopy.realmSet$link(LinkRealmProxy.copyOrUpdate(realm, linkObj, update, cache));
            }
        }

        test.mingorto.crackersapp.model.attachment.Page pageObj = realmObjectSource.realmGet$page();
        if (pageObj == null) {
            realmObjectCopy.realmSet$page(null);
        } else {
            test.mingorto.crackersapp.model.attachment.Page cachepage = (test.mingorto.crackersapp.model.attachment.Page) cache.get(pageObj);
            if (cachepage != null) {
                realmObjectCopy.realmSet$page(cachepage);
            } else {
                realmObjectCopy.realmSet$page(PageRealmProxy.copyOrUpdate(realm, pageObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.attachment.ApiAttachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long tableNativePtr = table.getNativePtr();
        ApiAttachmentColumnInfo columnInfo = (ApiAttachmentColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$type = ((ApiAttachmentRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }

        test.mingorto.crackersapp.model.attachment.Photo photoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoRealmProxy.insert(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        }

        test.mingorto.crackersapp.model.attachment.Audio audioObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$audio();
        if (audioObj != null) {
            Long cacheaudio = cache.get(audioObj);
            if (cacheaudio == null) {
                cacheaudio = AudioRealmProxy.insert(realm, audioObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.audioIndex, rowIndex, cacheaudio, false);
        }

        test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$video();
        if (videoObj != null) {
            Long cachevideo = cache.get(videoObj);
            if (cachevideo == null) {
                cachevideo = VideoRealmProxy.insert(realm, videoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
        }

        test.mingorto.crackersapp.model.attachment.doc.Doc docObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$doc();
        if (docObj != null) {
            Long cachedoc = cache.get(docObj);
            if (cachedoc == null) {
                cachedoc = DocRealmProxy.insert(realm, docObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.docIndex, rowIndex, cachedoc, false);
        }

        test.mingorto.crackersapp.model.attachment.Link linkObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$link();
        if (linkObj != null) {
            Long cachelink = cache.get(linkObj);
            if (cachelink == null) {
                cachelink = LinkRealmProxy.insert(realm, linkObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.linkIndex, rowIndex, cachelink, false);
        }

        test.mingorto.crackersapp.model.attachment.Page pageObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$page();
        if (pageObj != null) {
            Long cachepage = cache.get(pageObj);
            if (cachepage == null) {
                cachepage = PageRealmProxy.insert(realm, pageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.pageIndex, rowIndex, cachepage, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long tableNativePtr = table.getNativePtr();
        ApiAttachmentColumnInfo columnInfo = (ApiAttachmentColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        test.mingorto.crackersapp.model.attachment.ApiAttachment object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.ApiAttachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$type = ((ApiAttachmentRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }

            test.mingorto.crackersapp.model.attachment.Photo photoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoRealmProxy.insert(realm, photoObj, cache);
                }
                table.setLink(columnInfo.photoIndex, rowIndex, cachephoto, false);
            }

            test.mingorto.crackersapp.model.attachment.Audio audioObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$audio();
            if (audioObj != null) {
                Long cacheaudio = cache.get(audioObj);
                if (cacheaudio == null) {
                    cacheaudio = AudioRealmProxy.insert(realm, audioObj, cache);
                }
                table.setLink(columnInfo.audioIndex, rowIndex, cacheaudio, false);
            }

            test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$video();
            if (videoObj != null) {
                Long cachevideo = cache.get(videoObj);
                if (cachevideo == null) {
                    cachevideo = VideoRealmProxy.insert(realm, videoObj, cache);
                }
                table.setLink(columnInfo.videoIndex, rowIndex, cachevideo, false);
            }

            test.mingorto.crackersapp.model.attachment.doc.Doc docObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$doc();
            if (docObj != null) {
                Long cachedoc = cache.get(docObj);
                if (cachedoc == null) {
                    cachedoc = DocRealmProxy.insert(realm, docObj, cache);
                }
                table.setLink(columnInfo.docIndex, rowIndex, cachedoc, false);
            }

            test.mingorto.crackersapp.model.attachment.Link linkObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$link();
            if (linkObj != null) {
                Long cachelink = cache.get(linkObj);
                if (cachelink == null) {
                    cachelink = LinkRealmProxy.insert(realm, linkObj, cache);
                }
                table.setLink(columnInfo.linkIndex, rowIndex, cachelink, false);
            }

            test.mingorto.crackersapp.model.attachment.Page pageObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$page();
            if (pageObj != null) {
                Long cachepage = cache.get(pageObj);
                if (cachepage == null) {
                    cachepage = PageRealmProxy.insert(realm, pageObj, cache);
                }
                table.setLink(columnInfo.pageIndex, rowIndex, cachepage, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.attachment.ApiAttachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long tableNativePtr = table.getNativePtr();
        ApiAttachmentColumnInfo columnInfo = (ApiAttachmentColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$type = ((ApiAttachmentRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }

        test.mingorto.crackersapp.model.attachment.Photo photoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$photo();
        if (photoObj != null) {
            Long cachephoto = cache.get(photoObj);
            if (cachephoto == null) {
                cachephoto = PhotoRealmProxy.insertOrUpdate(realm, photoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.Audio audioObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$audio();
        if (audioObj != null) {
            Long cacheaudio = cache.get(audioObj);
            if (cacheaudio == null) {
                cacheaudio = AudioRealmProxy.insertOrUpdate(realm, audioObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.audioIndex, rowIndex, cacheaudio, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.audioIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$video();
        if (videoObj != null) {
            Long cachevideo = cache.get(videoObj);
            if (cachevideo == null) {
                cachevideo = VideoRealmProxy.insertOrUpdate(realm, videoObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.videoIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.doc.Doc docObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$doc();
        if (docObj != null) {
            Long cachedoc = cache.get(docObj);
            if (cachedoc == null) {
                cachedoc = DocRealmProxy.insertOrUpdate(realm, docObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.docIndex, rowIndex, cachedoc, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.docIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.Link linkObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$link();
        if (linkObj != null) {
            Long cachelink = cache.get(linkObj);
            if (cachelink == null) {
                cachelink = LinkRealmProxy.insertOrUpdate(realm, linkObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.linkIndex, rowIndex, cachelink, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.linkIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.attachment.Page pageObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$page();
        if (pageObj != null) {
            Long cachepage = cache.get(pageObj);
            if (cachepage == null) {
                cachepage = PageRealmProxy.insertOrUpdate(realm, pageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.pageIndex, rowIndex, cachepage, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.pageIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        long tableNativePtr = table.getNativePtr();
        ApiAttachmentColumnInfo columnInfo = (ApiAttachmentColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        test.mingorto.crackersapp.model.attachment.ApiAttachment object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.attachment.ApiAttachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$type = ((ApiAttachmentRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }

            test.mingorto.crackersapp.model.attachment.Photo photoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$photo();
            if (photoObj != null) {
                Long cachephoto = cache.get(photoObj);
                if (cachephoto == null) {
                    cachephoto = PhotoRealmProxy.insertOrUpdate(realm, photoObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.photoIndex, rowIndex, cachephoto, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.photoIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.Audio audioObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$audio();
            if (audioObj != null) {
                Long cacheaudio = cache.get(audioObj);
                if (cacheaudio == null) {
                    cacheaudio = AudioRealmProxy.insertOrUpdate(realm, audioObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.audioIndex, rowIndex, cacheaudio, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.audioIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.video.Video videoObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$video();
            if (videoObj != null) {
                Long cachevideo = cache.get(videoObj);
                if (cachevideo == null) {
                    cachevideo = VideoRealmProxy.insertOrUpdate(realm, videoObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.videoIndex, rowIndex, cachevideo, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.videoIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.doc.Doc docObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$doc();
            if (docObj != null) {
                Long cachedoc = cache.get(docObj);
                if (cachedoc == null) {
                    cachedoc = DocRealmProxy.insertOrUpdate(realm, docObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.docIndex, rowIndex, cachedoc, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.docIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.Link linkObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$link();
            if (linkObj != null) {
                Long cachelink = cache.get(linkObj);
                if (cachelink == null) {
                    cachelink = LinkRealmProxy.insertOrUpdate(realm, linkObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.linkIndex, rowIndex, cachelink, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.linkIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.attachment.Page pageObj = ((ApiAttachmentRealmProxyInterface) object).realmGet$page();
            if (pageObj != null) {
                Long cachepage = cache.get(pageObj);
                if (cachepage == null) {
                    cachepage = PageRealmProxy.insertOrUpdate(realm, pageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.pageIndex, rowIndex, cachepage, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.pageIndex, rowIndex);
            }
        }
    }

    public static test.mingorto.crackersapp.model.attachment.ApiAttachment createDetachedCopy(test.mingorto.crackersapp.model.attachment.ApiAttachment realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.attachment.ApiAttachment unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.attachment.ApiAttachment();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.attachment.ApiAttachment) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.attachment.ApiAttachment) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ApiAttachmentRealmProxyInterface unmanagedCopy = (ApiAttachmentRealmProxyInterface) unmanagedObject;
        ApiAttachmentRealmProxyInterface realmSource = (ApiAttachmentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());

        // Deep copy of photo
        unmanagedCopy.realmSet$photo(PhotoRealmProxy.createDetachedCopy(realmSource.realmGet$photo(), currentDepth + 1, maxDepth, cache));

        // Deep copy of audio
        unmanagedCopy.realmSet$audio(AudioRealmProxy.createDetachedCopy(realmSource.realmGet$audio(), currentDepth + 1, maxDepth, cache));

        // Deep copy of video
        unmanagedCopy.realmSet$video(VideoRealmProxy.createDetachedCopy(realmSource.realmGet$video(), currentDepth + 1, maxDepth, cache));

        // Deep copy of doc
        unmanagedCopy.realmSet$doc(DocRealmProxy.createDetachedCopy(realmSource.realmGet$doc(), currentDepth + 1, maxDepth, cache));

        // Deep copy of link
        unmanagedCopy.realmSet$link(LinkRealmProxy.createDetachedCopy(realmSource.realmGet$link(), currentDepth + 1, maxDepth, cache));

        // Deep copy of page
        unmanagedCopy.realmSet$page(PageRealmProxy.createDetachedCopy(realmSource.realmGet$page(), currentDepth + 1, maxDepth, cache));
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ApiAttachment = proxy[");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo:");
        stringBuilder.append(realmGet$photo() != null ? "Photo" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{audio:");
        stringBuilder.append(realmGet$audio() != null ? "Audio" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{video:");
        stringBuilder.append(realmGet$video() != null ? "Video" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{doc:");
        stringBuilder.append(realmGet$doc() != null ? "Doc" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{link:");
        stringBuilder.append(realmGet$link() != null ? "Link" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{page:");
        stringBuilder.append(realmGet$page() != null ? "Page" : "null");
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
        ApiAttachmentRealmProxy aApiAttachment = (ApiAttachmentRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aApiAttachment.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aApiAttachment.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aApiAttachment.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
