import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the principal amount");
        float principal=sc.nextFloat();
        System.out.println("Enter Rate of interest");
        float rate=sc.nextFloat();
        System.out.println("Enter the time(In Year)");
        float time=sc.nextFloat();

        float interest=(principal*rate*time)/100;
        System.out.println("Simple interest => " + interest);
    }
}
