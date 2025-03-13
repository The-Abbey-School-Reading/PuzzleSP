
public class BlockedCell extends Cell {

    public BlockedCell() {
        super();
        symbol = "@";
    }

    @Override
    public boolean checkSymbolAllowed(String symbolToCheck) {
        return false;
    }
}
