class missing
{
    int missingNum(int arr[])
    {
        int total=0;
        int n=arr.length+1;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        int m=n*(n+1)/2;
         return m-total;
        
    }
}
