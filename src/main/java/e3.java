import java.util.*;
public class e3 {

  public static void main(String[] args) {
	   if (args.length != 1)
     {
       System.exit(1);
     }

     int x = 0;
     try{
       x = Integer.parseInt(args[0]);
     }catch (NumberFormatException e) {
       System.exit(1);
     }

    int tri = calculateTriangle(x);
    int lazy = calculateLazy(x);
    System.out.println("Tri(" + x + ") = " + tri);
    System.out.println("Lazy(" + x + ") = " + lazy);
  }

  public static int calculateTriangle(int n)
  {
      int result = 0;
      for(int i =1; i<=n;i++)
      {
        result+=i;
      }
      return result;
  }

  public static int calculateLazy(int n)
  {
    int result = ((n*n) + n+ 2)/2;
    return result;
  }
}
