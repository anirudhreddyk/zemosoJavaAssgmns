package assgmn8;

class Errors {
    public void method() {
        int arr[] = new int[2];
        String s=null;
        try {
            System.out.println(s.charAt(0));
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}

public class ErrorHandling {
    public static void main(String[] args) {
        Errors error=new Errors();
        error.method();
    }
}
