package com.zachlittle.android.aca.groupappone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_NAME = "com.zachlittle.android.aca.NAME";
    public static final String TAG_PHONE = "com.zachlittle.android.aca.PHONE";
    public static final String TAG_ADDRESS = "com.zachlittle.android.aca.ADDRESS";
    EditText mName;
    EditText mAddress;
    EditText mPhoneNumber;
    EditText mZipCode;
    Button mButtonSubmit;
    String nameInput;
    String phoneNumberInput;
    String addressInput;
    String addressZipCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.editName);
        mPhoneNumber = (EditText)findViewById(R.id.editPhone);
        mAddress = (EditText)findViewById(R.id.editAddress);
        mButtonSubmit = (Button)findViewById(R.id.buttonSubmit);
        mZipCode = (EditText) findViewById(R.id.editZip);

        mButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameInput = mName.getText().toString();
                phoneNumberInput = mPhoneNumber.getText().toString();
                addressInput = mAddress.getText().toString();
                addressZipCode = mZipCode.getText().toString();

                addressInput = (addressInput + "," + addressZipCode );




                /* street adress input "," then zip code input
                 */
            }
        });




    }
    public void goToResults() {
        Intent intent = new Intent(this, VoldiesContact.class);
        intent.putExtra(TAG_NAME, nameInput);
        intent.putExtra(TAG_PHONE, phoneNumberInput);
        intent.putExtra(TAG_ADDRESS, addressInput);
    }
}
