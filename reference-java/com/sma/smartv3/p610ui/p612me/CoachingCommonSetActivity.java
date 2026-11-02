package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OI001;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.p612me.CoachingCommonSetActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachingCommonSetActivity extends BaseActivity {

    @tb1
    private go0 mRemovePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i01iIXOX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.rootView_delegate$lambda$0(this.f7317IO);
        }
    });

    @aa1
    private final Lazy syncRl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXI0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.syncRl_delegate$lambda$0(this.f5014IO);
        }
    });

    @aa1
    private final Lazy syncTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0X1iII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.syncTv_delegate$lambda$0(this.f8528IO);
        }
    });

    @aa1
    private final Lazy btRemove$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX0XO1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.btRemove_delegate$lambda$0(this.f4956IO);
        }
    });

    @aa1
    private final Lazy tvExerciseDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01XiX010
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.tvExerciseDesc_delegate$lambda$0(this.f2417IO);
        }
    });

    @aa1
    private final Lazy ivExerciseBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXXOXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.ivExerciseBg_delegate$lambda$0(this.f3349IO);
        }
    });

    @aa1
    private final Lazy exerciseL1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1IOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.exerciseL1_delegate$lambda$0(this.f3667IO);
        }
    });

    @aa1
    private final Lazy exerciseL2Easy$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiXO1O1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.exerciseL2Easy_delegate$lambda$0(this.f5338IO);
        }
    });

    @aa1
    private final Lazy exerciseL2Amf$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXO0XXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.exerciseL2Amf_delegate$lambda$0(this.f3483IO);
        }
    });

    @aa1
    private final Lazy exerciseL3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XII001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingCommonSetActivity.exerciseL3_delegate$lambda$0(this.f4493IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btRemove_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (Button) coachingCommonSetActivity.findViewById(R.id.btRemove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout exerciseL1_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (LinearLayout) coachingCommonSetActivity.findViewById(R.id.exerciseL1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout exerciseL2Amf_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (LinearLayout) coachingCommonSetActivity.findViewById(R.id.exerciseL2Amf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout exerciseL2Easy_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (LinearLayout) coachingCommonSetActivity.findViewById(R.id.exerciseL2Easy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout exerciseL3_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (LinearLayout) coachingCommonSetActivity.findViewById(R.id.exerciseL3);
    }

    private final Button getBtRemove() {
        return (Button) this.btRemove$delegate.getValue();
    }

    private final LinearLayout getExerciseL1() {
        return (LinearLayout) this.exerciseL1$delegate.getValue();
    }

    private final LinearLayout getExerciseL2Amf() {
        return (LinearLayout) this.exerciseL2Amf$delegate.getValue();
    }

    private final LinearLayout getExerciseL2Easy() {
        return (LinearLayout) this.exerciseL2Easy$delegate.getValue();
    }

    private final LinearLayout getExerciseL3() {
        return (LinearLayout) this.exerciseL3$delegate.getValue();
    }

    private final RelativeLayout getIvExerciseBg() {
        return (RelativeLayout) this.ivExerciseBg$delegate.getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    private final RelativeLayout getSyncRl() {
        return (RelativeLayout) this.syncRl$delegate.getValue();
    }

    private final PFMedium getSyncTv() {
        return (PFMedium) this.syncTv$delegate.getValue();
    }

    private final PFMedium getTvExerciseDesc() {
        return (PFMedium) this.tvExerciseDesc$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout ivExerciseBg_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (RelativeLayout) coachingCommonSetActivity.findViewById(R.id.ivExerciseBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeClick$lambda$0$0() {
        ToastUtils.showLong("Remove", new Object[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (LinearLayout) coachingCommonSetActivity.findViewById(R.id.rootView);
    }

    private final void showContent() {
        getSyncRl().setVisibility(8);
        getBtRemove().setVisibility(8);
        String mArg0 = getMArg0();
        if (mArg0 != null) {
            int iHashCode = mArg0.hashCode();
            if (iHashCode != -2070069543) {
                if (iHashCode != 2405) {
                    if (iHashCode != 2407) {
                        if (iHashCode == 252115771 && mArg0.equals(i00OI001.XIi00iiXO)) {
                            getTvExerciseDesc().setText(R.string.l2_easy_fat_top_desc);
                            getIvExerciseBg().setBackgroundResource(R.drawable.l2_easy_top_image);
                            getExerciseL1().setVisibility(8);
                            getExerciseL2Easy().setVisibility(0);
                            getExerciseL2Amf().setVisibility(8);
                            getExerciseL3().setVisibility(8);
                            return;
                        }
                    } else if (mArg0.equals(i00OI001.XO0O10)) {
                        getTvExerciseDesc().setText(R.string.l3_top_desc);
                        getIvExerciseBg().setBackgroundResource(R.drawable.l3_top_image);
                        getExerciseL1().setVisibility(8);
                        getExerciseL2Easy().setVisibility(8);
                        getExerciseL2Amf().setVisibility(8);
                        getExerciseL3().setVisibility(0);
                        return;
                    }
                } else if (mArg0.equals("L1")) {
                    getTvExerciseDesc().setText(R.string.l1_run_walk);
                    getIvExerciseBg().setBackgroundResource(R.drawable.l1_top_image);
                    getExerciseL1().setVisibility(0);
                    getExerciseL2Easy().setVisibility(8);
                    getExerciseL2Amf().setVisibility(8);
                    getExerciseL3().setVisibility(8);
                    return;
                }
            } else if (mArg0.equals(i00OI001.f7277iO)) {
                getTvExerciseDesc().setText(R.string.l2_maf_top_desc);
                getIvExerciseBg().setBackgroundResource(R.drawable.l2_maf_top_image);
                getExerciseL1().setVisibility(8);
                getExerciseL2Easy().setVisibility(8);
                getExerciseL2Amf().setVisibility(0);
                getExerciseL3().setVisibility(8);
                return;
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout syncRl_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (RelativeLayout) coachingCommonSetActivity.findViewById(R.id.syncRl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium syncTv_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (PFMedium) coachingCommonSetActivity.findViewById(R.id.syncTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvExerciseDesc_delegate$lambda$0(CoachingCommonSetActivity coachingCommonSetActivity) {
        return (PFMedium) coachingCommonSetActivity.findViewById(R.id.tvExerciseDesc);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.goal_set);
        ((ImageView) findViewById(R.id.abh_title_right)).setImageResource(R.drawable.icon_synchronize);
        showContent();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_exercise_course_common_set;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getSyncRl().setVisibility(0);
        getSyncTv().setText("同步成功");
        getSyncTv().setText("同步失败");
        getSyncTv().setText("设备未连接");
        getBtRemove().setVisibility(0);
        String mArg0 = getMArg0();
        if (mArg0 != null) {
            int iHashCode = mArg0.hashCode();
            if (iHashCode == -2070069543) {
                if (mArg0.equals(i00OI001.f7277iO)) {
                    ToastUtils.showLong("同步L2 MAF锻炼模式", new Object[0]);
                }
            } else if (iHashCode == 2405) {
                if (mArg0.equals("L1")) {
                    ToastUtils.showLong("同步L1锻炼模式", new Object[0]);
                }
            } else if (iHashCode == 2407) {
                if (mArg0.equals(i00OI001.XO0O10)) {
                    ToastUtils.showLong("同步L3锻炼模式", new Object[0]);
                }
            } else if (iHashCode == 252115771 && mArg0.equals(i00OI001.XIi00iiXO)) {
                ToastUtils.showLong("同步L2 Easy锻炼模式", new Object[0]);
            }
        }
    }

    public final void removeClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mRemovePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.remove_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi101
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(CoachingCommonSetActivity.removeClick$lambda$0$0());
                }
            });
            this.mRemovePopup = go0Var;
        }
        go0 go0Var2 = this.mRemovePopup;
        if (go0Var2 != null) {
            LinearLayout rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }
}
