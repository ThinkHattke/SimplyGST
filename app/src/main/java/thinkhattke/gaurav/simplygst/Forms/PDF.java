package thinkhattke.gaurav.simplygst.Forms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import thinkhattke.gaurav.simplygst.DB.TinyDB;
import thinkhattke.gaurav.simplygst.Eye.Eye;
import thinkhattke.gaurav.simplygst.MainActivity;
import thinkhattke.gaurav.simplygst.R;

public class PDF extends AppCompatActivity {


    WebView webView;

    TinyDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        webView = findViewById(R.id.webview);


        db = new TinyDB(PDF.this);


        String link = db.getString("link");


        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+link);



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(PDF.this, Forms.class);
        startActivity(i);
        finish();

    }


}
