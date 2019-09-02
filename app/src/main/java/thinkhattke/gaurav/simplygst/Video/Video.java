package thinkhattke.gaurav.simplygst.Video;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import thinkhattke.gaurav.simplygst.MainActivity;
import thinkhattke.gaurav.simplygst.News.News;
import thinkhattke.gaurav.simplygst.R;

public class Video extends AppCompatActivity {


    LinearLayout one, two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);


        one.setOnClickListener(v -> {


            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WjhMRV2Mcwc"));
            startActivity(browserIntent);


        });


        two.setOnClickListener(v -> {


            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/jHmptd_HY0s"));
            startActivity(browserIntent);


        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(Video.this, MainActivity.class);
        startActivity(i);
        finish();

    }


}
