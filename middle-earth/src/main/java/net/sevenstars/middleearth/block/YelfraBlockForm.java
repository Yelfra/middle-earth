package net.sevenstars.middleearth.block;

public enum YelfraBlockForm implements BlockForm {
    BASE            (""),
    SLAB            ("_slab"),
    VERTICAL_SLAB   ("_vertical_slab"),
    STAIRS          ("_stairs"),
    WALL            ("_wall"),
    FENCE           ("_fence"),
    FENCE_GATE      ("_gate"),
    DOOR            ("_door", true),
    TRAPDOOR        ("_trapdoor", true),
    PRESSURE_PLATE  ("_pressure_plate", true),
    BUTTON          ("_button", true),
    ROCKS           ("_rocks", false),
    STOOL           ("_stool", true),
    TABLE           ("_table", true),
    CHAIR           ("_chair", true),
    BENCH           ("_bench", true),
    LADDER          ("_ladder", false);

    // TODO: @Yelfra | Add transparent vertical slab? Panel?
    // TODO: possibly missing bar variants (as in iron bars)

    private final String suffix;
    private final boolean requiresType; // Type is applied in BlockFormSet, this parameter is mostly for safety

    YelfraBlockForm(String suffix) {
        this(suffix, false);
    }

    YelfraBlockForm(String suffix, boolean requiresType) {
        this.suffix = suffix;
        this.requiresType = requiresType;
    }

    public String getSuffix() {
        return suffix;
    }

    public boolean requiresType() {
        return requiresType;
    }
}
