package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nEnergyRatingData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingData.kt\ncom/sma/smartv3/model/EnergyRatingDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1969#2,14:72\n*S KotlinDebug\n*F\n+ 1 EnergyRatingData.kt\ncom/sma/smartv3/model/EnergyRatingDataKt\n*L\n55#1:72,14\n*E\n"})
public final class EnergyRatingDataKt {
    public static final void filterEnergyRatingDayData(@aa1 List<EnergyRating> r11, @aa1 LinkedHashMap<Long, ArrayList<EnergyRating>> r12, @aa1 List<Entry> r13) {
        Intrinsics.X0O(r11, "data");
        Intrinsics.X0O(r12, "weekData");
        Intrinsics.X0O(r13, "values");
        Iterator<EnergyRating> r14 = r11.iterator();
    L4:
        if (r14.hasNext() == false) goto L11;
        EnergyRating r0 = r14.next();
        Iterator<Map.Entry<Long, ArrayList<EnergyRating>>> r1 = r12.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<EnergyRating>> r2 = r1.next();
        long r3 = r2.getKey().longValue();
        ArrayList<EnergyRating> r4 = r2.getValue();
        if (r0.getMTime() <= r3) goto L7;
        r4.add(r0);
        goto L4
    L11:
        ArrayList r15 = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<EnergyRating>>> r16 = r12.entrySet().iterator();
    L13:
        if (r16.hasNext() == false) goto L31;
        ArrayList<EnergyRating> r5 = r16.next().getValue();
        EnergyRating r6 = new EnergyRating(0, 0, null, 0, 0, 0, 63, null);
        if (r5.isEmpty() == true) goto L30;
        Iterator<T> r7 = r5.iterator();
        if (r7.hasNext() == false) goto L29;
        Object r8 = r7.next();
        if (r7.hasNext() == false) goto L27;
        int r9 = ((EnergyRating) r8).getMScore();
    L22:
        Object r10 = r7.next();
        int r17 = ((EnergyRating) r10).getMScore();
        if (r9 >= r17) goto L26;
        r8 = r10;
        r9 = r17;
    L26:
        if (r7.hasNext() == true) goto L22;
    L27:
        r6 = (EnergyRating) r8;
        goto L30
    L29:
        throw new NoSuchElementException();
    L30:
        r15.add(r6);
        goto L13
    L31:
        Iterator r18 = r15.iterator();
        float r19 = 0.0f;
    L33:
        if (r18.hasNext() == false) goto L38;
        EnergyRating r20 = (EnergyRating) r18.next();
        if (r20.getMScore() == 0) goto L37;
        r13.add(new Entry(r19, r20.getMScore()));
    L37:
        r19 = r19 + 1.0f;
        goto L33
    }

    @aa1
    public static final List<Integer> getEnergyRatingColorLevel(@aa1 Context r5) {
        Intrinsics.X0O(r5, "mContext");
        return CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(gk4.iO(r5, R.color.energy_rating_0)), Integer.valueOf(gk4.iO(r5, R.color.energy_rating_1)), Integer.valueOf(gk4.iO(r5, R.color.energy_rating_2)), Integer.valueOf(gk4.iO(r5, R.color.energy_rating_3)), Integer.valueOf(gk4.iO(r5, R.color.energy_rating_4))});
    }

    public static final int getEnergyRatingLevel(int r2) {
        if (80 > r2) goto L9;
        if (r2 >= 101) goto L9;
        return 4;
    L9:
        if (60 > r2) goto L14;
        if (r2 >= 80) goto L14;
        return 3;
    L14:
        if (40 > r2) goto L19;
        if (r2 >= 60) goto L19;
        return 2;
    L19:
        if (20 <= r2) goto L21;
        return 0;
    L21:
        if (r2 >= 30) goto L26;
        return 1;
    L26:
        return 0;
    }
}
