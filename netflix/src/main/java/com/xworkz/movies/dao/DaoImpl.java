package com.xworkz.movies.dao;

import com.xworkz.movies.impl.MovieDto;

public class DaoImpl implements Daomovie{
    @Override
    public String saveMovie(MovieDto movieDto) {
        System.out.println(movieDto);
        return "Saved successfully";
    }
}
