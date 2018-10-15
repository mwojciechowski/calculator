package pl.mw.calculator.model;

import java.util.List;

public class History {
    List<HistoryElement> elements;

    public History(List<HistoryElement> elements) {
        this.elements = elements;
    }

    public List<HistoryElement> getElements() {
        return elements;
    }
}
