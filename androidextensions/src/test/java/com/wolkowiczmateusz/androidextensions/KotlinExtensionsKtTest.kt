package com.wolkowiczmateusz.androidextensions

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class KotlinExtensionsKtTest {

    @Test
    fun `only extension function should return false if not all elements match a definition`() {
        val list = listOf("OK", "NieOK")
        assertThat(list.only { it == "OK" }).isFalse()
    }

    @Test
    fun `only extension function should return true if all elements match a definition`() {
        val list = listOf("OK", "OK")
        assertThat(list.only { it == "OK" }).isTrue()
    }

    @Test
    fun `only extension function should return false if list is not empty but elements not match a definition`() {
        val list = listOf("NieOK")
        assertThat(list.only { it == "OK" }).isFalse()
    }

    @Test
    fun `only extension function should return false if list is empty`() {
        val list = listOf<String>()
        assertThat(list.only { it == "OK" }).isFalse()
    }

    @Test
    fun `standard Kotlin all extension function for empty list will return true`() {
        val list = listOf<String>()
        assertThat(list.all { it == "OK" }).isTrue()
    }
}