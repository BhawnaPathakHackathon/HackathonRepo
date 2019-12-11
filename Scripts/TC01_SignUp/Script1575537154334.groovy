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

import common.util.xorkeyword
import internal.GlobalVariable as GlobalVariable

try {
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl(GlobalVariable.url)
	
	WebUI.maximizeWindow()
	
	WebUI.verifyTextPresent("PHPTRAVELS", false)
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/a_Sign Up'))
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_Register/input_First Name_firstname'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Register/input_First Name_firstname'), 'Bhawna')
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_Register/input_Last Name_lastname'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Register/input_Last Name_lastname'), 'Pathak')
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_Register/input_Mobile Number_phone'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Register/input_Mobile Number_phone'), '123456')
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_Register/input_Email_email'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'abc@gmail.com')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_password'), 'mdnvewzpQvY=')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_confirmpassword'), 'mdnvewzpQvY=')
	
	xorkeyword.xorClick(findTestObject('Object Repository/Page_Register/button_Sign Up'))
	
} catch (Exception e) {
	e.printStackTrace()
}

finally{
	WebUI.closeBrowser(FailureHandling.OPTIONAL)
}
	

