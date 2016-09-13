package com.zachlittle.android.aca.groupappone;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

/**
 * Created by Zach on 9/13/16.
 */
public class Spells extends AppCompatActivity  {

    RadioGroup mRadioGroup;
    int spellID =1;
    private SensorManager shakeTheDevice;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        shakeTheDevice = (SensorManager) getSystemService(SENSOR_SERVICE);
        shakeTheDevice.registerListener((SensorEventListener) this,
                shakeTheDevice.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);


        MediaPlayer mp = new MediaPlayer();
        switch (spellID){
            case 1:
                mp.create(this, R.raw.alohomora);
                break;
            case 2:
                mp.create(this, R.raw.threexpelliarmus);
                break;
            case 3:
                mp.create(this, R.raw.obliviate);
                break;
        }mp.start();



        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (){
                    case R.id:
                }
            }
        });
    }
}
