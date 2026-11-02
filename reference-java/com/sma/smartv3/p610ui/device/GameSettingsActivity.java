package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.GameSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGameSettings;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameSettingsActivity extends BaseActivity {

    @tb1
    private ot5 mTimeRangePopup1;

    @tb1
    private ot5 mTimeRangePopup2;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00I0X1I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameSettingsActivity.rootView_delegate$lambda$0(this.f1015IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11OXi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameSettingsActivity.itemHeader_delegate$lambda$0(this.f4227IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XXO10II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameSettingsActivity.itemTimeRange1_delegate$lambda$0(this.f7451IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIOXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameSettingsActivity.itemTimeRange2_delegate$lambda$0(this.f1629IO);
        }
    });

    @aa1
    private final BleGameSettings mGameSettings = (BleGameSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_SET, BleGameSettings.class, null, null, 12, null);

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange1() {
        return (AbhSettingsItem) this.itemTimeRange1$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange2() {
        return (AbhSettingsItem) this.itemTimeRange2$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final GameSettingsActivity gameSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0OII
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameSettingsActivity.initView$lambda$0$0$0(this.f7391IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            gameSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(GameSettingsActivity gameSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        gameSettingsActivity.mGameSettings.setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.GAME_SET, BleKeyFlag.UPDATE, gameSettingsActivity.mGameSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.iOO1ii1, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(GameSettingsActivity gameSettingsActivity) {
        return (AbhSettingsHeader) gameSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange1_delegate$lambda$0(GameSettingsActivity gameSettingsActivity) {
        return (AbhSettingsItem) gameSettingsActivity.findViewById(R.id.item_time_range1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange2_delegate$lambda$0(GameSettingsActivity gameSettingsActivity) {
        return (AbhSettingsItem) gameSettingsActivity.findViewById(R.id.item_time_range2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange1$lambda$0$0(final GameSettingsActivity gameSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0I1X0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameSettingsActivity.onSetTimeRange1$lambda$0$0$0(this.f3951IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange1$lambda$0$0$0(GameSettingsActivity gameSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleGameSettings bleGameSettings = gameSettingsActivity.mGameSettings;
        bleGameSettings.setMStartHour1(i);
        bleGameSettings.setMStartMinute1(i2);
        bleGameSettings.setMEndHour1(i3);
        bleGameSettings.setMEndMinute1(i4);
        gameSettingsActivity.getItemTimeRange1().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(it, BleKey.GAME_SET, BleKeyFlag.UPDATE, gameSettingsActivity.mGameSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange2$lambda$0$0(final GameSettingsActivity gameSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiii1101
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameSettingsActivity.onSetTimeRange2$lambda$0$0$0(this.f8695IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange2$lambda$0$0$0(GameSettingsActivity gameSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleGameSettings bleGameSettings = gameSettingsActivity.mGameSettings;
        bleGameSettings.setMStartHour2(i);
        bleGameSettings.setMStartMinute2(i2);
        bleGameSettings.setMEndHour2(i3);
        bleGameSettings.setMEndMinute2(i4);
        gameSettingsActivity.getItemTimeRange2().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(it, BleKey.GAME_SET, BleKeyFlag.UPDATE, gameSettingsActivity.mGameSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(GameSettingsActivity gameSettingsActivity) {
        return gameSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_settings);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mGameSettings.getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi01i101
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameSettingsActivity.initView$lambda$0$0(this.f7931IO, ((Boolean) obj).booleanValue());
            }
        });
        AbhSettingsItem itemTimeRange1 = getItemTimeRange1();
        int mStartHour1 = this.mGameSettings.getMStartHour1();
        int mStartMinute1 = this.mGameSettings.getMStartMinute1();
        int mEndHour1 = this.mGameSettings.getMEndHour1();
        int mEndMinute1 = this.mGameSettings.getMEndMinute1();
        i72 i72Var = i72.OXO1;
        itemTimeRange1.setMRightText(cp5.IXI(mStartHour1, mStartMinute1, mEndHour1, mEndMinute1, i72Var.i0X000X0O()));
        getItemTimeRange1().setMLeftText(getString(R.string.time) + " 1");
        getItemTimeRange2().setMRightText(cp5.IXI(this.mGameSettings.getMStartHour2(), this.mGameSettings.getMStartMinute2(), this.mGameSettings.getMEndHour2(), this.mGameSettings.getMEndMinute2(), i72Var.i0X000X0O()));
        getItemTimeRange2().setMLeftText(getString(R.string.time) + " 2");
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_game_settings;
    }

    public final void onSetTimeRange1(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup1 == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.X1OOXiIOi
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(GameSettingsActivity.onSetTimeRange1$lambda$0$0(this.f4310IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup1 = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup1;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mGameSettings.getMStartHour1(), this.mGameSettings.getMStartMinute1(), this.mGameSettings.getMEndHour1(), this.mGameSettings.getMEndMinute1());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            ot5Var2.I1XOi1(rootView);
        }
    }

    public final void onSetTimeRange2(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup2 == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.XIOi1I1I
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(GameSettingsActivity.onSetTimeRange2$lambda$0$0(this.f4571IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup2 = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup2;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mGameSettings.getMStartHour2(), this.mGameSettings.getMStartMinute2(), this.mGameSettings.getMEndHour2(), this.mGameSettings.getMEndMinute2());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            ot5Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
