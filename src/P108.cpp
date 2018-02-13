#include <vector>

using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if (nums.size() <= 0) {
            return NULL;
        }

        int len = nums.size();
        return buildTree(nums, 0, len - 1);
    }

    TreeNode* buildTree(vector<int>& nums, int start, int end) {
        TreeNode* p;
        if (start == end) {
            p = new TreeNode(nums[start]);
            return p;
        }
        if (start > end || start < 0) {
            return NULL; 
        }

        int mid = (start + end) / 2;
        p = new TreeNode(nums[mid]);
        p->left = buildTree(nums, start, mid - 1);
        p->right = buildTree(nums, mid + 1, end);
        return p;
    }
};

int main()
{
    vector<int> nums;
    nums.push_back(-10);
    nums.push_back(-3);
    nums.push_back(0);
    nums.push_back(5);
    nums.push_back(9);
    Solution s;
    s.sortedArrayToBST(nums);
    return 0;
}
