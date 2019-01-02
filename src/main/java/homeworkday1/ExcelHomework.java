package homeworkday1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.offcn.domain.Moblie;

public class ExcelHomework {
	public void getMobile() throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream stream = new FileInputStream("d://chart/Mobile.xls");
		Workbook workbook = WorkbookFactory.create(stream);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<=sheets;i++){
			Sheet sheetAt = workbook.getSheetAt(i);
			int rows = sheetAt.getPhysicalNumberOfRows();
			for(int j=0;j<=rows;j++){
				StringBuffer str=new StringBuffer();
				Row row = sheetAt.getRow(j);
				int cells = row.getPhysicalNumberOfCells();
				for(int m=0;m<cells;m++){
					Cell cell = row.getCell(m);
					if(cell.getCellTypeEnum()==CellType.STRING){
						str.append(cell.getStringCellValue());
					}else if(cell.getCellTypeEnum()==CellType.NUMERIC){
						str.append(cell.getNumericCellValue());
					}				
				}
				String[] strs=str.toString().split("-");
				Moblie moblie = new Moblie();

			}
		}
		
	}
}
