public class Diff21 {
    public int diff21(int n) {
  if(n>=21){
    return (n-21)*2;
  }
  else{
    int diff;
    diff=(21-n);
    return Math.abs(diff);
  }
 
}
public static void main(String[] args) {
        Diff21 d = new Diff21();
        System.out.println(d.diff21(19)); // 2
        System.out.println(d.diff21(10)); // 11
        System.out.println(d.diff21(21)); // 0
        System.out.println(d.diff21(22)); // 2
        System.out.println(d.diff21(25)); // 8
    }
}
/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0 */