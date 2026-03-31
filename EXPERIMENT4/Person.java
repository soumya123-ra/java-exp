public class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Age must be positive.");
        }

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    }
