package com.mutahir.contactslistview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;
import java.util.HashMap;
import java.util.zip.Inflater;

public class Custom extends ArrayAdapter<String> {

    static String[] numberArray;
    public Custom(Context context, String[] contacts) {
        super(context, R.layout.customview,contacts);
        numberArray= Listview.numberArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mutahirinflater=LayoutInflater.from(getContext());
        View customView=mutahirinflater.inflate(R.layout.customview,parent,false);

        String singlefooditem=getItem(position);
        TextView mutahirText=(TextView)customView.findViewById(R.id.mutahirText);

        TextView mutahirText1=(TextView)customView.findViewById(R.id.mutahirText1);
        mutahirText1.setText(singlefooditem);

        TextView textView=(TextView)customView.findViewById(R.id.textView);

        textView.setText(numberArray[position]);


        String first="";
        for (String s:mutahirText1.getText().toString().split(" "))
        {
            first+=s.charAt(0);
        }
        mutahirText.setText(first);

        GradientDrawable drawable=(GradientDrawable) mutahirText.getBackground();

        if(mutahirText1.getText().toString().charAt(0)=='A') {
            drawable.setColor(Color.parseColor("#800080"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='B'){
            drawable.setColor(Color.BLACK);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='C'){
            drawable.setColor(Color.YELLOW);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='D'){
            drawable.setColor(Color.parseColor("#60779b"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='E'){
            drawable.setColor(Color.parseColor("#7e0b1b"));

        }
        else if(mutahirText1.getText().toString().charAt(0)=='F'){
            drawable.setColor(Color.MAGENTA);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='G'){
            drawable.setColor(Color.DKGRAY);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='H'){
            drawable.setColor(Color.GRAY);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='I'){
            drawable.setColor(Color.parseColor("#2dd4ff"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='J'){
            drawable.setColor(Color.LTGRAY);
        }
        else if(mutahirText1.getText().toString().charAt(0)=='K'){
            drawable.setColor(Color.parseColor("#393610"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='L'){
            drawable.setColor(Color.parseColor("#cbac27"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='M'){
            drawable.setColor(Color.parseColor("#2c3c65"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='N'){
            drawable.setColor(Color.parseColor("#ffa500"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='O'){
            drawable.setColor(Color.parseColor("#cc6666"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='P'){
            drawable.setColor(Color.parseColor("#58c3c2"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='Q'){
            drawable.setColor(Color.parseColor("#8ba770"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='R'){
            drawable.setColor(Color.parseColor("#ed5181"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='S'){
            drawable.setColor(Color.parseColor("#675829"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='T'){
            drawable.setColor(Color.parseColor("#bdbdbd"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='U'){
            drawable.setColor(Color.parseColor("#8ba770"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='V'){
            drawable.setColor(Color.parseColor("#898989"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='W'){
            drawable.setColor(Color.parseColor("#42faa1"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='X'){
            drawable.setColor(Color.parseColor("#07fb7a"));
        }
        else if(mutahirText1.getText().toString().charAt(0)=='Y'){
            drawable.setColor(Color.RED);
        }

        else if(mutahirText1.getText().toString().charAt(0)=='Z') {
            drawable.setColor(Color.parseColor("#2b3e51"));
        }

        return customView;
    }
}
