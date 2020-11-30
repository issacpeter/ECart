package com.ecart.ui.product_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecart.R
import com.ecart.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar_products.*

class ProductListActivity : BaseActivity() {
    override val layoutId: Int
        get() = R.layout.activity_product_list


    override val setToolbar: Boolean
        get() = false
    override val hideStatusBar: Boolean
        get() = false


    override fun initData() {

    }

    override fun fragmentLaunch() {

    }

    override fun setupUI() {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setDisplayShowHomeEnabled(false)
        tvToolbarTitle.text = "U.S. POLO ASSN"
    }

    override fun setupViewModel() {

    }

    override fun setupObserver() {

    }

    override fun onClicks() {

    }


}