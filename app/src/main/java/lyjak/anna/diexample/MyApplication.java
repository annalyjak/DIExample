package lyjak.anna.diexample;

import android.app.Application;
import android.content.Context;

import lyjak.anna.diexample.di.ApplicationComponent;
import lyjak.anna.diexample.di.ApplicationModule;
import lyjak.anna.diexample.di.DaggerApplicationComponent;

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public ApplicationComponent getComponent() {
        if (applicationComponent == null) {
            applicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return applicationComponent;
    }

    public static MyApplication get(Context context) {
        return ((MyApplication) context.getApplicationContext());
    }
}
