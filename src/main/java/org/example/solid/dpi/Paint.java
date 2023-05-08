package org.example.solid.dpi;

public class Paint {
  private String color;

  public Paint(String color) {
    this.color = color;
  }

  public String getColor(){
    return String.format("and color: " + color);
  }


}
