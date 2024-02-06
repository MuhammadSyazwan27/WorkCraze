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

WebUI.callTestCase(findTestCase('WC- 000 General/000_02 Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createProfile/a_Profile'))

WebUI.click(findTestObject('createProfile/a_Create Profile'))

WebUI.setText(findTestObject('createProfile/input_Name_first'), firstName)

WebUI.setText(findTestObject('createProfile/input_Name_last'), lastName)

WebUI.setText(findTestObject('createProfile/input_Email_email'), email)

WebUI.setText(findTestObject('createProfile/input_Mobile Number_mobile_number'), email)

WebUI.click(findTestObject('createProfile/mat-select_Country_country'))

WebUI.click(findTestObject('createProfile/span_Malaysia'))

WebUI.click(findTestObject('createProfile/mat-select_State'))

WebUI.click(findTestObject('createProfile/span_Kuala Lumpur'))

WebUI.click(findTestObject('createProfile/div_City'))

WebUI.click(findTestObject('createProfile/span_Kuala Lumpur - City'))

WebUI.setText(findTestObject('createProfile/input_Postcode_poscode'), postcode)

WebUI.click(findTestObject('createProfile/div_Nationality'))

WebUI.click(findTestObject('createProfile/span_Malaysian'))

WebUI.click(findTestObject('createProfile/div_permanenet_resident'))

WebUI.click(findTestObject('createProfile/span_Yes'))

WebUI.click(findTestObject('createProfile/label_Full Time'))

WebUI.click(findTestObject('createProfile/label_WFH'))

WebUI.setText(findTestObject('createProfile/textarea_Brief Introduction About Self_introduction'), briefIntro)

WebUI.setText(findTestObject('createProfile/input_Keyword Search_keyword_search'), keywordSearch)

WebUI.click(findTestObject('createProfile/button_Save'))

WebUI.verifyElementPresent(findTestObject('createProfile/div_Success  Candidate data updated successfully'), 0)
