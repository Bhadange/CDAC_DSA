public class Check_if_Array_Is_Sorted_and_Rotated{
        public static void main(String[] args) {
            int arr[] = {3,4,5,1,2};
            int n = arr.length;
            int count =0;
            for(int i=0; i<n; i++){
                if(arr[i] >  arr[(i+1) % n]){
                    count ++;
                }
            }
                System.out.println("ture");


        }
}

// class Solution {
//     public boolean check(int[] nums) {
//     int n = nums.length;
//     int count =0;
//     for(int i=0; i<n; i++){

//         if(nums[i] > nums[(i+1) % n] ) {
//             count ++;  
//         }
//     }
//     return  count <=1;
// } 
// }