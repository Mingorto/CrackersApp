package test.mingorto.crackersapp.model.view.counter;

import test.mingorto.crackersapp.model.countable.Reposts;

public class RepostCounterViewModel extends CounterViewModel {

    private Reposts mReposts;

    public RepostCounterViewModel(Reposts reposts) {
        super(reposts.getCount());

        this.mReposts = reposts;
        if (mReposts.getUserReposted() == 1) {
            setAccentColor();
        }
    }

    public Reposts getReposts() {
        return mReposts;
    }
}
