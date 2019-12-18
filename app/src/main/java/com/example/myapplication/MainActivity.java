package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }



    @Override// to create a options menu

    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);

    }



    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {



            case R.id.item1:

                Toast.makeText(this, "OPTION 1 is selcted", Toast.LENGTH_SHORT).show();

                break;

            case R.id.item2:

                Toast.makeText(this, "OPTION 2 is selcted", Toast.LENGTH_SHORT).show();

                break;


        }



        return super.onOptionsItemSelected(item);



    }



}

