package code.app.omarg.green;

import android.graphics.Color;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by OmarG on 12/10/2017.
 */

public class functions {
    public static void setUp(Button button, boolean bool) {
        if(bool) {
            button.setBackgroundColor(0xFF006600);
        }
        else button.setBackgroundColor(Color.BLUE);
        button.setEnabled(true);
    }

    public static boolean FlipIt(Button btn, boolean bool) {
        if(bool) {
            btn.setBackgroundColor(Color.BLUE);
            return false;
        }
        else {
            btn.setBackgroundColor(0xFF006600);
            return true;
        }
    }
}
