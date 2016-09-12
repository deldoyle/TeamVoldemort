package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Zach on 9/12/16.
 */
public class VoldiesContact extends AppCompatActivity{

    TextView mTextView;
    Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mTextView = (TextView) findViewById(R.id.);

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

        Intent intent = getIntent();
        String nameFromMain = intent.getStringExtra(MainActivity.TAG_NAME);
        String phoneFromMain = intent.getStringExtra(MainActivity.TAG_PHONE);
        String addressFromMain = intent.getStringExtra(MainActivity.TAG_ADDRESS);

        mTextView.append(nameFromMain + "\n");
        mTextView.append(phoneFromMain + "\n");
        mTextView.append(addressFromMain + "\n");


    }
}
