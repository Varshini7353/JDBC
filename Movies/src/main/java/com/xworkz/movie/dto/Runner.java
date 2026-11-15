package com.xworkz.movie.dto;

import com.xworkz.movie.dto.dao.DaoImpl;
import com.xworkz.movie.dto.dao.DaoMovie;
import com.xworkz.movie.dto.impl.Moviedto;

public class Runner {
    public static void main(String[] args) {

        Moviedto moviedto = new Moviedto();

        moviedto.setId(1);
        moviedto.setMovieName("DC");
        moviedto.setRatings(2);

        DaoMovie movie = new DaoImpl();
        String result = movie.saveMovie(moviedto);
        System.out.println(result);
    }
}
