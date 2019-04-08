package com.example.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }


    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://femina.wwmindia.com/content/2017/dec/fortkochi-kerala_1513932088_1513932093.jpg");
        mNames.add("Fort Kochi in Ernakulam");

        mImageUrls.add("https://seoimgak.mmtcdn.com/blog/sites/default/files/images/allepey.jpg");
        mNames.add("Alappuzha");

        mImageUrls.add("https://d27k8xmh3cuzik.cloudfront.net/wp-content/uploads/2014/11/Varkala-in-Kerala.jpg");
        mNames.add("Varkala in Trivandrum");

        mImageUrls.add("https://static.toiimg.com/thumb/58490225/.jpg?width=748&height=499");
        mNames.add("Munnar in Idukki");


        mImageUrls.add("https://3.bp.blogspot.com/-jD9WfZFnQx8/UtfLoCYU0MI/AAAAAAAAEVc/vxiDYpZsxUo/s1600/bekal-in-kerala.jpg");
        mNames.add("Bekal Fort in Kasaragod");

        mImageUrls.add("https://www.holidify.com/images/bgImages/THRISSUR.jpg");
        mNames.add("VadakumNadha Temple in Thrissur");


        mImageUrls.add("https://www.keralatourism.org/images/destination/large/peralassery_subramania_temple_kannur20131031113956_23_1.jpg");
        mNames.add("Peralassery Subramania Temple in Kannur");

        mImageUrls.add("http://www.transindiatravels.com/wp-content/uploads/kuruva-island.jpg");
        mNames.add("Kuruva Island in Wayanad");

        mImageUrls.add("https://www.trawell.in/admin/images/upload/148645153Thrikkakkudi_Main.jpg");
        mNames.add("Thrikkakkudi Rock-Cut Temple in Pathanamthitta");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");


        // get the reference of RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        // set a StaggeredGridLayoutManager with 3 number of columns and vertical orientation
        LinearLayoutManager linearHorizontal = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearHorizontal);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);

    }
}