package com.calendar

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class GroupOneTest {

    @Test
    fun shouldReturnExpectedSymbol(){
        assertThat(GroupOne.ELEMENT_A.symbol).isEqualTo("甲");
        assertThat(GroupOne.ELEMENT_B.symbol).isEqualTo("乙");
        assertThat(GroupOne.ELEMENT_C.symbol).isEqualTo("丙");
        assertThat(GroupOne.ELEMENT_D.symbol).isEqualTo("丁");
        assertThat(GroupOne.ELEMENT_E.symbol).isEqualTo("戊");
        assertThat(GroupOne.ELEMENT_F.symbol).isEqualTo("己");
        assertThat(GroupOne.ELEMENT_G.symbol).isEqualTo("庚");
        assertThat(GroupOne.ELEMENT_H.symbol).isEqualTo("辛");
        assertThat(GroupOne.ELEMENT_I.symbol).isEqualTo("壬");
        assertThat(GroupOne.ELEMENT_J.symbol).isEqualTo("癸");
    }

    @Test
    fun shouldReturnTenValues() {
        assertThat(GroupOne.values()).hasSize(10);
    }
}
