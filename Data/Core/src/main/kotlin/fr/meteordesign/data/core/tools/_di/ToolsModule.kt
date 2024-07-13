package fr.meteordesign.data.core.tools._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.data.core.tools.RawFileReader
import fr.meteordesign.data.core.tools.RawFileReaderImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface ToolsModule {

    @Binds
    fun bindsRawFileReader(
        assetFileReaderImpl: RawFileReaderImpl,
    ): RawFileReader
}
