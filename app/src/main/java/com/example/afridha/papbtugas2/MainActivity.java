package com.example.afridha.papbtugas2;

import android.opengl.Visibility;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView hat, eyes, nose, mouth, mustache, shoes, arms, ears, glasses, eyebrows;
    CheckBox noseCheck, mouthCheck, mustacheCheck, shoesCheck, earsCheck, glassesCheck, eyeBrowsCheck,
            armsCheck, eyesCheck, hatCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Potato Head");
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);

        setContentView(R.layout.activity_main);

        noseCheck = findViewById(R.id.chooseNose);
        nose = findViewById(R.id.imageNose);
        mouthCheck = findViewById(R.id.chooseMouth);
        mouth = findViewById(R.id.imageMouth);
        mustacheCheck = findViewById(R.id.chooseMustache);
        mustache = findViewById(R.id.imageMustache);
        shoesCheck = findViewById(R.id.chooseShoes);
        shoes = findViewById(R.id.imageShoes);
        earsCheck = findViewById(R.id.chooseEars);
        ears = findViewById(R.id.imageEars);
        glassesCheck = findViewById(R.id.chooseGlasses);
        glasses = findViewById(R.id.imageGlasses);
        eyeBrowsCheck = findViewById(R.id.chooseEyeBrows);
        eyebrows = findViewById(R.id.imageEyeBrows);
        eyesCheck = findViewById(R.id.chooseEyes);
        eyes = findViewById(R.id.imageEyes);
        armsCheck = findViewById(R.id.chooseArms);
        arms = findViewById(R.id.imageArms);
        hatCheck = findViewById(R.id.chooseHat);
        hat = findViewById(R.id.imageHat);

            noseCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        nose.setVisibility(View.VISIBLE);
                    } else {
                        nose.setVisibility(View.INVISIBLE);
                    }
                }
            });

            glassesCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        glasses.setVisibility(View.VISIBLE);
                    } else {
                        glasses.setVisibility(View.INVISIBLE);
                    }
                }
            });
            hatCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        hat.setVisibility(View.VISIBLE);
                    } else {
                        hat.setVisibility(View.INVISIBLE);
                    }
                }
            });
            earsCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        ears.setVisibility(View.VISIBLE);
                    } else {
                        ears.setVisibility(View.INVISIBLE);
                    }
                }
            });
            armsCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        arms.setVisibility(View.VISIBLE);
                    } else {
                        arms.setVisibility(View.INVISIBLE);
                    }
                }
            });
            shoesCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        shoes.setVisibility(View.VISIBLE);
                    } else {
                        shoes.setVisibility(View.INVISIBLE);
                    }
                }
            });
            mouthCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        mouth.setVisibility(View.VISIBLE);
                    } else {
                        mouth.setVisibility(View.INVISIBLE);
                    }
                }
            });
            eyeBrowsCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        eyebrows.setVisibility(View.VISIBLE);
                    } else {
                        eyebrows.setVisibility(View.INVISIBLE);
                    }
                }
            });
            eyesCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        eyes.setVisibility(View.VISIBLE);
                    } else {
                        eyes.setVisibility(View.INVISIBLE);
                    }
                }
            });
            mustacheCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        mustache.setVisibility(View.VISIBLE);
                    } else {
                        mustache.setVisibility(View.INVISIBLE);
                    }
                }
            });
        }
    }
