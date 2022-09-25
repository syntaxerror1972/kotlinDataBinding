package com.syntaxerror.kotlindatabinding.ui
/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : kotlinDataBinding.
 * Package Id : com.syntaxerror.kotlindatabinding.data
 * Created By :  Shrawan Shinde
 * Created Date :  25,September,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/kotlinDataBinding
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.syntaxerror.kotlindatabinding.R
import com.syntaxerror.kotlindatabinding.data.User
import com.syntaxerror.kotlindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val userObj = User("Shrawan Shinde","syntaxerror1972@gmail.com", "9167187654","Kolhapur")
        binding.user = userObj
    }
}