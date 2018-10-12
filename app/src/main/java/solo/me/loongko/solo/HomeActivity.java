package solo.me.loongko.solo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    RecyclerView item_home_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void initView(){
        item_home_recyclerview=findViewById(R.id.item_home_recyclerview)  ;

    }
}
