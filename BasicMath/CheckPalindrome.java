public class CheckPalindrome{

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,3,9,1};
        boolean isPalindrome = true;
        int left = 0;
        int right = arr.length-1;
       while(left<right){

            if(arr[left] != arr[right]){

              System.err.println("false");  //isPalindrome = false;
              break;
              
            }
            left ++;
              right --;

       }
        System.err.println(""+isPalindrome);
    }

}