package com.sma.smartv3.db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I1010I0iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWorkout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Workout.kt\ncom/sma/smartv3/db/entity/WorkoutConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,638:1\n1563#2:639\n1634#2,3:640\n1563#2:643\n1634#2,3:644\n*S KotlinDebug\n*F\n+ 1 Workout.kt\ncom/sma/smartv3/db/entity/WorkoutConverter\n*L\n103#1:639\n103#1:640,3\n119#1:643\n119#1:644,3\n*E\n"})
public final class WorkoutConverter {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_WORKOUT_2 = 0;
    public static final int TYPE_WORKOUT_3 = 1;
    public static final int TYPE_WORKOUT_4 = 4;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public WorkoutConverter() {
    }

    @tb1
    @TypeConverter
    public final String floatArrayListToString(@tb1 List<float[]> r4) {
        if (r4 != null) goto L4;
        return null;
    L4:
        return new GsonBuilder().registerTypeAdapter(float[].class, new I1010I0iX()).create().toJson(r4);
    }

    @tb1
    @TypeConverter
    public final List<float[]> floatArrayToWatchList(@tb1 String r6) {
    L7:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO("workout floatArrayToWatchList e = " + e + "  ,  value = " + r6);
        return null;
    L4:
        if (TextUtils.isEmpty(r6) == true) goto L9;
        return I1010I0iX.OXO1(r6);
    L9:
        return null;
    }

    @tb1
    @TypeConverter
    public final String floatWatchToString(@tb1 List<Float> r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Gson().toJson(r2);
    }

    @tb1
    @TypeConverter
    public final String fromFloatArray(@tb1 float[] r11) {
        if (r11 != null) goto L4;
        return null;
    L4:
        if (r11.length != 0) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L9;
        return null;
    L9:
        return ArraysKt___ArraysKt.X01i0i(r11, I000IiI1O.iO.XO0O10, null, null, 0, null, null, 62, null);
    L6:
        r0 = false;
        goto L7
    }

    @tb1
    @TypeConverter
    public final String fromIntArray(@tb1 int[] r11) {
        if (r11 != null) goto L4;
        return null;
    L4:
        if (r11.length != 0) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L9;
        return null;
    L9:
        return ArraysKt___ArraysKt.OIXiiX(r11, I000IiI1O.iO.XO0O10, null, null, 0, null, null, 62, null);
    L6:
        r0 = false;
        goto L7
    }

    @tb1
    @TypeConverter
    public final String stopWatchListToString(@tb1 List<Integer> r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Gson().toJson(r2);
    }

    @tb1
    @TypeConverter
    public final List<Float> stringToFloatWatch(@tb1 String r3) {
        if (TextUtils.isEmpty(r3) == true) goto L6;
        Type r0 = new WorkoutConverter$stringToFloatWatch$listType$1().getType();
        return (List) new Gson().fromJson(r3, r0);
    L6:
        return null;
    }

    @tb1
    @TypeConverter
    public final List<Integer> stringToStopWatchList(@tb1 String r3) {
        if (TextUtils.isEmpty(r3) == true) goto L6;
        Type r0 = new WorkoutConverter$stringToStopWatchList$listType$1().getType();
        return (List) new Gson().fromJson(r3, r0);
    L6:
        return null;
    }

    @tb1
    @TypeConverter
    public final float[] toFloatArray(@tb1 String r11) {
        if (r11 != null) goto L5;
    L12:
        return null;
    L5:
        if (StringsKt__StringsKt.iIi011O(r11, I000IiI1O.iO.XO0O10, false, 2, null) != true) goto L12;
        List r12 = StringsKt__StringsKt.i1I(r11, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r12, 10));
        Iterator r13 = r12.iterator();
    L8:
        if (r13.hasNext() == false) goto L11;
        r0.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.iX1X1((String) r13.next()).toString())));
        goto L8
    L11:
        return CollectionsKt___CollectionsKt.O1XXXX(r0);
    }

    @tb1
    @TypeConverter
    public final int[] toIntArray(@tb1 String r11) {
        if (r11 != null) goto L5;
    L12:
        return null;
    L5:
        if (StringsKt__StringsKt.iIi011O(r11, I000IiI1O.iO.XO0O10, false, 2, null) != true) goto L12;
        List r12 = StringsKt__StringsKt.i1I(r11, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r12, 10));
        Iterator r13 = r12.iterator();
    L8:
        if (r13.hasNext() == false) goto L11;
        r0.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.iX1X1((String) r13.next()).toString())));
        goto L8
    L11:
        return CollectionsKt___CollectionsKt.O011OOIO0(r0);
    }
}
