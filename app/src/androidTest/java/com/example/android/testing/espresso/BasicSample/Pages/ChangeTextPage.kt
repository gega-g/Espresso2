package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ChangeTextPage {
    val inputField: Matcher<View> by lazy { withId(R.id.editTextUserInput) }
    val changeTextButton: Matcher<View> by lazy { withId(R.id.changeTextBt) }
    val firstPageHeader: Matcher<View> by lazy { withId(R.id.textToBeChanged) }
    val activityChangeTextBtn: Matcher<View> by lazy { withId(R.id.activityChangeTextBtn) }
    val printedText: Matcher<View> by lazy { withId(R.id.show_text_view) }
}