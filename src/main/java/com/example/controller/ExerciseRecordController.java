package com.example.controller;

import com.example.model.ExerciseRecord;
import com.example.service.ExerciseRecordService;
import com.example.exception.ObjectIdException;
import com.example.exception.ParameterErrorNumberException;
import com.example.exception.ParameterErrorStringException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseRecordController {
    private final ExerciseRecordService exerciseRecordService;

    public ExerciseRecordController(ExerciseRecordService exerciseRecordService) {
        this.exerciseRecordService = exerciseRecordService;
    }

    @ExceptionHandler(ObjectIdException.class)
    public ResponseEntity<String> handleObjectIdException(ObjectIdException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ParameterErrorNumberException.class)
    public ResponseEntity<String> handleParameterErrorNumberException(ParameterErrorNumberException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ParameterErrorStringException.class)
    public ResponseEntity<String> handleParameterErrorStringException(ParameterErrorStringException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @PostMapping
    public ResponseEntity<ExerciseRecord> createExerciseRecord(@RequestBody ExerciseRecord exerciseRecord) {
        ExerciseRecord createdExerciseRecord = exerciseRecordService.createExerciseRecord(exerciseRecord);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExerciseRecord);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ExerciseRecord>> getExerciseRecordByUserId(@PathVariable("userId") String userId) {
        List<ExerciseRecord> exerciseRecords = exerciseRecordService.getExerciseRecordByUserId(userId);
        return ResponseEntity.ok(exerciseRecords);
    }
    @GetMapping("/user/{userId}/{dayOfWeek}")
    public ResponseEntity<List<ExerciseRecord>> getExerciseRecordByUserIdAndDay(@PathVariable String userId, @PathVariable String dayOfWeek) {
        List<ExerciseRecord> exerciseRecords = exerciseRecordService.getExerciseRecordByUserIdAndDay(userId, dayOfWeek);
        return ResponseEntity.ok(exerciseRecords);
    }
}
