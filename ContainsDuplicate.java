import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class ContainsDuplicate {
    public boolean containsDuplicates(int[] nums){
        Set<Integer> intset =new HashSet<>();

        for(int num:nums){
            if(intset.contains(num))
                return true;

            intset.add(num);
        }
        return false;

    }

    public static void main(String[] args) {
        ContainsDuplicate obj=new ContainsDuplicate();

        int[] num1={1,2,3,1};
        int[] num2={1,2,3,4};


        System.out.println("Array 1:"+ Arrays.toString(num1));
        System.out.println("Contains Duplicate: " +obj.containsDuplicates(num1));

        System.out.println();

        System.out.println("Array 2:" +Arrays.toString(num2));
        System.out.println("Contains Duplicate: "+ obj.containsDuplicates(num2));




    }
    
}
