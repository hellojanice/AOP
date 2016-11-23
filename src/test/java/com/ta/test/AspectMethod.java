package com.ta.test;

/**
 * Created by rcadmin on 11/23/16.
 */
public class AspectMethod implements IAspectMethod{
    public static void print(){
        System.out.println("empty");
    }
    public static void print(int i){
        System.out.println(i);
    }
    public static void print(String i){
        System.out.println(i);
    }
    public static void print(int i,String j){
        System.out.println(i+j);
    }
    public static void print(int i,int j){
        System.out.println(i+j);
    }
    public static void printThrowException(int i,int j) throws ClassNotFoundException {
        System.out.println(i+j);
        throw new ClassNotFoundException();
    }
}
