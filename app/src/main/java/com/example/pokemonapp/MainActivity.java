package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Making Pokemon

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pokemonButtonPressed(View view)
    {
        //printing a msg that btn pressed!
        Log.d("DHYANEE","You pressed the button!!!");

        // creating a segue in Android
        Intent i = new Intent(this, PokemonActivity.class);
        i.putExtra("message", "create pokemon!");

        startActivity(i);
    }
}
