package com.vimalkumarpatel.carsearch.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vimalkumarpatel.carsearch.model.Car;
import com.vimalkumarpatel.carsearch.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService CarService;
	
	@GetMapping(value = "/all")
	public Page<Car> getCars(Pageable pageRequest){
		Page<Car> cars = CarService.getAllCarsPaged(pageRequest);
		return cars;
	}
	
	@GetMapping(value = "/search")
	public Page<Car> searchCars(@RequestParam("q") String searchTerm, Pageable pageRequest){
		Page<Car> cars = CarService.searchAllCarsPaged(searchTerm, pageRequest);
		return cars;
	}
	
	@PostMapping("/")
	public @ResponseBody Car saveCar(@RequestBody @Valid Car car) {
		Car c = CarService.save(car);
		return c;
	}
	
}
