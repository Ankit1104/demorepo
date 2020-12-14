package data;

public class ReadExcelfile {

	public static void main(String[] args) {
		
		Xls_Reader read = new Xls_Reader("D:\\Manual test cases.xlsx");
		System.out.println(read.getCellData("data1",1, 2));
		System.out.println(read.getCellData("data1", "Test Case Description", 1));

	}

}
