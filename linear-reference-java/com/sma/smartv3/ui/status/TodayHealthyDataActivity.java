package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iOi11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.av5;
import com.android.mltcode.paycertificationapi.bv5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cv5;
import com.android.mltcode.paycertificationapi.dv5;
import com.android.mltcode.paycertificationapi.ev5;
import com.android.mltcode.paycertificationapi.fv5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tu5;
import com.android.mltcode.paycertificationapi.uu5;
import com.android.mltcode.paycertificationapi.vu5;
import com.android.mltcode.paycertificationapi.wu5;
import com.android.mltcode.paycertificationapi.xu5;
import com.android.mltcode.paycertificationapi.yu5;
import com.android.mltcode.paycertificationapi.zu5;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.TodayHealthyDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,171:1\n19#2:172\n15#2:173\n1#3:174\n1#3:178\n1#3:187\n1#3:196\n1#3:205\n69#4,3:175\n72#4,5:179\n69#4,3:184\n72#4,5:188\n69#4,3:193\n72#4,5:197\n69#4,3:202\n72#4,5:206\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n*L\n59#1:172\n59#1:173\n76#1:178\n79#1:187\n82#1:196\n85#1:205\n76#1:175,3\n76#1:179,5\n79#1:184,3\n79#1:188,5\n82#1:193,3\n82#1:197,5\n85#1:202,3\n85#1:206,5\n*E\n"})
public final class TodayHealthyDataActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final ActivityDao mActivityDao;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mCalorieValue$delegate;

    @aa1
    private final Lazy mDistanceUnit$delegate;

    @aa1
    private final Lazy mDistanceValue$delegate;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mSleepValue$delegate;

    @aa1
    private final Lazy mStepValue$delegate;

    public TodayHealthyDataActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new cv5(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new dv5(this));
        this.mStepValue$delegate = LazyKt__LazyJVMKt.iO(new ev5(this));
        this.mCalorieValue$delegate = LazyKt__LazyJVMKt.iO(new fv5(this));
        this.mSleepValue$delegate = LazyKt__LazyJVMKt.iO(new uu5(this));
        this.mDistanceValue$delegate = LazyKt__LazyJVMKt.iO(new vu5(this));
        this.mDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new wu5(this));
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ PFMedium I0iXXO(TodayHealthyDataActivity r0) {
        return mDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView I1XOi1(TodayHealthyDataActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IIX1OXO(TodayHealthyDataActivity r0) {
        return mDistanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(TodayHealthyDataActivity r0, int r1) {
        return initData$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(TodayHealthyDataActivity$initData$mAdapter$1 r0) {
        initData$lambda$2(r0);
    }

    public static /* synthetic */ void OiIIX101O(TodayHealthyDataActivity r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ DINCondBold X0O(TodayHealthyDataActivity r0) {
        return mSleepValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(TodayHealthyDataActivity r0) {
        return mCalorieValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(TodayHealthyDataActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ PFMedium XXI(TodayHealthyDataActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(TodayHealthyDataActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void XiOIii1(TodayHealthyDataActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static /* synthetic */ DINCondBold iIiiO(TodayHealthyDataActivity r0) {
        return mStepValue_delegate$lambda$0(r0);
    }

    @RequiresApi(24)
    private final void initData() {
        long[] r1 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        Activity r2 = this.mActivityDao.getActivity(r1[0], r1[1]);
        if (r2 != null) goto L5;
        r2 = new Activity(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    L5:
        getMStepValue().setText(String.valueOf(r2.getMStep()));
        getMCalorieValue().setText(String.valueOf(r2.getMCalorie() / 10000));
        getMDistanceValue().setText(cp5.IIX1OXO(r2.getMDistance() / 10000, this.mAppUser.getUnit(), false, 4, null));
        PFMedium r3 = getMDistanceUnit();
        if (this.mAppUser.getUnit() != 0) goto L8;
        String r4 = getString(R.string.km);
    L9:
        r3.setText(r4);
        final TodayHealthyDataActivity$initData$mAdapter$1 r5 = new TodayHealthyDataActivity$initData$mAdapter$1(this, TodayHealthyDataKt.getItemHealthyData(true, new av5(this)));
        getMRecyclerView().setAdapter(r5);
        new Handler(Looper.getMainLooper()).postDelayed(new bv5(r5), 100);
        return;
    L8:
        r4 = getString(R.string.mi);
        goto L9
    }

    private static final Unit initData$lambda$0(TodayHealthyDataActivity r3, int r4) {
        DINCondBold r0 = r3.getMSleepValue();
        Intrinsics.O10IXXX0X(r0, "<get-mSleepValue>(...)");
        cp5.iOO1ii1(r4, r0, r3, O0iOi11.XO0O10(r3.getMContext(), 8.0f), R.color.black);
        return Unit.OXO1;
    }

    private static final void initData$lambda$2(TodayHealthyDataActivity$initData$mAdapter$1 r0) {
        r0.notifyDataSetChanged();
    }

    private static final void initView$lambda$0(TodayHealthyDataActivity r1, View r2) {
        r1.startActivity(new Intent(r1, StepActivity.class));
    }

    private static final void initView$lambda$1(TodayHealthyDataActivity r1, View r2) {
        r1.startActivity(new Intent(r1, CaloriesActivity.class));
    }

    private static final void initView$lambda$2(TodayHealthyDataActivity r1, View r2) {
        r1.startActivity(new Intent(r1, SleepActivity.class));
    }

    private static final void initView$lambda$3(TodayHealthyDataActivity r1, View r2) {
        r1.startActivity(new Intent(r1, DistanceActivity.class));
    }

    private static final DINCondBold mCalorieValue_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.ac_today_health_data_calorie);
    }

    private static final PFMedium mDistanceUnit_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ac_today_health_data_distanceUnit);
    }

    private static final DINCondBold mDistanceValue_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.ac_today_health_data_distance);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.status_item_today_health_data);
    }

    private static final DINCondBold mSleepValue_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.ac_today_health_data_sleep);
    }

    private static final DINCondBold mStepValue_delegate$lambda$0(TodayHealthyDataActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.ac_today_health_data_steps);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    public final DINCondBold getMCalorieValue() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getMDistanceUnit() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getMDistanceValue() {
        return (DINCondBold) getValue();
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    public final DINCondBold getMSleepValue() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getMStepValue() {
        return (DINCondBold) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_data));
        findViewById(R.id.llStep).setOnClickListener(new tu5(this));
        findViewById(R.id.llCalories).setOnClickListener(new xu5(this));
        findViewById(R.id.llSleep).setOnClickListener(new yu5(this));
        findViewById(R.id.llDistance).setOnClickListener(new zu5(this));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_today_health_data;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initData();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
