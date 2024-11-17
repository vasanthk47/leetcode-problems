/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Algo Used: Height of a tree and Daimtere of a tree
    // Here for every node we are taking the maxi daimter with some modification and returning the maxi
    // we are doing sum from left + root.val + sum from right
    // TC: O N , SC: O N
    public int maxPathSum(TreeNode root) {
        int[] maxi= new int[1];   // here we are passing diameter as an array an not an int bcz Java follows pass by value for primitive data types and when the change is made to the daimter var if it was int then while returning it would not have changed the val of the var so for that we are passing it via arr
        maxi[0]= Integer.MIN_VALUE;
        height(root, maxi);
        return maxi[0];
    }

    public int height(TreeNode root, int[] maxi) {
        if(root == null) return 0;

        int left= Math.max(0 , height(root.left, maxi));  // we have taking the reccursion call with Math.max(0, call) to handle negative values from left and right calls, it we are getting any negative values then Math.max will happen and it will return 0
        int right= Math.max(0 , height(root.right, maxi));
        maxi[0]= Math.max(maxi[0], left + right + root.val);   //  for updating maxi here along with left and right we are taking the root.val as well i.e sum from left + root.val + sum from right
        return root.val + Math.max(left , right); // so here also along with root.val we are taking from max of left and right 
    }
}