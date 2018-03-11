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
public class CommentItemRealmProxy extends test.mingorto.crackersapp.model.CommentItem
    implements RealmObjectProxy, CommentItemRealmProxyInterface {

    static final class CommentItemColumnInfo extends ColumnInfo {
        long idIndex;
        long senderIdIndex;
        long placeIndex;
        long senderNameIndex;
        long senderPhotoIndex;
        long dateIndex;
        long textIndex;
        long attachmentsIndex;
        long attachmentsStringIndex;
        long likesIndex;
        long repostsIndex;
        long isFromTopicIndex;

        CommentItemColumnInfo(SharedRealm realm, Table table) {
            super(12);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.senderIdIndex = addColumnDetails(table, "senderId", RealmFieldType.INTEGER);
            this.placeIndex = addColumnDetails(table, "place", RealmFieldType.OBJECT);
            this.senderNameIndex = addColumnDetails(table, "senderName", RealmFieldType.STRING);
            this.senderPhotoIndex = addColumnDetails(table, "senderPhoto", RealmFieldType.STRING);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.textIndex = addColumnDetails(table, "text", RealmFieldType.STRING);
            this.attachmentsIndex = addColumnDetails(table, "attachments", RealmFieldType.LIST);
            this.attachmentsStringIndex = addColumnDetails(table, "attachmentsString", RealmFieldType.STRING);
            this.likesIndex = addColumnDetails(table, "likes", RealmFieldType.OBJECT);
            this.repostsIndex = addColumnDetails(table, "reposts", RealmFieldType.OBJECT);
            this.isFromTopicIndex = addColumnDetails(table, "isFromTopic", RealmFieldType.BOOLEAN);
        }

        CommentItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CommentItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CommentItemColumnInfo src = (CommentItemColumnInfo) rawSrc;
            final CommentItemColumnInfo dst = (CommentItemColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.senderIdIndex = src.senderIdIndex;
            dst.placeIndex = src.placeIndex;
            dst.senderNameIndex = src.senderNameIndex;
            dst.senderPhotoIndex = src.senderPhotoIndex;
            dst.dateIndex = src.dateIndex;
            dst.textIndex = src.textIndex;
            dst.attachmentsIndex = src.attachmentsIndex;
            dst.attachmentsStringIndex = src.attachmentsStringIndex;
            dst.likesIndex = src.likesIndex;
            dst.repostsIndex = src.repostsIndex;
            dst.isFromTopicIndex = src.isFromTopicIndex;
        }
    }

    private CommentItemColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.CommentItem> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("senderId");
        fieldNames.add("place");
        fieldNames.add("senderName");
        fieldNames.add("senderPhoto");
        fieldNames.add("date");
        fieldNames.add("text");
        fieldNames.add("attachments");
        fieldNames.add("attachmentsString");
        fieldNames.add("likes");
        fieldNames.add("reposts");
        fieldNames.add("isFromTopic");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CommentItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CommentItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.CommentItem>(this);
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
    public int realmGet$senderId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.senderIdIndex);
    }

    @Override
    public void realmSet$senderId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.senderIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.senderIdIndex, value);
    }

    @Override
    public test.mingorto.crackersapp.model.Place realmGet$place() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.placeIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.Place.class, proxyState.getRow$realm().getLink(columnInfo.placeIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$place(test.mingorto.crackersapp.model.Place value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("place")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.placeIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.placeIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.placeIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.placeIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderNameIndex);
    }

    @Override
    public void realmSet$senderName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderPhoto() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderPhotoIndex);
    }

    @Override
    public void realmSet$senderPhoto(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderPhotoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderPhotoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderPhotoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderPhotoIndex, value);
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
    public String realmGet$text() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textIndex);
    }

    @Override
    public void realmSet$text(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.textIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.textIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.textIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.textIndex, value);
    }

    @Override
    public RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> realmGet$attachments() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (attachmentsRealmList != null) {
            return attachmentsRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.attachmentsIndex);
            attachmentsRealmList = new RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment>(test.mingorto.crackersapp.model.attachment.ApiAttachment.class, linkView, proxyState.getRealm$realm());
            return attachmentsRealmList;
        }
    }

    @Override
    public void realmSet$attachments(RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachments")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> original = value;
                value = new RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment>();
                for (test.mingorto.crackersapp.model.attachment.ApiAttachment item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.attachmentsIndex);
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

    @Override
    @SuppressWarnings("cast")
    public String realmGet$attachmentsString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.attachmentsStringIndex);
    }

    @Override
    public void realmSet$attachmentsString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.attachmentsStringIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.attachmentsStringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.attachmentsStringIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.attachmentsStringIndex, value);
    }

    @Override
    public test.mingorto.crackersapp.model.countable.Likes realmGet$likes() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.likesIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.countable.Likes.class, proxyState.getRow$realm().getLink(columnInfo.likesIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$likes(test.mingorto.crackersapp.model.countable.Likes value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("likes")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.likesIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.likesIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.likesIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.likesIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public test.mingorto.crackersapp.model.countable.Reposts realmGet$reposts() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.repostsIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.countable.Reposts.class, proxyState.getRow$realm().getLink(columnInfo.repostsIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$reposts(test.mingorto.crackersapp.model.countable.Reposts value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("reposts")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.repostsIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.repostsIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.repostsIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.repostsIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isFromTopic() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isFromTopicIndex);
    }

    @Override
    public void realmSet$isFromTopic(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isFromTopicIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isFromTopicIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CommentItem");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addProperty("senderId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addLinkedProperty("place", RealmFieldType.OBJECT, "Place");
        builder.addProperty("senderName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("senderPhoto", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addProperty("text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("attachments", RealmFieldType.LIST, "ApiAttachment");
        builder.addProperty("attachmentsString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("likes", RealmFieldType.OBJECT, "Likes");
        builder.addLinkedProperty("reposts", RealmFieldType.OBJECT, "Reposts");
        builder.addProperty("isFromTopic", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static CommentItemColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_CommentItem")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'CommentItem' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_CommentItem");
        final long columnCount = table.getColumnCount();
        if (columnCount != 12) {
            if (columnCount < 12) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 12 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 12 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 12 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final CommentItemColumnInfo columnInfo = new CommentItemColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("senderId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'senderId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("senderId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'senderId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.senderIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'senderId' does support null values in the existing Realm file. Use corresponding boxed type for field 'senderId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("place")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'place' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("place") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Place' for field 'place'");
        }
        if (!sharedRealm.hasTable("class_Place")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Place' for field 'place'");
        }
        Table table_2 = sharedRealm.getTable("class_Place");
        if (!table.getLinkTarget(columnInfo.placeIndex).hasSameSchema(table_2)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'place': '" + table.getLinkTarget(columnInfo.placeIndex).getName() + "' expected - was '" + table_2.getName() + "'");
        }
        if (!columnTypes.containsKey("senderName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'senderName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("senderName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'senderName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.senderNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'senderName' is required. Either set @Required to field 'senderName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("senderPhoto")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'senderPhoto' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("senderPhoto") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'senderPhoto' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.senderPhotoIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'senderPhoto' is required. Either set @Required to field 'senderPhoto' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("text")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'text' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("text") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'text' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.textIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'text' is required. Either set @Required to field 'text' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("attachments")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'attachments'");
        }
        if (columnTypes.get("attachments") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'ApiAttachment' for field 'attachments'");
        }
        if (!sharedRealm.hasTable("class_ApiAttachment")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_ApiAttachment' for field 'attachments'");
        }
        Table table_7 = sharedRealm.getTable("class_ApiAttachment");
        if (!table.getLinkTarget(columnInfo.attachmentsIndex).hasSameSchema(table_7)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'attachments': '" + table.getLinkTarget(columnInfo.attachmentsIndex).getName() + "' expected - was '" + table_7.getName() + "'");
        }
        if (!columnTypes.containsKey("attachmentsString")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'attachmentsString' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("attachmentsString") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'attachmentsString' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.attachmentsStringIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'attachmentsString' is required. Either set @Required to field 'attachmentsString' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("likes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'likes' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("likes") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Likes' for field 'likes'");
        }
        if (!sharedRealm.hasTable("class_Likes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Likes' for field 'likes'");
        }
        Table table_9 = sharedRealm.getTable("class_Likes");
        if (!table.getLinkTarget(columnInfo.likesIndex).hasSameSchema(table_9)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'likes': '" + table.getLinkTarget(columnInfo.likesIndex).getName() + "' expected - was '" + table_9.getName() + "'");
        }
        if (!columnTypes.containsKey("reposts")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'reposts' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("reposts") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Reposts' for field 'reposts'");
        }
        if (!sharedRealm.hasTable("class_Reposts")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Reposts' for field 'reposts'");
        }
        Table table_10 = sharedRealm.getTable("class_Reposts");
        if (!table.getLinkTarget(columnInfo.repostsIndex).hasSameSchema(table_10)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'reposts': '" + table.getLinkTarget(columnInfo.repostsIndex).getName() + "' expected - was '" + table_10.getName() + "'");
        }
        if (!columnTypes.containsKey("isFromTopic")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isFromTopic' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isFromTopic") != RealmFieldType.BOOLEAN) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'boolean' for field 'isFromTopic' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.isFromTopicIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'isFromTopic' does support null values in the existing Realm file. Use corresponding boxed type for field 'isFromTopic' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_CommentItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.CommentItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(4);
        test.mingorto.crackersapp.model.CommentItem obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class), false, Collections.<String> emptyList());
                    obj = new io.realm.CommentItemRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("place")) {
                excludeFields.add("place");
            }
            if (json.has("attachments")) {
                excludeFields.add("attachments");
            }
            if (json.has("likes")) {
                excludeFields.add("likes");
            }
            if (json.has("reposts")) {
                excludeFields.add("reposts");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.CommentItemRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.CommentItem.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.CommentItemRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.CommentItem.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("senderId")) {
            if (json.isNull("senderId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'senderId' to null.");
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$senderId((int) json.getInt("senderId"));
            }
        }
        if (json.has("place")) {
            if (json.isNull("place")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$place(null);
            } else {
                test.mingorto.crackersapp.model.Place placeObj = PlaceRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("place"), update);
                ((CommentItemRealmProxyInterface) obj).realmSet$place(placeObj);
            }
        }
        if (json.has("senderName")) {
            if (json.isNull("senderName")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$senderName(null);
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$senderName((String) json.getString("senderName"));
            }
        }
        if (json.has("senderPhoto")) {
            if (json.isNull("senderPhoto")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$senderPhoto(null);
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$senderPhoto((String) json.getString("senderPhoto"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("text")) {
            if (json.isNull("text")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$text(null);
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$text((String) json.getString("text"));
            }
        }
        if (json.has("attachments")) {
            if (json.isNull("attachments")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$attachments(null);
            } else {
                ((CommentItemRealmProxyInterface) obj).realmGet$attachments().clear();
                JSONArray array = json.getJSONArray("attachments");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.attachment.ApiAttachment item = ApiAttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((CommentItemRealmProxyInterface) obj).realmGet$attachments().add(item);
                }
            }
        }
        if (json.has("attachmentsString")) {
            if (json.isNull("attachmentsString")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$attachmentsString(null);
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$attachmentsString((String) json.getString("attachmentsString"));
            }
        }
        if (json.has("likes")) {
            if (json.isNull("likes")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$likes(null);
            } else {
                test.mingorto.crackersapp.model.countable.Likes likesObj = LikesRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("likes"), update);
                ((CommentItemRealmProxyInterface) obj).realmSet$likes(likesObj);
            }
        }
        if (json.has("reposts")) {
            if (json.isNull("reposts")) {
                ((CommentItemRealmProxyInterface) obj).realmSet$reposts(null);
            } else {
                test.mingorto.crackersapp.model.countable.Reposts repostsObj = RepostsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("reposts"), update);
                ((CommentItemRealmProxyInterface) obj).realmSet$reposts(repostsObj);
            }
        }
        if (json.has("isFromTopic")) {
            if (json.isNull("isFromTopic")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isFromTopic' to null.");
            } else {
                ((CommentItemRealmProxyInterface) obj).realmSet$isFromTopic((boolean) json.getBoolean("isFromTopic"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.CommentItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.CommentItem obj = new test.mingorto.crackersapp.model.CommentItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("senderId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'senderId' to null.");
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$senderId((int) reader.nextInt());
                }
            } else if (name.equals("place")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$place(null);
                } else {
                    test.mingorto.crackersapp.model.Place placeObj = PlaceRealmProxy.createUsingJsonStream(realm, reader);
                    ((CommentItemRealmProxyInterface) obj).realmSet$place(placeObj);
                }
            } else if (name.equals("senderName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$senderName(null);
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$senderName((String) reader.nextString());
                }
            } else if (name.equals("senderPhoto")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$senderPhoto(null);
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$senderPhoto((String) reader.nextString());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("text")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$text(null);
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$text((String) reader.nextString());
                }
            } else if (name.equals("attachments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$attachments(null);
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$attachments(new RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.attachment.ApiAttachment item = ApiAttachmentRealmProxy.createUsingJsonStream(realm, reader);
                        ((CommentItemRealmProxyInterface) obj).realmGet$attachments().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("attachmentsString")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$attachmentsString(null);
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$attachmentsString((String) reader.nextString());
                }
            } else if (name.equals("likes")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$likes(null);
                } else {
                    test.mingorto.crackersapp.model.countable.Likes likesObj = LikesRealmProxy.createUsingJsonStream(realm, reader);
                    ((CommentItemRealmProxyInterface) obj).realmSet$likes(likesObj);
                }
            } else if (name.equals("reposts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CommentItemRealmProxyInterface) obj).realmSet$reposts(null);
                } else {
                    test.mingorto.crackersapp.model.countable.Reposts repostsObj = RepostsRealmProxy.createUsingJsonStream(realm, reader);
                    ((CommentItemRealmProxyInterface) obj).realmSet$reposts(repostsObj);
                }
            } else if (name.equals("isFromTopic")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isFromTopic' to null.");
                } else {
                    ((CommentItemRealmProxyInterface) obj).realmSet$isFromTopic((boolean) reader.nextBoolean());
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

    public static test.mingorto.crackersapp.model.CommentItem copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.CommentItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.CommentItem) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.CommentItem realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = table.findFirstLong(pkColumnIndex, ((CommentItemRealmProxyInterface) object).realmGet$id());
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.CommentItemRealmProxy();
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

    public static test.mingorto.crackersapp.model.CommentItem copy(Realm realm, test.mingorto.crackersapp.model.CommentItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.CommentItem) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.CommentItem realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.CommentItem.class, ((CommentItemRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        CommentItemRealmProxyInterface realmObjectSource = (CommentItemRealmProxyInterface) newObject;
        CommentItemRealmProxyInterface realmObjectCopy = (CommentItemRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$senderId(realmObjectSource.realmGet$senderId());

        test.mingorto.crackersapp.model.Place placeObj = realmObjectSource.realmGet$place();
        if (placeObj == null) {
            realmObjectCopy.realmSet$place(null);
        } else {
            test.mingorto.crackersapp.model.Place cacheplace = (test.mingorto.crackersapp.model.Place) cache.get(placeObj);
            if (cacheplace != null) {
                realmObjectCopy.realmSet$place(cacheplace);
            } else {
                realmObjectCopy.realmSet$place(PlaceRealmProxy.copyOrUpdate(realm, placeObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectCopy.realmSet$senderPhoto(realmObjectSource.realmGet$senderPhoto());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$text(realmObjectSource.realmGet$text());

        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = realmObjectSource.realmGet$attachments();
        if (attachmentsList != null) {
            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsRealmList = realmObjectCopy.realmGet$attachments();
            for (int i = 0; i < attachmentsList.size(); i++) {
                test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem = attachmentsList.get(i);
                test.mingorto.crackersapp.model.attachment.ApiAttachment cacheattachments = (test.mingorto.crackersapp.model.attachment.ApiAttachment) cache.get(attachmentsItem);
                if (cacheattachments != null) {
                    attachmentsRealmList.add(cacheattachments);
                } else {
                    attachmentsRealmList.add(ApiAttachmentRealmProxy.copyOrUpdate(realm, attachmentsItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$attachmentsString(realmObjectSource.realmGet$attachmentsString());

        test.mingorto.crackersapp.model.countable.Likes likesObj = realmObjectSource.realmGet$likes();
        if (likesObj == null) {
            realmObjectCopy.realmSet$likes(null);
        } else {
            test.mingorto.crackersapp.model.countable.Likes cachelikes = (test.mingorto.crackersapp.model.countable.Likes) cache.get(likesObj);
            if (cachelikes != null) {
                realmObjectCopy.realmSet$likes(cachelikes);
            } else {
                realmObjectCopy.realmSet$likes(LikesRealmProxy.copyOrUpdate(realm, likesObj, update, cache));
            }
        }

        test.mingorto.crackersapp.model.countable.Reposts repostsObj = realmObjectSource.realmGet$reposts();
        if (repostsObj == null) {
            realmObjectCopy.realmSet$reposts(null);
        } else {
            test.mingorto.crackersapp.model.countable.Reposts cachereposts = (test.mingorto.crackersapp.model.countable.Reposts) cache.get(repostsObj);
            if (cachereposts != null) {
                realmObjectCopy.realmSet$reposts(cachereposts);
            } else {
                realmObjectCopy.realmSet$reposts(RepostsRealmProxy.copyOrUpdate(realm, repostsObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$isFromTopic(realmObjectSource.realmGet$isFromTopic());
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.CommentItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
        long tableNativePtr = table.getNativePtr();
        CommentItemColumnInfo columnInfo = (CommentItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((CommentItemRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((CommentItemRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.senderIdIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$senderId(), false);

        test.mingorto.crackersapp.model.Place placeObj = ((CommentItemRealmProxyInterface) object).realmGet$place();
        if (placeObj != null) {
            Long cacheplace = cache.get(placeObj);
            if (cacheplace == null) {
                cacheplace = PlaceRealmProxy.insert(realm, placeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.placeIndex, rowIndex, cacheplace, false);
        }
        String realmGet$senderName = ((CommentItemRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        }
        String realmGet$senderPhoto = ((CommentItemRealmProxyInterface) object).realmGet$senderPhoto();
        if (realmGet$senderPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$date(), false);
        String realmGet$text = ((CommentItemRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        }

        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((CommentItemRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
            for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = ApiAttachmentRealmProxy.insert(realm, attachmentsItem, cache);
                }
                LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
            }
        }

        String realmGet$attachmentsString = ((CommentItemRealmProxyInterface) object).realmGet$attachmentsString();
        if (realmGet$attachmentsString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
        }

        test.mingorto.crackersapp.model.countable.Likes likesObj = ((CommentItemRealmProxyInterface) object).realmGet$likes();
        if (likesObj != null) {
            Long cachelikes = cache.get(likesObj);
            if (cachelikes == null) {
                cachelikes = LikesRealmProxy.insert(realm, likesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
        }

        test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((CommentItemRealmProxyInterface) object).realmGet$reposts();
        if (repostsObj != null) {
            Long cachereposts = cache.get(repostsObj);
            if (cachereposts == null) {
                cachereposts = RepostsRealmProxy.insert(realm, repostsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFromTopicIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$isFromTopic(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
        long tableNativePtr = table.getNativePtr();
        CommentItemColumnInfo columnInfo = (CommentItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.CommentItem object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.CommentItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((CommentItemRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((CommentItemRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.senderIdIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$senderId(), false);

            test.mingorto.crackersapp.model.Place placeObj = ((CommentItemRealmProxyInterface) object).realmGet$place();
            if (placeObj != null) {
                Long cacheplace = cache.get(placeObj);
                if (cacheplace == null) {
                    cacheplace = PlaceRealmProxy.insert(realm, placeObj, cache);
                }
                table.setLink(columnInfo.placeIndex, rowIndex, cacheplace, false);
            }
            String realmGet$senderName = ((CommentItemRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            }
            String realmGet$senderPhoto = ((CommentItemRealmProxyInterface) object).realmGet$senderPhoto();
            if (realmGet$senderPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$date(), false);
            String realmGet$text = ((CommentItemRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            }

            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((CommentItemRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
                for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ApiAttachmentRealmProxy.insert(realm, attachmentsItem, cache);
                    }
                    LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
                }
            }
            String realmGet$attachmentsString = ((CommentItemRealmProxyInterface) object).realmGet$attachmentsString();
            if (realmGet$attachmentsString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
            }

            test.mingorto.crackersapp.model.countable.Likes likesObj = ((CommentItemRealmProxyInterface) object).realmGet$likes();
            if (likesObj != null) {
                Long cachelikes = cache.get(likesObj);
                if (cachelikes == null) {
                    cachelikes = LikesRealmProxy.insert(realm, likesObj, cache);
                }
                table.setLink(columnInfo.likesIndex, rowIndex, cachelikes, false);
            }

            test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((CommentItemRealmProxyInterface) object).realmGet$reposts();
            if (repostsObj != null) {
                Long cachereposts = cache.get(repostsObj);
                if (cachereposts == null) {
                    cachereposts = RepostsRealmProxy.insert(realm, repostsObj, cache);
                }
                table.setLink(columnInfo.repostsIndex, rowIndex, cachereposts, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFromTopicIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$isFromTopic(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.CommentItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
        long tableNativePtr = table.getNativePtr();
        CommentItemColumnInfo columnInfo = (CommentItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((CommentItemRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((CommentItemRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.senderIdIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$senderId(), false);

        test.mingorto.crackersapp.model.Place placeObj = ((CommentItemRealmProxyInterface) object).realmGet$place();
        if (placeObj != null) {
            Long cacheplace = cache.get(placeObj);
            if (cacheplace == null) {
                cacheplace = PlaceRealmProxy.insertOrUpdate(realm, placeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.placeIndex, rowIndex, cacheplace, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.placeIndex, rowIndex);
        }
        String realmGet$senderName = ((CommentItemRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
        }
        String realmGet$senderPhoto = ((CommentItemRealmProxyInterface) object).realmGet$senderPhoto();
        if (realmGet$senderPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$date(), false);
        String realmGet$text = ((CommentItemRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
        }

        long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
        LinkView.nativeClear(attachmentsNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((CommentItemRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = ApiAttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                }
                LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
            }
        }

        String realmGet$attachmentsString = ((CommentItemRealmProxyInterface) object).realmGet$attachmentsString();
        if (realmGet$attachmentsString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, false);
        }

        test.mingorto.crackersapp.model.countable.Likes likesObj = ((CommentItemRealmProxyInterface) object).realmGet$likes();
        if (likesObj != null) {
            Long cachelikes = cache.get(likesObj);
            if (cachelikes == null) {
                cachelikes = LikesRealmProxy.insertOrUpdate(realm, likesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.likesIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((CommentItemRealmProxyInterface) object).realmGet$reposts();
        if (repostsObj != null) {
            Long cachereposts = cache.get(repostsObj);
            if (cachereposts == null) {
                cachereposts = RepostsRealmProxy.insertOrUpdate(realm, repostsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.repostsIndex, rowIndex);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isFromTopicIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$isFromTopic(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.CommentItem.class);
        long tableNativePtr = table.getNativePtr();
        CommentItemColumnInfo columnInfo = (CommentItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.CommentItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.CommentItem object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.CommentItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((CommentItemRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CommentItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((CommentItemRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.senderIdIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$senderId(), false);

            test.mingorto.crackersapp.model.Place placeObj = ((CommentItemRealmProxyInterface) object).realmGet$place();
            if (placeObj != null) {
                Long cacheplace = cache.get(placeObj);
                if (cacheplace == null) {
                    cacheplace = PlaceRealmProxy.insertOrUpdate(realm, placeObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.placeIndex, rowIndex, cacheplace, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.placeIndex, rowIndex);
            }
            String realmGet$senderName = ((CommentItemRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
            }
            String realmGet$senderPhoto = ((CommentItemRealmProxyInterface) object).realmGet$senderPhoto();
            if (realmGet$senderPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$date(), false);
            String realmGet$text = ((CommentItemRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
            }

            long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
            LinkView.nativeClear(attachmentsNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((CommentItemRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ApiAttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                    }
                    LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
                }
            }

            String realmGet$attachmentsString = ((CommentItemRealmProxyInterface) object).realmGet$attachmentsString();
            if (realmGet$attachmentsString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, false);
            }

            test.mingorto.crackersapp.model.countable.Likes likesObj = ((CommentItemRealmProxyInterface) object).realmGet$likes();
            if (likesObj != null) {
                Long cachelikes = cache.get(likesObj);
                if (cachelikes == null) {
                    cachelikes = LikesRealmProxy.insertOrUpdate(realm, likesObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.likesIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((CommentItemRealmProxyInterface) object).realmGet$reposts();
            if (repostsObj != null) {
                Long cachereposts = cache.get(repostsObj);
                if (cachereposts == null) {
                    cachereposts = RepostsRealmProxy.insertOrUpdate(realm, repostsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.repostsIndex, rowIndex);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isFromTopicIndex, rowIndex, ((CommentItemRealmProxyInterface) object).realmGet$isFromTopic(), false);
        }
    }

    public static test.mingorto.crackersapp.model.CommentItem createDetachedCopy(test.mingorto.crackersapp.model.CommentItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.CommentItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.CommentItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.CommentItem) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.CommentItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        CommentItemRealmProxyInterface unmanagedCopy = (CommentItemRealmProxyInterface) unmanagedObject;
        CommentItemRealmProxyInterface realmSource = (CommentItemRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$senderId(realmSource.realmGet$senderId());

        // Deep copy of place
        unmanagedCopy.realmSet$place(PlaceRealmProxy.createDetachedCopy(realmSource.realmGet$place(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$senderName(realmSource.realmGet$senderName());
        unmanagedCopy.realmSet$senderPhoto(realmSource.realmGet$senderPhoto());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());

        // Deep copy of attachments
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$attachments(null);
        } else {
            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> managedattachmentsList = realmSource.realmGet$attachments();
            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> unmanagedattachmentsList = new RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment>();
            unmanagedCopy.realmSet$attachments(unmanagedattachmentsList);
            int nextDepth = currentDepth + 1;
            int size = managedattachmentsList.size();
            for (int i = 0; i < size; i++) {
                test.mingorto.crackersapp.model.attachment.ApiAttachment item = ApiAttachmentRealmProxy.createDetachedCopy(managedattachmentsList.get(i), nextDepth, maxDepth, cache);
                unmanagedattachmentsList.add(item);
            }
        }
        unmanagedCopy.realmSet$attachmentsString(realmSource.realmGet$attachmentsString());

        // Deep copy of likes
        unmanagedCopy.realmSet$likes(LikesRealmProxy.createDetachedCopy(realmSource.realmGet$likes(), currentDepth + 1, maxDepth, cache));

        // Deep copy of reposts
        unmanagedCopy.realmSet$reposts(RepostsRealmProxy.createDetachedCopy(realmSource.realmGet$reposts(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isFromTopic(realmSource.realmGet$isFromTopic());
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.CommentItem update(Realm realm, test.mingorto.crackersapp.model.CommentItem realmObject, test.mingorto.crackersapp.model.CommentItem newObject, Map<RealmModel, RealmObjectProxy> cache) {
        CommentItemRealmProxyInterface realmObjectTarget = (CommentItemRealmProxyInterface) realmObject;
        CommentItemRealmProxyInterface realmObjectSource = (CommentItemRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$senderId(realmObjectSource.realmGet$senderId());
        test.mingorto.crackersapp.model.Place placeObj = realmObjectSource.realmGet$place();
        if (placeObj == null) {
            realmObjectTarget.realmSet$place(null);
        } else {
            test.mingorto.crackersapp.model.Place cacheplace = (test.mingorto.crackersapp.model.Place) cache.get(placeObj);
            if (cacheplace != null) {
                realmObjectTarget.realmSet$place(cacheplace);
            } else {
                realmObjectTarget.realmSet$place(PlaceRealmProxy.copyOrUpdate(realm, placeObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectTarget.realmSet$senderPhoto(realmObjectSource.realmGet$senderPhoto());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectTarget.realmSet$text(realmObjectSource.realmGet$text());
        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = realmObjectSource.realmGet$attachments();
        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsRealmList = realmObjectTarget.realmGet$attachments();
        attachmentsRealmList.clear();
        if (attachmentsList != null) {
            for (int i = 0; i < attachmentsList.size(); i++) {
                test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem = attachmentsList.get(i);
                test.mingorto.crackersapp.model.attachment.ApiAttachment cacheattachments = (test.mingorto.crackersapp.model.attachment.ApiAttachment) cache.get(attachmentsItem);
                if (cacheattachments != null) {
                    attachmentsRealmList.add(cacheattachments);
                } else {
                    attachmentsRealmList.add(ApiAttachmentRealmProxy.copyOrUpdate(realm, attachmentsItem, true, cache));
                }
            }
        }
        realmObjectTarget.realmSet$attachmentsString(realmObjectSource.realmGet$attachmentsString());
        test.mingorto.crackersapp.model.countable.Likes likesObj = realmObjectSource.realmGet$likes();
        if (likesObj == null) {
            realmObjectTarget.realmSet$likes(null);
        } else {
            test.mingorto.crackersapp.model.countable.Likes cachelikes = (test.mingorto.crackersapp.model.countable.Likes) cache.get(likesObj);
            if (cachelikes != null) {
                realmObjectTarget.realmSet$likes(cachelikes);
            } else {
                realmObjectTarget.realmSet$likes(LikesRealmProxy.copyOrUpdate(realm, likesObj, true, cache));
            }
        }
        test.mingorto.crackersapp.model.countable.Reposts repostsObj = realmObjectSource.realmGet$reposts();
        if (repostsObj == null) {
            realmObjectTarget.realmSet$reposts(null);
        } else {
            test.mingorto.crackersapp.model.countable.Reposts cachereposts = (test.mingorto.crackersapp.model.countable.Reposts) cache.get(repostsObj);
            if (cachereposts != null) {
                realmObjectTarget.realmSet$reposts(cachereposts);
            } else {
                realmObjectTarget.realmSet$reposts(RepostsRealmProxy.copyOrUpdate(realm, repostsObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$isFromTopic(realmObjectSource.realmGet$isFromTopic());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CommentItem = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderId:");
        stringBuilder.append(realmGet$senderId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{place:");
        stringBuilder.append(realmGet$place() != null ? "Place" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderName:");
        stringBuilder.append(realmGet$senderName() != null ? realmGet$senderName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderPhoto:");
        stringBuilder.append(realmGet$senderPhoto() != null ? realmGet$senderPhoto() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text() != null ? realmGet$text() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<ApiAttachment>[").append(realmGet$attachments().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachmentsString:");
        stringBuilder.append(realmGet$attachmentsString() != null ? realmGet$attachmentsString() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{likes:");
        stringBuilder.append(realmGet$likes() != null ? "Likes" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{reposts:");
        stringBuilder.append(realmGet$reposts() != null ? "Reposts" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isFromTopic:");
        stringBuilder.append(realmGet$isFromTopic());
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
        CommentItemRealmProxy aCommentItem = (CommentItemRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCommentItem.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCommentItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCommentItem.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
