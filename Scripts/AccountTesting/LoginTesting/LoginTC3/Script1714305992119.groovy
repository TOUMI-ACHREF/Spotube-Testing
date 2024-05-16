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

Mobile.tap(findTestObject('Object Repository/Login1Folder/android.widget.Account'), 0)

Mobile.tap(findTestObject('Object Repository/Login1Folder/android.widget.EditProfile'), 0)

Mobile.setText(findTestObject('Object Repository/Login1Folder/android.widget.LoginText'), 'projet', 0)

Mobile.tap(findTestObject('Object Repository/Login1Folder/android.widget.Button - show password'), 0)

Mobile.setText(findTestObject('Object Repository/Login1Folder/android.widget.Password'), 'projet2024', 0)

Mobile.tap(findTestObject('Object Repository/Login1Folder/android.widget.CheckBox - Remember me'), 0)

CustomKeywords.'com.Scroll.verticalScroll'(findTestObject("Object Repository/Login1Folder/android.view.Group"),findTestObject("Object Repository/Login1Folder/android.widget.Button - Log In"))

Mobile.tap(findTestObject('Object Repository/Login1Folder/android.widget.Button - Log In'), 0)

CustomKeywords.'com.Scroll.verticalScrollUp'(findTestObject("Object Repository/Login1Folder/android.view.Group"),findTestObject("Object Repository/Login1Folder/android.widget.Image - Spotify"))

Mobile.closeApplication()