package fr.meteordesign.designSystem.organims.wordOfTheDay

import fr.meteordesign.designSystem.atoms.strings.RptString

data class WordOfTheDayUiModel(
    val writing: RptString,
    val wordClassList: List<WordClass>,
) {

    data class WordClass(
        val label: RptString,
        val ipaWriting: IpaWriting,
    ) {

        sealed class IpaWriting(
            open val strongForm: RptString,
        ) {

            data class Strong(
                override val strongForm: RptString,
            ) : IpaWriting(strongForm)

            data class WeakStrong(
                override val strongForm: RptString,
                val weakFormList: List<RptString>,
            ) : IpaWriting(strongForm)
        }
    }
}
