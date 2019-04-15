package minesweeper;

public class Board {
    final private int maxHeight = 20;
    final private int maxWidth = 40;
    final private int maxMines = 100;

    private int height;
    private int width;
    private int mineNum;
    private Cell cells[][] = new Cell[maxHeight][maxWidth];
    private Mine[] mines = new Mine[maxMines];

    public Board(int mineNum, int height, int width) {
        this.height = height;
        this.width = width;
        this.mineNum = mineNum;

        createField();
        createMines();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void createField() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[y][x] = new Cell(".");
            }
        }
    }

    public void createMines() {
        do {
            for (int i = 0; i < mineNum; i++) {
                mines[i] = new Mine(height, width);
            }
        } while (checkDuplicates());
        setMines();
        getClues();
    }

    public boolean checkDuplicates() {
        int[] checkMine;
        int dupeMines;
        boolean dupesPresent = false;

        for (int y = 0; y < mineNum; y++) {
            dupeMines = 0;
            checkMine = new int[]{mines[y].getY(), mines[y].getX()};

            for (int x = 0; x < mineNum; x++) {

                int[] anotherMine = new int[]{mines[x].getY(),
                        mines[x].getX()};

                boolean mineMatch = (checkMine[0] == anotherMine[0])
                    && (checkMine[1] == anotherMine[1]);

                if (mineMatch)
                    dupeMines++;
            }

            if (dupeMines > 1)
                dupesPresent = true;

        }

        return dupesPresent;
    }

    public void setMines() {
        for (int i = 0; i < mineNum; i++) {
            int y = mines[i].getY();
            int x = mines[i].getX();
            cells[y][x].setCell("X");
        }
    }

    public void getCornerClues() {
        String NW = cells[0][0].getCell();
        String NE = cells[0][width - 1].getCell();
        String SW = cells[height - 1][0].getCell();
        String SE = cells[height - 1][width - 1].getCell();

        if (NW != "X") {
            String[] countSurrounding = {
                    cells[0][1].getCell(),
                    cells[1][0].getCell(),
                    cells[1][1].getCell(),
            };
            String clue = clueCounter(countSurrounding);
            cells[0][0].setCell(clue);
        }

        if (NE != "X") {
            String[] countSurrounding = {
                    cells[0][width - 2].getCell(),
                    cells[1][width - 2].getCell(),
                    cells[1][width - 1].getCell(),
            };
            String clue = clueCounter(countSurrounding);
            cells[0][width - 1].setCell(clue);
        }

        if (SW != "X") {
            String[] countSurrounding = {
                    cells[height - 2][0].getCell(),
                    cells[height - 2][1].getCell(),
                    cells[height - 1][1].getCell(),
            };
            String clue = clueCounter(countSurrounding);
            cells[height - 1][0].setCell(clue);
        }

        if (SE != "X") {
            String[] countSurrounding = {
                    cells[height - 2][width - 2].getCell(),
                    cells[height - 2][width - 1].getCell(),
                    cells[height - 1][width - 2].getCell(),
            };
            String clue = clueCounter(countSurrounding);
            cells[height - 1][width - 1].setCell(clue);
        }
    }

    public void getEndClues() {

        //  count top cells  ///////////////////////////////////////////
        for (int x = 1; x < width - 1; x++) {
            String cellToCheck = cells[0][x].getCell();

            if (cellToCheck != "X") {
                String[] countSurrounding = {
                    cells[0][x - 1].getCell(),
                    cells[0][x + 1].getCell(),
                    cells[1][x - 1].getCell(),
                    cells[1][x].getCell(),
                    cells[1][x + 1].getCell(),
                };
                String clue = clueCounter(countSurrounding);
                cells[0][x].setCell(clue);
            }
        }

        //  count bottom cells  ////////////////////////////////////////
        for (int x = 1; x < width - 1; x++) {
            String cellToCheck = cells[height-1][x].getCell();

            if (cellToCheck != "X") {
                String[] countSurrounding = {
                    cells[height - 1][x - 1].getCell(),
                    cells[height - 1][x + 1].getCell(),
                    cells[height - 2][x - 1].getCell(),
                    cells[height - 2][x].getCell(),
                    cells[height - 2][x + 1].getCell(),
                };
                String clue = clueCounter(countSurrounding);
                cells[height-1][x].setCell(clue);
            }
        }

        //  count left cells  //////////////////////////////////////////
        for (int y = 1; y < height - 1; y++) {
            String cellToCheck = cells[y][0].getCell();
            if (cellToCheck != "X") {
                String[] countSurrounding = {
                    cells[y - 1][0].getCell(),
                    cells[y - 1][1].getCell(),
                    cells[y][1].getCell(),
                    cells[y + 1][0].getCell(),
                    cells[y + 1][1].getCell()
                };
                String clue = clueCounter(countSurrounding);
                cells[y][0].setCell(clue);
            }
        }

        //  count right cells  /////////////////////////////////////////
        for (int y = 1; y < height - 1; y++) {
            String cellToCheck = cells[y][width - 1].getCell();
            if (cellToCheck != "X") {
                String[] countSurrounding = {
                    cells[y - 1][width - 2].getCell(),
                    cells[y - 1][width - 1].getCell(),
                    cells[y][width - 2].getCell(),
                    cells[y + 1][width - 2].getCell(),
                    cells[y + 1][width - 1].getCell()
                };
                String clue = clueCounter(countSurrounding);
                cells[y][width - 1].setCell(clue);
            }
        }

    }

    public void getClues() {
//        getCornerClues();
//        getEndClues();

        //  count inner cells  /////////////////////////////////////////
        for (int y = 0; y < height - 1; y++) {
            for (int x = 0; x < width - 1; x++) {
                String cellToCheck = cells[y][x].getCell();

//                if (cellToCheck != "X") {
//                    if (y == 0 && x == 0) {
//                        cells[y][x + 1].getCell(),
//                        cells[y + 1][x].getCell(),
//                        cells[y + 1][x + 1].getCell()
//                    }


                    String[] countSurrounding = {
                        cells[y - 1][x - 1].getCell(),
                        cells[y - 1][x].getCell(),
                        cells[y - 1][x + 1].getCell(),
                        cells[y][x - 1].getCell(),
                        cells[y][x + 1].getCell(),
                        cells[y + 1][x - 1].getCell(),
                        cells[y + 1][x].getCell(),
                        cells[y + 1][x + 1].getCell()
                    };

                    String clue = clueCounter(countSurrounding);
                    cells[y][x].setCell(clue);
                }
            }
        }
    }

    public String clueCounter(String[] cellsToCount) {
        int count = 0;
        for (int i = 0; i < cellsToCount.length; i++) {
            if (cellsToCount[i] == "X") {
                count++;
            }
        }

        if (count > 0) {
            return "" + count;
        } else {
            return ".";
        }
    }

////////////////////////////////////////////////////////////////////////
//    T O    S T R I N G    M E T H O D S    ///////////////////////////

    public String minesToString() {
        String mineStr = "\n\t";
        for (int i = 0; i < mineNum; i++) {
            if (i == 5)
                mineStr += "\n\t";
            mineStr += mines[i].getLocation() + " ";
        }
        return mineStr;
    }

    public String fieldToString() {
        String fieldStr = "";
        for (int y = 0; y < height; y++) {
            fieldStr += "\n\t";
            for (int x = 0; x < width; x++) {
                fieldStr += cells[y][x].getCell() + "   ";
            }
            fieldStr += "\n";
        }
        fieldStr += "\n";
        return fieldStr;
    }

    public String showEasyBoard() {
        String boardStr = "\n\t  A   B   C   D   E   F   G   H";
        for (int y = 0; y < height; y++) {
            boardStr += "\t\n\t+---+---+---+---+---+---+---+---+\n\t";
            for (int x = 0; x < width; x++) {
                boardStr += "| " + cells[y][x].getCell() + " ";
            }
            boardStr += "|  " + y;
        }
        boardStr += "\t\n\t+---+---+---+---+---+---+---+---+\n\t";
        return boardStr;
    }

}
