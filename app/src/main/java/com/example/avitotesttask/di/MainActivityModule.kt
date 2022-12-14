package com.example.avitotesttask.di

import com.example.avitotesttask.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivityModule {
	@ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
	abstract fun contributeMainActivity(): MainActivity
}