package test.mingorto.crackersapp.model.view.counter;


import test.mingorto.crackersapp.model.countable.Likes;

public class LikeCounterViewModel extends CounterViewModel{

    private Likes mLikes;

    public LikeCounterViewModel(Likes likes) {
        super(likes.getCount());

        this.mLikes = likes;

        if (mLikes.getUserLikes() == 1) {
            setAccentColor();
        }
    }

    public Likes getLikes() {
        return mLikes;
    }
}
