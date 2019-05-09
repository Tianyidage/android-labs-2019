package edu.hzuapps.androidlabs.soft1714080902336;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        button=(Button)findViewById(R.id.tk02);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ArtActivity.this,Art_Test01_Activity.class);
                startActivity(intent);
            }
        });
    }
}
