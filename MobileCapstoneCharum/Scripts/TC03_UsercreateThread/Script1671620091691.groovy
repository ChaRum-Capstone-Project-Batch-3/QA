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

Mobile.startApplication('C:\\Users\\shida\\Downloads\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Username  Email'), 0)

Mobile.setText(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Username  EmailUsername  Email'), 
    'mobiletesting@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Password'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - PasswordPassword'), 
    'mrBegcMWHNUPJ3RVAwNp6g==', 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Add an interesting title'), 
    0)

Mobile.setText(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Add an interesting title (1)'), 
    'Prospek gaji programmer tahun 3000, Bikin kamu joget', 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Write something'), 0)

Mobile.setText(findTestObject('Object Repository/TC03_UserCreateThread/android.widget.EditText - Write something (1)'), 
    'Gua pengen udahan ', 0)

Mobile.tap(findTestObject('Object Repository/TC03_UserCreateThread/android.view.View'), 0)

Mobile.closeApplication()
