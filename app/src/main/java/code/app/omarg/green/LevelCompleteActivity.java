package code.app.omarg.green;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import code.app.omarg.green.R;

public class LevelCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_complete);
        TextView textview = findViewById(R.id.lvlComplete);

        int lvl = getLvl();
        String text = "Level " + lvl + " Complete";
        textview.setText(text);

        if(lvl==10) {
            //write stay tuned
            textview.setText("Stay tuned for more levels in the neat future!");
        }

    }

    private int getLvl() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getInt("lvl");
        }
        else return 0;
    }


    public void menuButton(View view) {
        Intent intent = new Intent(getApplicationContext(),GameMenuActivity.class);
        intent.putExtra("lvl",getLvl());
        startActivity(intent);

    }
}
