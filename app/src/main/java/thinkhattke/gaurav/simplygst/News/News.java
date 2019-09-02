package thinkhattke.gaurav.simplygst.News;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import thinkhattke.gaurav.simplygst.Forms.Forms;
import thinkhattke.gaurav.simplygst.MainActivity;
import thinkhattke.gaurav.simplygst.R;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(News.this, MainActivity.class);
        startActivity(i);
        finish();

    }


}
