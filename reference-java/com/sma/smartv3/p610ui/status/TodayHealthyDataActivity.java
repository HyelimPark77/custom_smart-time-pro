package com.sma.smartv3.p610ui.status;

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
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.TodayHealthyDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.TodayHealthyDataActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayHealthyDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,171:1\n19#2:172\n15#2:173\n1#3:174\n1#3:178\n1#3:187\n1#3:196\n1#3:205\n69#4,3:175\n72#4,5:179\n69#4,3:184\n72#4,5:188\n69#4,3:193\n72#4,5:197\n69#4,3:202\n72#4,5:206\n*S KotlinDebug\n*F\n+ 1 TodayHealthyDataActivity.kt\ncom/sma/smartv3/ui/status/TodayHealthyDataActivity\n*L\n59#1:172\n59#1:173\n76#1:178\n79#1:187\n82#1:196\n85#1:205\n76#1:175,3\n76#1:179,5\n79#1:184,3\n79#1:188,5\n82#1:193,3\n82#1:197,5\n85#1:202,3\n85#1:206,5\n*E\n"})
public final class TodayHealthyDataActivity extends BaseActivity {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cv5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.abhTitleCenter_delegate$lambda$0(this.f6061IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dv5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mRecyclerView_delegate$lambda$0(this.f6278IO);
        }
    });

    @aa1
    private final Lazy mStepValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ev5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mStepValue_delegate$lambda$0(this.f6497IO);
        }
    });

    @aa1
    private final Lazy mCalorieValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fv5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mCalorieValue_delegate$lambda$0(this.f6744IO);
        }
    });

    @aa1
    private final Lazy mSleepValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uu5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mSleepValue_delegate$lambda$0(this.f11573IO);
        }
    });

    @aa1
    private final Lazy mDistanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vu5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mDistanceValue_delegate$lambda$0(this.f11817IO);
        }
    });

    @aa1
    private final Lazy mDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wu5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TodayHealthyDataActivity.mDistanceUnit_delegate$lambda$0(this.f12040IO);
        }
    });

    @aa1
    private final ActivityDao mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();

    public TodayHealthyDataActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (PFMedium) todayHealthyDataActivity.findViewById(R.id.abh_title_center);
    }

    @RequiresApi(24)
    private final void initData() {
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        Activity activity = this.mActivityDao.getActivity(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (activity == null) {
            activity = new Activity(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 1023, null);
        }
        getMStepValue().setText(String.valueOf(activity.getMStep()));
        getMCalorieValue().setText(String.valueOf(activity.getMCalorie() / 10000));
        getMDistanceValue().setText(cp5.IIX1OXO(activity.getMDistance() / 10000, this.mAppUser.getUnit(), false, 4, null));
        getMDistanceUnit().setText(this.mAppUser.getUnit() == 0 ? getString(R.string.f54356km) : getString(R.string.f54361mi));
        final TodayHealthyDataActivity$initData$mAdapter$1 todayHealthyDataActivity$initData$mAdapter$1 = new TodayHealthyDataActivity$initData$mAdapter$1(this, TodayHealthyDataKt.getItemHealthyData(true, new Function1() { // from class: com.android.mltcode.paycertificationapi.av5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthyDataActivity.initData$lambda$0(this.f5583IO, ((Integer) obj).intValue());
            }
        }));
        getMRecyclerView().setAdapter(todayHealthyDataActivity$initData$mAdapter$1);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.bv5
            @Override // java.lang.Runnable
            public final void run() {
                todayHealthyDataActivity$initData$mAdapter$1.notifyDataSetChanged();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity, int i) {
        DINCondBold mSleepValue = todayHealthyDataActivity.getMSleepValue();
        Intrinsics.O10IXXX0X(mSleepValue, "<get-mSleepValue>(...)");
        cp5.iOO1ii1(i, mSleepValue, todayHealthyDataActivity, O0iOi11.XO0O10(todayHealthyDataActivity.getMContext(), 8.0f), R.color.black);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity, View view) {
        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) StepActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(TodayHealthyDataActivity todayHealthyDataActivity, View view) {
        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) CaloriesActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(TodayHealthyDataActivity todayHealthyDataActivity, View view) {
        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) SleepActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(TodayHealthyDataActivity todayHealthyDataActivity, View view) {
        todayHealthyDataActivity.startActivity(new Intent(todayHealthyDataActivity, (Class<?>) DistanceActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold mCalorieValue_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (DINCondBold) todayHealthyDataActivity.findViewById(R.id.ac_today_health_data_calorie);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mDistanceUnit_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (PFMedium) todayHealthyDataActivity.findViewById(R.id.ac_today_health_data_distanceUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold mDistanceValue_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (DINCondBold) todayHealthyDataActivity.findViewById(R.id.ac_today_health_data_distance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (RecyclerView) todayHealthyDataActivity.findViewById(R.id.status_item_today_health_data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold mSleepValue_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (DINCondBold) todayHealthyDataActivity.findViewById(R.id.ac_today_health_data_sleep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold mStepValue_delegate$lambda$0(TodayHealthyDataActivity todayHealthyDataActivity) {
        return (DINCondBold) todayHealthyDataActivity.findViewById(R.id.ac_today_health_data_steps);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    public final DINCondBold getMCalorieValue() {
        return (DINCondBold) this.mCalorieValue$delegate.getValue();
    }

    public final PFMedium getMDistanceUnit() {
        return (PFMedium) this.mDistanceUnit$delegate.getValue();
    }

    public final DINCondBold getMDistanceValue() {
        return (DINCondBold) this.mDistanceValue$delegate.getValue();
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    public final DINCondBold getMSleepValue() {
        return (DINCondBold) this.mSleepValue$delegate.getValue();
    }

    public final DINCondBold getMStepValue() {
        return (DINCondBold) this.mStepValue$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_data));
        findViewById(R.id.llStep).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.tu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodayHealthyDataActivity.initView$lambda$0(this.f11363IO, view);
            }
        });
        findViewById(R.id.llCalories).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodayHealthyDataActivity.initView$lambda$1(this.f12240IO, view);
            }
        });
        findViewById(R.id.llSleep).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodayHealthyDataActivity.initView$lambda$2(this.f12454IO, view);
            }
        });
        findViewById(R.id.llDistance).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.zu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodayHealthyDataActivity.initView$lambda$3(this.f12697IO, view);
            }
        });
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_today_health_data;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initData();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
