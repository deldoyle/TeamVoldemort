package com.zachlittle.android.aca.groupappone;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;


public class Spells extends AppCompatActivity implements SensorEventListener {

    RadioGroup mRadioGroup;
    int spellID =1;
    MediaPlayer mp = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magic_stuff);

        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        SensorManager shakeTheDevice = (SensorManager) getSystemService(SENSOR_SERVICE);
        shakeTheDevice.registerListener(this,
                shakeTheDevice.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (mRadioGroup.getId()){
                    case R.id.spellOne:
                        spellID =1;
                        break;
                    case R.id.spellTwo:
                        spellID =2;
                        break;
                    case R.id.spellThree:
                        spellID =3;
                        break;
                }
            }
        });
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        playThatFunkyMagic();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private void playThatFunkyMagic(){
        int file = R.raw.alohomora;
        switch (spellID){
            case 1:
                file = R.raw.alohomora;
                break;
            case 2:
                file = R.raw.threexpelliarmus;
                break;
            case 3:
                file = R.raw.obliviate;
                break;
        }
        MediaPlayer.create(this, file);
        
    }
}
