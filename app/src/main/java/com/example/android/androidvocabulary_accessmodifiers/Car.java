package com.example.android.androidvocabulary_accessmodifiers;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Car extends AppCompatActivity {

    private int mModel;

    public Car(){
        mModel = 0;
        setup();
    }

    public Car(int model){
        mModel = model;
        setup();
    }

    private void setup() {
        String message = "Created a car of model number " + mModel + ".";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

}
