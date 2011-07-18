package jp.ddo.bobchin.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

	private String currentdir = "";
	
	@Override
	public void visit(File file) {
		System.out.println(getStr(file.toString()));
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(getStr(directory.toString()));

		String savedir = currentdir;
		currentdir = getStr(directory.getName());
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			it.next().accept(this);
		}
		currentdir = savedir;
	}

	private String getStr(String s) {
		return String.format("%s/%s", currentdir, s);
	}
}
