public class TriangleClassifier {
    public static String trianglesClassification(double firstEdge, double secondEdge, double thirdEdge){
        if (firstEdge + secondEdge > thirdEdge & firstEdge + thirdEdge > secondEdge & secondEdge + thirdEdge > firstEdge){
            if (firstEdge == secondEdge & firstEdge == thirdEdge & secondEdge == thirdEdge){
                return "tam giác đều";
            } else if (firstEdge == thirdEdge || firstEdge == secondEdge || secondEdge == thirdEdge){
                return "tam giác cân";
            } else if (Math.pow(firstEdge,2) == Math.pow(secondEdge,2)+Math.pow(thirdEdge,2) || Math.pow(secondEdge,2) == Math.pow(firstEdge,2)+Math.pow(thirdEdge,2) || Math.pow(thirdEdge,2) == Math.pow(firstEdge,2)+Math.pow(secondEdge,2)){
                return "tam giác vuông";
            }
            return "tam giác thường";
        } else {
            return "không phải là tam giác";
        }
    }
}
