package jp.ddo.bobchin.composite;

import java.util.LinkedList;

public class Directory extends Entry {

	private String name;
	private LinkedList<Entry> directory = new LinkedList<Entry>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry entry : directory) {
			size += entry.getSize();
		}
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(String.format("%s/%s", prefix, this));
		for (Entry entry : directory) {
			entry.printList(String.format("%s/%s", prefix, name));
		}
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
}




