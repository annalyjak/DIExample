package lyjak.anna.diexample;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import lyjak.anna.diexample.di.ApplicationContext;

public class MainActivity extends BaseActivity {

    @ApplicationContext
    @Inject
    Context context;

    @BindView(R.id.textView1)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        ButterKnife.bind(this);
        textView.setText("Something");
    }
}
