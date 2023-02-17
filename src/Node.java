public class Node {
    private Animal animal;
    private Node proximo;
    private Node anterior;

    public Node(Animal animal, Node proximo, Node anterior) {
        this.animal = animal;
        this.proximo = null;
        this.anterior = null;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
