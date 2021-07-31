/**
 * 
 */
package com.study.patter.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajan
 *
 */
public class MemoryCard {
	private List<Memory> memories = new ArrayList<>();

	public void saveToCard(Memory memory) {
		this.memories.add(memory);
	}

	public Memory returnFromCard(int index) {
		return this.memories.get(index);
	}

}
