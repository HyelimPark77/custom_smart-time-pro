package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I00I0X1I0;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IIOXO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0I1X0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X11OXi0;
import com.android.mltcode.paycertificationapi.X1OOXiIOi;
import com.android.mltcode.paycertificationapi.XIOi1I1I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i0OII;
import com.android.mltcode.paycertificationapi.i0XXO10II;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIi01i101;
import com.android.mltcode.paycertificationapi.iiii1101;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemTimeRange1$delegate;

    @aa1
    private final Lazy itemTimeRange2$delegate;

    @aa1
    private final BleGameSettings mGameSettings;

    @tb1
    private ot5 mTimeRangePopup1;

    @tb1
    private ot5 mTimeRangePopup2;

    @aa1
    private final Lazy rootView$delegate;

    public GameSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new I00I0X1I0(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new X11OXi0(this));
        this.itemTimeRange1$delegate = LazyKt__LazyJVMKt.iO(new i0XXO10II(this));
        this.itemTimeRange2$delegate = LazyKt__LazyJVMKt.iO(new IIOXO(this));
        this.mGameSettings = (BleGameSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_SET, BleGameSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ Unit I0iXXO(GameSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange2$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit I1XOi1(GameSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(GameSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange1$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ boolean O10IXXX0X(GameSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange2$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OIX0iXi(GameSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem X0O(GameSettingsActivity r0) {
        return itemTimeRange1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem X1ii(GameSettingsActivity r0) {
        return itemTimeRange2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XXI(GameSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(GameSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemTimeRange1() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTimeRange2() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    public static /* synthetic */ boolean iIiiO(GameSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange1$lambda$0$0(r0, r1, r2, r3, r4);
    }

    private static final Unit initView$lambda$0$0(final GameSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new i0OII(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(GameSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mGameSettings.setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.GAME_SET, BleKeyFlag.UPDATE, r9.mGameSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.iOO1ii1, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(GameSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemTimeRange1_delegate$lambda$0(GameSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range1);
    }

    private static final AbhSettingsItem itemTimeRange2_delegate$lambda$0(GameSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range2);
    }

    private static final boolean onSetTimeRange1$lambda$0$0(final GameSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new X0I1X0(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange1$lambda$0$0$0(GameSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleGameSettings r0 = r9.mGameSettings;
        r0.setMStartHour1(r10);
        r0.setMStartMinute1(r11);
        r0.setMEndHour1(r12);
        r0.setMEndMinute1(r13);
        r9.getItemTimeRange1().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(r14, BleKey.GAME_SET, BleKeyFlag.UPDATE, r9.mGameSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange2$lambda$0$0(final GameSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new iiii1101(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange2$lambda$0$0$0(GameSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleGameSettings r0 = r9.mGameSettings;
        r0.setMStartHour2(r10);
        r0.setMStartMinute2(r11);
        r0.setMEndHour2(r12);
        r0.setMEndMinute2(r13);
        r9.getItemTimeRange2().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(r14, BleKey.GAME_SET, BleKeyFlag.UPDATE, r9.mGameSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(GameSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_settings);
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(OiOX0i.XIi00iiXO(this.mGameSettings.getMEnabled()));
        r0.setMListener(new iIi01i101(this));
        AbhSettingsItem r1 = getItemTimeRange1();
        int r2 = this.mGameSettings.getMStartHour1();
        int r3 = this.mGameSettings.getMStartMinute1();
        int r4 = this.mGameSettings.getMEndHour1();
        int r5 = this.mGameSettings.getMEndMinute1();
        i72 r6 = i72.OXO1;
        r1.setMRightText(cp5.IXI(r2, r3, r4, r5, r6.i0X000X0O()));
        getItemTimeRange1().setMLeftText(getString(R.string.time) + " 1");
        getItemTimeRange2().setMRightText(cp5.IXI(this.mGameSettings.getMStartHour2(), this.mGameSettings.getMStartMinute2(), this.mGameSettings.getMEndHour2(), this.mGameSettings.getMEndMinute2(), r6.i0X000X0O()));
        getItemTimeRange2().setMLeftText(getString(R.string.time) + " 2");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_game_settings;
    }

    public final void onSetTimeRange1(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup1 != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new X1OOXiIOi(this));
        this.mTimeRangePopup1 = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup1;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mGameSettings.getMStartHour1(), this.mGameSettings.getMStartMinute1(), this.mGameSettings.getMEndHour1(), this.mGameSettings.getMEndMinute1());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r7.I1XOi1(r0);
        return;
    }

    public final void onSetTimeRange2(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup2 != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new XIOi1I1I(this));
        this.mTimeRangePopup2 = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup2;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mGameSettings.getMStartHour2(), this.mGameSettings.getMStartMinute2(), this.mGameSettings.getMEndHour2(), this.mGameSettings.getMEndMinute2());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r7.I1XOi1(r0);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
