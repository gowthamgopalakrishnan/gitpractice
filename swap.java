public class swap{
    public static void main(String[] args){
        int num1=20;
        int num2=10;
        System.out.println("before swap num1:"+num1+"num2:"+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swap num1:"+num1+"num2:"+num2);
    }
}