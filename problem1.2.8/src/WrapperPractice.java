public class WrapperPractice {
    public static void main(String[] args) {
        //Integer
        Integer number = new Integer(5);
        System.out.println(number);
        System.out.println(number.intValue());
        //double
        Double number2 = new Double(.05);
        System.out.println(number2);
        System.out.println(number2.doubleValue());
        //double min and max values
        System.out.println(number2.MAX_VALUE);
        System.out.println(number2.MIN_VALUE);
        //autoboxing
        int number3 = 3;
        Integer number4 = number3;
        //unboxing
        int number5 = number4;
    }
}
