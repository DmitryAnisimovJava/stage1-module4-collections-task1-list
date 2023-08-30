package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
    	ListIterator<String> I = sourceList.listIterator();
		System.out.println(sourceList.size());
		ArrayList<String> resultInArrayList = new ArrayList<>();
		while (I.hasNext()) {
			String elementInSourceLiString = I.next();
			if(I.nextIndex() % 3 == 0) {
				resultInArrayList.add(elementInSourceLiString);
				resultInArrayList.add(elementInSourceLiString);
			}
		}
		return resultInArrayList;
    }
}
