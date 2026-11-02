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
import com.ironsource.C12616d4;
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
    public static final double centigradeFilter(double d) {
        return Double.parseDouble(keepOneDecimal(d));
    }

    @SuppressLint({"SimpleDateFormat"})
    public static final int getAgeByBirth(@aa1 String birthdayString) {
        Date date;
        Intrinsics.X0O(birthdayString, "birthdayString");
        try {
            i72 i72Var = i72.OXO1;
            if (i72Var.IiXIIX1O1()) {
                date = new SimpleDateFormat(i72Var.XiOIO() == DateTimeFormat.MMddyyyy ? O0X11OiO.OiIIX101O : O0X11OiO.XX0).parse(birthdayString);
            } else {
                date = new SimpleDateFormat("dd.MM.yyyy").parse(birthdayString);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date);
            if (calendar2.after(calendar)) {
                return 0;
            }
            int i = calendar.get(1) - calendar2.get(1);
            int i2 = calendar.get(2) - calendar2.get(2);
            int i3 = calendar.get(5) - calendar2.get(5);
            System.out.println((Object) (i + " " + i2 + " " + i3));
            if (i2 > 0) {
                if (i2 > 6) {
                    return i + 1;
                }
                return (i2 != 6 || i3 < 0) ? i : i + 1;
            }
            if (i2 < -6) {
                return i - 1;
            }
            return (i2 != -6 || i3 >= 0) ? i : i - 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int getLevel(double d, @aa1 List<Double> levelRange) {
        Intrinsics.X0O(levelRange, "levelRange");
        if (levelRange.isEmpty()) {
            return (int) d;
        }
        int i = 0;
        if (levelRange.size() == 1) {
            if (d < levelRange.get(0).doubleValue()) {
                return 1;
            }
            return d == levelRange.get(0).doubleValue() ? 2 : 3;
        }
        Iterator<T> it = levelRange.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i + 1;
            if (d <= ((Number) it.next()).doubleValue()) {
                return i;
            }
            int i4 = i;
            i = i3;
            i2 = i4;
        }
        return i2;
    }

    public static /* synthetic */ int getLevel$default(double d, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.m39402iI();
        }
        return getLevel(d, list);
    }

    @aa1
    public static final LevelType getLevelType(int i, int i2) {
        if (i2 < i) {
            return LevelType.LOW;
        }
        return i2 > i ? LevelType.HIGH : LevelType.STANDARD;
    }

    public static final double getWeightValue(double d, int i) {
        return i == 1 ? kg2Lbs(d) : d;
    }

    @aa1
    public static final String keepOneDecimal(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String str = decimalFormat.format(d);
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public static final double kg2Lbs(double d) {
        return d * ((double) 2.20462f);
    }

    public static final void setBarView(@aa1 SegmentedBarView sbv, double d, @aa1 List<Double> levelRange, @aa1 String[] levelRangeText, @aa1 int[] iArr, boolean z) {
        double dDoubleValue = d;
        int[] levelColor = iArr;
        Intrinsics.X0O(sbv, "sbv");
        Intrinsics.X0O(levelRange, "levelRange");
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(levelColor, "levelColor");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (levelRange.isEmpty()) {
            int length = levelRangeText.length;
            while (i < length) {
                int i2 = i + 1;
                iz3 iz3VarX1ii = new iz3(i, i2, levelRangeText[i], iArr[i]).X1ii("");
                Intrinsics.XXI(iz3VarX1ii);
                arrayList.add(iz3VarX1ii);
                i = i2;
            }
        } else {
            int length2 = levelRangeText.length;
            while (i < length2 && i <= levelRange.size()) {
                float fDoubleValue = i == 0 ? 0.0f : (float) levelRange.get(i).doubleValue();
                float fDoubleValue2 = i == levelRange.size() - 1 ? ((float) (((double) fDoubleValue) - levelRange.get(i - 1).doubleValue())) + fDoubleValue : (float) levelRange.get(i + 1).doubleValue();
                iz3 iz3VarX1ii2 = new iz3(fDoubleValue, fDoubleValue2, levelRangeText[i], levelColor[i]).X1ii("");
                if (z) {
                    if (i == 0) {
                        iz3VarX1ii2.X1ii(String.valueOf(fDoubleValue));
                    } else if (i == levelRangeText.length - 1) {
                        iz3VarX1ii2.X1ii(String.valueOf(fDoubleValue2));
                    } else {
                        iz3VarX1ii2.X1ii(fDoubleValue + C12616d4.j.f34438c + fDoubleValue2);
                    }
                } else if (levelRangeText.length == 2) {
                    if (i == 1) {
                        iz3VarX1ii2.X1ii(fDoubleValue + C12616d4.j.f34438c);
                    }
                } else if (i != 0 && i != levelRangeText.length - 1) {
                    iz3VarX1ii2.X1ii(fDoubleValue + C12616d4.j.f34438c + fDoubleValue2);
                }
                Intrinsics.XXI(iz3VarX1ii2);
                arrayList.add(iz3VarX1ii2);
                i++;
                levelColor = iArr;
            }
            sbv.setShowDescriptionText(true);
            if (dDoubleValue > levelRange.get(levelRange.size() - 1).doubleValue()) {
                dDoubleValue = levelRange.get(levelRange.size() - 1).doubleValue();
            }
            sbv.setValue(Float.valueOf((float) dDoubleValue));
        }
        sbv.setSegments(arrayList);
        sbv.setDescriptionTextColor(gk4.m1859iO(sbv.getContext(), R.color.text_color));
        sbv.setDescriptionTopTextColor(gk4.m1859iO(sbv.getContext(), R.color.text_color));
    }

    public static /* synthetic */ void setBarView$default(SegmentedBarView segmentedBarView, double d, List list, String[] strArr, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        setBarView(segmentedBarView, d, list, strArr, iArr, z);
    }

    public static final void setBmi(@tb1 SegmentedBarView segmentedBarView, float f, @aa1 List<Double> levelRange, @aa1 String[] levelRangeText, @aa1 int[] levelColor, boolean z) {
        Intrinsics.X0O(levelRange, "levelRange");
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(levelColor, "levelColor");
        Intrinsics.XXI(segmentedBarView);
        setTopCenterBarView(segmentedBarView, f, levelRange, levelRangeText, levelColor, z);
    }

    public static final void setLevelView(@aa1 TextView view, int i, @aa1 String[] levelRangeText, @aa1 int[] levelColor) {
        Intrinsics.X0O(view, "view");
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(levelColor, "levelColor");
        if (!(levelRangeText.length == 0)) {
            if (i < 0 || i >= levelRangeText.length) {
                view.setVisibility(8);
            } else {
                view.setText(levelRangeText[i]);
            }
        }
        if (levelColor.length == 0) {
            return;
        }
        int i2 = (i < 0 || i >= levelColor.length) ? levelColor[0] : levelColor[i];
        view.setTextColor(i2);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), R.drawable.shape_measure_state_bg);
        Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setStroke((int) ed6.O00(1.0f), i2);
        LibExKt.iii0(view, gradientDrawable);
        view.invalidateDrawable(gradientDrawable);
    }

    public static final void setTopCenterBarView(@aa1 SegmentedBarView sbv, double d, @aa1 List<Double> levelRange, @aa1 String[] levelRangeText, @aa1 int[] levelColor, boolean z) {
        double dDoubleValue = d;
        Intrinsics.X0O(sbv, "sbv");
        Intrinsics.X0O(levelRange, "levelRange");
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(levelColor, "levelColor");
        ArrayList arrayList = new ArrayList();
        if (levelRange.isEmpty()) {
            int length = levelRangeText.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                iz3 iz3VarX1ii = new iz3(i, i2, levelRangeText[i], levelColor[i]).X1ii("");
                Intrinsics.XXI(iz3VarX1ii);
                arrayList.add(iz3VarX1ii);
                i = i2;
            }
        } else {
            int length2 = levelRangeText.length;
            int i3 = 0;
            while (i3 < length2 && i3 <= levelRange.size()) {
                float fDoubleValue = i3 == 0 ? 0.0f : (float) levelRange.get(i3).doubleValue();
                float fDoubleValue2 = i3 == levelRange.size() + (-1) ? ((float) (((double) fDoubleValue) - levelRange.get(i3 - 1).doubleValue())) + fDoubleValue : (float) levelRange.get(i3 + 1).doubleValue();
                iz3 iz3VarX1ii2 = new iz3(fDoubleValue, fDoubleValue2, levelRangeText[i3], levelColor[i3]).X1ii("");
                if (!z || fDoubleValue >= dDoubleValue || dDoubleValue >= fDoubleValue2) {
                    iz3VarX1ii2.X1ii("");
                } else {
                    iz3VarX1ii2.X1ii(levelRangeText[i3]);
                }
                Intrinsics.XXI(iz3VarX1ii2);
                arrayList.add(iz3VarX1ii2);
                i3++;
            }
            if (dDoubleValue != -1.0d) {
                if (dDoubleValue > levelRange.get(levelRange.size() - 1).doubleValue()) {
                    dDoubleValue = levelRange.get(levelRange.size() - 1).doubleValue();
                }
                sbv.setValue(Float.valueOf((float) dDoubleValue));
            }
        }
        sbv.setShowDescriptionText(false);
        sbv.setSegments(arrayList);
        sbv.setDescriptionTextColor(ContextCompat.getColor(sbv.getContext(), R.color.abh_text_color));
    }

    public static /* synthetic */ void setTopCenterBarView$default(SegmentedBarView segmentedBarView, double d, List list, String[] strArr, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            d = -1.0d;
        }
        double d2 = d;
        if ((i & 32) != 0) {
            z = true;
        }
        setTopCenterBarView(segmentedBarView, d2, list, strArr, iArr, z);
    }
}
