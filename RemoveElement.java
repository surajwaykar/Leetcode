class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index++]=nums[i];
            }
        }
        return index;
        
    }
    public static void main(String[] args) {
        RemoveElement solution =new RemoveElement ();

       int[] nums = {3, 2, 2, 3, 4, 5, 3, 4};
       int val = 3;

       int newLength = solution.removeElement(nums, val);

       System.out.println("New length: " + newLength);
       System.out.print("Modified array: ");
       for (int i = 0; i < newLength; i++) {
           System.out.print(nums[i] + " ");
       }

    }
}