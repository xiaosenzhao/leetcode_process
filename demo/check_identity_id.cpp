#include <iostream>
#include <string>

using namespace std;

// 17位数字本体码权重
static const int weight[18] = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
// mod 11,对应校验码字符集
static const char validate[11] = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
// 只适用于18位身份证id
class IdentityId {
public:
  // param: 前17位id
  // return: default -
  static char check(string id) {
    if (id.length() < 17) {
      return DEFAULT;
    }
    int sum = 0;
    int mod = 0;

    for (string::size_type index = 0; index < 17; index++) {
      if (!isdigit(id[index])) {
        return DEFAULT;
      } else {
        sum += (id[index] - '0') * weight[index];
      }
    }

    mod = sum % 11;
    return (validate[mod] == id[17]);
  }

private:
  // default return value
  static const char DEFAULT = '-';
};

int main(void) {
  string id;
  cout << "身份证id: ";
  cin >> id;
  if (id.length() != 18) {
    cout << "input error" << endl;
    return 0;
  }
  if (IdentityId::check(id)) {
    cout << "valid" << endl;
  } else {
    cout << "invalid" << endl;
  }
  return 0;
}
