package solo.me.loongko.bean;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeValue {

    private String tv_article_name, tv_calendar_text, tv_introduce_article,
            tv_detail_article, tv_page_button, tv_notice_button;
    private ImageView iv_calendar_image, iv_article_image;

    private String bt_label_button, bt_reply_button, bt_watch_button, id_like_button;

    public String getTv_article_name() {
        return tv_article_name;
    }

    public void setTv_article_name(String tv_article_name) {
        this.tv_article_name = tv_article_name;
    }

    public String getTv_calendar_text() {
        return tv_calendar_text;
    }

    public void setTv_calendar_text(String tv_calendar_text) {
        this.tv_calendar_text = tv_calendar_text;
    }

    public String getTv_introduce_article() {
        return tv_introduce_article;
    }

    public void setTv_introduce_article(String tv_introduce_article) {
        this.tv_introduce_article = tv_introduce_article;
    }

    public String getTv_detail_article() {
        return tv_detail_article;
    }

    public void setTv_detail_article(String tv_detail_article) {
        this.tv_detail_article = tv_detail_article;
    }

    public String getTv_page_button() {
        return tv_page_button;
    }

    public void setTv_page_button(String tv_page_button) {
        this.tv_page_button = tv_page_button;
    }

    public String getTv_notice_button() {
        return tv_notice_button;
    }

    public void setTv_notice_button(String tv_notice_button) {
        this.tv_notice_button = tv_notice_button;
    }

    public ImageView getIv_calendar_image() {
        return iv_calendar_image;
    }

    public void setIv_calendar_image(ImageView iv_calendar_image) {
        this.iv_calendar_image = iv_calendar_image;
    }

    public ImageView getIv_article_image() {
        return iv_article_image;
    }

    public void setIv_article_image(ImageView iv_article_image) {
        this.iv_article_image = iv_article_image;
    }

    public String getBt_label_button() {
        return bt_label_button;
    }

    public void setBt_label_button(String bt_label_button) {
        this.bt_label_button = bt_label_button;
    }

    public String getBt_reply_button() {
        return bt_reply_button;
    }

    public void setBt_reply_button(String bt_reply_button) {
        this.bt_reply_button = bt_reply_button;
    }

    public String getBt_watch_button() {
        return bt_watch_button;
    }

    public void setBt_watch_button(String bt_watch_button) {
        this.bt_watch_button = bt_watch_button;
    }

    public String getId_like_button() {
        return id_like_button;
    }

    public void setId_like_button(String id_like_button) {
        this.id_like_button = id_like_button;
    }

    @Override
    public String toString() {
        return "HomeValue{" +
                "tv_article_name='" + tv_article_name + '\'' +
                ", tv_calendar_text='" + tv_calendar_text + '\'' +
                ", tv_introduce_article='" + tv_introduce_article + '\'' +
                ", tv_detail_article='" + tv_detail_article + '\'' +
                ", tv_page_button='" + tv_page_button + '\'' +
                ", tv_notice_button='" + tv_notice_button + '\'' +
                ", iv_calendar_image=" + iv_calendar_image +
                ", iv_article_image=" + iv_article_image +
                ", bt_label_button='" + bt_label_button + '\'' +
                ", bt_reply_button='" + bt_reply_button + '\'' +
                ", bt_watch_button='" + bt_watch_button + '\'' +
                ", id_like_button='" + id_like_button + '\'' +
                '}';
    }
}
