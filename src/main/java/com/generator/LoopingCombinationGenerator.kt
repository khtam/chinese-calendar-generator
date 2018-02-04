package com.generator

import com.calendar.GroupOne
import com.calendar.GroupTwo

class LoopingCombinationGenerator : CombinationGenerator {

    override fun generate(): List<String> {
        val listOfResults: MutableList<String> = mutableListOf();
        val groupOneValues: Array<GroupOne> = GroupOne.values();
        val groupTwoValues: Array<GroupTwo> = GroupTwo.values();
        var index = 0;
        var currentCombination: String = combine(groupOneValues, groupTwoValues, index);
        while (!listOfResults.contains(currentCombination)) {
            listOfResults.add(currentCombination);
            index++;
            currentCombination = combine(groupOneValues, groupTwoValues, index);
        }

        return listOfResults;
    }

    private fun combine(groupOneValues: Array<GroupOne>, groupTwoValues: Array<GroupTwo>, index: Int) =
            groupOneValues[index % groupOneValues.size].symbol + groupTwoValues[index % groupTwoValues.size].symbol
}