package org.cpts422;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(!Triangle.isValidRange(a)){
            System.out.println("a not in range");
        } else if (!Triangle.isValidRange(b)) {
            System.out.println("b not in range");
        } else if (!Triangle.isValidRange(c)) {
            System.out.println("c not in range");
        }else{
            Triangle triangle = new Triangle(a,b,c);
            if(triangle.isValid()){
                if(triangle.isEquilateral()){
                    System.out.println("Equilateral Triangle");
                } else if (triangle.isScalene()) {
                    System.out.println("Scalene Triangle");
                }else{
                    System.out.println("Isosceles Triangle");
                }
            }else {
                System.out.println("Not a Triangle");
            }
        }
    }
}