package Com.Selenium;

public class writee {
	
	public class WriteExcelSheet 
	{
	   public static void main(String[] args) throws Exception 
	   {
	      //Create blank workbook instance
	      XSSFWorkbook workbook = new XSSFWorkbook(); 

	      //Create a blank sheet inside the workbook
	      XSSFSheet sheet = workbook.createSheet("Student Details");

	      //Create row
	      XSSFRow row;

	      //The data object which will be written
	      Map < String, Object[] > student =  new TreeMap < String, Object[] >();
	      student.put( "1", new Object[] { "Student Roll No.", "Student Name", "Course" });
	      student.put( "2", new Object[] { "tp01", "Gopal", "Phython" });
	      student.put( "3", new Object[] { "tp02", "Manisha", "Java Script" });
	      student.put( "4", new Object[] { "tp03", "Masthan", "Java" });
	      student.put( "5", new Object[] { "tp04", "Satish", "C" });
	      student.put( "6", new Object[] { "tp05", "Krishna", "C++" });

	      //Iterate over data to write into sheet
	      Set < String > ids = student.keySet();
	      int rowNumber = 0;
	      for (String key : ids)
	      {
	        // create a new row
	         row = spreadsheet.createRow(rowNumber++);
	         Object [] objectArr = student.get(key);
	         int cellNumber = 0;
	         for (Object obj : objectArr)
	         {
	// create a new cell
	            Cell cell = row.createCell(cellNumber++);
	// set the value in the cell
	            cell.setCellValue((String)obj);
	         }
	      }

	      //Write the workbook into file system
	      FileOutputStream fos= new FileOutputStream( new File("StudentDetails.xlsx"));
	      workbook.write(fos);
	      fos.close();
	      System.out.println( “written successfully" );
	   }

}
