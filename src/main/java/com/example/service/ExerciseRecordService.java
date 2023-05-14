package com.example.service;

import com.example.model.ExerciseRecord;
import java.util.List;

public interface ExerciseRecordService {
    List<ExerciseRecord> getExerciseRecordByUserId(String userId);
    List<ExerciseRecord> getExerciseRecordByUserIdAndDay(String userId, String dayOfWeek);
    ExerciseRecord createExerciseRecord(ExerciseRecord exerciseRecord);
}
