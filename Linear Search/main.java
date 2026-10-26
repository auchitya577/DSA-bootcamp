

public class main {
    public static void main(String[] args) {
        int[] nums={22,45,1,2,8,19,-3,16,11};
        int target=19;
        int ans =linearsearch(nums, target);
        System.out.println(ans);
        
    }

    // search in the array: if the item is found
    // otherwise if item not found return -1
    static int linearsearch(int[]arr , int target){
           if (arr.length==0){
           return -1;
    }
    // now placing a for loop

    for(int index=0; index<arr.length; index++){
        int element = arr[index];
        if(element==target){
            return index;
        }}
        return -1;
        }
    }
    

