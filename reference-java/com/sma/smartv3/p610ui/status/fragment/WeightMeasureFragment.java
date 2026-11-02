package com.sma.smartv3.p610ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.LevelType;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.model.WeightMeasureItemAdapter;
import com.sma.smartv3.model.WeightMeasureItemData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p610ui.status.BodyFatScaleActivity;
import com.sma.smartv3.p610ui.status.fragment.WeightMeasureFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n19#2:620\n15#2:621\n11#2,2:634\n774#3:622\n865#3,2:623\n78#4,3:625\n81#4,5:629\n1#5:628\n*S KotlinDebug\n*F\n+ 1 WeightMeasureFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightMeasureFragment\n*L\n64#1:620\n64#1:621\n592#1:634,2\n572#1:622\n572#1:623,2\n133#1:625,3\n133#1:629,5\n133#1:628\n*E\n"})
public final class WeightMeasureFragment extends BaseFragment {
    private List<WeightMeasureItemData> items;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mSetWeightPopup$delegate;

    @tb1
    private Weight mWeight;
    private WeightDao mWeightDao;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.table_delegate$lambda$0(this.f7003IO);
        }
    });

    @aa1
    private final Lazy scrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.scrollView_delegate$lambda$0(this.f7248IO);
        }
    });

    @aa1
    private final Lazy llNoDatePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.llNoDatePanel_delegate$lambda$0(this.f8805IO);
        }
    });

    @aa1
    private final Lazy llReportPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.llReportPanel_delegate$lambda$0(this.f9079IO);
        }
    });

    @aa1
    private final Lazy llTitlePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.llTitlePanel_delegate$lambda$0(this.f9315IO);
        }
    });

    @aa1
    private final Lazy llItemPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.llItemPanel_delegate$lambda$0(this.f9583IO);
        }
    });

    @aa1
    private final Lazy tvTopBmiValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvTopBmiValue_delegate$lambda$0(this.f9822IO);
        }
    });

    @aa1
    private final Lazy tvTopWeightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvTopWeightValue_delegate$lambda$0(this.f10048IO);
        }
    });

    @aa1
    private final Lazy tvTopWeightUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvTopWeightUnit_delegate$lambda$0(this.f10257IO);
        }
    });

    @aa1
    private final Lazy tvTopBfrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvTopBfrValue_delegate$lambda$0(this.f10471IO);
        }
    });

    @aa1
    private final Lazy tvMeasureDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvMeasureDate_delegate$lambda$0(this.f10937IO);
        }
    });

    @aa1
    private final Lazy btnMeasureWeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.btnMeasureWeight_delegate$lambda$0(this.f11614IO);
        }
    });

    @aa1
    private final Lazy btnInputWeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.btnInputWeight_delegate$lambda$0(this.f11848IO);
        }
    });

    @aa1
    private final Lazy tvWeightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvWeightValue_delegate$lambda$0(this.f12079IO);
        }
    });

    @aa1
    private final Lazy tvWeightUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvWeightUnit_delegate$lambda$0(this.f12275IO);
        }
    });

    @aa1
    private final Lazy tvBfrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.tvBfrValue_delegate$lambda$0(this.f12489IO);
        }
    });

    @aa1
    private final Lazy mSbvBmi$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zz6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.mSbvBmi_delegate$lambda$0(this.f12731IO);
        }
    });

    @aa1
    private final Lazy mItemView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureFragment.mItemView_delegate$lambda$0(this.f5390IO);
        }
    });

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public OXO1() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            LevelType levelType;
            Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                levelType = LevelType.STANDARD;
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                levelType = LevelType.LOW;
            } else {
                levelType = (numValueOf != null && numValueOf.intValue() == 3) ? LevelType.HIGH : LevelType.ALL;
            }
            WeightMeasureFragment.this.showItems(levelType);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public WeightMeasureFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mSetWeightPopup$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b07
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightMeasureFragment.mSetWeightPopup_delegate$lambda$0(this.f5641IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnInputWeight_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.btn_input_weight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasureWeight_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.btn_measure_weight);
    }

    private final View getBtnInputWeight() {
        return (View) this.btnInputWeight$delegate.getValue();
    }

    private final View getBtnMeasureWeight() {
        return (View) this.btnMeasureWeight$delegate.getValue();
    }

    private final void getItems(Weight weight) {
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        String string = getString(R.string.weight);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        double dCentigradeFilter = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeight(), this.mAppUser.getUnit()));
        String string2 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        List<Double> mWeightRange = weight.getMWeightRange();
        String[] stringArray = getResources().getStringArray(R.array.level_range_5_3);
        Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
        int[] intArray = getResources().getIntArray(R.array.level_color_5_3);
        Intrinsics.O10IXXX0X(intArray, "getIntArray(...)");
        String string3 = getString(R.string.item_weight_tips);
        Intrinsics.O10IXXX0X(string3, "getString(...)");
        arrayList.add(new WeightMeasureItemData(R.drawable.icon_report_item_weight, string, true, dCentigradeFilter, string2, true, 3, 0, mWeightRange, stringArray, intArray, null, false, true, false, null, true, string3, 55424, null));
        List<WeightMeasureItemData> list = this.items;
        if (list == null) {
            Intrinsics.XXO("items");
            list = null;
        }
        String string4 = getString(R.string.bmi);
        Intrinsics.O10IXXX0X(string4, "getString(...)");
        double mBmi = weight.getMBmi();
        List<Double> mBmiRange = weight.getMBmiRange();
        String[] stringArray2 = getResources().getStringArray(R.array.level_range_4_2);
        Intrinsics.O10IXXX0X(stringArray2, "getStringArray(...)");
        int[] intArray2 = getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(intArray2, "getIntArray(...)");
        String string5 = getString(R.string.item_bmi_tips);
        Intrinsics.O10IXXX0X(string5, "getString(...)");
        list.add(new WeightMeasureItemData(R.drawable.icon_report_item_bmi, string4, true, mBmi, null, true, 2, 0, mBmiRange, stringArray2, intArray2, null, false, true, false, null, true, string5, 55440, null));
        List<WeightMeasureItemData> list2 = this.items;
        if (list2 == null) {
            Intrinsics.XXO("items");
            list2 = null;
        }
        String string6 = getString(R.string.bfr);
        Intrinsics.O10IXXX0X(string6, "getString(...)");
        double mRatioOfFat = weight.getMRatioOfFat();
        String string7 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(string7, "getString(...)");
        List<Double> mRatioOfFatRange = weight.getMRatioOfFatRange();
        String[] stringArray3 = getResources().getStringArray(R.array.level_range_5_3);
        Intrinsics.O10IXXX0X(stringArray3, "getStringArray(...)");
        int[] intArray3 = getResources().getIntArray(R.array.level_color_5_3);
        Intrinsics.O10IXXX0X(intArray3, "getIntArray(...)");
        String string8 = getString(R.string.item_bfr_tips);
        Intrinsics.O10IXXX0X(string8, "getString(...)");
        list2.add(new WeightMeasureItemData(R.drawable.icon_report_item_bfr, string6, true, mRatioOfFat, string7, true, 3, 0, mRatioOfFatRange, stringArray3, intArray3, null, false, true, false, null, true, string8, 55424, null));
        List<WeightMeasureItemData> list3 = this.items;
        if (list3 == null) {
            Intrinsics.XXO("items");
            list3 = null;
        }
        String string9 = getString(R.string.muscle_weight);
        Intrinsics.O10IXXX0X(string9, "getString(...)");
        double dCentigradeFilter2 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfMuscle(), this.mAppUser.getUnit()));
        String string10 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string10, "getString(...)");
        List<Double> mWeightOfMuscleRange = weight.getMWeightOfMuscleRange();
        String[] stringArray4 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray4, "getStringArray(...)");
        int[] intArray4 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray4, "getIntArray(...)");
        String string11 = getString(R.string.item_muscle_weight_tips);
        Intrinsics.O10IXXX0X(string11, "getString(...)");
        list3.add(new WeightMeasureItemData(R.drawable.icon_report_item_muscle_weight, string9, true, dCentigradeFilter2, string10, true, 2, 0, mWeightOfMuscleRange, stringArray4, intArray4, null, false, true, false, null, true, string11, 55424, null));
        List<WeightMeasureItemData> list4 = this.items;
        if (list4 == null) {
            Intrinsics.XXO("items");
            list4 = null;
        }
        String string12 = getString(R.string.levelofvisceralfat);
        Intrinsics.O10IXXX0X(string12, "getString(...)");
        double mLevelOfVisceralFat = weight.getMLevelOfVisceralFat();
        List<Double> mLevelOfVisceralFatRange = weight.getMLevelOfVisceralFatRange();
        String[] stringArray5 = getResources().getStringArray(R.array.level_range_4_1);
        Intrinsics.O10IXXX0X(stringArray5, "getStringArray(...)");
        int[] intArray5 = getResources().getIntArray(R.array.level_color_4_1);
        Intrinsics.O10IXXX0X(intArray5, "getIntArray(...)");
        String string13 = getString(R.string.item_levelofvisceralfat_tips);
        Intrinsics.O10IXXX0X(string13, "getString(...)");
        list4.add(new WeightMeasureItemData(R.drawable.icon_report_item_levelofvisceralfat, string12, true, mLevelOfVisceralFat, null, true, 1, 0, mLevelOfVisceralFatRange, stringArray5, intArray5, null, false, true, false, null, true, string13, 55440, null));
        List<WeightMeasureItemData> list5 = this.items;
        if (list5 == null) {
            Intrinsics.XXO("items");
            list5 = null;
        }
        String string14 = getString(R.string.water_ratio);
        Intrinsics.O10IXXX0X(string14, "getString(...)");
        double mRatioOfWater = weight.getMRatioOfWater();
        String string15 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(string15, "getString(...)");
        List<Double> mRatioOfWaterRange = weight.getMRatioOfWaterRange();
        String[] stringArray6 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray6, "getStringArray(...)");
        int[] intArray6 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray6, "getIntArray(...)");
        String string16 = getString(R.string.item_water_ratio_tips);
        Intrinsics.O10IXXX0X(string16, "getString(...)");
        list5.add(new WeightMeasureItemData(R.drawable.icon_report_item_water_ratio, string14, true, mRatioOfWater, string15, true, 2, 0, mRatioOfWaterRange, stringArray6, intArray6, null, false, true, false, null, true, string16, 55424, null));
        List<WeightMeasureItemData> list6 = this.items;
        if (list6 == null) {
            Intrinsics.XXO("items");
            list6 = null;
        }
        String string17 = getString(R.string.weightofbone);
        Intrinsics.O10IXXX0X(string17, "getString(...)");
        double dCentigradeFilter3 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfBone(), this.mAppUser.getUnit()));
        String string18 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string18, "getString(...)");
        List<Double> mWeightOfBoneRange = weight.getMWeightOfBoneRange();
        String[] stringArray7 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray7, "getStringArray(...)");
        int[] intArray7 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray7, "getIntArray(...)");
        String string19 = getString(R.string.item_weightofbone_tips);
        Intrinsics.O10IXXX0X(string19, "getString(...)");
        list6.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofbone, string17, true, dCentigradeFilter3, string18, true, 2, 0, mWeightOfBoneRange, stringArray7, intArray7, null, false, true, false, null, true, string19, 55424, null));
        List<WeightMeasureItemData> list7 = this.items;
        if (list7 == null) {
            Intrinsics.XXO("items");
            list7 = null;
        }
        String string20 = getString(R.string.bmr);
        Intrinsics.O10IXXX0X(string20, "getString(...)");
        double mBmr = weight.getMBmr();
        String string21 = getString(R.string.kcal);
        Intrinsics.O10IXXX0X(string21, "getString(...)");
        List<Double> mBmrRange = weight.getMBmrRange();
        String[] stringArray8 = getResources().getStringArray(R.array.level_range_2_2);
        Intrinsics.O10IXXX0X(stringArray8, "getStringArray(...)");
        int[] intArray8 = getResources().getIntArray(R.array.level_color_2_2);
        Intrinsics.O10IXXX0X(intArray8, "getIntArray(...)");
        String string22 = getString(R.string.item_bmr_tips);
        Intrinsics.O10IXXX0X(string22, "getString(...)");
        list7.add(new WeightMeasureItemData(R.drawable.icon_report_item_bmr, string20, true, mBmr, string21, true, 2, 0, mBmrRange, stringArray8, intArray8, null, false, true, false, null, true, string22, 55424, null));
        List<WeightMeasureItemData> list8 = this.items;
        if (list8 == null) {
            Intrinsics.XXO("items");
            list8 = null;
        }
        String string23 = getString(R.string.fat_weight);
        Intrinsics.O10IXXX0X(string23, "getString(...)");
        double dCentigradeFilter4 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfFat(), this.mAppUser.getUnit()));
        String string24 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string24, "getString(...)");
        List<Double> mWeightOfFatRange = weight.getMWeightOfFatRange();
        String[] stringArray9 = getResources().getStringArray(R.array.level_range_5_2);
        Intrinsics.O10IXXX0X(stringArray9, "getStringArray(...)");
        int[] intArray9 = getResources().getIntArray(R.array.level_color_5_2);
        Intrinsics.O10IXXX0X(intArray9, "getIntArray(...)");
        String string25 = getString(R.string.item_fat_weight_tips);
        Intrinsics.O10IXXX0X(string25, "getString(...)");
        list8.add(new WeightMeasureItemData(R.drawable.icon_report_item_fat_weight, string23, true, dCentigradeFilter4, string24, true, 2, 0, mWeightOfFatRange, stringArray9, intArray9, null, false, true, false, null, true, string25, 55424, null));
        List<WeightMeasureItemData> list9 = this.items;
        if (list9 == null) {
            Intrinsics.XXO("items");
            list9 = null;
        }
        String string26 = getString(R.string.weightofskeletalmuscle);
        Intrinsics.O10IXXX0X(string26, "getString(...)");
        double dCentigradeFilter5 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfSkeletalMuscle(), this.mAppUser.getUnit()));
        String string27 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string27, "getString(...)");
        List<Double> mWeightOfSkeletalMuscleRange = weight.getMWeightOfSkeletalMuscleRange();
        String[] stringArray10 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray10, "getStringArray(...)");
        int[] intArray10 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray10, "getIntArray(...)");
        String string28 = getString(R.string.item_weightofskeletalmuscle_tips);
        Intrinsics.O10IXXX0X(string28, "getString(...)");
        list9.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofskeletalmuscle, string26, true, dCentigradeFilter5, string27, true, 2, 0, mWeightOfSkeletalMuscleRange, stringArray10, intArray10, null, false, true, false, null, true, string28, 55424, null));
        List<WeightMeasureItemData> list10 = this.items;
        if (list10 == null) {
            Intrinsics.XXO("items");
            list10 = null;
        }
        String string29 = getString(R.string.ratioofskeletalmuscle);
        Intrinsics.O10IXXX0X(string29, "getString(...)");
        double mRatioOfSkeletalMuscle = weight.getMRatioOfSkeletalMuscle();
        String string30 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(string30, "getString(...)");
        List<Double> mRatioOfSkeletalMuscleRange = weight.getMRatioOfSkeletalMuscleRange();
        String[] stringArray11 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray11, "getStringArray(...)");
        int[] intArray11 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray11, "getIntArray(...)");
        String string31 = getString(R.string.item_ratioofskeletalmuscle_tips);
        Intrinsics.O10IXXX0X(string31, "getString(...)");
        list10.add(new WeightMeasureItemData(R.drawable.icon_report_item_ratioofskeletalmuscle, string29, true, mRatioOfSkeletalMuscle, string30, true, 2, 0, mRatioOfSkeletalMuscleRange, stringArray11, intArray11, null, false, true, false, null, true, string31, 55424, null));
        List<WeightMeasureItemData> list11 = this.items;
        if (list11 == null) {
            Intrinsics.XXO("items");
            list11 = null;
        }
        String string32 = getString(R.string.weightofwater);
        Intrinsics.O10IXXX0X(string32, "getString(...)");
        double dCentigradeFilter6 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfWater(), this.mAppUser.getUnit()));
        String string33 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string33, "getString(...)");
        List<Double> mWeightOfWaterRange = weight.getMWeightOfWaterRange();
        String[] stringArray12 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray12, "getStringArray(...)");
        int[] intArray12 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray12, "getIntArray(...)");
        String string34 = getString(R.string.item_weightofwater_tips);
        Intrinsics.O10IXXX0X(string34, "getString(...)");
        list11.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofwater, string32, true, dCentigradeFilter6, string33, true, 2, 0, mWeightOfWaterRange, stringArray12, intArray12, null, false, true, false, null, true, string34, 55424, null));
        List<WeightMeasureItemData> list12 = this.items;
        if (list12 == null) {
            Intrinsics.XXO("items");
            list12 = null;
        }
        String string35 = getString(R.string.weightofprotein);
        Intrinsics.O10IXXX0X(string35, "getString(...)");
        double dCentigradeFilter7 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightOfProtein(), this.mAppUser.getUnit()));
        String string36 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string36, "getString(...)");
        List<Double> mWeightOfProteinRange = weight.getMWeightOfProteinRange();
        String[] stringArray13 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray13, "getStringArray(...)");
        int[] intArray13 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray13, "getIntArray(...)");
        String string37 = getString(R.string.item_weightofprotein_tips);
        Intrinsics.O10IXXX0X(string37, "getString(...)");
        list12.add(new WeightMeasureItemData(R.drawable.icon_report_item_weightofprotein, string35, true, dCentigradeFilter7, string36, true, 2, 0, mWeightOfProteinRange, stringArray13, intArray13, null, false, true, false, null, true, string37, 55424, null));
        List<WeightMeasureItemData> list13 = this.items;
        if (list13 == null) {
            Intrinsics.XXO("items");
            list13 = null;
        }
        String string38 = getString(R.string.ideal_weight);
        Intrinsics.O10IXXX0X(string38, "getString(...)");
        double dCentigradeFilter8 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMIdealWeight(), this.mAppUser.getUnit()));
        String string39 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string39, "getString(...)");
        list13.add(new WeightMeasureItemData(R.drawable.icon_report_item_ideal_weight, string38, true, dCentigradeFilter8, string39, false, 0, 0, null, null, null, null, false, false, false, null, false, null, 258016, null));
        List<WeightMeasureItemData> list14 = this.items;
        if (list14 == null) {
            Intrinsics.XXO("items");
            list14 = null;
        }
        String string40 = getString(R.string.weighttocontrol);
        Intrinsics.O10IXXX0X(string40, "getString(...)");
        double dCentigradeFilter9 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMWeightToControl(), this.mAppUser.getUnit()));
        String string41 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string41, "getString(...)");
        List listI0iXXO = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] stringArray14 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray14, "getStringArray(...)");
        int[] intArray14 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray14, "getIntArray(...)");
        String string42 = getString(R.string.item_weighttocontrol_tips);
        Intrinsics.O10IXXX0X(string42, "getString(...)");
        list14.add(new WeightMeasureItemData(R.drawable.icon_report_item_weighttocontrol, string40, true, dCentigradeFilter9, string41, true, 2, 0, listI0iXXO, stringArray14, intArray14, null, false, false, false, null, true, string42, 63616, null));
        List<WeightMeasureItemData> list15 = this.items;
        if (list15 == null) {
            Intrinsics.XXO("items");
            list15 = null;
        }
        String string43 = getString(R.string.fattocontrol);
        Intrinsics.O10IXXX0X(string43, "getString(...)");
        double dCentigradeFilter10 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMFatToControl(), this.mAppUser.getUnit()));
        String string44 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string44, "getString(...)");
        List listI0iXXO2 = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] stringArray15 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray15, "getStringArray(...)");
        int[] intArray15 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray15, "getIntArray(...)");
        String string45 = getString(R.string.item_fattocontrol_tips);
        Intrinsics.O10IXXX0X(string45, "getString(...)");
        list15.add(new WeightMeasureItemData(R.drawable.icon_report_item_fattocontrol, string43, true, dCentigradeFilter10, string44, true, 2, 0, listI0iXXO2, stringArray15, intArray15, null, false, false, false, null, true, string45, 63616, null));
        List<WeightMeasureItemData> list16 = this.items;
        if (list16 == null) {
            Intrinsics.XXO("items");
            list16 = null;
        }
        String string46 = getString(R.string.muscletocontrol);
        Intrinsics.O10IXXX0X(string46, "getString(...)");
        double dCentigradeFilter11 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMMuscleToControl(), this.mAppUser.getUnit()));
        String string47 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string47, "getString(...)");
        List listI0iXXO3 = X0iO1XX.I0iXXO(Double.valueOf(0.0d));
        String[] stringArray16 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray16, "getStringArray(...)");
        int[] intArray16 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray16, "getIntArray(...)");
        String string48 = getString(R.string.item_muscletocontrol_tips);
        Intrinsics.O10IXXX0X(string48, "getString(...)");
        list16.add(new WeightMeasureItemData(R.drawable.icon_report_item_muscletocontrol, string46, true, dCentigradeFilter11, string47, true, 2, 0, listI0iXXO3, stringArray16, intArray16, null, false, false, false, null, true, string48, 63616, null));
        List<WeightMeasureItemData> list17 = this.items;
        if (list17 == null) {
            Intrinsics.XXO("items");
            list17 = null;
        }
        String string49 = getString(R.string.bodyshape);
        Intrinsics.O10IXXX0X(string49, "getString(...)");
        double mBodyShape = weight.getMBodyShape();
        String[] stringArray17 = getResources().getStringArray(R.array.body_shape_text);
        Intrinsics.O10IXXX0X(stringArray17, "getStringArray(...)");
        int[] intArray17 = getResources().getIntArray(R.array.body_shape_img);
        Intrinsics.O10IXXX0X(intArray17, "getIntArray(...)");
        list17.add(new WeightMeasureItemData(R.drawable.icon_report_item_bodyshape, string49, false, mBodyShape, null, true, 5, 0, null, stringArray17, null, null, false, false, true, intArray17, false, null, 212372, null));
        List<WeightMeasureItemData> list18 = this.items;
        if (list18 == null) {
            Intrinsics.XXO("items");
            list18 = null;
        }
        String string50 = getString(R.string.nutrition_state);
        Intrinsics.O10IXXX0X(string50, "getString(...)");
        double mStateOfNutrition = weight.getMStateOfNutrition();
        List listI0iXXO4 = X0iO1XX.I0iXXO(Double.valueOf(4.0d));
        String[] stringArray18 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray18, "getStringArray(...)");
        int[] intArray18 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray18, "getIntArray(...)");
        String string51 = getString(R.string.item_nutrition_state_tips);
        Intrinsics.O10IXXX0X(string51, "getString(...)");
        list18.add(new WeightMeasureItemData(R.drawable.icon_report_item_nutrition_state, string50, true, mStateOfNutrition, null, true, 2, 0, listI0iXXO4, stringArray18, intArray18, null, false, false, false, null, true, string51, 63632, null));
        List<WeightMeasureItemData> list19 = this.items;
        if (list19 == null) {
            Intrinsics.XXO("items");
            list19 = null;
        }
        String string52 = getString(R.string.body_age);
        Intrinsics.O10IXXX0X(string52, "getString(...)");
        double mAgeOfBody = weight.getMAgeOfBody();
        List<Double> mAgeOfBodyRange = weight.getMAgeOfBodyRange();
        String[] stringArray19 = getResources().getStringArray(R.array.level_range_body_age);
        Intrinsics.O10IXXX0X(stringArray19, "getStringArray(...)");
        int[] intArray19 = getResources().getIntArray(R.array.level_color_body_age);
        Intrinsics.O10IXXX0X(intArray19, "getIntArray(...)");
        String string53 = getString(R.string.item_body_age_tips);
        Intrinsics.O10IXXX0X(string53, "getString(...)");
        list19.add(new WeightMeasureItemData(R.drawable.icon_report_item_body_age, string52, true, mAgeOfBody, null, true, 1, 0, mAgeOfBodyRange, stringArray19, intArray19, null, false, true, false, null, true, string53, 55440, null));
        List<WeightMeasureItemData> list20 = this.items;
        if (list20 == null) {
            Intrinsics.XXO("items");
            list20 = null;
        }
        String string54 = getString(R.string.protein_ratio);
        Intrinsics.O10IXXX0X(string54, "getString(...)");
        double mRatioOfProtein = weight.getMRatioOfProtein();
        String string55 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(string55, "getString(...)");
        List<Double> mRatioOfProteinRange = weight.getMRatioOfProteinRange();
        String[] stringArray20 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray20, "getStringArray(...)");
        int[] intArray20 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray20, "getIntArray(...)");
        String string56 = getString(R.string.item_protein_ratio_tips);
        Intrinsics.O10IXXX0X(string56, "getString(...)");
        list20.add(new WeightMeasureItemData(R.drawable.icon_report_item_protein_ratio, string54, true, mRatioOfProtein, string55, true, 2, 0, mRatioOfProteinRange, stringArray20, intArray20, null, false, true, false, null, true, string56, 55424, null));
        List<WeightMeasureItemData> list21 = this.items;
        if (list21 == null) {
            Intrinsics.XXO("items");
            list21 = null;
        }
        String string57 = getString(R.string.ratioofsubcutaneousfat);
        Intrinsics.O10IXXX0X(string57, "getString(...)");
        double mRatioOfSubcutaneousFat = weight.getMRatioOfSubcutaneousFat();
        String string58 = getString(R.string.percent);
        Intrinsics.O10IXXX0X(string58, "getString(...)");
        List<Double> mRatioOfSubcutaneousFatRange = weight.getMRatioOfSubcutaneousFatRange();
        String[] stringArray21 = getResources().getStringArray(R.array.level_range_3_2);
        Intrinsics.O10IXXX0X(stringArray21, "getStringArray(...)");
        int[] intArray21 = getResources().getIntArray(R.array.level_color_3_2);
        Intrinsics.O10IXXX0X(intArray21, "getIntArray(...)");
        String string59 = getString(R.string.item_ratioofsubcutaneousfat_tips);
        Intrinsics.O10IXXX0X(string59, "getString(...)");
        list21.add(new WeightMeasureItemData(R.drawable.icon_report_item_ratioofsubcutaneousfat, string57, true, mRatioOfSubcutaneousFat, string58, true, 2, 0, mRatioOfSubcutaneousFatRange, stringArray21, intArray21, null, false, true, false, null, true, string59, 55424, null));
        List<WeightMeasureItemData> list22 = this.items;
        if (list22 == null) {
            Intrinsics.XXO("items");
            list22 = null;
        }
        String string60 = getString(R.string.fatfreebodyweight);
        Intrinsics.O10IXXX0X(string60, "getString(...)");
        double dCentigradeFilter12 = WeightMeasureDataKt.centigradeFilter(WeightMeasureDataKt.getWeightValue(weight.getMFatFreeBodyWeight(), this.mAppUser.getUnit()));
        String string61 = getString(cp5.m1626iX(this.mAppUser.getUnit()));
        Intrinsics.O10IXXX0X(string61, "getString(...)");
        String string62 = getString(R.string.item_fatfreebodyweight_tips);
        Intrinsics.O10IXXX0X(string62, "getString(...)");
        list22.add(new WeightMeasureItemData(R.drawable.icon_report_item_fatfreebodyweight, string60, true, dCentigradeFilter12, string61, false, 0, 0, null, null, null, null, false, false, false, null, true, string62, 65504, null));
    }

    private final View getLlItemPanel() {
        return (View) this.llItemPanel$delegate.getValue();
    }

    private final View getLlNoDatePanel() {
        return (View) this.llNoDatePanel$delegate.getValue();
    }

    private final View getLlReportPanel() {
        return (View) this.llReportPanel$delegate.getValue();
    }

    private final View getLlTitlePanel() {
        return (View) this.llTitlePanel$delegate.getValue();
    }

    private final RecyclerView getMItemView() {
        return (RecyclerView) this.mItemView$delegate.getValue();
    }

    private final CircleThumbSegmentedBarView getMSbvBmi() {
        return (CircleThumbSegmentedBarView) this.mSbvBmi$delegate.getValue();
    }

    private final j07 getMSetWeightPopup() {
        return (j07) this.mSetWeightPopup$delegate.getValue();
    }

    private final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView$delegate.getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    private final DINCondBold getTvBfrValue() {
        return (DINCondBold) this.tvBfrValue$delegate.getValue();
    }

    private final PFMedium getTvMeasureDate() {
        return (PFMedium) this.tvMeasureDate$delegate.getValue();
    }

    private final DINCondBold getTvTopBfrValue() {
        return (DINCondBold) this.tvTopBfrValue$delegate.getValue();
    }

    private final DINCondBold getTvTopBmiValue() {
        return (DINCondBold) this.tvTopBmiValue$delegate.getValue();
    }

    private final PFMedium getTvTopWeightUnit() {
        return (PFMedium) this.tvTopWeightUnit$delegate.getValue();
    }

    private final DINCondBold getTvTopWeightValue() {
        return (DINCondBold) this.tvTopWeightValue$delegate.getValue();
    }

    private final PFMedium getTvWeightUnit() {
        return (PFMedium) this.tvWeightUnit$delegate.getValue();
    }

    private final DINCondBold getTvWeightValue() {
        return (DINCondBold) this.tvWeightValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WeightMeasureFragment weightMeasureFragment, View view) {
        weightMeasureFragment.startActivity(new Intent(weightMeasureFragment.getActivity(), (Class<?>) BodyFatScaleActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(WeightMeasureFragment weightMeasureFragment, View view) {
        j07 mSetWeightPopup = weightMeasureFragment.getMSetWeightPopup();
        View btnInputWeight = weightMeasureFragment.getBtnInputWeight();
        Intrinsics.O10IXXX0X(btnInputWeight, "<get-btnInputWeight>(...)");
        mSetWeightPopup.I1XOi1(btnInputWeight);
        weightMeasureFragment.getMSetWeightPopup().IXXOO(weightMeasureFragment.mAppUser.getWeight() == 0.0f ? 65.0f : weightMeasureFragment.mAppUser.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llItemPanel_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.ll_weight_measure_item_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llNoDatePanel_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.ll_weight_measure_no_date_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llReportPanel_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.ll_weight_measure_report_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llTitlePanel_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return weightMeasureFragment.getMView().findViewById(R.id.ll_weight_measure_title_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mItemView_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (RecyclerView) weightMeasureFragment.getMView().findViewById(R.id.recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleThumbSegmentedBarView mSbvBmi_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (CircleThumbSegmentedBarView) weightMeasureFragment.getMView().findViewById(R.id.sbv_bmi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j07 mSetWeightPopup_delegate$lambda$0(final WeightMeasureFragment weightMeasureFragment) {
        j07 j07Var = new j07(weightMeasureFragment.getMActivity());
        j07Var.i010I(R.string.remember_weight);
        j07Var.m2360iX(weightMeasureFragment.mAppUser.getUnit());
        j07Var.IXXOO(20.0f);
        j07Var.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.qz6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(WeightMeasureFragment.mSetWeightPopup_delegate$lambda$0$0$0(this.f10718IO, ((Float) obj).floatValue()));
            }
        });
        return j07Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mSetWeightPopup_delegate$lambda$0$0$0(WeightMeasureFragment weightMeasureFragment, float f) {
        if (f < 20.0f) {
            ToastUtils.showLong(R.string.weight_set_error);
            return true;
        }
        weightMeasureFragment.mAppUser.setWeight(f);
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(weightMeasureFragment.mAppUser));
        Weight weight = new Weight(0, 0L, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        weight.setMTime(System.currentTimeMillis());
        String strMillis2String = TimeUtils.millis2String(weight.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
        weight.setMLocalTime(strMillis2String);
        weight.setMWeight(f);
        weight.setMIsMeasure(0);
        weight.setMBmi(Double.parseDouble(cp5.I0IIOi(weight.getMWeight(), weightMeasureFragment.mAppUser.getHeight())));
        WeightDao weightDao = weightMeasureFragment.mWeightDao;
        if (weightDao == null) {
            Intrinsics.XXO("mWeightDao");
            weightDao = null;
        }
        weightDao.insert(CollectionsKt__CollectionsKt.Ii1iii0(weight));
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        I01XX0.OXO1(I01XX0.I0iXXO, weight);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView scrollView_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (NestedScrollView) weightMeasureFragment.getMView().findViewById(R.id.scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showItems(LevelType levelType) {
        RecyclerView mItemView = getMItemView();
        List<WeightMeasureItemData> list = this.items;
        if (list == null) {
            Intrinsics.XXO("items");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            WeightMeasureItemData weightMeasureItemData = (WeightMeasureItemData) obj;
            if (levelType == LevelType.ALL || weightMeasureItemData.getLevelType() == levelType) {
                arrayList.add(obj);
            }
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
        mItemView.setAdapter(new WeightMeasureItemAdapter(arrayList, fragmentActivityRequireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (TabLayout) weightMeasureFragment.getMView().findViewById(R.id.table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvBfrValue_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (DINCondBold) weightMeasureFragment.getMView().findViewById(R.id.tv_bfrValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvMeasureDate_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (PFMedium) weightMeasureFragment.getMView().findViewById(R.id.tv_measure_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvTopBfrValue_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (DINCondBold) weightMeasureFragment.getMView().findViewById(R.id.tv_topBfrValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvTopBmiValue_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (DINCondBold) weightMeasureFragment.getMView().findViewById(R.id.tv_topBmiValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvTopWeightUnit_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (PFMedium) weightMeasureFragment.getMView().findViewById(R.id.tv_topWeightUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvTopWeightValue_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (DINCondBold) weightMeasureFragment.getMView().findViewById(R.id.tv_topWeightValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvWeightUnit_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (PFMedium) weightMeasureFragment.getMView().findViewById(R.id.tv_weightUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold tvWeightValue_delegate$lambda$0(WeightMeasureFragment weightMeasureFragment) {
        return (DINCondBold) weightMeasureFragment.getMView().findViewById(R.id.tv_weightValue);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        if (getMArg3() != null) {
            Serializable mArg3 = getMArg3();
            Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
            this.mWeight = (Weight) mArg3;
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"SetTextI18n"})
    public void initView() {
        Double dValueOf;
        LogUtils.m11128d(this.mWeight);
        getMItemView().setLayoutManager(new LinearLayoutManager(getActivity()));
        getMItemView().setHasFixedSize(true);
        getTable().setBackgroundColor(gk4.m1859iO(getContext(), R.color.view_page_tablayout_bg));
        View childAt = getTable().getChildAt(0);
        Intrinsics.X1ii(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        linearLayout.setShowDividers(2);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.layout_tab_divider_vertical);
        Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(gk4.m1859iO(getContext(), R.color.view_page_main_bg));
        linearLayout.setDividerDrawable(gradientDrawable);
        getTable().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new OXO1());
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        getTvTopWeightUnit().setText(cp5.m1626iX(this.mAppUser.getUnit()));
        if (getMArg1() == 1) {
            getMView().findViewById(R.id.ll_weight_measure_top_panel).setVisibility(8);
        }
        getBtnMeasureWeight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.sz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightMeasureFragment.initView$lambda$0(this.f11162IO, view);
            }
        });
        getBtnInputWeight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.tz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightMeasureFragment.initView$lambda$1(this.f11396IO, view);
            }
        });
        if (this.mWeight == null) {
            getLlNoDatePanel().setVisibility(0);
            getLlReportPanel().setVisibility(8);
            getLlTitlePanel().setVisibility(8);
            return;
        }
        getLlNoDatePanel().setVisibility(8);
        getLlReportPanel().setVisibility(0);
        if (getMArg1() == 1) {
            getLlTitlePanel().setVisibility(8);
        } else {
            getLlTitlePanel().setVisibility(0);
        }
        Weight weight = this.mWeight;
        if (Intrinsics.m39539iO(weight != null ? Double.valueOf(weight.getMBmi()) : null, 0.0d)) {
            Weight weight2 = this.mWeight;
            Intrinsics.XXI(weight2);
            dValueOf = Double.valueOf(Double.parseDouble(cp5.I0IIOi(weight2.getMWeight(), this.mAppUser.getHeight())));
        } else {
            Weight weight3 = this.mWeight;
            dValueOf = weight3 != null ? Double.valueOf(weight3.getMBmi()) : null;
        }
        DINCondBold tvTopBmiValue = getTvTopBmiValue();
        Intrinsics.XXI(dValueOf);
        tvTopBmiValue.setText(cp5.X11iII1O1((float) dValueOf.doubleValue(), false, 2, null));
        DINCondBold tvTopWeightValue = getTvTopWeightValue();
        Weight weight4 = this.mWeight;
        Intrinsics.XXI(weight4);
        tvTopWeightValue.setText(String.valueOf(cp5.OIX0iXi(cp5.IXXOO(weight4.getMWeight(), this.mAppUser.getUnit()))));
        DINCondBold tvTopBfrValue = getTvTopBfrValue();
        Weight weight5 = this.mWeight;
        tvTopBfrValue.setText(String.valueOf(weight5 != null ? Double.valueOf(weight5.getMRatioOfFat()) : null));
        PFMedium tvMeasureDate = getTvMeasureDate();
        Weight weight6 = this.mWeight;
        tvMeasureDate.setText(weight6 != null ? weight6.getMLocalTime() : null);
        DINCondBold tvWeightValue = getTvWeightValue();
        Weight weight7 = this.mWeight;
        Intrinsics.XXI(weight7);
        tvWeightValue.setText(String.valueOf(cp5.OIX0iXi(cp5.IXXOO(weight7.getMWeight(), this.mAppUser.getUnit()))));
        getTvWeightUnit().setText(cp5.m1626iX(this.mAppUser.getUnit()));
        DINCondBold tvBfrValue = getTvBfrValue();
        Weight weight8 = this.mWeight;
        tvBfrValue.setText(String.valueOf(weight8 != null ? Double.valueOf(weight8.getMRatioOfFat()) : null));
        Weight weight9 = this.mWeight;
        if (weight9 == null || weight9.getMIsMeasure() != 1) {
            getLlItemPanel().setVisibility(8);
            getTvTopBfrValue().setText(R.string.data_none);
            getTvBfrValue().setText(R.string.data_none);
            CircleThumbSegmentedBarView mSbvBmi = getMSbvBmi();
            Intrinsics.O10IXXX0X(mSbvBmi, "<get-mSbvBmi>(...)");
            double dDoubleValue = dValueOf.doubleValue();
            List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d), Double.valueOf(34.9d));
            String[] stringArray = getResources().getStringArray(R.array.level_range_4_2_bmi);
            Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
            int[] intArray = getResources().getIntArray(R.array.level_color_4_2);
            Intrinsics.O10IXXX0X(intArray, "getIntArray(...)");
            WeightMeasureDataKt.setBarView$default(mSbvBmi, dDoubleValue, listIXiX011, stringArray, intArray, false, 32, null);
            return;
        }
        getLlItemPanel().setVisibility(0);
        CircleThumbSegmentedBarView mSbvBmi2 = getMSbvBmi();
        Intrinsics.O10IXXX0X(mSbvBmi2, "<get-mSbvBmi>(...)");
        double dDoubleValue2 = dValueOf.doubleValue();
        Weight weight10 = this.mWeight;
        Intrinsics.XXI(weight10);
        List<Double> mBmiRange = weight10.getMBmiRange();
        String[] stringArray2 = getResources().getStringArray(R.array.level_range_4_2);
        Intrinsics.O10IXXX0X(stringArray2, "getStringArray(...)");
        int[] intArray2 = getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(intArray2, "getIntArray(...)");
        WeightMeasureDataKt.setBarView$default(mSbvBmi2, dDoubleValue2, mBmiRange, stringArray2, intArray2, false, 32, null);
        Weight weight11 = this.mWeight;
        Intrinsics.XXI(weight11);
        getItems(weight11);
        showItems(LevelType.ALL);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_weight_measure;
    }

    @sf5(tag = I01XX0.I0iXXO)
    public final void onMeasureWeightChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onMeasureWeightChanged");
        this.mWeight = (Weight) data;
        initView();
    }

    public final void share() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView scrollView = getScrollView();
        Intrinsics.O10IXXX0X(scrollView, "<get-scrollView>(...)");
        xIi1i01O.XO0O10(getMActivity(), xIi1i01O.m1250iO(scrollView));
    }
}
