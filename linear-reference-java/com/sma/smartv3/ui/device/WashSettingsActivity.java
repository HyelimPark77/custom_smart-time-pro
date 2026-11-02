package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.gm6;
import com.android.mltcode.paycertificationapi.hm6;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.im6;
import com.android.mltcode.paycertificationapi.jm6;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.km6;
import com.android.mltcode.paycertificationapi.lm6;
import com.android.mltcode.paycertificationapi.mm6;
import com.android.mltcode.paycertificationapi.nm6;
import com.android.mltcode.paycertificationapi.om6;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.pm6;
import com.android.mltcode.paycertificationapi.qm6;
import com.android.mltcode.paycertificationapi.rm6;
import com.android.mltcode.paycertificationapi.sm6;
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
import com.szabh.smable3.entity.BleRepeat;
import com.szabh.smable3.entity.BleWashSettings;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WashSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemRepeat$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final BleWashSettings mWashSettings;

    @aa1
    private final Lazy rootView$delegate;

    public WashSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new rm6(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new sm6(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new hm6(this));
        this.itemRepeat$delegate = LazyKt__LazyJVMKt.iO(new im6(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new jm6(this));
        this.mWashSettings = (BleWashSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.WASH_SET, BleWashSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ boolean I0iXXO(WashSettingsActivity r0, Set r1) {
        return onSetRepeat$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsHeader I1XOi1(WashSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(WashSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O10IXXX0X(WashSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean OIX0iXi(WashSettingsActivity r0, int r1) {
        return onSetInterval$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem OiIIX101O(WashSettingsActivity r0) {
        return itemRepeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(WashSettingsActivity r0, int r1, BleConnector r2) {
        return onSetInterval$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem X1ii(WashSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(WashSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ AbhSettingsItem XXI(WashSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(WashSettingsActivity r0, Set r1, BleConnector r2) {
        return onSetRepeat$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XiOIii1(WashSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    public static /* synthetic */ View iIiiO(WashSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private static final Unit initView$lambda$0$0(final WashSettingsActivity r4, final boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new nm6(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(WashSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mWashSettings.setMEnabled(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.WASH_SET, BleKeyFlag.UPDATE, r9.mWashSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.IXXOO, null, 2, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(WashSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(WashSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemRepeat_delegate$lambda$0(WashSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_repeat);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(WashSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final boolean onSetInterval$lambda$0$0(final WashSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new mm6(r2, r3), 1, null);
    }

    private static final Unit onSetInterval$lambda$0$0$0(WashSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mWashSettings.setMInterval(((int) Math.pow(2.0d, r10)) * 30);
        r9.getItemInterval().setMRightText(cp5.iI(r9.mWashSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.WASH_SET, BleKeyFlag.UPDATE, r9.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetRepeat$lambda$0$0(final WashSettingsActivity r2, final Set r3) {
        Intrinsics.X0O(r3, "picked");
        return X0IOiX1O.XIi00iiXO(false, new om6(r2, r3), 1, null);
    }

    private static final Unit onSetRepeat$lambda$0$0$0(WashSettingsActivity r9, Set r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mWashSettings.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, r10, null, 2, null));
        r9.getItemRepeat().setMRightText(cp5.X11I(r9.mWashSettings.getMRepeat()));
        BaseBleConnector.sendObject$default(r11, BleKey.WASH_SET, BleKeyFlag.UPDATE, r9.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final WashSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new pm6(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(WashSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleWashSettings r0 = r9.mWashSettings;
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(r14, BleKey.WASH_SET, BleKeyFlag.UPDATE, r9.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(WashSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.wash_set);
        AbhSettingsHeader r0 = getItemHeader();
        r0.setChecked(OiOX0i.XIi00iiXO(this.mWashSettings.getMEnabled()));
        r0.setMListener(new lm6(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mWashSettings.getMStartHour(), this.mWashSettings.getMStartMinute(), this.mWashSettings.getMEndHour(), this.mWashSettings.getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemRepeat().setMRightText(cp5.X11I(this.mWashSettings.getMRepeat()));
        getItemInterval().setMRightText(cp5.iI(this.mWashSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_wash_settings;
    }

    public final void onSetInterval(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mIntervalPopup != null) goto L5;
        int r2 = R.array.wash_set_intervals;
        int r3 = 0;
        WashSettingsActivity r1 = this;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.interval);
        r0.i010I(new gm6(this));
        r1.mIntervalPopup = r0;
    L6:
        dj4 r8 = r1.mIntervalPopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(XiiOXI.OXO1(r1.mWashSettings.getMInterval() / 30));
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r8.I1XOi1(r4);
        return;
    L10:
        return;
    L5:
        r1 = this;
        goto L6
    }

    public final void onSetRepeat(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mRepeatPopup != null) goto L5;
        jv0 r6 = new jv0(this, R.array.weekdays_s);
        r6.O1O(R.string.repeat);
        r6.iOO1ii1(new qm6(this));
        this.mRepeatPopup = r6;
    L5:
        jv0 r7 = this.mRepeatPopup;
        if (r7 == null) goto L9;
        r7.IXXOO(BleRepeat.toIndices$default(BleRepeat.INSTANCE, this.mWashSettings.getMRepeat(), null, 2, null));
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r7.I1XOi1(r0);
        return;
    }

    public final void onSetTimeRange(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new km6(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mWashSettings.getMStartHour(), this.mWashSettings.getMStartMinute(), this.mWashSettings.getMEndHour(), this.mWashSettings.getMEndMinute());
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
