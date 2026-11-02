package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.WashSettingsActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WashSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private jv0 mRepeatPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WashSettingsActivity.rootView_delegate$lambda$0(this.f10846IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WashSettingsActivity.itemHeader_delegate$lambda$0(this.f11085IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WashSettingsActivity.itemTimeRange_delegate$lambda$0(this.f7155IO);
        }
    });

    @aa1
    private final Lazy itemRepeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.im6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WashSettingsActivity.itemRepeat_delegate$lambda$0(this.f8717IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WashSettingsActivity.itemInterval_delegate$lambda$0(this.f9009IO);
        }
    });

    @aa1
    private final BleWashSettings mWashSettings = (BleWashSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.WASH_SET, BleWashSettings.class, null, null, 12, null);

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) this.itemInterval$delegate.getValue();
    }

    private final AbhSettingsItem getItemRepeat() {
        return (AbhSettingsItem) this.itemRepeat$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) this.itemTimeRange$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final WashSettingsActivity washSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.nm6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WashSettingsActivity.initView$lambda$0$0$0(this.f9971IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            washSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(WashSettingsActivity washSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        washSettingsActivity.mWashSettings.setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.WASH_SET, BleKeyFlag.UPDATE, washSettingsActivity.mWashSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.IXXOO, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(WashSettingsActivity washSettingsActivity) {
        return (AbhSettingsHeader) washSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(WashSettingsActivity washSettingsActivity) {
        return (AbhSettingsItem) washSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemRepeat_delegate$lambda$0(WashSettingsActivity washSettingsActivity) {
        return (AbhSettingsItem) washSettingsActivity.findViewById(R.id.item_repeat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(WashSettingsActivity washSettingsActivity) {
        return (AbhSettingsItem) washSettingsActivity.findViewById(R.id.item_time_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetInterval$lambda$0$0(final WashSettingsActivity washSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.mm6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WashSettingsActivity.onSetInterval$lambda$0$0$0(this.f9740IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetInterval$lambda$0$0$0(WashSettingsActivity washSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        washSettingsActivity.mWashSettings.setMInterval(((int) Math.pow(2.0d, i)) * 30);
        washSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(washSettingsActivity.mWashSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.WASH_SET, BleKeyFlag.UPDATE, washSettingsActivity.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetRepeat$lambda$0$0(final WashSettingsActivity washSettingsActivity, final Set picked) {
        Intrinsics.X0O(picked, "picked");
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.om6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WashSettingsActivity.onSetRepeat$lambda$0$0$0(this.f10173IO, picked, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetRepeat$lambda$0$0$0(WashSettingsActivity washSettingsActivity, Set set, BleConnector it) {
        Intrinsics.X0O(it, "it");
        washSettingsActivity.mWashSettings.setMRepeat(BleRepeat.indicesToRepeat$default(BleRepeat.INSTANCE, set, null, 2, null));
        washSettingsActivity.getItemRepeat().setMRightText(cp5.X11I(washSettingsActivity.mWashSettings.getMRepeat()));
        BaseBleConnector.sendObject$default(it, BleKey.WASH_SET, BleKeyFlag.UPDATE, washSettingsActivity.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final WashSettingsActivity washSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.pm6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WashSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f10397IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(WashSettingsActivity washSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleWashSettings bleWashSettings = washSettingsActivity.mWashSettings;
        bleWashSettings.setMStartHour(i);
        bleWashSettings.setMStartMinute(i2);
        bleWashSettings.setMEndHour(i3);
        bleWashSettings.setMEndMinute(i4);
        washSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        BaseBleConnector.sendObject$default(it, BleKey.WASH_SET, BleKeyFlag.UPDATE, washSettingsActivity.mWashSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(WashSettingsActivity washSettingsActivity) {
        return washSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.wash_set);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mWashSettings.getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.lm6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WashSettingsActivity.initView$lambda$0$0(this.f9471IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mWashSettings.getMStartHour(), this.mWashSettings.getMStartMinute(), this.mWashSettings.getMEndHour(), this.mWashSettings.getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemRepeat().setMRightText(cp5.X11I(this.mWashSettings.getMRepeat()));
        getItemInterval().setMRightText(cp5.m1624iI(this.mWashSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_wash_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        WashSettingsActivity washSettingsActivity;
        Intrinsics.X0O(view, "view");
        if (this.mIntervalPopup == null) {
            washSettingsActivity = this;
            dj4 dj4Var = new dj4(washSettingsActivity, R.array.wash_set_intervals, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.gm6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(WashSettingsActivity.onSetInterval$lambda$0$0(this.f6918IO, ((Integer) obj).intValue()));
                }
            });
            washSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            washSettingsActivity = this;
        }
        dj4 dj4Var2 = washSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(washSettingsActivity.mWashSettings.getMInterval() / 30));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void onSetRepeat(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mRepeatPopup == null) {
            jv0 jv0Var = new jv0(this, R.array.weekdays_s);
            jv0Var.O1O(R.string.repeat);
            jv0Var.iOO1ii1(new Function1() { // from class: com.android.mltcode.paycertificationapi.qm6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(WashSettingsActivity.onSetRepeat$lambda$0$0(this.f10636IO, (Set) obj));
                }
            });
            this.mRepeatPopup = jv0Var;
        }
        jv0 jv0Var2 = this.mRepeatPopup;
        if (jv0Var2 != null) {
            jv0Var2.IXXOO(BleRepeat.toIndices$default(BleRepeat.INSTANCE, this.mWashSettings.getMRepeat(), null, 2, null));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            jv0Var2.I1XOi1(rootView);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.km6
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(WashSettingsActivity.onSetTimeRange$lambda$0$0(this.f9219IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mWashSettings.getMStartHour(), this.mWashSettings.getMStartMinute(), this.mWashSettings.getMEndHour(), this.mWashSettings.getMEndMinute());
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
