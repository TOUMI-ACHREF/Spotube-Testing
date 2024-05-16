import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('oss.krtirtho.spotube')

Mobile.tap(findTestObject('Object Repository/Download/android.view.SearchButton'), 0)

Mobile.tap(findTestObject('Object Repository/Download/android.widget.SearchArea'), 0)

Mobile.setText(findTestObject('Object Repository/Download/android.widget.SearchArea'), 'Easy on me\\n', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Download/android.view.Song'), 0)

Mobile.tap(findTestObject('Object Repository/Download/android.widget.Options'), 0)

CustomKeywords.'com.Scroll.verticalScroll'(findTestObject('Object Repository/Download/android.widget.ScrollView'),
	findTestObject('Object Repository/Download/android.view.DownloadButton'))

//Mobile.tap(findTestObject('Object Repository/Download/android.view.DownloadButton'), 0)

Mobile.closeApplication()

