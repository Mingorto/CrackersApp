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
public class GroupRealmProxy extends test.mingorto.crackersapp.model.Group
    implements RealmObjectProxy, GroupRealmProxyInterface {

    static final class GroupColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long screenNameIndex;
        long isClosedIndex;
        long typeIndex;
        long isAdminIndex;
        long isMemberIndex;
        long photo50Index;
        long photo100Index;
        long photo200Index;
        long statusIndex;
        long descriptionIndex;
        long siteIndex;
        long linksIndex;
        long contactListIndex;

        GroupColumnInfo(SharedRealm realm, Table table) {
            super(15);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.nameIndex = addColumnDetails(table, "name", RealmFieldType.STRING);
            this.screenNameIndex = addColumnDetails(table, "screenName", RealmFieldType.STRING);
            this.isClosedIndex = addColumnDetails(table, "isClosed", RealmFieldType.INTEGER);
            this.typeIndex = addColumnDetails(table, "type", RealmFieldType.STRING);
            this.isAdminIndex = addColumnDetails(table, "isAdmin", RealmFieldType.INTEGER);
            this.isMemberIndex = addColumnDetails(table, "isMember", RealmFieldType.INTEGER);
            this.photo50Index = addColumnDetails(table, "photo50", RealmFieldType.STRING);
            this.photo100Index = addColumnDetails(table, "photo100", RealmFieldType.STRING);
            this.photo200Index = addColumnDetails(table, "photo200", RealmFieldType.STRING);
            this.statusIndex = addColumnDetails(table, "status", RealmFieldType.STRING);
            this.descriptionIndex = addColumnDetails(table, "description", RealmFieldType.STRING);
            this.siteIndex = addColumnDetails(table, "site", RealmFieldType.STRING);
            this.linksIndex = addColumnDetails(table, "links", RealmFieldType.LIST);
            this.contactListIndex = addColumnDetails(table, "contactList", RealmFieldType.LIST);
        }

        GroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupColumnInfo src = (GroupColumnInfo) rawSrc;
            final GroupColumnInfo dst = (GroupColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.screenNameIndex = src.screenNameIndex;
            dst.isClosedIndex = src.isClosedIndex;
            dst.typeIndex = src.typeIndex;
            dst.isAdminIndex = src.isAdminIndex;
            dst.isMemberIndex = src.isMemberIndex;
            dst.photo50Index = src.photo50Index;
            dst.photo100Index = src.photo100Index;
            dst.photo200Index = src.photo200Index;
            dst.statusIndex = src.statusIndex;
            dst.descriptionIndex = src.descriptionIndex;
            dst.siteIndex = src.siteIndex;
            dst.linksIndex = src.linksIndex;
            dst.contactListIndex = src.contactListIndex;
        }
    }

    private GroupColumnInfo columnInfo;
    private ProxyState<test.mingorto.crackersapp.model.Group> proxyState;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<test.mingorto.crackersapp.model.attachment.Link> linksRealmList;
    private RealmList<test.mingorto.crackersapp.model.Contact> contactListRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("name");
        fieldNames.add("screenName");
        fieldNames.add("isClosed");
        fieldNames.add("type");
        fieldNames.add("isAdmin");
        fieldNames.add("isMember");
        fieldNames.add("photo50");
        fieldNames.add("photo100");
        fieldNames.add("photo200");
        fieldNames.add("status");
        fieldNames.add("description");
        fieldNames.add("site");
        fieldNames.add("links");
        fieldNames.add("contactList");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    GroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<test.mingorto.crackersapp.model.Group>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$screenName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.screenNameIndex);
    }

    @Override
    public void realmSet$screenName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.screenNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.screenNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.screenNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.screenNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$isClosed() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isClosedIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.isClosedIndex);
    }

    @Override
    public void realmSet$isClosed(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isClosedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.isClosedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isClosedIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.isClosedIndex, value);
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
    @SuppressWarnings("cast")
    public Integer realmGet$isAdmin() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isAdminIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.isAdminIndex);
    }

    @Override
    public void realmSet$isAdmin(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isAdminIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.isAdminIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isAdminIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.isAdminIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$isMember() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isMemberIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.isMemberIndex);
    }

    @Override
    public void realmSet$isMember(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isMemberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.isMemberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isMemberIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.isMemberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo50() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo50Index);
    }

    @Override
    public void realmSet$photo50(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo50Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo50Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo50Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo50Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo100() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo100Index);
    }

    @Override
    public void realmSet$photo100(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo100Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo100Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo100Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo100Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo200() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo200Index);
    }

    @Override
    public void realmSet$photo200(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo200Index, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo200Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo200Index);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo200Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
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
    @SuppressWarnings("cast")
    public String realmGet$site() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.siteIndex);
    }

    @Override
    public void realmSet$site(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.siteIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.siteIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.siteIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.siteIndex, value);
    }

    @Override
    public RealmList<test.mingorto.crackersapp.model.attachment.Link> realmGet$links() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (linksRealmList != null) {
            return linksRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.linksIndex);
            linksRealmList = new RealmList<test.mingorto.crackersapp.model.attachment.Link>(test.mingorto.crackersapp.model.attachment.Link.class, linkView, proxyState.getRealm$realm());
            return linksRealmList;
        }
    }

    @Override
    public void realmSet$links(RealmList<test.mingorto.crackersapp.model.attachment.Link> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("links")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<test.mingorto.crackersapp.model.attachment.Link> original = value;
                value = new RealmList<test.mingorto.crackersapp.model.attachment.Link>();
                for (test.mingorto.crackersapp.model.attachment.Link item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.linksIndex);
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
    public RealmList<test.mingorto.crackersapp.model.Contact> realmGet$contactList() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (contactListRealmList != null) {
            return contactListRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.contactListIndex);
            contactListRealmList = new RealmList<test.mingorto.crackersapp.model.Contact>(test.mingorto.crackersapp.model.Contact.class, linkView, proxyState.getRealm$realm());
            return contactListRealmList;
        }
    }

    @Override
    public void realmSet$contactList(RealmList<test.mingorto.crackersapp.model.Contact> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contactList")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<test.mingorto.crackersapp.model.Contact> original = value;
                value = new RealmList<test.mingorto.crackersapp.model.Contact>();
                for (test.mingorto.crackersapp.model.Contact item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.contactListIndex);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Group");
        builder.addProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("screenName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("isClosed", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("isAdmin", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("isMember", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo50", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo100", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("photo200", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addProperty("site", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addLinkedProperty("links", RealmFieldType.LIST, "Link");
        builder.addLinkedProperty("contactList", RealmFieldType.LIST, "Contact");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
         return expectedObjectSchemaInfo;
    }

    public static GroupColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Group")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Group' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Group");
        final long columnCount = table.getColumnCount();
        if (columnCount != 15) {
            if (columnCount < 15) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 15 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 15 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 15 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final GroupColumnInfo columnInfo = new GroupColumnInfo(sharedRealm, table);

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
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'id' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
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
        if (!columnTypes.containsKey("screenName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'screenName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("screenName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'screenName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.screenNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'screenName' is required. Either set @Required to field 'screenName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("isClosed")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isClosed' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isClosed") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'isClosed' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.isClosedIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'isClosed' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'isClosed' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("isAdmin")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isAdmin' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isAdmin") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'isAdmin' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.isAdminIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'isAdmin' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'isAdmin' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("isMember")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'isMember' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("isMember") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'isMember' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.isMemberIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'isMember' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'isMember' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo50")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo50' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo50") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo50' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo50Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo50' is required. Either set @Required to field 'photo50' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo100")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo100' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo100") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo100' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo100Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo100' is required. Either set @Required to field 'photo100' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("photo200")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'photo200' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("photo200") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'photo200' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.photo200Index)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'photo200' is required. Either set @Required to field 'photo200' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("status")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'status' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("status") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'status' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.statusIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'status' is required. Either set @Required to field 'status' or migrate using RealmObjectSchema.setNullable().");
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
        if (!columnTypes.containsKey("site")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'site' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("site") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'site' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.siteIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'site' is required. Either set @Required to field 'site' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("links")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'links'");
        }
        if (columnTypes.get("links") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Link' for field 'links'");
        }
        if (!sharedRealm.hasTable("class_Link")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Link' for field 'links'");
        }
        Table table_13 = sharedRealm.getTable("class_Link");
        if (!table.getLinkTarget(columnInfo.linksIndex).hasSameSchema(table_13)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'links': '" + table.getLinkTarget(columnInfo.linksIndex).getName() + "' expected - was '" + table_13.getName() + "'");
        }
        if (!columnTypes.containsKey("contactList")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'contactList'");
        }
        if (columnTypes.get("contactList") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Contact' for field 'contactList'");
        }
        if (!sharedRealm.hasTable("class_Contact")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_Contact' for field 'contactList'");
        }
        Table table_14 = sharedRealm.getTable("class_Contact");
        if (!table.getLinkTarget(columnInfo.contactListIndex).hasSameSchema(table_14)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'contactList': '" + table.getLinkTarget(columnInfo.contactListIndex).getName() + "' expected - was '" + table_14.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Group";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static test.mingorto.crackersapp.model.Group createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        test.mingorto.crackersapp.model.Group obj = null;
        if (update) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class), false, Collections.<String> emptyList());
                    obj = new io.realm.GroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("links")) {
                excludeFields.add("links");
            }
            if (json.has("contactList")) {
                excludeFields.add("contactList");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.GroupRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Group.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.GroupRealmProxy) realm.createObjectInternal(test.mingorto.crackersapp.model.Group.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((GroupRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("screenName")) {
            if (json.isNull("screenName")) {
                ((GroupRealmProxyInterface) obj).realmSet$screenName(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$screenName((String) json.getString("screenName"));
            }
        }
        if (json.has("isClosed")) {
            if (json.isNull("isClosed")) {
                ((GroupRealmProxyInterface) obj).realmSet$isClosed(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$isClosed((int) json.getInt("isClosed"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                ((GroupRealmProxyInterface) obj).realmSet$type(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("isAdmin")) {
            if (json.isNull("isAdmin")) {
                ((GroupRealmProxyInterface) obj).realmSet$isAdmin(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$isAdmin((int) json.getInt("isAdmin"));
            }
        }
        if (json.has("isMember")) {
            if (json.isNull("isMember")) {
                ((GroupRealmProxyInterface) obj).realmSet$isMember(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$isMember((int) json.getInt("isMember"));
            }
        }
        if (json.has("photo50")) {
            if (json.isNull("photo50")) {
                ((GroupRealmProxyInterface) obj).realmSet$photo50(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$photo50((String) json.getString("photo50"));
            }
        }
        if (json.has("photo100")) {
            if (json.isNull("photo100")) {
                ((GroupRealmProxyInterface) obj).realmSet$photo100(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$photo100((String) json.getString("photo100"));
            }
        }
        if (json.has("photo200")) {
            if (json.isNull("photo200")) {
                ((GroupRealmProxyInterface) obj).realmSet$photo200(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$photo200((String) json.getString("photo200"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                ((GroupRealmProxyInterface) obj).realmSet$status(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                ((GroupRealmProxyInterface) obj).realmSet$description(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("site")) {
            if (json.isNull("site")) {
                ((GroupRealmProxyInterface) obj).realmSet$site(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmSet$site((String) json.getString("site"));
            }
        }
        if (json.has("links")) {
            if (json.isNull("links")) {
                ((GroupRealmProxyInterface) obj).realmSet$links(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmGet$links().clear();
                JSONArray array = json.getJSONArray("links");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.attachment.Link item = LinkRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((GroupRealmProxyInterface) obj).realmGet$links().add(item);
                }
            }
        }
        if (json.has("contactList")) {
            if (json.isNull("contactList")) {
                ((GroupRealmProxyInterface) obj).realmSet$contactList(null);
            } else {
                ((GroupRealmProxyInterface) obj).realmGet$contactList().clear();
                JSONArray array = json.getJSONArray("contactList");
                for (int i = 0; i < array.length(); i++) {
                    test.mingorto.crackersapp.model.Contact item = ContactRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((GroupRealmProxyInterface) obj).realmGet$contactList().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static test.mingorto.crackersapp.model.Group createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        test.mingorto.crackersapp.model.Group obj = new test.mingorto.crackersapp.model.Group();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("screenName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$screenName(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$screenName((String) reader.nextString());
                }
            } else if (name.equals("isClosed")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$isClosed(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$isClosed((int) reader.nextInt());
                }
            } else if (name.equals("type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$type(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$type((String) reader.nextString());
                }
            } else if (name.equals("isAdmin")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$isAdmin(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$isAdmin((int) reader.nextInt());
                }
            } else if (name.equals("isMember")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$isMember(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$isMember((int) reader.nextInt());
                }
            } else if (name.equals("photo50")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$photo50(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$photo50((String) reader.nextString());
                }
            } else if (name.equals("photo100")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$photo100(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$photo100((String) reader.nextString());
                }
            } else if (name.equals("photo200")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$photo200(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$photo200((String) reader.nextString());
                }
            } else if (name.equals("status")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$status(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$status((String) reader.nextString());
                }
            } else if (name.equals("description")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$description(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$description((String) reader.nextString());
                }
            } else if (name.equals("site")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$site(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$site((String) reader.nextString());
                }
            } else if (name.equals("links")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$links(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$links(new RealmList<test.mingorto.crackersapp.model.attachment.Link>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.attachment.Link item = LinkRealmProxy.createUsingJsonStream(realm, reader);
                        ((GroupRealmProxyInterface) obj).realmGet$links().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("contactList")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((GroupRealmProxyInterface) obj).realmSet$contactList(null);
                } else {
                    ((GroupRealmProxyInterface) obj).realmSet$contactList(new RealmList<test.mingorto.crackersapp.model.Contact>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        test.mingorto.crackersapp.model.Contact item = ContactRealmProxy.createUsingJsonStream(realm, reader);
                        ((GroupRealmProxyInterface) obj).realmGet$contactList().add(item);
                    }
                    reader.endArray();
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

    public static test.mingorto.crackersapp.model.Group copyOrUpdate(Realm realm, test.mingorto.crackersapp.model.Group object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Group) cachedRealmObject;
        }

        test.mingorto.crackersapp.model.Group realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
            long pkColumnIndex = table.getPrimaryKey();
            Number value = ((GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.GroupRealmProxy();
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

    public static test.mingorto.crackersapp.model.Group copy(Realm realm, test.mingorto.crackersapp.model.Group newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (test.mingorto.crackersapp.model.Group) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        test.mingorto.crackersapp.model.Group realmObject = realm.createObjectInternal(test.mingorto.crackersapp.model.Group.class, ((GroupRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        GroupRealmProxyInterface realmObjectSource = (GroupRealmProxyInterface) newObject;
        GroupRealmProxyInterface realmObjectCopy = (GroupRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$screenName(realmObjectSource.realmGet$screenName());
        realmObjectCopy.realmSet$isClosed(realmObjectSource.realmGet$isClosed());
        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectCopy.realmSet$isAdmin(realmObjectSource.realmGet$isAdmin());
        realmObjectCopy.realmSet$isMember(realmObjectSource.realmGet$isMember());
        realmObjectCopy.realmSet$photo50(realmObjectSource.realmGet$photo50());
        realmObjectCopy.realmSet$photo100(realmObjectSource.realmGet$photo100());
        realmObjectCopy.realmSet$photo200(realmObjectSource.realmGet$photo200());
        realmObjectCopy.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectCopy.realmSet$description(realmObjectSource.realmGet$description());
        realmObjectCopy.realmSet$site(realmObjectSource.realmGet$site());

        RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = realmObjectSource.realmGet$links();
        if (linksList != null) {
            RealmList<test.mingorto.crackersapp.model.attachment.Link> linksRealmList = realmObjectCopy.realmGet$links();
            for (int i = 0; i < linksList.size(); i++) {
                test.mingorto.crackersapp.model.attachment.Link linksItem = linksList.get(i);
                test.mingorto.crackersapp.model.attachment.Link cachelinks = (test.mingorto.crackersapp.model.attachment.Link) cache.get(linksItem);
                if (cachelinks != null) {
                    linksRealmList.add(cachelinks);
                } else {
                    linksRealmList.add(LinkRealmProxy.copyOrUpdate(realm, linksItem, update, cache));
                }
            }
        }


        RealmList<test.mingorto.crackersapp.model.Contact> contactListList = realmObjectSource.realmGet$contactList();
        if (contactListList != null) {
            RealmList<test.mingorto.crackersapp.model.Contact> contactListRealmList = realmObjectCopy.realmGet$contactList();
            for (int i = 0; i < contactListList.size(); i++) {
                test.mingorto.crackersapp.model.Contact contactListItem = contactListList.get(i);
                test.mingorto.crackersapp.model.Contact cachecontactList = (test.mingorto.crackersapp.model.Contact) cache.get(contactListItem);
                if (cachecontactList != null) {
                    contactListRealmList.add(cachecontactList);
                } else {
                    contactListRealmList.add(ContactRealmProxy.copyOrUpdate(realm, contactListItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, test.mingorto.crackersapp.model.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((GroupRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((GroupRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((GroupRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$screenName = ((GroupRealmProxyInterface) object).realmGet$screenName();
        if (realmGet$screenName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
        }
        Number realmGet$isClosed = ((GroupRealmProxyInterface) object).realmGet$isClosed();
        if (realmGet$isClosed != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isClosedIndex, rowIndex, realmGet$isClosed.longValue(), false);
        }
        String realmGet$type = ((GroupRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        Number realmGet$isAdmin = ((GroupRealmProxyInterface) object).realmGet$isAdmin();
        if (realmGet$isAdmin != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isAdminIndex, rowIndex, realmGet$isAdmin.longValue(), false);
        }
        Number realmGet$isMember = ((GroupRealmProxyInterface) object).realmGet$isMember();
        if (realmGet$isMember != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isMemberIndex, rowIndex, realmGet$isMember.longValue(), false);
        }
        String realmGet$photo50 = ((GroupRealmProxyInterface) object).realmGet$photo50();
        if (realmGet$photo50 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
        }
        String realmGet$photo100 = ((GroupRealmProxyInterface) object).realmGet$photo100();
        if (realmGet$photo100 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
        }
        String realmGet$photo200 = ((GroupRealmProxyInterface) object).realmGet$photo200();
        if (realmGet$photo200 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo200Index, rowIndex, realmGet$photo200, false);
        }
        String realmGet$status = ((GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$description = ((GroupRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        }
        String realmGet$site = ((GroupRealmProxyInterface) object).realmGet$site();
        if (realmGet$site != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.siteIndex, rowIndex, realmGet$site, false);
        }

        RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = ((GroupRealmProxyInterface) object).realmGet$links();
        if (linksList != null) {
            long linksNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.linksIndex, rowIndex);
            for (test.mingorto.crackersapp.model.attachment.Link linksItem : linksList) {
                Long cacheItemIndexlinks = cache.get(linksItem);
                if (cacheItemIndexlinks == null) {
                    cacheItemIndexlinks = LinkRealmProxy.insert(realm, linksItem, cache);
                }
                LinkView.nativeAdd(linksNativeLinkViewPtr, cacheItemIndexlinks);
            }
        }


        RealmList<test.mingorto.crackersapp.model.Contact> contactListList = ((GroupRealmProxyInterface) object).realmGet$contactList();
        if (contactListList != null) {
            long contactListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.contactListIndex, rowIndex);
            for (test.mingorto.crackersapp.model.Contact contactListItem : contactListList) {
                Long cacheItemIndexcontactList = cache.get(contactListItem);
                if (cacheItemIndexcontactList == null) {
                    cacheItemIndexcontactList = ContactRealmProxy.insert(realm, contactListItem, cache);
                }
                LinkView.nativeAdd(contactListNativeLinkViewPtr, cacheItemIndexcontactList);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Group object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((GroupRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((GroupRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$screenName = ((GroupRealmProxyInterface) object).realmGet$screenName();
            if (realmGet$screenName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
            }
            Number realmGet$isClosed = ((GroupRealmProxyInterface) object).realmGet$isClosed();
            if (realmGet$isClosed != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isClosedIndex, rowIndex, realmGet$isClosed.longValue(), false);
            }
            String realmGet$type = ((GroupRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
            Number realmGet$isAdmin = ((GroupRealmProxyInterface) object).realmGet$isAdmin();
            if (realmGet$isAdmin != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isAdminIndex, rowIndex, realmGet$isAdmin.longValue(), false);
            }
            Number realmGet$isMember = ((GroupRealmProxyInterface) object).realmGet$isMember();
            if (realmGet$isMember != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isMemberIndex, rowIndex, realmGet$isMember.longValue(), false);
            }
            String realmGet$photo50 = ((GroupRealmProxyInterface) object).realmGet$photo50();
            if (realmGet$photo50 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
            }
            String realmGet$photo100 = ((GroupRealmProxyInterface) object).realmGet$photo100();
            if (realmGet$photo100 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
            }
            String realmGet$photo200 = ((GroupRealmProxyInterface) object).realmGet$photo200();
            if (realmGet$photo200 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo200Index, rowIndex, realmGet$photo200, false);
            }
            String realmGet$status = ((GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$description = ((GroupRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            }
            String realmGet$site = ((GroupRealmProxyInterface) object).realmGet$site();
            if (realmGet$site != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.siteIndex, rowIndex, realmGet$site, false);
            }

            RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = ((GroupRealmProxyInterface) object).realmGet$links();
            if (linksList != null) {
                long linksNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.linksIndex, rowIndex);
                for (test.mingorto.crackersapp.model.attachment.Link linksItem : linksList) {
                    Long cacheItemIndexlinks = cache.get(linksItem);
                    if (cacheItemIndexlinks == null) {
                        cacheItemIndexlinks = LinkRealmProxy.insert(realm, linksItem, cache);
                    }
                    LinkView.nativeAdd(linksNativeLinkViewPtr, cacheItemIndexlinks);
                }
            }

            RealmList<test.mingorto.crackersapp.model.Contact> contactListList = ((GroupRealmProxyInterface) object).realmGet$contactList();
            if (contactListList != null) {
                long contactListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.contactListIndex, rowIndex);
                for (test.mingorto.crackersapp.model.Contact contactListItem : contactListList) {
                    Long cacheItemIndexcontactList = cache.get(contactListItem);
                    if (cacheItemIndexcontactList == null) {
                        cacheItemIndexcontactList = ContactRealmProxy.insert(realm, contactListItem, cache);
                    }
                    LinkView.nativeAdd(contactListNativeLinkViewPtr, cacheItemIndexcontactList);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, test.mingorto.crackersapp.model.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((GroupRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((GroupRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, ((GroupRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$screenName = ((GroupRealmProxyInterface) object).realmGet$screenName();
        if (realmGet$screenName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.screenNameIndex, rowIndex, false);
        }
        Number realmGet$isClosed = ((GroupRealmProxyInterface) object).realmGet$isClosed();
        if (realmGet$isClosed != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isClosedIndex, rowIndex, realmGet$isClosed.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isClosedIndex, rowIndex, false);
        }
        String realmGet$type = ((GroupRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        Number realmGet$isAdmin = ((GroupRealmProxyInterface) object).realmGet$isAdmin();
        if (realmGet$isAdmin != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isAdminIndex, rowIndex, realmGet$isAdmin.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isAdminIndex, rowIndex, false);
        }
        Number realmGet$isMember = ((GroupRealmProxyInterface) object).realmGet$isMember();
        if (realmGet$isMember != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.isMemberIndex, rowIndex, realmGet$isMember.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isMemberIndex, rowIndex, false);
        }
        String realmGet$photo50 = ((GroupRealmProxyInterface) object).realmGet$photo50();
        if (realmGet$photo50 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo50Index, rowIndex, false);
        }
        String realmGet$photo100 = ((GroupRealmProxyInterface) object).realmGet$photo100();
        if (realmGet$photo100 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo100Index, rowIndex, false);
        }
        String realmGet$photo200 = ((GroupRealmProxyInterface) object).realmGet$photo200();
        if (realmGet$photo200 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo200Index, rowIndex, realmGet$photo200, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo200Index, rowIndex, false);
        }
        String realmGet$status = ((GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$description = ((GroupRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
        }
        String realmGet$site = ((GroupRealmProxyInterface) object).realmGet$site();
        if (realmGet$site != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.siteIndex, rowIndex, realmGet$site, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.siteIndex, rowIndex, false);
        }

        long linksNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.linksIndex, rowIndex);
        LinkView.nativeClear(linksNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = ((GroupRealmProxyInterface) object).realmGet$links();
        if (linksList != null) {
            for (test.mingorto.crackersapp.model.attachment.Link linksItem : linksList) {
                Long cacheItemIndexlinks = cache.get(linksItem);
                if (cacheItemIndexlinks == null) {
                    cacheItemIndexlinks = LinkRealmProxy.insertOrUpdate(realm, linksItem, cache);
                }
                LinkView.nativeAdd(linksNativeLinkViewPtr, cacheItemIndexlinks);
            }
        }


        long contactListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.contactListIndex, rowIndex);
        LinkView.nativeClear(contactListNativeLinkViewPtr);
        RealmList<test.mingorto.crackersapp.model.Contact> contactListList = ((GroupRealmProxyInterface) object).realmGet$contactList();
        if (contactListList != null) {
            for (test.mingorto.crackersapp.model.Contact contactListItem : contactListList) {
                Long cacheItemIndexcontactList = cache.get(contactListItem);
                if (cacheItemIndexcontactList == null) {
                    cacheItemIndexcontactList = ContactRealmProxy.insertOrUpdate(realm, contactListItem, cache);
                }
                LinkView.nativeAdd(contactListNativeLinkViewPtr, cacheItemIndexcontactList);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(test.mingorto.crackersapp.model.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.schema.getColumnInfo(test.mingorto.crackersapp.model.Group.class);
        long pkColumnIndex = table.getPrimaryKey();
        test.mingorto.crackersapp.model.Group object = null;
        while (objects.hasNext()) {
            object = (test.mingorto.crackersapp.model.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((GroupRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, ((GroupRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$screenName = ((GroupRealmProxyInterface) object).realmGet$screenName();
            if (realmGet$screenName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.screenNameIndex, rowIndex, realmGet$screenName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.screenNameIndex, rowIndex, false);
            }
            Number realmGet$isClosed = ((GroupRealmProxyInterface) object).realmGet$isClosed();
            if (realmGet$isClosed != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isClosedIndex, rowIndex, realmGet$isClosed.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isClosedIndex, rowIndex, false);
            }
            String realmGet$type = ((GroupRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            Number realmGet$isAdmin = ((GroupRealmProxyInterface) object).realmGet$isAdmin();
            if (realmGet$isAdmin != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isAdminIndex, rowIndex, realmGet$isAdmin.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isAdminIndex, rowIndex, false);
            }
            Number realmGet$isMember = ((GroupRealmProxyInterface) object).realmGet$isMember();
            if (realmGet$isMember != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.isMemberIndex, rowIndex, realmGet$isMember.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isMemberIndex, rowIndex, false);
            }
            String realmGet$photo50 = ((GroupRealmProxyInterface) object).realmGet$photo50();
            if (realmGet$photo50 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo50Index, rowIndex, realmGet$photo50, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo50Index, rowIndex, false);
            }
            String realmGet$photo100 = ((GroupRealmProxyInterface) object).realmGet$photo100();
            if (realmGet$photo100 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo100Index, rowIndex, realmGet$photo100, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo100Index, rowIndex, false);
            }
            String realmGet$photo200 = ((GroupRealmProxyInterface) object).realmGet$photo200();
            if (realmGet$photo200 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo200Index, rowIndex, realmGet$photo200, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo200Index, rowIndex, false);
            }
            String realmGet$status = ((GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$description = ((GroupRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
            }
            String realmGet$site = ((GroupRealmProxyInterface) object).realmGet$site();
            if (realmGet$site != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.siteIndex, rowIndex, realmGet$site, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.siteIndex, rowIndex, false);
            }

            long linksNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.linksIndex, rowIndex);
            LinkView.nativeClear(linksNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = ((GroupRealmProxyInterface) object).realmGet$links();
            if (linksList != null) {
                for (test.mingorto.crackersapp.model.attachment.Link linksItem : linksList) {
                    Long cacheItemIndexlinks = cache.get(linksItem);
                    if (cacheItemIndexlinks == null) {
                        cacheItemIndexlinks = LinkRealmProxy.insertOrUpdate(realm, linksItem, cache);
                    }
                    LinkView.nativeAdd(linksNativeLinkViewPtr, cacheItemIndexlinks);
                }
            }


            long contactListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.contactListIndex, rowIndex);
            LinkView.nativeClear(contactListNativeLinkViewPtr);
            RealmList<test.mingorto.crackersapp.model.Contact> contactListList = ((GroupRealmProxyInterface) object).realmGet$contactList();
            if (contactListList != null) {
                for (test.mingorto.crackersapp.model.Contact contactListItem : contactListList) {
                    Long cacheItemIndexcontactList = cache.get(contactListItem);
                    if (cacheItemIndexcontactList == null) {
                        cacheItemIndexcontactList = ContactRealmProxy.insertOrUpdate(realm, contactListItem, cache);
                    }
                    LinkView.nativeAdd(contactListNativeLinkViewPtr, cacheItemIndexcontactList);
                }
            }

        }
    }

    public static test.mingorto.crackersapp.model.Group createDetachedCopy(test.mingorto.crackersapp.model.Group realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        test.mingorto.crackersapp.model.Group unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new test.mingorto.crackersapp.model.Group();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (test.mingorto.crackersapp.model.Group) cachedObject.object;
            }
            unmanagedObject = (test.mingorto.crackersapp.model.Group) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        GroupRealmProxyInterface unmanagedCopy = (GroupRealmProxyInterface) unmanagedObject;
        GroupRealmProxyInterface realmSource = (GroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$screenName(realmSource.realmGet$screenName());
        unmanagedCopy.realmSet$isClosed(realmSource.realmGet$isClosed());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$isAdmin(realmSource.realmGet$isAdmin());
        unmanagedCopy.realmSet$isMember(realmSource.realmGet$isMember());
        unmanagedCopy.realmSet$photo50(realmSource.realmGet$photo50());
        unmanagedCopy.realmSet$photo100(realmSource.realmGet$photo100());
        unmanagedCopy.realmSet$photo200(realmSource.realmGet$photo200());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());
        unmanagedCopy.realmSet$site(realmSource.realmGet$site());

        // Deep copy of links
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$links(null);
        } else {
            RealmList<test.mingorto.crackersapp.model.attachment.Link> managedlinksList = realmSource.realmGet$links();
            RealmList<test.mingorto.crackersapp.model.attachment.Link> unmanagedlinksList = new RealmList<test.mingorto.crackersapp.model.attachment.Link>();
            unmanagedCopy.realmSet$links(unmanagedlinksList);
            int nextDepth = currentDepth + 1;
            int size = managedlinksList.size();
            for (int i = 0; i < size; i++) {
                test.mingorto.crackersapp.model.attachment.Link item = LinkRealmProxy.createDetachedCopy(managedlinksList.get(i), nextDepth, maxDepth, cache);
                unmanagedlinksList.add(item);
            }
        }

        // Deep copy of contactList
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$contactList(null);
        } else {
            RealmList<test.mingorto.crackersapp.model.Contact> managedcontactListList = realmSource.realmGet$contactList();
            RealmList<test.mingorto.crackersapp.model.Contact> unmanagedcontactListList = new RealmList<test.mingorto.crackersapp.model.Contact>();
            unmanagedCopy.realmSet$contactList(unmanagedcontactListList);
            int nextDepth = currentDepth + 1;
            int size = managedcontactListList.size();
            for (int i = 0; i < size; i++) {
                test.mingorto.crackersapp.model.Contact item = ContactRealmProxy.createDetachedCopy(managedcontactListList.get(i), nextDepth, maxDepth, cache);
                unmanagedcontactListList.add(item);
            }
        }
        return unmanagedObject;
    }

    static test.mingorto.crackersapp.model.Group update(Realm realm, test.mingorto.crackersapp.model.Group realmObject, test.mingorto.crackersapp.model.Group newObject, Map<RealmModel, RealmObjectProxy> cache) {
        GroupRealmProxyInterface realmObjectTarget = (GroupRealmProxyInterface) realmObject;
        GroupRealmProxyInterface realmObjectSource = (GroupRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$screenName(realmObjectSource.realmGet$screenName());
        realmObjectTarget.realmSet$isClosed(realmObjectSource.realmGet$isClosed());
        realmObjectTarget.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectTarget.realmSet$isAdmin(realmObjectSource.realmGet$isAdmin());
        realmObjectTarget.realmSet$isMember(realmObjectSource.realmGet$isMember());
        realmObjectTarget.realmSet$photo50(realmObjectSource.realmGet$photo50());
        realmObjectTarget.realmSet$photo100(realmObjectSource.realmGet$photo100());
        realmObjectTarget.realmSet$photo200(realmObjectSource.realmGet$photo200());
        realmObjectTarget.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectTarget.realmSet$description(realmObjectSource.realmGet$description());
        realmObjectTarget.realmSet$site(realmObjectSource.realmGet$site());
        RealmList<test.mingorto.crackersapp.model.attachment.Link> linksList = realmObjectSource.realmGet$links();
        RealmList<test.mingorto.crackersapp.model.attachment.Link> linksRealmList = realmObjectTarget.realmGet$links();
        linksRealmList.clear();
        if (linksList != null) {
            for (int i = 0; i < linksList.size(); i++) {
                test.mingorto.crackersapp.model.attachment.Link linksItem = linksList.get(i);
                test.mingorto.crackersapp.model.attachment.Link cachelinks = (test.mingorto.crackersapp.model.attachment.Link) cache.get(linksItem);
                if (cachelinks != null) {
                    linksRealmList.add(cachelinks);
                } else {
                    linksRealmList.add(LinkRealmProxy.copyOrUpdate(realm, linksItem, true, cache));
                }
            }
        }
        RealmList<test.mingorto.crackersapp.model.Contact> contactListList = realmObjectSource.realmGet$contactList();
        RealmList<test.mingorto.crackersapp.model.Contact> contactListRealmList = realmObjectTarget.realmGet$contactList();
        contactListRealmList.clear();
        if (contactListList != null) {
            for (int i = 0; i < contactListList.size(); i++) {
                test.mingorto.crackersapp.model.Contact contactListItem = contactListList.get(i);
                test.mingorto.crackersapp.model.Contact cachecontactList = (test.mingorto.crackersapp.model.Contact) cache.get(contactListItem);
                if (cachecontactList != null) {
                    contactListRealmList.add(cachecontactList);
                } else {
                    contactListRealmList.add(ContactRealmProxy.copyOrUpdate(realm, contactListItem, true, cache));
                }
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
        StringBuilder stringBuilder = new StringBuilder("Group = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{screenName:");
        stringBuilder.append(realmGet$screenName() != null ? realmGet$screenName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isClosed:");
        stringBuilder.append(realmGet$isClosed() != null ? realmGet$isClosed() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isAdmin:");
        stringBuilder.append(realmGet$isAdmin() != null ? realmGet$isAdmin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isMember:");
        stringBuilder.append(realmGet$isMember() != null ? realmGet$isMember() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo50:");
        stringBuilder.append(realmGet$photo50() != null ? realmGet$photo50() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo100:");
        stringBuilder.append(realmGet$photo100() != null ? realmGet$photo100() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo200:");
        stringBuilder.append(realmGet$photo200() != null ? realmGet$photo200() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{site:");
        stringBuilder.append(realmGet$site() != null ? realmGet$site() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{links:");
        stringBuilder.append("RealmList<Link>[").append(realmGet$links().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contactList:");
        stringBuilder.append("RealmList<Contact>[").append(realmGet$contactList().size()).append("]");
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
        GroupRealmProxy aGroup = (GroupRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGroup.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGroup.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
