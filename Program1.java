class Program1
{
  public static void main(String args[])
  {
    System.out.println("hello world");
  }
}

// Explanation:

// In the first line we defined a class with name Program1. 
// Here we have to make sure that the first letter of the class name should be capital. 
// Now inside the class we have written a long statement:
//           public static void main(String args[])


// Let's Know what this statement means
// public : Accessable in the whole program/it's scope is through the complete program. 
// Static : There is no need to create an object or its instance to access its components. 
// The function doesn't return any value. 
// main : This is the main function where the compiler starts its execution. 
// String args[] : args[] is an array of all parameters that are used in the program or the values that are passed. String because it accepts all the values. 


// saving : Write the code in notepad
//          Press ctrl + shift + s
//          Save as class_name.java

// compilation:
//          Now open cmd in your pc.
//          type java to check that java is correctly installed or not. 
//          if not then install it correctly.
//          now type javac File_name.java
//          File gets compiles and creates a .class file in the directory of your .java folder. 
// Running a java file:
//          if there are no errors then type the following in the cmd:
//          java class_name
//          Your file runs if there are no errors.

// OutPut:
// hello world
