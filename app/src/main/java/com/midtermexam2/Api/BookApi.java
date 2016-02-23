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

    public static final String API_URL ="http://joseniandroid.herokuapp.com";
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
//    final St
//        int statusCode = jsonObject.getInt(OWM_CODE);
//
//   ject(OWM_MAIN);
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
