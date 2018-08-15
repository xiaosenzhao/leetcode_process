#include <iostream>
using namespace std;
class A {
public:
    class C {
    public:
        struct Elem {
            int i = 11;
        };
        C(int n){
            _num.i = n;
        }
        int print() {
            cout << "class c" << endl;
            print_num();
            return 0;
        }

        virtual int print_num() {
            cout << _num.i << endl;
            return 0;
        }
    private:
        Elem _num;
    };

    template<typename T>
    int do_print(T t) {
        cout << t << endl;
        return 0;
    } 
    int print() {
        do_print("class A");
        return 0;
    }
    virtual int print_name() {
        cout << _name << endl;
        return 0;
    }
private:
    char* _name = "A";
};

class B : public A{
public:
    class C : public A::C
    {
    public:
        C(int n) : A::C(n){
            _num.i = n;
        }
        int print_num() {
            cout << "hello";
            cout << _num.i << endl;
            return 0;
        }
    private:
        Elem _num;
    };
    int print() {
        do_print("class B");
        return 0;
    }
    int print_name() {
        cout << _name << endl;
        return 0;
    }
private:
    char* _name = "B";
};

int main()
{
    B b;
    b.print();
    b.print_name();
    B::C d(4);
    d.print();
    return 0;
}
