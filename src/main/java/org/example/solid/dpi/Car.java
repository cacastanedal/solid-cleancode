package org.example.solid.dpi;

public class Car {
  private final Paint paint;
  private final String brand;
  private final String model;

  public Car(Paint paint, String brand, String model) {
    this.paint = paint;
    this.brand = brand;
    this.model = model;
  }

  public String getCarInfo(){
    return String.format("Car from brand: %s, model: %s %s", this.brand, this.model, this.paint.getColor());
  }
}
