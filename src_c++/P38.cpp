#include <iostream>
#include <string>
#include <sstream>
using namespace std;

class Solution {
public:
    string countAndSay(int n) {
        if (n == 0) {
            return NULL;
        }
        if (n == 1) {
            return "1";
        }
        string str = countAndSay(n - 1);
        int count = 1;
        char tmp = str.at(0);
        string output = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.at(i) == tmp) {
                count++;
            } else {
                stringstream strStream;
                strStream << count;
                output.append(strStream.str());
                output.append(1, tmp);
                tmp = str.at(i);
                count = 1;
            }
        }
        output.append(to_string(count));
        output.append(1, tmp);
        return output;
    }
};

int main(void) 
{
    int n = 10;
    Solution s;
    string result = s.countAndSay(n);
    cout << result << endl;
    return 0;
}
