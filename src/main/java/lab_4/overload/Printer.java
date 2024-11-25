package lab_4.overload;

public class Printer {

    public void print(String str){
        System.out.println(str);
    }
    public void print(int intValue){
        System.out.println(intValue);
    }
    public void print(long longValue){
        System.out.println(longValue);
    }
    public void print(double doubleValue){
        System.out.println(doubleValue);
    }
    public void print(byte byteValue){
        System.out.println(byteValue);
    }
}
