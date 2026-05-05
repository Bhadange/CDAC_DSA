
public class  IndexOfElementINoneD {
    public static void main (String args[]){

         int arr[] = {1,2,3,4,5,6,7,8};
            int target = 5;
            int left = 0;
            int right = arr.length - 1;
            int mid=0;
            while (left <=right){
                

                mid = (left + right)/2;

                if (arr[mid]== target){
                    System.out.println("Element found at index: " + mid);   

                }
        
                else if(arr[mid] < target) {
                    left = mid +1;
                }
                else {
                    right = mid -1;
                }
            }
            System.err.println("No Found");
    }
}