package cs101;

public interface NodeInterface {

	public void add(String toAdd);

	public Node find(String toFind);

	public boolean delete(Node prev, String toDelete);

}
