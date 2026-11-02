package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I1OiIOI1X;
import com.android.mltcode.paycertificationapi.O10IO0i;
import com.android.mltcode.paycertificationapi.OI0iOXO;
import com.android.mltcode.paycertificationapi.OIO0X1iXI;
import com.android.mltcode.paycertificationapi.OXXXIi10X;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XO1I00i;
import com.android.mltcode.paycertificationapi.Xi11Xi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i0IiXi;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1iOOX1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nGoalSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,111:1\n19#2:112\n15#2:113\n*S KotlinDebug\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n*L\n35#1:112\n35#1:113\n*E\n"})
public final class GoalSettingActivity extends BaseActivity {

    @aa1
    private final Lazy approximatelyEqualTo$delegate;

    @aa1
    private final Lazy btGoalDone$delegate;

    @aa1
    private final Lazy caloriesGoal$delegate;
    private int caloriesGoalValue;

    @aa1
    private final Lazy distanceGoal$delegate;
    private int distanceGoalValue;

    @aa1
    private final Lazy distanceUnit$delegate;

    @aa1
    private AppUser mAppUser;
    private int stepGoalValue;

    @aa1
    private final Lazy wv$delegate;

    public GoalSettingActivity() {
        this.wv$delegate = LazyKt__LazyJVMKt.iO(new iO1iOOX1(this));
        this.distanceGoal$delegate = LazyKt__LazyJVMKt.iO(new I1OiIOI1X(this));
        this.caloriesGoal$delegate = LazyKt__LazyJVMKt.iO(new i0IiXi(this));
        this.distanceUnit$delegate = LazyKt__LazyJVMKt.iO(new Xi11Xi(this));
        this.btGoalDone$delegate = LazyKt__LazyJVMKt.iO(new OXXXIi10X(this));
        this.approximatelyEqualTo$delegate = LazyKt__LazyJVMKt.iO(new O10IO0i(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ Unit I0iXXO(GoalSettingActivity r0, BleConnector r1) {
        return doneClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium I1XOi1(GoalSettingActivity r0) {
        return approximatelyEqualTo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold IIX1OXO(GoalSettingActivity r0) {
        return caloriesGoal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WheelView O10IXXX0X(GoalSettingActivity r0) {
        return wv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OIX0iXi(GoalSettingActivity r0) {
        return btGoalDone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X0O(GoalSettingActivity r0) {
        return distanceGoal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(GoalSettingActivity r0) {
        return distanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(GoalSettingActivity r0, int r1) {
        initView$lambda$0$0(r0, r1);
    }

    private static final PFMedium approximatelyEqualTo_delegate$lambda$0(GoalSettingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.approximatelyEqualTo);
    }

    private static final Button btGoalDone_delegate$lambda$0(GoalSettingActivity r1) {
        return (Button) r1.findViewById(R.id.btGoalDone);
    }

    private static final DINCondBold caloriesGoal_delegate$lambda$0(GoalSettingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.caloriesGoal);
    }

    private final void countGoal(String r4) {
        this.stepGoalValue = Integer.parseInt(r4);     // Catch: Exception -> L4
        getDistanceGoal().setText(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, this.mAppUser.getUnit()));     // Catch: Exception -> L4
        float r0 = 1000;
        this.distanceGoalValue = (int) (Float.parseFloat(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, 0)) * r0);     // Catch: Exception -> L4
        String r5 = cp5.IXOIIIO(this.mAppUser.getGender(), this.mAppUser.getWeight(), this.stepGoalValue);     // Catch: Exception -> L4
        getCaloriesGoal().setText(r5);     // Catch: Exception -> L4
        this.caloriesGoalValue = (int) (Float.parseFloat(r5) * r0);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    private static final DINCondBold distanceGoal_delegate$lambda$0(GoalSettingActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.distanceGoal);
    }

    private static final PFMedium distanceUnit_delegate$lambda$0(GoalSettingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.nowGoalUnit);
    }

    private static final Unit doneClick$lambda$0(GoalSettingActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BleConnector r1 = BleConnector.INSTANCE;
        BleKey r2 = BleKey.STEP_GOAL;
        BleKeyFlag r3 = BleKeyFlag.UPDATE;
        BaseBleConnector.sendInt32$default(r1, r2, r3, r10.stepGoalValue, null, false, false, 56, null);
        if (q62.OXO1.i0XI0() == false) goto L5;
        BaseBleConnector.sendInt32$default(r1, BleKey.CALORIES_GOAL, r3, r10.caloriesGoalValue, null, false, false, 56, null);
        BaseBleConnector.sendInt32$default(r1, BleKey.DISTANCE_GOAL, r3, r10.distanceGoalValue, null, false, false, 56, null);
    L5:
        I01XX0.XIi00iiXO(I01XX0.XOIX, null, 2, null);
        return Unit.OXO1;
    }

    private final PFMedium getApproximatelyEqualTo() {
        return (PFMedium) getValue();
    }

    private final Button getBtGoalDone() {
        return (Button) getValue();
    }

    private final DINCondBold getCaloriesGoal() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getDistanceGoal() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getDistanceUnit() {
        return (PFMedium) getValue();
    }

    private final WheelView getWv() {
        return (WheelView) getValue();
    }

    private static final void initView$lambda$0$0(GoalSettingActivity r1, int r2) {
        r1.countGoal(XO1I00i.OXO1().get(r2));
    }

    private static final WheelView wv_delegate$lambda$0(GoalSettingActivity r1) {
        return (WheelView) r1.findViewById(R.id.wv);
    }

    public final void doneClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        X0IOiX1O.XIi00iiXO(false, new OI0iOXO(this), 1, null);
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.goal_set);
        PFMedium r0 = getApproximatelyEqualTo();
        if (i72.OXO1.XOIX() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        int r2 = (BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 6000, null, 4, null) / 1000) - 1;
        if (r2 >= 0) goto L9;
        r2 = 9;
    L9:
        WheelView r3 = getWv();
        Intrinsics.O10IXXX0X(r3, "<get-wv>(...)");
        XO1I00i.XIi00iiXO(r3, r2);
        countGoal(XO1I00i.OXO1().get(r2));
        getBtGoalDone().setText(R.string.confirm);
        getWv().OIi0();
        getWv().setListener(new OIO0X1iXI(this));
        getDistanceUnit().setText(cp5.XX0(this.mAppUser.getUnit()));
        return;
    L5:
        r1 = 4;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_goal_set;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
