public class Max_Consecutive_Ones{
    public static void main(String args[]){

        // Input: nums = [1,1,0,1,1,1]
        // Output: 3

        int count =0;
        int max=0;

        int []arr = {1,1,0,9,1,1,1};

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count ++;
                  max = Math.max(max, count);
                
            }
            else{
                count =0;
            }
          
        }
        System.out.println("Max consecutive ones is " + max);

    }
}