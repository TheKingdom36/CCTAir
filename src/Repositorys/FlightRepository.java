/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

import Models.Aircraft;
import java.util.ArrayList;
import Models.Flight;
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
public class FlightRepository extends TextFileRepository<Flight>
{

    public void FlightsRepository()
    {
        this.items = new ArrayList<>();
    }

    public FlightRepository(String[] fileNames)
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
        BufferedReader reader;
        Gson gs = new GsonBuilder().registerTypeAdapter(Aircraft.class, new AircraftAdapter()).create();

        try
        {
            for (String fileName : fileNames)
            {
                reader = new BufferedReader(new FileReader(fileName));

                Flight[] flights = gs.fromJson(reader, Flight[].class);

                items.addAll(Arrays.asList(flights));
            }
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e)
        {
            System.out.print(e.toString());
        }
    }

    public class AircraftAdapter implements JsonDeserializer<Aircraft>
    {

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
