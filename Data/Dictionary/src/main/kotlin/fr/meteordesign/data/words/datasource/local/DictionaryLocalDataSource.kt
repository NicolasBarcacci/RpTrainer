package fr.meteordesign.data.words.datasource.local

import fr.meteordesign.data.words.datasource.local.model.DictionaryLocalRepoModel
import fr.meteordesign.domain.external.common.Result

internal interface DictionaryLocalDataSource {
    fun getDictionary(): Result<DictionaryLocalRepoModel, Unit>
}
