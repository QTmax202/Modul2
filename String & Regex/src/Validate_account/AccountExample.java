package Validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUT_REGER = "^[A-Za-z_0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String account) {
        Pattern pattern = Pattern.compile(ACCOUT_REGER);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
