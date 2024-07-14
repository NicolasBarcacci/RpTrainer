package fr.meteordesign.designSystem.organims.navigationBars

import fr.meteordesign.designSystem.atoms.images.RptImage

data class RptNavigationBarUiModel(
    val itemList: List<Item>,
    val selectedIndex: Int,
) {
    data class Item(
        val image: RptImage,
        val contentDescription: String,
        val label: String,
    )
}
