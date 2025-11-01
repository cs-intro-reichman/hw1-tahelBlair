// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class Demo0 {
//PrintTo5 {
	public static void main(String[] args) {
		// Declares an int variable, and sets it to 1
        int i = 0;
        // Complete the program's code here:
        while (i<6)
        {
            System.out.println(i);
            i = i + 1;
        } 
        System.out.println("Done");

        //change 1 - didn't compile, there is a compile time error because the class's name doesn't match the file's name.
        //change 2 - compiled successfully
        //change 3 - didn't compile, there is a compile time error because we need to use a quotation mark at the beggining and the end of a scentence.
        //change 4 - didn't compile, there is a compile time error because unless we print variables we have to use quotation marks.
        //change 5 - compiled but didn't run successfully, there is a run time error because the computer is looking for 'main' but doesn't find it - it doesn't excist.
        //change 6 - didn't compile, there is a compile time error because we used a wrong syntext - there is no such thing "System.out.printline();" in java.
        //change 7 - didn't compile, there is a compile time error because we used a wrong syntext - there is no such thing "println()" in java.
        //change 8 - didn't compile, there is a compile time error because we used a wrong syntext - we didn't finish with ";".
        //change 9 - didn't compile, there is a compile time error because we used a wrong syntext - we have to pair each opening curly brace with a closing one.
        //change 10 - compiled but didn't run successfully, there is a logical error because we're getting an infinate loop. 
    }
}