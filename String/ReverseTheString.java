package String;

class ReverseTheString{
public static void main(String[] args) {

    String a = "Hello";
    String rev="";
    for(int i =a.length()-1; i>=0; i-- ){

        rev += a.charAt(i);

    }
    System.out.println(rev);
    
}
}