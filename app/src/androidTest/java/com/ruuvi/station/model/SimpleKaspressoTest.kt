package com.ruuvi.station.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.ruuvi.station.R
import com.ruuvi.station.feature.AddTagActivity
import com.ruuvi.station.model.screen.TagDetailsScreen
import com.ruuvi.station.tagdetails.ui.TagDetailsActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SimpleKaspressoTest: TestCase() {

    @get:Rule
    val activityTestRule = ActivityTestRule(TagDetailsActivity::class.java, true, false)

    @get:Rule
    val addTagTestRule = ActivityTestRule(AddTagActivity::class.java, true, false)

    @Test
    fun goodKaspressoTest() {
        before {
            activityTestRule.launchActivity(null)
            /**
             * Some action to prepare the state
             */
        }.after {
            /**
             * Some action to revert the state
             */
        }.run {
            step("Open Simple screen") {
                TagDetailsScreen {
                    title.hasText("")//R.string.press_to_add)
                }
            }
        }
    }

    @Test
    fun goodKaspressoTest2() {
        before {
            addTagTestRule.launchActivity(null)
            /**
             * Some action to prepare the state
             */
        }.after {
            /**
             * Some action to revert the state
             */
        }.run {
            step("Open Simple screen") {
                TagDetailsScreen {
                    title.hasText(R.string.press_to_add)
                }
            }
        }
    }

}