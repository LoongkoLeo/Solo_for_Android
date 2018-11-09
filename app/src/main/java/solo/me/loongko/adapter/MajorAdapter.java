package solo.me.loongko.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MajorAdapter extends FragmentPagerAdapter {

    private ArrayList<String> titleList;
    private ArrayList<Fragment> fragmentList;

    public MajorAdapter(FragmentManager fm) {
        super(fm);
    }

    public MajorAdapter(FragmentManager supportFragmentManager, ArrayList<String> titleDatas, ArrayList<Fragment> fragmentList) {
        super(supportFragmentManager);
        this.titleList=titleDatas;
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
