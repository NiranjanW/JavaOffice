package org.lcbo;
import java.util.*;
import java.util.function.Function;

class HelloWorld {
    
    class A {
         String methosDeclaration(){
           return "LCBO";
        }
    }
    
    public static void main( final String[] args)  {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.forEach(System.out::println);

        final Function<Double, Double> square = (final Double x) -> x * x;

        final double ans = square.apply(4d);
        System.out.println(ans);
        
        System.out.println("Hello World "  +String.format("The ans is %f", ans) );
       
      }
        //  A a = new A(){
        //      public void methosA(){
        //         System.out.println( a.methosDeclaration());
        //      }
             
        // };
    
}

