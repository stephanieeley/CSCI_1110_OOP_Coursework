//Stephanie Eley
//Date:04/07/2020

public class TestMyInteger{

    public static void main(String[] args ){
        MyInteger client1 = new MyInteger(27);
        System.out.println(client1.isEven());
        System.out.println(MyInteger.isEven(client1));
        System.out.println(MyInteger.isEven(4));
        System.out.println(client1.isOdd());
        System.out.println(MyInteger.isOdd(client1));
        System.out.println(MyInteger.isOdd(9));
        System.out.println(client1.isPrime());
        System.out.println(MyInteger.isPrime(client1));
        System.out.println(MyInteger.isPrime(3));
        System.out.println(client1.equals(client1));
        System.out.println(client1.equals(6));
        char[] array = {'1', '2', '3'};
        System.out.println(MyInteger.parseInt(array));
        System.out.println(MyInteger.parseInt("123"));
    }
}
