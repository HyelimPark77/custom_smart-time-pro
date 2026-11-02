package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.g94;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nShareVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n104#2,9:40\n113#2,3:50\n99#2,3:53\n1#3:49\n*S KotlinDebug\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n*L\n19#1:40,9\n19#1:50,3\n19#1:53,3\n19#1:49\n*E\n"})
public final class ShareVideoActivity extends BaseActivity {
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate;
    private SportDetailVideoMapFragment sportDetailMapFragment;

    public ShareVideoActivity() {
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new g94());
    }

    public static /* synthetic */ WorkoutDao OIX0iXi() {
        return mWorkoutDao_delegate$lambda$0();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        this.mWorkout = getMWorkoutDao().getWorkoutById(getMArg1());
        BaseFragment.OXO1 r6 = BaseFragment.Companion;
        int r7 = getMArg1();
        Workout r0 = this.mWorkout;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r0 = null;
    L5:
        Bundle r2 = new Bundle();
        r2.putString("mArg0", null);
        r2.putInt("mArg1", r7);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", r0);
        BaseFragment r8 = (BaseFragment) SportDetailVideoMapFragment.class.newInstance();
        r8.setArguments(r2);
        if (r8 == null) goto L10;
        this.sportDetailMapFragment = (SportDetailVideoMapFragment) r8;
        return;
    L10:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailVideoMapFragment");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        FragmentTransaction r0 = getSupportFragmentManager().beginTransaction();
        SportDetailVideoMapFragment r1 = this.sportDetailMapFragment;
        if (r1 != null) goto L5;
        Intrinsics.XXO("sportDetailMapFragment");
        r1 = null;
    L5:
        r0.replace(R.id.sport_detail_v2_map_fragment, r1).commit();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_share_map_to_viedeo;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
