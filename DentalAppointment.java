import java.util.Scanner;

 DentalAppointment {

    Person person;
    Time startTime;
    Time endTime;
    Date date;

    private int apptDur;

    public DentalAppointment(String last, String first, int month, int day, int year, int hour, int minute){

        person = new Person(last,first,"");
        startTime = new Time(hour,minute);

        endTime = new Time(hour,minute);
        date = new Date(month, day, year);

        this.apptDur = 30;
        endTime.add(apptDur);
    }

    public DentalAppointment(String first, String last, int month, int day, int year, int hour, int minute, int apptDur){
        person = new Person(last,first,"");
        startTime = new Time(hour,minute);

        endTime = new Time(hour,minute);
        date = new Date(month, day, year);

        this.apptDur = apptDur;
        endTime.add(this.apptDur);
    }


    public void display(){
        person.display();
        date.display();
        System.out.print("Dental appointment scheduled: ");
        startTime.display();
        System.out.print("Dental appointment ends: ");
        endTime.display();

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        DentalAppointment [] dental = new DentalAppointment[3];

        for (int i =0; i <3; i++ ) {
            System.out.print("First: ");
            String first = sc.nextLine();
            System.out.print("Last: ");
            String last = sc.nextLine();
            System.out.print("Month: ");
            int month = sc.nextInt();
            System.out.print("Day: ");
            int day = sc.nextInt();
            System.out.print("Year: ");
            int year = sc.nextInt();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            System.out.print("Minute: ");
            int minute = sc.nextInt();
            System.out.print("Duration (-1 for nothing): ");
            int apptDur = sc.nextInt();
            String empty = sc.nextLine();


            if (apptDur == -1){
                DentalAppointment app = new DentalAppointment(last,first,month,day,year,hour,minute);
                dental[i] = app;
                app.display();
            }
            else{
                DentalAppointment app = new DentalAppointment(last,first,month,day,year,hour,minute,apptDur);
                dental[i] = app;
                app.display();
            }

        }
    }

}
