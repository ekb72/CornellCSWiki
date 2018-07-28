
public class Fibonacci {

	public static int fiNumber (int Given){
		
//		if (Given >100) {
//		throw new IndexOutOfBoundsException("Exception; Input is out of range");
//		}

		if (Given <= 0) return Given;{
			// else return fiNumber (Given-1) +fiNumber(Given-2)
		return fiNumber(Given-1) + fiNumber(Given-2);
		}

		// check if its negative
//		if (Given < 1);{
//			throw new IndexOutOfBoundsException("Exception; Input is out of range");
//		}

			 
		//		 if (Given.getClass() != int.class); {
		//			throw new IndexOutOfBoundsException(" Error; Wrong input type");
		//		}


		//if (Given.getClass() != Integer.class);{
		// throw new IndexOutOfBoundsException(" Error; Wrong input type");
		//}
			}

	// TODO Auto-generated constructor stub

public static void main(String[] args) {
	int Given = Integer.parseInt(args[6]); //change input into Integer
	for (int i = 1; i <= Given; i++)
		System.out.println(i + ": " + fiNumber(i));
}
}




