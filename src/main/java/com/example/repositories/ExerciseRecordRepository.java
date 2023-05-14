package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ExerciseRecord;
import java.util.List;


@Repository
public interface ExerciseRecordRepository extends MongoRepository<ExerciseRecord, String>{
    List<ExerciseRecord> findByUserId(String userId);
    List<ExerciseRecord> findByUserIdAndDayOfWeek(String userId, String dayOfWeek);
}
