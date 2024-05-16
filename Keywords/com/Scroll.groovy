package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Scroll {
	@Keyword(keywordObject='MobileCustomKeyword')
	def horizontalScroll(TestObject toGrid, TestObject toTraget){
		int x = Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y = Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth = Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newXWidth=xWidth/3

		int yHeight = Integer.parseInt(Mobile.getAttribute(toGrid, 'height', 10))
		int newYHeight =y+yHeight/3

		println("Value of X: "+x)
		println("Value of Y: "+x)
		println("Value of New X Width: "+newXWidth)
		println("Value of Y Height: "+newYHeight)

		for(int i=1;i=20;i++) {

			Mobile.swipe(newXWidth, newYHeight, 50, newYHeight)

			try {
				boolean isVisible = Mobile.verifyElementVisible(toTraget, 2)

				if (isVisible == true) {
					//Mobile.swipe(newXWidth, newYHeight, 50, newYHeight)
					println("Targeted Element found")
					break
				}
			}
			catch (Exception e) {
				println(e.message)
			}
		}
	}

	@Keyword(keywordObject='MobileCustomKeyword')
	def verticalScroll(TestObject toGrid, TestObject toTraget){
		int x = Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y = Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth = Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newXWidth = x + xWidth / 5

		int yHeight = Integer.parseInt(Mobile.getAttribute(toGrid, 'height', 10))
		int newYHeight = y + yHeight / 5

		println("Value of X: " + x)
		println("Value of Y: " + y)
		println("Value of New X Width: " + newXWidth)
		println("Value of Y Height: " + newYHeight)

		for(int i = 1; i <= 30; i++) {
			Mobile.swipe(newXWidth, newYHeight, newXWidth, 50)

			try {
				boolean isVisible = Mobile.verifyElementVisible(toTraget, 2)

				if (isVisible) {
					//Mobile.swipe(newXWidth, newYHeight, newXWidth, 50)
					Mobile.tap(toTraget, 0) // Tap the target element after it's found
					println("Targeted Element found")
					break
				}
			}
			catch (Exception e) {
				println(e.message)
			}
		}
	}

	@Keyword(keywordObject='MobileCustomKeyword')
	def verticalScrollUp(TestObject toGrid, TestObject toTarget) {
		int x = Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y = Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth = Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newXWidth = x + xWidth / 5

		int yHeight = Integer.parseInt(Mobile.getAttribute(toGrid, 'height', 10))
		int newYHeight = y + yHeight - 50 // Adjusting the newYHeight to scroll upwards

		println("Value of X: " + x)
		println("Value of Y: " + y)
		println("Value of New X Width: " + newXWidth)
		println("Value of Y Height: " + newYHeight)

		for (int i = 1; i <= 30; i++) {
			Mobile.swipe(newXWidth, y + 50, newXWidth, newYHeight) // Swiping upwards

			try {
				boolean isVisible = Mobile.verifyElementVisible(toTarget, 2)

				if (isVisible) {
					//Mobile.swipe(newXWidth, y + 50, newXWidth, newYHeight) // Optional: Swipe again to center the target element
					//Mobile.tap(toTarget, 0) // Tap the target element after it's found
					println("Targeted Element found")
					break
				}
			} catch (Exception e) {
				println(e.message)
			}
		}
	}

}
