import java.util.Scanner;

    public class first{
        public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter mark1:");
       int mark1=scan.nextInt();
       System.out.println("Enter mark2:");
       int mark2=scan.nextInt();
       System.out.println("Enter mark3:");
       int mark3=scan.nextInt();
       System.out.println("Enter mark4:");
       int mark4=scan.nextInt();
       System.out.println("Enter mark5:");
       int mark5=scan.nextInt();
      int total=mark1+mark2+mark3+mark4+mark5/5;
       System.out.println("Total mark:"+total);
            

        }
    }