public class Person {

    private String last;
    private String first;
    private String zip;

    public Person(){
        last = "";
        first = "";
        zip = "";
    }

    public Person(String l, String f, String z){
        this.last = l;
        this.first = f;
        this.zip = z;
    }

    public void display(){
        System.out.println("last name: "+this.last);
        System.out.println("first name: " + this.first);
    }

    public static void main(String [] args){
        Person person = new Person();
        Person person2 = new Person();

        person.display();
        person2.display();

    }

}
