import java.util.HashSet;

public class RemoveDuplicateElement {

    public static void main(String args[]){

        int [] arr = {1,1,1,2,3,4,4,5,5,6,6,7};

        

            HashSet<Integer> set = new HashSet<>();

          
            for(int a : arr){
                set.add(a);

           }

           for(int n : set){
            System.out.print(n);
           }
        

    }
    
}
