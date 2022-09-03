package com.epam.mjc.stage0;

public class Animal {
  private String color;
  private int numberOfPaws;
  private boolean hasFur;
  
  public Animal(String color,int numberOfPaws,boolean hasFur){
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }
  
  public String getDescription(){
    if(hasFur){
      if(numberOfPaws == 1){
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paw and a fur.";
      }
      return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paws and a fur.";
    }
    if(numberOfPaws == 1){
      return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paw and no fur.";
    }
    return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paws and no fur.";
  }
  
  
}
