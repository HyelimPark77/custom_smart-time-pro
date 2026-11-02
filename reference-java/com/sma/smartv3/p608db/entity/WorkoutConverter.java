package com.sma.smartv3.p608db.entity;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I1010I0iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
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
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_WORKOUT_2 = 0;
    public static final int TYPE_WORKOUT_3 = 1;
    public static final int TYPE_WORKOUT_4 = 4;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @tb1
    @TypeConverter
    public final String floatArrayListToString(@tb1 List<float[]> list) {
        if (list != null) {
            return new GsonBuilder().registerTypeAdapter(float[].class, new I1010I0iX()).create().toJson(list);
        }
        return null;
    }

    @tb1
    @TypeConverter
    public final List<float[]> floatArrayToWatchList(@tb1 String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return I1010I0iX.OXO1(str);
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO("workout floatArrayToWatchList e = " + e + "  ,  value = " + str);
            return null;
        }
    }

    @tb1
    @TypeConverter
    public final String floatWatchToString(@tb1 List<Float> list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    @tb1
    @TypeConverter
    public final String fromFloatArray(@tb1 float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return null;
        }
        return ArraysKt___ArraysKt.X01i0i(fArr, I000IiI1O.C2156iO.XO0O10, null, null, 0, null, null, 62, null);
    }

    @tb1
    @TypeConverter
    public final String fromIntArray(@tb1 int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return null;
        }
        return ArraysKt___ArraysKt.OIXiiX(iArr, I000IiI1O.C2156iO.XO0O10, null, null, 0, null, null, 62, null);
    }

    @tb1
    @TypeConverter
    public final String stopWatchListToString(@tb1 List<Integer> list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    @tb1
    @TypeConverter
    public final List<Float> stringToFloatWatch(@tb1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (List) new Gson().fromJson(str, new TypeToken<List<? extends Float>>() { // from class: com.sma.smartv3.db.entity.WorkoutConverter$stringToFloatWatch$listType$1
        }.getType());
    }

    @tb1
    @TypeConverter
    public final List<Integer> stringToStopWatchList(@tb1 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (List) new Gson().fromJson(str, new TypeToken<List<? extends Integer>>() { // from class: com.sma.smartv3.db.entity.WorkoutConverter$stringToStopWatchList$listType$1
        }.getType());
    }

    @tb1
    @TypeConverter
    public final float[] toFloatArray(@tb1 String str) {
        if (str == null || !StringsKt__StringsKt.iIi011O(str, I000IiI1O.C2156iO.XO0O10, false, 2, null)) {
            return null;
        }
        List listI1I = StringsKt__StringsKt.i1I(str, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listI1I, 10));
        Iterator it = listI1I.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.iX1X1((String) it.next()).toString())));
        }
        return CollectionsKt___CollectionsKt.O1XXXX(arrayList);
    }

    @tb1
    @TypeConverter
    public final int[] toIntArray(@tb1 String str) {
        if (str == null || !StringsKt__StringsKt.iIi011O(str, I000IiI1O.C2156iO.XO0O10, false, 2, null)) {
            return null;
        }
        List listI1I = StringsKt__StringsKt.i1I(str, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listI1I, 10));
        Iterator it = listI1I.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.iX1X1((String) it.next()).toString())));
        }
        return CollectionsKt___CollectionsKt.O011OOIO0(arrayList);
    }
}
