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

bool isPrime(int n){
	if(n<=1)
		return false;
	if(n<=3)
		return true;
	if(n%2==0 || n%3==0)
		return false;
	for(int i=5;i*i<=n;i=i+6)
		if(n%i==0 || n%(i+2)==0)
			return false;
	return true;
}
bool isNearlyPrime(int n){
	for(int i=2;i<n;i++)
		if(isPrime(i) && isPrime(n/i) && i<n/i)
			return true;
	return false;
}
// void func(int n){
// 	int index=0,count=0,sum=0;
// 	for(int i=1;i<=n;i++){
// 		if(count==3)
// 			break;
// 		if(sum==n)
// 			break;
// 		if(isNearlyPrime(i)){
// 			sum+=i;
// 			count++;
// 		}
// 	}
// 	if(count==3){
// 		a[index]=n-sum;
// 		printf("YES");
// 		for(int i=0;i<4;i++)
// 			printf("%d ",a[i]);
// 	}
// 	else if(count<3)
// 		printf("NO");
// 	else{
// 		printf("YES");
// 		for(int i=0;i<4;i++)
// 			printf("%d ",a[i]);
// 	}
// }
int main(){
	fastio;
	int t;
	scanf("%d",&t);
	while(t-->0){
		int n;
		scanf("%d",&n);
		if(n<30)
			printf("NO\n");
		else{
			printf("YES\n");
			printf("6 10 14 %d \n",n-30);
		}
	}
	return 0;
}
