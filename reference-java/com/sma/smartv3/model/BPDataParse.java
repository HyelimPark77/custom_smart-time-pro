package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.time.DateUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class BPDataParse {

    @aa1
    public static final BPDataParse INSTANCE = new BPDataParse();

    private BPDataParse() {
    }

    public final void filterDayData(@aa1 Context context, @aa1 List<BloodPressure> data, @aa1 LinkedHashMap<Long, ArrayList<BloodPressure>> monthData, @aa1 List<BPDayData> bpDayDataList, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(monthData, "monthData");
        Intrinsics.X0O(bpDayDataList, "bpDayDataList");
        Intrinsics.X0O(values, "values");
        for (BloodPressure bloodPressure : data) {
            for (Map.Entry<Long, ArrayList<BloodPressure>> entry : monthData.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<BloodPressure> value = entry.getValue();
                if (bloodPressure.getMTime() <= jLongValue) {
                    value.add(bloodPressure);
                    break;
                }
            }
        }
        bpDayDataList.clear();
        Iterator<Map.Entry<Long, ArrayList<BloodPressure>>> it = monthData.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<BloodPressure> value2 = it.next().getValue();
            BPDayData bPDayData = new BPDayData(0, 0, 0, 0, null, 31, null);
            if (value2.size() != 0) {
                Iterator<BloodPressure> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int i = 0;
                int mDiastolic = 0;
                int mSystolic = 0;
                while (it2.hasNext()) {
                    BloodPressure next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    BloodPressure bloodPressure2 = next;
                    if (bloodPressure2.getMDiastolic() != 0 && bloodPressure2.getMSystolic() != 0) {
                        if (bPDayData.getDbpMin() == 0 || bPDayData.getDbpMin() > bloodPressure2.getMDiastolic()) {
                            bPDayData.setDbpMin(bloodPressure2.getMDiastolic());
                        }
                        if (bPDayData.getDbpMax() < bloodPressure2.getMDiastolic()) {
                            bPDayData.setDbpMax(bloodPressure2.getMDiastolic());
                        }
                        if (bPDayData.getSbpMin() == 0 || bPDayData.getSbpMin() > bloodPressure2.getMSystolic()) {
                            bPDayData.setSbpMin(bloodPressure2.getMSystolic());
                        }
                        if (bPDayData.getSbpMax() < bloodPressure2.getMSystolic()) {
                            bPDayData.setSbpMax(bloodPressure2.getMSystolic());
                        }
                        mDiastolic += bloodPressure2.getMDiastolic();
                        mSystolic += bloodPressure2.getMSystolic();
                        i++;
                    }
                }
                if (i != 0) {
                    int i2 = mDiastolic / i;
                    int i3 = mSystolic / i;
                    if (i3 >= 140 && i2 >= 90) {
                        String string = context.getString(R.string.high);
                        Intrinsics.O10IXXX0X(string, "getString(...)");
                        bPDayData.setStatus(string);
                    } else if (90 > i3 || i3 >= 140 || 60 > i2 || i2 >= 90) {
                        String string2 = context.getString(R.string.low);
                        Intrinsics.O10IXXX0X(string2, "getString(...)");
                        bPDayData.setStatus(string2);
                    } else {
                        String string3 = context.getString(R.string.normal);
                        Intrinsics.O10IXXX0X(string3, "getString(...)");
                        bPDayData.setStatus(string3);
                    }
                } else {
                    bPDayData.setStatus(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
                }
            }
            bpDayDataList.add(bPDayData);
        }
        float f = 0.0f;
        for (BPDayData bPDayData2 : bpDayDataList) {
            values.add(new BarEntry(f, new float[]{bPDayData2.getDbpMin(), bPDayData2.getSbpMax() - bPDayData2.getDbpMin()}));
            f += 1.0f;
        }
    }

    public final void filterHourData(@aa1 long[] range, @aa1 List<BloodPressure> data, @aa1 List<BPHourData> hourData, @aa1 List<BarEntry> values) {
        Intrinsics.X0O(range, "range");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(hourData, "hourData");
        Intrinsics.X0O(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = range[0];
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, range[1], DateUtils.f56805iO);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new BPHourData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += DateUtils.f56805iO;
                }
            }
        }
        for (BloodPressure bloodPressure : data) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                BPHourData bPHourData = (BPHourData) entry.getValue();
                if (bloodPressure.getMTime() < jLongValue) {
                    if (bPHourData.getDbpMax() < bloodPressure.getMDiastolic()) {
                        bPHourData.setDbpMax(bloodPressure.getMDiastolic());
                    }
                    if (bPHourData.getDbpMin() > bloodPressure.getMDiastolic() || bPHourData.getDbpMin() == 0) {
                        bPHourData.setDbpMin(bloodPressure.getMDiastolic());
                    }
                    if (bPHourData.getSbpMax() < bloodPressure.getMSystolic()) {
                        bPHourData.setSbpMax(bloodPressure.getMSystolic());
                    }
                    if (bPHourData.getSbpMin() > bloodPressure.getMSystolic() || bPHourData.getSbpMin() == 0) {
                        bPHourData.setSbpMin(bloodPressure.getMSystolic());
                    }
                    bPHourData.setDbpTotal(bPHourData.getDbpTotal() + bloodPressure.getMDiastolic());
                    bPHourData.setDbpNum(bPHourData.getDbpNum() + 1);
                    bPHourData.setSbpTotal(bPHourData.getSbpTotal() + bloodPressure.getMSystolic());
                    bPHourData.setSbpNum(bPHourData.getSbpNum() + 1);
                    break;
                }
            }
        }
        hourData.clear();
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            BPHourData bPHourData2 = (BPHourData) ((Map.Entry) it.next()).getValue();
            hourData.add(bPHourData2);
            values.add(new BarEntry(i, new float[]{bPHourData2.getDbpMin(), bPHourData2.getDbpMax() - bPHourData2.getDbpMin(), bPHourData2.getSbpMin() - bPHourData2.getDbpMax(), bPHourData2.getSbpMax() - bPHourData2.getSbpMin()}));
            i++;
        }
    }
}
