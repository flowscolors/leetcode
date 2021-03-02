//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 103 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 只会存在一个有效答案 
// 
// Related Topics 数组 哈希表 
// 👍 10404 👎 0

package com.leetcode.leetcode.editor.cn;

import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;

//java:两数之和
public class Q1TwoSum{
    public static void main(String[] args){
        Solution solution = new Q1TwoSum().new Solution();
        int[] indexs = new int[3];
        indexs[0]=3;
        indexs[1]=2;
        indexs[2]=4;
        System.out.println(solution.twoSum(indexs,6)[0]+" "+ solution.twoSum(indexs,6)[1]);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        boolean stop = false;

        for( int i = 0; i < nums.length - 1; i++ ) {
            //j 的比对 只需要从 i+1 开始，避免重复计算 j 之前的值
            for( int j = i + 1; j < nums.length; j++ ) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    stop = true;
                    break;
                }
            }
            // 如果寻找到了，立即 break
            if(stop) {
                break;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}