#include <iostream>
using namespace std;

void getSteps(int dist[],int n,int k){
    for(int i=0;i<n;i++)
        if(dist[i]%k==0){
            cout<<1;
        }else
        	cout<<0;
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,k;
	    cin>>n>>k;
	    int dist[n];
	    for(int i=0;i<n;i++)
	        cin>>dist[i];
	   
        getSteps(dist,n,k);
	}
	return 0;
}
