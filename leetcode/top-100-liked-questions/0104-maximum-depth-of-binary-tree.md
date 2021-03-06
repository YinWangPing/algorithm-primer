# 104. Maximum Depth of Binary Tree

2017-08


## Level
Easy


---


## [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


---


## Thought
两种方法

- 递归
- **层次遍历**

---


## Solution

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right)+1;
    }
    
    public int maxDepth(TreeNode root) {
        if (root  == null) return 0;
        int leftDepth = maxDepth(root.left) + 1;
        int rightDepth = maxDepth(root.right) + 1;
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
```


---


**Note**: The subject is from leetcode.








