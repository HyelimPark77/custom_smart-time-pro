package com.jieli.jl_rcsp.util;

import com.jieli.jl_rcsp.model.device.health.HealthData;
import com.tenmeter.smlibrary.utils.FileUtils;

/* JADX INFO: loaded from: classes17.dex */
public class HealthDataUtil {

    public interface ParseResult<T> {
        void onResult(T r1);
    }

    public HealthDataUtil() {
    }

    public static void parseAirPressure(HealthData r5, ParseResult<Integer> r6, ParseResult<Integer> r7, ParseResult<Integer> r8) {
        if (r5.version == 0) goto L6;
        return;
    L6:
        if (r5.type != 1) goto L29;
        byte r0 = r5.subMask;
        if ((r0 & 255) == 255) goto L30;
        byte[] r2 = r5.data;
        int r4 = 0;
        if ((r0 & 1) != 1) goto L17;
        if (r6 == null) goto L15;
        r6.onResult(Integer.valueOf(CHexConver.bytesToInt(r2[0], r2[1])));
    L15:
        r4 = 2;
    L17:
        if ((r5.subMask & 2) != 2) goto L22;
        if (r7 == null) goto L20;
        r7.onResult(Integer.valueOf(CHexConver.bytesToInt(r2[r4], r2[r4 + 1])));
    L20:
        r4 = r4 + 2;
    L22:
        if ((r5.subMask & 4) != 4) goto L26;
        if (r8 == null) goto L27;
        r8.onResult(Integer.valueOf(CHexConver.bytesToInt(r2[r4], r2[r4 + 1])));
        return;
    L27:
        return;
    L26:
        return;
    L30:
        return;
    }

    public static void parseAltitude(HealthData r9, ParseResult<Double> r10, ParseResult<Double> r11, ParseResult<Double> r12) {
        if (r9.version == 0) goto L6;
        return;
    L6:
        if (r9.type != 2) goto L29;
        byte r0 = r9.subMask;
        if ((r0 & 255) == 255) goto L30;
        byte[] r2 = r9.data;
        int r7 = 0;
        if ((r0 & 1) != 1) goto L17;
        if (r10 == null) goto L15;
        r10.onResult(Double.valueOf(Double.parseDouble(CHexConver.bytesToInt(r2[0], r2[1]) + FileUtils.FILE_EXTENSION_SEPARATOR + CHexConver.bytesToInt(r2[2], r2[3]))));
    L15:
        r7 = 4;
    L17:
        if ((r9.subMask & 2) != 2) goto L22;
        if (r11 == null) goto L20;
        r11.onResult(Double.valueOf(Double.parseDouble(CHexConver.bytesToInt(r2[r7], r2[r7 + 1]) + FileUtils.FILE_EXTENSION_SEPARATOR + CHexConver.bytesToInt(r2[r7 + 2], r2[r7 + 3]))));
    L20:
        r7 = r7 + 4;
    L22:
        if ((r9.subMask & 4) != 4) goto L26;
        if (r12 == null) goto L27;
        r12.onResult(Double.valueOf(Double.parseDouble(CHexConver.bytesToInt(r2[r7], r2[r7 + 1]) + FileUtils.FILE_EXTENSION_SEPARATOR + CHexConver.bytesToInt(r2[r7 + 2], r2[r7 + 3]))));
        return;
    L27:
        return;
    L26:
        return;
    L30:
        return;
    }

    public static void parseBloodOxygen(HealthData r3, ParseResult<Integer> r4) {
        if (r3.version == 0) goto L6;
        return;
    L6:
        if (r3.type != 5) goto L19;
        byte r0 = r3.subMask;
        if ((r0 & 255) == 255) goto L20;
        byte[] r5 = r3.data;
        if ((r0 & 1) != 1) goto L16;
        if (r4 == null) goto L17;
        r4.onResult(Integer.valueOf(r5[0] & 255));
        return;
    L17:
        return;
    L16:
        return;
    L20:
        return;
    }

    public static void parseHeartRate(HealthData r4, ParseResult<Integer> r5, ParseResult<Integer> r6, ParseResult<Integer> r7) {
        if (r4.version == 0) goto L6;
        return;
    L6:
        if (r4.type != 0) goto L29;
        byte r0 = r4.subMask;
        if ((r0 & 255) == 255) goto L30;
        int r1 = 1;
        if ((r0 & 1) != 1) goto L15;
        if (r5 == null) goto L17;
        r5.onResult(Integer.valueOf(r4.data[0] & 255));
    L17:
        if ((r4.subMask & 2) != 2) goto L22;
        if (r6 == null) goto L20;
        r6.onResult(Integer.valueOf(r4.data[r1] & 255));
    L20:
        r1 = r1 + 1;
    L22:
        if ((r4.subMask & 4) != 4) goto L26;
        if (r7 == null) goto L27;
        r7.onResult(Integer.valueOf(r4.data[r1] & 255));
        return;
    L27:
        return;
    L26:
        return;
    L15:
        r1 = 0;
        goto L17
    L30:
        return;
    }

    public static void parseMaxOxygenUptake(HealthData r3, ParseResult<Integer> r4) {
        if (r3.version == 0) goto L6;
        return;
    L6:
        if (r3.type != 7) goto L19;
        byte r0 = r3.subMask;
        if ((r0 & 255) == 255) goto L20;
        byte[] r5 = r3.data;
        if ((r0 & 1) != 1) goto L16;
        if (r4 == null) goto L17;
        r4.onResult(Integer.valueOf(r5[0] & 255));
        return;
    L17:
        return;
    L16:
        return;
    L20:
        return;
    }

    public static void parsePressure(HealthData r3, ParseResult<Integer> r4) {
        if (r3.version == 0) goto L6;
        return;
    L6:
        if (r3.type != 4) goto L19;
        byte r0 = r3.subMask;
        if ((r0 & 255) == 255) goto L20;
        byte[] r5 = r3.data;
        if ((r0 & 1) != 1) goto L16;
        if (r4 == null) goto L17;
        r4.onResult(Integer.valueOf(r5[0] & 255));
        return;
    L17:
        return;
    L16:
        return;
    L20:
        return;
    }

    public static void parseSportRecoveryTime(HealthData r3, ParseResult<Float> r4) {
        if (r3.version == 0) goto L6;
        return;
    L6:
        if (r3.type != 8) goto L20;
        byte r0 = r3.subMask;
        if ((r0 & 255) == 255) goto L21;
        byte[] r5 = r3.data;
        if ((r0 & 1) != 1) goto L17;
        int r6 = r5[0] & 255;
        float r1 = (r6 >> 2) + ((r6 * 15.0f) / 60.0f);
        if (r4 == null) goto L18;
        r4.onResult(Float.valueOf(r1));
        return;
    L18:
        return;
    L17:
        return;
    L21:
        return;
    }

    public static void parseStep(HealthData r5, ParseResult<Integer> r6, ParseResult<Integer> r7) {
        if (r5.version == 0) goto L6;
        return;
    L6:
        if (r5.type != 3) goto L24;
        byte r0 = r5.subMask;
        if ((r0 & 255) == 255) goto L25;
        byte[] r1 = r5.data;
        int r4 = 0;
        if ((r0 & 1) != 1) goto L17;
        if (r6 == null) goto L15;
        r6.onResult(Integer.valueOf(CHexConver.bytesToInt(r1, 0, 4)));
    L15:
        r4 = 4;
    L17:
        if ((r5.subMask & 2) != 2) goto L21;
        if (r7 == null) goto L22;
        r7.onResult(Integer.valueOf(CHexConver.bytesToInt(r1, r4, 4)));
        return;
    L22:
        return;
    L21:
        return;
    L25:
        return;
    }

    public static void parseTrainingLoad(HealthData r3, ParseResult<Integer> r4) {
        if (r3.version == 0) goto L6;
        return;
    L6:
        if (r3.type != 6) goto L19;
        byte r0 = r3.subMask;
        if ((r0 & 255) == 255) goto L20;
        byte[] r5 = r3.data;
        if ((r0 & 1) != 1) goto L16;
        if (r4 == null) goto L17;
        r4.onResult(Integer.valueOf(r5[0] & 255));
        return;
    L17:
        return;
    L16:
        return;
    L20:
        return;
    }
}
