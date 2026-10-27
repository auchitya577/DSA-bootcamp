public class Searchinrange {
    public static void main(String[] args) {
        int[] arr={2,4,3,1,5,77,8,99,90};
        int target=99;
        System.out.println(rangesearch(arr, target,4,8));
        
    }
    static int rangesearch(int[]arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start; index<end; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    
 }

