package com.example.tinyexec;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task {
    Set<TaskArgument> args = new HashSet<TaskArgument>();

    public Set<TaskArgument> getArgs() {
        return args;
    }

    public void setArgs(Set<TaskArgument> args) {
        this.args = args;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(args, task.args);
    }

    @Override
    public int hashCode() {
        return Objects.hash(args);
    }
}
