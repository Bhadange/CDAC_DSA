public class kadanesAlgorithm {

    public static void main(String args[]){
    int arr[] = {-1,2,3,-3,-1,2,-4};

    int currentsum = arr[0];
    int maxsum = arr[0];

    for(int i=0; i<arr.length; i++){

        currentsum = Math.max(arr[i], currentsum+arr[i]);

        maxsum = Math.max(maxsum, currentsum);



    }
    System.out.println(maxsum);
     
    }
    
}
