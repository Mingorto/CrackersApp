package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>();
        modelClasses.add(test.mingorto.crackersapp.model.Place.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.doc.Preview.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.Audio.class);
        modelClasses.add(test.mingorto.crackersapp.model.CommentItem.class);
        modelClasses.add(test.mingorto.crackersapp.model.Views.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.video.Video.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class);
        modelClasses.add(test.mingorto.crackersapp.model.countable.Reposts.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.doc.Doc.class);
        modelClasses.add(test.mingorto.crackersapp.model.Contact.class);
        modelClasses.add(test.mingorto.crackersapp.model.WallItem.class);
        modelClasses.add(test.mingorto.crackersapp.model.Topic.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.Page.class);
        modelClasses.add(test.mingorto.crackersapp.model.countable.Likes.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.Link.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.Photo.class);
        modelClasses.add(test.mingorto.crackersapp.model.Group.class);
        modelClasses.add(test.mingorto.crackersapp.model.Profile.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.video.File.class);
        modelClasses.add(test.mingorto.crackersapp.model.PostSource.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.ApiAttachment.class);
        modelClasses.add(test.mingorto.crackersapp.model.attachment.doc.Size.class);
        modelClasses.add(test.mingorto.crackersapp.model.countable.Comments.class);
        modelClasses.add(test.mingorto.crackersapp.model.Member.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>();
        infoMap.put(test.mingorto.crackersapp.model.Place.class, io.realm.PlaceRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.doc.Preview.class, io.realm.PreviewRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.Audio.class, io.realm.AudioRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.CommentItem.class, io.realm.CommentItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Views.class, io.realm.ViewsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.video.Video.class, io.realm.VideoRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class, io.realm.PhotoPreviewRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.countable.Reposts.class, io.realm.RepostsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.doc.Doc.class, io.realm.DocRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Contact.class, io.realm.ContactRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.WallItem.class, io.realm.WallItemRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Topic.class, io.realm.TopicRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.Page.class, io.realm.PageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.countable.Likes.class, io.realm.LikesRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.Link.class, io.realm.LinkRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.Photo.class, io.realm.PhotoRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Group.class, io.realm.GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Profile.class, io.realm.ProfileRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.video.File.class, io.realm.FileRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.PostSource.class, io.realm.PostSourceRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.ApiAttachment.class, io.realm.ApiAttachmentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.attachment.doc.Size.class, io.realm.SizeRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.countable.Comments.class, io.realm.CommentsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(test.mingorto.crackersapp.model.Member.class, io.realm.MemberRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm, boolean allowExtraColumns) {
        checkClass(clazz);

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return io.realm.PlaceRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return io.realm.PreviewRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return io.realm.AudioRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return io.realm.CommentItemRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return io.realm.ViewsRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return io.realm.VideoRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return io.realm.PhotoPreviewRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return io.realm.RepostsRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return io.realm.DocRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return io.realm.ContactRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return io.realm.WallItemRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return io.realm.TopicRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return io.realm.PageRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return io.realm.LikesRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return io.realm.LinkRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return io.realm.PhotoRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return io.realm.GroupRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return io.realm.ProfileRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return io.realm.FileRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return io.realm.PostSourceRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return io.realm.ApiAttachmentRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return io.realm.SizeRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return io.realm.CommentsRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return io.realm.MemberRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return io.realm.PlaceRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return io.realm.PreviewRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return io.realm.AudioRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return io.realm.CommentItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return io.realm.ViewsRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return io.realm.VideoRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return io.realm.PhotoPreviewRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return io.realm.RepostsRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return io.realm.DocRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return io.realm.ContactRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return io.realm.WallItemRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return io.realm.TopicRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return io.realm.PageRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return io.realm.LikesRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return io.realm.LinkRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return io.realm.PhotoRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return io.realm.GroupRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return io.realm.ProfileRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return io.realm.FileRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return io.realm.PostSourceRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return io.realm.ApiAttachmentRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return io.realm.SizeRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return io.realm.CommentsRealmProxy.getFieldNames();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return io.realm.MemberRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return io.realm.PlaceRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return io.realm.PreviewRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return io.realm.AudioRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return io.realm.CommentItemRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return io.realm.ViewsRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return io.realm.VideoRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return io.realm.PhotoPreviewRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return io.realm.RepostsRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return io.realm.DocRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return io.realm.ContactRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return io.realm.WallItemRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return io.realm.TopicRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return io.realm.PageRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return io.realm.LikesRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return io.realm.LinkRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return io.realm.PhotoRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return io.realm.GroupRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return io.realm.ProfileRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return io.realm.FileRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return io.realm.PostSourceRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return io.realm.ApiAttachmentRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return io.realm.SizeRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return io.realm.CommentsRealmProxy.getTableName();
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return io.realm.MemberRealmProxy.getTableName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
                return clazz.cast(new io.realm.PlaceRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
                return clazz.cast(new io.realm.PreviewRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
                return clazz.cast(new io.realm.AudioRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
                return clazz.cast(new io.realm.CommentItemRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
                return clazz.cast(new io.realm.ViewsRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
                return clazz.cast(new io.realm.VideoRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
                return clazz.cast(new io.realm.PhotoPreviewRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
                return clazz.cast(new io.realm.RepostsRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
                return clazz.cast(new io.realm.DocRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
                return clazz.cast(new io.realm.ContactRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
                return clazz.cast(new io.realm.WallItemRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
                return clazz.cast(new io.realm.TopicRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
                return clazz.cast(new io.realm.PageRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
                return clazz.cast(new io.realm.LikesRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
                return clazz.cast(new io.realm.LinkRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
                return clazz.cast(new io.realm.PhotoRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
                return clazz.cast(new io.realm.GroupRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
                return clazz.cast(new io.realm.ProfileRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
                return clazz.cast(new io.realm.FileRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
                return clazz.cast(new io.realm.PostSourceRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
                return clazz.cast(new io.realm.ApiAttachmentRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
                return clazz.cast(new io.realm.SizeRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
                return clazz.cast(new io.realm.CommentsRealmProxy());
            }
            if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
                return clazz.cast(new io.realm.MemberRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return clazz.cast(io.realm.PlaceRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Place) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return clazz.cast(io.realm.PreviewRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Preview) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return clazz.cast(io.realm.AudioRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Audio) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return clazz.cast(io.realm.CommentItemRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.CommentItem) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return clazz.cast(io.realm.ViewsRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Views) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return clazz.cast(io.realm.VideoRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.Video) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return clazz.cast(io.realm.PhotoPreviewRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return clazz.cast(io.realm.RepostsRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Reposts) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return clazz.cast(io.realm.DocRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Doc) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return clazz.cast(io.realm.ContactRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Contact) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return clazz.cast(io.realm.WallItemRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.WallItem) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return clazz.cast(io.realm.TopicRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Topic) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return clazz.cast(io.realm.PageRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Page) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return clazz.cast(io.realm.LikesRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Likes) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return clazz.cast(io.realm.LinkRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Link) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return clazz.cast(io.realm.PhotoRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Photo) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return clazz.cast(io.realm.GroupRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Group) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return clazz.cast(io.realm.ProfileRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Profile) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return clazz.cast(io.realm.FileRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.File) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return clazz.cast(io.realm.PostSourceRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.PostSource) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return clazz.cast(io.realm.ApiAttachmentRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.ApiAttachment) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return clazz.cast(io.realm.SizeRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Size) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return clazz.cast(io.realm.CommentsRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Comments) obj, update, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return clazz.cast(io.realm.MemberRealmProxy.copyOrUpdate(realm, (test.mingorto.crackersapp.model.Member) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            io.realm.PlaceRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Place) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            io.realm.PreviewRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Preview) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            io.realm.AudioRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Audio) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            io.realm.CommentItemRealmProxy.insert(realm, (test.mingorto.crackersapp.model.CommentItem) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            io.realm.ViewsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Views) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            io.realm.VideoRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.video.Video) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            io.realm.PhotoPreviewRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            io.realm.RepostsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Reposts) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            io.realm.DocRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Doc) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            io.realm.ContactRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Contact) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            io.realm.WallItemRealmProxy.insert(realm, (test.mingorto.crackersapp.model.WallItem) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            io.realm.TopicRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Topic) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            io.realm.PageRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Page) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            io.realm.LikesRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Likes) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            io.realm.LinkRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Link) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            io.realm.PhotoRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Photo) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            io.realm.GroupRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Group) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            io.realm.ProfileRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Profile) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            io.realm.FileRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.video.File) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            io.realm.PostSourceRealmProxy.insert(realm, (test.mingorto.crackersapp.model.PostSource) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            io.realm.ApiAttachmentRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.ApiAttachment) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            io.realm.SizeRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Size) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            io.realm.CommentsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Comments) object, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            io.realm.MemberRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Member) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
                io.realm.PlaceRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Place) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
                io.realm.PreviewRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Preview) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
                io.realm.AudioRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Audio) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
                io.realm.CommentItemRealmProxy.insert(realm, (test.mingorto.crackersapp.model.CommentItem) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
                io.realm.ViewsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Views) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
                io.realm.VideoRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.video.Video) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
                io.realm.PhotoPreviewRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
                io.realm.RepostsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Reposts) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
                io.realm.DocRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Doc) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
                io.realm.ContactRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Contact) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
                io.realm.WallItemRealmProxy.insert(realm, (test.mingorto.crackersapp.model.WallItem) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
                io.realm.TopicRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Topic) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
                io.realm.PageRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Page) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
                io.realm.LikesRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Likes) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
                io.realm.LinkRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Link) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
                io.realm.PhotoRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.Photo) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
                io.realm.GroupRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Group) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
                io.realm.ProfileRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Profile) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
                io.realm.FileRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.video.File) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
                io.realm.PostSourceRealmProxy.insert(realm, (test.mingorto.crackersapp.model.PostSource) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
                io.realm.ApiAttachmentRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.ApiAttachment) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
                io.realm.SizeRealmProxy.insert(realm, (test.mingorto.crackersapp.model.attachment.doc.Size) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
                io.realm.CommentsRealmProxy.insert(realm, (test.mingorto.crackersapp.model.countable.Comments) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
                io.realm.MemberRealmProxy.insert(realm, (test.mingorto.crackersapp.model.Member) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
                    io.realm.PlaceRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
                    io.realm.PreviewRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
                    io.realm.AudioRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
                    io.realm.CommentItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
                    io.realm.ViewsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
                    io.realm.VideoRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
                    io.realm.PhotoPreviewRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
                    io.realm.RepostsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
                    io.realm.DocRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
                    io.realm.ContactRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
                    io.realm.WallItemRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
                    io.realm.TopicRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
                    io.realm.PageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
                    io.realm.LikesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
                    io.realm.LinkRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
                    io.realm.PhotoRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
                    io.realm.GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
                    io.realm.ProfileRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
                    io.realm.FileRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
                    io.realm.PostSourceRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
                    io.realm.ApiAttachmentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
                    io.realm.SizeRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
                    io.realm.CommentsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
                    io.realm.MemberRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            io.realm.PlaceRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Place) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            io.realm.PreviewRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Preview) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            io.realm.AudioRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Audio) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            io.realm.CommentItemRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.CommentItem) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            io.realm.ViewsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Views) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            io.realm.VideoRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.Video) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            io.realm.PhotoPreviewRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            io.realm.RepostsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Reposts) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            io.realm.DocRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Doc) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            io.realm.ContactRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Contact) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            io.realm.WallItemRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.WallItem) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            io.realm.TopicRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Topic) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            io.realm.PageRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Page) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            io.realm.LikesRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Likes) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            io.realm.LinkRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Link) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            io.realm.PhotoRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Photo) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            io.realm.GroupRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Group) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            io.realm.ProfileRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Profile) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            io.realm.FileRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.File) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            io.realm.PostSourceRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.PostSource) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            io.realm.ApiAttachmentRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.ApiAttachment) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            io.realm.SizeRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Size) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            io.realm.CommentsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Comments) obj, cache);
        } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            io.realm.MemberRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Member) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
                io.realm.PlaceRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Place) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
                io.realm.PreviewRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Preview) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
                io.realm.AudioRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Audio) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
                io.realm.CommentItemRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.CommentItem) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
                io.realm.ViewsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Views) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
                io.realm.VideoRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.Video) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
                io.realm.PhotoPreviewRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
                io.realm.RepostsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Reposts) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
                io.realm.DocRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Doc) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
                io.realm.ContactRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Contact) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
                io.realm.WallItemRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.WallItem) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
                io.realm.TopicRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Topic) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
                io.realm.PageRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Page) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
                io.realm.LikesRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Likes) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
                io.realm.LinkRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Link) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
                io.realm.PhotoRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.Photo) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
                io.realm.GroupRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Group) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
                io.realm.ProfileRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Profile) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
                io.realm.FileRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.video.File) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
                io.realm.PostSourceRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.PostSource) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
                io.realm.ApiAttachmentRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.ApiAttachment) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
                io.realm.SizeRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.attachment.doc.Size) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
                io.realm.CommentsRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.countable.Comments) object, cache);
            } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
                io.realm.MemberRealmProxy.insertOrUpdate(realm, (test.mingorto.crackersapp.model.Member) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
                    io.realm.PlaceRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
                    io.realm.PreviewRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
                    io.realm.AudioRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
                    io.realm.CommentItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
                    io.realm.ViewsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
                    io.realm.VideoRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
                    io.realm.PhotoPreviewRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
                    io.realm.RepostsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
                    io.realm.DocRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
                    io.realm.ContactRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
                    io.realm.WallItemRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
                    io.realm.TopicRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
                    io.realm.PageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
                    io.realm.LikesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
                    io.realm.LinkRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
                    io.realm.PhotoRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
                    io.realm.GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
                    io.realm.ProfileRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
                    io.realm.FileRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
                    io.realm.PostSourceRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
                    io.realm.ApiAttachmentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
                    io.realm.SizeRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
                    io.realm.CommentsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
                    io.realm.MemberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return clazz.cast(io.realm.PlaceRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return clazz.cast(io.realm.PreviewRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return clazz.cast(io.realm.AudioRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return clazz.cast(io.realm.CommentItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return clazz.cast(io.realm.ViewsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return clazz.cast(io.realm.VideoRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return clazz.cast(io.realm.PhotoPreviewRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return clazz.cast(io.realm.RepostsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return clazz.cast(io.realm.DocRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return clazz.cast(io.realm.ContactRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return clazz.cast(io.realm.WallItemRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return clazz.cast(io.realm.TopicRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return clazz.cast(io.realm.PageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return clazz.cast(io.realm.LikesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return clazz.cast(io.realm.LinkRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return clazz.cast(io.realm.PhotoRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return clazz.cast(io.realm.GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return clazz.cast(io.realm.ProfileRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return clazz.cast(io.realm.FileRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return clazz.cast(io.realm.PostSourceRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return clazz.cast(io.realm.ApiAttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return clazz.cast(io.realm.SizeRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return clazz.cast(io.realm.CommentsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return clazz.cast(io.realm.MemberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return clazz.cast(io.realm.PlaceRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return clazz.cast(io.realm.PreviewRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return clazz.cast(io.realm.AudioRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return clazz.cast(io.realm.CommentItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return clazz.cast(io.realm.ViewsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return clazz.cast(io.realm.VideoRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return clazz.cast(io.realm.PhotoPreviewRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return clazz.cast(io.realm.RepostsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return clazz.cast(io.realm.DocRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return clazz.cast(io.realm.ContactRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return clazz.cast(io.realm.WallItemRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return clazz.cast(io.realm.TopicRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return clazz.cast(io.realm.PageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return clazz.cast(io.realm.LikesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return clazz.cast(io.realm.LinkRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return clazz.cast(io.realm.PhotoRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return clazz.cast(io.realm.GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return clazz.cast(io.realm.ProfileRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return clazz.cast(io.realm.FileRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return clazz.cast(io.realm.PostSourceRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return clazz.cast(io.realm.ApiAttachmentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return clazz.cast(io.realm.SizeRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return clazz.cast(io.realm.CommentsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return clazz.cast(io.realm.MemberRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(test.mingorto.crackersapp.model.Place.class)) {
            return clazz.cast(io.realm.PlaceRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Place) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Preview.class)) {
            return clazz.cast(io.realm.PreviewRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.doc.Preview) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Audio.class)) {
            return clazz.cast(io.realm.AudioRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.Audio) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.CommentItem.class)) {
            return clazz.cast(io.realm.CommentItemRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.CommentItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Views.class)) {
            return clazz.cast(io.realm.ViewsRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Views) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.Video.class)) {
            return clazz.cast(io.realm.VideoRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.video.Video) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.PhotoPreview.class)) {
            return clazz.cast(io.realm.PhotoPreviewRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.doc.PhotoPreview) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Reposts.class)) {
            return clazz.cast(io.realm.RepostsRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.countable.Reposts) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Doc.class)) {
            return clazz.cast(io.realm.DocRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.doc.Doc) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Contact.class)) {
            return clazz.cast(io.realm.ContactRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Contact) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.WallItem.class)) {
            return clazz.cast(io.realm.WallItemRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.WallItem) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Topic.class)) {
            return clazz.cast(io.realm.TopicRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Topic) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Page.class)) {
            return clazz.cast(io.realm.PageRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.Page) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Likes.class)) {
            return clazz.cast(io.realm.LikesRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.countable.Likes) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Link.class)) {
            return clazz.cast(io.realm.LinkRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.Link) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.Photo.class)) {
            return clazz.cast(io.realm.PhotoRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.Photo) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Group.class)) {
            return clazz.cast(io.realm.GroupRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Profile.class)) {
            return clazz.cast(io.realm.ProfileRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Profile) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.video.File.class)) {
            return clazz.cast(io.realm.FileRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.video.File) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.PostSource.class)) {
            return clazz.cast(io.realm.PostSourceRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.PostSource) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.ApiAttachment.class)) {
            return clazz.cast(io.realm.ApiAttachmentRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.ApiAttachment) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.attachment.doc.Size.class)) {
            return clazz.cast(io.realm.SizeRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.attachment.doc.Size) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.countable.Comments.class)) {
            return clazz.cast(io.realm.CommentsRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.countable.Comments) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(test.mingorto.crackersapp.model.Member.class)) {
            return clazz.cast(io.realm.MemberRealmProxy.createDetachedCopy((test.mingorto.crackersapp.model.Member) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
