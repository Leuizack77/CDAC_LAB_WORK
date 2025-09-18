#include <iostream>
using namespace std;

int main()
{
    int a[3][3] = {2,5,6,8,9,7,1,3,4};
    int max = a[0][0];

    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=2;j++)
        {
            if(max <= *(*(a+i)+j))
            {
                max = *(*(a+i)+j);
            }
        }
    }
    cout << max;

}