package com.vimalkumarpatel.carsearch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vimalkumarpatel.carsearch.model.Car;

public interface CarDao extends JpaRepository<Car, String>{

}
