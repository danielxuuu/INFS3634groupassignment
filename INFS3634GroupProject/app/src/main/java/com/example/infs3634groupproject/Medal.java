package com.example.infs3634groupproject;

public class Medal {
    private int medalId;
    private String medalName;
    private String medalDescription;
    private String exerciseName;
    private int medalDrawableID;


    public Medal(int medalId, String medalName, String medalDescription, String exerciseName, int medalDrawableID) {
        this.medalId = medalId;
        this.medalName = medalName;
        this.medalDescription = medalDescription;
        this.exerciseName = exerciseName;
        this.medalDrawableID = medalDrawableID;
    }

    public int getMedalId() {
        return medalId;
    }

    public void setMedalId(int medalId) {
        this.medalId = medalId;
    }

    public String getMedalName() {
        return medalName;
    }

    public void setMedalName(String medalName) {
        this.medalName = medalName;
    }

    public String getMedalDescription() {
        return medalDescription;
    }

    public void setMedalDescription(String medalDescription) {
        this.medalDescription = medalDescription;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getMedalDrawableID() {
        return medalDrawableID;
    }

    public void setMedalDrawableID(int medalDrawableID) {
        this.medalDrawableID = iconID;
    }
}
