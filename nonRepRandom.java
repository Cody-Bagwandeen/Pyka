import java.util.ArrayList;
import java.util.Random;

public class nonRepRandom{

    private ArrayList<Integer> nums;
    private int max; // specifies the range of numbers [0...max]

    nonRepRandom(int n){
        max = n;
        nums = new ArrayList<Integer>();
        for(int i = 0; i <= max; i++){
            nums.add(i);
        }
    }

    // generates a number between 0 and max, that hasn't been chosen before, if all numbers have been chosen, refill
    public Integer generateNum(){
        if(nums.isEmpty()){
            for(int i = 0; i <= max; i++){
                nums.add(i);
            }
        }
        Random rand = new Random();
        int index = rand.nextInt(nums.size());
        Integer output = nums.get(index);
        nums.remove(index);
        return output;
    }

}