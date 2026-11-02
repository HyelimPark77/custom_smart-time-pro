package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I11i0;
import com.android.mltcode.paycertificationapi.IIO0I000O;
import com.android.mltcode.paycertificationapi.IOO1X0;
import com.android.mltcode.paycertificationapi.IX01i1IIi;
import com.android.mltcode.paycertificationapi.O10OXXO;
import com.android.mltcode.paycertificationapi.OOIIX0;
import com.android.mltcode.paycertificationapi.OOO0OO;
import com.android.mltcode.paycertificationapi.OOi00;
import com.android.mltcode.paycertificationapi.OOiiXI;
import com.android.mltcode.paycertificationapi.OXiX0OiO;
import com.android.mltcode.paycertificationapi.OiOX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10O101O;
import com.android.mltcode.paycertificationapi.X1Xi1;
import com.android.mltcode.paycertificationapi.X1i11I;
import com.android.mltcode.paycertificationapi.X1ii0OO;
import com.android.mltcode.paycertificationapi.XIOIXI1IX;
import com.android.mltcode.paycertificationapi.XO1O;
import com.android.mltcode.paycertificationapi.XOXi1I1;
import com.android.mltcode.paycertificationapi.XX1ii1;
import com.android.mltcode.paycertificationapi.XXIX0;
import com.android.mltcode.paycertificationapi.XXOI0O;
import com.android.mltcode.paycertificationapi.XXXIOOiO;
import com.android.mltcode.paycertificationapi.XiIXXX1i;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0O1XO1;
import com.android.mltcode.paycertificationapi.i1X0XOiX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIIii0X;
import com.android.mltcode.paycertificationapi.iOXi0III;
import com.android.mltcode.paycertificationapi.iX1OX;
import com.android.mltcode.paycertificationapi.iXOiXX;
import com.android.mltcode.paycertificationapi.iiO1O0OOI;
import com.android.mltcode.paycertificationapi.iiOO0I01;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import com.szabh.smable3.entity.BleTimeRange;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHrMonitoringSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrMonitoringSettingsActivity.kt\ncom/sma/smartv3/ui/device/HrMonitoringSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public final class HrMonitoringSettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int HR_MAX = 200;
    public static final int HR_MIN = 20;

    @aa1
    private final Lazy itemHeader$delegate;

    @aa1
    private final Lazy itemHeaderHigh$delegate;

    @aa1
    private final Lazy itemHeaderLow$delegate;

    @aa1
    private final Lazy itemHeaderReal$delegate;

    @aa1
    private final Lazy itemHeaderSmart$delegate;

    @aa1
    private final Lazy itemHighValue$delegate;

    @aa1
    private final Lazy itemInterval$delegate;

    @aa1
    private final Lazy itemLowValue$delegate;

    @aa1
    private final Lazy itemTimeRange$delegate;

    @tb1
    private qv1 mHighPopup;

    @aa1
    private final BleHrMonitoringSettings mHrMonitoringSettings;

    @aa1
    private final BleHrWarningSettings mHrWarningSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private qv1 mLowPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy modePanel$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy timePanel$delegate;

    @aa1
    private final Lazy warnPanel$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.HrMonitoringSettingsActivity$delayPostEvent$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.HrMonitoringSettingsActivity$delayPostEvent$1", f = "HrMonitoringSettingsActivity.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
            return new AnonymousClass1(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            I01XX0.XIi00iiXO(I01XX0.OiIIX101O, null, 2, null);
            LogUtils.i(new Object[]{" delayPostEvent HR_MONITORING_CHANGE"});
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(1000, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public HrMonitoringSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XXOI0O(this));
        this.modePanel$delegate = LazyKt__LazyJVMKt.iO(new OOO0OO(this));
        this.itemHeaderReal$delegate = LazyKt__LazyJVMKt.iO(new X1i11I(this));
        this.itemHeaderSmart$delegate = LazyKt__LazyJVMKt.iO(new IOO1X0(this));
        this.timePanel$delegate = LazyKt__LazyJVMKt.iO(new OXiX0OiO(this));
        this.itemHeader$delegate = LazyKt__LazyJVMKt.iO(new OOi00(this));
        this.itemTimeRange$delegate = LazyKt__LazyJVMKt.iO(new OiOX0(this));
        this.itemInterval$delegate = LazyKt__LazyJVMKt.iO(new OOIIX0(this));
        this.warnPanel$delegate = LazyKt__LazyJVMKt.iO(new X1ii0OO(this));
        this.itemHeaderHigh$delegate = LazyKt__LazyJVMKt.iO(new i0O1XO1(this));
        this.itemHighValue$delegate = LazyKt__LazyJVMKt.iO(new iiO1O0OOI(this));
        this.itemHeaderLow$delegate = LazyKt__LazyJVMKt.iO(new XiIXXX1i(this));
        this.itemLowValue$delegate = LazyKt__LazyJVMKt.iO(new iiOO0I01(this));
        BleCache r1 = BleCache.INSTANCE;
        this.mHrMonitoringSettings = (BleHrMonitoringSettings) BaseBleCache.getObjectNotNull$default(r1, BleKey.HR_MONITORING, BleHrMonitoringSettings.class, null, null, 12, null);
        this.mHrWarningSettings = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(r1, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ boolean I0iXXO(HrMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4) {
        return onSetTimeRange$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit I1(BleConnector r0) {
        return initView$lambda$1$0$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(HrMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ Unit II1Xi0(HrMonitoringSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$4$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(HrMonitoringSettingsActivity r0) {
        return itemTimeRange_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IXXOO(HrMonitoringSettingsActivity r0) {
        return timePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(HrMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem O1O(HrMonitoringSettingsActivity r0) {
        return itemLowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader OII(HrMonitoringSettingsActivity r0) {
        return itemHeaderHigh_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(HrMonitoringSettingsActivity r0, int r1) {
        return onSetHighValue$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(HrMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(HrMonitoringSettingsActivity r0, BleConnector r1) {
        return initView$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(HrMonitoringSettingsActivity r0, int r1, int r2, BleConnector r3) {
        return onDeviceSetInterval$lambda$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X0O(HrMonitoringSettingsActivity r0, int r1, int r2, int r3, int r4, BleConnector r5) {
        return onSetTimeRange$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ AbhSettingsHeader X0i1O(HrMonitoringSettingsActivity r0) {
        return itemHeaderSmart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X11iII1O1(BleConnector r0) {
        return initView$lambda$2$0$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader X1IX(HrMonitoringSettingsActivity r0) {
        return itemHeaderReal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X1ii(HrMonitoringSettingsActivity r0, int r1) {
        return onSetLowValue$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(HrMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(HrMonitoringSettingsActivity r0, int r1, BleConnector r2) {
        return onSetHighValue$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XXIIO1i11(HrMonitoringSettingsActivity r0, int r1, int r2) {
        return onDeviceSetInterval$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ View XXX11i(HrMonitoringSettingsActivity r0) {
        return warnPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsHeader XiOIO(HrMonitoringSettingsActivity r0) {
        return itemHeader_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIii1(HrMonitoringSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private final void delayPostEvent() {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderHigh() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderLow() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderReal() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsHeader getItemHeaderSmart() {
        return (AbhSettingsHeader) getValue();
    }

    private final AbhSettingsItem getItemHighValue() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemLowValue() {
        return (AbhSettingsItem) getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) getValue();
    }

    private final View getModePanel() {
        return (View) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final View getTimePanel() {
        return (View) getValue();
    }

    private final View getWarnPanel() {
        return (View) getValue();
    }

    public static /* synthetic */ AbhSettingsHeader i010I(HrMonitoringSettingsActivity r0) {
        return itemHeaderLow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iI(HrMonitoringSettingsActivity r0, boolean r1, BleConnector r2) {
        return initView$lambda$3$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AbhSettingsItem iIiiO(HrMonitoringSettingsActivity r0) {
        return itemHighValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem iOO1ii1(HrMonitoringSettingsActivity r0) {
        return itemInterval_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOOX010X(HrMonitoringSettingsActivity r0, boolean r1) {
        return initView$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ View iX(HrMonitoringSettingsActivity r0) {
        return modePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX1O1(HrMonitoringSettingsActivity r0, int r1, BleConnector r2) {
        return onSetLowValue$lambda$1$0$0(r0, r1, r2);
    }

    private static final Unit initView$lambda$0$0(final HrMonitoringSettingsActivity r4, boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new XXXIOOiO(r4), 1, null) == true) goto L6;
        r4.getItemHeader().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$0$0$0(HrMonitoringSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r10.mHrMonitoringSettings});
        BleTimeRange r0 = r10.mHrMonitoringSettings.getMBleTimeRange();
        if (r10.mHrMonitoringSettings.getMBleTimeRange().getMEnabled() != 0) goto L5;
        int r1 = 255;
    L6:
        r0.setMEnabled(r1);
        BaseBleConnector.sendObject$default(r11, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, r10.mHrMonitoringSettings, false, false, 24, null);
        r10.delayPostEvent();
        LogUtils.d(new Object[]{"HR_MONITORING"});
        return Unit.OXO1;
    L5:
        r1 = 0;
        goto L6
    }

    private static final Unit initView$lambda$1$0(HrMonitoringSettingsActivity r4, boolean r5) {
        LogUtils.d(new Object[]{"onCheckChange" + r5});
        if (X0IOiX1O.XIi00iiXO(false, new OOiiXI(), 1, null) == true) goto L6;
        r4.getItemHeaderReal().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$1$0$0(BleConnector r1) {
        Intrinsics.X0O(r1, "it");
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$2$0(HrMonitoringSettingsActivity r4, boolean r5) {
        if (X0IOiX1O.XIi00iiXO(false, new O10OXXO(), 1, null) == true) goto L6;
        r4.getItemHeaderSmart().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$2$0$0(BleConnector r1) {
        Intrinsics.X0O(r1, "it");
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$3$0(final HrMonitoringSettingsActivity r4, final boolean r5) {
        r4.delayPostEvent();
        if (X0IOiX1O.XIi00iiXO(false, new XO1O(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderHigh().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$3$0$0(HrMonitoringSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r9.mHrWarningSettings});
        r9.mHrWarningSettings.setMHighSwitch(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, r9.mHrWarningSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$4$0(final HrMonitoringSettingsActivity r4, final boolean r5) {
        r4.delayPostEvent();
        if (X0IOiX1O.XIi00iiXO(false, new iIIii0X(r4, r5), 1, null) == true) goto L6;
        r4.getItemHeaderLow().setChecked(!r5);
    L6:
        return Unit.OXO1;
    }

    private static final Unit initView$lambda$4$0$0(HrMonitoringSettingsActivity r9, boolean r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        LogUtils.d(new Object[]{r9.mHrWarningSettings});
        r9.mHrWarningSettings.setMLowSwitch(OiOX0i.iO(r10));
        BaseBleConnector.sendObject$default(r11, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, r9.mHrWarningSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final AbhSettingsHeader itemHeaderHigh_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_high);
    }

    private static final AbhSettingsHeader itemHeaderLow_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_low);
    }

    private static final AbhSettingsHeader itemHeaderReal_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_real);
    }

    private static final AbhSettingsHeader itemHeaderSmart_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header_smart);
    }

    private static final AbhSettingsHeader itemHeader_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsHeader) r1.findViewById(R.id.item_header);
    }

    private static final AbhSettingsItem itemHighValue_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_high_value);
    }

    private static final AbhSettingsItem itemInterval_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_interval);
    }

    private static final AbhSettingsItem itemLowValue_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_low_value);
    }

    private static final AbhSettingsItem itemTimeRange_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_time_range);
    }

    private static final View modePanel_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.ll_mode_panel);
    }

    public static /* synthetic */ void onDeviceSetInterval$default(HrMonitoringSettingsActivity r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 15;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = R.array.hr_monitoring_intervals;
    L8:
        r0.onDeviceSetInterval(r1, r2);
    }

    private static final boolean onDeviceSetInterval$lambda$0$0(final HrMonitoringSettingsActivity r1, final int r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IIO0I000O(r1, r2, r3), 1, null);
    }

    private static final Unit onDeviceSetInterval$lambda$0$0$0(HrMonitoringSettingsActivity r8, int r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r8.mHrMonitoringSettings.setMInterval(r9 * ((int) Math.pow(2.0d, r10)));
        r8.getItemInterval().setMRightText(cp5.iI(r8.mHrMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(r11, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, r8.mHrMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    private static final boolean onSetHighValue$lambda$1$0(final HrMonitoringSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IX01i1IIi(r2, r3), 1, null);
    }

    private static final Unit onSetHighValue$lambda$1$0$0(HrMonitoringSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mHrWarningSettings.setMHighValue(r10 + 20);
        BaseBleConnector.sendObject$default(r11, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, r9.mHrWarningSettings, false, false, 24, null);
        r9.updateHigh();
        return Unit.OXO1;
    }

    private static final boolean onSetLowValue$lambda$1$0(final HrMonitoringSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new X1Xi1(r2, r3), 1, null);
    }

    private static final Unit onSetLowValue$lambda$1$0$0(HrMonitoringSettingsActivity r9, int r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        r9.mHrWarningSettings.setMLowValue(r10 + 20);
        BaseBleConnector.sendObject$default(r11, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, r9.mHrWarningSettings, false, false, 24, null);
        r9.updateLow();
        return Unit.OXO1;
    }

    private static final boolean onSetTimeRange$lambda$0$0(final HrMonitoringSettingsActivity r6, final int r7, final int r8, final int r9, final int r10) {
        return X0IOiX1O.XIi00iiXO(false, new XIOIXI1IX(r6, r7, r8, r9, r10), 1, null);
    }

    private static final Unit onSetTimeRange$lambda$0$0$0(HrMonitoringSettingsActivity r9, int r10, int r11, int r12, int r13, BleConnector r14) {
        Intrinsics.X0O(r14, "it");
        BleTimeRange r0 = r9.mHrMonitoringSettings.getMBleTimeRange();
        r0.setMStartHour(r10);
        r0.setMStartMinute(r11);
        r0.setMEndHour(r12);
        r0.setMEndMinute(r13);
        BaseBleConnector.sendObject$default(r14, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, r9.mHrMonitoringSettings, false, false, 24, null);
        r9.getItemTimeRange().setMRightText(cp5.IXI(r10, r11, r12, r13, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.root);
    }

    private static final View timePanel_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.ll_time_panel);
    }

    private final void updateHigh() {
        getItemHighValue().setMRightText(String.valueOf(this.mHrWarningSettings.getMHighValue()));
    }

    private final void updateLow() {
        getItemLowValue().setMRightText(String.valueOf(this.mHrWarningSettings.getMLowValue()));
    }

    private static final View warnPanel_delegate$lambda$0(HrMonitoringSettingsActivity r1) {
        return r1.findViewById(R.id.ll_warn_panel);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.heart_rate_monitoring);
        q62 r0 = q62.OXO1;
        if (r0.Xi() == true) goto L5;
    L7:
        getTimePanel().setVisibility(8);
    L9:
        if (r0.IXXI1() == false) goto L11;
        getModePanel().setVisibility(0);
        AbhSettingsHeader r1 = getItemHeaderReal();
        r1.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        r1.setMListener(new XOXi1I1(this));
        AbhSettingsHeader r2 = getItemHeaderSmart();
        r2.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
        r2.setMListener(new iXOiXX(this));
    L13:
        if (r0.Ii1X() == false) goto L16;
        getWarnPanel().setVisibility(0);
        AbhSettingsHeader r3 = getItemHeaderHigh();
        r3.setChecked(OiOX0i.XIi00iiXO(this.mHrWarningSettings.getMHighSwitch()));
        r3.setMListener(new XX1ii1(this));
        updateHigh();
        AbhSettingsHeader r4 = getItemHeaderLow();
        r4.setChecked(OiOX0i.XIi00iiXO(this.mHrWarningSettings.getMLowSwitch()));
        r4.setMListener(new XXIX0(this));
        updateLow();
        return;
    L16:
        getWarnPanel().setVisibility(8);
        return;
    L11:
        getModePanel().setVisibility(8);
        goto L13
    L5:
        if (r0.iI0OIOO() == false) goto L7;
        getTimePanel().setVisibility(0);
        AbhSettingsHeader r5 = getItemHeader();
        r5.setChecked(r0.IIX(this.mHrMonitoringSettings.getMBleTimeRange().getMEnabled()));
        r5.setMListener(new iX1OX(this));
        getItemTimeRange().setMRightText(cp5.IXI(this.mHrMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.iI(this.mHrMonitoringSettings.getMInterval()));
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_hr_monitoring_settings;
    }

    public final void onDeviceSetInterval(final int r8, int r9) {
        if (this.mIntervalPopup != null) goto L5;
        int r4 = 0;
        HrMonitoringSettingsActivity r2 = this;
        dj4 r1 = new dj4(r2, r9, r4, 4, null);
        r1.iX(R.string.monitoring_interval);
        r1.i010I(new X10O101O(this, r8));
        r2.mIntervalPopup = r1;
    L6:
        dj4 r10 = r2.mIntervalPopup;
        if (r10 == null) goto L10;
        r10.II1Xi0(XiiOXI.OXO1(r2.mHrMonitoringSettings.getMInterval() / r8));
        View r11 = getRootView();
        Intrinsics.O10IXXX0X(r11, "<get-rootView>(...)");
        r10.I1XOi1(r11);
        return;
    L10:
        return;
    L5:
        r2 = this;
        goto L6
    }

    public final void onSetHighValue(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mHighPopup != null) goto L8;
        ArrayList r5 = new ArrayList(181);
        int r1 = 0;
    L5:
        if (r1 >= 181) goto L7;
        r5.add(String.valueOf(r1 + 20));
        r1 = r1 + 1;
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.heart_rate_limit);
        r0.i010I().setVisibility(8);
        r0.iX(new I11i0(this));
        this.mHighPopup = r0;
    L8:
        qv1 r6 = this.mHighPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mHrWarningSettings.getMHighValue() - 20);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r6.I1XOi1(r2);
        return;
    }

    public final void onSetInterval(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (q62.OXO1.X0100I() == false) goto L6;
        onDeviceSetInterval(30, R.array.hr_monitoring_intervals_ring);
        return;
    L6:
        onDeviceSetInterval$default(this, 0, 0, 3, null);
    }

    public final void onSetLowValue(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mLowPopup != null) goto L8;
        ArrayList r5 = new ArrayList(181);
        int r1 = 0;
    L5:
        if (r1 >= 181) goto L7;
        r5.add(String.valueOf(r1 + 20));
        r1 = r1 + 1;
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.heart_rate_lower_limit);
        r0.i010I().setVisibility(8);
        r0.iX(new i1X0XOiX(this));
        this.mLowPopup = r0;
    L8:
        qv1 r6 = this.mLowPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mHrWarningSettings.getMLowValue() - 20);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r6.I1XOi1(r2);
        return;
    }

    public final void onSetTimeRange(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mTimeRangePopup != null) goto L5;
        ot5 r6 = new ot5(this, i72.OXO1.i0X000X0O());
        r6.X01IiOiIi(new iOXi0III(this));
        this.mTimeRangePopup = r6;
    L5:
        ot5 r7 = this.mTimeRangePopup;
        if (r7 == null) goto L9;
        r7.II1Xi0(this.mHrMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
