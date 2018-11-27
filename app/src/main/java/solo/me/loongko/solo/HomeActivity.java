package solo.me.loongko.solo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import solo.me.loongko.adapter.HomeAdapter;
import solo.me.loongko.adapter.MajorAdapter;
import solo.me.loongko.fragment.ArchiveFragment;
import solo.me.loongko.fragment.FriendChainFragment;
import solo.me.loongko.fragment.HomeFragment;
import solo.me.loongko.fragment.LabelFragment;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private HomeAdapter homeAdapter;
    private RecyclerView recyclerView;
    private Fragment homeFragment, tabFragment, archivesFragment, friendFragemtn;
    private ViewPager id_tab_viewpager;

    private List<String> tabTitleList = new ArrayList<>();

    private Button id_article_buttonm, id_manage_button, id_mine_button, id_rss_button;

    private TabLayout id_tab_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        initView();
    }

    /**
     * 初始化布局
     */

    public void initView() {

        id_tab_button = findViewById(R.id.id_tab_button);
        id_tab_viewpager = findViewById(R.id.id_swtitch_viewpage);

        //添加TabLayout与Fragment联动
        ArrayList<String> titleDatas = new ArrayList<>();
        titleDatas.add("主页");
        titleDatas.add("标签");
        titleDatas.add("存档");
        titleDatas.add("友链");

        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new LabelFragment());
        fragmentList.add(new ArchiveFragment());
        fragmentList.add(new FriendChainFragment());

        MajorAdapter mMajorAdapter = new MajorAdapter(getSupportFragmentManager(),
                titleDatas, fragmentList);
        id_tab_viewpager.setAdapter(mMajorAdapter);
        id_tab_button.setupWithViewPager(id_tab_viewpager);

        /*
         * 底部按钮
         * */
        id_article_buttonm = (Button) findViewById(R.id.id_article_button);
        id_manage_button = (Button) findViewById(R.id.id_manage_button);
        id_mine_button = (Button) findViewById(R.id.id_mine_button);
        id_rss_button = (Button) findViewById(R.id.id_rss_button);

    }

    @Override
    public void onClick(View v) {
        Intent dynamicActivity, manageActivity, mineActivity, subscribeActivity;
        int id = v.getId();
        switch (id) {

            case R.id.id_article_button:
                dynamicActivity = new Intent(HomeActivity.this, DynamicActivity.class);
                break;
            case R.id.id_manage_button:
                manageActivity = new Intent(HomeActivity.this, ManageActivity.class);
                break;
            case R.id.id_mine_button:
                mineActivity = new Intent(HomeActivity.this, MineActivity.class);
                break;
            case R.id.id_rss_button:
                subscribeActivity = new Intent(HomeActivity.this, SubscribeActivity.class);
                break;


        }
    }
}
