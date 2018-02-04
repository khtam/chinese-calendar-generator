package com.generator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class LoopingCombinationGeneratorTest : AbstractCombinationGeneratorTest() {

    @Test
    fun loopingCombinationGeneratorShouldReturnExpected() {
        verifyGenerator(LoopingCombinationGenerator());
    }
}