package com.example.infs3634groupproject;

public class History {
    public String historyID;
    public String exerciseName;
    public double weight;
    public String date;
    public int Reps;
    public int oneRM;

    public History(String historyID, String exerciseName, double weight, String date, int reps, int oneRM) {
        this.historyID = historyID;
        this.exerciseName = exerciseName;
        this.weight = weight;
        this.date = date;
        Reps = reps;
        this.oneRM = oneRM;
    }

    public String getHistoryID() {
        return historyID;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public double getWeight() {
        return weight;
    }

    public String getDate() {
        return date;
    }

    public int getReps() {
        return Reps;
    }

    public int getOneRM() {
        return oneRM;
    }

    public void setHistoryID(String historyID) {
        this.historyID = historyID;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReps(int reps) {
        Reps = reps;
    }

    public void setOneRM(int oneRM) {
        this.oneRM = oneRM;
    }
}