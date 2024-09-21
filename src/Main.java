//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(10));
        printEvenNums();
        System.out.println(sumDigit(-10));
    }
    public  static int factorial(int n){
        if (n<0) return -1;
        else if (n==0) return 1;
        else return n*factorial(n-1);
    }
    public static void printEvenNums(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0) {
                sb.append(i);
                sb.append(", ");
            }
        }
        System.out.println(sb.substring(0, sb.length()-2));
    }
    public static int sumDigit(int n){
        if (n < 10 & n >= 0) return n;
        else if (n<0) return sumDigit(-1 * n);
        else return sumDigit(n/10) + n%10;
    }
}