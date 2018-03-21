import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] nums = {1,3,4,5,7,8};
        Main main = new Main();
        System.out.println(main.searchInsert(nums,3));


    }

    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid = 0;
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        while(l<=r){

            mid = (l+r)/2;
            if(nums[mid]<target && nums[mid+1] >=target){
                return mid+1;
            }else if( nums[mid] < target ){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return  mid;
    }


}
