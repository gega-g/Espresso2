package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Steps.ChangeTextSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun fillFirstPageField() {
        with(ChangeTextSteps){
            fillInputFieldWithName()
            clickChangeText()
        }
    }
    @Test
    fun fillFirstPageFieldAndTestFilledInfo() {
        with(ChangeTextSteps){
            fillInputFieldWithMovie()
            clickChangeText()
            checkIfTextChanged()
            deleteTextInField()
            checkIfEmpty()
            enterDifferentMovie()
            clickOnActivityChangeTextButton()
            checkPrintedText()
        }
    }
}