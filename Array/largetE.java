public class largetE {
    public static void main(String args[])  {

        int arr[] =  {3,3,6,1};

        int largeE =0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] > largeE){
                largeE = arr[i];
            }
        }
        System.out.println("Larget Element is : " + largeE);

    }
}