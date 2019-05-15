package lyjak.anna.diexample;

import android.app.Activity;

import lyjak.anna.diexample.di.ActivityComponent;
import lyjak.anna.diexample.di.DaggerActivityComponent;

public class BaseActivity extends Activity {
    private ActivityComponent activityComponent;

    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(MyApplication.get(this).getComponent())
                    .build();

        }
        return activityComponent;
    }
}
