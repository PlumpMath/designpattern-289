package jp.ddo.bobchin.visitor;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {

	private String name;
	private Vector<Entry> dir = new Vector<Entry>();
	
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
		Iterator<Entry> it = this.iterator();
		while (it.hasNext()) {
			size += it.next().getSize();
		}
		return size;
	}
	
	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}
	
	public Iterator<Entry> iterator() {
		return dir.iterator();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
