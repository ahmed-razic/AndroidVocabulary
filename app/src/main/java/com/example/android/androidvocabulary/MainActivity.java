package com.example.android.androidvocabulary;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.androidvocabulary_accessmodifiers.Car;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createCar1(View v){
        Car myCar1 = new Car();
        Toast toast1 = Toast.makeText(this, myCar1.message, Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void createCar2(View v){
        Car myCar2 = new Car(2);
        Toast toast2 = Toast.makeText(this, myCar2.message, Toast.LENGTH_LONG);
        toast2.show();
    }


}






