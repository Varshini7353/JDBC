package com.xworkz.movie.dto.dao;

import com.xworkz.movie.dto.impl.Moviedto;

public class DaoImpl implements DaoMovie{
    @Override
    public String saveMovie(Moviedto moviedto) {
        System.out.println(moviedto);
        return "Saved Successfully ";

    }
}
