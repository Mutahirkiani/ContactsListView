package com.mutahir.contactslistview;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.HashMap;

public class Listview extends AppCompatActivity {

    static String[] numberArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        numberArray= new String[]{"+92346-7665234","+92308-8513397","+92313-5887203","+92341-4835372","+92331-8836715","+92336-1058489", "+92342-5297106","+92345-9044641","+92332-4567854","+92343-9739854","+92345-764532","+92302-5841246","+92341-2345674", "+92315-6534453","+92310-5544329","+92332-5125282","+92333-4546443","+92341-6745341","+92322-4432231","+92314-9696498", "+923334-693118","+92344-567435","+92300-9518321","+92344-5184803","+92322-5648623","+92321-9890210","+92334-7755741", "+92336-0190345","+92321-5564525","+92306-5876727","+92346-5920509","+92332-8745544","+92347-1520096","+92321-8337654", "+92313-5463544","+92341-76455321","+92343-5645326","+92341-5467836","+92302-3454348","+92300-8710000","+92333-8693435", "03425557561","03467865699","03245270749","03135280154","03325506134","03155513388","03106574665", "+92336-5749624","+92341-5564733","+92334-6577443","+92342-3457654","+92343-5467342","+92343-8743553"};

        final ListAdapter mutahirAdapter=new Custom(this,getResources().getStringArray(R.array.contacts));
        ListView mutahirlist=(ListView)findViewById(R.id.mutahirList);
        mutahirlist.setAdapter(mutahirAdapter);
        mutahirlist.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(),food,Toast.LENGTH_LONG).show();

                        String first="";
                        for (String s:food.split(" "))
                        {
                            first+=s.charAt(0);
                        }

                        String number= (numberArray[position]);
                        Intent intent=new Intent(Listview.this,Information.class);
                        intent.putExtra("key",food);
                        intent.putExtra("key1",first);
                        intent.putExtra("key2",number);
                        startActivity(intent);
                    }
                }
        );
    }
}
