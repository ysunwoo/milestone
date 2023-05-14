package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
@Document(collection = "exercise_plan")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ExercisePlan {
    @Id
    private String id;
    private String userId;
    private String dayOfWeek;
    private int time;
    private String target;

    public ExercisePlan(){
    }

    public ExercisePlan(String userId, String dayOfWeek, int time, String target){
        this.userId = userId;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.target = target;
    }

}
