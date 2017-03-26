package com.mutahir.contactslistview;
import android.content.Intent;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.HashMap;


public class Information extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        TextView mutahirText=(TextView)findViewById(R.id.mutahirText);
        TextView mutahirText1=(TextView)findViewById(R.id.mutahirText1);
        TextView phone=(TextView)findViewById(R.id.phone);

        Intent intent=getIntent();

        mutahirText.setText(""+intent.getStringExtra("key"));

        GradientDrawable drawable=(GradientDrawable) mutahirText1.getBackground();

        if(mutahirText.getText().toString().charAt(0)=='A') {
            drawable.setColor(Color.parseColor("#800080"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='B'){
            drawable.setColor(Color.BLACK);
        }

        else if(mutahirText.getText().toString().charAt(0)=='C'){
            drawable.setColor(Color.YELLOW);
        }

        else if(mutahirText.getText().toString().charAt(0)=='D'){
            drawable.setColor(Color.parseColor("#60779b"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='E'){
            drawable.setColor(Color.parseColor("#7e0b1b"));

        }
        else if(mutahirText.getText().toString().charAt(0)=='F'){
            drawable.setColor(Color.MAGENTA);
        }
        else if(mutahirText.getText().toString().charAt(0)=='G'){
            drawable.setColor(Color.DKGRAY);
        }
        else if(mutahirText.getText().toString().charAt(0)=='H'){
            drawable.setColor(Color.GRAY);
        }

        else if(mutahirText.getText().toString().charAt(0)=='I'){
            drawable.setColor(Color.parseColor("#2dd4ff"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='J'){
            drawable.setColor(Color.LTGRAY);
        }

        else if(mutahirText.getText().toString().charAt(0)=='K'){
            drawable.setColor(Color.parseColor("#393610"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='L'){
            drawable.setColor(Color.parseColor("#cbac27"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='M'){
            drawable.setColor(Color.parseColor("#2c3c65"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='N'){
            drawable.setColor(Color.parseColor("#ffa500"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='O'){
            drawable.setColor(Color.parseColor("#cc6666"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='P'){
            drawable.setColor(Color.parseColor("#58c3c2"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='Q'){
            drawable.setColor(Color.parseColor("#8ba770"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='R'){
            drawable.setColor(Color.parseColor("#ed5181"));
        }
        else if(mutahirText.getText().toString().charAt(0)=='S'){
            drawable.setColor(Color.parseColor("#675829"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='T'){
            drawable.setColor(Color.parseColor("#bdbdbd"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='U'){
            drawable.setColor(Color.parseColor("#8ba770"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='V'){
            drawable.setColor(Color.parseColor("#898989"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='W'){
            drawable.setColor(Color.parseColor("#42faa1"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='X'){
            drawable.setColor(Color.parseColor("#07fb7a"));
        }

        else if(mutahirText.getText().toString().charAt(0)=='Y'){
            drawable.setColor(Color.RED);
        }

        else if(mutahirText.getText().toString().charAt(0)=='Z') {
            drawable.setColor(Color.parseColor("#2b3e51"));
        }

        mutahirText1.setText(""+intent.getStringExtra("key1"));

        phone.setText(""+intent.getStringExtra("key2"));

    }
}
