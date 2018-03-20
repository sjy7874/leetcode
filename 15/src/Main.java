import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] S = new int[]{10,-2,-12,3,-15,-12,2,-11,3,-12,9,12,0,-5,-4,-2,-7,-15,7,4,-5,-14,-15,-15,-4,10,9,-6,7,1,12,-6,14,-15,12,14,10,0,10,-10,3,4,-12,10,7,-9,-7,-15,-8,-15,-4,2,9,-4,3,-10,13,-3,-1,5,5,-4,-15,4,-11,4,-4,6,-11,-9,12,7,11,7,2,-5,13,10,-5,-10,3,7,0,-3,10,-12,2,9,-8,8,-9,13,12,13,-6,8,3,5,-9,7,12,10,-8,0,2,1,10,-7,-3,-10,-10,7,4,5,-11,-8,0,-2,-14,8,13,-8,-2,10,13};
        Main main = new Main();
        List<List<Integer>> res = main.threeSum(S);


            System.out.println(res);



    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int count = nums.length;
        for (i = 0; i < count; i++) {
            if(nums[i]  >0)
                break;
            for (j = 0; j < count; j++) {
                if(nums[i] + nums[j] >0)
                    break;
                for (k = 0; k < count; k++) {
                    if(nums[i] + nums[j] + nums[k]>0)
                        break;
                    if (i == j || i == k || j == k)
                        continue;
                    else {
                        if ((nums[i] + nums[j] + nums[k]) == 0) {
                            //System.out.println(i+","+j+","+k);
                            temp= new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            Collections.sort(temp);

                            if (!res.contains(temp)) {
                                res.add(temp);
                            }
                        }
                    }

                }
            }

        }
        return res;
    }
}
