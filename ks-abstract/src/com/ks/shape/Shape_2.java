package com.ks.shape;

public class Shape_2 extends Shapes
{
    int i=2;

    @Override
    void draw() 
    {
        System.out.println("This is Shape Two :"+i);
    }

    @Override
    void color(String mycolor) 
    {
        System.out.println("This is Shape Two Color:"+mycolor);
    }

    @Override
    String anotherMethod(String anotherMethod) 
    {
        System.out.println("This is Shape Two:"+anotherMethod);
        return anotherMethod;

    }

}
