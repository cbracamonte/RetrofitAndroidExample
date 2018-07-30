package com.example.hernanbracamonte.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private String json = "{'id':1,'name':'London'}";
    private String json2 = "{" +
            "id : 0," +
                "ciudades: [" +
                        "{ " +
                            "id : 1," +
                            "name: 'London'" +
                        "}," +
                        "{ " +
                            "id : 2," +
                            "name: 'Lima'" +
                        "}," +
                        "{ " +
                            "id : 3," +
                            "name: 'Quito'" +
                        "}" +
                "]" +
            "}";
    private Town town = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*toJsonFormat();
        toGSONFormat();*/
        toGSONFormat();
    }


   /* private void toJsonFormat() {
        try {
            JSONObject mJson = new JSONObject(this.json);
            int id = mJson.getInt("id");
            String name = mJson.getString("name");
            city = new City(id, name);
            Toast.makeText(this, city.getId() + " -- " + city.getName(), Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
*/
    private void toGSONFormat() {
        //Gson gson = new Gson();
        //Aplicando expose
        //Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        //city = gson.fromJson(json, City.class);
        //Deserializando Objetos dentro de objetos
        Gson gson = new GsonBuilder().create();
        town = gson.fromJson(this.json2, Town.class);
        //Toast.makeText(this, city.getId() + " -GSON- " + city.getName(), Toast.LENGTH_LONG).show();
    }

}
