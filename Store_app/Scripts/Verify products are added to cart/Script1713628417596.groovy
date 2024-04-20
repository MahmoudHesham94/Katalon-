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

Mobile.startApplication('C:\\Users\\Mahmoud\\Desktop\\General-Store.apk', true)

Mobile.tap(findTestObject('Object Repository/Start page/Country selection List'), 0)

Mobile.tap(findTestObject('Start page/Selected country'), 0)

Mobile.setText(findTestObject('Object Repository/Start page/Name text field'), 'Mahmoud', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Start page/Male radio button'), 0)

Mobile.tap(findTestObject('Start page/Lets Shop button'), 0)

Mobile.tap(findTestObject('Products page/ADD TO CART item 1'), 0)

Mobile.tap(findTestObject('Products page/ADD TO CART item 2'), 0)

Mobile.tap(findTestObject('Products page/Cart button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

assert Mobile.verifyElementVisible(findTestObject('Object Repository/Products page/Item 2'), 3)

assert Mobile.verifyElementVisible(findTestObject('Object Repository/Products page/Item 1'), 3)

