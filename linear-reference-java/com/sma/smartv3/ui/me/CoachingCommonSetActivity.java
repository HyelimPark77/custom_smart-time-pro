package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O01XiX010;
import com.android.mltcode.paycertificationapi.OOXXOXI;
import com.android.mltcode.paycertificationapi.OXO0XXI;
import com.android.mltcode.paycertificationapi.Oi101;
import com.android.mltcode.paycertificationapi.Oi1IOO;
import com.android.mltcode.paycertificationapi.XII001;
import com.android.mltcode.paycertificationapi.XX0XO1OI;
import com.android.mltcode.paycertificationapi.XXI0I;
import com.android.mltcode.paycertificationapi.XiXO1O1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OI001;
import com.android.mltcode.paycertificationapi.i01iIXOX1;
import com.android.mltcode.paycertificationapi.ii0X1iII;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachingCommonSetActivity extends BaseActivity {

    @aa1
    private final Lazy btRemove$delegate;

    @aa1
    private final Lazy exerciseL1$delegate;

    @aa1
    private final Lazy exerciseL2Amf$delegate;

    @aa1
    private final Lazy exerciseL2Easy$delegate;

    @aa1
    private final Lazy exerciseL3$delegate;

    @aa1
    private final Lazy ivExerciseBg$delegate;

    @tb1
    private go0 mRemovePopup;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy syncRl$delegate;

    @aa1
    private final Lazy syncTv$delegate;

    @aa1
    private final Lazy tvExerciseDesc$delegate;

    public CoachingCommonSetActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new i01iIXOX1(this));
        this.syncRl$delegate = LazyKt__LazyJVMKt.iO(new XXI0I(this));
        this.syncTv$delegate = LazyKt__LazyJVMKt.iO(new ii0X1iII(this));
        this.btRemove$delegate = LazyKt__LazyJVMKt.iO(new XX0XO1OI(this));
        this.tvExerciseDesc$delegate = LazyKt__LazyJVMKt.iO(new O01XiX010(this));
        this.ivExerciseBg$delegate = LazyKt__LazyJVMKt.iO(new OOXXOXI(this));
        this.exerciseL1$delegate = LazyKt__LazyJVMKt.iO(new Oi1IOO(this));
        this.exerciseL2Easy$delegate = LazyKt__LazyJVMKt.iO(new XiXO1O1i(this));
        this.exerciseL2Amf$delegate = LazyKt__LazyJVMKt.iO(new OXO0XXI(this));
        this.exerciseL3$delegate = LazyKt__LazyJVMKt.iO(new XII001(this));
    }

    public static /* synthetic */ RelativeLayout I0iXXO(CoachingCommonSetActivity r0) {
        return ivExerciseBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout I1XOi1(CoachingCommonSetActivity r0) {
        return exerciseL2Amf_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button IIX1OXO(CoachingCommonSetActivity r0) {
        return btRemove_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X() {
        return removeClick$lambda$0$0();
    }

    public static /* synthetic */ LinearLayout OIX0iXi(CoachingCommonSetActivity r0) {
        return exerciseL2Easy_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X0O(CoachingCommonSetActivity r0) {
        return syncTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(CoachingCommonSetActivity r0) {
        return tvExerciseDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX0(CoachingCommonSetActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXI(CoachingCommonSetActivity r0) {
        return exerciseL1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XiOIO(CoachingCommonSetActivity r0) {
        return exerciseL3_delegate$lambda$0(r0);
    }

    private static final Button btRemove_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (Button) r1.findViewById(R.id.btRemove);
    }

    private static final LinearLayout exerciseL1_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.exerciseL1);
    }

    private static final LinearLayout exerciseL2Amf_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.exerciseL2Amf);
    }

    private static final LinearLayout exerciseL2Easy_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.exerciseL2Easy);
    }

    private static final LinearLayout exerciseL3_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.exerciseL3);
    }

    private final Button getBtRemove() {
        return (Button) getValue();
    }

    private final LinearLayout getExerciseL1() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getExerciseL2Amf() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getExerciseL2Easy() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getExerciseL3() {
        return (LinearLayout) getValue();
    }

    private final RelativeLayout getIvExerciseBg() {
        return (RelativeLayout) getValue();
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    private final RelativeLayout getSyncRl() {
        return (RelativeLayout) getValue();
    }

    private final PFMedium getSyncTv() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvExerciseDesc() {
        return (PFMedium) getValue();
    }

    public static /* synthetic */ RelativeLayout iIiiO(CoachingCommonSetActivity r0) {
        return syncRl_delegate$lambda$0(r0);
    }

    private static final RelativeLayout ivExerciseBg_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.ivExerciseBg);
    }

    private static final boolean removeClick$lambda$0$0() {
        ToastUtils.showLong("Remove", new Object[0]);
        return true;
    }

    private static final LinearLayout rootView_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.rootView);
    }

    private final void showContent() {
        getSyncRl().setVisibility(8);
        getBtRemove().setVisibility(8);
        String r0 = getMArg0();
        if (r0 == null) goto L33;
        int r2 = r0.hashCode();
        if (r2 == (-2070069543)) goto L29;
        if (r2 == 2405) goto L24;
        if (r2 == 2407) goto L19;
        if (r2 != 252115771) goto L33;
        if (r0.equals(i00OI001.XIi00iiXO) == false) goto L33;
        getTvExerciseDesc().setText(R.string.l2_easy_fat_top_desc);
        getIvExerciseBg().setBackgroundResource(R.drawable.l2_easy_top_image);
        getExerciseL1().setVisibility(8);
        getExerciseL2Easy().setVisibility(0);
        getExerciseL2Amf().setVisibility(8);
        getExerciseL3().setVisibility(8);
        return;
    L19:
        if (r0.equals(i00OI001.XO0O10) == false) goto L33;
        getTvExerciseDesc().setText(R.string.l3_top_desc);
        getIvExerciseBg().setBackgroundResource(R.drawable.l3_top_image);
        getExerciseL1().setVisibility(8);
        getExerciseL2Easy().setVisibility(8);
        getExerciseL2Amf().setVisibility(8);
        getExerciseL3().setVisibility(0);
        return;
    L24:
        if (r0.equals("L1") == false) goto L33;
        getTvExerciseDesc().setText(R.string.l1_run_walk);
        getIvExerciseBg().setBackgroundResource(R.drawable.l1_top_image);
        getExerciseL1().setVisibility(0);
        getExerciseL2Easy().setVisibility(8);
        getExerciseL2Amf().setVisibility(8);
        getExerciseL3().setVisibility(8);
        return;
    L29:
        if (r0.equals(i00OI001.iO) == false) goto L33;
        getTvExerciseDesc().setText(R.string.l2_maf_top_desc);
        getIvExerciseBg().setBackgroundResource(R.drawable.l2_maf_top_image);
        getExerciseL1().setVisibility(8);
        getExerciseL2Easy().setVisibility(8);
        getExerciseL2Amf().setVisibility(0);
        getExerciseL3().setVisibility(8);
        return;
    L33:
        finish();
    }

    private static final RelativeLayout syncRl_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.syncRl);
    }

    private static final PFMedium syncTv_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (PFMedium) r1.findViewById(R.id.syncTv);
    }

    private static final PFMedium tvExerciseDesc_delegate$lambda$0(CoachingCommonSetActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tvExerciseDesc);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.goal_set);
        ((ImageView) findViewById(R.id.abh_title_right)).setImageResource(R.drawable.icon_synchronize);
        showContent();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_exercise_course_common_set;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        getSyncRl().setVisibility(0);
        getSyncTv().setText("同步成功");
        getSyncTv().setText("同步失败");
        getSyncTv().setText("设备未连接");
        getBtRemove().setVisibility(0);
        String r5 = getMArg0();
        if (r5 == null) goto L33;
        int r1 = r5.hashCode();
        if (r1 == (-2070069543)) goto L29;
        if (r1 == 2405) goto L24;
        if (r1 == 2407) goto L19;
        if (r1 == 252115771) goto L14;
        return;
    L14:
        if (r5.equals(i00OI001.XIi00iiXO) == false) goto L35;
        ToastUtils.showLong("同步L2 Easy锻炼模式", new Object[0]);
        return;
    L35:
        return;
    L19:
        if (r5.equals(i00OI001.XO0O10) == false) goto L36;
        ToastUtils.showLong("同步L3锻炼模式", new Object[0]);
        return;
    L36:
        return;
    L24:
        if (r5.equals("L1") == false) goto L37;
        ToastUtils.showLong("同步L1锻炼模式", new Object[0]);
        return;
    L37:
        return;
    L29:
        if (r5.equals(i00OI001.iO) == false) goto L38;
        ToastUtils.showLong("同步L2 MAF锻炼模式", new Object[0]);
        return;
    L38:
        return;
    }

    public final void removeClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mRemovePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.remove_remind);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new Oi101());
        this.mRemovePopup = r5;
    L5:
        go0 r6 = this.mRemovePopup;
        if (r6 == null) goto L9;
        LinearLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }
}
