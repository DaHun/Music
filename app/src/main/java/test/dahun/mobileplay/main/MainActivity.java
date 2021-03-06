package test.dahun.mobileplay.main;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

import test.dahun.mobileplay.R;
import test.dahun.mobileplay.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager mainPager;
    ViewPagerAdapter pagerAdapter;
    public static Context context;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSetting();

    }

    public void initSetting(){
        mainPager=(ViewPager)findViewById(R.id.mainPager);
        mainPager.setOffscreenPageLimit(1);
        pagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        mainPager.setAdapter(pagerAdapter);


    }
}
