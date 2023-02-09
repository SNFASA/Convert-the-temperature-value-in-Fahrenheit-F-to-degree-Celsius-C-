import java.util.Scanner;
public class tmp{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Temperature = ");
       double tmp = sc.nextDouble();
       double cvttmp ;
       cvttmp = 5.0/9*(tmp - 32);
       
       System.out.print("Temperature in fahrenheit = " + cvttmp);
    }
}
