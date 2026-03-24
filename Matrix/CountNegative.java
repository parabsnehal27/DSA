import java.util.*;

class CountNegative {

    public void Negative(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>0){
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }

    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        CountNegative m=new CountNegative();
        int[][] arr={
            {4, 3, 2, -1}, 
            {3, 2, 1, -1}, 
            {1, 1, -1, -2}, 
            {-1, -1, -2, -3}
        };
        m.Negative(arr);
        
    }
}