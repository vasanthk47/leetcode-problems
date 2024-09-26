/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
 static int a[2];
 *returnSize=2;
 for(int i=0;i<numsSize;i++)
 {
     for(int j=i+1;j<numsSize;j++)
     {
         if(*(nums+i)+*(nums+j)==target)
         {
             a[0]=i;
             a[1]=j;
             break;
         }
     }
 }   
 return a;
}