#include <iostream>
#include <sstream>

using namespace std;

class Counting {
    private:
        int n, m;

    public:
        Counting(int n, int m) : n(n), m(m) {}
    
        int getCounting() {
            return n * m - 1;
        }
};

int main() {
    int n, m;
    cin >> n >> m;

    Counting c1(n, m);
    
    cout << c1.getCounting() << endl;

    return 0;
}