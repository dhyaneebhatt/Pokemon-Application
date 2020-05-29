package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PokemonActivity extends AppCompatActivity
{
    //pokemon properties
    String pokemonName;
    int attack;
    int defense;
    int hp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
    }

    //create pokemon
    //make user fill up all details for the pokemon

    public void pokemonButtonPressed(View view)
    {

    }

}
