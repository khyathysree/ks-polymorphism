package com.ks.shape;

public class Shape_1 extends Shapes 
{
    int i=1;

    @Override
    void draw() 
    {
        System.out.println("This is Shape One:"+i);
    }

    @Override
    void color(String mycolor) 
    {
        System.out.println("This is Shape One:"+mycolor);

    }

    @Override
    String anotherMethod(String anotherMethod) 
    {
        System.out.println("This is Shape One:"+anotherMethod);
        return anotherMethod;

    }

}

