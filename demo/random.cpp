#ifndef URAND_H
#define URAND_H
#include <bitset>
#include <cstddef>
#include <cstdlib>
#include <ctime>
#include <iostream>

using namespace std;

template<size_t UpperBound>
class Urand {
    bitset<UpperBound> used;
public:
    Urand() {
        srand(time(NULL));
    }
    size_t operator()();
};

template<size_t UpperBound>
inline size_t Urand<UpperBound>::operator() (){
    if (used.count() == UpperBound) {
        used.reset();
    }
    size_t newval;
    while (used[newval = rand() %UpperBound]) {
    }
    used[newval] = true;
    return newval;
}

int main() {
    Urand<10> u;
    for (int i = 0; i < 20; i++) {
        cout << u() << ' ';
    }
    cout << endl;
    return 0;
}

#endif
