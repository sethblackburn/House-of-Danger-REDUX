public class Item {
    private String name;
    private boolean value;

    public Item(String initialName) {
        this.name = initialName;
        this.value = false;
    }

    public void obtainItem() { this.value = true; }

    public void loseItem() { this.value = false; }

    public boolean itemCheck() {
        return this.value;
    }
}
