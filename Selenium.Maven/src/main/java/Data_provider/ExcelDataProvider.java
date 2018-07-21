package Data_provider;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb; 

    //lets create a constructor "public Excel_data_provider()"
	
    public ExcelDataProvider()
	{ 
	//dot operator specifies the current directory i'm working in .
	try {
	wb=new XSSFWorkbook(new FileInputStream("./Test Case document/Input Sheets.xlsx"));
	} catch (Exception e) {
		
		System.out.println("unable to load excel file"+e.getMessage());
		
	}}
	
	public String getdata(String sheetname,int row,int column)
	{
	String data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();	
	return data;
	}
	public int getrowcount(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum();
		/*totalrows=totalrows+1;//I use this because we want row count and not index number 	
		return totalrows;*/
	}
	public int columncount(String sheetname)
	{
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}
}
