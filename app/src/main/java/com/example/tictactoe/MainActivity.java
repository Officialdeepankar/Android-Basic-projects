package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    int flag = 0;
    int countMove = 0;
Button b1,b2, b3, b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// from here xml connect
         b1 = findViewById(R.id.btn1);
         b2 = findViewById(R.id.btn2);
         b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
         b6 = findViewById(R.id.btn6);
         b7 = findViewById(R.id.btn7);
         b8 = findViewById(R.id.btn8);
         b9 = findViewById(R.id.btn9);
    }

    public void Check(View view) {
        Button currentbtn = (Button) view;
        countMove++;// because moves greater than 4 are deciding moves;
        if (flag == 0) {
            currentbtn.setText("X");
            flag = 1;
        } else if (flag==1)
        {
            currentbtn.setText("O");
            flag = 0;
        }

        if (countMove > 4) {
            String b11 = b1.getText().toString();
            String b22 = b2.getText().toString();
            String b33 = b3.getText().toString();
            String b44 = b4.getText().toString();
            String b55 = b5.getText().toString();
            String b66 = b6.getText().toString();
            String b77 = b7.getText().toString();
            String b88 = b8.getText().toString();
            String b99 = b9.getText().toString();

// conditions
            if (b11.equals(b22) && b22.equals(b33) && !b11.equals(""))//1st horizontal row;
            {
                Toast.makeText(this, "Winner is: "+b11, Toast.LENGTH_LONG).show();
                //restartGame();
            } else if (b33.equals(b44) && b44.equals(b55) && !b44.equals(""))// 2nd horizontal row check
            {
                Toast.makeText(this, "Winner is: "+b33, Toast.LENGTH_LONG).show();
                //restartGame();
            }else if (b77.equals(b88) && b88.equals(b99) && !b77.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b77, Toast.LENGTH_LONG).show();
               // restartGame();
            }
            // vertical check
            else if (b11.equals(b44) && b44.equals(b77) && !b11.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b11, Toast.LENGTH_LONG).show();
                //restartGame();
            }else if (b22.equals(b55) && b55.equals(b88) && !b22.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b22, Toast.LENGTH_LONG).show();
               // restartGame();
            }
            else if (b33.equals(b66) && b66.equals(b99) && !b33.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b33, Toast.LENGTH_LONG).show();
                //restartGame();
            }

            //  both diagonal check
            else if (b11.equals(b55) && b55.equals(b99) && !b11.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b11, Toast.LENGTH_LONG).show();
               // restartGame();
            }else if (b33.equals(b55) && b55.equals(b77) && !b33.equals(""))// 3rd horizontal
            {
                Toast.makeText(this, "Winner is: "+b33, Toast.LENGTH_LONG).show();
                //restartGame();
            }

        }
    }
    public void restartGame() {
        // Clear text on all buttons
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        // Reset move count and flag
        countMove = 0;
        flag = 0;
    }

}