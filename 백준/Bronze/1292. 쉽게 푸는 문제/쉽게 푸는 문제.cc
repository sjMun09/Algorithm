#include <iostream>
using namespace std;

        int main() {
        int M, N;
        cin >> M >> N;

        int nums[1000];
        int count = 0;
        int check = 1;

        for (int i = 0 ; i < 1000 ; i++) {
        nums[i] = check;
        count++;
        if (check == count) {
        check++;
        count = 0;
        }
        }

        int sum = 0;
        for (int i = M ; i <= N ; i++) {
        sum += nums[i-1];
        }

        cout << sum;  // 결과 출력
        return 0;
        }