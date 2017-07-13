package com.carto.advanced.kotlin.sections.routedownload

import android.content.Context
import com.carto.advanced.kotlin.model.Texts
import com.carto.advanced.kotlin.sections.base.DownloadBaseView
import com.carto.layers.CartoBaseMapStyle

/**
 * Created by aareundo on 03/07/2017.
 */
class RouteDownloadView(context: Context) : DownloadBaseView(context) {

    init {

        title = Texts.routeDownloadInfoHeader
        description = Texts.routeDownloadInfoContainer

        addBaseLayer(CartoBaseMapStyle.CARTO_BASEMAP_STYLE_DEFAULT)

        layoutSubviews()
    }

    override fun layoutSubviews() {
        super.layoutSubviews()
    }
}