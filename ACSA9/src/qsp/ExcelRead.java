package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path;
		path="./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String x = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();
		System.out.println(x);//admin
		String y = wb.getSheet("Sheet1").getRow(5).getCell(1).toString();
		System.out.println(y);//manager
	}

}
