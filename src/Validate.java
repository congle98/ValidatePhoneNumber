import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private Pattern pattern;
    private Matcher matcher;
    public final String PHONE_NUMBER_VALIDATE = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public Validate(){
        pattern = Pattern.compile(PHONE_NUMBER_VALIDATE);
    }
    public  boolean validateClassName(String regex){
        matcher = pattern.matcher(regex);
        return  matcher.find();
    }

    public static void main(String[] args) {
        Validate validate = new Validate();
        String phoneNumber = "(84)-(0342910909)";
        String phoneNumber2 = "(48)-(0123456789)";
        System.out.println(validate.validateClassName(phoneNumber));
        System.out.println(validate.validateClassName(phoneNumber2));
    }
}
