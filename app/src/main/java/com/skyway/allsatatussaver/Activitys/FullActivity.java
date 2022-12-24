package com.skyway.allsatatussaver.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.skyway.allsatatussaver.Adapters.MainAdapter;
import com.skyway.allsatatussaver.Adapters.StatusAdapter;
import com.skyway.allsatatussaver.R;
import com.skyway.allsatatussaver.databinding.ActivityFullBinding;

public class FullActivity extends AppCompatActivity {
    ActivityFullBinding binding;

    int image;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        image = getIntent().getIntExtra("image",0);
        name = getIntent().getStringExtra("name");
        binding.itemLogo.setImageResource(image);
        binding.text.setText(name);

        StatusAdapter adapter = new StatusAdapter();
        binding.fullViewRecyclerview.setAdapter(adapter);
        binding.fullViewRecyclerview.setHasFixedSize(true);
    }
}