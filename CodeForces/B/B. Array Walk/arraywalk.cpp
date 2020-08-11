#include<stdio.h>
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
 #define mod 1e9+7

int func(int a[],int N,int i,int K,int Z,int max,int score){
	if(K<=0)
		return score;
	if(a[i]>max)
		max=a[i];
	score+=a[i];
	if(i>0 && a[i-1]>max && Z>0){
		K--;
		Z--;
		return func(a,N,i+1,K,Z,max,score);
	}
	if(i<N-1 && a[i+1]>max){
		K--;
		return func(a,N,i+1,K,Z,max,score);
	}
	int rightScore=func(a,N,i+1,K-1,Z,max,score);
	int leftScore=func(a,N,i-1,K-1,Z-1,max,score);

	return (leftScore>rightScore)?leftScore:rightScore;
}
int main(){
	fastio;
	int t;
	cin>>t;
	while(t-->0){
		int N,K,Z;
		scanf("%d%d%d",&N,&K,&Z);
		int a[N];
		for(int i=0;i<N;i++)
		    scanf("%d",&a[i]);
		int score=0,max=a[0];
	    int ans=func(a,N,0,K,Z,max,score);
	    printf("%d",ans);
	}
	return 0;
}
