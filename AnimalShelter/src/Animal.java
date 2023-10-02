import com.sun.org.apache.xpath.internal.operations.Bool;

public abstract class Animal {
    public String name;


    public abstract void makeNoise();
    public abstract void roam();
    public abstract void eats();

    @Override
    public String toString(){
        return "Cat name is: " + name ;
    }

    @Override
    public boolean equals(Object name){
        return this.name == name;
    }

    public void sleep(){
        System.out.println("It sleeps just like every other animal");
    }

}
//package com.DataFlair.FileHandling;
//        import java.io.File;
//        import java.io.IOException;
//public class CreatingNewFile
//{
//    public static void main(String args[])
//    {
//        try {
//            File fcreate = new File("G:\\Internship\\File Handling\\NewFile.txt");
//            if (fcreate.createNewFile()) {
//                System.out.println("File " + fcreate.getName() + " is created successfully.");
//            }
//            else {
//                System.out.println("File is already exist in the directory.");
//            }
//        } catch (IOException exception) {
//            System.out.println("An unexpected error is occurred.");
//            exception.printStackTrace();
//        }
//    }
//}