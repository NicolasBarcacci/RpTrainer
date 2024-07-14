package fr.meteordesign.features.learning._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.features.learning.navigation.LearningNavigator
import fr.meteordesign.features.learning.navigation.LearningNavigatorImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface LearningModule {

    @Binds
    fun bindsLearningNavigator(
        learningNavigatorImpl: LearningNavigatorImpl,
    ): LearningNavigator
}
