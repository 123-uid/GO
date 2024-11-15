package com.example.go1.base

import androidx.lifecycle.ViewModel

abstract  class BaseViewModel<Repo : BaseRepo>: ViewModel() {


    protected val repo: Repo by lazy { createRepo() }


    abstract fun createRepo(): Repo
}