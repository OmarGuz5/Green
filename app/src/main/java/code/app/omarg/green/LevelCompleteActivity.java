package code.app.omarg.green;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
            text = "Stay tuned for more levels in the near future!";
            textview.setText(text);
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
