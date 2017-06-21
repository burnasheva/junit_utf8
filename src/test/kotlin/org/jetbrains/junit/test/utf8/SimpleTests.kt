package org.jetbrains.junit.test.utf8

import org.junit.Test
import kotlin.test.assertEquals

class SimpleTests {
    @Test
    fun firstTest(){
        var grüß = "some string öü"
        println(grüß)
        println("##teamcity[buildStatus text='Let rock reign!']")
        assertEquals("Grüß Gott", "Grüß Gott!", grüß)
    }
}