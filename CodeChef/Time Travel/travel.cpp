#include <iostream>
#include<bits/stdc++.h>
using namespace std;
#define MAX 1000000
#define MOD 1000000007
static int xi,yi,xf,yf;
bool isSafe(int grid[MAX][MAX],int i,int j){
    return i>=xi && i<xf && j>=yi && j<yf && grid[i][j]!=-1;
}
bool util(int grid[MAX][MAX],int i,int j,int xf,int yf){
    if(i==xf && j==yf && grid[i][j]!=-1)
        return true;
    if(isSafe(grid,i,j)){
        if(util(grid,i+1,j,xf,yf))
            return true;
        if(util(grid,i,j+1,xf,yf))
            return true;
        return false;
    }
    return false;
}
int main() {
	int t;
	cin>>t;
	while(t-->0){
	    int grid[MAX][MAX];
	    int S,K;
	    cin>>xi>>yi>>xf>>yf;
	    grid[xi][yi]=1;
	    grid[xf][yf]=1;
	    cin>>S>>K;
	    for(int i=1;i<=S;i++){
	        int x,y;
	        cin>>x>>y;
	        grid[x][y]=1;
	    }
	    for(int i=1;i<=K;i++){
	        int x,y;
	        cin>>x>>y;
	        grid[x][y]=-1;
	    }
	    if(util(grid,xi,yi,xf,yf))
	        cout<<"YES";
        else
            cout<<-1;
	}
	return 0;
}
