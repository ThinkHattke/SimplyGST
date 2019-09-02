package thinkhattke.gaurav.simplygst.Tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import thinkhattke.gaurav.simplygst.MainActivity;
import thinkhattke.gaurav.simplygst.News.News;
import thinkhattke.gaurav.simplygst.R;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(Tips.this, MainActivity.class);
        startActivity(i);
        finish();

    }


}
