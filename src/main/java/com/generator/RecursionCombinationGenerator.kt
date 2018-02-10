package com.generator

import com.calendar.GroupOne
import com.calendar.GroupTwo

class RecursionCombinationGenerator : CombinationGenerator {
    val groupOneValues: Array<GroupOne> = GroupOne.values();
    val groupTwoValues: Array<GroupTwo> = GroupTwo.values();

    override fun generate(): List<String> {
        val listOfResults: MutableList<String> = mutableListOf();
        return constructList(listOfResults, 0)
    }

    fun constructList(listOfResults: MutableList<String>, index: Int): MutableList<String> {
        if (isNewCombination(listOfResults, currentCombination(index))){
            listOfResults.add(currentCombination(index));
            return constructList(listOfResults, index+1);
        }
        return listOfResults;
    }

    private fun isNewCombination(listOfResults: MutableList<String>, combination: String): Boolean {
        return !listOfResults.contains(combination);
    }

    private fun currentCombination(index: Int) =
            groupOneValues[index % groupOneValues.size].symbol + groupTwoValues[index % groupTwoValues.size].symbol
}