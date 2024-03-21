public class problem2 {
 
    public static int search_numbers(int nums[], int target){
        for(int i =0; i<nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int nums[] = {1};
        int target = 0;

        int index = search_numbers(nums, target);
        if(index == -1){
            System.out.println("-1");
        } else{
            System.out.println(index);
        }
    }
}
