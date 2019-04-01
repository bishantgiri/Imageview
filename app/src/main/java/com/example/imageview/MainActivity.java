package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
                Toast.makeText(this,"IAmBatman", Toast.LENGTH_LONG).show();
                ivImage.setImageResource(R.drawable.batman);
                break;
            case R.id.rdb2:
                Toast.makeText(this, "TheSuperman", Toast.LENGTH_LONG).show();
                ivImage.setImageResource(R.drawable.superman);
                break;
            case R.id.rdb3:
                Toast.makeText(this, "Spiderman", Toast.LENGTH_LONG).show();
                ivImage.setImageResource(R.drawable.spiderman);
                break;
        }
    }
}
