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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))
WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_My Account (1)'))
WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_My Account (2)'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_First Name_firstname'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_First Name_firstname'), 'Bhawna')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Last Name_lastname'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Last Name_lastname'), 'Pathak')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Mobile Number_phone'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Mobile Number_phone'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'abc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_password'), 'mdnvewzpQvY=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_confirmpassword'), 'mdnvewzpQvY=')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Sign Up'))

