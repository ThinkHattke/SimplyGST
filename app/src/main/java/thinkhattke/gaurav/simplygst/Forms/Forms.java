package thinkhattke.gaurav.simplygst.Forms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import thinkhattke.gaurav.simplygst.DB.TinyDB;
import thinkhattke.gaurav.simplygst.Eye.Eye;
import thinkhattke.gaurav.simplygst.MainActivity;
import thinkhattke.gaurav.simplygst.R;

public class Forms extends AppCompatActivity {


    LinearLayout one, two, three, four, five, six, seven;
    TinyDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_froms);


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);


        db = new TinyDB(Forms.this);


        one.setOnClickListener(v -> {

            db.putString("link","https://portal2.passportindia.gov.in/AppOnlineProject/pdf/AnnexureB.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        two.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2018/02/2018040638.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        three.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2017/05/2018040640.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        four.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2018/04/2018040612.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        five.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2018/04/2018040684.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        six.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2018/04/20180406100-1.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


        seven.setOnClickListener(v -> {

            db.putString("link","https://cdn.s3waas.gov.in/s304025959b191f8f9de3f924f0940515f/uploads/2018/04/2018040628-1.pdf");
            Intent i = new Intent(Forms.this, PDF.class);
            startActivity(i);
            finish();

        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(Forms.this, MainActivity.class);
        startActivity(i);
        finish();

    }


}
