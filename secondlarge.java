class Solution {
    public int getSecondLargest(int[] a) 
    {
        int lar=a[0];
        for(int i=0;i<a.length;i++)
        {
                if(a[i]>lar)
                
                {
                    lar=a[i];
                }
        }int sec=a[0];
         for(int i=0;i<a.length;i++)
         {
                if(a[i]!=lar && a[i]>sec)
                {
                    sec=a[i];
                }
            
         }
    return sec;
    }
}
