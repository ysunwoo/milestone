package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Movie;
import com.example.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MovieServiceImpl implements MovieService{
    
    @Autowired
    private MovieRepository movieRepository;

    // @Override
    // public String save(Movie movie){
    //     return movieRepository.save(movie).getId();
    // }

    @Override
    public Movie getMovieById(int id){
        return movieRepository.findMovieByMovieID(id);
    }

    @Override
    public long count() {
        return movieRepository.count();
    }
}
