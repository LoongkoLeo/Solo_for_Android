package solo.me.loongko.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import solo.me.loongko.solo.R;


public class HomeFragment extends Fragment {

    private View view;
    private static final String KEY = "title";

    private ViewPager vp_tab_viewpager;
    private TextView tv_article_name, tv_calendar_text, tv_introduce_article,
            tv_detail_article, tv_page_button, tv_notice_button;
    private ImageView iv_calendar_image, iv_article_image;

    private Button bt_label_button, bt_reply_button, bt_watch_button, id_like_button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    public static HomeFragment newInstance(String str) {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
