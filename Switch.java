public class Switch {
    private boolean value;

    public Switch(boolean initialValue) {
        this.value = initialValue;
    }

    public void openSwitch() {
        this.value = true;
    }

    public void closeSwitch() {
        this.value = false;
    }

    public boolean getSwitchValue() {
        return this.value;
    }
}
