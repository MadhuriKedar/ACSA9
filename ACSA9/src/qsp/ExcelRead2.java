package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=5;i++) {
			String usn = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			System.out.println(usn);
		}
		System.out.println("====================================");
		for(int i=0;i<=5;i++) {
			String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			System.out.println(pwd);
		}
	}

}
