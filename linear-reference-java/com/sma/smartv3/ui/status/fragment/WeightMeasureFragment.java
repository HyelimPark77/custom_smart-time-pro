package com.sma.smartv3.ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a07;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b07;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gz6;
import com.android.mltcode.paycertificationapi.hz6;
import com.android.mltcode.paycertificationapi.iz6;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.jz6;
import com.android.mltcode.paycertificationapi.kz6;
import com.android.mltcode.paycertificationapi.lz6;
import com.android.mltcode.paycertificationapi.mz6;
import com.android.mltcode.paycertificationapi.nz6;
import com.android.mltcode.paycertificationapi.oz6;
import com.android.mltcode.paycertificationapi.pz6;
import com.android.mltcode.paycertificationapi.qz6;
import com.android.mltcode.paycertificationapi.rz6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz6;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tz6;
import com.android.mltcode.paycertificationapi.uz6;
import com.android.mltcode.paycertificationapi.vz6;
import com.android.mltcode.paycertificationapi.wz6;
import com.android.mltcode.paycertificationapi.xz6;
import com.android.mltcode.paycertificationapi.yz6;
import com.android.mltcode.paycertificationapi.zz6;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.LevelType;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.model.WeightMeasureItemAdapter;
import com.sma.smartv3.model.WeightMeasureItemData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.BodyFatScaleActivity;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n19#2:620\n15#2:621\n11#2,2:634\n774#3:622\n865#3,2:623\n78#4,3:625\n81#4,5:629\n1#5:628\n*S KotlinDebug\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n*L\n64#1:620\n64#1:621\n592#1:634,2\n572#1:622\n572#1:623,2\n133#1:625,3\n133#1:629,5\n133#1:628\n*E\n"})
public final class WeightMeasureFragment extends BaseFragment {

    @aa1
    private final Lazy btnInputWeight$delegate;

    @aa1
    private final Lazy btnMeasureWeight$delegate;
    private List<WeightMeasureItemData> items;

    @aa1
    private final Lazy llItemPanel$delegate;

    @aa1
    private final Lazy llNoDatePanel$delegate;

    @aa1
    private final Lazy llReportPanel$delegate;

    @aa1
    private final Lazy llTitlePanel$delegate;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mItemView$delegate;

    @aa1
    private final Lazy mSbvBmi$delegate;

    @aa1
    private final Lazy mSetWeightPopup$delegate;

    @tb1
    private Weight mWeight;
    private WeightDao mWeightDao;

    @aa1
    private final Lazy scrollView$delegate;

    @aa1
    private final Lazy table$delegate;

    @aa1
    private final Lazy tvBfrValue$delegate;

    @aa1
    private final Lazy tvMeasureDate$delegate;

    @aa1
    private final Lazy tvTopBfrValue$delegate;

    @aa1
    private final Lazy tvTopBmiValue$delegate;

    @aa1
    private final Lazy tvTopWeightUnit$delegate;

    @aa1
    private final Lazy tvTopWeightValue$delegate;

    @aa1
    private final Lazy tvWeightUnit$delegate;

    @aa1
    private final Lazy tvWeightValue$delegate;

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ WeightMeasureFragment OXO1;

        public OXO1(WeightMeasureFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab r1) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab r3) {
            if (r3 == null) goto L4;
            Integer r4 = Integer.valueOf(r3.getPosition());
        L5:
            if (r4 != null) goto L8;
        L10:
            if (r4 != null) goto L13;
        L15:
            if (r4 != null) goto L18;
        L20:
            LevelType r5 = LevelType.ALL;
        L21:
            WeightMeasureFragment.access$showItems(this.OXO1, r5);
            return;
        L18:
            if (r4.intValue() != 3) goto L20;
            r5 = LevelType.HIGH;
            goto L21
        L13:
            if (r4.intValue() != 2) goto L15;
            r5 = LevelType.LOW;
            goto L21
        L8:
            if (r4.intValue() != 1) goto L10;
            r5 = LevelType.STANDARD;
            goto L21
        L4:
            r4 = null;
            goto L5
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab r1) {
        }
    }

    public WeightMeasureFragment() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new gz6(this));
        this.scrollView$delegate = LazyKt__LazyJVMKt.iO(new hz6(this));
        this.llNoDatePanel$delegate = LazyKt__LazyJVMKt.iO(new iz6(this));
        this.llReportPanel$delegate = LazyKt__LazyJVMKt.iO(new jz6(this));
        this.llTitlePanel$delegate = LazyKt__LazyJVMKt.iO(new kz6(this));
        this.llItemPanel$delegate = LazyKt__LazyJVMKt.iO(new lz6(this));
        this.tvTopBmiValue$delegate = LazyKt__LazyJVMKt.iO(new mz6(this));
        this.tvTopWeightValue$delegate = LazyKt__LazyJVMKt.iO(new nz6(this));
        this.tvTopWeightUnit$delegate = LazyKt__LazyJVMKt.iO(new oz6(this));
        this.tvTopBfrValue$delegate = LazyKt__LazyJVMKt.iO(new pz6(this));
        this.tvMeasureDate$delegate = LazyKt__LazyJVMKt.iO(new rz6(this));
        this.btnMeasureWeight$delegate = LazyKt__LazyJVMKt.iO(new uz6(this));
        this.btnInputWeight$delegate = LazyKt__LazyJVMKt.iO(new vz6(this));
        this.tvWeightValue$delegate = LazyKt__LazyJVMKt.iO(new wz6(this));
        this.tvWeightUnit$delegate = LazyKt__LazyJVMKt.iO(new xz6(this));
        this.tvBfrValue$delegate = LazyKt__LazyJVMKt.iO(new yz6(this));
        this.mSbvBmi$delegate = LazyKt__LazyJVMKt.iO(new zz6(this));
        this.mItemView$delegate = LazyKt__LazyJVMKt.iO(new a07(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.mSetWeightPopup$delegate = LazyKt__LazyJVMKt.iO(new b07(this));
    }

    public static /* synthetic */ View I0IIOi(WeightMeasureFragment r0) {
        return llNoDatePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold I0iXXO(WeightMeasureFragment r0) {
        return tvBfrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium I1XOi1(WeightMeasureFragment r0) {
        return tvWeightUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(WeightMeasureFragment r0) {
        return tvTopWeightUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IO(WeightMeasureFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ DINCondBold IiI10X(WeightMeasureFragment r0) {
        return tvWeightValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O00(WeightMeasureFragment r0) {
        return llReportPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O10IXXX0X(WeightMeasureFragment r0) {
        return tvTopWeightValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(WeightMeasureFragment r0, float r1) {
        return mSetWeightPopup_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ TabLayout OIi0(WeightMeasureFragment r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(WeightMeasureFragment r0) {
        return llTitlePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ j07 X0O(WeightMeasureFragment r0) {
        return mSetWeightPopup_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CircleThumbSegmentedBarView X1ii(WeightMeasureFragment r0) {
        return mSbvBmi_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XIi00iiXO(WeightMeasureFragment r0) {
        return btnMeasureWeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XO0O10(WeightMeasureFragment r0) {
        return btnInputWeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XOO0ii0(WeightMeasureFragment r0) {
        return tvMeasureDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XX0(WeightMeasureFragment r0) {
        return llItemPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView XXI(WeightMeasureFragment r0) {
        return scrollView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XiOIO(WeightMeasureFragment r0) {
        return mItemView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(WeightMeasureFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$showItems(WeightMeasureFragment r0, LevelType r1) {
        r0.showItems(r1);
    }

    private static final View btnInputWeight_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.btn_input_weight);
    }

    private static final View btnMeasureWeight_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure_weight);
    }

    private final View getBtnInputWeight() {
        return (View) getValue();
    }

    private final View getBtnMeasureWeight() {
        return (View) getValue();
    }

    private final void getItems(Weight r57) {
        ArrayList r1 = new ArrayList();
        this.items = r1;
        String r4 = getString(R.string.weight);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        double r6 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeight(), this.mAppUser.getUnit()));
        String r8 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        List<Double> r12 = r57.getMWeightRange();
        String[] r13 = getResources().getStringArray(R.array.level_range_5_3);
        Intrinsics.O10IXXX0X(r13, "getStringArray(...)");
        int[] r14 = getResources().getIntArray(R.array.level_color_5_3);
        Intrinsics.O10IXXX0X(r14, "getIntArray(...)");
        String r15 = getString(R.string.item_weight_tips);
        Intrinsics.O10IXXX0X(r15, "getString(...)");
        r1.add(new WeightMeasureItemData(R.drawable.icon_report_item_weight, r4, true, r6, r8, true, 3, 0, r12, r13, r14, null, false, true, false, null, true, r15, 55424, null));
        List<WeightMeasureItemData> r2 = this.items;
        if (r2 != null) goto L5;
        Intrinsics.XXO("items");
        r2 = null;
    L5:
        String r7 = getString(R.string.bmi);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        double r9 = r57.getMBmi();
        List<Double> r16 = r57.getMBmiRange();
        String[] r17 = getResources().getStringArray(R.array.level_range_4_2);
        Intrinsics.O10IXXX0X(r17, "getStringArray(...)");
        int[] r10 = getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r10, "getIntArray(...)");
        String r18 = getString(R.string.item_bmi_tips);
        Intrinsics.O10IXXX0X(r18, "getString(...)");
        r2.add(new WeightMeasureItemData(R.drawable.icon_report_item_bmi, r7, true, r9, null, true, 2, 0, r16, r17, r10, null, false, true, false, null, true, r18, 55440, null));
        List<WeightMeasureItemData> r3 = this.items;
        if (r3 != null) goto L8;
        Intrinsics.XXO("items");
        r3 = null;
    L8:
        String r11 = getString(R.string.bfr);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        double r19 = r57.getMRatioOfFat();
        String r110 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(r110, "getString(...)");
        List<Double> r111 = r57.getMRatioOfFatRange();
        String[] r112 = getResources().getStringArray(R.array.level_range_5_3);
        Intrinsics.O10IXXX0X(r112, "getStringArray(...)");
        int[] r20 = getResources().getIntArray(R.array.level_color_5_3);
        Intrinsics.O10IXXX0X(r20, "getIntArray(...)");
        String r113 = getString(R.string.item_bfr_tips);
        Intrinsics.O10IXXX0X(r113, "getString(...)");
        r3.add(new WeightMeasureItemData(R.drawable.icon_report_item_bfr, r11, true, r19, r110, true, 3, 0, r111, r112, r20, null, false, true, false, null, true, r113, 55424, null));
        List<WeightMeasureItemData> r5 = this.items;
        if (r5 != null) goto L11;
        Intrinsics.XXO("items");
        r5 = null;
    L11:
        String r21 = getString(R.string.muscle_weight);
        Intrinsics.O10IXXX0X(r21, "getString(...)");
        double r22 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfMuscle(), this.mAppUser.getUnit()));
        String r114 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r114, "getString(...)");
        List<Double> r115 = r57.getMWeightOfMuscleRange();
        String[] r116 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r116, "getStringArray(...)");
        int[] r23 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r23, "getIntArray(...)");
        String r117 = getString(R.string.item_muscle_weight_tips);
        Intrinsics.O10IXXX0X(r117, "getString(...)");
        r5.add(new WeightMeasureItemData(R.drawable.icon_report_item_muscle_weight, r21, true, r22, r114, true, 2, 0, r115, r116, r23, null, false, true, false, null, true, r117, 55424, null));
        List<WeightMeasureItemData> r24 = this.items;
        if (r24 != null) goto L14;
        Intrinsics.XXO("items");
        r24 = null;
    L14:
        String r25 = getString(R.string.levelofvisceralfat);
        Intrinsics.O10IXXX0X(r25, "getString(...)");
        double r26 = r57.getMLevelOfVisceralFat();
        List<Double> r118 = r57.getMLevelOfVisceralFatRange();
        String[] r119 = getResources().getStringArray(R.array.level_range_4_1);
        Intrinsics.O10IXXX0X(r119, "getStringArray(...)");
        int[] r27 = getResources().getIntArray(R.array.level_color_4_1);
        Intrinsics.O10IXXX0X(r27, "getIntArray(...)");
        String r120 = getString(R.string.item_levelofvisceralfat_tips);
        Intrinsics.O10IXXX0X(r120, "getString(...)");
        r24.add(new WeightMeasureItemData(R.drawable.icon_report_item_levelofvisceralfat, r25, true, r26, null, true, 1, 0, r118, r119, r27, null, false, true, false, null, true, r120, 55440, null));
        List<WeightMeasureItemData> r28 = this.items;
        if (r28 != null) goto L17;
        Intrinsics.XXO("items");
        r28 = null;
    L17:
        String r29 = getString(R.string.water_ratio);
        Intrinsics.O10IXXX0X(r29, "getString(...)");
        double r30 = r57.getMRatioOfWater();
        String r121 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(r121, "getString(...)");
        List<Double> r122 = r57.getMRatioOfWaterRange();
        String[] r123 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r123, "getStringArray(...)");
        int[] r31 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r31, "getIntArray(...)");
        String r32 = getString(R.string.item_water_ratio_tips);
        Intrinsics.O10IXXX0X(r32, "getString(...)");
        r28.add(new WeightMeasureItemData(R.drawable.icon_report_item_water_ratio, r29, true, r30, r121, true, 2, 0, r122, r123, r31, null, false, true, false, null, true, r32, 55424, null));
        List<WeightMeasureItemData> r33 = this.items;
        if (r33 != null) goto L20;
        Intrinsics.XXO("items");
        r33 = null;
    L20:
        String r34 = getString(R.string.weightofbone);
        Intrinsics.O10IXXX0X(r34, "getString(...)");
        double r35 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfBone(), this.mAppUser.getUnit()));
        String r124 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r124, "getString(...)");
        List<Double> r125 = r57.getMWeightOfBoneRange();
        String[] r126 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r126, "getStringArray(...)");
        int[] r36 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r36, "getIntArray(...)");
        String r127 = getString(R.string.item_weightofbone_tips);
        Intrinsics.O10IXXX0X(r127, "getString(...)");
        r33.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofbone, r34, true, r35, r124, true, 2, 0, r125, r126, r36, null, false, true, false, null, true, r127, 55424, null));
        List<WeightMeasureItemData> r37 = this.items;
        if (r37 != null) goto L23;
        Intrinsics.XXO("items");
        r37 = null;
    L23:
        String r38 = getString(R.string.bmr);
        Intrinsics.O10IXXX0X(r38, "getString(...)");
        double r39 = r57.getMBmr();
        String r128 = getString(R.string.kcal);
        Intrinsics.O10IXXX0X(r128, "getString(...)");
        List<Double> r129 = r57.getMBmrRange();
        String[] r130 = getResources().getStringArray(R.array.level_range_2_2);
        Intrinsics.O10IXXX0X(r130, "getStringArray(...)");
        int[] r40 = getResources().getIntArray(R.array.level_color_2_2);
        Intrinsics.O10IXXX0X(r40, "getIntArray(...)");
        String r131 = getString(R.string.item_bmr_tips);
        Intrinsics.O10IXXX0X(r131, "getString(...)");
        r37.add(new WeightMeasureItemData(R.drawable.icon_report_item_bmr, r38, true, r39, r128, true, 2, 0, r129, r130, r40, null, false, true, false, null, true, r131, 55424, null));
        List<WeightMeasureItemData> r41 = this.items;
        if (r41 != null) goto L26;
        Intrinsics.XXO("items");
        r41 = null;
    L26:
        String r42 = getString(R.string.fat_weight);
        Intrinsics.O10IXXX0X(r42, "getString(...)");
        double r43 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfFat(), this.mAppUser.getUnit()));
        String r132 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r132, "getString(...)");
        List<Double> r133 = r57.getMWeightOfFatRange();
        String[] r134 = getResources().getStringArray(R.array.level_range_5_2);
        Intrinsics.O10IXXX0X(r134, "getStringArray(...)");
        int[] r44 = getResources().getIntArray(R.array.level_color_5_2);
        Intrinsics.O10IXXX0X(r44, "getIntArray(...)");
        String r135 = getString(R.string.item_fat_weight_tips);
        Intrinsics.O10IXXX0X(r135, "getString(...)");
        r41.add(new WeightMeasureItemData(R.drawable.icon_report_item_fat_weight, r42, true, r43, r132, true, 2, 0, r133, r134, r44, null, false, true, false, null, true, r135, 55424, null));
        List<WeightMeasureItemData> r45 = this.items;
        if (r45 != null) goto L29;
        Intrinsics.XXO("items");
        r45 = null;
    L29:
        String r46 = getString(R.string.weightofskeletalmuscle);
        Intrinsics.O10IXXX0X(r46, "getString(...)");
        double r47 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfSkeletalMuscle(), this.mAppUser.getUnit()));
        String r136 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r136, "getString(...)");
        List<Double> r137 = r57.getMWeightOfSkeletalMuscleRange();
        String[] r138 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r138, "getStringArray(...)");
        int[] r48 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r48, "getIntArray(...)");
        String r139 = getString(R.string.item_weightofskeletalmuscle_tips);
        Intrinsics.O10IXXX0X(r139, "getString(...)");
        r45.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofskeletalmuscle, r46, true, r47, r136, true, 2, 0, r137, r138, r48, null, false, true, false, null, true, r139, 55424, null));
        List<WeightMeasureItemData> r49 = this.items;
        if (r49 != null) goto L32;
        Intrinsics.XXO("items");
        r49 = null;
    L32:
        String r50 = getString(R.string.ratioofskeletalmuscle);
        Intrinsics.O10IXXX0X(r50, "getString(...)");
        double r51 = r57.getMRatioOfSkeletalMuscle();
        String r140 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(r140, "getString(...)");
        List<Double> r141 = r57.getMRatioOfSkeletalMuscleRange();
        String[] r142 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r142, "getStringArray(...)");
        int[] r52 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r52, "getIntArray(...)");
        String r143 = getString(R.string.item_ratioofskeletalmuscle_tips);
        Intrinsics.O10IXXX0X(r143, "getString(...)");
        r49.add(new WeightMeasureItemData(R.drawable.icon_report_item_ratioofskeletalmuscle, r50, true, r51, r140, true, 2, 0, r141, r142, r52, null, false, true, false, null, true, r143, 55424, null));
        List<WeightMeasureItemData> r53 = this.items;
        if (r53 != null) goto L35;
        Intrinsics.XXO("items");
        r53 = null;
    L35:
        String r54 = getString(R.string.weightofwater);
        Intrinsics.O10IXXX0X(r54, "getString(...)");
        double r55 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfWater(), this.mAppUser.getUnit()));
        String r144 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r144, "getString(...)");
        List<Double> r145 = r57.getMWeightOfWaterRange();
        String[] r146 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r146, "getStringArray(...)");
        int[] r56 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r56, "getIntArray(...)");
        String r147 = getString(R.string.item_weightofwater_tips);
        Intrinsics.O10IXXX0X(r147, "getString(...)");
        r53.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofwater, r54, true, r55, r144, true, 2, 0, r145, r146, r56, null, false, true, false, null, true, r147, 55424, null));
        List<WeightMeasureItemData> r58 = this.items;
        if (r58 != null) goto L38;
        Intrinsics.XXO("items");
        r58 = null;
    L38:
        String r59 = getString(R.string.weightofprotein);
        Intrinsics.O10IXXX0X(r59, "getString(...)");
        double r60 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightOfProtein(), this.mAppUser.getUnit()));
        String r148 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r148, "getString(...)");
        List<Double> r149 = r57.getMWeightOfProteinRange();
        String[] r150 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r150, "getStringArray(...)");
        int[] r61 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r61, "getIntArray(...)");
        String r151 = getString(R.string.item_weightofprotein_tips);
        Intrinsics.O10IXXX0X(r151, "getString(...)");
        r58.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofprotein, r59, true, r60, r148, true, 2, 0, r149, r150, r61, null, false, true, false, null, true, r151, 55424, null));
        List<WeightMeasureItemData> r62 = this.items;
        if (r62 != null) goto L41;
        Intrinsics.XXO("items");
        r62 = null;
    L41:
        String r63 = getString(R.string.ideal_weight);
        Intrinsics.O10IXXX0X(r63, "getString(...)");
        double r64 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMIdealWeight(), this.mAppUser.getUnit()));
        String r152 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r152, "getString(...)");
        r62.add(new WeightMeasureItemData(R.drawable.icon_report_item_ideal_weight, r63, true, r64, r152, false, 0, 0, null, null, null, null, false, false, false, null, false, null, 258016, null));
        List<WeightMeasureItemData> r65 = this.items;
        if (r65 != null) goto L44;
        Intrinsics.XXO("items");
        r65 = null;
    L44:
        String r66 = getString(R.string.weighttocontrol);
        Intrinsics.O10IXXX0X(r66, "getString(...)");
        double r67 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMWeightToControl(), this.mAppUser.getUnit()));
        String r153 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r153, "getString(...)");
        List r154 = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] r155 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r155, "getStringArray(...)");
        int[] r68 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r68, "getIntArray(...)");
        String r156 = getString(R.string.item_weighttocontrol_tips);
        Intrinsics.O10IXXX0X(r156, "getString(...)");
        r65.add(new WeightMeasureItemData(R.drawable.icon_report_item_weighttocontrol, r66, true, r67, r153, true, 2, 0, r154, r155, r68, null, false, false, false, null, true, r156, 63616, null));
        List<WeightMeasureItemData> r69 = this.items;
        if (r69 != null) goto L47;
        Intrinsics.XXO("items");
        r69 = null;
    L47:
        String r70 = getString(R.string.fattocontrol);
        Intrinsics.O10IXXX0X(r70, "getString(...)");
        double r71 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMFatToControl(), this.mAppUser.getUnit()));
        String r157 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r157, "getString(...)");
        List r158 = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] r159 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r159, "getStringArray(...)");
        int[] r72 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r72, "getIntArray(...)");
        String r160 = getString(R.string.item_fattocontrol_tips);
        Intrinsics.O10IXXX0X(r160, "getString(...)");
        r69.add(new WeightMeasureItemData(R.drawable.icon_report_item_fattocontrol, r70, true, r71, r157, true, 2, 0, r158, r159, r72, null, false, false, false, null, true, r160, 63616, null));
        List<WeightMeasureItemData> r73 = this.items;
        if (r73 != null) goto L50;
        Intrinsics.XXO("items");
        r73 = null;
    L50:
        String r74 = getString(R.string.muscletocontrol);
        Intrinsics.O10IXXX0X(r74, "getString(...)");
        double r75 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMMuscleToControl(), this.mAppUser.getUnit()));
        String r161 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r161, "getString(...)");
        List r162 = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] r163 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r163, "getStringArray(...)");
        int[] r76 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r76, "getIntArray(...)");
        String r164 = getString(R.string.item_muscletocontrol_tips);
        Intrinsics.O10IXXX0X(r164, "getString(...)");
        r73.add(new WeightMeasureItemData(R.drawable.icon_report_item_muscletocontrol, r74, true, r75, r161, true, 2, 0, r162, r163, r76, null, false, false, false, null, true, r164, 63616, null));
        List<WeightMeasureItemData> r77 = this.items;
        if (r77 != null) goto L53;
        Intrinsics.XXO("items");
        r77 = null;
    L53:
        String r78 = getString(R.string.bodyshape);
        Intrinsics.O10IXXX0X(r78, "getString(...)");
        double r310 = r57.getMBodyShape();
        String[] r79 = getResources().getStringArray(R.array.body_shape_text);
        Intrinsics.O10IXXX0X(r79, "getStringArray(...)");
        int[] r80 = getResources().getIntArray(R.array.body_shape_img);
        Intrinsics.O10IXXX0X(r80, "getIntArray(...)");
        r77.add(new WeightMeasureItemData(R.drawable.icon_report_item_bodyshape, r78, false, r310, null, true, 5, 0, null, r79, null, null, false, false, true, r80, false, null, 212372, null));
        List<WeightMeasureItemData> r81 = this.items;
        if (r81 != null) goto L56;
        Intrinsics.XXO("items");
        r81 = null;
    L56:
        String r82 = getString(R.string.nutrition_state);
        Intrinsics.O10IXXX0X(r82, "getString(...)");
        double r311 = r57.getMStateOfNutrition();
        List r312 = X0iO1XX.I0iXXO(Double.valueOf(4.0d));
        String[] r83 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r83, "getStringArray(...)");
        int[] r84 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r84, "getIntArray(...)");
        String r85 = getString(R.string.item_nutrition_state_tips);
        Intrinsics.O10IXXX0X(r85, "getString(...)");
        r81.add(new WeightMeasureItemData(R.drawable.icon_report_item_nutrition_state, r82, true, r311, null, true, 2, 0, r312, r83, r84, null, false, false, false, null, true, r85, 63632, null));
        List<WeightMeasureItemData> r86 = this.items;
        if (r86 != null) goto L59;
        Intrinsics.XXO("items");
        r86 = null;
    L59:
        String r87 = getString(R.string.body_age);
        Intrinsics.O10IXXX0X(r87, "getString(...)");
        double r313 = r57.getMAgeOfBody();
        List<Double> r314 = r57.getMAgeOfBodyRange();
        String[] r88 = getResources().getStringArray(R.array.level_range_body_age);
        Intrinsics.O10IXXX0X(r88, "getStringArray(...)");
        int[] r89 = getResources().getIntArray(R.array.level_color_body_age);
        Intrinsics.O10IXXX0X(r89, "getIntArray(...)");
        String r90 = getString(R.string.item_body_age_tips);
        Intrinsics.O10IXXX0X(r90, "getString(...)");
        r86.add(new WeightMeasureItemData(R.drawable.icon_report_item_body_age, r87, true, r313, null, true, 1, 0, r314, r88, r89, null, false, true, false, null, true, r90, 55440, null));
        List<WeightMeasureItemData> r91 = this.items;
        if (r91 != null) goto L62;
        Intrinsics.XXO("items");
        r91 = null;
    L62:
        String r92 = getString(R.string.protein_ratio);
        Intrinsics.O10IXXX0X(r92, "getString(...)");
        double r315 = r57.getMRatioOfProtein();
        String r93 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(r93, "getString(...)");
        List<Double> r316 = r57.getMRatioOfProteinRange();
        String[] r94 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r94, "getStringArray(...)");
        int[] r95 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r95, "getIntArray(...)");
        String r165 = getString(R.string.item_protein_ratio_tips);
        Intrinsics.O10IXXX0X(r165, "getString(...)");
        r91.add(new WeightMeasureItemData(R.drawable.icon_report_item_protein_ratio, r92, true, r315, r93, true, 2, 0, r316, r94, r95, null, false, true, false, null, true, r165, 55424, null));
        List<WeightMeasureItemData> r96 = this.items;
        if (r96 != null) goto L65;
        Intrinsics.XXO("items");
        r96 = null;
    L65:
        String r97 = getString(R.string.ratioofsubcutaneousfat);
        Intrinsics.O10IXXX0X(r97, "getString(...)");
        double r317 = r57.getMRatioOfSubcutaneousFat();
        String r98 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(r98, "getString(...)");
        List<Double> r318 = r57.getMRatioOfSubcutaneousFatRange();
        String[] r99 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(r99, "getStringArray(...)");
        int[] r100 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(r100, "getIntArray(...)");
        String r101 = getString(R.string.item_ratioofsubcutaneousfat_tips);
        Intrinsics.O10IXXX0X(r101, "getString(...)");
        r96.add(new WeightMeasureItemData(R.drawable.icon_report_item_ratioofsubcutaneousfat, r97, true, r317, r98, true, 2, 0, r318, r99, r100, null, false, true, false, null, true, r101, 55424, null));
        List<WeightMeasureItemData> r102 = this.items;
        if (r102 != null) goto L68;
        Intrinsics.XXO("items");
        r102 = null;
    L68:
        String r103 = getString(R.string.fatfreebodyweight);
        Intrinsics.O10IXXX0X(r103, "getString(...)");
        double r104 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(r57.getMFatFreeBodyWeight(), this.mAppUser.getUnit()));
        String r105 = getString(cp5.iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(r105, "getString(...)");
        String r106 = getString(R.string.item_fatfreebodyweight_tips);
        Intrinsics.O10IXXX0X(r106, "getString(...)");
        r102.add(new WeightMeasureItemData(R.drawable.icon_report_item_fatfreebodyweight, r103, true, r104, r105, false, 0, 0, null, null, null, null, false, false, false, null, true, r106, 65504, null));
    }

    private final View getLlItemPanel() {
        return (View) getValue();
    }

    private final View getLlNoDatePanel() {
        return (View) getValue();
    }

    private final View getLlReportPanel() {
        return (View) getValue();
    }

    private final View getLlTitlePanel() {
        return (View) getValue();
    }

    private final RecyclerView getMItemView() {
        return (RecyclerView) getValue();
    }

    private final CircleThumbSegmentedBarView getMSbvBmi() {
        return (CircleThumbSegmentedBarView) getValue();
    }

    private final j07 getMSetWeightPopup() {
        return (j07) getValue();
    }

    private final NestedScrollView getScrollView() {
        return (NestedScrollView) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private final DINCondBold getTvBfrValue() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getTvMeasureDate() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getTvTopBfrValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getTvTopBmiValue() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getTvTopWeightUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getTvTopWeightValue() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getTvWeightUnit() {
        return (PFMedium) getValue();
    }

    private final DINCondBold getTvWeightValue() {
        return (DINCondBold) getValue();
    }

    public static /* synthetic */ DINCondBold iIiiO(WeightMeasureFragment r0) {
        return tvTopBmiValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iO(WeightMeasureFragment r0) {
        return tvTopBfrValue_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(WeightMeasureFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), BodyFatScaleActivity.class));
    }

    private static final void initView$lambda$1(WeightMeasureFragment r2, View r3) {
        j07 r4 = r2.getMSetWeightPopup();
        View r0 = r2.getBtnInputWeight();
        Intrinsics.O10IXXX0X(r0, "<get-btnInputWeight>(...)");
        r4.I1XOi1(r0);
        j07 r5 = r2.getMSetWeightPopup();
        if (r2.mAppUser.getWeight() != 0.0f) goto L5;
        float r6 = 65.0f;
    L6:
        r5.IXXOO(r6);
        return;
    L5:
        r6 = r2.mAppUser.getWeight();
        goto L6
    }

    private static final View llItemPanel_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.ll_weight_measure_item_panel);
    }

    private static final View llNoDatePanel_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.ll_weight_measure_no_date_panel);
    }

    private static final View llReportPanel_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.ll_weight_measure_report_panel);
    }

    private static final View llTitlePanel_delegate$lambda$0(WeightMeasureFragment r1) {
        return r1.getMView().findViewById(R.id.ll_weight_measure_title_panel);
    }

    private static final RecyclerView mItemView_delegate$lambda$0(WeightMeasureFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.recyclerView);
    }

    private static final CircleThumbSegmentedBarView mSbvBmi_delegate$lambda$0(WeightMeasureFragment r1) {
        return (CircleThumbSegmentedBarView) r1.getMView().findViewById(R.id.sbv_bmi);
    }

    private static final j07 mSetWeightPopup_delegate$lambda$0(final WeightMeasureFragment r2) {
        j07 r0 = new j07(r2.getMActivity());
        r0.i010I(R.string.remember_weight);
        r0.iX(r2.mAppUser.getUnit());
        r0.IXXOO(20.0f);
        r0.II1Xi0(new qz6(r2));
        return r0;
    }

    private static final boolean mSetWeightPopup_delegate$lambda$0$0$0(WeightMeasureFragment r88, float r89) {
        if (r89 >= 20.0f) goto L5;
        ToastUtils.showLong(R.string.weight_set_error);
        return true;
    L5:
        r88.mAppUser.setWeight(r89);
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r88.mAppUser));
        Weight r5 = new Weight(0, 0, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        r5.setMTime(System.currentTimeMillis());
        String r2 = TimeUtils.millis2String(r5.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r2, "millis2String(...)");
        r5.setMLocalTime(r2);
        r5.setMWeight(r89);
        r5.setMIsMeasure(0);
        r5.setMBmi(Double.parseDouble(cp5.I0IIOi(r5.getMWeight(), r88.mAppUser.getHeight())));
        WeightDao r0 = r88.mWeightDao;
        if (r0 != null) goto L8;
        Intrinsics.XXO("mWeightDao");
        r0 = null;
    L8:
        r0.insert(CollectionsKt__CollectionsKt.Ii1iii0(new Weight[]{r5}));
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        I01XX0.OXO1(I01XX0.I0iXXO, r5);
        return true;
    }

    private static final NestedScrollView scrollView_delegate$lambda$0(WeightMeasureFragment r1) {
        return (NestedScrollView) r1.getMView().findViewById(R.id.scrollView);
    }

    private final void showItems(LevelType r7) {
        RecyclerView r0 = getMItemView();
        List<WeightMeasureItemData> r1 = this.items;
        if (r1 != null) goto L5;
        Intrinsics.XXO("items");
        r1 = null;
    L5:
        ArrayList r2 = new ArrayList();
        Iterator<T> r3 = r1.iterator();
    L7:
        if (r3.hasNext() == false) goto L14;
        Object r4 = r3.next();
        WeightMeasureItemData r5 = (WeightMeasureItemData) r4;
        if (r7 == LevelType.ALL) goto L13;
        if (r5.getLevelType() != r7) goto L7;
    L13:
        r2.add(r4);
        goto L7
    L14:
        FragmentActivity r8 = requireActivity();
        Intrinsics.O10IXXX0X(r8, "requireActivity(...)");
        r0.setAdapter(new WeightMeasureItemAdapter(r2, r8));
    }

    private static final TabLayout table_delegate$lambda$0(WeightMeasureFragment r1) {
        return (TabLayout) r1.getMView().findViewById(R.id.table);
    }

    private static final DINCondBold tvBfrValue_delegate$lambda$0(WeightMeasureFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.tv_bfrValue);
    }

    private static final PFMedium tvMeasureDate_delegate$lambda$0(WeightMeasureFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_measure_date);
    }

    private static final DINCondBold tvTopBfrValue_delegate$lambda$0(WeightMeasureFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.tv_topBfrValue);
    }

    private static final DINCondBold tvTopBmiValue_delegate$lambda$0(WeightMeasureFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.tv_topBmiValue);
    }

    private static final PFMedium tvTopWeightUnit_delegate$lambda$0(WeightMeasureFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_topWeightUnit);
    }

    private static final DINCondBold tvTopWeightValue_delegate$lambda$0(WeightMeasureFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.tv_topWeightValue);
    }

    private static final PFMedium tvWeightUnit_delegate$lambda$0(WeightMeasureFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_weightUnit);
    }

    private static final DINCondBold tvWeightValue_delegate$lambda$0(WeightMeasureFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.tv_weightValue);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        if (getMArg3() == null) goto L6;
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        this.mWeight = (Weight) r3;
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"SetTextI18n"})
    public void initView() {
        LogUtils.d(new Object[]{this.mWeight});
        getMItemView().setLayoutManager(new LinearLayoutManager(getActivity()));
        getMItemView().setHasFixedSize(true);
        getTable().setBackgroundColor(gk4.iO(getContext(), R.color.view_page_tablayout_bg));
        View r1 = getTable().getChildAt(0);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout r2 = (LinearLayout) r1;
        r2.setShowDividers(2);
        Drawable r5 = ContextCompat.getDrawable(requireContext(), R.drawable.layout_tab_divider_vertical);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable r6 = (GradientDrawable) r5;
        r6.setColor(gk4.iO(getContext(), R.color.view_page_main_bg));
        r2.setDividerDrawable(r6);
        getTable().addOnTabSelectedListener(new OXO1(this));
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        getTvTopWeightUnit().setText(cp5.iX(this.mAppUser.getUnit()));
        if (getMArg1() != 1) goto L5;
        getMView().findViewById(R.id.ll_weight_measure_top_panel).setVisibility(8);
    L5:
        getBtnMeasureWeight().setOnClickListener(new sz6(this));
        getBtnInputWeight().setOnClickListener(new tz6(this));
        if (this.mWeight != null) goto L9;
        getLlNoDatePanel().setVisibility(0);
        getLlReportPanel().setVisibility(8);
        getLlTitlePanel().setVisibility(8);
        return;
    L9:
        getLlNoDatePanel().setVisibility(8);
        getLlReportPanel().setVisibility(0);
        if (getMArg1() != 1) goto L12;
        getLlTitlePanel().setVisibility(8);
    L13:
        Weight r3 = this.mWeight;
        Double r7 = null;
        if (r3 == null) goto L16;
        Double r4 = Double.valueOf(r3.getMBmi());
    L18:
        if (Intrinsics.iO(r4, 0.0d) == false) goto L20;
        Weight r8 = this.mWeight;
        Intrinsics.XXI(r8);
        Double r9 = Double.valueOf(Double.parseDouble(cp5.I0IIOi(r8.getMWeight(), this.mAppUser.getHeight())));
    L24:
        DINCondBold r10 = getTvTopBmiValue();
        Intrinsics.XXI(r9);
        r10.setText(cp5.X11iII1O1((float) r9.doubleValue(), false, 2, null));
        DINCondBold r11 = getTvTopWeightValue();
        Weight r12 = this.mWeight;
        Intrinsics.XXI(r12);
        r11.setText(String.valueOf(cp5.OIX0iXi(cp5.IXXOO(r12.getMWeight(), this.mAppUser.getUnit()))));
        DINCondBold r13 = getTvTopBfrValue();
        Weight r14 = this.mWeight;
        if (r14 == null) goto L27;
        Double r15 = Double.valueOf(r14.getMRatioOfFat());
    L28:
        r13.setText(String.valueOf(r15));
        PFMedium r16 = getTvMeasureDate();
        Weight r17 = this.mWeight;
        if (r17 == null) goto L31;
        String r18 = r17.getMLocalTime();
    L32:
        r16.setText(r18);
        DINCondBold r19 = getTvWeightValue();
        Weight r20 = this.mWeight;
        Intrinsics.XXI(r20);
        r19.setText(String.valueOf(cp5.OIX0iXi(cp5.IXXOO(r20.getMWeight(), this.mAppUser.getUnit()))));
        getTvWeightUnit().setText(cp5.iX(this.mAppUser.getUnit()));
        DINCondBold r21 = getTvBfrValue();
        Weight r22 = this.mWeight;
        if (r22 == null) goto L35;
        r7 = Double.valueOf(r22.getMRatioOfFat());
    L35:
        r21.setText(String.valueOf(r7));
        Weight r23 = this.mWeight;
        if (r23 != null) goto L38;
    L41:
        getLlItemPanel().setVisibility(8);
        getTvTopBfrValue().setText(R.string.data_none);
        getTvBfrValue().setText(R.string.data_none);
        CircleThumbSegmentedBarView r110 = getMSbvBmi();
        Intrinsics.O10IXXX0X(r110, "<get-mSbvBmi>(...)");
        double r111 = r9.doubleValue();
        List r112 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d), Double.valueOf(34.9d)});
        String[] r24 = getResources().getStringArray(R.array.level_range_4_2_bmi);
        Intrinsics.O10IXXX0X(r24, "getStringArray(...)");
        int[] r25 = getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r25, "getIntArray(...)");
        WeightMeasureDataKt.setBarView$default(r110, r111, r112, r24, r25, false, 32, null);
        return;
    L38:
        if (r23.getMIsMeasure() != 1) goto L41;
        getLlItemPanel().setVisibility(0);
        CircleThumbSegmentedBarView r113 = getMSbvBmi();
        Intrinsics.O10IXXX0X(r113, "<get-mSbvBmi>(...)");
        double r114 = r9.doubleValue();
        Weight r26 = this.mWeight;
        Intrinsics.XXI(r26);
        List<Double> r115 = r26.getMBmiRange();
        String[] r27 = getResources().getStringArray(R.array.level_range_4_2);
        Intrinsics.O10IXXX0X(r27, "getStringArray(...)");
        int[] r28 = getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r28, "getIntArray(...)");
        WeightMeasureDataKt.setBarView$default(r113, r114, r115, r27, r28, false, 32, null);
        Weight r29 = this.mWeight;
        Intrinsics.XXI(r29);
        getItems(r29);
        showItems(LevelType.ALL);
        return;
    L31:
        r18 = null;
        goto L32
    L27:
        r15 = null;
        goto L28
    L20:
        Weight r30 = this.mWeight;
        if (r30 == null) goto L23;
        r9 = Double.valueOf(r30.getMBmi());
        goto L24
    L23:
        r9 = null;
        goto L24
    L16:
        r4 = null;
        goto L18
    L12:
        getLlTitlePanel().setVisibility(0);
        goto L13
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_weight_measure;
    }

    @sf5(tag = I01XX0.I0iXXO)
    public final void onMeasureWeightChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onMeasureWeightChanged"});
        this.mWeight = (Weight) r2;
        initView();
    }

    public final void share() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getScrollView();
        Intrinsics.O10IXXX0X(r1, "<get-scrollView>(...)");
        Bitmap r2 = r0.iO(r1);
        r0.XO0O10(getMActivity(), r2);
    }
}
