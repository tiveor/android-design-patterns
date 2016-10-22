package com.androidbolivia.androiddesignpatterns;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.androidbolivia.androiddesignpatterns.patterns.builder.CampBuilder;
import com.androidbolivia.androiddesignpatterns.patterns.singleton.Level;
import com.androidbolivia.androiddesignpatterns.patterns.singleton.GameManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        patternBuilder1();
//        patternBuilder2();
//        patternSingleton();


    }

    public void patternSingleton() {
        GameManager gm = GameManager.getInstance(this);
        gm.setCurrentLevel(new Level(1, 1));
        gm.setUsername("Juan");
        Log.d("SINGLETON", gm.getUsername());
        Log.d("SINGLETON", gm.getCurrentCoin() + "");
        Log.d("SINGLETON", gm.getCurrentLevel().toString() + "");
        gm.incrementWinnerCoin();
        Log.d("SINGLETON", gm.getCurrentCoin() + "");
        gm.decrementCoins(15);
        Log.d("SINGLETON", gm.getCurrentCoin() + "");
    }


    public void patternBuilder1() {
        new AlertDialog.Builder(this)
                .setTitle("Hello Android Camp Bolivia")
                .setMessage("Hola desde el Android Camp Bolivia")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Click in button Cancel", Toast.LENGTH_SHORT);
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Click in button OK", Toast.LENGTH_SHORT);
                    }
                })
                .show();
    }

    public void patternBuilder2() {
        new CampBuilder(this)
                .setTitle("Hello Android Camp Bolivia")
                .setMessage("Hola desde el Android Camp Bolivia")
                .setPositiveButton("TEST", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Click in button TEST", Toast.LENGTH_SHORT);
                    }
                });
    }
}
