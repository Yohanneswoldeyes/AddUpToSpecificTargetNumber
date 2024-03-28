
import java.util.*;

class AddUpToSpecificTargetNumber {
    public static void main(String[] args) {
        int[] arrayOfintegers = {2, 7, 11, 15, 17, 19, 21, 23, 25};
         System.out.println("Indices of the two numbers " + Arrays.toString(twoNumbersAddUpToTargetNumber(arrayOfintegers, 48)));
        
    }
    
    public static int[] twoNumbersAddUpToTargetNumber(int[] arrayOfintegers, int target) {
        int len = arrayOfintegers.length;
        for(int i = 0; i < len-1; i++){
            int find = target - arrayOfintegers[i];
            for(int j = i + 1; j < len; j++){
                if(arrayOfintegers[j] == find){
                    return new int[]{i + 1, j + 1};
                }else if(arrayOfintegers[j] > find)
                    break;
            }
        }
        return null;
    }

}
