#include <iostream>
#include <string>
int main()
{
    int i,n, k, j = 0;
    std::cin >> n >> k;
    std::string result;
    for (i = 0; i < n; i++)
    {
            result += (char) ('a' + j);
            j++;
            if (j == k){
                j = 0;
            }
        
        
    }
    std::cout << result << std::endl;
    return 0;
}
