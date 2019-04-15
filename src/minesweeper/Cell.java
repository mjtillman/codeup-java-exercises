package minesweeper;

public class Cell {
    private String content;

    public Cell(String n){
        this.content = n;
    }

    public void setCell(String n) {
        this.content = n;
    }

    public String getCell() {
        return this.content;
    }
}
