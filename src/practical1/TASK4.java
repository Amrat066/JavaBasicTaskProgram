package practical1;
import java.io.*;



public class TASK4 {

	public static void main(String args[])throws Exception  {
	
		//Copy img from one location to another
		
		
//		File sourceFile = new File("/home/agm6/Documents/sessions/bunny.png");
//
//		File destinationFile = new File("/home/agm6/Documents/sessions/bunny1.png");
//
//		InputStream inStream = new FileInputStream(sourceFile);
//
//		OutputStream outStream= new FileOutputStream(destinationFile);
//
//		int length;
//
//		while ((length = inStream.read())!=-1) {
//
//		outStream.write(length);
//
//		}
//
//		System.out.println("File is copied successful!");
//		inStream.close();
//		outStream.close();
		
		
		
			// create and read the csv file 
		
			//String line;
			File file=new File("/home/agm6/Documents/data.csv");
			FileReader f=new FileReader(file);
			BufferedReader bf=new BufferedReader(f);
//		    FileWriter csvWriter = new FileWriter("/home/agm6/Documents/data.csv");
//			
//			csvWriter.write("Name");
//			csvWriter.write(",");
//			csvWriter.write("Role");
//			csvWriter.write(",");
//			csvWriter.write("Topic");
//			csvWriter.write(",");
//			csvWriter.write("salary");
//			csvWriter.write("\n");			
//			String []s= {"amrat,author,java,5000","David,editor,Python,2000","Scott,editor,NOdejs,40000","manish,designer,frontend,7000","aniket,dodiya,it,4000",
//					"khushi,devloper,php,2000","manoj,designer,it,1000","hitesh,author,c++,5000"};
//			for(String row:s) {
//				csvWriter.write(row);
//				csvWriter.write("\n");
//		}
//			
//			String []tempArr;
//			int sum=0;
//			while((line = bf.readLine()) != null) {
//	            tempArr = line.split(",");
//	            System.out.print(line);
//	            	if(!tempArr[3].equals("salary")) {
//	            	   sum+=Integer.parseInt(tempArr[3]);
//	               }
//	            	System.out.println(); 
//	            }  
//	            System.out.println(sum);
			
			
//
			
			 bf.close();
			// csvWriter.close();
			
			
			
	}
}
