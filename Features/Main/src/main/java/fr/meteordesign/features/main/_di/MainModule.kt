package fr.meteordesign.features.main._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.features.core.navigation.MainNavigator
import fr.meteordesign.features.main.navigation.MainNavigatorImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface MainModule {

    @Binds
    fun bindsMainNavigator(
        mainNavigatorImpl: MainNavigatorImpl,
    ): MainNavigator
}
