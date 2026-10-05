package com.example.data.model

data class HymnLine(
    val lyrics: String,
    val chords: String = ""
)

data class HymnSection(
    val type: SectionType, // VERSE, CHORUS, OUTRO
    val sectionNumber: Int? = null,
    val lines: List<HymnLine>
)

enum class SectionType {
    VERSE,
    CHORUS,
    OUTRO
}

data class Hymn(
    val id: Int,
    val number: Int,
    val title: String,
    val crossRef: String = "",
    val originalKey: String = "C",
    val sections: List<HymnSection>,
    val category: String = "Alabanza y Adoración",
    val tags: List<String> = emptyList()
) {
    fun fullSearchableText(): String {
        val builder = StringBuilder()
        builder.append("$number $title $crossRef $category ")
        sections.forEach { section ->
            section.lines.forEach { line ->
                builder.append("${line.lyrics} ${line.chords} ")
            }
        }
        return builder.toString()
    }
}
