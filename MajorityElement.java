
import java.util.Arrays;



public class MajorityElement {
    int majorityElement(int[] num){
        int majority =num[0], vote=1;

        for(int i=1;i<num.length;i++){
            if(vote==0){
                majority =num[i];
                vote++;
            }
            else if(majority ==num[i]){
                vote++;
            }
            else
                vote--;
        }
        //return majority;
    
    
     // if No Mojority elements are present in array then
     int count = 0;
        for (int n : num) {
            if (n == majority) count++;
        }

        if (count > num.length / 2) {
            return majority;
        } else {
            return -1; // No majority element
        }

    }

    public static void main(String[] args){
        MajorityElement obj =new MajorityElement();

        int[] nums1={2,2,1,1,3,2,2};
        int[] nums2={1,2,3,4};

        System.out.println("Array 1: "+ Arrays.toString(nums1));
        System.out.println("Majority Element: " +obj.majorityElement(nums1));

        System.out.println();

        System.out.println("Array 2: "+ Arrays.toString(nums2));
        System.out.println("Majority Element: " +obj.majorityElement(nums2));

    }
    
}
