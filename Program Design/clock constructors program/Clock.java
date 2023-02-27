/**
 * Constructors
 */
public class Clock {

    public void setTime(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24) {
            hr = hours;
        }
        else {
            hr = 0;
        }

        if(minutes >= 0 && minutes < 60) {
            min = minutes;
        }
        else{
            min = 0;
        }

        if(seconds >= 0 && seconds < 60) {
            sec = seconds;
        }
        else {
            sec = 0;
        }
    }

    public int getHours(){
        return hr;
    }

    public int getMinutes(){
        return min;
    }

    public int getSeconds(){
        return sec;
    }

    public void printTime(){
        if(hr < 10) {
            System.out.print("0");
            System.out.print(hr + ":");
        }
        if(min < 10) {
            System.out.print("0");
            System.out.print(min + ":");
        }
        if(sec < 10) {
            System.out.print("0");
            System.out.print(sec);
        }
    }

    public void incrementHours() {
        hr++;
        if(hr > 23) {
            hr = 0;
        }
    }

    public void incrementMinutes() {
        min++;
        if(min > 59) {
            min = 0;
        }
    }

    public void incrementSeconds() {
        sec++;
        if(sec > 59) {
            sec = 0;
        }
    }

    public boolean equals(Clock otherClock) {
        return (hr == otherClock.hr 
        && min == otherClock.min 
        && sec == otherClock.sec);


    }

    public void makeCopy(Clock otherClock) {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    public Clock getCopy() {
       /** Clock temp = new Clock();
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;

        return temp;
    }


}