class Student{
    int rollno;
    String name;
    void insertData(int r,String n){
        rollno = r;
        name = n;
    }
    void displayinfo(){
        System.out.print(rollno+" "+name);
    }
}
class Student3{
    public static void main(String[] args) {
        Student s1 = new Student();
            Student s2 = new Student();

            s1.insertData(82,"Soumya");
            s2.insertData(83,"Sourav");
           s1.displayinfo();
              s2.displayinfo(); 
    }
}