public class Stat {
    private int value;

    public Stat(int initialValue) {
        this.value = initialValue;
    }

    public int getValue() {
        return this.value;
    }

    public int getPsychicLevel() {
        if (this.value < 6) {
            return 1;
        } else if (this.value < 11 ) {
            return 2;
        } else if (this.value < 16 ) {
            return 3;
        } else if (this.value < 21 ) {
            return 4;
        } else {
            return 5;
        }
    }

    public int getDangerLevel() { // <-- This stumped me for a WHILE.  First, I kept trying to directly call the "danger" object outside of the main method.  Next, I tried using danger.getValue() WITHIN a new method.  Finally, it all came together.  And it was beautiful.
        if (this.value < 3) {
            return 3;
        } else if (this.value < 6) {
            return 4;
        } else if (this.value < 9) {
            return 5;
        } else if (this.value == 9){
            return 6;
        } else if (this.value == 10 ) {
            return 3;
        } else if (this.value < 14) {
            return 4;
        } else if (this.value < 17) {
            return 5;
        } else {
            return 6;
        }
    }

    public void decreaseStat(int decrease) {
        this.value-=decrease;

        if (this.value < 1) {
            this.value = 1;
        }
    }

    public void increasePsychic(int increase) {
        this.value += increase;
        if (this.value > 25) {
            this.value = 25;
        }
    }

    public void increaseDanger(int increase) {
        this.value+=increase;
    }

    public void psyPenaltyCheck(int danger) {
        if (danger > 10) {
            this.value-=2;
        }
    }

    public void dangerLimit() {
        if (this.value > 10) {
            this.value = 3;
        }
    }
}
