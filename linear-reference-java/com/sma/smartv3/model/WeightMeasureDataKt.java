package com.sma.smartv3.model;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ed6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.ironsource.C2985d4;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,572:1\n1#2:573\n*E\n"})
public final class WeightMeasureDataKt {
    public static final double centigradeFilter(double r0) {
        return Double.parseDouble(keepOneDecimal(r0));
    }

    @SuppressLint({"SimpleDateFormat"})
    public static final int getAgeByBirth(@aa1 String r7) {
        Intrinsics.X0O(r7, "birthdayString");
        i72 r2 = i72.OXO1;     // Catch: Exception -> L32
        if (r2.IiXIIX1O1() == true) goto L6;
        Date r8 = new SimpleDateFormat("dd.MM.yyyy").parse(r7);     // Catch: Exception -> L32
    L11:
        Calendar r3 = Calendar.getInstance();     // Catch: Exception -> L32
        r3.setTime(new Date());     // Catch: Exception -> L32
        Calendar r4 = Calendar.getInstance();     // Catch: Exception -> L32
        r4.setTime(r8);     // Catch: Exception -> L32
        if (r4.after(r3) == false) goto L14;
        return 0;
    L14:
        int r5 = r3.get(1) - r4.get(1);     // Catch: Exception -> L32
        int r6 = r3.get(2) - r4.get(2);     // Catch: Exception -> L32
        int r9 = r3.get(5) - r4.get(5);     // Catch: Exception -> L32
        System.out.println(r5 + " " + r6 + " " + r9);     // Catch: Exception -> L32
        if (r6 <= 0) goto L25;
        if (r6 > 6) goto L19;
        if (r6 != 6) goto L35;
        if (r9 >= 0) goto L23;
        return r5;
    L23:
        return r5 + 1;
    L35:
        return r5;
    L19:
        return r5 + 1;
    L25:
        if (r6 < (-6)) goto L27;
        if (r6 != (-6)) goto L37;
        if (r9 < 0) goto L31;
        return r5;
    L31:
        return r5 - 1;
    L37:
        return r5;
    L27:
        return r5 - 1;
    L6:
        if (r2.XiOIO() != DateTimeFormat.MMddyyyy) goto L8;
        String r10 = O0X11OiO.OiIIX101O;
    L9:
        r8 = new SimpleDateFormat(r10).parse(r7);     // Catch: Exception -> L32
        goto L11
    L8:
        r10 = O0X11OiO.XX0;
    L32:
        return 0;
    }

    public static final int getLevel(double r6, @aa1 List<Double> r8) {
        Intrinsics.X0O(r8, "levelRange");
        if (r8.isEmpty() == true) goto L5;
        int r2 = 0;
        if (r8.size() == 1) goto L9;
        Iterator<T> r9 = r8.iterator();
        int r0 = 0;
    L19:
        if (r9.hasNext() == false) goto L24;
        int r1 = r2 + 1;
        if (r6 <= ((Number) r9.next()).doubleValue()) goto L22;
        int r5 = r2;
        r2 = r1;
        r0 = r5;
        goto L19
    L22:
        return r2;
    L24:
        return r0;
    L9:
        if (r6 >= r8.get(0).doubleValue()) goto L12;
        return 1;
    L12:
        if (r6 != r8.get(0).doubleValue()) goto L15;
        return 2;
    L15:
        return 3;
    L5:
        return (int) r6;
    }

    public static /* synthetic */ int getLevel$default(double r0, List r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = CollectionsKt__CollectionsKt.iI();
    L6:
        return getLevel(r0, r2);
    }

    @aa1
    public static final LevelType getLevelType(int r0, int r1) {
        if (r1 < r0) goto L4;
        if (r1 <= r0) goto L9;
        return LevelType.HIGH;
    L9:
        return LevelType.STANDARD;
    L4:
        return LevelType.LOW;
    }

    public static final double getWeightValue(double r1, int r3) {
        if (r3 == 1) goto L5;
        return r1;
    L5:
        return kg2Lbs(r1);
    }

    @aa1
    public static final String keepOneDecimal(double r3) {
        DecimalFormat r0 = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        r0.setRoundingMode(RoundingMode.DOWN);
        String r4 = r0.format(r3);
        Intrinsics.O10IXXX0X(r4, "format(...)");
        return r4;
    }

    public static final double kg2Lbs(double r2) {
        return r2 * ((double) 2.20462f);
    }

    public static final void setBarView(@aa1 SegmentedBarView r16, double r17, @aa1 List<Double> r19, @aa1 String[] r20, @aa1 int[] r21, boolean r22) {
        double r1 = r17;
        int[] r5 = r21;
        Intrinsics.X0O(r16, "sbv");
        Intrinsics.X0O(r19, "levelRange");
        Intrinsics.X0O(r20, "levelRangeText");
        Intrinsics.X0O(r5, "levelColor");
        ArrayList r6 = new ArrayList();
        int r9 = 0;
        if (r19.isEmpty() == true) goto L37;
        int r7 = r20.length;
    L6:
        if (r9 >= r7) goto L33;
        if (r9 > r19.size()) goto L33;
        if (r9 != 0) goto L11;
        float r11 = 0.0f;
    L13:
        if (r9 != (r19.size() - 1)) goto L15;
        float r12 = ((float) (((double) r11) - r19.get(r9 - 1).doubleValue())) + r11;
    L16:
        iz3 r13 = new iz3(r11, r12, r20[r9], r5[r9]).X1ii("");
        if (r22 == false) goto L25;
        if (r9 != 0) goto L21;
        r13.X1ii(String.valueOf(r11));
    L32:
        Intrinsics.XXI(r13);
        r6.add(r13);
        r9 = r9 + 1;
        r5 = r21;
        goto L6
    L21:
        if (r9 != (r20.length - 1)) goto L23;
        r13.X1ii(String.valueOf(r12));
        goto L32
    L23:
        r13.X1ii(r11 + C2985d4.j.c + r12);
        goto L32
    L25:
        if (r20.length != 2) goto L28;
        if (r9 != 1) goto L32;
        r13.X1ii(r11 + C2985d4.j.c);
        goto L32
    L28:
        if (r9 == 0) goto L32;
        if (r9 == (r20.length - 1)) goto L32;
        r13.X1ii(r11 + C2985d4.j.c + r12);
        goto L32
    L15:
        r12 = (float) r19.get(r9 + 1).doubleValue();
        goto L16
    L11:
        r11 = (float) r19.get(r9).doubleValue();
    L33:
        r16.setShowDescriptionText(true);
        if (r1 <= r19.get(r19.size() - 1).doubleValue()) goto L36;
        r1 = r19.get(r19.size() - 1).doubleValue();
    L36:
        r16.setValue(Float.valueOf((float) r1));
    L40:
        r16.setSegments(r6);
        r16.setDescriptionTextColor(gk4.iO(r16.getContext(), R.color.text_color));
        r16.setDescriptionTopTextColor(gk4.iO(r16.getContext(), R.color.text_color));
        return;
    L37:
        int r2 = r20.length;
    L38:
        if (r9 >= r2) goto L40;
        int r8 = r9 + 1;
        iz3 r3 = new iz3(r9, r8, r20[r9], r21[r9]).X1ii("");
        Intrinsics.XXI(r3);
        r6.add(r3);
        r9 = r8;
        goto L38
    }

    public static /* synthetic */ void setBarView$default(SegmentedBarView r7, double r8, List r10, String[] r11, int[] r12, boolean r13, int r14, Object r15) {
        if ((r14 & 32) == 0) goto L5;
        r13 = false;
    L5:
        setBarView(r7, r8, r10, r11, r12, r13);
    }

    public static final void setBmi(@tb1 SegmentedBarView r8, float r9, @aa1 List<Double> r10, @aa1 String[] r11, @aa1 int[] r12, boolean r13) {
        Intrinsics.X0O(r10, "levelRange");
        Intrinsics.X0O(r11, "levelRangeText");
        Intrinsics.X0O(r12, "levelColor");
        Intrinsics.XXI(r8);
        setTopCenterBarView(r8, r9, r10, r11, r12, r13);
    }

    public static final void setLevelView(@aa1 TextView r3, int r4, @aa1 String[] r5, @aa1 int[] r6) {
        Intrinsics.X0O(r3, "view");
        Intrinsics.X0O(r5, "levelRangeText");
        Intrinsics.X0O(r6, "levelColor");
        boolean r1 = true;
        if (r5.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L13;
        if (r4 >= 0) goto L9;
    L11:
        r3.setVisibility(8);
        goto L13
    L9:
        if (r4 >= r5.length) goto L11;
        r3.setText(r5[r4]);
    L13:
        if (r6.length == 0) goto L16;
        r1 = false;
    L16:
        if (r1 == true) goto L24;
        if (r4 >= 0) goto L19;
    L21:
        int r7 = r6[0];
    L22:
        r3.setTextColor(r7);
        Drawable r8 = ContextCompat.getDrawable(r3.getContext(), R.drawable.shape_measure_state_bg);
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable r9 = (GradientDrawable) r8;
        r9.setStroke((int) ed6.O00(1.0f), r7);
        LibExKt.iii0(r3, r9);
        r3.invalidateDrawable(r9);
        return;
    L19:
        if (r4 >= r6.length) goto L21;
        r7 = r6[r4];
        goto L22
    L24:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static final void setTopCenterBarView(@aa1 SegmentedBarView r16, double r17, @aa1 List<Double> r19, @aa1 String[] r20, @aa1 int[] r21, boolean r22) {
        double r1 = r17;
        Intrinsics.X0O(r16, "sbv");
        Intrinsics.X0O(r19, "levelRange");
        Intrinsics.X0O(r20, "levelRangeText");
        Intrinsics.X0O(r21, "levelColor");
        ArrayList r6 = new ArrayList();
        if (r19.isEmpty() == true) goto L31;
        int r7 = r20.length;
        int r10 = 0;
    L5:
        if (r10 >= r7) goto L25;
        if (r10 > r19.size()) goto L25;
        if (r10 != 0) goto L10;
        float r11 = 0.0f;
    L12:
        if (r10 != (r19.size() - 1)) goto L14;
        float r12 = ((float) (((double) r11) - r19.get(r10 - 1).doubleValue())) + r11;
    L15:
        iz3 r13 = new iz3(r11, r12, r20[r10], r21[r10]).X1ii("");
        if (r22 == true) goto L18;
    L22:
        r13.X1ii("");
    L23:
        Intrinsics.XXI(r13);
        r6.add(r13);
        r10 = r10 + 1;
        goto L5
    L18:
        if (r11 >= r1) goto L22;
        if (r1 >= r12) goto L22;
        r13.X1ii(r20[r10]);
        goto L23
    L14:
        r12 = (float) r19.get(r10 + 1).doubleValue();
        goto L15
    L10:
        r11 = (float) r19.get(r10).doubleValue();
    L25:
        if (r1 != (-1.0d)) goto L28;
    L34:
        r16.setShowDescriptionText(false);
        r16.setSegments(r6);
        r16.setDescriptionTextColor(ContextCompat.getColor(r16.getContext(), R.color.abh_text_color));
        return;
    L28:
        if (r1 <= r19.get(r19.size() - 1).doubleValue()) goto L30;
        r1 = r19.get(r19.size() - 1).doubleValue();
    L30:
        r16.setValue(Float.valueOf((float) r1));
        goto L34
    L31:
        int r2 = r20.length;
        int r3 = 0;
    L32:
        if (r3 >= r2) goto L34;
        int r14 = r3 + 1;
        iz3 r4 = new iz3(r3, r14, r20[r3], r21[r3]).X1ii("");
        Intrinsics.XXI(r4);
        r6.add(r4);
        r3 = r14;
        goto L32
    }

    public static /* synthetic */ void setTopCenterBarView$default(SegmentedBarView r7, double r8, List r10, String[] r11, int[] r12, boolean r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        r8 = -1.0d;
    L5:
        double r1 = r8;
        if ((r14 & 32) == 0) goto L8;
        r13 = true;
    L8:
        setTopCenterBarView(r7, r1, r10, r11, r12, r13);
    }
}
