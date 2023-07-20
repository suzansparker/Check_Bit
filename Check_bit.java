import java.util.Scanner;

public class Check_bit {

    public class bit {
        public static int checkbit(int a,int b) {
            if((a&(1<<b))!=0) {
                return 1;
            }
            else {
                return 0;
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int value=checkbit(a,b);
            System.out.println(value);

        }

    }

}