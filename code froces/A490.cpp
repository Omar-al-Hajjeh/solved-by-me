#include <iostream>
#include <vector>
int main()
{
    int n, t, i, result;
    std::cin >> n;
    std::vector<int> pro;
    std::vector<int> math;
    std::vector<int> ecx;

    for (int i = 0; i < n; i++)
    {
        std::cin >> t;
        if (t == 1)
            pro.push_back(i + 1);
        if (t == 2)
            math.push_back(i + 1);
        if (t == 3)
            ecx.push_back(i + 1);
    }
    result = std::min(pro.size(),std::min(math.size(), ecx.size()));
    std::cout << result << std::endl;
    for (int i = 0; i < result; i++)
    {
        std::cout << pro[i] << " " << math[i] << " " << ecx[i] << std::endl;
    }

    return 0;
}
