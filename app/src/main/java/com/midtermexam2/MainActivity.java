package com.midtermexam2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of books.
        String[] planets = new String[] { "War and Peace", "Les Misérables", "The Time Machine", "A Journey into the Center of the Earth",
                "The Dark World", "The Wind in the Willows", "Life On The Mississippi", "Childhood"};
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.addAll( Arrays.asList(planets) );

        // Create ArrayAdapter using the books list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, bookList);


        mainListView.setAdapter( listAdapter );


    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent intent = new Intent(getActivity(), MovieDetailsActivity.class);
//        intent.putExtra(Constants.EXTRA_POSITION, position);
//        startActivity(intent);
//    }
}