package com.mycompany.flightmanagement;

public class Time {
    private int hours;
    private int minutes;
    
    Time(int hours,int minutes)
    {
        this.hours=hours;
        this.minutes=minutes;
    }
    public int gethour()
    {
        return hours;
    }
    public int getminute()
    {
        return minutes;
    }
    @Override
    public String toString()
    {
        return hours+" : "+minutes;
    }
    
}
