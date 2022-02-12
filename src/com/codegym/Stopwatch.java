package com.codegym;

public class Stopwatch {
    long startTime,endTime;
    public Stopwatch(){
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long result= -this.startTime+this.endTime;
        return  result;
    }
}
