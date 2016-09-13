package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
    Button mCallButton;
    Button mMagicButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = (TextView) findViewById(R.id.resultsTextView);

        mButton = (Button) findViewById(R.id.googleButton);
        mCallButton = (Button) findViewById(R.id.callButton);
        mMagicButton = (Button) findViewById(R.id.magicButton);


        Intent intent = getIntent();
        String nameFromMain = intent.getStringExtra(MainActivity.TAG_NAME);
        String phoneFromMain = intent.getStringExtra(MainActivity.TAG_PHONE);
        final String addressFromMain = intent.getStringExtra(MainActivity.TAG_ADDRESS);

        mTextView.append(nameFromMain + "\n");
        mTextView.append(phoneFromMain + "\n");
        mTextView.append(addressFromMain + "\n");

       mCallButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:973-409-3277"));
               startActivity(callIntent);

           }
       });


        mMagicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSpells();
            }
        });


        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q= " + addressFromMain);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

    }

    public void goToSpells() {
        Intent intent3 = new Intent(this, Spells.class);
        startActivity(intent3);
    }
}
