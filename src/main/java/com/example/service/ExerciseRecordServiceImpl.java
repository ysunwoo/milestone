package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.ExerciseRecord;
import com.example.repositories.ExerciseRecordRepository;

import java.util.List;

@Service
public class ExerciseRecordServiceImpl implements ExerciseRecordService {

    private final ExerciseRecordRepository exerciseRecordRepository;

    public ExerciseRecordServiceImpl(ExerciseRecordRepository exerciseRecordRepository) {
        this.exerciseRecordRepository = exerciseRecordRepository;
    }

    @Override
    public ExerciseRecord createExerciseRecord(ExerciseRecord exerciseRecord) {
        return exerciseRecordRepository.save(exerciseRecord);
    }

    @Override
    public List<ExerciseRecord> getExerciseRecordByUserId(String userId) {
        return exerciseRecordRepository.findByUserId(userId);
    }

    @Override
    public List<ExerciseRecord> getExerciseRecordByUserIdAndDay(String userId, String dayOfWeek) {
        return exerciseRecordRepository.findByUserIdAndDayOfWeek(userId, dayOfWeek);
    }

}