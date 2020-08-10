//program to read 1D, 2D and 3D array
public class NewClass2 {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int b[][]=new int[2][2];
        int c[][][]=new int[2][2][2];
        
       for(int i=0;i<5;i++)
       {
           a[i]=i;
       }
       System.out.println("1D array is:");
       for(int i=0;i<5;i++)
       {        
            System.out.print("  "+a[i]);
       }    
        
       
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
            b[i][j]=i+j;   
           }
       }
       System.out.println("");
       System.out.println("2D array is:");
       for(int i=0;i<2;i++)
               {
                for(int j=0;j<2;j++)
                {
                    System.out.print("  "+b[i][j]);
                }
               }
       
       
       for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    c[i][j][k]=i+j+k;
                }
            }
        }
        System.out.println("");
        System.out.println("3D array is:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    System.out.print("  "+c[i][j][k]);
                }
            }
        }

    }
}    