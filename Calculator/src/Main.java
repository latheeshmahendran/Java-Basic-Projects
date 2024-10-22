import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void Cal(){
        Scanner getnum = new Scanner(System.in);
        double num1, num2, func;

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to simple Calculator, Enter your first number!");
        num1 = getnum.nextDouble();
        System.out.println(num1+" is your first number, Enter your second number!");
        num2 = getnum.nextDouble();

        System.out.println("Specify the Arithmetic operation you need to perform for "+num1+" and "+num2+" by entering any one of the number given below:");
        System.out.println("Addition  ---- 0 ");
        System.out.println("Subtraction  ---- 1 ");
        System.out.println("Multiplication  ---- 2 ");
        System.out.println("Division  ---- 3 ");
        System.out.println("Exit  ---- 4 ");
        System.out.println("--- --- --- Enter Number Below --- --- ---");

        func = getnum.nextDouble();

        switch ((int) func){
            case 0:
                Add(num1, num2);
                break;
            case 1:
                Sub(num1, num2);
                break;
            case 2:
                Mul(num1, num2);
                break;
            case 3:
                Div(num1, num2);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    public static void Add(double num1, double num2){
        num1 += num2;
        System.out.println(num1+" is the total");
        Cal();
    }
    public static void Sub(double num1, double num2){
        num1 -= num2;
        System.out.println(num1+" is the total");
        Cal();
    }
    public static void Mul(double num1, double num2){
        num1 *= num2;
        System.out.println(num1+" is the total");
        Cal();
    }
    public static void Div(double num1, double num2){
        num1 /= num2;
        System.out.println(num1+" is the total");
        Cal();
    }

    public static void main(String[] args) {
        Cal();
    }
}