package HomeMeta.PageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomeMeta.TestComponents.BaseTest;

public class AddMailingListImportFile extends BaseTest {

//	@Test(dataProvider = "getData")
//	public void AddMailingListTest(HashMap<String, String> input) throws InterruptedException {
//		String nameMailingList1 = "Auto Import Mailing List 1";
//		landingPage.login(input.get("email"), input.get("password"));
//		landingPage.addMailingListImportFile(nameMailingList1);
//		landingPage.VerifyNameMailingList(nameMailingList1);
//		System.out.println("Import Mailing List Success");
//
//	}

	@Test(dataProvider = "getData")
	public void AddMailingListDuplicatedTest(HashMap<String, String> input) throws InterruptedException {
		String nameMailingList1 = "Auto Import Mailing List Duplicated2";
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.addMailingListImportFileDuplicate(nameMailingList1);
		landingPage.VerifyNameMailingList(nameMailingList1);
		System.out.println("Import Mailing List Duplicated Success");

	}

	@Test(dataProvider = "getData")
	public void AddMailingListIncorrectFormat(HashMap<String, String> input) throws InterruptedException {
		landingPage.login(input.get("email"), input.get("password"));
		landingPage.addMailingListIncorrectFormat();
		System.out.println("Import Mailing List Incorrect Format Success");

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/main/java/HomeMeta/data/DataLogin.json");
		return new Object[][] { { data.get(0) } };
	}
}
