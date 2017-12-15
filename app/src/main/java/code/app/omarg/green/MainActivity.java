package code.app.omarg.green;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import code.app.omarg.green.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static code.app.omarg.green.functions.FlipIt;
import static code.app.omarg.green.functions.setUp;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    boolean isGreen[]= {true,false,true,false,false,false,true,false,true};
    TextView turns,won,editor;
    int numOfTurns,lvl;
    int numEditor[] = {1,1,7,6,5,2,5,8,11,9};
    Boolean lvlComplete[] = {false,false,false,false,false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        turns = findViewById(R.id.clicks);
        won = findViewById(R.id.won);
        editor = findViewById(R.id.editor);
        numOfTurns=0;
        lvl = 1;

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            lvl = extras.getInt("lvl");
        }
        loadMap(lvl);
        loadBoxes();
        String text = "Number of Clicks: " + numOfTurns;
        turns.setText(text);
    }

    public void menu(View view) {
        startActivity(new Intent(getApplicationContext(),GameMenuActivity.class));
    }

    public void redoButton(View view) {
        redo();
    }

    private void redo() {
        loadMap(lvl);
        loadBoxes();
        numOfTurns=0;
        String text = "Number of Clicks: " + numOfTurns;
        turns.setText(text);
        won.setText("");
    }

    private void won() {
        if(allGreen()) {
            String text = "YOU WIN!";
            won.setText(text);
            won.setTextColor(0xFF006600);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

    boolean allGreen() {
        for(int i = 0; i < 9; ++i) {
            if(!isGreen[i])
                return false;
        }
        return true;
    }
    void loadMap(int lvl) {
        ArrayList<String> lvlList = new ArrayList<>();
        try{
            InputStream is = getAssets().open("lvls.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = reader.readLine();
            lvlList.add(line);
            while(line != null){
                line = reader.readLine();
                lvlList.add(line);
            }
            String boxes[] = lvlList.get(lvl-1).split(" ");
            for(int i = 0; i < 9; ++i) {
                isGreen[i] = Boolean.parseBoolean(boxes[i]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String text = "Omar Guzman's number of turns: " + numEditor[lvl-1];
        editor.setText(text);
    }

    private void loadBoxes() {
        setUp(b1,isGreen[0]);
        setUp(b2,isGreen[1]);
        setUp(b3,isGreen[2]);
        setUp(b4,isGreen[3]);
        setUp(b5,isGreen[4]);
        setUp(b6,isGreen[5]);
        setUp(b7,isGreen[6]);
        setUp(b8,isGreen[7]);
        setUp(b9,isGreen[8]);
    }
    public void box1(View view) {
        isGreen[0] = FlipIt((Button)findViewById(R.id.b1) ,isGreen[0]);
        isGreen[1] = FlipIt((Button)findViewById(R.id.b2),isGreen[1]);
        isGreen[3] = FlipIt((Button)findViewById(R.id.b4),isGreen[3]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box2(View view) {
        isGreen[1] = FlipIt((Button)findViewById(R.id.b2),isGreen[1]);
        isGreen[0] = FlipIt((Button)findViewById(R.id.b1),isGreen[0]);
        isGreen[2] = FlipIt((Button)findViewById(R.id.b3),isGreen[2]);
        isGreen[4] = FlipIt((Button)findViewById(R.id.b5),isGreen[4]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box3(View view) {
        isGreen[2] = FlipIt((Button)findViewById(R.id.b3),isGreen[2]);
        isGreen[1] = FlipIt((Button)findViewById(R.id.b2),isGreen[1]);
        isGreen[5] = FlipIt((Button)findViewById(R.id.b6),isGreen[5]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box4(View view) {
        isGreen[3] = FlipIt((Button)findViewById(R.id.b4),isGreen[3]);
        isGreen[0] = FlipIt((Button)findViewById(R.id.b1),isGreen[0]);
        isGreen[4] = FlipIt((Button)findViewById(R.id.b5),isGreen[4]);
        isGreen[6] = FlipIt((Button)findViewById(R.id.b7),isGreen[6]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box5(View view) {
        isGreen[4] = FlipIt((Button)findViewById(R.id.b5),isGreen[4]);
        isGreen[1] = FlipIt((Button)findViewById(R.id.b2),isGreen[1]);
        isGreen[3] = FlipIt((Button)findViewById(R.id.b4),isGreen[3]);
        isGreen[5] = FlipIt((Button)findViewById(R.id.b6),isGreen[5]);
        isGreen[7] = FlipIt((Button)findViewById(R.id.b8),isGreen[7]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box6(View view) {
        isGreen[5] = FlipIt((Button)findViewById(R.id.b6),isGreen[5]);
        isGreen[2] = FlipIt((Button)findViewById(R.id.b3),isGreen[2]);
        isGreen[4] = FlipIt((Button)findViewById(R.id.b5),isGreen[4]);
        isGreen[8] = FlipIt((Button)findViewById(R.id.b9),isGreen[8]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box7(View view) {
        isGreen[6] = FlipIt((Button)findViewById(R.id.b7),isGreen[6]);
        isGreen[3] = FlipIt((Button)findViewById(R.id.b4),isGreen[3]);
        isGreen[7] = FlipIt((Button)findViewById(R.id.b8),isGreen[7]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box8(View view) {
        isGreen[7] = FlipIt((Button)findViewById(R.id.b8),isGreen[7]);
        isGreen[4] = FlipIt((Button)findViewById(R.id.b5),isGreen[4]);
        isGreen[6] = FlipIt((Button)findViewById(R.id.b7),isGreen[6]);
        isGreen[8] = FlipIt((Button)findViewById(R.id.b9),isGreen[8]);
        ++numOfTurns;
        turns();
        won();
    }
    public void box9(View view) {
        isGreen[8] = FlipIt((Button)findViewById(R.id.b9),isGreen[8]);
        isGreen[7] = FlipIt((Button)findViewById(R.id.b8),isGreen[7]);
        isGreen[5] = FlipIt((Button)findViewById(R.id.b6),isGreen[5]);
        ++numOfTurns;
        turns();
        won();
    }
    private void turns() {
        String text = "Number of Clicks: " + numOfTurns;;
        turns.setText(text);
    }
}
