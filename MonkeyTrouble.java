public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile && bSmile){
  return true;
  }
  else if(!aSmile&&!bSmile){
    return true;
    }else{
    return false;
    
  } 
}
public static void main(String[] args) {
        MonkeyTrouble mt = new MonkeyTrouble();
        System.out.println(mt.monkeyTrouble(true, true));   // true
        System.out.println(mt.monkeyTrouble(false, false)); // true
        System.out.println(mt.monkeyTrouble(true, false));  // false
        System.out.println(mt.monkeyTrouble(false, true));  // false
    }

}
    
/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/

