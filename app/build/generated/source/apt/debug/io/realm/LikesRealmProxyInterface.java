package io.realm;


public interface LikesRealmProxyInterface {
    public Integer realmGet$count();
    public void realmSet$count(Integer value);
    public Integer realmGet$userLikes();
    public void realmSet$userLikes(Integer value);
    public Integer realmGet$canLike();
    public void realmSet$canLike(Integer value);
    public Integer realmGet$canPublish();
    public void realmSet$canPublish(Integer value);
}
