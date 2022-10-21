package main.opc.testCases;

interface LocatorsSelection {
    void findSelector();
}

class XPathTestCase implements LocatorsSelection {
    @Override
    public void findSelector() {

    }
}

class CSSPathTestCase implements LocatorsSelection {
    @Override
    public void findSelector() {

    }
}

class IdentifyElements {
    public void findElement(LocatorsSelection locator) {
        locator.findSelector();
    }

    public static void main(String[] args) {
        IdentifyElements locator = new IdentifyElements();
        XPathTestCase xpath = new XPathTestCase();
        CSSPathTestCase css = new CSSPathTestCase();
        locator.findElement(xpath);
        locator.findElement(css);
    }
}
