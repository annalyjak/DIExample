package lyjak.anna.diexample.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();
}
