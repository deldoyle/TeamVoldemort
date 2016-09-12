package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
<<<<<<< HEAD
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> cbcb667303b06d2765eca1557a79b01de561d039

public class MainActivity extends AppCompatActivity {

    public static final String TAG_NAME = "com.zachlittle.android.aca.NAME";
    public static final String TAG_PHONE = "com.zachlittle.android.aca.PHONE";
    public static final String TAG_ADDRESS = "com.zachlittle.android.aca.ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mapsIntent = null;
                (R.id.imageButton3);
                mapsIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo: " + " "));

            }
        });
=======

    }
    public void goToResults() {
        Intent intent = new Intent(this.Voldiescontact.class);
        intent.putStringExtra(TAG_NAME, nameInput);
        intent.putStringExtra(TAG_PHONE, phoneNumberInput);
        intent.putStringExtra(TAG_ADDRESS, addressIntent);
>>>>>>> cbcb667303b06d2765eca1557a79b01de561d039
    }
}
