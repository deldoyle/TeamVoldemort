
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

