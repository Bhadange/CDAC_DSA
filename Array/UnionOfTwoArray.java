import java.util.HashSet;

public class UnionOfTwoArray {

    public static void main(String args[]){
    int [] arr1 = {1,2,3,4,5};
    int [] arr2 = {3,4,5,6,7,};

    
    // int [] arr = new int[arr1.length + arr2.length];
    // int m = arr1.length;

    // for(int i=0; i<arr1.length; i++){
    //     arr[i]=arr1[i];
    // }

    // for(int k =0; k<arr2.length; k++){
    //     arr[m+k]= arr2[k];
    // }

    // HashSet<Integer> set = new HashSet<>();

    // for(int n : arr){
    //    set.add(n);
    // }

    // System.out.println(set);

    HashSet<Integer> set = new HashSet<>();

    for(int n : arr1){
        set.add(n);

    }

    for(int n : arr2){
        set.add(n);
    }

    System.out.println(set);

}
}