package com.DesignPatterns;

class Singleton
{
// static variable single_instance of type Singleton
private static Singleton single_instance = null;

// variable of type String
public String s;

// private constructor restricted to this class itself
private Singleton()
{
s = "Hello I am a string part of Singleton class";
}

// static method to create instance of Singleton class
public static Singleton getInstance()
{
if (single_instance == null)
single_instance = new Singleton();

return single_instance;
}
}

// Driver Class
class SingletonMain
{
public static void main(String args[])
{
// instantiating Singleton class with variable x
Singleton x = Singleton.getInstance();

// instantiating Singleton class with variable y
Singleton y = Singleton.getInstance();

// instantiating Singleton class with variable z
Singleton z = Singleton.getInstance();

// changing variable of instance x
x.s = (x.s).toUpperCase();

System.out.println("String from x is " + x.s);
System.out.println("String from y is " + y.s);
System.out.println("String from z is " + z.s);
System.out.println("\n");

// changing variable of instance z
z.s = (z.s).toLowerCase();

System.out.println("String from x is " + x.s);
System.out.println("String from y is " + y.s);
System.out.println("String from z is " + z.s);
}
} 



/* OUTPUT OF THE ABOVE PROGRAM

String from x is HELLO I AM A STRING PART OF SINGLETON CLASS
String from y is HELLO I AM A STRING PART OF SINGLETON CLASS
String from z is HELLO I AM A STRING PART OF SINGLETON CLASS


String from x is hello i am a string part of singleton class
String from y is hello i am a string part of singleton class
String from z is hello i am a string part of singleton class

*/

