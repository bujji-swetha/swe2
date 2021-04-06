public class Student
{
String name;
String course;
int Regno;
public Student(String name,String course,int age)
{
this.name = name;
this.course = course;
this.Regno = Regno;
}
public String getName()
{
return name;
}
public static void main(String[] args)
{
Student s1 = new Student("swetha","CSE",501);

System.out.println(s1.getName());
}
}
