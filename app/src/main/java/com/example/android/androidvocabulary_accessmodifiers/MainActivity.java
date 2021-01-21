package com.example.android.androidvocabulary_accessmodifiers;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createCar(View v){
            Car myCar = new Car();
            Car myCar2 = new Car(1);
    }


}




