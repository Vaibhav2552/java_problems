public class evenodd {
    public static void main(String[] args) {
          int n=243565657;
        System.out.println(find(n));
    }
    static String find(int n){
        String st="";
        if((n&1) == 1){
            return st="odd";
        }
        return st="even";
    }
}
