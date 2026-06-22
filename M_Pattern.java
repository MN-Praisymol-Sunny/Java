public class M_Pattern {
    public static void main(String[] args) {
         for (int i = 1; i < 8; i++) {
            for (int j = 1; j <8 ; j++) {
              if (j==1 || j==7 ||
                i==2 && j==2 ||
                i==3 && j==3 ||
                i==4 && j==4 ||i==3 && j==5 ||i==2 && j==6 
                 )
              {
                System.out.print("* ");
              } else {
                System.out.print("  ");
              }
            }
            System.out.println();
        }
         for (int i = 1; i < 9; i++) {
            for (int j = 1; j <9; j++) {
              if (j==1 || j==7 ||
                i==2 && j==2 ||
                i==3 && j==3 ||
                i==4 && j==4 ||i==5 && j==5 ||i==6 && j==6 
                 )
              {
                System.out.print("* ");
              } else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
        
    }
}
    
