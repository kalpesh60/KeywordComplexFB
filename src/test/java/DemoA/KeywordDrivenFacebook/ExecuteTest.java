
package DemoA.KeywordDrivenFacebook;


public class ExecuteTest {
	public static void main(String[] args) throws Exception {
    	// Declaring the path of the Excel file with the name of the Excel file
//	@Test
//	public void Run() throws Exception {
    	String sPath = "C:\\Users\\kalpe\\eclipse-workspace\\KeywordDrivenFacebook\\Facebook.xlsx";

    	// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
    	ReadExcelFile.setExcelFile(sPath, "KeySheet");

    	//Hard coded values are used for Excel row & columns for now
    	//In later chapters we will replace these hard coded values with varibales
    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
    	for (int iRow=1;iRow<=9;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String sActionKeyword = ReadExcelFile.getCellData(iRow, 3);

    		//Comparing the value of Excel cell with all the project keywords
    		if(sActionKeyword.equals("openBrowser")){
                        //This will execute if the excel cell value is 'openBrowser'
    			//Action Keyword is called here to perform action
    			Keyword.openBrowser();}
    		else if(sActionKeyword.equals("navigateToURL")){
    			Keyword.navigateToURL();}
    		else if(sActionKeyword.equals("enterEmail")){
    			Keyword.enterEmail();}
    		else if(sActionKeyword.equals("enterPassword")){
    			Keyword.enterPassword();}
    		else if(sActionKeyword.equals("login")){
    			Keyword.login();}
    		else if(sActionKeyword.equals("closeBrowser")){
    			Keyword.closeBrowser();}

    		}
    	}
}
