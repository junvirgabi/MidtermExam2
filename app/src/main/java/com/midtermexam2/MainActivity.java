package com.midtermexam2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.midtermexam2.Utils.HttpUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    public static final String API_URL ="http://joseniandroid.herokuapp.com";
    public static final String BOOK_ID = "_id";
    public static final String BOOK_TITLE = "title";
    public static final String BOOK_GENRE = "genre";
    public static final String BOOK_AUTHOR= "author";
    public static final String BOOK_ISREAD = "isread";

    JSONArray books = null;
    private ArrayList<Book> libro;


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


        mainListView.setAdapter(listAdapter);


    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent intent = new Intent(getActivity(), MovieDetailsActivity.class);
//        intent.putExtra(Constants.EXTRA_POSITION, position);
//        startActivity(intent);
//    }

    private class KuhaBooks extends AsyncTask<Void,Void,Void>{


        @Override
        protected Void doInBackground(Void... params) {

            HttpUtils sh = new HttpUtils();

            // Making a request to url and getting response
            String jsonStr = sh.getResponse("http://joseniandroid.herokuapp.com", "GET");

            Log.d("Response: ", "> " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    books = jsonObj.getJSONArray(BOOK_ID);

                    // looping through All Contacts
                    for (int i = 0; i < books.length(); i++) {
                        JSONObject c = books.getJSONObject(i);

                        String id = c.getString(BOOK_ID);
                        String title = c.getString(BOOK_TITLE);
                        String genre = c.getString(BOOK_GENRE);
                        String author = c.getString(BOOK_AUTHOR);
                        String isread= c.getString(BOOK_ISREAD);



                        // adding contact to contact list
                        libro.add(new Book(id,title,genre,author,isread));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e("ServiceHandler", "Couldn't get any data from the url");
            }

            return null;

        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog



//           mainListView.setAdapter(adapter);
        }

    }
    }
