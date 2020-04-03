public class Nodee {
    private Customer data;
    private Nodee next;

    public Nodee(Customer data) {
        this.data = data;
        next = null;
    }

    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }

    public Nodee getNext() {
        return next;
    }

    public void setNext(Nodee next) {
        this.next = next;
    }
}
