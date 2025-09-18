#include <iostream>
using namespace std;

// enum first_enum
// {
//     value1 = 1,
//     value2 = 10,
//     value3
// };

// int main()
// {
//     first_enum e;
//     e = value3;
//     cout << e;

//     return 0;
// }

// #include <iostream>
// using namespace std;

// enum Day
// {
//     sunday = 'A',
//     monday,
//     tuesday,
//     wednesday,
//     thursday,
//     friday,
//     saturday
// };

// int main()
// {
//     enum Day today;
//     today = sunday;
//     cout << today;
//     switch (today)
//     {
//     case 65:
//         cout << " = It is sunday";
//         break;
//     case 66:
//         cout << " = It is monday";
//         break;
//     }
// }

// enum Day
// {
//     sunday = 0,
//     monday,
//     tuesday,
//     wednesday,
//     thursday,
//     friday,
//     saturday
// };

// int main()
// {
//     Day today = sunday;

//     switch (today)
//     {
//     case sunday:
//         cout << "It is sunday";
//         break;
//     case monday:
//         cout << "It is monday";
//         break;
//     }
// }

enum year
{
    Jan = 1,
    Feb,
    Mar,
    Apr,
    May,
    Jun,
    Jul,
    Aug,
    Sep,
    Oct,
    Nov,
    Dec
};

int main()
{
    int i;
    for (i = Jan; i <= Dec; i++)
        cout << i << " ";
    return 0;
}
