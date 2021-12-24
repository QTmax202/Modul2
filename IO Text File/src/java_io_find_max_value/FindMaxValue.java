package java_io_find_max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readLine = new ReadAndWriteFile();
        List<Integer> list = readLine.readFile("src/java_io_find_max_value/numbers");
        int maxValue = findMax(list);
        System.out.println(maxValue);
        readLine.wrireFile("src/java_io_find_max_value/result", maxValue);
    }
}
