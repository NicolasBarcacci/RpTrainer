package fr.meteordesign.pratik.tools._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.pratik.tools.RawFileReader
import fr.meteordesign.pratik.tools.RawFileReaderImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface ToolsModule {

    @Binds
    fun bindsRawFileReader(
        assetFileReaderImpl: RawFileReaderImpl,
    ): RawFileReader
}
