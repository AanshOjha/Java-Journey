package LeetCode.Sorting;

class MajorityElement {
    static public int majorityElement(int[] nums) {
        int count=0;
        Integer numberInMajority=null;

        // Traverse the array
        // Make the first element as the majority candidate
        // If the next element is equal to the candidate, count++
        // If not, count--
        // After the count becomes zero, update the candidate to the current element
        for(int i=0;i<nums.length;i++){
            if(count==0){
                numberInMajority=nums[i];
                count=1;
            }else if(nums[i]==numberInMajority){
                count++;
            }else{
                count--;
            }
        }
        return numberInMajority;

    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
