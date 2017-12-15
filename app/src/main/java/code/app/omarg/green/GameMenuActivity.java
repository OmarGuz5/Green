package code.app.omarg.green;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import code.app.omarg.green.R;

public class GameMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

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
