import java.text.DecimalFormat;
import java.util.Arrays;

public class Students {
    private String name = "QT-247202";
    private int age = 16;
    private String sex = "male";
    private String address = "KS-NB";
    private double pointMath = 8.85;
    private double pointLiterature = 7.5;
    private double pointEnglish = 10;

    public Students() {
    }

    public Students(String name, int age, String sex, String address, double pointMath, double pointLiterature, double pointEnglish) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setPointMath(double pointMath) {
//        this.pointMath = pointMath;
//    }
//
//    public void setPointLiterature(double pointLiterature) {
//        this.pointLiterature = pointLiterature;
//    }
//
//    public void setPointEnglish(double pointEnglish) {
//        this.pointEnglish = pointEnglish;
//    }

    public double Avg() {
        return (this.pointMath + this.pointLiterature + this.pointEnglish) / 3;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", pointMath=" + pointMath +
                ", pointLiterature=" + pointLiterature +
                '}';
    }


    public static void main(String[] args) {
        Students[] obj = new Students[3];
        Students sdu1 = new Students();
        Students sdu2 = new Students("Cuong", 18, "male", "HN", 10, 10, 11);
        Students sdu3 = new Students("DangHuong", 17, "female", "NA", 1, 1, 1);

        obj[0] = sdu1;
        obj[1] = sdu2;
        obj[2] = sdu3;

        for (Students i : obj
        ) {
            System.out.println(i);
        }

        System.out.println();

        for (Students i : obj
        ) {
            System.out.printf("Name Student: %-10s; Avg: %.2f", i.name, i.Avg());
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < obj.length-1; i++) {
            for (int j = i; j < obj.length; j++) {
                if (obj[i].Avg() > obj[j].Avg()) {
                    Students temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        for (Students i : obj
        ) {
            System.out.printf("Name Student: %-10s; Avg: %.2f", i.name, i.Avg());
            System.out.println();
        }

    }
}
