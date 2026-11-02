package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceEnumUtil {

    @aa1
    public static final WatchFaceEnumUtil INSTANCE = new WatchFaceEnumUtil();

    public enum AlignType {
        LV_ALIGN_DEFAULT(0),
        LV_ALIGN_LT(1),
        LV_ALIGN_MT(2),
        LV_ALIGN_RT(3),
        LV_ALIGN_LB(4),
        LV_ALIGN_MB(5),
        LV_ALIGN_RB(6),
        LV_ALIGN_LM(7),
        LV_ALIGN_RM(8),
        LV_ALIGN_MM(9);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        AlignType(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<AlignType> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum AnimationPlayMode {
        FRAME_DATA_MODE_SINGLE_LOOP(0),
        FRAME_DATA_MODE_LOOP(1),
        FRAME_DATA_MODE_MANUAL_CLICK_LOOP(2),
        FRAME_DATA_MODE_SINGLE(3);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        AnimationPlayMode(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<AnimationPlayMode> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum ClickType {
        NONE((byte) 0),
        ACTIVITY((byte) 1),
        HR((byte) 2),
        ALARM((byte) 3),
        MUSIC((byte) 4),
        MESSAGE((byte) 5),
        PHONE((byte) 6),
        SPORT((byte) 7),
        STRESS((byte) 8),
        SLEEP((byte) 9),
        WEATHER((byte) 10),
        SPO2((byte) 11),
        BREATHE_TRAINING((byte) 12),
        STOPWATCH((byte) 13),
        TIMER((byte) 14),
        FIND_PHONE((byte) 15),
        SOS((byte) 16);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final byte value;

        ClickType(byte b) {
            this.value = b;
        }

        @aa1
        public static EnumEntries<ClickType> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum DateDigitFlag {
        DATE_DIGIT_FLAG_YEAR((byte) 1),
        DATE_DIGIT_FLAG_MONTH((byte) 2),
        DATE_DIGIT_FLAG_DAY((byte) 4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final byte value;

        DateDigitFlag(byte b) {
            this.value = b;
        }

        @aa1
        public static EnumEntries<DateDigitFlag> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum DigitFlag {
        TIME_DIGIT_FLAG_HOUR((byte) 1),
        TIME_DIGIT_FLAG_MIN((byte) 2),
        TIME_DIGIT_FLAG_SEC((byte) 4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final byte value;

        DigitFlag(byte b) {
            this.value = b;
        }

        @aa1
        public static EnumEntries<DigitFlag> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum ElementType {
        PREVIEW((byte) 0),
        IMAGE((byte) 1),
        POINTER_H((byte) 2),
        POINTER_M((byte) 3),
        POINTER_S((byte) 4),
        DATE_DIGIT((byte) 5),
        TIME_DIGIT((byte) 6),
        AMPM((byte) 7),
        HOUR_TENS((byte) 8),
        HOUR_ONES((byte) 9),
        MINUTES_TENS((byte) 10),
        MINUTES_ONES((byte) 11),
        MONTH_TEXT((byte) 12),
        WEEKDAY_TEXT((byte) 13),
        STEP_DIGIT((byte) 14),
        CALORIE_DIGIT((byte) 15),
        DISTANCE_DIGIT((byte) 16),
        HR_DIGITAL((byte) 17),
        POWER_IMAGE((byte) 18),
        BT((byte) 19),
        FRAMES((byte) 20),
        REALTIME_WEATHER((byte) 21),
        REALTIME_TEMPERATURE((byte) 22),
        WEATHER_FORECAST((byte) 23),
        STEP_PROGRESS_IMAGE((byte) 24),
        CALORIE_PROGRESS_IMAGE((byte) 25),
        DISTANCE_PROGRESS_IMAGE((byte) 26),
        HR_LEVEL((byte) 27),
        STEP_PROGRESS_DIGIT((byte) 28),
        CALORIE_PROGRESS_DIGIT((byte) 29),
        DISTANCE_PROGRESS_DIGIT((byte) 30),
        POWER_DIGIT((byte) 32),
        ANIM((byte) 33),
        QUDAI_BUTTERFLY((byte) 35),
        QUDAI_POND_KOI((byte) 36),
        QUDAI_FALLING_FLOWER((byte) 37),
        MAX((byte) 38);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final byte value;

        ElementType(byte b) {
            this.value = b;
        }

        @aa1
        public static EnumEntries<ElementType> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum ImageFormatType {
        FORMAT_ARGB8888(0),
        FORMAT_RGB888(1),
        FORMAT_ARGB8565(2),
        FORMAT_RGB565(3);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        ImageFormatType(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<ImageFormatType> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum ImageType {
        LV_COLOR_FORMAT_UNKNOWN((byte) 0),
        LV_COLOR_FORMAT_RAW((byte) 1),
        LV_COLOR_FORMAT_RAW_ALPHA((byte) 2),
        LV_COLOR_FORMAT_L8((byte) 6),
        LV_COLOR_FORMAT_I1((byte) 7),
        LV_COLOR_FORMAT_I2((byte) 8),
        LV_COLOR_FORMAT_I4((byte) 9),
        LV_COLOR_FORMAT_I8((byte) 10),
        LV_COLOR_FORMAT_A8((byte) 14),
        LV_COLOR_FORMAT_RGB565((byte) 18),
        LV_COLOR_FORMAT_ARGB8565((byte) 19),
        LV_COLOR_FORMAT_RGB565A8((byte) 20),
        LV_COLOR_FORMAT_RGB888((byte) 15),
        LV_COLOR_FORMAT_ARGB8888((byte) 16),
        LV_COLOR_FORMAT_XRGB8888((byte) 17),
        LV_COLOR_FORMAT_A1((byte) 11),
        LV_COLOR_FORMAT_A2((byte) 12),
        LV_COLOR_FORMAT_A4((byte) 13);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final byte value;

        ImageType(byte b) {
            this.value = b;
        }

        @aa1
        public static EnumEntries<ImageType> getEntries() {
            return $ENTRIES;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum McuPlatform {
        NONE(0),
        JL701N(1),
        JL707N(2),
        SIMULATOR(3),
        SIFLI(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        McuPlatform(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<McuPlatform> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private WatchFaceEnumUtil() {
    }

    public final int getColorFormat(int i) {
        if (i == 0) {
            return ImageType.LV_COLOR_FORMAT_ARGB8888.getValue();
        }
        if (i == 1) {
            return ImageType.LV_COLOR_FORMAT_ARGB8565.getValue();
        }
        if (i != 4) {
            return i != 5 ? ImageType.LV_COLOR_FORMAT_ARGB8888.getValue() : ImageType.LV_COLOR_FORMAT_RGB565.getValue();
        }
        return ImageType.LV_COLOR_FORMAT_RGB888.getValue();
    }

    public final byte getDigitFlag(byte b) {
        if (b == ElementType.POINTER_H.getValue()) {
            return DigitFlag.TIME_DIGIT_FLAG_HOUR.getValue();
        }
        return b == ElementType.POINTER_M.getValue() ? DigitFlag.TIME_DIGIT_FLAG_MIN.getValue() : DigitFlag.TIME_DIGIT_FLAG_SEC.getValue();
    }
}
