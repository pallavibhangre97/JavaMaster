package java_assesment_14feb;

public class ArithmaticProgreession {
    public static void main(String[] args) {
        int a=5 ;//first term
        int b=2; //common difference
       int n=10; //no of ele in series
        int sum=a;
        System.out.print(sum+" ");
        for(int i=1;i<n;i++)
        {
             sum=sum+b;
            System.out.print(sum+" ");
        }
    }
}
