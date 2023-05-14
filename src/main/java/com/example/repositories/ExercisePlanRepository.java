package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ExercisePlan;
import java.util.List;
@Repository
public interface ExercisePlanRepository extends MongoRepository<ExercisePlan, String>{
}
