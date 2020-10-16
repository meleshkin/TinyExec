package com.example.tinyexec;

import java.util.Objects;

public class ShTask extends Task {
    String user;
    String password;
    String pathToExecutionWorkDir;
    String pathRToExecutionFile;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPathToExecutionWorkDir() {
        return pathToExecutionWorkDir;
    }

    public void setPathToExecutionWorkDir(String pathToExecutionWorkDir) {
        this.pathToExecutionWorkDir = pathToExecutionWorkDir;
    }

    public String getPathRToExecutionFile() {
        return pathRToExecutionFile;
    }

    public void setPathRToExecutionFile(String pathRToExecutionFile) {
        this.pathRToExecutionFile = pathRToExecutionFile;
    }

    @Override
    public String toString() {
        return "ShTask{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", pathToExecutionWorkDir='" + pathToExecutionWorkDir + '\'' +
                ", pathRToExecutionFile='" + pathRToExecutionFile + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShTask shTask = (ShTask) o;
        return Objects.equals(user, shTask.user) &&
                Objects.equals(password, shTask.password) &&
                Objects.equals(pathToExecutionWorkDir, shTask.pathToExecutionWorkDir) &&
                Objects.equals(pathRToExecutionFile, shTask.pathRToExecutionFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), user, password, pathToExecutionWorkDir, pathRToExecutionFile);
    }
}
