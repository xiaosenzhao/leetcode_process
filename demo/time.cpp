#include <iostream>
#include <ctime>
#include <sys/time.h>

int main()
{
    //获取时间戳
    std::time_t t = std::time(0);
    std::cout << t << "seconds since 01-Jan-1970\n";
    t = std::time(NULL);
    std::cout << t << "seconds since 01-Jan-1970\n";

    //c
    unsigned long int sec = time(NULL);
    time_t sec2 = time(NULL);
    std::cout << sec << std::endl;
    std::cout << sec2 << std::endl;

    //ms
    std::chrono::milliseconds ms = std::chrono::duration_cast<std::chrono::milliseconds>(
            std::chrono::system_clock::now().time_since_epoch());
    std::cout << ms.count() << std::endl;

    //c
    struct timeval tp;
    gettimeofday(&tp, NULL);
    long int cms = tp.tv_sec * 1000 + tp.tv_usec / 1000;
    std::cout << cms << std::endl;

    return 0;
}
