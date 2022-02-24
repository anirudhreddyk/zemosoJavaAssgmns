package JavaGeneralPrograms;

public class WrapperClass {
    public static void main(String[] args) {

        String numberString = "500";
        int convertedNumber = Integer.parseInt(numberString);
        System.out.println(convertedNumber + 10);
        String convertedString = String.valueOf(convertedNumber);
        System.out.println("converted to String is" + convertedString);
    }
}
