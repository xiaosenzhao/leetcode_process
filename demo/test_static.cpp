#include <iostream>

int main() {
    const int SCHEMA_BASE_COUNT = __COUNTER__;
    do {
        const int a = __COUNTER__ - SCHEMA_BASE_COUNT;
        struct test{
            static void print1() {
                std::cout << "print1 " << a << std::endl;
            }
        };
        test::print1();
    } while(0);

    do {
        const int a = __COUNTER__ - SCHEMA_BASE_COUNT;
        struct test{
            static void print1() {
                std::cout << "print1 " << a << std::endl;
            }
        };
        test::print1();
    } while(0);
    do {
        const int a = __COUNTER__ - SCHEMA_BASE_COUNT;
        struct test{
            static void print1() {
                std::cout << "print1 " << a << std::endl;
            }
        };
        test::print1();
    } while(0);
    return 0;
}
