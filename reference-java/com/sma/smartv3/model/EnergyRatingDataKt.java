package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.EnergyRating;
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
    public static final void filterEnergyRatingDayData(@aa1 List<EnergyRating> data, @aa1 LinkedHashMap<Long, ArrayList<EnergyRating>> weekData, @aa1 List<Entry> values) {
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(weekData, "weekData");
        Intrinsics.X0O(values, "values");
        for (EnergyRating energyRating : data) {
            for (Map.Entry<Long, ArrayList<EnergyRating>> entry : weekData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<EnergyRating> value = entry.getValue();
                if (energyRating.getMTime() > jLongValue) {
                    value.add(energyRating);
                    break;
                }
            }
        }
        ArrayList<EnergyRating> arrayList = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<EnergyRating>>> it = weekData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<EnergyRating> value2 = it.next().getValue();
            EnergyRating energyRating2 = new EnergyRating(0, 0L, null, 0, 0, 0, 63, null);
            if (!value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it2.next();
                if (it2.hasNext()) {
                    int mScore = ((EnergyRating) next).getMScore();
                    do {
                        Object next2 = it2.next();
                        int mScore2 = ((EnergyRating) next2).getMScore();
                        if (mScore < mScore2) {
                            next = next2;
                            mScore = mScore2;
                        }
                    } while (it2.hasNext());
                }
                energyRating2 = (EnergyRating) next;
            }
            arrayList.add(energyRating2);
        }
        float f = 0.0f;
        for (EnergyRating energyRating3 : arrayList) {
            if (energyRating3.getMScore() != 0) {
                values.add(new Entry(f, energyRating3.getMScore()));
            }
            f += 1.0f;
        }
    }

    @aa1
    public static final List<Integer> getEnergyRatingColorLevel(@aa1 Context mContext) {
        Intrinsics.X0O(mContext, "mContext");
        return CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(gk4.m1859iO(mContext, R.color.energy_rating_0)), Integer.valueOf(gk4.m1859iO(mContext, R.color.energy_rating_1)), Integer.valueOf(gk4.m1859iO(mContext, R.color.energy_rating_2)), Integer.valueOf(gk4.m1859iO(mContext, R.color.energy_rating_3)), Integer.valueOf(gk4.m1859iO(mContext, R.color.energy_rating_4)));
    }

    public static final int getEnergyRatingLevel(int i) {
        if (80 <= i && i < 101) {
            return 4;
        }
        if (60 <= i && i < 80) {
            return 3;
        }
        if (40 > i || i >= 60) {
            return (20 > i || i >= 30) ? 0 : 1;
        }
        return 2;
    }
}
