package fr.meteordesign.features.ipaChart._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.features.core.navigation.IpaChartNavigator
import fr.meteordesign.features.ipaChart.navigation.IpaChartNavigatorImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface IpaChartModule {

    @Binds
    fun binds(
        ipaChartNavigatorImpl: IpaChartNavigatorImpl,
    ): IpaChartNavigator
}
