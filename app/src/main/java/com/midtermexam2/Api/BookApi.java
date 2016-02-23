package com.midtermexam2.Api;

/**
 * Created by junvir on 2/23/2016.
 */


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.midtermexam2.Book;
import com.midtermexam2.Utils.HttpUtils;

import org.json.JSONObject;

import java.util.List;


public class BookApi {

    public static final String API_URL ="http://172.17.3.51:5896/api/books";
    public static final String BOOK_ID = "_id";
    public static final String BOOK_TITLE = "title";
    public static final String BOOK_GENRE = "genre";
    public static final String BOOK_AUTHOR= "author";
    public static final String BOOK_ISREAD = "isread";


    public static Book getId(Uri uri, @NonNull String requestMethod ){

        List <Book> books;
        String json = HttpUtils.getResponse(uri, requestMethod);

        if (TextUtils.isEmpty(json)) {
            return null;
        }

            return null;


    }


    JSONObject json = new JSONObject();
    Book book = new Book("56c9c4f06d39c541658293d9","not read", "Historical Fiction", "War and Peace","Lev Nikolayevich Tolstoy" );




}
