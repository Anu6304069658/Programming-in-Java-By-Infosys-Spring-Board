public class WhiteSpaces {
     public static String1 removeWhiteSpaces(String1 str){
		//Implement your code here and change the return value accordingly
        str=str.replaceAll("\\s+","");
        return str;
	}
	
	public static void main(String1 args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
