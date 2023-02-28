package ru.lpost.retrofittest.di

import dagger.Component
import ru.lpost.retrofittest.presentation.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DataModule::class, DomainModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}