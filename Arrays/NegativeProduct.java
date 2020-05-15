class NegetiveProduct{
    static int getNoOfSubArrays(int a[]){
        int product=1,count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=i;k<j;k++){
                    product *= a[k];
                    if(product<0)
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int a[]={5, -4, -3, 2, -5 };
        System.out.println(getNoOfSubArrays(a));
    }
}