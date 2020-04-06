/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author metan
 */
public class CircleClass {
     private double radius;
   private final double PI = 3.14159;
  
   CircleClass(double radius){
       setRadius(radius);
   }
  
   CircleClass(){
       setRadius(0.0);
   }
  
   void setRadius(double radius){
       this.radius = radius;
   }
  
   double getRadius(){
       return this.radius;
   }
  
   double getArea(){
       return PI * radius * radius;
   }
  
   double getDiameter(){
       return radius * 2;
   }
  
   double getCircumference(){
       return 2 * PI * radius;
   }
}
