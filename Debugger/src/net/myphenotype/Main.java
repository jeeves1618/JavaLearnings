package net.myphenotype;

public class Main {

    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder stringBuilder = new StringBuilder();

        while (stringBuilder.length() < 10) {
            utils.addChar(stringBuilder,'a');
        }
        System.out.println(stringBuilder);
    }
}
