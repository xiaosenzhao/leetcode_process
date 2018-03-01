#include <algorithm>
#include <iostream>

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int do_check(TreeNode* root) {
        if (root == NULL) return 0;

        int lh = do_check(root->left);
        if (lh == -1) {
            return -1;
        }
        int rh = do_check(root->right);
        if (rh == -1){
            return -1;
        }

        if (abs(lh - rh) > 1) {
            return -1;
        }
        return std::max(lh, rh) + 1;
    }

    bool isBalanced(TreeNode* root) {
        int ret = do_check(root);
        std::cout << ret << std::endl;
        return (ret >= 0 ? true : false);
    }
};

int main(void) {
    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(2);
    root->left->left = new TreeNode(3);
    root->left->right = new TreeNode(3);
    root->left->left->left = new TreeNode(4);
    root->left->left->right = new TreeNode(4);

    Solution solution;
    std::cout << solution.isBalanced(root) << std::endl;
    return 0;
}
