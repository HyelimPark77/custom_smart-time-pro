package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XO1I00i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.p612me.GoalSettingActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nGoalSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,111:1\n19#2:112\n15#2:113\n*S KotlinDebug\n*F\n+ 1 GoalSettingActivity.kt\ncom/sma/smartv3/ui/me/GoalSettingActivity\n*L\n35#1:112\n35#1:113\n*E\n"})
public final class GoalSettingActivity extends BaseActivity {
    private int caloriesGoalValue;
    private int distanceGoalValue;

    @aa1
    private AppUser mAppUser;
    private int stepGoalValue;

    @aa1
    private final Lazy wv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1iOOX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.wv_delegate$lambda$0(this.f8051IO);
        }
    });

    @aa1
    private final Lazy distanceGoal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1OiIOI1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.distanceGoal_delegate$lambda$0(this.f1431IO);
        }
    });

    @aa1
    private final Lazy caloriesGoal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0IiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.caloriesGoal_delegate$lambda$0(this.f7375IO);
        }
    });

    @aa1
    private final Lazy distanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi11Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.distanceUnit_delegate$lambda$0(this.f5221IO);
        }
    });

    @aa1
    private final Lazy btGoalDone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXXIi10X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.btGoalDone_delegate$lambda$0(this.f3559IO);
        }
    });

    @aa1
    private final Lazy approximatelyEqualTo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10IO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoalSettingActivity.approximatelyEqualTo_delegate$lambda$0(this.f2622IO);
        }
    });

    public GoalSettingActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium approximatelyEqualTo_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (PFMedium) goalSettingActivity.findViewById(R.id.approximatelyEqualTo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btGoalDone_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (Button) goalSettingActivity.findViewById(R.id.btGoalDone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold caloriesGoal_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (DINCondBold) goalSettingActivity.findViewById(R.id.caloriesGoal);
    }

    private final void countGoal(String str) {
        try {
            this.stepGoalValue = Integer.parseInt(str);
            getDistanceGoal().setText(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, this.mAppUser.getUnit()));
            float f = 1000;
            this.distanceGoalValue = (int) (Float.parseFloat(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, 0)) * f);
            String strIXOIIIO = cp5.IXOIIIO(this.mAppUser.getGender(), this.mAppUser.getWeight(), this.stepGoalValue);
            getCaloriesGoal().setText(strIXOIIIO);
            this.caloriesGoalValue = (int) (Float.parseFloat(strIXOIIIO) * f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceGoal_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (DINCondBold) goalSettingActivity.findViewById(R.id.distanceGoal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium distanceUnit_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (PFMedium) goalSettingActivity.findViewById(R.id.nowGoalUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doneClick$lambda$0(GoalSettingActivity goalSettingActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleConnector bleConnector = BleConnector.INSTANCE;
        BleKey bleKey = BleKey.STEP_GOAL;
        BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
        BaseBleConnector.sendInt32$default(bleConnector, bleKey, bleKeyFlag, goalSettingActivity.stepGoalValue, null, false, false, 56, null);
        if (q62.OXO1.i0XI0()) {
            BaseBleConnector.sendInt32$default(bleConnector, BleKey.CALORIES_GOAL, bleKeyFlag, goalSettingActivity.caloriesGoalValue, null, false, false, 56, null);
            BaseBleConnector.sendInt32$default(bleConnector, BleKey.DISTANCE_GOAL, bleKeyFlag, goalSettingActivity.distanceGoalValue, null, false, false, 56, null);
        }
        I01XX0.XIi00iiXO(I01XX0.XOIX, null, 2, null);
        return Unit.OXO1;
    }

    private final PFMedium getApproximatelyEqualTo() {
        return (PFMedium) this.approximatelyEqualTo$delegate.getValue();
    }

    private final Button getBtGoalDone() {
        return (Button) this.btGoalDone$delegate.getValue();
    }

    private final DINCondBold getCaloriesGoal() {
        return (DINCondBold) this.caloriesGoal$delegate.getValue();
    }

    private final DINCondBold getDistanceGoal() {
        return (DINCondBold) this.distanceGoal$delegate.getValue();
    }

    private final PFMedium getDistanceUnit() {
        return (PFMedium) this.distanceUnit$delegate.getValue();
    }

    private final WheelView getWv() {
        return (WheelView) this.wv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(GoalSettingActivity goalSettingActivity, int i) {
        goalSettingActivity.countGoal(XO1I00i.OXO1().get(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WheelView wv_delegate$lambda$0(GoalSettingActivity goalSettingActivity) {
        return (WheelView) goalSettingActivity.findViewById(R.id.f51425wv);
    }

    public final void doneClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OI0iOXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GoalSettingActivity.doneClick$lambda$0(this.f2898IO, (BleConnector) obj);
            }
        }, 1, null);
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.goal_set);
        getApproximatelyEqualTo().setVisibility(i72.OXO1.XOIX() ? 0 : 4);
        int int$default = (BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 6000, null, 4, null) / 1000) - 1;
        if (int$default < 0) {
            int$default = 9;
        }
        WheelView wv = getWv();
        Intrinsics.O10IXXX0X(wv, "<get-wv>(...)");
        XO1I00i.XIi00iiXO(wv, int$default);
        countGoal(XO1I00i.OXO1().get(int$default));
        getBtGoalDone().setText(R.string.confirm);
        getWv().OIi0();
        getWv().setListener(new dg1() { // from class: com.android.mltcode.paycertificationapi.OIO0X1iXI
            @Override // com.android.mltcode.paycertificationapi.dg1
            public final void OXO1(int i) {
                GoalSettingActivity.initView$lambda$0$0(this.OXO1, i);
            }
        });
        getDistanceUnit().setText(cp5.XX0(this.mAppUser.getUnit()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_goal_set;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
