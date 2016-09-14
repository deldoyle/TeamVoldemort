package com.zachlittle.android.aca.groupappone;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Spells extends AppCompatActivity implements SensorEventListener {

    RadioGroup mRadioGroup;
    RadioButton mSpellOne;
    RadioButton mSpellTwo;
    RadioButton mSpellThree;
    private final static float ACC = 70;
    MediaPlayer mp;
    int file = R.raw.alohomora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magic_stuff);

        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        mSpellOne = (RadioButton) findViewById(R.id.spellOne);
        mSpellTwo = (RadioButton) findViewById(R.id.spellTwo);
        mSpellThree = (RadioButton) findViewById(R.id.spellThree);

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                RadioButton rb = (RadioButton) group.findViewById(i);
                switch (rb.getId()){
                    case R.id.spellOne:
                        file = R.raw.alohomora;
                        Log.i("fileChange", "alohomora");
                        break;
                    case R.id.spellTwo:
                        file = R.raw.threexpelliarmus;
                        Log.i("fileChange", "expelliarmus");
                        break;
                    case R.id.spellThree:
                        file = R.raw.obliviate;
                        Log.i("fileChange", "obliviate");
                        break;
                }
            }
        });

        SensorManager shakeTheDevice = (SensorManager) getSystemService(SENSOR_SERVICE);
        shakeTheDevice.registerListener(this,
                shakeTheDevice.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        float[] values = sensorEvent.values;
        if ((Math.abs(values[0]) > ACC || Math.abs(values[1]) > ACC || Math
                    .abs(values[2]) > ACC)) {
            Log.i("sensor", "running");
            playThatFunkyMagic();
            Log.i("sensor", "running after");

            for (float i=0; i<200_000; i++) {

            }
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private void playThatFunkyMagic(){
        mp = MediaPlayer.create(this, file);
        mp.start();
        mp.setLooping(false);
        if(mp.isPlaying()) {
        }else {
            mp.release();
        }
    }
}
