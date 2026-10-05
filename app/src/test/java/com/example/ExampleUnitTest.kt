package com.example

import com.example.data.repository.HymnalRepository
import com.example.util.ChordTransposer
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun testTransposeSingleNote() {
        assertEquals("D", ChordTransposer.transposeSingleNote("C", 2))
        assertEquals("G", ChordTransposer.transposeSingleNote("F", 2))
        assertEquals("F#", ChordTransposer.transposeSingleNote("E", 2))
        assertEquals("A", ChordTransposer.transposeSingleNote("G", 2))
    }

    @Test
    fun testTransposeChordLine() {
        val original = "C – G - C"
        val transposed = ChordTransposer.transposeChordLine(original, 2)
        assertEquals("D – A - D", transposed)

        val originalMinor = "Dm – A – Dm - A"
        val transposedMinor = ChordTransposer.transposeChordLine(originalMinor, 2)
        assertEquals("Em – B – Em - B", transposedMinor)

        val slashChord = "Bb/F - F7"
        val transposedSlash = ChordTransposer.transposeChordLine(slashChord, 2)
        assertEquals("C/G - G7", transposedSlash)
    }

    @Test
    fun testHymnalSearchAndData() {
        val hymns = HymnalRepository.getAllHymns()
        assertTrue(hymns.isNotEmpty())

        val hymn3 = HymnalRepository.getHymnByNumber(3)
        assertNotNull(hymn3)
        assertEquals("Ja’ xa sc’ac’alil ta jcuxtic", hymn3?.title)

        val searchResult = HymnalRepository.searchHymns("Belen")
        assertTrue(searchResult.any { it.number == 17 })

        val numberSearch = HymnalRepository.searchHymns("400")
        assertTrue(numberSearch.any { it.number == 400 })
    }
}
