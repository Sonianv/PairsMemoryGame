package models;

public class Level {

	private String name;
	private int colums;
	private int lines;

	public Level(String name, int lines, int columns) {
		this.name = name;
		this.lines = lines;
		this.colums = columns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColums() {
		return colums;
	}

	public void setColums(int colums) {
		this.colums = colums;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

}
