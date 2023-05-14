package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Document(collection = "exercise_record")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ExerciseRecord {
    @Id
    private String id;
    private String userId;
    private String exerciseId;
    private String exerciseName;
    private int sets;
    private int reps;
    private int restPeriod;
    private String dayOfWeek;

    public ExerciseRecord() {
    }

    public ExerciseRecord(String userId, String exerciseId, String exerciseName, int sets, int reps, int restPeriod, String dayOfWeek) {
        this.userId = userId;
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.restPeriod = restPeriod;
        this.dayOfWeek = dayOfWeek;
    }
}
