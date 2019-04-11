/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

import Models.AirPlane;
import java.util.ArrayList;
import Models.Pilot;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Daniel Murphy
 */
public class PilotRepository extends TextFileRepository<Pilot>
{

    public void PilotRepository()
    {
        this.items = new ArrayList<>();
    }

    public PilotRepository(String[] fileNames)
    {
        this.items = new ArrayList<>();
        CreateFromFiles(fileNames);
    }

    /**
     * Takes in multiple files and adds there contents to the repository
     *
     * @param fileNames The files whos contents are to added to repository
     */
    @Override
    protected void CreateFromFiles(String[] fileNames)
    {
        Gson gs = new Gson();
        BufferedReader reader;
        try
        {
            for (String fileName : fileNames)
            {
                reader = new BufferedReader(new FileReader(fileName));

                Pilot[] pilots = gs.fromJson(reader, Pilot[].class);

                items.addAll(Arrays.asList(pilots));
            }
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e)
        {
            System.out.print(e.toString());
        }
    }
}
