package dynamicbindingdemo;
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudents());
        m(new Student()); //this equivalent with :
        Object o = new Student();
        m(o);
        m(new Person());
        m(new Object());      
        
        //n(new int[50]);
        n(new Integer[50]);
        n(new String[50]);
        n(new Object[50]);
    }
    
    public static void m(Object x){
        System.out.println(x.toString());
    }
    
    public static void n(Object[] y){
        System.out.println(y.toString());
    }
}    

class GraduateStudents extends Student{
        
}
    
class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
