package pattern;

public class StarPattern1 {
    public static void main(String[] args) {
        ////Pattern 1///
        System.out.println("/////////////////Pattern 1");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        ////Pattern 2///
        System.out.println("//////////////////Pattern 2");

        for(int i=0;i<4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("//////////////////Pattern 3");
        for(int i=0;i<4;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("//////////////////Pattern 4");
        for(int i=0;i<4;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("//////////////////Pattern 5");
        for(int i=0;i<4;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=4;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("//////////////////Pattern 6");
        for(int i=0;i<=4;i++)
        {

            for(int j=0;j<=4;j++)
            {
                if(i==4 || j==0) {
                    System.out.print("*");
                }
                else if(i==j)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("//////////////////Pattern 7");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || i==4 ||j==0||j==4) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");//double space
                }
            }
            System.out.println();
        }

        System.out.println("//////////////////Pattern 8");
        int b=0;
        for(int i=1;i<5;i++){
            for(int k=3;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(i+b);j++){
                System.out.print("*");
            }
            b++;
            System.out.println();
        }
        System.out.println("//////////////////Pattern 8");
b=0;
        for(int i=1;i<5;i++)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=7;j>=(b+i);j--)
            {
                System.out.print("*");
            }
            b++;
            System.out.println();
        }

        System.out.println("//////////////////Pattern 9");
        //https://www.youtube.com/watch?v=3O0GK7dGSe8

        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                if(((i+j)==3) ||((j-i)==3) ||(j%2==0 && i==3)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("//////////////////Pattern 10");
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6;j++)
            {
                if(((i+j)==3) ||((j-i)==3) ||i==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("//////////////////Pattern 11");

        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if(i==2 || j==2)
                {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");//double space
                }
            }
            System.out.println();
        }
        System.out.println("//////////////////Pattern 12");


        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if((i+j)==4 || i==j)
                {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("//////////////////Pattern 13");
        for(int i=0;i<4;i++)
        {
            for(int k=3;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=3;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
