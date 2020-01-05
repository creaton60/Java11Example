package net.java.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Collectors;

@Slf4j
public class Example {

    @SuppressWarnings("SameParameterValue")
    private static void writeHeader(String headerText) {
        String headerSeparator = "=".repeat(headerText.length() + 4);

        log.info(headerSeparator);
        log.info("Header input Text: {}", headerText);
        log.info(headerSeparator);
    }

    private static void demonstrateStringLines() {
        String originalString = "Hello\nWorld\n123";

        String stringWithoutLineSeparators = originalString.replaceAll("\\n", "\\\\n");

        writeHeader("String.lines() on '" + stringWithoutLineSeparators + "'");

        originalString.lines().forEach(System.out::println);
    }

    private static void demonstrateStringStrip() {
        String originalString = "  creaton60  23333  ";

        writeHeader("String.strip() on '" + originalString + "'");
        log.info("'" + originalString.strip() + "'");
    }

    private static void demonstrateStringStripLeading() {
        String originalString = "  creaton60  23333  ";

        writeHeader("String.stripLeading() on '" + originalString + "'");
        log.info("'" + originalString.stripLeading() + "'");
    }

    private static void demonstrateStringStripTrailing() {
        String originalString = "  creaton60  23333  ";

        writeHeader("String.stripTrailing() on '" + originalString + "'");
        log.info("'" + originalString.stripTrailing() + "'");
    }

    private static void demonstrateStringIsBlank() {
        writeHeader("String.isBlank()");

        String emptyString = "";
        log.info("Test   -> " + emptyString.isBlank());

        String onlyLineSeparator = System.getProperty("line.separator");
        log.info("Test     -> " + onlyLineSeparator.isBlank());

        String tabOnly = "\t";
        log.info("Tab Test -> " + tabOnly.isBlank());

        String spacesOnly = "   ";
        log.info("Empty       -> " + spacesOnly.isBlank());
    }

    private static void lines() {
        writeHeader("String.lines()");

        String str = "Hello \n World.";

        log.info("String : {}", str.lines().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        writeHeader("User-Agent\tMozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5)");
        demonstrateStringLines();
        demonstrateStringStrip();
        demonstrateStringStripLeading();
        demonstrateStringStripTrailing();
        demonstrateStringIsBlank();
        lines();
    }
}
