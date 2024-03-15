class SwitchExample
{
	public static void main(String[] args) {
		/*int a = 10;
		switch(a)
		{
			case 1: System.out.println("Hi from case 1");
			case 2: System.out.println("Hi from case 2");
			case 3: System.out.println("Hi from case 3");
			case 4: System.out.println("Hi from case 4");
			case 5: System.out.println("Hi from case 5");
			default : System.out.println("Hi from DEFAULT BLOCK"); // output : Default block (a = 10 so it doesn't found 10 label case)
		}*/

		/*int a = 1;
		switch(a)
		{
			case 1: System.out.println("Hi from case 1");
			case 2: System.out.println("Hi from case 2");
			case 3: System.out.println("Hi from case 3");
			case 4: System.out.println("Hi from case 4");
			case 5: System.out.println("Hi from case 5");
			default : System.out.println("Hi from DEFAULT BLOCK"); // output : All blocks bcz a=1 and case 1 match value but their is no break after case1 onwords.
																   //			it called FALLTHROUGH condition
		}*/

		/*byte a = 1;
		switch(a)
		{
			case 1: System.out.println("Hi from case 1");
			case 2: System.out.println("Hi from case 2");
			case 3: System.out.println("Hi from case 3");
			case 4: System.out.println("Hi from case 4");
			case 128: System.out.println("Hi from case 5");  //OUTPUT : compile time error (incompatible types: possible lossy conversion from int to byte) 
			default : System.out.println("Hi from DEFAULT BLOCK");  //: byte range to 127 so it will not take 128 label
																  
		}*/

		/*byte a = 1;
		switch(a+0)
		{
			case 1: System.out.println("Hi from case 1");break;
			case 2: System.out.println("Hi from case 2");break;
			case 3: System.out.println("Hi from case 3");break;
			case 4: System.out.println("Hi from case 4");break;
			case 128: System.out.println("Hi from case 5");break;  //OUTPUT : Hi from case 1
			default : System.out.println("Hi from DEFAULT BLOCK");break;  //: (a+0) a = byte, 0= int so by rule of resultant output datatype will be int. Int range is large.
																  
		}*/

		/*byte a = 1;
		switch(a+0)
		{
			case 1: System.out.println("Hi from case 1");break;
			case 2: System.out.println("Hi from case 2");break;
			case 'A': System.out.println("Hi from case 3");break;
			case 65: System.out.println("Hi from case 4");break;
			case 128: System.out.println("Hi from case 5");break;  //OUTPUT : compile time erorr (duplicate case label)
			default : System.out.println("Hi from DEFAULT BLOCK");break;  //: ascci value of'A' = 65 and label is also 65. bcz of same label value error occure. 
																  
		}*/

		/*byte a = 1;
		switch(a+0)
		{
			case 1: System.out.println("Hi from case 1");break;
			case 'b': System.out.println("Hi from case 3");break;
			case 'B': System.out.println("Hi from case 4");break; //OUTPUT : Hi from case 1
			default : System.out.println("Hi from DEFAULT BLOCK");break;  //: Ascii value of 'B' = 66 and 'b' = 98
																  
		}*/

		/*byte a = 1;
		switch(a+1)
		{
			case 1: System.out.println("Hi from case 1");break;
			case 'b': System.out.println("Hi from case 3");break;
			case 'B': System.out.println("Hi from case 4");break; //OUTPUT : Hi from DEFAULT BLOCK
			default : System.out.println("Hi from DEFAULT BLOCK");break;  //: 
																  
		}*/

		/*byte a = 1;
		switch(a+1)
		{
			case 1: System.out.println("Hi from case 1");break;
			case 'b': System.out.println("Hi from case 3");break;
			case 'c': System.out.println("Hi from case 4");break; //OUTPUT : Blank Line
																  
		}*/

		/*byte a = 1;
		switch(a+1)
		{
			//OUTPUT : Blank Line : 
		}
*/
		/*byte a = 1;
		switch(a+0)
		{
			case 1: {
						System.out.println("Hi from case 1");
						break;
					}
			case 2: {
						System.out.println("Hi from case 2");
						break;
					}
			case 3: {
						System.out.println("Hi from case 3");
						break;
					}
			default :{
						System.out.println("Hi from DEFAULT BLOCK"); // OUTPUT : Hi from case 1
						break;  
					}											  
		}*/

		/*byte a = 1;
		switch(a+0)
		{
			case 1: System.out.println("Hi from case 1");
					break;
				
			case 2: System.out.println("Hi from case 2");
					break;
		
			case 3: System.out.println("Hi from case 3");
					break;
				
			default :System.out.println("Hi from DEFAULT BLOCK"); // OUTPUT : Hi from case 1
					 break;  												  
		}*/

		byte a = 1;
		switch(a+1)
		{
			case 1: System.out.println("Hi from case 1");break;
			default : System.out.println("Hi from DEFAULT BLOCK");break;
			case 'b': System.out.println("Hi from case 3");break;
			case 'B': System.out.println("Hi from case 4");break; //OUTPUT : Hi from DEFAULT BLOCK													  
		}
	}
}