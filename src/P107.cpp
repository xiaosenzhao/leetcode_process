#include <iostream>
#include <queue>
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
    vector< vector<int> > levelOrderBottom(TreeNode* root)
    {
        vector< vector<int> > ret;
        if (NULL == root) {
            return ret;
        }

        queue<TreeNode*> q;
        q.push(root);
        while (q.size() > 0) {
            size_t size = q.size();
            vector<int> v;
            for (size_t i = 0; i < size; i++) {
                TreeNode* p = q.front();
                q.pop();
                v.push_back(p->val);
                if (NULL != p->left) {
                    q.push(p->left);
                }
                if (NULL != p->right) {
                    q.push(p->right);
                }
            }

            ret.push_back(v);
        }
        reverse(ret.begin(), ret.end());
        return ret;
    }
};
