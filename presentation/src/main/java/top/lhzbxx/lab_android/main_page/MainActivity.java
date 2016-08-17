package top.lhzbxx.lab_android.main_page;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.lhzbxx.lab_android.R;
import top.lhzbxx.lab_android.main_page.home_page.HomePageFragment;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_page)
    RadioButton mainPage;

    @BindView(R.id.society_page)
    RadioButton societyPage;

    @BindView(R.id.message_page)
    RadioButton messagePage;

    @BindView(R.id.me_page)
    RadioButton mePage;



    private HomePageFragment homePageFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        FragmentManager manager = getSupportFragmentManager();
        homePageFragment = new HomePageFragment();
        manager.beginTransaction().add(R.id.item_page, homePageFragment).commit();
    }


}
