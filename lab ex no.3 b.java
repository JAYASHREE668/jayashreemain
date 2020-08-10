class Student
{
    int rlno;
    String name;
    static String clg="VCET";
    Student(int r,String n)
    {
        rlno=r;
        name=n;
    
    }
    void display()
    {
        System.out.println(rlno+" "+name+" "+clg);
    }

public static void main(String args[])
    {
        Student s1=new Student(1,"Maya");
        Student s2=new Student(2,"Gaya");
        Student s3=new Student(3,"Laya");
        
        s1.display();
        s2.display();
        s3.display();
        
    }
}