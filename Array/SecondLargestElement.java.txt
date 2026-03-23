import java.util.*;
class SecondLargestElement {
    
    public void SecondLargest(int[] arr){
        int second=arr[0];
        int largest=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]<largest){
                second=arr[i];
            }
        }
        System.out.print(second);
    }
    
    public static void main(String[] args) {
        SecondLargestElement m=new SecondLargestElement();
        int[] arr={12, 35, 1, 10, 34, 1};
        m.SecondLargest(arr);
    }
}