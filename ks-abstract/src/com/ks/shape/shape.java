package com.ks.shape;
abstract class Shapes 
{
   int i=1;

   abstract void draw();
   abstract void color(String mycolor);

   //not an abstract method
   void fill()
   {
      System.out.println("Non-Abstract Method -> Fill"); 
   }

   //not an abstract method
   String anotherMethod(String input) 
   {
       return input + " additional text";
   }

}
