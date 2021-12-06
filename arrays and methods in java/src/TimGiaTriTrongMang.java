import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);
        System.out.print("In name Students: ");
        String inName = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inName)){
                System.out.printf("Name %s in the list of the students is : %d",inName,i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.printf("Name %s no in the list of the students!",inName);
        }
    }
}
