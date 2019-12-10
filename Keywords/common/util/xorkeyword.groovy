package common.util

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import java.util.concurrent.TimeUnit
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.internal.Invoker.FailureContext

import com.google.common.base.Predicate

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.exception.StepErrorException

import junit.framework.AssertionFailedError
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.RemoteWebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.support.ui.ExpectedConditions

import org.openqa.selenium.Keys as Keys

public class xorkeyword {
	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	static def xorClick(TestObject to ) {
		WebElement element = null;
		try {
			TestObject parentObject = to.getParentObject()
			WebUiBuiltInKeywords.waitForElementClickable(to, 200)
			WebUiBuiltInKeywords.scrollToElement(to, 200)
			WebUiBuiltInKeywords.waitForElementVisible(to,200)
			if(parentObject) {
				switchIframe(parentObject)
			}
			element = WebUiBuiltInKeywords.findWebElement(to);

			KeywordUtil.logInfo("Clicking element")
			WebUiBuiltInKeywords.click(to)
			if(parentObject){
				switchToDefaultFrame()
			}

			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			String message = "Element not found :" + to.toString() + "\n"
			String testElement = "Test Element : " +  element.toString() + "\n\n"
			String stacktrace = "Stack Trace : " + e.toString() + "\n\n"
			KeywordUtil.markFailedAndStop(message + testElement + stacktrace)
		} catch (Exception e) {
			String message = "Fail to click on Object : " + to.toString() + "\n"
			String testElement = "Test Element : " +  element.toString() + "\n\n"
			String stacktrace = "Stack Trace : " + e.toString() + "\n\n"
			KeywordUtil.markFailedAndStop(message + testElement + stacktrace)
		}
	}

	/**
	 * Switch to Parent Frame
	 */
	@Keyword
	static def switchIframe(TestObject to) {
		WebDriver driver = DriverFactory.getWebDriver();
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		driver.switchTo().frame(element);
	}


	/**
	 * Switch to Default Frame
	 */
	@Keyword
	static def switchToDefaultFrame() {
		WebDriver driver = DriverFactory.getWebDriver();
		driver.switchTo().defaultContent();
	}
}
