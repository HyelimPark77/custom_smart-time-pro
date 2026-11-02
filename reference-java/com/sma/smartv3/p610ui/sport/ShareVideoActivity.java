package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.ShareVideoActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nShareVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n104#2,9:40\n113#2,3:50\n99#2,3:53\n1#3:49\n*S KotlinDebug\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n*L\n19#1:40,9\n19#1:50,3\n19#1:53,3\n19#1:49\n*E\n"})
public final class ShareVideoActivity extends BaseActivity {
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g94
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShareVideoActivity.mWorkoutDao_delegate$lambda$0();
        }
    });
    private SportDetailVideoMapFragment sportDetailMapFragment;

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mWorkout = getMWorkoutDao().getWorkoutById(getMArg1());
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        int mArg1 = getMArg1();
        Workout workout = this.mWorkout;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", null);
        bundle2.putInt("mArg1", mArg1);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", workout);
        BaseFragment baseFragment = (BaseFragment) SportDetailVideoMapFragment.class.newInstance();
        baseFragment.setArguments(bundle2);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailVideoMapFragment");
        }
        this.sportDetailMapFragment = (SportDetailVideoMapFragment) baseFragment;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SportDetailVideoMapFragment sportDetailVideoMapFragment = this.sportDetailMapFragment;
        if (sportDetailVideoMapFragment == null) {
            Intrinsics.XXO("sportDetailMapFragment");
            sportDetailVideoMapFragment = null;
        }
        fragmentTransactionBeginTransaction.replace(R.id.sport_detail_v2_map_fragment, sportDetailVideoMapFragment).commit();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_share_map_to_viedeo;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
