
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	int degCoeff[];
    Polynomial(){
        degCoeff=new int[10];
    }
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
	
        if(degree>degCoeff.length-1){
            int temp[]=degCoeff;
            degCoeff=new int[degree+1];
            for(int i=0;i<temp.length;i++)
                degCoeff[i]=temp[i];
        }
        degCoeff[degree]=coeff;
		
	}
    
  
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<degCoeff.length;i++){
            if(degCoeff[i]!=0){
                System.out.print(degCoeff[i]+"x"+i+" ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
	
        Polynomial ans=new Polynomial();
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i,this.degCoeff[i]+p.degCoeff[i]);
        }
        
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
          while(i<plen2){
            ans.setCoefficient(i,p.degCoeff[i]);
            i++;
        }
        return ans;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
			
         Polynomial ans=new Polynomial();
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i,this.degCoeff[i]-p.degCoeff[i]);
        }
        
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
          while(i<plen2){
            ans.setCoefficient(i,-p.degCoeff[i]);
            i++;
        }
        return ans;
	}
    
    public int getCoeff(int degree){
        if(degree<this.degCoeff.length){
            return degCoeff[degree];
        }
        else
            return 0;
    }
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		
        Polynomial ans=new Polynomial();
        for(int i=0;i<this.degCoeff.length;i++){
            for(int j=0;j<p.degCoeff.length;j++){
                int termDeg=i+j;
                int termCoeff=this.degCoeff[i]*p.degCoeff[j];
                int oldCoeff=ans.getCoeff(termDeg);
                ans.setCoefficient(termDeg,termCoeff+oldCoeff);
            }
        }
        return ans;
	}

}
