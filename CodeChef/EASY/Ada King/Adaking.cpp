#include<iostream>
#include<bits/stdc++.h>
#include<algorithm>
#include<set>
#include<unordered_map>
#include<stack>
#include<queue>
using namespace std;

#define ll long long
#define fastio ios_base::sync_with_stdio(0);cin.tie(NULL);cout.tie(NULL)
#define R 8
#define C 8 
#define positionRow 7
#define positionCol 0

int main()
{
    int T, i, j, k;
    scanf("%d", &T);
    while (T--)
    {
        scanf("%d", &k);
        k--;
        char chess[8][8];
        for (i = 0; i < 8; i++)
        {
            for (j = 0; j < 8; j++)
            {
                if (i == 0 && j == 0)
                {
                    chess[i][j] = 'O';
                }
                else if (k > 0)
                {
                    chess[i][j] = '.';
                    k--;
                }
                else
                {
                    chess[i][j] = 'X';
                }
            }
        }
        for (i = 0; i < 8; i++)
        {
            for (j = 0; j < 8; j++)
            {
                printf("%c", chess[i][j]);
            }
            printf("\n");
        }
    }
}

	
