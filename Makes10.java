public class Makes10 {
    public boolean makes10(int a, int b) {
  int sum;
  sum = a+b;
  if(sum == 10){
    return true;
  }
 else if(a==10||b==10){
  return true;
  }
  else {
    return false;
  }
}
public static void main(String[] args) {
        Makes10 m = new Makes10();
        System.out.println(m.makes10(9, 10)); // true
        System.out.println(m.makes10(9, 9));  // false
        System.out.println(m.makes10(1, 9));  // true
    }
}
/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true */