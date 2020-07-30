package bt_validate_number_phone;

public class NumberPhoneExampleTest {
    private static NumberPhoneExample numberPhoneExample;

    public static final String [] validNumber = new String[] {"(84)-(0978489648)"};
    public static final String [] invalidNumber = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        numberPhoneExample = new NumberPhoneExample();

        for (String numberPhone : validNumber) {
            boolean isValid = numberPhoneExample.validate(numberPhone);
            System.out.println(" PhoneNumber " + numberPhone + " valid number " + isValid);
        }

        for (String numberPhone : invalidNumber) {
            boolean isValid = numberPhoneExample.validate(numberPhone);
            System.out.println(" PhoneNumber " + numberPhone + " valid number " + isValid);
        }
    }

}
