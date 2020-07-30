package bt_validate_ten_lop_hoc;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[] {"C0318G"};
    public static final String[] invalidClass = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();

        for (String className : validClass) {
            boolean isValid = classExample.validate(className);
            System.out.println(" ClassName " + className + " valid class " + isValid);
        }

        for (String className : invalidClass) {
            boolean isValid = classExample.validate(className);
            System.out.println(" ClassName " + className + " valid class " + isValid);
        }
    }
}
