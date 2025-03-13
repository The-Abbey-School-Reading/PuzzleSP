
public class Pattern {
    private String symbol;
    private String patternSequence;

    public Pattern(String symbolToUse, String patternString) {
        symbol = symbolToUse;
        patternSequence = patternString;
    }

    public boolean matchesPattern(String patternString, String symbolPlaced) {
        if (!symbolPlaced.equals(symbol)) {
            return false;
        } else {
            for (int count = 0; count < patternSequence.length(); count++) {
                if (patternSequence.charAt(count) == symbol.charAt(0) && patternString.charAt(count) != symbol.charAt(0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getPatternSequence() {
        return patternSequence;
    }
}
