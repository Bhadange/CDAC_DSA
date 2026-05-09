import java.util.*;
public class  Rearrange_Elemenet_by_Sign{
    public static void main(String args[]){
      //  Input: nums = [3,1,-2,-5,2,-4]
      //  Output: [3,-2,1,-5,2,-4]
      System.out.println("ENTER name");
 
 int nums[]= {3,1,-2,-5,2,-4};
         int n= nums.length;
    int arr[]=new int [n];
    int j=0;
    int k=1;
      for(int i =0; i<nums.length; i++){
        if(nums[i]>0){
           arr[j]= nums[i];
            j=j+2;
        }
        // else{
        //   arr[j]= nums[i];
        // }
        // System.out.println(Arrays.toString(nums));
    if(nums[i]<1){
        arr[k]=nums[i];
        k=k+2;
    }

       
      }
      
       System.err.println(Arrays.toString(arr));
    }
}