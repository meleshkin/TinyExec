package com.example.tinyexec;

public class LocalShTaskExecutionStrategy implements TaskExecutionStrategy{

    @Override
    public void execute(Task task) {
        if (task instanceof LocalShTask) {
            System.out.println("Executing Local sh task: " + task);
        } else {
            throw new IllegalArgumentException("Bad task type");
        }
    }
}
