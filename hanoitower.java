public class hanoitower {
    public static void main(String[] args) {
      int n=3;
      hanoi(n,"S","H","D");
    }
    static void hanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disc "+ n+" from "+src+" to "+dest);
            return;
        }
      hanoi(n-1,src,dest,helper);
        System.out.println("transfer disc "+ n+" from "+src+"  to "+dest);
        hanoi(n-1,helper,src,dest);
    }
}
