/**
 * 
 */
package com.study.patter.memento;

/**
 * @author rajan
 *
 */
public class Data {
	private String data;

	public Data(String data) {
		this.data = data;
	}

	public String getData() {
		return this.data;
	}

	public Memory createMemorySlotForData() {
		return new Memory(this.data);
	}

	public void setDataFromMemorySlot(Memory memory) {
		this.data = memory.getSpaceName();
	}

}
