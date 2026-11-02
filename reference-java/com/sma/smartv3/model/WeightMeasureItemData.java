package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,572:1\n1869#2,2:573\n*S KotlinDebug\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n*L\n226#1:573,2\n*E\n"})
public final class WeightMeasureItemData {

    @aa1
    private int[] gridViewImgs;
    private int icon;
    private boolean isMore;
    private boolean isShowBarView;
    private boolean isShowGridView;
    private boolean isShowLevel;
    private boolean isShowTips;
    private boolean isShowValue;
    private int level;

    @aa1
    private int[] levelColor;

    @aa1
    private List<Double> levelRange;

    @aa1
    private String[] levelRangeText;

    @aa1
    private LevelType levelType;

    @aa1
    private String name;
    private int standerLevel;

    @aa1
    private String tipText;

    @aa1
    private String unit;
    private double value;

    public WeightMeasureItemData(int i, @aa1 String name, boolean z, double d, @aa1 String unit, boolean z2, int i2, int i3, @aa1 List<Double> levelRange, @aa1 String[] levelRangeText, @aa1 int[] levelColor, @aa1 LevelType levelType, boolean z3, boolean z4, boolean z5, @aa1 int[] gridViewImgs, boolean z6, @aa1 String tipText) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(unit, "unit");
        Intrinsics.X0O(levelRange, "levelRange");
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(levelColor, "levelColor");
        Intrinsics.X0O(levelType, "levelType");
        Intrinsics.X0O(gridViewImgs, "gridViewImgs");
        Intrinsics.X0O(tipText, "tipText");
        this.icon = i;
        this.name = name;
        this.isShowValue = z;
        this.value = d;
        this.unit = unit;
        this.isShowLevel = z2;
        this.standerLevel = i2;
        this.level = i3;
        this.levelRange = levelRange;
        this.levelRangeText = levelRangeText;
        this.levelColor = levelColor;
        this.levelType = levelType;
        this.isMore = z3;
        this.isShowBarView = z4;
        this.isShowGridView = z5;
        this.gridViewImgs = gridViewImgs;
        this.isShowTips = z6;
        this.tipText = tipText;
        if (Intrinsics.XOO0ii0(unit, Utils.getApp().getString(R.string.lbs))) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.levelRange.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.kg2Lbs(((Number) it.next()).doubleValue()))));
            }
            this.levelRange = arrayList;
        }
        if (!(this.levelRangeText.length == 0)) {
            this.level = WeightMeasureDataKt.getLevel(this.value, this.levelRange);
        }
        int i4 = this.level;
        if (i4 == 0 || i4 > this.levelRangeText.length || this.levelRange.isEmpty()) {
            return;
        }
        this.levelType = WeightMeasureDataKt.getLevelType(this.standerLevel, this.level);
    }

    @aa1
    public final int[] getGridViewImgs() {
        return this.gridViewImgs;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getLevel() {
        return this.level;
    }

    @aa1
    public final int[] getLevelColor() {
        return this.levelColor;
    }

    @aa1
    public final List<Double> getLevelRange() {
        return this.levelRange;
    }

    @aa1
    public final String[] getLevelRangeText() {
        return this.levelRangeText;
    }

    @aa1
    public final LevelType getLevelType() {
        return this.levelType;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final int getStanderLevel() {
        return this.standerLevel;
    }

    @aa1
    public final String getTipText() {
        return this.tipText;
    }

    @aa1
    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }

    public final boolean isMore() {
        return this.isMore;
    }

    public final boolean isShowBarView() {
        return this.isShowBarView;
    }

    public final boolean isShowGridView() {
        return this.isShowGridView;
    }

    public final boolean isShowLevel() {
        return this.isShowLevel;
    }

    public final boolean isShowTips() {
        return this.isShowTips;
    }

    public final boolean isShowValue() {
        return this.isShowValue;
    }

    public final void setGridViewImgs(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.gridViewImgs = iArr;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setLevelColor(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.levelColor = iArr;
    }

    public final void setLevelRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.levelRange = list;
    }

    public final void setLevelRangeText(@aa1 String[] strArr) {
        Intrinsics.X0O(strArr, "<set-?>");
        this.levelRangeText = strArr;
    }

    public final void setLevelType(@aa1 LevelType levelType) {
        Intrinsics.X0O(levelType, "<set-?>");
        this.levelType = levelType;
    }

    public final void setMore(boolean z) {
        this.isMore = z;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setShowBarView(boolean z) {
        this.isShowBarView = z;
    }

    public final void setShowGridView(boolean z) {
        this.isShowGridView = z;
    }

    public final void setShowLevel(boolean z) {
        this.isShowLevel = z;
    }

    public final void setShowTips(boolean z) {
        this.isShowTips = z;
    }

    public final void setShowValue(boolean z) {
        this.isShowValue = z;
    }

    public final void setStanderLevel(int i) {
        this.standerLevel = i;
    }

    public final void setTipText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.tipText = str;
    }

    public final void setUnit(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.unit = str;
    }

    public final void setValue(double d) {
        this.value = d;
    }

    public /* synthetic */ WeightMeasureItemData(int i, String str, boolean z, double d, String str2, boolean z2, int i2, int i3, List list, String[] strArr, int[] iArr, LevelType levelType, boolean z3, boolean z4, boolean z5, int[] iArr2, boolean z6, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? false : z, d, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list, (i4 & 512) != 0 ? new String[0] : strArr, (i4 & 1024) != 0 ? new int[0] : iArr, (i4 & 2048) != 0 ? LevelType.ALL : levelType, (i4 & 4096) != 0 ? true : z3, (i4 & 8192) != 0 ? false : z4, (i4 & 16384) != 0 ? false : z5, (32768 & i4) != 0 ? new int[0] : iArr2, (65536 & i4) != 0 ? false : z6, (i4 & 131072) != 0 ? "" : str3);
    }
}
