package net.myphenotype;

public class StringUtilities {

    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char c){
        //this operator is added below to intentionally create out of memory exception
        this.stringBuilder.append(c);
        charsAdded++;
    }
}
