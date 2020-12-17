package com.offcn.demo01.controller;

import com.offcn.demo01.entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CarController {
  @RequestMapping("/getCar")
    public List<Car> getcar(){
     Car car1 = new Car(1001,"lucy",12.77f,new Date());
      Car car2 = new Car(1001,"lucy",12.77f,new Date());
      Car car3= new Car(1001,"lucy",12.77f,new Date());
      List<Car> list = new ArrayList<Car>();
      list.add(car1);
      list.add(car2);
      list.add(car3);
      return list;
  }
}
