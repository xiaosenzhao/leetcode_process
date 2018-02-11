#include <iostream>
#include <queue>

using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x): val(x), left(NULL), right(NULL) {}
};

class Solution {
    public:
        bool isSymmetric(TreeNode* root)
        {
            if (NULL == root) {
                return true;
            }
            
            queue<TreeNode*> q;
            q.push(root->left);
            q.push(root->right);
            while(q.size() > 0) {
                TreeNode *first;
                TreeNode *second;
                first = q.front();
                q.pop();
                second = q.front();
                q.pop();
                if (NULL == first && NULL == second) {
                    continue;
                }else if(NULL == first || NULL == second) {
                    return false;
                }
                if (first->val != second->val) {
                    return false;
                }else {
                    q.push(first->left);
                    q.push(second->right);
                    q.push(first->right);
                    q.push(second->left);
                }
            }
            return true;
        }
};
