package com.ruuvi.station.model.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.ruuvi.station.R

object TagDetailsScreen : Screen<TagDetailsScreen>() {
    val title = KTextView { withId( R.id.noTags_textView) }
}