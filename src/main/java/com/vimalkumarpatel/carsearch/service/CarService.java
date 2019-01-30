package com.vimalkumarpatel.carsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vimalkumarpatel.carsearch.dao.CarDao;
import com.vimalkumarpatel.carsearch.model.Car;

@Service
public class CarService {

	@Autowired
	private CarDao carDao;
	
	public Page<Car> getAllCarsPaged(Pageable pageRequest){
		Page<Car> cars = carDao.findAll(pageRequest);
		return cars;
	}

	public Page<Car> searchAllCarsPaged(String searchTerm, Pageable pageRequest){
		Car c = new Car();
		c.setColor(searchTerm);
		
		ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase().withIgnoreNullValues().withIgnorePaths("id")
				.withStringMatcher(StringMatcher.CONTAINING);
		
		Example<Car> example = Example.of(c, matcher);
		Page<Car> cars = carDao.findAll(example, pageRequest);
		return cars;
	}
	
	public Car save(Car car) {
		Car c = carDao.saveAndFlush(car);
		return c;
	}

	public List<Car> saveAll(List<Car> cars) {
		List<Car> retCars = carDao.saveAll(cars);
		return retCars;
	}
}
