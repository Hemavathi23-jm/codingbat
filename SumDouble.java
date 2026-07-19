public class SumDouble {
public int sumDouble(int a, int b) {
  int sum;
  if (a == b)
  {
    return sum =2*(a+b);//if same double the sum
  }
  else 
  {
   return sum = (a+b); 
  }
  
}
public static void main(String[] args) {
        SumDouble sd = new SumDouble();
        System.out.println(sd.sumDouble(1, 2)); // 3
        System.out.println(sd.sumDouble(3, 2)); // 5
        System.out.println(sd.sumDouble(2, 2)); // 8
    }
}
/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8 */