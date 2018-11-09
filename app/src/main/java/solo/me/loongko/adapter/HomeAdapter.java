package solo.me.loongko.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import solo.me.loongko.fragment.HomeFragment;
import solo.me.loongko.solo.HomeActivity;
import solo.me.loongko.solo.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {


    private List<String> data=new ArrayList<>();
    Context context;

    public HomeAdapter() {

    }


    public HomeAdapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_home_recyclerview, viewGroup, false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeViewHolder homeViewHolder, int i) {

        homeViewHolder.tv_article_name.setText("世界，你好！");
        homeViewHolder.tv_calendar_text.setText("YYYY-MMMM-DDDD");
        homeViewHolder.bt_label_button.setText("标签");
        homeViewHolder.bt_reply_button.setText("评论");
        homeViewHolder.bt_watch_button.setText("浏览");
        homeViewHolder.iv_calendar_image.setImageResource(R.mipmap.heart);
        homeViewHolder.iv_article_image.setImageResource(R.mipmap.background_article);
        homeViewHolder.tv_introduce_article.setText("欢迎");
        homeViewHolder.tv_detail_article.setText("SOLO");
        homeViewHolder.tv_page_button.setText("1");
        homeViewHolder.tv_notice_button.setText("Open Source, Open Mind, \n" +
                "Open Sight, Open Future!");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class HomeViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView tv_article_name, tv_calendar_text, tv_introduce_article,
                tv_detail_article, tv_page_button, tv_notice_button;
        ImageView iv_calendar_image, iv_article_image;

        Button bt_label_button, bt_reply_button, bt_watch_button, id_like_button;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);


            tv_article_name = (TextView) view.findViewById(R.id.tv_article_name);
            tv_calendar_text = (TextView) view.findViewById(R.id.tv_calendar_text);
            tv_introduce_article = (TextView) view.findViewById(R.id.tv_introduce_article);
            tv_detail_article = (TextView) view.findViewById(R.id.tv_detail_article);
            tv_page_button = (TextView) view.findViewById(R.id.tv_page_button);
            tv_notice_button = (TextView) view.findViewById(R.id.tv_notice_button);
            iv_calendar_image = (ImageView) view.findViewById(R.id.iv_calendar_image);
            iv_article_image = (ImageView) view.findViewById(R.id.iv_article_image);

            bt_label_button = (Button)view.findViewById(R.id.bt_label_button);
            bt_reply_button = (Button)view.findViewById(R.id.bt_reply_button);
            bt_watch_button = (Button)view.findViewById(R.id.bt_watch_button);
            id_like_button = (Button)view.findViewById(R.id.id_like_button);
        }
    }


}
