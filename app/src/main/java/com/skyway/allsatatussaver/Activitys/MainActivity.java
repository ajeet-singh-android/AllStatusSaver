package com.skyway.allsatatussaver.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.skyway.allsatatussaver.Adapters.MainAdapter;
import com.skyway.allsatatussaver.Facebook.FacebookActivity;
import com.skyway.allsatatussaver.Instagram.InstagramActivity;
import com.skyway.allsatatussaver.Models.MainModel;
import com.skyway.allsatatussaver.R;
import com.skyway.allsatatussaver.TikTok.TiktokActivity;
import com.skyway.allsatatussaver.Twitter.TwitterActivity;
import com.skyway.allsatatussaver.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    List<MainModel> listImage = new ArrayList<MainModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listImage.add(new MainModel(R.drawable.whts,"Whats App"));
        listImage.add(new MainModel(R.drawable.wabus,"Whats App Business"));
        listImage.add(new MainModel(R.drawable.tiktok,"TikTak"));
        listImage.add(new MainModel(R.drawable.twi,"Twitter"));
        listImage.add(new MainModel(R.drawable.fb,"Facebook"));
        listImage.add(new MainModel(R.drawable.snack,"Snak"));
        listImage.add(new MainModel(R.drawable.share_chat,"Share Chat"));
        listImage.add(new MainModel(R.drawable.likee,"Likee"));
        listImage.add(new MainModel(R.drawable.insta,"Instagram"));
        listImage.add(new MainModel(R.drawable.ic_zili,"Zili"));
        listImage.add(new MainModel(R.drawable.kchingari,"Chingari"));
        listImage.add(new MainModel(R.drawable.kmoj,"Kmoj"));
        listImage.add(new MainModel(R.drawable.mxtakatak,"MxTakaTak"));

        binding.mainRecyclerview.setAdapter(new MainAdapter(MainActivity.this, listImage, new MainAdapter.ItemClickLisner() {
            @Override
            public void clickd(int pos) {
                Intent intent=null;
                if (pos==0) intent = new Intent(MainActivity.this,FullActivity.class);
                else if (pos==1) intent = new Intent(MainActivity.this,FullActivity.class);
                else if (pos==2) intent = new Intent(MainActivity.this, TiktokActivity.class);
                else if (pos==3) intent = new Intent(MainActivity.this, TwitterActivity.class);
                else if (pos==4) intent = new Intent(MainActivity.this, FacebookActivity.class);
                else if (pos==5) intent = new Intent(MainActivity.this,FullActivity.class);
                else if (pos==6) intent = new Intent(MainActivity.this,FullActivity.class);
                else if (pos==7) intent = new Intent(MainActivity.this, FullActivity.class);
                else if (pos==8) intent = new Intent(MainActivity.this, InstagramActivity.class);
                else if (pos==9) intent = new Intent(MainActivity.this, FullActivity.class);
                else if (pos==10) intent = new Intent(MainActivity.this, FullActivity.class);
                else if (pos==11) intent = new Intent(MainActivity.this, FullActivity.class);
                else intent = new Intent(MainActivity.this, FullActivity.class);

                intent.putExtra("image",listImage.get(pos).getImage());
                intent.putExtra("name",listImage.get(pos).getName());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        }));
        binding.mainRecyclerview.setHasFixedSize(true);


    }
}