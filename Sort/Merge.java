import java.util.*;
class MergeSort{
	void merge(int[] a,int beg,int mid,int end){
		int n1=mid-beg+1;
		int n2=end-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=a[beg+i];
		for(int i=0;i<n2;i++)
			R[i]=a[mid+1+i];
		int i=0,j=0,k=beg;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}else{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=R[j];
			j++;
			k++;
		}
	}
	void mergeSort(int[] a,int beg,int end){
		int mid;
		if(beg<end){
			mid=(beg+end)/2;
			mergeSort(a,beg,mid);
			mergeSort(a,mid+1,end);
			merge(a,beg,mid,end);
		}
	}
	public static void main(String[] args) {
		int a[]={6,2,9,1,4};
		MergeSort obj = new MergeSort();
		obj.mergeSort(a,0,a.length-1);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}