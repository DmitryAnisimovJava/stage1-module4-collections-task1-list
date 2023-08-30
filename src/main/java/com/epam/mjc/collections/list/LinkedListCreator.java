package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
    	LinkedList<Integer> resultLinkedList = new LinkedList<>();
    	for (Iterator<Integer> I = sourceList.iterator(); I.hasNext();) {
			Integer elementOfSourceFile =(Integer) I.next();
			if (elementOfSourceFile % 2 != 0) {
				resultLinkedList.addFirst(elementOfSourceFile);
			} else {
				resultLinkedList.addLast(elementOfSourceFile);
			}
		}
    	return resultLinkedList;
    }
}
