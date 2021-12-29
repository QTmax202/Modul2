package Validate_account;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] valiAccout = {"1233455","Macbac202","sfkashfksk","_aaaaaaaaa"};
    public static final String[] valiAccout1 = {"12334","M@cb@c","sfka","12_ad"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account: valiAccout) {
            boolean isvalid = accountExample.validate(account);
            System.out.printf("Accout is %s is valid %s\n",account,isvalid);
        }

        for (String account: valiAccout1) {
            boolean isvalid = accountExample.validate(account);
            System.out.printf("Accout is %s is valid %s\n",account,isvalid);
        }
    }
}
