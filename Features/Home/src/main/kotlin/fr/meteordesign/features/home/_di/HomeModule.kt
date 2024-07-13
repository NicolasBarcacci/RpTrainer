package fr.meteordesign.features.home._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.features.home.navigation.HomeNavigator
import fr.meteordesign.features.home.navigation.HomeNavigatorImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface HomeModule {

    @Binds
    fun bindsHomeNavigator(
        homeNavigatorImpl: HomeNavigatorImpl,
    ): HomeNavigator
}
