package java8features.lambda.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class Streaming {
public static void main(String[] arr1){
	
	Consumer<Student> c = (s)->System.out.println(s.name); 
	Predicate<Student> p = (i)->i.marks>70;
	
	List<Student> studList = new ArrayList<>();

     Student[] student = new Student[3];
     Student std1 = new Student();
     Student std2 = new Student();
     Student std3 = new Student();
     
     studList.add(std1);
     studList.add(std2);
     studList.add(std3);
     
     std1.setMarks(90);
     std1.setName("ABC");
     std1.setWeight(50);
     
     std2.setMarks(60);
     std2.setName("DEF");
     std2.setWeight(60);
     
     std3.setMarks(80);
     std3.setName("XYZ");
     std3.setWeight(70);
     
     student[0] = std1;
     student[1] = std2;
     student[2] = std3;
     
     System.out.println("using array..");
   List<Student> s= Arrays.stream(student).filter(p.negate()).collect(Collectors.toList());
   s.forEach(c);
   
   //array of Student, first convert to stream using Arrays
   Arrays.stream(student).filter(p).forEach(c);
   
   System.out.println("Display single student using consumer..");
   c.accept(std3);

   System.out.println("Using list..");
   studList.stream().filter(p).forEach(c);
   
   System.out.println("using parallel Stream..");
   studList.parallelStream().filter(p).collect(Collectors.toList()).forEach(c);
 
       }
}
class Student implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    int marks;
    int weight;
    public int getWeight() {
        return weight;
    }
 
    public void setWeight(int weight) {
        this.weight = weight;
    }
 
 
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", weight=" + weight +
                '}';
    }
 
 
}