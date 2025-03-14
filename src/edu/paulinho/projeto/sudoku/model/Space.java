package edu.paulinho.projeto.sudoku.model;

public class Space {

    private Integer actualValue;
    private final int ESPECTED;
    private final boolean FIXED;

    public Space(int ESPECTED, boolean FIXED) {
        this.ESPECTED = ESPECTED;
        this.FIXED = FIXED;

        if (this.FIXED) {
            this.actualValue = ESPECTED;
        }
    }

    public Integer getActualValue() {
        return this.actualValue;
    }

    public void setActualValue(Integer actualValue) {
        if (this.FIXED) return;
        this.actualValue = actualValue;
    }

    public int getESPECTED() {
        return this.ESPECTED;
    }

    public boolean isFIXED() {
        return this.FIXED;
    }

    public void clearSpace() {
        setActualValue(null);
    }

}
