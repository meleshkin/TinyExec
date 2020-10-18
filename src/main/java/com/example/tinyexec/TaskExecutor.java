package com.example.tinyexec;

public class TaskExecutor {
    TaskExecutionStrategy strategy;
    void setStrategy(TaskExecutionStrategy strategy) {
        this.strategy = strategy;
    }
    void execute(Task task) {
        if (strategy == null) {
           throw new IllegalStateException("Execution strategy not set");
        }
        strategy.execute(task);
    }
}
