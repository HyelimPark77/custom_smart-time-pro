package com.sma.smartv3.view.bubbleview;

/* JADX INFO: loaded from: classes3.dex */
public final enum ArrowDirection extends Enum<ArrowDirection> {
    private static final /* synthetic */ ArrowDirection[] $VALUES = null;
    public static final ArrowDirection BOTTOM = null;
    public static final ArrowDirection BOTTOM_CENTER = null;
    public static final ArrowDirection BOTTOM_RIGHT = null;
    public static final ArrowDirection LEFT = null;
    public static final ArrowDirection LEFT_CENTER = null;
    public static final ArrowDirection RIGHT = null;
    public static final ArrowDirection RIGHT_CENTER = null;
    public static final ArrowDirection TOP = null;
    public static final ArrowDirection TOP_CENTER = null;
    public static final ArrowDirection TOP_RIGHT = null;
    private int value;

    private static /* synthetic */ ArrowDirection[] $values() {
        return new ArrowDirection[]{LEFT, RIGHT, TOP, BOTTOM, LEFT_CENTER, RIGHT_CENTER, TOP_CENTER, BOTTOM_CENTER, TOP_RIGHT, BOTTOM_RIGHT};
    }

    static {
        LEFT = new ArrowDirection("LEFT", 0, 0);
        RIGHT = new ArrowDirection("RIGHT", 1, 1);
        TOP = new ArrowDirection("TOP", 2, 2);
        BOTTOM = new ArrowDirection("BOTTOM", 3, 3);
        LEFT_CENTER = new ArrowDirection("LEFT_CENTER", 4, 4);
        RIGHT_CENTER = new ArrowDirection("RIGHT_CENTER", 5, 5);
        TOP_CENTER = new ArrowDirection("TOP_CENTER", 6, 6);
        BOTTOM_CENTER = new ArrowDirection("BOTTOM_CENTER", 7, 7);
        TOP_RIGHT = new ArrowDirection("TOP_RIGHT", 8, 8);
        BOTTOM_RIGHT = new ArrowDirection("BOTTOM_RIGHT", 9, 9);
        $VALUES = $values();
    }

    private ArrowDirection(String $enum$name, int $enum$ordinal, int value) {
        super($enum$name, $enum$ordinal);
        this.value = value;
    }

    public static ArrowDirection fromInt(int value) {
        ArrowDirection[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        ArrowDirection r3 = r0[r2];
        if (value == r3.getValue()) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        return LEFT;
    }

    public static ArrowDirection valueOf(String name) {
        return (ArrowDirection) Enum.valueOf(ArrowDirection.class, name);
    }

    public static ArrowDirection[] values() {
        return (ArrowDirection[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
