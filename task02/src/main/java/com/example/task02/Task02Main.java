package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan timeSpan1 = new TimeSpan(1, 0, 0);
        TimeSpan timeSpan2 = new TimeSpan(0, 0, 1);

        timeSpan1.subtract(timeSpan2);

        System.out.println(timeSpan1.getHours());
        System.out.println(timeSpan1.getMinutes());
        System.out.println(timeSpan1.getSeconds());

    }
}

class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setHours(int hours){
        if (hours >= 0) {
            this.hours = hours;
        } else {
            System.out.println("Ошибка: часы не могут быть отрицательными.");
        }
    }

    public void setMinutes(int minutes){
        if (minutes >= 0) {
            this.minutes = minutes;
        } else {
            System.out.println("Ошибка: минуты не могут быть отрицательными.");
        }
    }

    public void setSeconds(int seconds){
        if (seconds >= 0) {
            this.seconds = seconds;
        } else {
            System.out.println("Ошибка: секунды не могут быть отрицательными.");
        }
    }

    public TimeSpan(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void add(TimeSpan time){
        hours += time.getHours();

        if((minutes + time.getMinutes()) >= 60){
            int subMin = minutes + time.getMinutes();
            hours += subMin / 60;
            minutes = subMin % 60;
        } else {
            minutes += time.getMinutes();
        }

        if((seconds + time.getSeconds()) > 60){
            int subSec = seconds + time.getSeconds();
            minutes += subSec / 60;
            seconds = subSec % 60;
        } else {
            seconds += time.getSeconds();
        }
    }

    public void subtract(TimeSpan time){
        if ((seconds - time.getSeconds()) < 0){
            int subSec = seconds - time.getSeconds();
            minutes--;
            seconds = 60 + subSec;
        } else {
            seconds -= time.getSeconds();
        }

        if ((minutes - time.getMinutes()) < 0){
            int subMin = minutes - time.getMinutes();
            hours --;
            minutes = 60 + subMin;
        } else {
            minutes -= time.getMinutes();
        }

        hours -= time.getHours();
    }

    public String toString() {
        String hoursStr = Long.toString(hours);
        String minutesStr = Long.toString(minutes);
        String secondsStr = Long.toString(seconds);

        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }
}
