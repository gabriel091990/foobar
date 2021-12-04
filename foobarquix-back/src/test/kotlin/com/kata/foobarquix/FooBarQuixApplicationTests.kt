package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun listoffoobarquix() {
		val fooBarQuix = FooBarQuixService()
		println("Test des 100 premiers nombres")
		for (i in 1..100) {
			println(fooBarQuix.toFooBarQuix(i))
		}
	}
}
