package com.example.stringviewmodel

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

open class StringFragment : Fragment() {

    /**
     * Siz viewModel.text ga ediTextdan kelgan ma'lumotni berasiz
     * viewModel.getLiveData methodi esa sizga o'sha ma'lumotni qaytarib beradi.
     * ekran aylangan holatda ham ma'lumot o'chib ketmaydi, to activity o'lmaguncha
     * omad :)
     *
     * */


    lateinit var viewModel: StringViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(context as Application).create(StringViewModel::class.java)
    }



}

/**git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Abdurashid89/StringDataViewModul.git
git push -u origin main*/