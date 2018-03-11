package io.realm;


public interface CommentItemRealmProxyInterface {
    public int realmGet$id();
    public void realmSet$id(int value);
    public int realmGet$senderId();
    public void realmSet$senderId(int value);
    public test.mingorto.crackersapp.model.Place realmGet$place();
    public void realmSet$place(test.mingorto.crackersapp.model.Place value);
    public String realmGet$senderName();
    public void realmSet$senderName(String value);
    public String realmGet$senderPhoto();
    public void realmSet$senderPhoto(String value);
    public int realmGet$date();
    public void realmSet$date(int value);
    public String realmGet$text();
    public void realmSet$text(String value);
    public RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> realmGet$attachments();
    public void realmSet$attachments(RealmList<test.mingorto.crackersapp.model.attachment.ApiAttachment> value);
    public String realmGet$attachmentsString();
    public void realmSet$attachmentsString(String value);
    public test.mingorto.crackersapp.model.countable.Likes realmGet$likes();
    public void realmSet$likes(test.mingorto.crackersapp.model.countable.Likes value);
    public test.mingorto.crackersapp.model.countable.Reposts realmGet$reposts();
    public void realmSet$reposts(test.mingorto.crackersapp.model.countable.Reposts value);
    public boolean realmGet$isFromTopic();
    public void realmSet$isFromTopic(boolean value);
}
