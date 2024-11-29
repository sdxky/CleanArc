package com.example.cleanArc.presentation.di

import com.example.cleanArc.presentation.fragments.TaskViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val uiModule: Module = module {

    factory { TaskViewModel(get(), get(), get(), get(), get()) }
}