package validate_email;

public class Main {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc22@hotmail.com.vn" };
    public static final String[] invalidEmail = new String[] { "A@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
