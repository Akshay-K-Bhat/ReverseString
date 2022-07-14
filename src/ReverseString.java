public class ReverseString {
    public static void reverseString(String str,int idx){

        if(idx==1){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverseString(str,idx-1);

    }

    public static void main(String[] args) {
        String str = "Akshay";
        reverseString(str,str.length()-1);

    }
}
