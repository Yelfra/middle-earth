package net.sevenstars.middleearth.block;

public enum WattleBlockForm implements BlockForm {
    // @formatter:off
    BASE    (""),
    CROSS   ("_cross"),
    RIGHT   ("_right"),
    LEFT    ("_left"),
    PILLAR  ("_pillar"),
    DIAMOND ("_diamond");
    // @formatter:on

    private final String suffix;

    WattleBlockForm(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }
}
