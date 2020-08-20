package com.ruuvi.station.model.screen

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.ruuvi.station.R

object AddTagScreen : Screen<AddTagScreen>() {
    val tagsList = KView { withId( R.id.tag_listView) }
}