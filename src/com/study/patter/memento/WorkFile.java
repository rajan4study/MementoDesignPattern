/**
 * 
 */
package com.study.patter.memento;

/**
 * @author rajan
 *
 */
public class WorkFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MemoryCard memoryCard = new MemoryCard();
		Data data1 = new Data("my first data");
		System.out.println(data1.getData());
		memoryCard.saveToCard(new Memory(data1.getData()));
		data1 = new Data("my second data");
		memoryCard.saveToCard(new Memory(data1.getData()));
		System.out.println(data1.getData());
		data1 = new Data("my third data");
		memoryCard.saveToCard(new Memory(data1.getData()));
		System.out.println(data1.getData());
		data1.setDataFromMemorySlot(memoryCard.returnFromCard(1));
		System.out.println(data1.getData());

	}

}
