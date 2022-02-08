package assgmn6;

class Test{
    Test(int a){
        this(a*2,a*3);
        System.out.println(a+" is the number passed to the constructor");

    }
    Test(int b,int c){
        System.out.println(b+" and "+c+" are the first two multiples of the number passed " +
                "to first constructer");
    }
}

public class Constructor {
    public static void main(String[] args){
        Test t = new Test(10);
    }
}
