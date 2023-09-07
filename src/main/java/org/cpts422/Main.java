package org.cpts422;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(!Triangle.isWithinRange(a)){
            System.out.println("a out of range");
        } else if (!Triangle.isWithinRange(b)) {
            System.out.println("b out of range");
        } else if (!Triangle.isWithinRange(c)) {
            System.out.println("c out of range");
        }else{
            System.out.println("Side a: "+a);
            System.out.println("Side b: "+b);
            System.out.println("Side c: "+c);
            Triangle t = new Triangle(a,b,c);
            if(t.isValid()){
                if(t.isEquilateral()){
                    System.out.println("Equilateral Triangle");
                }else if(t.isScalene()){
                    System.out.println("Scalene Triangle");
                }else{
                    System.out.println("Isosceles Triangle");
                }
            }else{
                System.out.println("Not a Triangle");
            }
        }

    }
}