import java.util.* ;

class Main
{
    static Double quad2(Double a,Double b,Double c)
    {
        return (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a ;
    }
    
    static Double quad1(Double a,Double b,Double c)
    {
        return (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a ;
    }
    
    static Double dist(Double x1,Double y1,Double x2,Double y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) ;
    }
    
    static Double height(Double base,Double angle)
    {
        Double angle_ans = Math.toRadians(angle) ;
        return base*Math.tan(angle_ans) ;
    }
    
    public static void main (String [] args)
    {
        System.out.println("Choose from these :") ;
        System.out.println("1.Right triangle height") ;
        System.out.println("2.Distance between two points") ;
        System.out.println("3.Quadratic Equation") ;
        Scanner sc = new Scanner(System.in) ;
        Scanner scc = new Scanner(System.in) ;
        int n ;
        n=sc.nextInt() ;
        if(n==1)
        {
            System.out.println("Enter base and angle") ;
            Double base = scc.nextDouble() ;
            Double angle = scc.nextDouble() ;
            Double ans=height(base,angle) ;
            System.out.println("Height of triangle : "+ans) ;
        }
        else if(n==2)
        {
            Double x1,y1,x2,y2 ;
            System.out.println("Enter x1,y1") ;
            x1=scc.nextDouble() ;
            y1=scc.nextDouble() ;
            System.out.println("Enter x2,y2") ;
            x2=scc.nextDouble() ;
            y2=scc.nextDouble() ;
            Double ans=dist(x1,y1,x2,y2) ;
            System.out.println("Distance : "+ans) ;
        }
        else if(n==3)
        {
            Double a,b,c,ans ;
            System.out.println("Enter a") ;
            a=scc.nextDouble() ;
            System.out.println("Enter b") ;
            b=scc.nextDouble() ;
            System.out.println("Enter c") ;
            c=scc.nextDouble() ;
            ans=quad1(a,b,c) ;
            System.out.println("First root : "+ans) ;
            ans=quad2(a,b,c) ;
            System.out.println("First root : "+ans) ;
        }
        else System.out.println("Invalid choice , run again") ;
    }
}
