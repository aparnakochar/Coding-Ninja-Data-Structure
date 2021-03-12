// Complex Number Class
// Send Feedback
// A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
// Implement the Complex numbers class that contains following functions -
// 1. constructor
// You need to create the appropriate constructor.
// 2. plus -
// This function adds two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 3 +i1
// C1.plus(C2) results in: 
// C1 = 7 + i6 and C2 = 3 + i1
// 3. multiply -
// This function multiplies two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 1 + i2
// C1.multiply(C2) results in: 
// C1 = -6 + i13 and C2 = 1 + i2
// 4. print -
// This function prints the given complex number in the following format :
// a + ib
// Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
// Input Format :
// Line 1 : Two integers - real and imaginary part of 1st complex number
// Line 2 : Two integers - real and imaginary part of 2nd complex number
// Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)
// Output format :
// Check details of 'print' function given above.
// Sample Input 1 :
// 4 5
// 6 7
// 1
// Sample Output 1 :
// 10 + i12
// Sample Input 2 :
// 4 5
// 6 7
// 2
// Sample Output 2 :
// -11 + i58

public class ComplexNumbers {
	// Complete this class
	int real;
    int imag;
    
    ComplexNumbers(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    
    public void plus(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.imag=this.imag+c2.imag;
    }
    public void print(){
        System.out.print(this.real+" + i"+this.imag);
    }
      public void multiply(ComplexNumbers c2){
      ComplexNumbers c3=new ComplexNumbers(0,0);
        c3.real=this.real*c2.real-this.imag*c2.imag;
        c3.imag=this.real*c2.imag+this.imag*c2.real;
          this.real=c3.real;
          this.imag=c3.imag;
    }
}
