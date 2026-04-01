class TestPolymorphism{
    public static void main(String[]args){
        Parent a;
        a=new subclass1();
        a.Print();
        a=new subclass2();
        a.Print();
    }
}

class Parent {
    public void Print() {
        System.out.println("Parent");
    }
}

class subclass1 extends Parent {
    @Override
    public void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {
    @Override
    public void Print() {
        System.out.println("subclass2");
    }
}