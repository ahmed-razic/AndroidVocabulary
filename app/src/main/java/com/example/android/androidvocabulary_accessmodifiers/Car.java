package com.example.android.androidvocabulary_accessmodifiers;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Car extends AppCompatActivity {

    private int mModel;
    public String message = "Created a car of model number " + mModel + ".";

    public Car(){
        mModel = 1;
    }

    public Car(int model){
        mModel = model;
    }


}
