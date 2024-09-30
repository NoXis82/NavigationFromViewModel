package com.noxis.navigationfromviewmodel.di

import com.noxis.navigationfromviewmodel.DefaultNavigator
import com.noxis.navigationfromviewmodel.Destination
import com.noxis.navigationfromviewmodel.DetailViewModel
import com.noxis.navigationfromviewmodel.HomeViewModel
import com.noxis.navigationfromviewmodel.LoginViewModel
import com.noxis.navigationfromviewmodel.Navigator
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single<Navigator> {
        DefaultNavigator(startDestination = Destination.AuthGraph)
    }

    viewModelOf(::LoginViewModel)
    viewModelOf(::HomeViewModel)
    viewModelOf(::DetailViewModel)
}