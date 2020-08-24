package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet("Sheet1").getRow(4).getCell(0).setCellValue("Qspiders");
		wb.getSheet("Sheet1").getRow(4).getCell(1).setCellValue("Jspiders");
		wb.write(new FileOutputStream(path));
		wb.close();
	}

}
