package pl.javastart.OperacjeNaZmiennych;



public class operacjeNaZmiennych {
    public static void main(String[] args) {
    int x = 30;
    int y = 10;
    boolean result;

result = x > y;
System.out.println(result);

result =(2*x)>y;
        System.out.println(result);
        result=(x=3)>y && (x=3)>(x-2);

        System.out.println(result);

        result = (x % y ==0);
        System.out.println(result);
    }

}
