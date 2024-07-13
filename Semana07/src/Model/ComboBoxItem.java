package Model;

public class ComboBoxItem {

    private final String value;
    private final String displayText;

    public ComboBoxItem(String value, String displayText) {
        this.value = value;
        this.displayText = displayText;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return displayText;
    }

}
