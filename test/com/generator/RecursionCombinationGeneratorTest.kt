package com.generator

import org.junit.Test

class RecursionCombinationGeneratorTest : AbstractCombinationGeneratorTest(){

    @Test
    fun recursionCombinationGeneratorShouldReturnExpected() {
        verifyGenerator(RecursionCombinationGenerator());
    }
}