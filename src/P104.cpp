#include<iostream>

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int maxDepth(TreeNode* root) 
    {
        if (NULL == root) {
            return 0;
        }

        int ret = getMaxDepth(root);
        return ret;
    }

    int getMaxDepth(TreeNode* p)
    {
        int leftDepth = 0;
        int rightDepth = 0;
        if (NULL == p->left && NULL == p->right) {
            return 1;
        }
        if (NULL != p->left) {
            leftDepth = getMaxDepth(p->left);
        }
        if (NULL != p->right) {
            rightDepth = getMaxDepth(p->right);
        }

        return std::max(leftDepth, rightDepth) + 1;
    }
};
