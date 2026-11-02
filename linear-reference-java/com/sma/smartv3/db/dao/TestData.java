package com.sma.smartv3.db.dao;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Pressure;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Weight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TestData {

    @aa1
    public static final TestData INSTANCE = null;

    @aa1
    private static final List<BloodPressure> testBloodPressures = null;

    @aa1
    private static final List<Electrocardiogram> testElectrocardiograms = null;

    @aa1
    private static List<Hrv> testHRVs;

    @aa1
    private static final List<HeartRate> testHeartRates = null;

    @aa1
    private static final List<Pressure> testPressures = null;

    @aa1
    private static List<Sleep> testSleeps;

    @aa1
    private static List<Weight> testWeights;

    static {
        INSTANCE = new TestData();
        testHeartRates = new ArrayList();
        testPressures = new ArrayList();
        testBloodPressures = new ArrayList();
        testSleeps = new ArrayList();
        testWeights = new ArrayList();
        testElectrocardiograms = new ArrayList();
        testHRVs = new ArrayList();
    }

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

    public final void setTestHRVs(@aa1 List<Hrv> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        testHRVs = r2;
    }

    public final void setTestSleeps(@aa1 List<Sleep> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        testSleeps = r2;
    }

    public final void setTestWeights(@aa1 List<Weight> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        testWeights = r2;
    }
}
