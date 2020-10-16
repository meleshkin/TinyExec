package com.example.tinyexec;

import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ConfigurationTest {

    private static final String testPlaybookFileName = "testPlaybook.json";

    @BeforeAll
    static void before() throws IOException {
        ShTask task = createTestShTask();

        Gson gson = new Gson();
        String json = gson.toJson(task);
        FileWriter writer = new FileWriter(new File("testPlaybook.json"));
        writer.append(json);
        writer.close();
    }

    @Test
    void loadConfigFromJsonTestEquals() throws Exception{
        Configuration configuration = new Configuration(testPlaybookFileName);
        Task loadedTask = configuration.configure(ShTask.class);

        Task exampleTask = createTestShTask();

        assertEquals(exampleTask, loadedTask);
    }

    @Test
    void loadConfigFromJsonTestNotEquals() throws Exception{
        Configuration configuration = new Configuration(testPlaybookFileName);
        Task loadedTask = configuration.configure(ShTask.class);

        Task exampleTask = createTestShTask();
        exampleTask.args.add(new TaskArgument("Arg3Key", "Arg3Value"));

        assertNotEquals(exampleTask, loadedTask);
    }

    private static ShTask createTestShTask() {
        ShTask task = new ShTask();
        task.setUser("UserName");
        task.setPassword("aPassword");
        task.setPathRToExecutionFile("/home/me");
        task.setPathToExecutionWorkDir("/home/me/test.sh");

        task.getArgs().add(new TaskArgument("Arg1Key", "Arg1Value"));
        task.getArgs().add(new TaskArgument("Arg2Key", "Arg2Value"));
        return task;
    }
}