package com.example.android.testing.espresso.BasicSample.Steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import com.example.android.testing.espresso.BasicSample.Data.Constants.DIFFERENTMOVIE
import com.example.android.testing.espresso.BasicSample.Data.Constants.FAVMOVIE
import com.example.android.testing.espresso.BasicSample.Data.Constants.MYFULLNAME
import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.Helper.tap
import com.example.android.testing.espresso.BasicSample.Helper.typeText
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage.activityChangeTextBtn
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage.changeTextButton
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage.firstPageHeader
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage.inputField
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage.printedText
import org.junit.Assert

object ChangeTextSteps {
    fun fillInputFieldWithName(){
        inputField.typeText(MYFULLNAME)
    }
    fun clickChangeText(){
        changeTextButton.tap()
    }
    fun fillInputFieldWithMovie(){
        inputField.typeText(FAVMOVIE)
    }
    fun checkIfTextChanged(){
        Assert.assertEquals(FAVMOVIE,firstPageHeader.getText())
    }
    fun deleteTextInField(){
        onView(inputField).perform(clearText())
    }
    fun checkIfEmpty(){
        Assert.assertEquals(inputField.getText(), "")
    }
    fun enterDifferentMovie(){
        inputField.typeText(DIFFERENTMOVIE)
    }
    fun clickOnActivityChangeTextButton(){
        activityChangeTextBtn.tap()
    }
    fun checkPrintedText(){
        Assert.assertEquals(DIFFERENTMOVIE, printedText.getText())
    }
}