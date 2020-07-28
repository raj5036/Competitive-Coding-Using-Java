#include <iostream>
#include<bits/stdc++.h>
#define fastio ios_base::sync_with_stdio(0);cin.tie(NULL);cout.tie(NULL)
using namespace std;
int partition(int a[],int low,int high){
	int pivot=a[high];
	int i=low-1;
	for(int j=low;j<=high-1;j++){
		if(a[j]<=pivot){
			i++;
			swap(a[i],a[j]);
		}
	}
	swap(a[i+1],a[high]);
	return i+1;
}
void quickSort(int a[],int low,int high){
	if(low<high){
		int pi=partition(a,low,high);
		quickSort(a,low,pi-1);
		quickSort(a,pi+1,high);
	}
}
void printArray(int *a,int n){
	for(int i=0;i<n;i++)
		std::cout<<a[i]<<" ";
}
int main(){
	fastio;
	int a[]={2,1,4,156,4,2,1,3,23,12,3};
	int n=sizeof(a)/sizeof(a[0]);
	int low=0;
	int high=n-1;
	quickSort(a,low,high);
	printArray(a,n);
	return 0;
}