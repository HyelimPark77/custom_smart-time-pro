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

    public WeightMeasureItemData(int r8, @aa1 String r9, boolean r10, double r11, @aa1 String r13, boolean r14, int r15, int r16, @aa1 List<Double> r17, @aa1 String[] r18, @aa1 int[] r19, @aa1 LevelType r20, boolean r21, boolean r22, boolean r23, @aa1 int[] r24, boolean r25, @aa1 String r26) {
        Intrinsics.X0O(r9, "name");
        Intrinsics.X0O(r13, "unit");
        Intrinsics.X0O(r17, "levelRange");
        Intrinsics.X0O(r18, "levelRangeText");
        Intrinsics.X0O(r19, "levelColor");
        Intrinsics.X0O(r20, "levelType");
        Intrinsics.X0O(r24, "gridViewImgs");
        Intrinsics.X0O(r26, "tipText");
        this.icon = r8;
        this.name = r9;
        this.isShowValue = r10;
        this.value = r11;
        this.unit = r13;
        this.isShowLevel = r14;
        this.standerLevel = r15;
        this.level = r16;
        this.levelRange = r17;
        this.levelRangeText = r18;
        this.levelColor = r19;
        this.levelType = r20;
        this.isMore = r21;
        this.isShowBarView = r22;
        this.isShowGridView = r23;
        this.gridViewImgs = r24;
        this.isShowTips = r25;
        this.tipText = r26;
        if (Intrinsics.XOO0ii0(r13, Utils.getApp().getString(R.string.lbs)) == false) goto L10;
        ArrayList r12 = new ArrayList();
        Iterator<T> r27 = this.levelRange.iterator();
    L6:
        if (r27.hasNext() == false) goto L8;
        r12.add(Double.valueOf(WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.kg2Lbs(((Number) r27.next()).doubleValue()))));
        goto L6
    L8:
        this.levelRange = r12;
    L10:
        if (this.levelRangeText.length != 0) goto L12;
        boolean r28 = true;
    L13:
        if (r28 == true) goto L15;
        this.level = WeightMeasureDataKt.getLevel(this.value, this.levelRange);
    L15:
        int r29 = this.level;
        if (r29 != 0) goto L18;
        return;
    L18:
        if (r29 <= this.levelRangeText.length) goto L20;
        return;
    L20:
        if (this.levelRange.isEmpty() == true) goto L26;
        this.levelType = WeightMeasureDataKt.getLevelType(this.standerLevel, this.level);
        return;
    L26:
        return;
    L12:
        r28 = false;
        goto L13
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

    public final void setGridViewImgs(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.gridViewImgs = r2;
    }

    public final void setIcon(int r1) {
        this.icon = r1;
    }

    public final void setLevel(int r1) {
        this.level = r1;
    }

    public final void setLevelColor(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.levelColor = r2;
    }

    public final void setLevelRange(@aa1 List<Double> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.levelRange = r2;
    }

    public final void setLevelRangeText(@aa1 String[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.levelRangeText = r2;
    }

    public final void setLevelType(@aa1 LevelType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.levelType = r2;
    }

    public final void setMore(boolean r1) {
        this.isMore = r1;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setShowBarView(boolean r1) {
        this.isShowBarView = r1;
    }

    public final void setShowGridView(boolean r1) {
        this.isShowGridView = r1;
    }

    public final void setShowLevel(boolean r1) {
        this.isShowLevel = r1;
    }

    public final void setShowTips(boolean r1) {
        this.isShowTips = r1;
    }

    public final void setShowValue(boolean r1) {
        this.isShowValue = r1;
    }

    public final void setStanderLevel(int r1) {
        this.standerLevel = r1;
    }

    public final void setTipText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tipText = r2;
    }

    public final void setUnit(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.unit = r2;
    }

    public final void setValue(double r1) {
        this.value = r1;
    }

    public /* synthetic */ WeightMeasureItemData(int r24, String r25, boolean r26, double r27, String r29, boolean r30, int r31, int r32, List r33, String[] r34, int[] r35, LevelType r36, boolean r37, boolean r38, boolean r39, int[] r40, boolean r41, String r42, int r43, DefaultConstructorMarker r44) {
        if ((r43 & 4) == 0) goto L5;
        boolean r6 = false;
    L7:
        if ((r43 & 16) == 0) goto L9;
        String r9 = "";
    L11:
        if ((r43 & 32) == 0) goto L13;
        boolean r10 = false;
    L15:
        if ((r43 & 64) == 0) goto L17;
        int r11 = 0;
    L19:
        if ((r43 & 128) == 0) goto L21;
        int r12 = 0;
    L23:
        if ((r43 & 256) == 0) goto L25;
        List r13 = CollectionsKt__CollectionsKt.iI();
    L27:
        if ((r43 & 512) == 0) goto L29;
        String[] r14 = new String[0];
    L31:
        if ((r43 & 1024) == 0) goto L33;
        int[] r15 = new int[0];
    L35:
        if ((r43 & 2048) == 0) goto L37;
        LevelType r16 = LevelType.ALL;
    L39:
        if ((r43 & 4096) == 0) goto L41;
        boolean r17 = true;
    L43:
        if ((r43 & 8192) == 0) goto L45;
        boolean r18 = false;
    L47:
        if ((r43 & 16384) == 0) goto L49;
        boolean r19 = false;
    L51:
        if ((32768 & r43) == 0) goto L53;
        int[] r20 = new int[0];
    L55:
        if ((65536 & r43) == 0) goto L57;
        boolean r21 = false;
    L59:
        if ((r43 & 131072) == 0) goto L61;
        String r22 = "";
    L62:
        this(r24, r25, r6, r27, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        return;
    L61:
        r22 = r42;
        goto L62
    L57:
        r21 = r41;
        goto L59
    L53:
        r20 = r40;
        goto L55
    L49:
        r19 = r39;
        goto L51
    L45:
        r18 = r38;
        goto L47
    L41:
        r17 = r37;
        goto L43
    L37:
        r16 = r36;
        goto L39
    L33:
        r15 = r35;
        goto L35
    L29:
        r14 = r34;
        goto L31
    L25:
        r13 = r33;
        goto L27
    L21:
        r12 = r32;
        goto L23
    L17:
        r11 = r31;
        goto L19
    L13:
        r10 = r30;
        goto L15
    L9:
        r9 = r29;
        goto L11
    L5:
        r6 = r26;
        goto L7
    }
}
