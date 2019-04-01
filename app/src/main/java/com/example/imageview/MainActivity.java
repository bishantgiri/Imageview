package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdBatman, rdSuperman, rdSpiderman;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdBatman=findViewById(R.id.rdb1);
        rdSuperman=findViewById(R.id.rdb2);
        rdSpiderman=findViewById(R.id.rdb3);
        ivImage=findViewById(R.id.ivImage);

        rdBatman.setOnClickListener(this);
        rdSuperman.setOnClickListener(this);
        rdSpiderman.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.rdb1:
                break;
            case R.id.rdb2:
                break;
            case R.id.rdb3:
                break;
        }
    }
}
