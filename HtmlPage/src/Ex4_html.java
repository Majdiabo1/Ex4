import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex4_html {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);/*using a scanner to get a number*/
		System.out.println("Enter a number between 1-50");
		double n = sc.nextInt();
		if(!(n>=1 && n<=50 )) {/*checking the input number, if this a wrong number updated it to 10*/
			n=10;/*default*/
			System.out.println("The number not between 1-50, we updated it to the default(10)");
		}
		/*three string to the three colors, 100/n give the width value*/ 
		String BlueDiv = "<div style=\" width: "+100/n+"%; height:100%; float: right; background-color: blue;\"></div>\r\n";
		String RedDiv = "<div style=\" width: "+100/n+"%; height:100%; float: right; background-color: red;\"></div>\r\n";
		String GreenDiv = "<div style=\" width: "+100/n+"%; height:100%; float: right; background-color: green;\"></div>\r\n";
		/*str the begining of html file*/
		String str = "<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Ex4</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>";
		/*making a writer to file Ex4.html*/
		BufferedWriter writer = new BufferedWriter(new FileWriter("Ex4.html"));
		writer.write(str);
		for(int i=0 ; i<n ; i++) {
			/*checking the place of the three colors and write it to html file*/
			if(i%3 == 0)
				writer.write(BlueDiv);
			else {
				if(i%3 == 1)
					writer.write(RedDiv);
				else
					writer.write(GreenDiv);
			}
		}
		/*update str to the end of html file*/
		str = "    </body>\r\n" + 
				"</html>";
		writer.write(str);
		writer.close();
		System.out.println("Making Ex4.html succeed");

	}

}
