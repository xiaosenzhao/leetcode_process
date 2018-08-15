#include <vector>
#include <stdint.h>
#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

class comp
{
public:
    int i;
    int j;
public:
    comp(){}
    ~comp(){}
public:
    bool operator<(const comp & r) const
    {
        return this->i < r.i;
    }
};

int main(int argc,char ** argv)
{
    if(argc != 2)
    {
        cout<<"wrong arguments.sorttest <vSize>"<<endl;
        return 0;
    }

    std::vector<comp> v;

    //insert object to vector
    comp obj;
    obj.i = 10;
    for(int a = 0; a < strtoul(argv[1],NULL,10);++a)
    {
        obj.j = a;
        v.push_back(obj);
    }

    //print sort before value
    int i = 1;
    for(vector<comp>::iterator it = v.begin();it != v.end(); it++)
    {
        std::cout<<"before sort:"<<i<<":"<<"i="<<it->i<<";j="<<it->j<<endl;
        i++;
    }

    //sort
    std::sort(v.begin(),v.end());

    //print end sort value
    i = 1;
    for(vector<comp>::iterator it = v.begin();it != v.end(); it++)
    {
        std::cout<<"after sort:"<<i<<":"<<"i="<<it->i<<";j="<<it->j<<endl;
        i++;
    }

    return 0;
}
