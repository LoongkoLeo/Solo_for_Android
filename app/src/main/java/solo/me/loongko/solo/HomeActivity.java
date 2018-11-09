package solo.me.loongko.solo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

import solo.me.loongko.adapter.HomeAdapter;
import solo.me.loongko.adapter.MajorAdapter;
import solo.me.loongko.fragment.ArchiveFragment;
import solo.me.loongko.fragment.FriendChainFragment;
import solo.me.loongko.fragment.HomeFragment;
import solo.me.loongko.fragment.LabelFragment;

public class HomeActivity extends AppCompatActivity {

    private HomeAdapter homeAdapter;
    private RecyclerView recyclerView;
    private Fragment homeFragment, tabFragment, archivesFragment, friendFragemtn;
    private ViewPager id_tab_viewpager;

    private List<String> tabTitleList = new ArrayList<>();


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
        ArrayList<String> titleDatas=new ArrayList<>();
        titleDatas.add("主页");
        titleDatas.add("标签");
        titleDatas.add("存档");
        titleDatas.add("友链");

        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new LabelFragment());
        fragmentList.add(new ArchiveFragment());
        fragmentList.add(new FriendChainFragment());

        MajorAdapter mMajorAdapter=new MajorAdapter(getSupportFragmentManager(),
                titleDatas, fragmentList);
        id_tab_viewpager.setAdapter(mMajorAdapter);
        id_tab_button.setupWithViewPager(id_tab_viewpager);
    }

}
