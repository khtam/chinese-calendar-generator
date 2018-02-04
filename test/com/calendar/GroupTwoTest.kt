package com.calendar

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class GroupTwoTest {
    @Test
    fun shouldReturnExpectedSymbol() {
        assertThat(GroupTwo.ONE.symbol).isEqualTo("子");
        assertThat(GroupTwo.TWO.symbol).isEqualTo("丑");
        assertThat(GroupTwo.THREE.symbol).isEqualTo("寅");
        assertThat(GroupTwo.FOUR.symbol).isEqualTo("卯");
        assertThat(GroupTwo.FIVE.symbol).isEqualTo("辰");
        assertThat(GroupTwo.SIX.symbol).isEqualTo("巳");
        assertThat(GroupTwo.SEVEN.symbol).isEqualTo("午");
        assertThat(GroupTwo.EIGHT.symbol).isEqualTo("未");
        assertThat(GroupTwo.NINE.symbol).isEqualTo("申");
        assertThat(GroupTwo.TEN.symbol).isEqualTo("酉");
        assertThat(GroupTwo.ELEVEN.symbol).isEqualTo("戌");
        assertThat(GroupTwo.TWELVE.symbol).isEqualTo("亥");
    }
}