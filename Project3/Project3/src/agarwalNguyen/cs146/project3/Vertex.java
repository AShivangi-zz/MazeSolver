package agarwalNguyen.cs146.project3;

public class Vertex {
	public char label; // label (e.g. �A�)
	public boolean wasVisited;
	public Vertex(char lab) // constructor
	{
	label = lab;
	wasVisited = false;
	}
}