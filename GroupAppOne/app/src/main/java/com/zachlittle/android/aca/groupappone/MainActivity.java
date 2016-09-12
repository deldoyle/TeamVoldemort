package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_NAME = "com.zachlittle.android.aca.NAME";
    public static final String TAG_PHONE = "com.zachlittle.android.aca.PHONE";
    public static final String TAG_ADDRESS = "com.zachlittle.android.aca.ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goToResults() {
        Intent intent = new Intent(this.Voldiescontact.class);
        intent.putStringExtra(TAG_NAME, nameInput);
        intent.putStringExtra(TAG_PHONE, phoneNumberInput);
        intent.putStringExtra(TAG_ADDRESS, addressIntent);
    }
}
