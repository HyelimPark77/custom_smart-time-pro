package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.share.internal.ShareConstants;
import com.szabh.smable3.entity.BleDeviceInfo;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceEnumUtil {

    @aa1
    public static final WatchFaceEnumUtil INSTANCE = null;

    public static final enum AlignType extends Enum<AlignType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ AlignType[] $VALUES = null;
        public static final AlignType LV_ALIGN_DEFAULT = null;
        public static final AlignType LV_ALIGN_LB = null;
        public static final AlignType LV_ALIGN_LM = null;
        public static final AlignType LV_ALIGN_LT = null;
        public static final AlignType LV_ALIGN_MB = null;
        public static final AlignType LV_ALIGN_MM = null;
        public static final AlignType LV_ALIGN_MT = null;
        public static final AlignType LV_ALIGN_RB = null;
        public static final AlignType LV_ALIGN_RM = null;
        public static final AlignType LV_ALIGN_RT = null;
        private final int value;

        private static final /* synthetic */ AlignType[] $values() {
            return new AlignType[]{LV_ALIGN_DEFAULT, LV_ALIGN_LT, LV_ALIGN_MT, LV_ALIGN_RT, LV_ALIGN_LB, LV_ALIGN_MB, LV_ALIGN_RB, LV_ALIGN_LM, LV_ALIGN_RM, LV_ALIGN_MM};
        }

        static {
            LV_ALIGN_DEFAULT = new AlignType("LV_ALIGN_DEFAULT", 0, 0);
            LV_ALIGN_LT = new AlignType("LV_ALIGN_LT", 1, 1);
            LV_ALIGN_MT = new AlignType("LV_ALIGN_MT", 2, 2);
            LV_ALIGN_RT = new AlignType("LV_ALIGN_RT", 3, 3);
            LV_ALIGN_LB = new AlignType("LV_ALIGN_LB", 4, 4);
            LV_ALIGN_MB = new AlignType("LV_ALIGN_MB", 5, 5);
            LV_ALIGN_RB = new AlignType("LV_ALIGN_RB", 6, 6);
            LV_ALIGN_LM = new AlignType("LV_ALIGN_LM", 7, 7);
            LV_ALIGN_RM = new AlignType("LV_ALIGN_RM", 8, 8);
            LV_ALIGN_MM = new AlignType("LV_ALIGN_MM", 9, 9);
            AlignType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private AlignType(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<AlignType> getEntries() {
            return $ENTRIES;
        }

        public static AlignType valueOf(String r1) {
            return (AlignType) Enum.valueOf(AlignType.class, r1);
        }

        public static AlignType[] values() {
            return (AlignType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final enum AnimationPlayMode extends Enum<AnimationPlayMode> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ AnimationPlayMode[] $VALUES = null;
        public static final AnimationPlayMode FRAME_DATA_MODE_LOOP = null;
        public static final AnimationPlayMode FRAME_DATA_MODE_MANUAL_CLICK_LOOP = null;
        public static final AnimationPlayMode FRAME_DATA_MODE_SINGLE = null;
        public static final AnimationPlayMode FRAME_DATA_MODE_SINGLE_LOOP = null;
        private final int value;

        private static final /* synthetic */ AnimationPlayMode[] $values() {
            return new AnimationPlayMode[]{FRAME_DATA_MODE_SINGLE_LOOP, FRAME_DATA_MODE_LOOP, FRAME_DATA_MODE_MANUAL_CLICK_LOOP, FRAME_DATA_MODE_SINGLE};
        }

        static {
            FRAME_DATA_MODE_SINGLE_LOOP = new AnimationPlayMode("FRAME_DATA_MODE_SINGLE_LOOP", 0, 0);
            FRAME_DATA_MODE_LOOP = new AnimationPlayMode("FRAME_DATA_MODE_LOOP", 1, 1);
            FRAME_DATA_MODE_MANUAL_CLICK_LOOP = new AnimationPlayMode("FRAME_DATA_MODE_MANUAL_CLICK_LOOP", 2, 2);
            FRAME_DATA_MODE_SINGLE = new AnimationPlayMode("FRAME_DATA_MODE_SINGLE", 3, 3);
            AnimationPlayMode[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private AnimationPlayMode(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<AnimationPlayMode> getEntries() {
            return $ENTRIES;
        }

        public static AnimationPlayMode valueOf(String r1) {
            return (AnimationPlayMode) Enum.valueOf(AnimationPlayMode.class, r1);
        }

        public static AnimationPlayMode[] values() {
            return (AnimationPlayMode[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final enum ClickType extends Enum<ClickType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ ClickType[] $VALUES = null;
        public static final ClickType ACTIVITY = null;
        public static final ClickType ALARM = null;
        public static final ClickType BREATHE_TRAINING = null;
        public static final ClickType FIND_PHONE = null;
        public static final ClickType HR = null;
        public static final ClickType MESSAGE = null;
        public static final ClickType MUSIC = null;
        public static final ClickType NONE = null;
        public static final ClickType PHONE = null;
        public static final ClickType SLEEP = null;
        public static final ClickType SOS = null;
        public static final ClickType SPO2 = null;
        public static final ClickType SPORT = null;
        public static final ClickType STOPWATCH = null;
        public static final ClickType STRESS = null;
        public static final ClickType TIMER = null;
        public static final ClickType WEATHER = null;
        private final byte value;

        private static final /* synthetic */ ClickType[] $values() {
            return new ClickType[]{NONE, ACTIVITY, HR, ALARM, MUSIC, MESSAGE, PHONE, SPORT, STRESS, SLEEP, WEATHER, SPO2, BREATHE_TRAINING, STOPWATCH, TIMER, FIND_PHONE, SOS};
        }

        static {
            NONE = new ClickType("NONE", 0, (byte) 0);
            ACTIVITY = new ClickType("ACTIVITY", 1, (byte) 1);
            HR = new ClickType("HR", 2, (byte) 2);
            ALARM = new ClickType("ALARM", 3, (byte) 3);
            MUSIC = new ClickType("MUSIC", 4, (byte) 4);
            MESSAGE = new ClickType("MESSAGE", 5, (byte) 5);
            PHONE = new ClickType("PHONE", 6, (byte) 6);
            SPORT = new ClickType("SPORT", 7, (byte) 7);
            STRESS = new ClickType("STRESS", 8, (byte) 8);
            SLEEP = new ClickType("SLEEP", 9, (byte) 9);
            WEATHER = new ClickType("WEATHER", 10, (byte) 10);
            SPO2 = new ClickType("SPO2", 11, (byte) 11);
            BREATHE_TRAINING = new ClickType("BREATHE_TRAINING", 12, (byte) 12);
            STOPWATCH = new ClickType("STOPWATCH", 13, (byte) 13);
            TIMER = new ClickType("TIMER", 14, (byte) 14);
            FIND_PHONE = new ClickType("FIND_PHONE", 15, (byte) 15);
            SOS = new ClickType("SOS", 16, (byte) 16);
            ClickType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private ClickType(String r1, int r2, byte r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<ClickType> getEntries() {
            return $ENTRIES;
        }

        public static ClickType valueOf(String r1) {
            return (ClickType) Enum.valueOf(ClickType.class, r1);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public static final enum DateDigitFlag extends Enum<DateDigitFlag> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ DateDigitFlag[] $VALUES = null;
        public static final DateDigitFlag DATE_DIGIT_FLAG_DAY = null;
        public static final DateDigitFlag DATE_DIGIT_FLAG_MONTH = null;
        public static final DateDigitFlag DATE_DIGIT_FLAG_YEAR = null;
        private final byte value;

        private static final /* synthetic */ DateDigitFlag[] $values() {
            return new DateDigitFlag[]{DATE_DIGIT_FLAG_YEAR, DATE_DIGIT_FLAG_MONTH, DATE_DIGIT_FLAG_DAY};
        }

        static {
            DATE_DIGIT_FLAG_YEAR = new DateDigitFlag("DATE_DIGIT_FLAG_YEAR", 0, (byte) 1);
            DATE_DIGIT_FLAG_MONTH = new DateDigitFlag("DATE_DIGIT_FLAG_MONTH", 1, (byte) 2);
            DATE_DIGIT_FLAG_DAY = new DateDigitFlag("DATE_DIGIT_FLAG_DAY", 2, (byte) 4);
            DateDigitFlag[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private DateDigitFlag(String r1, int r2, byte r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<DateDigitFlag> getEntries() {
            return $ENTRIES;
        }

        public static DateDigitFlag valueOf(String r1) {
            return (DateDigitFlag) Enum.valueOf(DateDigitFlag.class, r1);
        }

        public static DateDigitFlag[] values() {
            return (DateDigitFlag[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public static final enum DigitFlag extends Enum<DigitFlag> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ DigitFlag[] $VALUES = null;
        public static final DigitFlag TIME_DIGIT_FLAG_HOUR = null;
        public static final DigitFlag TIME_DIGIT_FLAG_MIN = null;
        public static final DigitFlag TIME_DIGIT_FLAG_SEC = null;
        private final byte value;

        private static final /* synthetic */ DigitFlag[] $values() {
            return new DigitFlag[]{TIME_DIGIT_FLAG_HOUR, TIME_DIGIT_FLAG_MIN, TIME_DIGIT_FLAG_SEC};
        }

        static {
            TIME_DIGIT_FLAG_HOUR = new DigitFlag("TIME_DIGIT_FLAG_HOUR", 0, (byte) 1);
            TIME_DIGIT_FLAG_MIN = new DigitFlag("TIME_DIGIT_FLAG_MIN", 1, (byte) 2);
            TIME_DIGIT_FLAG_SEC = new DigitFlag("TIME_DIGIT_FLAG_SEC", 2, (byte) 4);
            DigitFlag[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private DigitFlag(String r1, int r2, byte r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<DigitFlag> getEntries() {
            return $ENTRIES;
        }

        public static DigitFlag valueOf(String r1) {
            return (DigitFlag) Enum.valueOf(DigitFlag.class, r1);
        }

        public static DigitFlag[] values() {
            return (DigitFlag[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public static final enum ElementType extends Enum<ElementType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ ElementType[] $VALUES = null;
        public static final ElementType AMPM = null;
        public static final ElementType ANIM = null;
        public static final ElementType BT = null;
        public static final ElementType CALORIE_DIGIT = null;
        public static final ElementType CALORIE_PROGRESS_DIGIT = null;
        public static final ElementType CALORIE_PROGRESS_IMAGE = null;
        public static final ElementType DATE_DIGIT = null;
        public static final ElementType DISTANCE_DIGIT = null;
        public static final ElementType DISTANCE_PROGRESS_DIGIT = null;
        public static final ElementType DISTANCE_PROGRESS_IMAGE = null;
        public static final ElementType FRAMES = null;
        public static final ElementType HOUR_ONES = null;
        public static final ElementType HOUR_TENS = null;
        public static final ElementType HR_DIGITAL = null;
        public static final ElementType HR_LEVEL = null;
        public static final ElementType IMAGE = null;
        public static final ElementType MAX = null;
        public static final ElementType MINUTES_ONES = null;
        public static final ElementType MINUTES_TENS = null;
        public static final ElementType MONTH_TEXT = null;
        public static final ElementType POINTER_H = null;
        public static final ElementType POINTER_M = null;
        public static final ElementType POINTER_S = null;
        public static final ElementType POWER_DIGIT = null;
        public static final ElementType POWER_IMAGE = null;
        public static final ElementType PREVIEW = null;
        public static final ElementType QUDAI_BUTTERFLY = null;
        public static final ElementType QUDAI_FALLING_FLOWER = null;
        public static final ElementType QUDAI_POND_KOI = null;
        public static final ElementType REALTIME_TEMPERATURE = null;
        public static final ElementType REALTIME_WEATHER = null;
        public static final ElementType STEP_DIGIT = null;
        public static final ElementType STEP_PROGRESS_DIGIT = null;
        public static final ElementType STEP_PROGRESS_IMAGE = null;
        public static final ElementType TIME_DIGIT = null;
        public static final ElementType WEATHER_FORECAST = null;
        public static final ElementType WEEKDAY_TEXT = null;
        private final byte value;

        private static final /* synthetic */ ElementType[] $values() {
            return new ElementType[]{PREVIEW, IMAGE, POINTER_H, POINTER_M, POINTER_S, DATE_DIGIT, TIME_DIGIT, AMPM, HOUR_TENS, HOUR_ONES, MINUTES_TENS, MINUTES_ONES, MONTH_TEXT, WEEKDAY_TEXT, STEP_DIGIT, CALORIE_DIGIT, DISTANCE_DIGIT, HR_DIGITAL, POWER_IMAGE, BT, FRAMES, REALTIME_WEATHER, REALTIME_TEMPERATURE, WEATHER_FORECAST, STEP_PROGRESS_IMAGE, CALORIE_PROGRESS_IMAGE, DISTANCE_PROGRESS_IMAGE, HR_LEVEL, STEP_PROGRESS_DIGIT, CALORIE_PROGRESS_DIGIT, DISTANCE_PROGRESS_DIGIT, POWER_DIGIT, ANIM, QUDAI_BUTTERFLY, QUDAI_POND_KOI, QUDAI_FALLING_FLOWER, MAX};
        }

        static {
            PREVIEW = new ElementType("PREVIEW", 0, (byte) 0);
            IMAGE = new ElementType(ShareConstants.IMAGE_URL, 1, (byte) 1);
            POINTER_H = new ElementType("POINTER_H", 2, (byte) 2);
            POINTER_M = new ElementType("POINTER_M", 3, (byte) 3);
            POINTER_S = new ElementType("POINTER_S", 4, (byte) 4);
            DATE_DIGIT = new ElementType("DATE_DIGIT", 5, (byte) 5);
            TIME_DIGIT = new ElementType("TIME_DIGIT", 6, (byte) 6);
            AMPM = new ElementType("AMPM", 7, (byte) 7);
            HOUR_TENS = new ElementType("HOUR_TENS", 8, (byte) 8);
            HOUR_ONES = new ElementType("HOUR_ONES", 9, (byte) 9);
            MINUTES_TENS = new ElementType("MINUTES_TENS", 10, (byte) 10);
            MINUTES_ONES = new ElementType("MINUTES_ONES", 11, (byte) 11);
            MONTH_TEXT = new ElementType("MONTH_TEXT", 12, (byte) 12);
            WEEKDAY_TEXT = new ElementType("WEEKDAY_TEXT", 13, (byte) 13);
            STEP_DIGIT = new ElementType("STEP_DIGIT", 14, (byte) 14);
            CALORIE_DIGIT = new ElementType("CALORIE_DIGIT", 15, (byte) 15);
            DISTANCE_DIGIT = new ElementType("DISTANCE_DIGIT", 16, (byte) 16);
            HR_DIGITAL = new ElementType("HR_DIGITAL", 17, (byte) 17);
            POWER_IMAGE = new ElementType("POWER_IMAGE", 18, (byte) 18);
            BT = new ElementType("BT", 19, (byte) 19);
            FRAMES = new ElementType("FRAMES", 20, (byte) 20);
            REALTIME_WEATHER = new ElementType("REALTIME_WEATHER", 21, (byte) 21);
            REALTIME_TEMPERATURE = new ElementType("REALTIME_TEMPERATURE", 22, (byte) 22);
            WEATHER_FORECAST = new ElementType("WEATHER_FORECAST", 23, (byte) 23);
            STEP_PROGRESS_IMAGE = new ElementType("STEP_PROGRESS_IMAGE", 24, (byte) 24);
            CALORIE_PROGRESS_IMAGE = new ElementType("CALORIE_PROGRESS_IMAGE", 25, (byte) 25);
            DISTANCE_PROGRESS_IMAGE = new ElementType("DISTANCE_PROGRESS_IMAGE", 26, (byte) 26);
            HR_LEVEL = new ElementType("HR_LEVEL", 27, (byte) 27);
            STEP_PROGRESS_DIGIT = new ElementType("STEP_PROGRESS_DIGIT", 28, (byte) 28);
            CALORIE_PROGRESS_DIGIT = new ElementType("CALORIE_PROGRESS_DIGIT", 29, (byte) 29);
            DISTANCE_PROGRESS_DIGIT = new ElementType("DISTANCE_PROGRESS_DIGIT", 30, (byte) 30);
            POWER_DIGIT = new ElementType("POWER_DIGIT", 31, (byte) 32);
            ANIM = new ElementType("ANIM", 32, (byte) 33);
            QUDAI_BUTTERFLY = new ElementType("QUDAI_BUTTERFLY", 33, (byte) 35);
            QUDAI_POND_KOI = new ElementType("QUDAI_POND_KOI", 34, (byte) 36);
            QUDAI_FALLING_FLOWER = new ElementType("QUDAI_FALLING_FLOWER", 35, (byte) 37);
            MAX = new ElementType("MAX", 36, (byte) 38);
            ElementType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private ElementType(String r1, int r2, byte r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<ElementType> getEntries() {
            return $ENTRIES;
        }

        public static ElementType valueOf(String r1) {
            return (ElementType) Enum.valueOf(ElementType.class, r1);
        }

        public static ElementType[] values() {
            return (ElementType[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public static final enum ImageFormatType extends Enum<ImageFormatType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ ImageFormatType[] $VALUES = null;
        public static final ImageFormatType FORMAT_ARGB8565 = null;
        public static final ImageFormatType FORMAT_ARGB8888 = null;
        public static final ImageFormatType FORMAT_RGB565 = null;
        public static final ImageFormatType FORMAT_RGB888 = null;
        private final int value;

        private static final /* synthetic */ ImageFormatType[] $values() {
            return new ImageFormatType[]{FORMAT_ARGB8888, FORMAT_RGB888, FORMAT_ARGB8565, FORMAT_RGB565};
        }

        static {
            FORMAT_ARGB8888 = new ImageFormatType("FORMAT_ARGB8888", 0, 0);
            FORMAT_RGB888 = new ImageFormatType("FORMAT_RGB888", 1, 1);
            FORMAT_ARGB8565 = new ImageFormatType("FORMAT_ARGB8565", 2, 2);
            FORMAT_RGB565 = new ImageFormatType("FORMAT_RGB565", 3, 3);
            ImageFormatType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private ImageFormatType(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<ImageFormatType> getEntries() {
            return $ENTRIES;
        }

        public static ImageFormatType valueOf(String r1) {
            return (ImageFormatType) Enum.valueOf(ImageFormatType.class, r1);
        }

        public static ImageFormatType[] values() {
            return (ImageFormatType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final enum ImageType extends Enum<ImageType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ ImageType[] $VALUES = null;
        public static final ImageType LV_COLOR_FORMAT_A1 = null;
        public static final ImageType LV_COLOR_FORMAT_A2 = null;
        public static final ImageType LV_COLOR_FORMAT_A4 = null;
        public static final ImageType LV_COLOR_FORMAT_A8 = null;
        public static final ImageType LV_COLOR_FORMAT_ARGB8565 = null;
        public static final ImageType LV_COLOR_FORMAT_ARGB8888 = null;
        public static final ImageType LV_COLOR_FORMAT_I1 = null;
        public static final ImageType LV_COLOR_FORMAT_I2 = null;
        public static final ImageType LV_COLOR_FORMAT_I4 = null;
        public static final ImageType LV_COLOR_FORMAT_I8 = null;
        public static final ImageType LV_COLOR_FORMAT_L8 = null;
        public static final ImageType LV_COLOR_FORMAT_RAW = null;
        public static final ImageType LV_COLOR_FORMAT_RAW_ALPHA = null;
        public static final ImageType LV_COLOR_FORMAT_RGB565 = null;
        public static final ImageType LV_COLOR_FORMAT_RGB565A8 = null;
        public static final ImageType LV_COLOR_FORMAT_RGB888 = null;
        public static final ImageType LV_COLOR_FORMAT_UNKNOWN = null;
        public static final ImageType LV_COLOR_FORMAT_XRGB8888 = null;
        private final byte value;

        private static final /* synthetic */ ImageType[] $values() {
            return new ImageType[]{LV_COLOR_FORMAT_UNKNOWN, LV_COLOR_FORMAT_RAW, LV_COLOR_FORMAT_RAW_ALPHA, LV_COLOR_FORMAT_L8, LV_COLOR_FORMAT_I1, LV_COLOR_FORMAT_I2, LV_COLOR_FORMAT_I4, LV_COLOR_FORMAT_I8, LV_COLOR_FORMAT_A8, LV_COLOR_FORMAT_RGB565, LV_COLOR_FORMAT_ARGB8565, LV_COLOR_FORMAT_RGB565A8, LV_COLOR_FORMAT_RGB888, LV_COLOR_FORMAT_ARGB8888, LV_COLOR_FORMAT_XRGB8888, LV_COLOR_FORMAT_A1, LV_COLOR_FORMAT_A2, LV_COLOR_FORMAT_A4};
        }

        static {
            LV_COLOR_FORMAT_UNKNOWN = new ImageType("LV_COLOR_FORMAT_UNKNOWN", 0, (byte) 0);
            LV_COLOR_FORMAT_RAW = new ImageType("LV_COLOR_FORMAT_RAW", 1, (byte) 1);
            LV_COLOR_FORMAT_RAW_ALPHA = new ImageType("LV_COLOR_FORMAT_RAW_ALPHA", 2, (byte) 2);
            LV_COLOR_FORMAT_L8 = new ImageType("LV_COLOR_FORMAT_L8", 3, (byte) 6);
            LV_COLOR_FORMAT_I1 = new ImageType("LV_COLOR_FORMAT_I1", 4, (byte) 7);
            LV_COLOR_FORMAT_I2 = new ImageType("LV_COLOR_FORMAT_I2", 5, (byte) 8);
            LV_COLOR_FORMAT_I4 = new ImageType("LV_COLOR_FORMAT_I4", 6, (byte) 9);
            LV_COLOR_FORMAT_I8 = new ImageType("LV_COLOR_FORMAT_I8", 7, (byte) 10);
            LV_COLOR_FORMAT_A8 = new ImageType("LV_COLOR_FORMAT_A8", 8, (byte) 14);
            LV_COLOR_FORMAT_RGB565 = new ImageType("LV_COLOR_FORMAT_RGB565", 9, (byte) 18);
            LV_COLOR_FORMAT_ARGB8565 = new ImageType("LV_COLOR_FORMAT_ARGB8565", 10, (byte) 19);
            LV_COLOR_FORMAT_RGB565A8 = new ImageType("LV_COLOR_FORMAT_RGB565A8", 11, (byte) 20);
            LV_COLOR_FORMAT_RGB888 = new ImageType("LV_COLOR_FORMAT_RGB888", 12, (byte) 15);
            LV_COLOR_FORMAT_ARGB8888 = new ImageType("LV_COLOR_FORMAT_ARGB8888", 13, (byte) 16);
            LV_COLOR_FORMAT_XRGB8888 = new ImageType("LV_COLOR_FORMAT_XRGB8888", 14, (byte) 17);
            LV_COLOR_FORMAT_A1 = new ImageType("LV_COLOR_FORMAT_A1", 15, (byte) 11);
            LV_COLOR_FORMAT_A2 = new ImageType("LV_COLOR_FORMAT_A2", 16, (byte) 12);
            LV_COLOR_FORMAT_A4 = new ImageType("LV_COLOR_FORMAT_A4", 17, (byte) 13);
            ImageType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private ImageType(String r1, int r2, byte r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<ImageType> getEntries() {
            return $ENTRIES;
        }

        public static ImageType valueOf(String r1) {
            return (ImageType) Enum.valueOf(ImageType.class, r1);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public static final enum McuPlatform extends Enum<McuPlatform> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ McuPlatform[] $VALUES = null;
        public static final McuPlatform JL701N = null;
        public static final McuPlatform JL707N = null;
        public static final McuPlatform NONE = null;
        public static final McuPlatform SIFLI = null;
        public static final McuPlatform SIMULATOR = null;
        private final int value;

        private static final /* synthetic */ McuPlatform[] $values() {
            return new McuPlatform[]{NONE, JL701N, JL707N, SIMULATOR, SIFLI};
        }

        static {
            NONE = new McuPlatform("NONE", 0, 0);
            JL701N = new McuPlatform("JL701N", 1, 1);
            JL707N = new McuPlatform("JL707N", 2, 2);
            SIMULATOR = new McuPlatform("SIMULATOR", 3, 3);
            SIFLI = new McuPlatform(BleDeviceInfo.PLATFORM_SIFLI, 4, 4);
            McuPlatform[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private McuPlatform(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<McuPlatform> getEntries() {
            return $ENTRIES;
        }

        public static McuPlatform valueOf(String r1) {
            return (McuPlatform) Enum.valueOf(McuPlatform.class, r1);
        }

        public static McuPlatform[] values() {
            return (McuPlatform[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    static {
        INSTANCE = new WatchFaceEnumUtil();
    }

    private WatchFaceEnumUtil() {
    }

    public final int getColorFormat(int r2) {
        if (r2 == 0) goto L18;
        if (r2 == 1) goto L16;
        if (r2 == 4) goto L14;
        if (r2 == 5) goto L12;
        return ImageType.LV_COLOR_FORMAT_ARGB8888.getValue();
    L12:
        return ImageType.LV_COLOR_FORMAT_RGB565.getValue();
    L14:
        return ImageType.LV_COLOR_FORMAT_RGB888.getValue();
    L16:
        return ImageType.LV_COLOR_FORMAT_ARGB8565.getValue();
    L18:
        return ImageType.LV_COLOR_FORMAT_ARGB8888.getValue();
    }

    public final byte getDigitFlag(byte r2) {
        if (r2 != ElementType.POINTER_H.getValue()) goto L7;
        return DigitFlag.TIME_DIGIT_FLAG_HOUR.getValue();
    L7:
        if (r2 != ElementType.POINTER_M.getValue()) goto L11;
        return DigitFlag.TIME_DIGIT_FLAG_MIN.getValue();
    L11:
        return DigitFlag.TIME_DIGIT_FLAG_SEC.getValue();
    }
}
