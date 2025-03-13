import java.util.ArrayList;
import java.util.List;


public class Cell {
    protected String symbol;
    protected List<String> symbolsNotAllowed;

    public Cell() {
        symbol = "";
        symbolsNotAllowed = new ArrayList<>();
    }

    public String getSymbol() {
        if (isEmpty()) {
            return "-";
        } else {
            return symbol;
        }
    }

    public boolean isEmpty() {
        if (symbol.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void changeSymbolInCell(String newSymbol) {
        symbol = newSymbol;
    }

    public boolean checkSymbolAllowed(String symbolToCheck) {
        for (String item : symbolsNotAllowed) {
            if (item.equals(symbolToCheck)) {
                return false;
            }
        }
        return true;
    }

    public void addToNotAllowedSymbols(String symbolToAdd) {
        symbolsNotAllowed.add(symbolToAdd);
    }

    public void updateCell() {
    }
}