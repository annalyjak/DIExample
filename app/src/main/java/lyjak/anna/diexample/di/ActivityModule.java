package lyjak.anna.diexample.di;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    protected Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }

    @ActivityContext
    @Provides
    Context provideContext() {
        return activity;
    }
}
