/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

import java.util.ArrayList;
import Models.Aircraft;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 *
 * @author Daniel Murphy
 */
public class AircraftRepository extends TextFileRepository<Aircraft>
{

    public void AircraftRepository()
    {
        this.items = new ArrayList<>();
    }

    public AircraftRepository(String[] fileNames)
    {
        this.items = new ArrayList<>();
        CreateFromFiles(fileNames);
    }

    /**
     * Takes in multiple files and adds there contents to the repository
     *
     * @param fileNames The files who's contents are to added to repository
     */
    @Override
    protected void CreateFromFiles(String[] fileNames)
    {

        Gson gs = new GsonBuilder().registerTypeAdapter(Aircraft.class, new AircraftAdapter()).create();

        BufferedReader reader;

        try
        {
            for (String fileName : fileNames)
            {
                reader = new BufferedReader(new FileReader(fileName));

                Aircraft[] aircrafts = gs.fromJson(reader, Aircraft[].class);

                items.addAll(Arrays.asList(aircrafts));
            }
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e)
        {
            System.out.print(e.toString());
        }
    }

    public class AircraftAdapter implements JsonDeserializer<Aircraft>
    {

        /**
         * De-serialize a jsonElement into an object of subclass Aircraft
         *
         * @param json
         * @param typeOfT
         * @param context
         * @return 
         */
        @Override
        public Aircraft deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        {
            JsonObject jsonObject = json.getAsJsonObject();

            String type = jsonObject.get("type").getAsString();

            JsonElement element = jsonObject.get("properties");

            try
            {
                return context.deserialize(element, Class.forName("Models." + type));
            } catch (ClassNotFoundException cnfe)
            {

                throw new JsonParseException("Unknown element type: " + type, cnfe);
            }
        }
    }
}
