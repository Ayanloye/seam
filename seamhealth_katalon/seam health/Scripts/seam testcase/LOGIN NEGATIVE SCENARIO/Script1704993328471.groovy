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

//VERIFY THAT USER CANNOT LOGIN SUCCESFFULLY USING WRONG EMAIL
//open browswer
'navigate to the URL : http://patient-satisfaction.seamhealth.support'
WebUI.openBrowser('http://patient-satisfaction.seamhealth.support')

//Enter Email Addresss
'Enter Invalid email'
WebUI.setText(findTestObject('Page_ClientShot/input_Enter your details to continue_signin-email'), 'xerelax128@roborena.com')

//Enter password
'Enter Password'
WebUI.setText(findTestObject('Page_ClientShot/input_Enter your details to continue_password'), 'password')

//Click login
'Click login'
WebUI.click(findTestObject('Page_ClientShot/button_Login'))

