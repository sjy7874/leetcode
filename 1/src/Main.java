import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6};
        int target = 5;
        Main main = new Main();
        int[] out = main.twoSum(nums,target);
        System.out.println(Arrays.toString(out));
    }

    public int[] twoSum(int[] nums, int target) {

        int count = nums.length;
        int i;
        int j;
        for(i=0;i<count;i++){
            for(j=0;j<count;j++){
                if(i==j)
                    continue;
                else{
                    if((nums[i]+nums[j])==target){
                        return new int[] {i,j};
                    }
                }
            }
        }
        return new int[] {0,0};
    }
}
