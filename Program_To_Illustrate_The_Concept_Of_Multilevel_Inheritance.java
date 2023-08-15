import java.io.*;
import java.lang.*;
import java.util.*;
  
class one {
    public void print_hello()
    {
        System.out.println("hellos");
    }
}
  
class two extends one {
    public void print_world() { System.out.println("world"); }
}
  
class three extends two {
    public void print_hello()
    {
        System.out.println("hellos");
    }
}
  
public class Main {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_hello();
        g.print_world();
        g.print_hello();
    }
}
