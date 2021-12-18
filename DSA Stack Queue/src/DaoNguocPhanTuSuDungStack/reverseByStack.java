package DaoNguocPhanTuSuDungStack;

public class reverseByStack {
    public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack obj = new Stack(n);
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("TOTTITPTTI");
        reverse(s);
        System.out.print("-" + s+ "-");
    }
}
