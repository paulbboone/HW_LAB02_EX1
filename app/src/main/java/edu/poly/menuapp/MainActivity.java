package edu.poly.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im= (ImageView) findViewById(R.id.img);
        registerForContextMenu(im);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.option_menu, menu);
        return true;
    }
//    @Override
    public boolean onMenuItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }

//    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.context_menu, menu);

    }
//    @Override
    public  boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}