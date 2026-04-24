package net.sevenstars.middleearth.block;

public enum GemBlockForm implements BlockForm {
    // @formatter:off
    BLOCK       ("", "_block"),
    CLUSTER     ("", "_cluster"),
    LARGE_BUD   ("large_", "_bud"),
    MEDIUM_BUD  ("medium_", "_bud"),
    SMALL_BUD   ("small_", "_bud"),
    BUDDING     ("budding_", ""); // Keep BUDDING last
    // @formatter:on

    private final String prefix;
    private final String suffix;

    GemBlockForm(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }
}