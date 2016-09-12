
<<<<<<< HEAD
=======
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
>>>>>>> 3ee83696a144984bb42707f471846c00bd77d886
import android.widget.EditText;

package com.jacksonmix.android.aca.groupappone;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Button;
        import android.widget.EditText;

        public class MainActivity extends AppCompatActivity {

            EditText mName;
            EditText mAddress;
            EditText mPhoneNumber;
            Button mButtonSubmit;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(com.jacksonmix.android.aca.groupappone.R.layout.activity_main);

                mName = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
                mPhoneNumber = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
                mAddress = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
                mButtonSubmit = (Button)findViewById(com.jacksonmix.android.aca.groupappone.R.id.sumbitButton);

                mButtonSumbit.setOnClickListener();

                String nameInput = mName.getText().toString();
                String phoneNumberInput;
                String addressInput;



            }
        }

<<<<<<< HEAD
=======
    public static final String TAG_NAME = "com.zachlittle.android.aca.NAME";
    public static final String TAG_PHONE = "com.zachlittle.android.aca.PHONE";
    public static final String TAG_ADDRESS = "com.zachlittle.android.aca.ADDRESS";
    EditText mName;
    EditText mAddress;
    EditText mPhoneNumber;
    Button mButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
        mPhoneNumber = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
        mAddress = (EditText)findViewById(com.jacksonmix.android.aca.groupappone.R.id.);
        mButtonSubmit = (Button)findViewById(com.jacksonmix.android.aca.groupappone.R.id.sumbitButton);

        mButtonSumbit.setOnClickListener();

        String nameInput = mName.getText().toString();
        String phoneNumberInput;
        String addressInput;


    }
    public void goToResults() {
        Intent intent = new Intent(this.Voldiescontact.class);
        intent.putStringExtra(TAG_NAME, nameInput);
        intent.putStringExtra(TAG_PHONE, phoneNumberInput);
        intent.putStringExtra(TAG_ADDRESS, addressIntent);
    }
}
>>>>>>> 3ee83696a144984bb42707f471846c00bd77d886
