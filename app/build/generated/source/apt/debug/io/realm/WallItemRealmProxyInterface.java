package io.realm;


public interface WallItemRealmProxyInterface {
    public String realmGet$attachmentsString();
    public void realmSet$attachmentsString(String value);
    public String realmGet$senderName();
    public void realmSet$senderName(String value);
    public String realmGet$senderPhoto();
    public void realmSet$senderPhoto(String value);
    public Integer realmGet$id();
    public void realmSet$id(Integer value);
    public Integer realmGet$fromId();
    public void realmSet$fromId(Integer value);
    public Integer realmGet$ownerId();
    public void realmSet$ownerId(Integer value);
    public Integer realmGet$date();
    public void realmSet$date(Integer value);
    public Integer realmGet$markedAsAds();
    public void realmSet$markedAsAds(Integer value);
    public String realmGet$postType();
    public void realmSet$postType(String value);
    public String realmGet$text();
    public void realmSet$text(String value);
    public Integer realmGet$canPin();
    public void realmSet$canPin(Integer value);
    public RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> realmGet$attachments();
    public void realmSet$attachments(RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> value);
    public RealmList<test.mingorto.crackersapp.model.WallItem> realmGet$copyHistory();
    public void realmSet$copyHistory(RealmList<test.mingorto.crackersapp.model.WallItem> value);
    public test.mingorto.crackersapp.model.PostSource realmGet$postSource();
    public void realmSet$postSource(test.mingorto.crackersapp.model.PostSource value);
    public test.mingorto.crackersapp.model.countable.Comments realmGet$comments();
    public void realmSet$comments(test.mingorto.crackersapp.model.countable.Comments value);
    public test.mingorto.crackersapp.model.countable.Likes realmGet$likes();
    public void realmSet$likes(test.mingorto.crackersapp.model.countable.Likes value);
    public test.mingorto.crackersapp.model.countable.Reposts realmGet$reposts();
    public void realmSet$reposts(test.mingorto.crackersapp.model.countable.Reposts value);
    public test.mingorto.crackersapp.model.Views realmGet$views();
    public void realmSet$views(test.mingorto.crackersapp.model.Views value);
}
