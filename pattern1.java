public class pattern1 {
    public static void main(String[] args) {
      int n=10; 
      for(int i=0; i<n; i++)
      {
        for(int j=0; j<n; j++)
        {
            if(j==0 || i+j==5 || i-j==4)
            {
                System.out.print("K");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
          for(int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1) || i==(n-1)/2)
                {
                    System.out.print("H");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
                for(int j=0; j<n; j++)

            {
                if(j==0 || i==(n-1) || j==(n-1))
               {
                System.out.print("U");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(i==0 || i==(n-1)/2 || i==(n-1) || j==0 && i<(n-1)/2 || j==(n-1) && i>(n-1)/2)
                {
                    System.out.print("S");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==(n-1)/2)
                {
                    System.out.print("H");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++)
            {
                if(i==0 || i==n-1 || j==(n-1)/2)
                {
                    System.out.print("I");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
      }
    }
}