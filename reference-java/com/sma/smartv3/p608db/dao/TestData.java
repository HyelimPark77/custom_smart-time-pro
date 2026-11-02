package com.sma.smartv3.p608db.dao;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p608db.entity.Pressure;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Weight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TestData {

    @aa1
    public static final TestData INSTANCE = new TestData();

    @aa1
    private static final List<HeartRate> testHeartRates = new ArrayList();

    @aa1
    private static final List<Pressure> testPressures = new ArrayList();

    @aa1
    private static final List<BloodPressure> testBloodPressures = new ArrayList();

    @aa1
    private static List<Sleep> testSleeps = new ArrayList();

    @aa1
    private static List<Weight> testWeights = new ArrayList();

    @aa1
    private static final List<Electrocardiogram> testElectrocardiograms = new ArrayList();

    @aa1
    private static List<Hrv> testHRVs = new ArrayList();

    private TestData() {
    }

    @aa1
    public final List<BloodPressure> getTestBloodPressures() {
        return testBloodPressures;
    }

    @aa1
    public final List<Electrocardiogram> getTestElectrocardiograms() {
        return testElectrocardiograms;
    }

    @aa1
    public final List<Hrv> getTestHRVs() {
        return testHRVs;
    }

    @aa1
    public final List<HeartRate> getTestHeartRates() {
        return testHeartRates;
    }

    @aa1
    public final List<Pressure> getTestPressures() {
        return testPressures;
    }

    @aa1
    public final List<Sleep> getTestSleeps() {
        return testSleeps;
    }

    @aa1
    public final List<Weight> getTestWeights() {
        return testWeights;
    }

    public final void setTestHRVs(@aa1 List<Hrv> list) {
        Intrinsics.X0O(list, "<set-?>");
        testHRVs = list;
    }

    public final void setTestSleeps(@aa1 List<Sleep> list) {
        Intrinsics.X0O(list, "<set-?>");
        testSleeps = list;
    }

    public final void setTestWeights(@aa1 List<Weight> list) {
        Intrinsics.X0O(list, "<set-?>");
        testWeights = list;
    }
}
