package JAN;

public class Main {

    public static void main(String[] args)
    {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Krakow Rzeszow Warszawa Chorzow Katowice Krakow Wroclaw Szczecin Lodz";

        String [] data = stringData.split(" ");

        for(String s : data)
        {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Krakow"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Warszawa"));
        tree.removeItem(new Node("Katowice"));
        tree.traverse(tree.getRoot());
    }
}
