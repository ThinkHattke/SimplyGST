package thinkhattke.gaurav.simplygst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import thinkhattke.gaurav.simplygst.Bot.Bot;
import thinkhattke.gaurav.simplygst.Eye.Eye;
import thinkhattke.gaurav.simplygst.Forms.Forms;
import thinkhattke.gaurav.simplygst.News.News;
import thinkhattke.gaurav.simplygst.Tips.Tips;
import thinkhattke.gaurav.simplygst.Video.Video;

public class MainActivity extends AppCompatActivity {


    //UI Components
    TextView bot, eye, form, news, video, tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setting Views
        bot = findViewById(R.id.bot);
        eye = findViewById(R.id.eye);
        form = findViewById(R.id.form);
        news = findViewById(R.id.news);
        video = findViewById(R.id.video);
        tips = findViewById(R.id.tips);



        //Handling Clicks
        bot.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, Bot.class);
            startActivity(i);
            finish();

        });


        eye.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, Eye.class);
            startActivity(i);
            finish();

        });


        form.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, Forms.class);
            startActivity(i);
            finish();

        });


        news.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, News.class);
            startActivity(i);
            finish();

        });


        video.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, Video.class);
            startActivity(i);
            finish();

        });

        tips.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, Tips.class);
            startActivity(i);
            finish();

        });

    }


}
