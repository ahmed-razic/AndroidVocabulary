package com.example.android.androidvocabulary;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
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

    public void clickSprinkles(View v) {
        CheckBox sprinkles = (CheckBox) v;
        String message;

        if(sprinkles.isChecked()) {
            message = "Thank you for selecting Sprinkles";
        } else {
            message = "Thank you for not selecting Sprinkles";
        }

        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickCherry(View v) {
        CheckBox cherry = (CheckBox) v;
        String message;

        if(cherry.isChecked()) {
            message = "Thank you for selecting Cherry";
        } else {
            message = "Thank you for not selecting Cherry";
        }

        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void changeText(View v){
        String newMessage = "A new message";
        String oldMessage = showMessage(newMessage, R.id.textView);
        Toast toast = Toast.makeText(this, "An old message: " + oldMessage, Toast.LENGTH_LONG);
        toast.show();
    }

    /*
    * Show message in a TextView
    * @param newMessage     The message
    * @param resourceId     The resource Id of TextView
    * @return   oldMessage  The previous message of TextView
    * */

    private String showMessage(String newMessage, int resourceId) {

        //creates local variable for TextView created in activity_main.xml which text will be changed
        TextView textView = findViewById(resourceId);

        TextView myTextObject = new TextView(this);
        myTextObject.setText("New text object");




        //Make a copy of old text in TextView
        //since the new message will wiped it out
        // converts CharSequence returned by getText() to String type
        String oldMessage = textView.getText().toString();

        //Displays new message to TextView, clearing old one
        textView.setText(newMessage);

        //returns old message if anyone needs it
        return oldMessage;
    }

}






