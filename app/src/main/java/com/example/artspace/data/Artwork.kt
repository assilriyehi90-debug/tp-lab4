package com.example.artspace.data

import androidx.annotation.DrawableRes
import com.example.artspace.R

data class Artwork(
    val id: Int,
    @DrawableRes val imageRes: Int,
    val title: String,
    val artist: String,
    val year: String,
    val contentDescription: String
)

val artworks = listOf(
    Artwork(
        id = 1,
        imageRes = R.drawable.artwork_horizon,
        title = "Horizon de cuivre",
        artist = "Lina Morel",
        year = "2021",
        contentDescription = "Paysage original : soleil pâle au-dessus de collines cuivrées."
    ),
    Artwork(
        id = 2,
        imageRes = R.drawable.artwork_jardin,
        title = "Jardin nocturne",
        artist = "Elias Benali",
        year = "2019",
        contentDescription = "Composition originale : cyprès lumineux sous une lune turquoise."
    ),
    Artwork(
        id = 3,
        imageRes = R.drawable.artwork_geometrie,
        title = "Géométrie douce",
        artist = "Nora Petit",
        year = "2023",
        contentDescription = "Abstraction originale de rectangles colorés."
    ),
    Artwork(
        id = 4,
        imageRes = R.drawable.artwork_maree,
        title = "Marée indigo",
        artist = "Samir Costa",
        year = "2020",
        contentDescription = "Vagues empilées originales, du bleu profond au blanc écume."
    ),
    Artwork(
        id = 5,
        imageRes = R.drawable.artwork_atelier,
        title = "Lumière d'atelier",
        artist = "Camille Roux",
        year = "2022",
        contentDescription = "Nature morte originale : toiles encadrées et table de peintre."
    )
)
