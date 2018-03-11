package io.realm;


public interface GroupRealmProxyInterface {
    public Integer realmGet$id();
    public void realmSet$id(Integer value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$screenName();
    public void realmSet$screenName(String value);
    public Integer realmGet$isClosed();
    public void realmSet$isClosed(Integer value);
    public String realmGet$type();
    public void realmSet$type(String value);
    public Integer realmGet$isAdmin();
    public void realmSet$isAdmin(Integer value);
    public Integer realmGet$isMember();
    public void realmSet$isMember(Integer value);
    public String realmGet$photo50();
    public void realmSet$photo50(String value);
    public String realmGet$photo100();
    public void realmSet$photo100(String value);
    public String realmGet$photo200();
    public void realmSet$photo200(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$description();
    public void realmSet$description(String value);
    public String realmGet$site();
    public void realmSet$site(String value);
    public RealmList<test.mingorto.crackersapp.model.attachment.Link> realmGet$links();
    public void realmSet$links(RealmList<test.mingorto.crackersapp.model.attachment.Link> value);
    public RealmList<test.mingorto.crackersapp.model.Contact> realmGet$contactList();
    public void realmSet$contactList(RealmList<test.mingorto.crackersapp.model.Contact> value);
}
