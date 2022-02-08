
public class Person {

    private String name;
    private int dateOfbirth;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.dateOfbirth = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(int dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
    public void talk(){
        System.out.println("The person talking");
    }
    public void run(){
        System.out.println("The person running");
    }
    @Override
    public String toString(){
        return "Person name: " + name + ", date of birth: " + dateOfbirth;
    }
}

