package org.example.solid.dpi;

import java.util.List;

public class CarShopApp {

  static List<Paint> paints = List.of(
    new Paint("silver"),
    new Paint("white"),
    new Paint("black")
  );

  static List<Car> featuredCars = List.of(
    new Car(paints.get(0), "Nissan", "Sedan"),
    new Car(paints.get(1), "Honda", "Van"),
    new Car(paints.get(2), "Toyota", "SUV")
  );

  public static void showFeaturedCars(){
    for(Car featuredCar : featuredCars){
      System.out.println(featuredCar.getCarInfo());
    }
  }

  public static void main(String[] args) {
    showFeaturedCars();
  }
}
