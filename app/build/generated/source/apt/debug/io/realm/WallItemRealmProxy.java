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
public class WallItemRealmProxy extends test.mingorto.crackersapp.model.WallItem
    implements RealmObjectProxy, WallItemRealmProxyInterface {

    static final class WallItemColumnInfo extends ColumnInfo {
        long attachmentsStringIndex;
        long senderNameIndex;
        long senderPhotoIndex;
        long idIndex;
        long fromIdIndex;
        long ownerIdIndex;
        long dateIndex;
        long markedAsAdsIndex;
        long postTypeIndex;
        long textIndex;
        long canPinIndex;
        long attachmentsIndex;
        long copyHistoryIndex;
        long postSourceIndex;
        long commentsIndex;
        long likesIndex;
        long repostsIndex;
        long viewsIndex;

        WallItemColumnInfo(SharedRealm realm, Table table) {
            super(18);
            this.attachmentsStringIndex = addColumnDetails(table, "attachmentsString", RealmFieldType.STRING);
            this.senderNameIndex = addColumnDetails(table, "senderName", RealmFieldType.STRING);
            this.senderPhotoIndex = addColumnDetails(table, "senderPhoto", RealmFieldType.STRING);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.fromIdIndex = addColumnDetails(table, "fromId", RealmFieldType.INTEGER);
            this.ownerIdIndex = addColumnDetails(table, "ownerId", RealmFieldType.INTEGER);
            this.dateIndex = addColumnDetails(table, "date", RealmFieldType.INTEGER);
            this.markedAsAdsIndex = addColumnDetails(table, "markedAsAds", RealmFieldType.INTEGER);
            this.postTypeIndex = addColumnDetails(table, "postType", RealmFieldType.STRING);
            this.textIndex = addColumnDetails(table, "text", RealmFieldType.STRING);
            this.canPinIndex = addColumnDetails(table, "canPin", RealmFieldType.INTEGER);
            this.attachmentsIndex = addColumnDetails(table, "attachments", RealmFieldType.LIST);
            this.copyHistoryIndex = addColumnDetails(table, "copyHistory", RealmFieldType.LIST);
            this.postSourceIndex = addColumnDetails(table, "postSource", RealmFieldType.OBJECT);
            this.commentsIndex = addColumnDetails(table, "comments", RealmFieldType.OBJECT);
            this.likesIndex = addColumnDetails(table, "likes", RealmFieldType.OBJECT);
            this.repostsIndex = addColumnDetails(table, "reposts", RealmFieldType.OBJECT);
            this.viewsIndex = addColumnDetails(table, "views", RealmFieldType.OBJECT);
        }

        WallItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WallItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WallItemColumnInfo src = (WallItemColumnInfo) rawSrc;
            final WallItemColumnInfo dst = (WallItemColumnInfo) rawDst;
            dst.attachmentsStringIndex = src.attachmentsStringIndex;
            dst.senderNameIndex = src.senderNameIndex;
            dst.senderPhotoIndex = src.senderPhotoIndex;
            dst.idIndex = src.idIndex;
            dst.fromIdIndex = src.fromIdIndex;
            dst.ownerIdIndex = src.ownerIdIndex;
            dst.dateIndex = src.dateIndex;
            dst.markedAsAdsIndex = src.markedAsAdsIndex;
            dst.postTypeIndex = src.postTypeIndex;
            dst.textIndex = src.textIndex;
            dst.canPinIndex = src.canPinIndex;
            dst.attachmentsIndex = src.attachmentsIndex;
            dst.copyHistoryIndex = src.copyHistoryIndex;
            dst.postSourceIndex = src.postSourceIndex;
            dst.commentsIndex = src.commentsIndex;
            dst.likesIndex = src.likesIndex;
            dst.repostsIndex = src.repostsIndex;
            dst.viewsIndex = src.viewsIndex;
        }
    }

    private WallItemColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.WallItem> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsRealmList;
    private RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("attachmentsString");
        fieldNames.add("senderName");
        fieldNames.add("senderPhoto");
        fieldNames.add("id");
        fieldNames.add("fromId");
        fieldNames.add("ownerId");
        fieldNames.add("date");
        fieldNames.add("markedAsAds");
        fieldNames.add("postType");
        fieldNames.add("text");
        fieldNames.add("canPin");
        fieldNames.add("attachments");
        fieldNames.add("copyHistory");
        fieldNames.add("postSource");
        fieldNames.add("comments");
        fieldNames.add("likes");
        fieldNames.add("reposts");
        fieldNames.add("views");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    WallItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WallItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.WallItem>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$fromId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.fromIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.fromIdIndex);
    }

    @Override
    public void realmSet$fromId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.fromIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.fromIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$ownerId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ownerIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.ownerIdIndex);
    }

    @Override
    public void realmSet$ownerId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ownerIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.ownerIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ownerIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.ownerIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dateIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$markedAsAds() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.markedAsAdsIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.markedAsAdsIndex);
    }

    @Override
    public void realmSet$markedAsAds(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.markedAsAdsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.markedAsAdsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.markedAsAdsIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.markedAsAdsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$postType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.postTypeIndex);
    }

    @Override
    public void realmSet$postType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.postTypeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.postTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.postTypeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.postTypeIndex, value);
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
    @SuppressWarnings("cast")
    public Integer realmGet$canPin() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.canPinIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.canPinIndex);
    }

    @Override
    public void realmSet$canPin(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.canPinIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.canPinIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.canPinIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.canPinIndex, value);
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
    public RealmList<test.mingorto.crackersapp.model.WallItem> realmGet$copyHistory() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (copyHistoryRealmList != null) {
            return copyHistoryRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.copyHistoryIndex);
            copyHistoryRealmList = new RealmList<test.mingorto.crackersapp.model.WallItem>(test.mingorto.crackersapp.model.WallItem.class, linkView, proxyState.getRealm$realm());
            return copyHistoryRealmList;
        }
    }

    @Override
    public void realmSet$copyHistory(RealmList<test.mingorto.crackersapp.model.WallItem> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("copyHistory")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<test.mingorto.crackersapp.model.WallItem> original = value;
                value = new RealmList<test.mingorto.crackersapp.model.WallItem>();
                for (test.mingorto.crackersapp.model.WallItem item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.copyHistoryIndex);
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
    public test.mingorto.crackersapp.model.PostSource realmGet$postSource() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.postSourceIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.PostSource.class, proxyState.getRow$realm().getLink(columnInfo.postSourceIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$postSource(test.mingorto.crackersapp.model.PostSource value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("postSource")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.postSourceIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.postSourceIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.postSourceIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.postSourceIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public test.mingorto.crackersapp.model.countable.Comments realmGet$comments() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.commentsIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.countable.Comments.class, proxyState.getRow$realm().getLink(columnInfo.commentsIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$comments(test.mingorto.crackersapp.model.countable.Comments value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("comments")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.commentsIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.commentsIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.commentsIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.commentsIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
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
    public test.mingorto.crackersapp.model.Views realmGet$views() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.viewsIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(test.mingorto.crackersapp.model.Views.class, proxyState.getRow$realm().getLink(columnInfo.viewsIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$views(test.mingorto.crackersapp.model.Views value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("views")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.viewsIndex);
                return;
            }
            if (!RealmObject.isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.viewsIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.viewsIndex);
            return;
        }
        if (!(RealmObject.isManaged(value) && RealmObject.isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.viewsIndex, ((RealmObjectProxy)value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("WallItem");
        builder.addProperty("attachmentsString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("senderName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("senderPhoto", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("fromId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("ownerId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("markedAsAds", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("postType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("canPin", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("attachments", RealmFieldType.LIST, "ApiAttachment");
        builder.addLinkedProperty("copyHistory", RealmFieldType.LIST, "WallItem");
        builder.addLinkedProperty("postSource", RealmFieldType.OBJECT, "PostSource");
        builder.addLinkedProperty("comments", RealmFieldType.OBJECT, "Comments");
        builder.addLinkedProperty("likes", RealmFieldType.OBJECT, "Likes");
        builder.addLinkedProperty("reposts", RealmFieldType.OBJECT, "Reposts");
        builder.addLinkedProperty("views", RealmFieldType.OBJECT, "Views");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static WallItemColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_WallItem")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'WallItem' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_WallItem");
        final long columnCount = table.getColumnCount();
        if (columnCount != 18) {
            if (columnCount < 18) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 18 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 18 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 18 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final WallItemColumnInfo columnInfo = new WallItemColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'id' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.idIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field id");
            }
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
        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'id' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("fromId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'fromId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("fromId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'fromId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.fromIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'fromId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'fromId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("ownerId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'ownerId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("ownerId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'ownerId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.ownerIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'ownerId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'ownerId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("date")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'date' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("date") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'date' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.dateIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'date' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'date' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("markedAsAds")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'markedAsAds' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("markedAsAds") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'markedAsAds' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.markedAsAdsIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'markedAsAds' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'markedAsAds' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("postType")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'postType' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("postType") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'postType' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.postTypeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'postType' is required. Either set @Required to field 'postType' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("canPin")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'canPin' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("canPin") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'canPin' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.canPinIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'canPin' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'canPin' or migrate using RealmObjectSchema.setNullable().");
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
        Table table_11 = sharedRealm.getTable("class_ApiAttachment");
        if (!table.getLinkTarget(columnInfo.attachmentsIndex).hasSameSchema(table_11)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'attachments': '" + table.getLinkTarget(columnInfo.attachmentsIndex).getName() + "' expected - was '" + table_11.getName() + "'");
        }
        if (!columnTypes.containsKey("copyHistory")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'copyHistory'");
        }
        if (columnTypes.get("copyHistory") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'WallItem' for field 'copyHistory'");
        }
        if (!sharedRealm.hasTable("class_WallItem")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_WallItem' for field 'copyHistory'");
        }
        Table table_12 = sharedRealm.getTable("class_WallItem");
        if (!table.getLinkTarget(columnInfo.copyHistoryIndex).hasSameSchema(table_12)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'copyHistory': '" + table.getLinkTarget(columnInfo.copyHistoryIndex).getName() + "' expected - was '" + table_12.getName() + "'");
        }
        if (!columnTypes.containsKey("postSource")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'postSource' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("postSource") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'PostSource' for field 'postSource'");
        }
        if (!sharedRealm.hasTable("class_PostSource")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_PostSource' for field 'postSource'");
        }
        Table table_13 = sharedRealm.getTable("class_PostSource");
        if (!table.getLinkTarget(columnInfo.postSourceIndex).hasSameSchema(table_13)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'postSource': '" + table.getLinkTarget(columnInfo.postSourceIndex).getName() + "' expected - was '" + table_13.getName() + "'");
        }
        if (!columnTypes.containsKey("comments")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'comments' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("comments") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Comments' for field 'comments'");
        }
        if (!sharedRealm.hasTable("class_Comments")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Comments' for field 'comments'");
        }
        Table table_14 = sharedRealm.getTable("class_Comments");
        if (!table.getLinkTarget(columnInfo.commentsIndex).hasSameSchema(table_14)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'comments': '" + table.getLinkTarget(columnInfo.commentsIndex).getName() + "' expected - was '" + table_14.getName() + "'");
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
        Table table_15 = sharedRealm.getTable("class_Likes");
        if (!table.getLinkTarget(columnInfo.likesIndex).hasSameSchema(table_15)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'likes': '" + table.getLinkTarget(columnInfo.likesIndex).getName() + "' expected - was '" + table_15.getName() + "'");
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
        Table table_16 = sharedRealm.getTable("class_Reposts");
        if (!table.getLinkTarget(columnInfo.repostsIndex).hasSameSchema(table_16)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'reposts': '" + table.getLinkTarget(columnInfo.repostsIndex).getName() + "' expected - was '" + table_16.getName() + "'");
        }
        if (!columnTypes.containsKey("views")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'views' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("views") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Views' for field 'views'");
        }
        if (!sharedRealm.hasTable("class_Views")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Views' for field 'views'");
        }
        Table table_17 = sharedRealm.getTable("class_Views");
        if (!table.getLinkTarget(columnInfo.viewsIndex).hasSameSchema(table_17)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'views': '" + table.getLinkTarget(columnInfo.viewsIndex).getName() + "' expected - was '" + table_17.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_WallItem";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.WallItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(7);
        test.mingorto.crackersapp.model.WallItem obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class), false, Collections.<String> emptyList());
                    obj = new io.realm.WallItemRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("attachments")) {
                excludeFields.add("attachments");
            }
            if (json.has("copyHistory")) {
                excludeFields.add("copyHistory");
            }
            if (json.has("postSource")) {
                excludeFields.add("postSource");
            }
            if (json.has("comments")) {
                excludeFields.add("comments");
            }
            if (json.has("likes")) {
                excludeFields.add("likes");
            }
            if (json.has("reposts")) {
                excludeFields.add("reposts");
            }
            if (json.has("views")) {
                excludeFields.add("views");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.WallItemRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.WallItem.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.WallItemRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.WallItem.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("attachmentsString")) {
            if (json.isNull("attachmentsString")) {
                ((WallItemRealmProxyInterface) obj).realmSet$attachmentsString(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$attachmentsString((String) json.getString("attachmentsString"));
            }
        }
        if (json.has("senderName")) {
            if (json.isNull("senderName")) {
                ((WallItemRealmProxyInterface) obj).realmSet$senderName(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$senderName((String) json.getString("senderName"));
            }
        }
        if (json.has("senderPhoto")) {
            if (json.isNull("senderPhoto")) {
                ((WallItemRealmProxyInterface) obj).realmSet$senderPhoto(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$senderPhoto((String) json.getString("senderPhoto"));
            }
        }
        if (json.has("fromId")) {
            if (json.isNull("fromId")) {
                ((WallItemRealmProxyInterface) obj).realmSet$fromId(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$fromId((int) json.getInt("fromId"));
            }
        }
        if (json.has("ownerId")) {
            if (json.isNull("ownerId")) {
                ((WallItemRealmProxyInterface) obj).realmSet$ownerId(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$ownerId((int) json.getInt("ownerId"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                ((WallItemRealmProxyInterface) obj).realmSet$date(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$date((int) json.getInt("date"));
            }
        }
        if (json.has("markedAsAds")) {
            if (json.isNull("markedAsAds")) {
                ((WallItemRealmProxyInterface) obj).realmSet$markedAsAds(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$markedAsAds((int) json.getInt("markedAsAds"));
            }
        }
        if (json.has("postType")) {
            if (json.isNull("postType")) {
                ((WallItemRealmProxyInterface) obj).realmSet$postType(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$postType((String) json.getString("postType"));
            }
        }
        if (json.has("text")) {
            if (json.isNull("text")) {
                ((WallItemRealmProxyInterface) obj).realmSet$text(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$text((String) json.getString("text"));
            }
        }
        if (json.has("canPin")) {
            if (json.isNull("canPin")) {
                ((WallItemRealmProxyInterface) obj).realmSet$canPin(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmSet$canPin((int) json.getInt("canPin"));
            }
        }
        if (json.has("attachments")) {
            if (json.isNull("attachments")) {
                ((WallItemRealmProxyInterface) obj).realmSet$attachments(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmGet$attachments().clear();
                JSONArray array = json.getJSONArray("attachments");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.attachment.ApiAttachment item = ApiAttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((WallItemRealmProxyInterface) obj).realmGet$attachments().add(item);
                }
            }
        }
        if (json.has("copyHistory")) {
            if (json.isNull("copyHistory")) {
                ((WallItemRealmProxyInterface) obj).realmSet$copyHistory(null);
            } else {
                ((WallItemRealmProxyInterface) obj).realmGet$copyHistory().clear();
                JSONArray array = json.getJSONArray("copyHistory");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.WallItem item = WallItemRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((WallItemRealmProxyInterface) obj).realmGet$copyHistory().add(item);
                }
            }
        }
        if (json.has("postSource")) {
            if (json.isNull("postSource")) {
                ((WallItemRealmProxyInterface) obj).realmSet$postSource(null);
            } else {
                test.mingorto.crackersapp.model.PostSource postSourceObj = PostSourceRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("postSource"), update);
                ((WallItemRealmProxyInterface) obj).realmSet$postSource(postSourceObj);
            }
        }
        if (json.has("comments")) {
            if (json.isNull("comments")) {
                ((WallItemRealmProxyInterface) obj).realmSet$comments(null);
            } else {
                test.mingorto.crackersapp.model.countable.Comments commentsObj = CommentsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("comments"), update);
                ((WallItemRealmProxyInterface) obj).realmSet$comments(commentsObj);
            }
        }
        if (json.has("likes")) {
            if (json.isNull("likes")) {
                ((WallItemRealmProxyInterface) obj).realmSet$likes(null);
            } else {
                test.mingorto.crackersapp.model.countable.Likes likesObj = LikesRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("likes"), update);
                ((WallItemRealmProxyInterface) obj).realmSet$likes(likesObj);
            }
        }
        if (json.has("reposts")) {
            if (json.isNull("reposts")) {
                ((WallItemRealmProxyInterface) obj).realmSet$reposts(null);
            } else {
                test.mingorto.crackersapp.model.countable.Reposts repostsObj = RepostsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("reposts"), update);
                ((WallItemRealmProxyInterface) obj).realmSet$reposts(repostsObj);
            }
        }
        if (json.has("views")) {
            if (json.isNull("views")) {
                ((WallItemRealmProxyInterface) obj).realmSet$views(null);
            } else {
                test.mingorto.crackersapp.model.Views viewsObj = ViewsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("views"), update);
                ((WallItemRealmProxyInterface) obj).realmSet$views(viewsObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.WallItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.WallItem obj = new test.mingorto.crackersapp.model.WallItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("attachmentsString")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$attachmentsString(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$attachmentsString((String) reader.nextString());
                }
            } else if (name.equals("senderName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$senderName(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$senderName((String) reader.nextString());
                }
            } else if (name.equals("senderPhoto")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$senderPhoto(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$senderPhoto((String) reader.nextString());
                }
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("fromId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$fromId(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$fromId((int) reader.nextInt());
                }
            } else if (name.equals("ownerId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$ownerId(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$ownerId((int) reader.nextInt());
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$date(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$date((int) reader.nextInt());
                }
            } else if (name.equals("markedAsAds")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$markedAsAds(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$markedAsAds((int) reader.nextInt());
                }
            } else if (name.equals("postType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$postType(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$postType((String) reader.nextString());
                }
            } else if (name.equals("text")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$text(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$text((String) reader.nextString());
                }
            } else if (name.equals("canPin")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$canPin(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$canPin((int) reader.nextInt());
                }
            } else if (name.equals("attachments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$attachments(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$attachments(new RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.attachment.ApiAttachment item = ApiAttachmentRealmProxy.createUsingJsonStream(realm, reader);
                        ((WallItemRealmProxyInterface) obj).realmGet$attachments().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("copyHistory")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$copyHistory(null);
                } else {
                    ((WallItemRealmProxyInterface) obj).realmSet$copyHistory(new RealmList<test.mingorto.crackersapp.model.WallItem>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.WallItem item = WallItemRealmProxy.createUsingJsonStream(realm, reader);
                        ((WallItemRealmProxyInterface) obj).realmGet$copyHistory().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("postSource")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$postSource(null);
                } else {
                    test.mingorto.crackersapp.model.PostSource postSourceObj = PostSourceRealmProxy.createUsingJsonStream(realm, reader);
                    ((WallItemRealmProxyInterface) obj).realmSet$postSource(postSourceObj);
                }
            } else if (name.equals("comments")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$comments(null);
                } else {
                    test.mingorto.crackersapp.model.countable.Comments commentsObj = CommentsRealmProxy.createUsingJsonStream(realm, reader);
                    ((WallItemRealmProxyInterface) obj).realmSet$comments(commentsObj);
                }
            } else if (name.equals("likes")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$likes(null);
                } else {
                    test.mingorto.crackersapp.model.countable.Likes likesObj = LikesRealmProxy.createUsingJsonStream(realm, reader);
                    ((WallItemRealmProxyInterface) obj).realmSet$likes(likesObj);
                }
            } else if (name.equals("reposts")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$reposts(null);
                } else {
                    test.mingorto.crackersapp.model.countable.Reposts repostsObj = RepostsRealmProxy.createUsingJsonStream(realm, reader);
                    ((WallItemRealmProxyInterface) obj).realmSet$reposts(repostsObj);
                }
            } else if (name.equals("views")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((WallItemRealmProxyInterface) obj).realmSet$views(null);
                } else {
                    test.mingorto.crackersapp.model.Views viewsObj = ViewsRealmProxy.createUsingJsonStream(realm, reader);
                    ((WallItemRealmProxyInterface) obj).realmSet$views(viewsObj);
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

    public static test.mingorto.crackersapp.model.WallItem copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.WallItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.WallItem) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.WallItem realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
            long pkColumnIndex = table.getPrimaryKey();
            Number value = ((WallItemRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.WallItemRealmProxy();
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

    public static test.mingorto.crackersapp.model.WallItem copy(Realm realm, test.mingorto.crackersapp.model.WallItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.WallItem) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.WallItem realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.WallItem.class, ((WallItemRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        WallItemRealmProxyInterface realmObjectSource = (WallItemRealmProxyInterface) newObject;
        WallItemRealmProxyInterface realmObjectCopy = (WallItemRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$attachmentsString(realmObjectSource.realmGet$attachmentsString());
        realmObjectCopy.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectCopy.realmSet$senderPhoto(realmObjectSource.realmGet$senderPhoto());
        realmObjectCopy.realmSet$fromId(realmObjectSource.realmGet$fromId());
        realmObjectCopy.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$markedAsAds(realmObjectSource.realmGet$markedAsAds());
        realmObjectCopy.realmSet$postType(realmObjectSource.realmGet$postType());
        realmObjectCopy.realmSet$text(realmObjectSource.realmGet$text());
        realmObjectCopy.realmSet$canPin(realmObjectSource.realmGet$canPin());

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


        RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = realmObjectSource.realmGet$copyHistory();
        if (copyHistoryList != null) {
            RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryRealmList = realmObjectCopy.realmGet$copyHistory();
            for (int i = 0; i < copyHistoryList.size(); i++) {
                test.mingorto.crackersapp.model.WallItem copyHistoryItem = copyHistoryList.get(i);
                test.mingorto.crackersapp.model.WallItem cachecopyHistory = (test.mingorto.crackersapp.model.WallItem) cache.get(copyHistoryItem);
                if (cachecopyHistory != null) {
                    copyHistoryRealmList.add(cachecopyHistory);
                } else {
                    copyHistoryRealmList.add(WallItemRealmProxy.copyOrUpdate(realm, copyHistoryItem, update, cache));
                }
            }
        }


        test.mingorto.crackersapp.model.PostSource postSourceObj = realmObjectSource.realmGet$postSource();
        if (postSourceObj == null) {
            realmObjectCopy.realmSet$postSource(null);
        } else {
            test.mingorto.crackersapp.model.PostSource cachepostSource = (test.mingorto.crackersapp.model.PostSource) cache.get(postSourceObj);
            if (cachepostSource != null) {
                realmObjectCopy.realmSet$postSource(cachepostSource);
            } else {
                realmObjectCopy.realmSet$postSource(PostSourceRealmProxy.copyOrUpdate(realm, postSourceObj, update, cache));
            }
        }

        test.mingorto.crackersapp.model.countable.Comments commentsObj = realmObjectSource.realmGet$comments();
        if (commentsObj == null) {
            realmObjectCopy.realmSet$comments(null);
        } else {
            test.mingorto.crackersapp.model.countable.Comments cachecomments = (test.mingorto.crackersapp.model.countable.Comments) cache.get(commentsObj);
            if (cachecomments != null) {
                realmObjectCopy.realmSet$comments(cachecomments);
            } else {
                realmObjectCopy.realmSet$comments(CommentsRealmProxy.copyOrUpdate(realm, commentsObj, update, cache));
            }
        }

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

        test.mingorto.crackersapp.model.Views viewsObj = realmObjectSource.realmGet$views();
        if (viewsObj == null) {
            realmObjectCopy.realmSet$views(null);
        } else {
            test.mingorto.crackersapp.model.Views cacheviews = (test.mingorto.crackersapp.model.Views) cache.get(viewsObj);
            if (cacheviews != null) {
                realmObjectCopy.realmSet$views(cacheviews);
            } else {
                realmObjectCopy.realmSet$views(ViewsRealmProxy.copyOrUpdate(realm, viewsObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.WallItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
        long tableNativePtr = table.getNativePtr();
        WallItemColumnInfo columnInfo = (WallItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((WallItemRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WallItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((WallItemRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$attachmentsString = ((WallItemRealmProxyInterface) object).realmGet$attachmentsString();
        if (realmGet$attachmentsString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
        }
        String realmGet$senderName = ((WallItemRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        }
        String realmGet$senderPhoto = ((WallItemRealmProxyInterface) object).realmGet$senderPhoto();
        if (realmGet$senderPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
        }
        Number realmGet$fromId = ((WallItemRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.fromIdIndex, rowIndex, realmGet$fromId.longValue(), false);
        }
        Number realmGet$ownerId = ((WallItemRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
        }
        Number realmGet$date = ((WallItemRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
        }
        Number realmGet$markedAsAds = ((WallItemRealmProxyInterface) object).realmGet$markedAsAds();
        if (realmGet$markedAsAds != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, realmGet$markedAsAds.longValue(), false);
        }
        String realmGet$postType = ((WallItemRealmProxyInterface) object).realmGet$postType();
        if (realmGet$postType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.postTypeIndex, rowIndex, realmGet$postType, false);
        }
        String realmGet$text = ((WallItemRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        }
        Number realmGet$canPin = ((WallItemRealmProxyInterface) object).realmGet$canPin();
        if (realmGet$canPin != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPinIndex, rowIndex, realmGet$canPin.longValue(), false);
        }

        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((WallItemRealmProxyInterface) object).realmGet$attachments();
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


        RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = ((WallItemRealmProxyInterface) object).realmGet$copyHistory();
        if (copyHistoryList != null) {
            long copyHistoryNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.copyHistoryIndex, rowIndex);
            for (test.mingorto.crackersapp.model.WallItem copyHistoryItem : copyHistoryList) {
                Long cacheItemIndexcopyHistory = cache.get(copyHistoryItem);
                if (cacheItemIndexcopyHistory == null) {
                    cacheItemIndexcopyHistory = WallItemRealmProxy.insert(realm, copyHistoryItem, cache);
                }
                LinkView.nativeAdd(copyHistoryNativeLinkViewPtr, cacheItemIndexcopyHistory);
            }
        }


        test.mingorto.crackersapp.model.PostSource postSourceObj = ((WallItemRealmProxyInterface) object).realmGet$postSource();
        if (postSourceObj != null) {
            Long cachepostSource = cache.get(postSourceObj);
            if (cachepostSource == null) {
                cachepostSource = PostSourceRealmProxy.insert(realm, postSourceObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.postSourceIndex, rowIndex, cachepostSource, false);
        }

        test.mingorto.crackersapp.model.countable.Comments commentsObj = ((WallItemRealmProxyInterface) object).realmGet$comments();
        if (commentsObj != null) {
            Long cachecomments = cache.get(commentsObj);
            if (cachecomments == null) {
                cachecomments = CommentsRealmProxy.insert(realm, commentsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.commentsIndex, rowIndex, cachecomments, false);
        }

        test.mingorto.crackersapp.model.countable.Likes likesObj = ((WallItemRealmProxyInterface) object).realmGet$likes();
        if (likesObj != null) {
            Long cachelikes = cache.get(likesObj);
            if (cachelikes == null) {
                cachelikes = LikesRealmProxy.insert(realm, likesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
        }

        test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((WallItemRealmProxyInterface) object).realmGet$reposts();
        if (repostsObj != null) {
            Long cachereposts = cache.get(repostsObj);
            if (cachereposts == null) {
                cachereposts = RepostsRealmProxy.insert(realm, repostsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
        }

        test.mingorto.crackersapp.model.Views viewsObj = ((WallItemRealmProxyInterface) object).realmGet$views();
        if (viewsObj != null) {
            Long cacheviews = cache.get(viewsObj);
            if (cacheviews == null) {
                cacheviews = ViewsRealmProxy.insert(realm, viewsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.viewsIndex, rowIndex, cacheviews, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
        long tableNativePtr = table.getNativePtr();
        WallItemColumnInfo columnInfo = (WallItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.WallItem object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.WallItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((WallItemRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WallItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((WallItemRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$attachmentsString = ((WallItemRealmProxyInterface) object).realmGet$attachmentsString();
            if (realmGet$attachmentsString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
            }
            String realmGet$senderName = ((WallItemRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            }
            String realmGet$senderPhoto = ((WallItemRealmProxyInterface) object).realmGet$senderPhoto();
            if (realmGet$senderPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
            }
            Number realmGet$fromId = ((WallItemRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.fromIdIndex, rowIndex, realmGet$fromId.longValue(), false);
            }
            Number realmGet$ownerId = ((WallItemRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
            }
            Number realmGet$date = ((WallItemRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
            }
            Number realmGet$markedAsAds = ((WallItemRealmProxyInterface) object).realmGet$markedAsAds();
            if (realmGet$markedAsAds != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, realmGet$markedAsAds.longValue(), false);
            }
            String realmGet$postType = ((WallItemRealmProxyInterface) object).realmGet$postType();
            if (realmGet$postType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.postTypeIndex, rowIndex, realmGet$postType, false);
            }
            String realmGet$text = ((WallItemRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            }
            Number realmGet$canPin = ((WallItemRealmProxyInterface) object).realmGet$canPin();
            if (realmGet$canPin != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPinIndex, rowIndex, realmGet$canPin.longValue(), false);
            }

            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((WallItemRealmProxyInterface) object).realmGet$attachments();
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

            RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = ((WallItemRealmProxyInterface) object).realmGet$copyHistory();
            if (copyHistoryList != null) {
                long copyHistoryNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.copyHistoryIndex, rowIndex);
                for (test.mingorto.crackersapp.model.WallItem copyHistoryItem : copyHistoryList) {
                    Long cacheItemIndexcopyHistory = cache.get(copyHistoryItem);
                    if (cacheItemIndexcopyHistory == null) {
                        cacheItemIndexcopyHistory = WallItemRealmProxy.insert(realm, copyHistoryItem, cache);
                    }
                    LinkView.nativeAdd(copyHistoryNativeLinkViewPtr, cacheItemIndexcopyHistory);
                }
            }

            test.mingorto.crackersapp.model.PostSource postSourceObj = ((WallItemRealmProxyInterface) object).realmGet$postSource();
            if (postSourceObj != null) {
                Long cachepostSource = cache.get(postSourceObj);
                if (cachepostSource == null) {
                    cachepostSource = PostSourceRealmProxy.insert(realm, postSourceObj, cache);
                }
                table.setLink(columnInfo.postSourceIndex, rowIndex, cachepostSource, false);
            }

            test.mingorto.crackersapp.model.countable.Comments commentsObj = ((WallItemRealmProxyInterface) object).realmGet$comments();
            if (commentsObj != null) {
                Long cachecomments = cache.get(commentsObj);
                if (cachecomments == null) {
                    cachecomments = CommentsRealmProxy.insert(realm, commentsObj, cache);
                }
                table.setLink(columnInfo.commentsIndex, rowIndex, cachecomments, false);
            }

            test.mingorto.crackersapp.model.countable.Likes likesObj = ((WallItemRealmProxyInterface) object).realmGet$likes();
            if (likesObj != null) {
                Long cachelikes = cache.get(likesObj);
                if (cachelikes == null) {
                    cachelikes = LikesRealmProxy.insert(realm, likesObj, cache);
                }
                table.setLink(columnInfo.likesIndex, rowIndex, cachelikes, false);
            }

            test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((WallItemRealmProxyInterface) object).realmGet$reposts();
            if (repostsObj != null) {
                Long cachereposts = cache.get(repostsObj);
                if (cachereposts == null) {
                    cachereposts = RepostsRealmProxy.insert(realm, repostsObj, cache);
                }
                table.setLink(columnInfo.repostsIndex, rowIndex, cachereposts, false);
            }

            test.mingorto.crackersapp.model.Views viewsObj = ((WallItemRealmProxyInterface) object).realmGet$views();
            if (viewsObj != null) {
                Long cacheviews = cache.get(viewsObj);
                if (cacheviews == null) {
                    cacheviews = ViewsRealmProxy.insert(realm, viewsObj, cache);
                }
                table.setLink(columnInfo.viewsIndex, rowIndex, cacheviews, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.WallItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
        long tableNativePtr = table.getNativePtr();
        WallItemColumnInfo columnInfo = (WallItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((WallItemRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WallItemRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((WallItemRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$attachmentsString = ((WallItemRealmProxyInterface) object).realmGet$attachmentsString();
        if (realmGet$attachmentsString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, false);
        }
        String realmGet$senderName = ((WallItemRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
        }
        String realmGet$senderPhoto = ((WallItemRealmProxyInterface) object).realmGet$senderPhoto();
        if (realmGet$senderPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, false);
        }
        Number realmGet$fromId = ((WallItemRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.fromIdIndex, rowIndex, realmGet$fromId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromIdIndex, rowIndex, false);
        }
        Number realmGet$ownerId = ((WallItemRealmProxyInterface) object).realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
        }
        Number realmGet$date = ((WallItemRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        Number realmGet$markedAsAds = ((WallItemRealmProxyInterface) object).realmGet$markedAsAds();
        if (realmGet$markedAsAds != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, realmGet$markedAsAds.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, false);
        }
        String realmGet$postType = ((WallItemRealmProxyInterface) object).realmGet$postType();
        if (realmGet$postType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.postTypeIndex, rowIndex, realmGet$postType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.postTypeIndex, rowIndex, false);
        }
        String realmGet$text = ((WallItemRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
        }
        Number realmGet$canPin = ((WallItemRealmProxyInterface) object).realmGet$canPin();
        if (realmGet$canPin != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.canPinIndex, rowIndex, realmGet$canPin.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.canPinIndex, rowIndex, false);
        }

        long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
        LinkView.nativeClear(attachmentsNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((WallItemRealmProxyInterface) object).realmGet$attachments();
        if (attachmentsList != null) {
            for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                Long cacheItemIndexattachments = cache.get(attachmentsItem);
                if (cacheItemIndexattachments == null) {
                    cacheItemIndexattachments = ApiAttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                }
                LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
            }
        }


        long copyHistoryNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.copyHistoryIndex, rowIndex);
        LinkView.nativeClear(copyHistoryNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = ((WallItemRealmProxyInterface) object).realmGet$copyHistory();
        if (copyHistoryList != null) {
            for (test.mingorto.crackersapp.model.WallItem copyHistoryItem : copyHistoryList) {
                Long cacheItemIndexcopyHistory = cache.get(copyHistoryItem);
                if (cacheItemIndexcopyHistory == null) {
                    cacheItemIndexcopyHistory = WallItemRealmProxy.insertOrUpdate(realm, copyHistoryItem, cache);
                }
                LinkView.nativeAdd(copyHistoryNativeLinkViewPtr, cacheItemIndexcopyHistory);
            }
        }


        test.mingorto.crackersapp.model.PostSource postSourceObj = ((WallItemRealmProxyInterface) object).realmGet$postSource();
        if (postSourceObj != null) {
            Long cachepostSource = cache.get(postSourceObj);
            if (cachepostSource == null) {
                cachepostSource = PostSourceRealmProxy.insertOrUpdate(realm, postSourceObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.postSourceIndex, rowIndex, cachepostSource, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.postSourceIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.countable.Comments commentsObj = ((WallItemRealmProxyInterface) object).realmGet$comments();
        if (commentsObj != null) {
            Long cachecomments = cache.get(commentsObj);
            if (cachecomments == null) {
                cachecomments = CommentsRealmProxy.insertOrUpdate(realm, commentsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.commentsIndex, rowIndex, cachecomments, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.commentsIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.countable.Likes likesObj = ((WallItemRealmProxyInterface) object).realmGet$likes();
        if (likesObj != null) {
            Long cachelikes = cache.get(likesObj);
            if (cachelikes == null) {
                cachelikes = LikesRealmProxy.insertOrUpdate(realm, likesObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.likesIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((WallItemRealmProxyInterface) object).realmGet$reposts();
        if (repostsObj != null) {
            Long cachereposts = cache.get(repostsObj);
            if (cachereposts == null) {
                cachereposts = RepostsRealmProxy.insertOrUpdate(realm, repostsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.repostsIndex, rowIndex);
        }

        test.mingorto.crackersapp.model.Views viewsObj = ((WallItemRealmProxyInterface) object).realmGet$views();
        if (viewsObj != null) {
            Long cacheviews = cache.get(viewsObj);
            if (cacheviews == null) {
                cacheviews = ViewsRealmProxy.insertOrUpdate(realm, viewsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.viewsIndex, rowIndex, cacheviews, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.viewsIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.WallItem.class);
        long tableNativePtr = table.getNativePtr();
        WallItemColumnInfo columnInfo = (WallItemColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.WallItem.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.WallItem object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.WallItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((WallItemRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((WallItemRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((WallItemRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$attachmentsString = ((WallItemRealmProxyInterface) object).realmGet$attachmentsString();
            if (realmGet$attachmentsString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, realmGet$attachmentsString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.attachmentsStringIndex, rowIndex, false);
            }
            String realmGet$senderName = ((WallItemRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
            }
            String realmGet$senderPhoto = ((WallItemRealmProxyInterface) object).realmGet$senderPhoto();
            if (realmGet$senderPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, realmGet$senderPhoto, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderPhotoIndex, rowIndex, false);
            }
            Number realmGet$fromId = ((WallItemRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.fromIdIndex, rowIndex, realmGet$fromId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromIdIndex, rowIndex, false);
            }
            Number realmGet$ownerId = ((WallItemRealmProxyInterface) object).realmGet$ownerId();
            if (realmGet$ownerId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, realmGet$ownerId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ownerIdIndex, rowIndex, false);
            }
            Number realmGet$date = ((WallItemRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
            Number realmGet$markedAsAds = ((WallItemRealmProxyInterface) object).realmGet$markedAsAds();
            if (realmGet$markedAsAds != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, realmGet$markedAsAds.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.markedAsAdsIndex, rowIndex, false);
            }
            String realmGet$postType = ((WallItemRealmProxyInterface) object).realmGet$postType();
            if (realmGet$postType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.postTypeIndex, rowIndex, realmGet$postType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.postTypeIndex, rowIndex, false);
            }
            String realmGet$text = ((WallItemRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
            }
            Number realmGet$canPin = ((WallItemRealmProxyInterface) object).realmGet$canPin();
            if (realmGet$canPin != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.canPinIndex, rowIndex, realmGet$canPin.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.canPinIndex, rowIndex, false);
            }

            long attachmentsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.attachmentsIndex, rowIndex);
            LinkView.nativeClear(attachmentsNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> attachmentsList = ((WallItemRealmProxyInterface) object).realmGet$attachments();
            if (attachmentsList != null) {
                for (test.mingorto.crackersapp.model.attachment.ApiAttachment attachmentsItem : attachmentsList) {
                    Long cacheItemIndexattachments = cache.get(attachmentsItem);
                    if (cacheItemIndexattachments == null) {
                        cacheItemIndexattachments = ApiAttachmentRealmProxy.insertOrUpdate(realm, attachmentsItem, cache);
                    }
                    LinkView.nativeAdd(attachmentsNativeLinkViewPtr, cacheItemIndexattachments);
                }
            }


            long copyHistoryNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.copyHistoryIndex, rowIndex);
            LinkView.nativeClear(copyHistoryNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = ((WallItemRealmProxyInterface) object).realmGet$copyHistory();
            if (copyHistoryList != null) {
                for (test.mingorto.crackersapp.model.WallItem copyHistoryItem : copyHistoryList) {
                    Long cacheItemIndexcopyHistory = cache.get(copyHistoryItem);
                    if (cacheItemIndexcopyHistory == null) {
                        cacheItemIndexcopyHistory = WallItemRealmProxy.insertOrUpdate(realm, copyHistoryItem, cache);
                    }
                    LinkView.nativeAdd(copyHistoryNativeLinkViewPtr, cacheItemIndexcopyHistory);
                }
            }


            test.mingorto.crackersapp.model.PostSource postSourceObj = ((WallItemRealmProxyInterface) object).realmGet$postSource();
            if (postSourceObj != null) {
                Long cachepostSource = cache.get(postSourceObj);
                if (cachepostSource == null) {
                    cachepostSource = PostSourceRealmProxy.insertOrUpdate(realm, postSourceObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.postSourceIndex, rowIndex, cachepostSource, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.postSourceIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.countable.Comments commentsObj = ((WallItemRealmProxyInterface) object).realmGet$comments();
            if (commentsObj != null) {
                Long cachecomments = cache.get(commentsObj);
                if (cachecomments == null) {
                    cachecomments = CommentsRealmProxy.insertOrUpdate(realm, commentsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.commentsIndex, rowIndex, cachecomments, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.commentsIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.countable.Likes likesObj = ((WallItemRealmProxyInterface) object).realmGet$likes();
            if (likesObj != null) {
                Long cachelikes = cache.get(likesObj);
                if (cachelikes == null) {
                    cachelikes = LikesRealmProxy.insertOrUpdate(realm, likesObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.likesIndex, rowIndex, cachelikes, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.likesIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.countable.Reposts repostsObj = ((WallItemRealmProxyInterface) object).realmGet$reposts();
            if (repostsObj != null) {
                Long cachereposts = cache.get(repostsObj);
                if (cachereposts == null) {
                    cachereposts = RepostsRealmProxy.insertOrUpdate(realm, repostsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.repostsIndex, rowIndex, cachereposts, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.repostsIndex, rowIndex);
            }

            test.mingorto.crackersapp.model.Views viewsObj = ((WallItemRealmProxyInterface) object).realmGet$views();
            if (viewsObj != null) {
                Long cacheviews = cache.get(viewsObj);
                if (cacheviews == null) {
                    cacheviews = ViewsRealmProxy.insertOrUpdate(realm, viewsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.viewsIndex, rowIndex, cacheviews, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.viewsIndex, rowIndex);
            }
        }
    }

    public static test.mingorto.crackersapp.model.WallItem createDetachedCopy(test.mingorto.crackersapp.model.WallItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.WallItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.WallItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.WallItem) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.WallItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        WallItemRealmProxyInterface unmanagedCopy = (WallItemRealmProxyInterface) unmanagedObject;
        WallItemRealmProxyInterface realmSource = (WallItemRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$attachmentsString(realmSource.realmGet$attachmentsString());
        unmanagedCopy.realmSet$senderName(realmSource.realmGet$senderName());
        unmanagedCopy.realmSet$senderPhoto(realmSource.realmGet$senderPhoto());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$fromId(realmSource.realmGet$fromId());
        unmanagedCopy.realmSet$ownerId(realmSource.realmGet$ownerId());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$markedAsAds(realmSource.realmGet$markedAsAds());
        unmanagedCopy.realmSet$postType(realmSource.realmGet$postType());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());
        unmanagedCopy.realmSet$canPin(realmSource.realmGet$canPin());

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

        // Deep copy of copyHistory
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$copyHistory(null);
        } else {
            RealmList<test.mingorto.crackersapp.model.WallItem> managedcopyHistoryList = realmSource.realmGet$copyHistory();
            RealmList<test.mingorto.crackersapp.model.WallItem> unmanagedcopyHistoryList = new RealmList<test.mingorto.crackersapp.model.WallItem>();
            unmanagedCopy.realmSet$copyHistory(unmanagedcopyHistoryList);
            int nextDepth = currentDepth + 1;
            int size = managedcopyHistoryList.size();
            for (int i = 0; i < size; i++) {
                test.mingorto.crackersapp.model.WallItem item = WallItemRealmProxy.createDetachedCopy(managedcopyHistoryList.get(i), nextDepth, maxDepth, cache);
                unmanagedcopyHistoryList.add(item);
            }
        }

        // Deep copy of postSource
        unmanagedCopy.realmSet$postSource(PostSourceRealmProxy.createDetachedCopy(realmSource.realmGet$postSource(), currentDepth + 1, maxDepth, cache));

        // Deep copy of comments
        unmanagedCopy.realmSet$comments(CommentsRealmProxy.createDetachedCopy(realmSource.realmGet$comments(), currentDepth + 1, maxDepth, cache));

        // Deep copy of likes
        unmanagedCopy.realmSet$likes(LikesRealmProxy.createDetachedCopy(realmSource.realmGet$likes(), currentDepth + 1, maxDepth, cache));

        // Deep copy of reposts
        unmanagedCopy.realmSet$reposts(RepostsRealmProxy.createDetachedCopy(realmSource.realmGet$reposts(), currentDepth + 1, maxDepth, cache));

        // Deep copy of views
        unmanagedCopy.realmSet$views(ViewsRealmProxy.createDetachedCopy(realmSource.realmGet$views(), currentDepth + 1, maxDepth, cache));
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.WallItem update(Realm realm, test.mingorto.crackersapp.model.WallItem realmObject, test.mingorto.crackersapp.model.WallItem newObject, Map<RealmModel, RealmObjectProxy> cache) {
        WallItemRealmProxyInterface realmObjectTarget = (WallItemRealmProxyInterface) realmObject;
        WallItemRealmProxyInterface realmObjectSource = (WallItemRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$attachmentsString(realmObjectSource.realmGet$attachmentsString());
        realmObjectTarget.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectTarget.realmSet$senderPhoto(realmObjectSource.realmGet$senderPhoto());
        realmObjectTarget.realmSet$fromId(realmObjectSource.realmGet$fromId());
        realmObjectTarget.realmSet$ownerId(realmObjectSource.realmGet$ownerId());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectTarget.realmSet$markedAsAds(realmObjectSource.realmGet$markedAsAds());
        realmObjectTarget.realmSet$postType(realmObjectSource.realmGet$postType());
        realmObjectTarget.realmSet$text(realmObjectSource.realmGet$text());
        realmObjectTarget.realmSet$canPin(realmObjectSource.realmGet$canPin());
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
        RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryList = realmObjectSource.realmGet$copyHistory();
        RealmList<test.mingorto.crackersapp.model.WallItem> copyHistoryRealmList = realmObjectTarget.realmGet$copyHistory();
        copyHistoryRealmList.clear();
        if (copyHistoryList != null) {
            for (int i = 0; i < copyHistoryList.size(); i++) {
                test.mingorto.crackersapp.model.WallItem copyHistoryItem = copyHistoryList.get(i);
                test.mingorto.crackersapp.model.WallItem cachecopyHistory = (test.mingorto.crackersapp.model.WallItem) cache.get(copyHistoryItem);
                if (cachecopyHistory != null) {
                    copyHistoryRealmList.add(cachecopyHistory);
                } else {
                    copyHistoryRealmList.add(WallItemRealmProxy.copyOrUpdate(realm, copyHistoryItem, true, cache));
                }
            }
        }
        test.mingorto.crackersapp.model.PostSource postSourceObj = realmObjectSource.realmGet$postSource();
        if (postSourceObj == null) {
            realmObjectTarget.realmSet$postSource(null);
        } else {
            test.mingorto.crackersapp.model.PostSource cachepostSource = (test.mingorto.crackersapp.model.PostSource) cache.get(postSourceObj);
            if (cachepostSource != null) {
                realmObjectTarget.realmSet$postSource(cachepostSource);
            } else {
                realmObjectTarget.realmSet$postSource(PostSourceRealmProxy.copyOrUpdate(realm, postSourceObj, true, cache));
            }
        }
        test.mingorto.crackersapp.model.countable.Comments commentsObj = realmObjectSource.realmGet$comments();
        if (commentsObj == null) {
            realmObjectTarget.realmSet$comments(null);
        } else {
            test.mingorto.crackersapp.model.countable.Comments cachecomments = (test.mingorto.crackersapp.model.countable.Comments) cache.get(commentsObj);
            if (cachecomments != null) {
                realmObjectTarget.realmSet$comments(cachecomments);
            } else {
                realmObjectTarget.realmSet$comments(CommentsRealmProxy.copyOrUpdate(realm, commentsObj, true, cache));
            }
        }
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
        test.mingorto.crackersapp.model.Views viewsObj = realmObjectSource.realmGet$views();
        if (viewsObj == null) {
            realmObjectTarget.realmSet$views(null);
        } else {
            test.mingorto.crackersapp.model.Views cacheviews = (test.mingorto.crackersapp.model.Views) cache.get(viewsObj);
            if (cacheviews != null) {
                realmObjectTarget.realmSet$views(cacheviews);
            } else {
                realmObjectTarget.realmSet$views(ViewsRealmProxy.copyOrUpdate(realm, viewsObj, true, cache));
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
        StringBuilder stringBuilder = new StringBuilder("WallItem = proxy[");
        stringBuilder.append("{attachmentsString:");
        stringBuilder.append(realmGet$attachmentsString() != null ? realmGet$attachmentsString() : "null");
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
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fromId:");
        stringBuilder.append(realmGet$fromId() != null ? realmGet$fromId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ownerId:");
        stringBuilder.append(realmGet$ownerId() != null ? realmGet$ownerId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{markedAsAds:");
        stringBuilder.append(realmGet$markedAsAds() != null ? realmGet$markedAsAds() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{postType:");
        stringBuilder.append(realmGet$postType() != null ? realmGet$postType() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text() != null ? realmGet$text() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{canPin:");
        stringBuilder.append(realmGet$canPin() != null ? realmGet$canPin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachments:");
        stringBuilder.append("RealmList<ApiAttachment>[").append(realmGet$attachments().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{copyHistory:");
        stringBuilder.append("RealmList<WallItem>[").append(realmGet$copyHistory().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{postSource:");
        stringBuilder.append(realmGet$postSource() != null ? "PostSource" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{comments:");
        stringBuilder.append(realmGet$comments() != null ? "Comments" : "null");
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
        stringBuilder.append("{views:");
        stringBuilder.append(realmGet$views() != null ? "Views" : "null");
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
        WallItemRealmProxy aWallItem = (WallItemRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWallItem.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWallItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWallItem.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
