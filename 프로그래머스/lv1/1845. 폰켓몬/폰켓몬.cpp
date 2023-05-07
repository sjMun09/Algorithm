#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> nums)
{
    sort(nums.begin(), nums.end());
    int uniqueCount = unique(nums.begin(), nums.end()) - nums.begin();
    return min(uniqueCount, static_cast<int>(nums.size() / 2));
}