package basicjava;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel 
{
	public static void readExcel() throws Exception
	{
		File f = new File("C:\\TestData\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wk.getSheet("data");
		
		//for loop
		
		int nr = sh1.getPhysicalNumberOfRows();
		System.out.println(nr);
		
		for(int i=0; i<nr; i++)  //0<3, 1<3, 2<3
		{
			XSSFRow row = sh1.getRow(i);  //i=0, i=1
			
			int nc = row.getPhysicalNumberOfCells();  //1, 2
			System.out.println(nc);
			
			for(int j=0; j<nc; j++) //0<1, 0<2
			{
				XSSFCell cell = row.getCell(j); //j=0
				System.out.print(cell.getStringCellValue() + "    ");
			}
			
			System.out.println();
		}
		
		/*
		
		//Row1
				XSSFRow r1 = sh1.getRow(0);
				XSSFCell c1 = r1.getCell(0);
				System.out.println(c1.getStringCellValue());
		
		//Row2
				XSSFRow r2 = sh1.getRow(1);
				
				XSSFCell c21 = r2.getCell(0);
				System.out.print(c21.getStringCellValue() + "    ");
		
				XSSFCell c22 = r2.getCell(1);
				System.out.println(c22.getStringCellValue() + "   ");
				
		//Row3
				XSSFRow r3 = sh1.getRow(2);
				
				XSSFCell c31 = r3.getCell(0);
				System.out.print(c31.getStringCellValue() + "   ");
		
				XSSFCell c32 = r3.getCell(1);
				System.out.print(c32.getStringCellValue() + "   ");
				
				XSSFCell c33 = r3.getCell(2);
				System.out.println(c33.getStringCellValue());
				
			*/
	}
	
	
	public static void main(String[] args) throws Exception {
		readExcel();
		
		
	}
	
}
