package jstd.bk.ds.listnode;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		int i=5;
		int s=(i++)+(++i)+(i--)+(--i);
		System.out.println(i);
		System.out.println(s);
//		int[] nums = {0,0,0,0};
//		int[] nums = {-1,0,1,2,-1,-4};
//		int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
//		int numsLen = nums.length;
//        int min = 0;
//        int tmp = 0;
//        for(int s = 0; s < (numsLen - 1); s++){
//            min = s;
//            tmp = nums[s];
//            for(int t = s + 1; t < numsLen; t++){
//                if(tmp > nums[t]){
//                    min = t;
//                    tmp = nums[t];
//                }
//            }
//            nums[min] = nums[s];
//            nums[s] = tmp;
//        }
//        List<List<Integer>> rlt = new ArrayList();
//        for(int i = 0; i < (numsLen -2); i++){
//            for(int j = i + 1; j < (numsLen - 1); j++){
//                for(int k = j + 1; k < numsLen; k++){
//                    if((nums[i] + nums[j] + nums[k]) == 0){
//                    	if(rlt.size() == 0) {
//                    		List<Integer> ints = new ArrayList();
//                        	ints.add(nums[i]);
//                        	ints.add(nums[j]);
//                        	ints.add(nums[k]);
//                        	rlt.add(ints);
//                    		
//                    	} else {
//                    		boolean addFlag = true;
//                    		for(List<Integer> intNums : rlt) {
//                    			if(intNums.get(0) == nums[i] 
//                    					&& intNums.get(1) == nums[j]
//                    					&& intNums.get(2) == nums[k]) {
//                    				addFlag = false;
//                    				break;
//                    			} else {
//                    				continue;
//                    			}
//                    		}
//                    		if(addFlag) {
//                    			List<Integer> ints = new ArrayList();
//                    			ints.add(nums[i]);
//                    			ints.add(nums[j]);
//                    			ints.add(nums[k]);
//                    			rlt.add(ints);
//                    		}
//                    	}
//                    }
//                }
//            }
//        }
//        System.out.println(rlt);
//        return rlt;
	}
}
