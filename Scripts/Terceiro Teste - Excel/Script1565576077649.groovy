import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://github.com/login', FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), Username)
WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), findTestData("LoginsData").getValue(1, 1))

//WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), Password)
WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), findTestData("LoginsData").getValue(2, 1))

