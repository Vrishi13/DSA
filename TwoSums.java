import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSums {
    public int[] twosums(int[] num,int target){
        Map<Integer,Integer>map= new HashMap<>();
            for(int i=0;i<num.length;i++){
                int complement = target-num[i];
                if(map.containsKey(complement)){
                    return new int[] {map.get(complement),i};
                }
                map.put(num[i],i);
            }
        
        return null;
    }
    public static void main(String[] args){
        TwoSums obj=new TwoSums();
        int[] number={11,1,8,15};
        int target=9;
        int[] result=obj.twosums(number,target);

        if(result!=null){
            System.out.println("Indices: " +Arrays.toString(result));
            System.out.println("Values: " + number[result[0]] + "+" + number[result[1]] + "=" + target);
        }
        else{
            System.err.println("NO two Numbers are found");
        }



    }

}
