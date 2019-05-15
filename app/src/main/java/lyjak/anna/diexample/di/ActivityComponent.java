package lyjak.anna.diexample.di;

import dagger.Component;
import lyjak.anna.diexample.MainActivity;

@PreActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
