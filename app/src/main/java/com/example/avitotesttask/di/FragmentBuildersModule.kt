package com.example.avitotesttask.di


import com.example.avitotesttask.presentation.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
	@ContributesAndroidInjector
	abstract fun contributeMainFragment(): MainFragment
}