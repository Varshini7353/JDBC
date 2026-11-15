package com.xworkz.movies;

import com.xworkz.movies.dao.DaoImpl;
import com.xworkz.movies.dao.Daomovie;
import com.xworkz.movies.impl.MovieDto;


public class Runner {

    public static void main(String[] args) {

        MovieDto movieDto = new MovieDto();
        movieDto.setId(1);
        movieDto.setMovieName("Toxic");
        movieDto.setRatings(4);

        Daomovie daomovie = new DaoImpl();
        String result= daomovie.saveMovie(movieDto);

        System.out.println(result);


    }
}
