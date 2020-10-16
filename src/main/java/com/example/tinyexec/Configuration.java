package com.example.tinyexec;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Configuration {
    private String pathToPlaybook;

    public Configuration(String pathToPlaybook) {
        this.pathToPlaybook = pathToPlaybook;
    }

    public <T extends Task>Task configure(Class<T> clazz) throws IOException {
        Gson gson = new Gson();
        Task task = gson.fromJson(new FileReader(new File(pathToPlaybook)), clazz);
        return task;
    }
}
