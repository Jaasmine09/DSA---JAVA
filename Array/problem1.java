    //   Q:  Given an integer array nums, return true if any value appears 
    //       at least twice in the array, and return false
    //            if every element is distinct.



public class problem1 {

    public static boolean problem(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            for(int j = i+1; j< numbers.length; j++){
                if(numbers[i]  == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4};
    System.out.println(problem(nums));
    }
}
