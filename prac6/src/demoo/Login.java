package demoo;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import jxl.*;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.biff.RowsExceededException;




public class Login {
	private WritableCellFormat timesBoldUnderline;
	private WritableCellFormat times;
	private String inputFile;
	
public void setOutputFile(String inputFile) {
	this.inputFile = inputFile;
	}
	
@SuppressWarnings("deprecation")
	
public void write() throws IOException, WriteException {
	File file = new File(inputFile);
	WorkbookSettings wbSettings = new WorkbookSettings();
	wbSettings.setLocale(new Locale("en", "EN"));
	WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
	workbook.createSheet("Report", 0);
	WritableSheet Login = workbook.getSheet(0);
	createLabel(Login);
	createContent(Login);
	workbook.write();
	workbook.close();
	}

	private void createLabel(WritableSheet sheet)
	throws WriteException {
	
	WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);

	times = new WritableCellFormat(times10pt);
	
	times.setWrap(true);
	

	WritableFont times10ptBoldUnderline = new WritableFont(
	WritableFont.TIMES, 10, WritableFont.BOLD, false,
	UnderlineStyle.SINGLE);

	timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
	
	timesBoldUnderline.setWrap(true);
	CellView cv = new CellView();
	cv.setFormat(times);
	cv.setFormat(timesBoldUnderline);
	cv.setAutosize(true);
	
	addCaption(sheet, 0, 0, "Student Name");
	addCaption(sheet, 1, 0, "Subject 1");
	addCaption(sheet, 2, 0, "subject 2");
	addCaption(sheet, 3, 0, "subject 3");
	}
	
private void createContent(WritableSheet sheet) throws WriteException, RowsExceededException {
	

	for (int i = 1; i < 6; i++) {
	addLabel(sheet, 0, i, "Student " + i);
	addNumber(sheet, 1, i, ((i*i)+6));
	addNumber(sheet, 2, i, ((i*i)+4));
	addNumber(sheet, 3, i, ((i*i)+3));
	}
	}
	
private void addCaption(WritableSheet sheet, int column, int row, String s) throws RowsExceededException, WriteException {
	
Label label;
	label = new Label(column, row, s, timesBoldUnderline);
	sheet.addCell(label);
	}


private void addNumber(WritableSheet sheet, int column, int row, Integer integer) throws WriteException, RowsExceededException {
	Number number;
	number = new Number(column, row, integer, times);
	sheet.addCell(number);
	}
	
private void addLabel(WritableSheet sheet, int column, int row, String s)
	throws WriteException, RowsExceededException {
	Label label;
	label = new Label(column, row, s, times);
	sheet.addCell(label);
	}

public static void main(String[] args) throws WriteException, IOException {
	Login test = new Login ();
	test.setOutputFile("C:\\Users\\arsha\\Downloads\\Stu.xls");
	test.write();
System.out.println("Please check the result file under C:\\\\Users\\\\arsha\\\\Downloads\\\\Stu.xls ");
	}
	}