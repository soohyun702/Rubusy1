package com.sungshin.rubusy;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StoreDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView store_detail_imageview0 = (ImageView)findViewById(R.id.store_detail_imageview0);
        TextView textView0 = (TextView)findViewById(R.id.store_detail_textview0);
        TextView textView1 = (TextView)findViewById(R.id.store_detail_textview1);
        final ScrollView store_detail_scrollview0 = (ScrollView)findViewById(R.id.store_detail_scrollview0);
        HorizontalScrollView store_detail_scrollview1 = (HorizontalScrollView)findViewById(R.id.store_detail_scrollview1);

        store_detail_imageview0.setImageResource(R.drawable.a);
        setContentView(store_detail_imageview0);

        store_detail_scrollview1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_UP){
                    store_detail_scrollview0.requestDisallowInterceptTouchEvent(false);
                }
                else{
                    store_detail_scrollview0.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });



    }
}
