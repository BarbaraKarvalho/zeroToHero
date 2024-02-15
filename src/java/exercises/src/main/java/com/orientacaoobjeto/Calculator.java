package com.orientacaoobjeto;

public class Calculator {
    private double time;
    private double speed;

    public Calculator(double time, double speed){
        if(time == 0 || speed == 0 ) throw new IllegalArgumentException("Invalid parameters");
        this.time = time;
        this.speed = speed;
    }

    public double getDistance(){
        return time * speed;
    }
}
