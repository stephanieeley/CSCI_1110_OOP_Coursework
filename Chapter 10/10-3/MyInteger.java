//Stephanie Eley
//Date:04/01/2020

public class MyInteger{

    int value = 0;

    public MyInteger(int value){
        this.value = value;

    }
    public int getValue(){
        return this.value;
    }
    public boolean isEven(){
        if(this.value % 2 == 0){
        return true;
        }
        return false;
    }

    public boolean isOdd(){
        if(!this.isEven(this.value)){
            return true;
        }
        return false;
    }
    public boolean isPrime(){
        return isPrime(this.value);
    }

    public static boolean isEven(int even){
        if(even % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(int odd){
        if(!isEven(odd)){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int prime){
        for(int i= 2; i < (prime / 2); i++){
            if(prime % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger even){
        if(even.value % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(MyInteger odd){
        if(!isEven(odd)){
            return true;
        }
        return false;
    }
    public static boolean isPrime(MyInteger prime){
        for(int i= 2; i < (prime.value / 2); i++){
            if(prime.value % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean equals(MyInteger myInt){
        if(this.value == myInt.value){
            return true;
        }
        return false;
    }
    public boolean equals(int compare){
        if(this.value == compare){
            return true;
        }
        return false;
    }
    public static int parseInt(char[] array){
        int result = 0; 
        int length = array.length - 1; 
        for (int i = 0; i <= length; i++){
           int digit = array[i] - '0';
           result *= 10;
           result += digit;
        }
        return result;
    }
    public static int parseInt(String convert){
        int x = 0;
        int num = 0;
        while(x < convert.length()){
            num *= 10;
            num += convert.charAt(x++) - '0';
        }
        return num;
    }
}    