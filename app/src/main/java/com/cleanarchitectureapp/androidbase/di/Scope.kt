package com.cleanarchitectureapp.androidbase.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class JsonPlaceHolderSite(
)

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class StackOverFlowSite()