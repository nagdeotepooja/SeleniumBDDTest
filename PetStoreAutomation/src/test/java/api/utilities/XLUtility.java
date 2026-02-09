package api.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	
	
	public FileInputStream fi;
	public FileInputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSFFRow row;
	public XSFFCell cell;
	public CellStyle style;
	String path;
	
	
	public XLUtility(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String SheetName)
	{
		fi=new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet= workbook.getSheet(SheetName);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
	}

}
