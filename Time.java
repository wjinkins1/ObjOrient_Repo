import java.util.Scanner;

public class Time {

    private int hours;
    private int minutes;

    public Time()
    {
        hours = 0;
        minutes = 0;
    }


    public void add(int minutes)
    {
        this.minutes += minutes;
        if (minutes >= 60){
            int hr = minutes/60;
            hours += hr;
            minutes = minutes%60;
        }
    }


    public Time(int hours, int minutes)
    {
        if (hours > 23 || minutes > 59)
        {
            hours = hours%24;
            minutes = minutes%60;
        }
        else
        {
            this.hours = hours;
            this.minutes = minutes;
        }
    }


    public void display()
    {
        System.out.println(this.hours + ":"+ this.minutes);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        Time time = new Time(hours, minutes);
        time.display();


    }
}
