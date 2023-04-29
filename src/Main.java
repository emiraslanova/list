import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       StudentManager studentManager =  new StudentManager();
        System.out.println(studentManager.getById(2));
        System.out.println(studentManager.getAll());
        studentManager.SaveStudent(new Student(5,"JALA" , (byte) 20));
        System.out.println(studentManager.getAll());











//        List<String> color = new ArrayList<>();
//
//        color.add("pink ");
//        color.add("black");
//        color.add("white");
//        System.out.println(color);
//
//        for (String str : color) {
//            System.out.println(str);
//
//        }
//
//        System.out.println(color.get(0));
//
//
//        System.out.println(color.isEmpty() ? "colur bosdur" : "color bos deyil");
//
//
//        LinkedList<String> reng = new LinkedList<>();
//
//        reng.add("yellow");
//        reng.add("green");
//        reng.add("blue");
//        System.out.println(reng.contains("yellow") ? "var" : "eks halda yoxdur" );
//
//


    }

}