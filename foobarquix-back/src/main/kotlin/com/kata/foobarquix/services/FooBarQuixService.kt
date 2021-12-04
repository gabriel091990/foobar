package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import java.lang.Character.getNumericValue
import java.util.stream.Collectors.joining


@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        return toFooBarQuix(inputNumber)
    }

    fun toFooBarQuix(numberToFooBar: Int): String {
        val foobar = fooBarQuix()
        var result = contains(numberToFooBar, foobar)
        val toFooBar = numberToFooBar.toString()
        result += contains(foobar, toFooBar)
        return result.ifEmpty { toFooBar }
    }

    private fun contains(foobar: Map<Int, String>, toFooBar: String): String {
        return toFooBar.chars()
            .mapToObj { integerAsChar: Int ->
                foobar[getNumericValue(
                    integerAsChar
                )] ?: ""
            }
            .collect(joining())
    }

    private fun contains(numberToFooBar: Int, foobar: Map<Int, String>): String {
        return foobar.keys.stream()
            .filter { toReplace: Int -> numberToFooBar % toReplace == 0 }
            .map { key: Int -> foobar[key] }
            .collect(joining())
    }

    private fun fooBarQuix(): Map<Int, String> {
        val foobar: MutableMap<Int, String> = HashMap()
        foobar[3] = "Foo"
        foobar[5] = "Bar"
        foobar[7] = "Quix"
        return foobar
    }
}