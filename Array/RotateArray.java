import java.util.*;

class RotateArray {

    public void rotate(int[] arr, int d){
        
        for(int i=0;i<d;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        RotateArray m=new RotateArray();
        int[] arr={1,2,3,4,5};
        m.rotate(arr,2);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}