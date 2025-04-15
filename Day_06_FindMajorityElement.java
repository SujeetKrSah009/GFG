public class Day_06_FindMajorityElement {
    public List<Integer> findMajority(int[] nums) {
        
        int n = nums.length;
        int num1 = -1, num2 = -2;
        int c1 = 0, c2 = 0;
        
        for(int num:nums){
            if(num1 == num){
                c1++;
            }
            else if(num2 == num){
                c2++;
            }
            else if(c1 == 0){
                num1 = num;
                c1++;
                
            }
            else if(c2 == 0){
                num2 = num;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        
        for(int num : nums){
            if(num1 == num){
                c1++;
            }
            if(num2 == num){
                c2++;
            }
        }
        
        if(c1 > n/3){
            res.add(num1);
        }
        
        if(c2 > n/3 && num1 != num2){
            res.add(num2);
        }
        
        if(res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
}
