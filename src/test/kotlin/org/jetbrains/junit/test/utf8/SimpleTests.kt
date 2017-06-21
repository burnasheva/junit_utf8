package org.jetbrains.junit.test.utf8

import org.junit.Test
import kotlin.test.assertEquals

class SimpleTests {
    @Test
    fun firstTest(){
        assertEquals("Grüß Gott", "Grüß Gott")
    }
}