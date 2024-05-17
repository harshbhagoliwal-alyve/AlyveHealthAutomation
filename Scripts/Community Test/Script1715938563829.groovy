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

WebUI.openBrowser('https://alyve-web-v2-uat.vercel.app/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Get Started/button_Sign in'))

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Get Started/button_Sign in with mobile'))

WebUI.setText(findTestObject('Verify Login/Page_Alyve Health - Get Started/input_Back_form-control'), '7905079227')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Get Started/button_Get OTP on mobile'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Verify Login/Page_Alyve Health - Get Started/input_password'), '123456')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/button_Got it'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_Home'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_All Programs'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_Challenges'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_Dashboard'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_Insights'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_My Purchases'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_Rewards'))

WebUI.verifyElementVisible(findTestObject('Verify Login/Page_Alyve Health - Home/p_To Do'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/Dashboard.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/Page_Alyve Health - Home/p_All Programs'))

WebUI.verifyElementText(findTestObject('Alyve_objects/Page_Alyve Health - All Programs/p_Cashless - Alyve Health'), 'Cashless - Alyve Health')

WebUI.delay(2)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/All_Programs.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/p_My Purchases'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/My_Purchases.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/p_Insights'))

WebUI.delay(3)

WebUI.click(findTestObject('Alyve_objects/Page_Alyve Health - Insights/svg_Apply_MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1m6kt38'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/Insights.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/p_Challenges'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/Challenges.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/p_Rewards'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/Rewards.png')

WebUI.click(findTestObject('Verify Login/Page_Alyve Health - Home/p_To Do'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Screenshots/ToDo.png')

WebUI.closeBrowser()

