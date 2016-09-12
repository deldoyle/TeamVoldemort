package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}
