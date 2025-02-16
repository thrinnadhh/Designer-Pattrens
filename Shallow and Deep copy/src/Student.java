import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Integer> marks;
    public <ArrayListList> Student(int id, String name, ArrayList<Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

//    Copy constructor
    public Student(Student source){
        this.id = source.id;
        this.name = source.name;
        this.marks = new ArrayList<>(source.marks);
//        for(int marks:source.marks){
//            this.marks.add(marks);
//        }

    }

    public String toString(){
        return "student id: "+id+" name: "+name+"list: "+marks;
    }

    public static void main(String[] args) {
//        Deep copy
        Student Original = new Student(101,"John",new ArrayList<>(List.of(90,80,70)));
        Student Copy = new Student(Original);
        System.out.println(Original);
        System.out.println(Copy);
        Copy.id = 201;
        System.out.println(Copy.marks.get(0));
        Copy.marks.set(0,100);
        System.out.println(Original);
        System.out.println(Copy);
        System.out.println("------------------------------------------------");
//        Shallow copy
        Student copy2 = Original;
        System.out.println(Original);
        System.out.println(copy2);
        copy2.id = 301;
        System.out.println(copy2.marks.get(0));
        copy2.marks.set(0,100);
        System.out.println(Original);
        System.out.println(copy2
        );

    }
}
