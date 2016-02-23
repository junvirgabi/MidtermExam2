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

//
//    final String city;
//    final String country;
//    final String icon;
//    final String description;
//    final double temperature;
//    final long humidity;
//    final long pressure;
//
//    try {
//        // 1) Convert the json string response into an actual JSON Object
//        JSONObject jsonObject = new JSONObject(json);
//
//        // 2) Get the status code
//        int statusCode = jsonObject.getInt(OWM_CODE);
//
//        // 3) Check if the HTTP Status Code if it's valid or not
//        if (statusCode == SUCCESS_CODE) {
//            // 4) Retrieve the individual bits of data that we need for our Weather model.
//            // 5) Get the city name from the base jsonObject
//            city = jsonObject.getString(OWM_CITY_NAME);
//
//            // 6) Get the country name from "sys" object
//            JSONObject sys = jsonObject.getJSONObject(OWM_SYS);
//            country = sys.getString(OWM_COUNTRY);
//
//            // 7) Get temperature, humidity, and pressure under "main" object
//            JSONObject main = jsonObject.getJSONObject(OWM_MAIN);
//            temperature = main.getDouble(OWM_TEMPERATURE);
//            humidity = main.getLong(OWM_HUMIDITY);
//            pressure = main.getLong(OWM_PRESSURE);
//
//            // 8) Get description and icon from "weather" object
//            JSONArray weather = jsonObject.getJSONArray(OWM_WEATHER);
//            JSONObject w0 = weather.getJSONObject(0);
//            description = w0.getString(OWM_DESCRIPTION).toUpperCase();
//            icon = w0.getString(OWM_ICON);
//
//            // 9) If there's no issue up to this point, then we are now ready to create our
//            // Weather model.
//            Weather w = new Weather()
//                    .setCity(city)
//                    .setCountry(country)
//                    .setIconSrc(icon)
//                    .setDescription(description)
//                    .setTemperature(temperature)
//                    .setHumidity(humidity)
//                    .setPressure(pressure);
//
//            // 10) Get the actual weather icon
//            Bitmap imageBitmap = HttpUtils.getImageBitmap(w.getIconSrc());
//            w.setWeatherIcon(imageBitmap);
//
//            // 11) Return our weather data
//            return w;
//        } else {
//            return null;
//        }
//    } catch (JSONException e) {
//        e.printStackTrace();
//        return null;
//    }
//}

}
