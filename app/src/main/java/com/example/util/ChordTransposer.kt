package com.example.util

object ChordTransposer {

    private val CHROMATIC_SHARPS = listOf("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B")
    private val CHROMATIC_FLATS = listOf("C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B")

    // Mapping for standardizing note names
    private val NOTE_INDEX_MAP = mapOf(
        "C" to 0, "B#" to 0,
        "C#" to 1, "DB" to 1, "Db" to 1,
        "D" to 2,
        "D#" to 3, "EB" to 3, "Eb" to 3,
        "E" to 4, "FB" to 4, "Fb" to 4,
        "F" to 5, "E#" to 5,
        "F#" to 6, "GB" to 6, "Gb" to 6,
        "G" to 7,
        "G#" to 8, "AB" to 8, "Ab" to 8,
        "A" to 9,
        "A#" to 10, "BB" to 10, "Bb" to 10,
        "B" to 11, "CB" to 11, "Cb" to 11,

        // Spanish notes mapping
        "DO" to 0,
        "DO#" to 1, "REB" to 1,
        "RE" to 2,
        "RE#" to 3, "MIB" to 3,
        "MI" to 4,
        "FA" to 5,
        "FA#" to 6, "SOLB" to 6,
        "SOL" to 7,
        "SOL#" to 8, "LAB" to 8,
        "LA" to 9,
        "LA#" to 10, "SIB" to 10,
        "SI" to 11
    )

    private val CHORD_REGEX = Regex("""(?i)\b(Do#?|Re#?|Mi#?|Fa#?|Sol#?|La#?|Si#?|Dob|Reb|Mib|Fab|Solb|Lab|Sib|[A-G](?:#|b)?)(m|maj|min|dim|aug|sus\d?|add\d?|\d+)?(?:/([A-G](?:#|b)?|Do#?|Re#?|Mi#?|Fa#?|Sol#?|La#?|Si#?))?""")

    /**
     * Transposes a full line of chords (e.g. "D – G - A7 - Bm") by semitones.
     */
    fun transposeChordLine(chordLine: String, semitones: Int, preferFlats: Boolean = false): String {
        if (semitones % 12 == 0 || chordLine.isBlank()) return chordLine

        val effectiveSemitones = ((semitones % 12) + 12) % 12

        return CHORD_REGEX.replace(chordLine) { matchResult ->
            val root = matchResult.groupValues[1]
            val modifier = matchResult.groupValues[2]
            val bass = matchResult.groupValues[3]

            val transposedRoot = transposeSingleNote(root, effectiveSemitones, preferFlats)
            val transposedBass = if (bass.isNotEmpty()) {
                "/" + transposeSingleNote(bass, effectiveSemitones, preferFlats)
            } else ""

            "$transposedRoot$modifier$transposedBass"
        }
    }

    /**
     * Transposes a single root note like "F#", "Bb", "Sol" by semitone offset.
     */
    fun transposeSingleNote(note: String, semitones: Int, preferFlats: Boolean = false): String {
        val normalized = note.trim()
        val index = NOTE_INDEX_MAP[normalized.uppercase()] ?: return note
        val newIndex = (index + semitones + 12) % 12

        val scale = if (preferFlats || normalized.contains("b", ignoreCase = true)) {
            CHROMATIC_FLATS
        } else {
            CHROMATIC_SHARPS
        }
        return scale[newIndex]
    }

    /**
     * Calculate semitone distance from original key to target key.
     */
    fun getSemitoneDistance(fromKey: String, toKey: String): Int {
        val fromIndex = NOTE_INDEX_MAP[fromKey.trim().uppercase()] ?: 0
        val toIndex = NOTE_INDEX_MAP[toKey.trim().uppercase()] ?: 0
        return ((toIndex - fromIndex + 12) % 12)
    }

    /**
     * Common keys for transposition selector
     */
    val AVAILABLE_KEYS = listOf("C", "C#", "D", "Eb", "E", "F", "F#", "G", "Ab", "A", "Bb", "B")

    /**
     * Chord fingering representations for guitar / ukulele helper
     */
    fun getGuitarFingering(chord: String): String {
        val base = chord.replace(Regex("""/.*"""), "").trim()
        return when (base) {
            "C" -> "x-3-2-0-1-0"
            "C7" -> "x-3-2-3-1-0"
            "Cm" -> "x-3-5-5-4-3"
            "D" -> "x-x-0-2-3-2"
            "D7" -> "x-x-0-2-1-2"
            "Dm" -> "x-x-0-2-3-1"
            "E" -> "0-2-2-1-0-0"
            "E7" -> "0-2-0-1-0-0"
            "Em" -> "0-2-2-0-0-0"
            "F" -> "1-3-3-2-1-1"
            "F7" -> "1-3-1-2-1-1"
            "Fm" -> "1-3-3-1-1-1"
            "F#m", "Gbm" -> "2-4-4-2-2-2"
            "G" -> "3-2-0-0-0-3"
            "G7" -> "3-2-0-0-0-1"
            "Gm" -> "3-5-5-3-3-3"
            "Gm7" -> "3-5-3-3-3-3"
            "A" -> "x-0-2-2-2-0"
            "A7" -> "x-0-2-0-2-0"
            "Am" -> "x-0-2-2-1-0"
            "Am7" -> "x-0-2-0-1-0"
            "B" -> "x-2-4-4-4-2"
            "B7" -> "x-2-1-2-0-2"
            "Bm" -> "x-2-4-4-3-2"
            "Bb" -> "x-1-3-3-3-1"
            "Bbm" -> "x-1-3-3-2-1"
            else -> "Acorde: $chord"
        }
    }
}
