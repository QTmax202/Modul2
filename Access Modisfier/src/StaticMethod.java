public class StaticMethod {
    int rollno;
    String name;
    public static String college = "KS-NB";

    public StaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        college = "CodeGym";
    }

    void display(){
        System.out.printf("%d - %s - %s",rollno,name,college);
        System.out.println();
    }

    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod(247,"QT-247");
        s1.display();

        StaticMethod.change();
        StaticMethod s2 = new StaticMethod(9092,"Fhy");
        StaticMethod s3 = new StaticMethod(73,"HN-SV");
        s2.display();
        s3.display();
    }
}
