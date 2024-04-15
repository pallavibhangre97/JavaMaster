package java_assesment_14feb;
//to print count of each elemet in array where the count present the number of element taht are less than
//element on its right side
public class RightCount {
    public static void main(String[] args) {
        int arr[]={4,2,7,1,5,3};
        int n=arr.length;
        int count[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count[i]++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("ele"+arr[i]+":"+count[i]);
        }
    }

}
