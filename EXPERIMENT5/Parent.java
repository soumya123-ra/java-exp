class Parent{
    void display(){
        System.out.println(" parent class");
    }
    class subclass1 extends Parent{
        void display(){
            System.out.println("sub class1");
        }
        class subclass2 extends Parent{
            void display(){
                System.out.println("sub class2");
            }
        }
    }
}
