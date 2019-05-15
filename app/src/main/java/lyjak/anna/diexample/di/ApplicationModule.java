package lyjak.anna.diexample.di;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    protected final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideAppliaction() {
        return application;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return application;
    }
}
