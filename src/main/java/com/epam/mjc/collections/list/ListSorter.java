package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
    	boolean sorted = false;
    	while(!sorted) {
    		sorted = true;
    		for (int i = 0; i < sourceList.size() - 1; i++) {
    			String numberOne = sourceList.get(i);
    			String numberTwo = sourceList.get(i + 1);
    			int resultOne = 5 * Integer.parseInt(numberOne) * Integer.parseInt(numberOne) + 3;
    			int resultTwo = 5 * Integer.parseInt(numberTwo) * Integer.parseInt(numberTwo) + 3;
    			if (resultOne > resultTwo) {
    				swapListElements(sourceList, i, i+1);
    				sorted = false;
    			} 
    			if (resultOne == resultTwo) {
    				int compareResult = new ListComparator().compare(numberOne, numberTwo);
    				if (compareResult == -1) {
    					swapListElements(sourceList, i, i+1);
    				}
    			}
    		}
    	}
    }
    public static <T> void swapListElements(List<T> sourceList, int index1, int index2) {
		List<T> sourceListCopyList = List.copyOf(sourceList);
    	T elementOne = sourceListCopyList.get(index1);
		T elementTwo = sourceListCopyList.get(index2);
		sourceList.set(index2, elementOne);
		sourceList.set(index1, elementTwo);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    	int numberOne = Integer.parseInt(a);
    	int numberTwo = Integer.parseInt(b);
    	if (numberOne > numberTwo) {
			return -1;
		} else {
			return 0;
		}
    }
}