package com.codeteenager.materialdesigndemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var btnShowSnackbar: Button? = null
    private var root: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowSnackbar = findViewById(R.id.btn_show_snackbar) as Button
        root = findViewById(R.id.root) as ConstraintLayout
        btnShowSnackbar!!.setOnClickListener { Snackbar.make(root!!, "提示信息", Snackbar.LENGTH_SHORT).setAction("按钮") { }.setActionTextColor(resources.getColor(R.color.colorAccent)).show() }
    }
}
