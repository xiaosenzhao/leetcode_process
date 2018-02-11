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
        solve(ret, root, 1);
        reverse(ret.begin(), ret.end());
        return ret;
    }

    void solve(vector< vector<int> > &ret, TreeNode* p, int level)
    {
        if (NULL == p) {
            return;
        }

        if (ret.size() < level) {
            ret.resize(level);
        }
        ret[level - 1].push_back(p->val);
        if (NULL != p->left) {
            solve(ret, p->left, level + 1);
        }
        if (NULL != p->right) {
            solve(ret, p->right, level + 1);
        }
    }
};
