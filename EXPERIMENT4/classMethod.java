class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class classMethod{
    public static void main(String[] args) {
        Person person1 = new Person("soumya",21);
        person1.displayinfo();
        person1.setAge(19);
        System.out.println("Updated Age:"+person1.getAge());
        Person person2 = new Person("Emily",21);
        person2.displayinfo();
    }
}