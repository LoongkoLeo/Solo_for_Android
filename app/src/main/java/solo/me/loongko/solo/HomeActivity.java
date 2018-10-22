package solo.me.loongko.solo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.tigerliang.tablayout.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import solo.me.loongko.adapter.HomeAdapter;
import solo.me.loongko.fragment.HomeFragment;

public class HomeActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private HomeAdapter homeAdapter;
    private RecyclerView item_home_recyclerview;
    private Fragment homeFragment, tabFragment, archivesFragment, friendFragemtn;
    private List<Fragment> fragmentList = new ArrayList<>();
    private ViewPager id_tab_viewpager;

    private List<String> tabTitleList = new ArrayList<>();


    TabLayout id_tab_button;

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
        item_home_recyclerview = findViewById(R.id.item_home_recyclerview);
        id_tab_button = findViewById(R.id.bt_tab_button);
        //id_tab_button.setTabMode(TabLayout.MODE_FIXED);
        id_tab_viewpager = findViewById(R.id.vp_tab_viewpager);

        tabTitleList.add("首页");
        tabTitleList.add("标签");
        tabTitleList.add("存档");
        tabTitleList.add("友链");

        //添加标签栏
        for (int i = 0; i < tabTitleList.size(); i++) {

            HomeFragment homeFragment = HomeFragment.newInstance(tabTitleList.get(i));
            fragmentList.add(homeFragment);
        }

        item_home_recyclerview.setAdapter(homeAdapter);
        viewPagerAdapter = new ViewPagerAdapter();
        id_tab_viewpager.setAdapter(viewPagerAdapter);

        id_tab_button.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        id_tab_button.setupWithViewPager(id_tab_viewpager);
    }

    public class ViewPagerAdapter extends PagerAdapter {



        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return false;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return super.getPageTitle(position);
        }
    }
}
