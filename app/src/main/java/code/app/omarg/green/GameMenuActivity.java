package code.app.omarg.green;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import code.app.omarg.green.R;

public class GameMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

        Integer lvl = 0;

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            lvl = extras.getInt("lvl");
        }
        if(lvl == 0) {
            SharedPreferences sharedPref = getSharedPreferences("lvlCompleted", 0);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.clear();      //its clear all data.
            editor.commit();  //Don't forgot to commit  SharedPreferences.

        }
        if(lvl!=0) {
            SharedPreferences sharedPref = getSharedPreferences("lvlCompleted", 0);
            int defValue = 0;
            Integer highestLvl;
            highestLvl = sharedPref.getInt("highestLvl",defValue);
            if(lvl > highestLvl) {
                //now get Editor
                SharedPreferences.Editor editor = sharedPref.edit();
                //put your value
                editor.putInt("highestLvl", lvl);
                //commits your edits
                editor.commit();
            }
            sharedPref = getSharedPreferences("lvlCompleted", 0);
            setButtonsToVisible(sharedPref.getInt("highestLvl",0));
        }
    }

    private void setButtonsToVisible(int lvl) {
        Button b2 = findViewById(R.id.lvl2);
        Button b3 = findViewById(R.id.lvl3);
        Button b4 = findViewById(R.id.lvl4);
        Button b5 = findViewById(R.id.lvl5);
        Button b6 = findViewById(R.id.lvl6);
        Button b7 = findViewById(R.id.lvl7);
        Button b8 = findViewById(R.id.lvl8);
        Button b9 = findViewById(R.id.lvl9);
        Button b10 = findViewById(R.id.lvl10);

        if(lvl > 0) b2.setVisibility(View.VISIBLE);
        if(lvl > 1) b3.setVisibility(View.VISIBLE);
        if(lvl > 2) b4.setVisibility(View.VISIBLE);
        if(lvl > 3) b5.setVisibility(View.VISIBLE);
        if(lvl > 4) b6.setVisibility(View.VISIBLE);
        if(lvl > 5) b7.setVisibility(View.VISIBLE);
        if(lvl > 6) b8.setVisibility(View.VISIBLE);
        if(lvl > 7) b9.setVisibility(View.VISIBLE);
        if(lvl > 8) b10.setVisibility(View.VISIBLE);
    }


    public void lvl1(View view) {
        int lvl = 1;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl2(View view) {
        int lvl = 2;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl3(View view) {
        int lvl = 3;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl4(View view) {
        int lvl = 4;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl5(View view) {
        int lvl = 5;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl6(View view) {
        int lvl = 6;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl7(View view) {
        int lvl = 7;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl8(View view) {
        int lvl = 8;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl9(View view) {
        int lvl = 9;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
    public void lvl10(View view) {
        int lvl = 10;
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("lvl",lvl);
        startActivity(i);
    }
}
