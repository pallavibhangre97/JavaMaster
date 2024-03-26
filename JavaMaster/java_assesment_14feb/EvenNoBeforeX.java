package java_assesment_14feb;
//given array and element x find even no before that x element present
public class EvenNoBeforeX {
    public static void main(String[] args) {
        int arr[]={1,4,6,7,9};
        int ele=9;
        System.out.println(findevenNoBeforeX(arr,ele));
    }

    private static int findevenNoBeforeX(int[] arr, int ele) {
        int count=0;
        for(int a:arr)
        {
            if(a%2==0 && a!=ele){
                count++;
            }
            if(a==ele)
                break;
        }
        return count;
    }
}
