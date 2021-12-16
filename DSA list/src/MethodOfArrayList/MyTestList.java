package MethodOfArrayList;
import java.util.Arrays;

public class MyTestList {
    public static void main(String[] args) {
        MyList<String> list = new MyList();

        list.add("T");
        list.add("O");
        list.add("I");
        list.add(3,"M");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
        System.out.println(list.contains("O"));
        System.out.println(list.indexOf("M"));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        System.out.println(list);
        System.out.println(list.contains("O"));
        System.out.println(list.indexOf("I"));
    }
}
