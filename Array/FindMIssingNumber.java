public class FindMIssingNumber {
    public static void main(String args[]){

        int [] arr= {1,2,3,4,6,7};

        int n = arr.length+1;
        int sum=0;

        int total = n * (n + 1) / 2;
       
        for(int num: arr){
            sum +=num ;
        }

        int missnumber = total -sum;
        System.out.println("missing number is = " + missnumber);

    }
    
}
