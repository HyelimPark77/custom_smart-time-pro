package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.device.RelaxReminderSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleRelaxReminder;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RelaxReminderSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sg3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return RelaxReminderSettingsActivity.rootView_delegate$lambda$0(this.f11025IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tg3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return RelaxReminderSettingsActivity.itemHeader_delegate$lambda$0(this.f11250IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ug3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return RelaxReminderSettingsActivity.itemTimeRange_delegate$lambda$0(this.f11478IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vg3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return RelaxReminderSettingsActivity.itemInterval_delegate$lambda$0(this.f11714IO);
        }
    });

    @aa1
    private final BleRelaxReminder mBleRelaxReminderSettings = (BleRelaxReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RELAX_REMINDER, BleRelaxReminder.class, null, null, 12, null);

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) this.itemInterval$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) this.itemTimeRange$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final RelaxReminderSettingsActivity relaxReminderSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ah3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelaxReminderSettingsActivity.initView$lambda$0$0$0(this.f5497IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            relaxReminderSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(relaxReminderSettingsActivity.mBleRelaxReminderSettings);
        relaxReminderSettingsActivity.mBleRelaxReminderSettings.getMBleTimeRange().setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.RELAX_REMINDER, BleKeyFlag.UPDATE, relaxReminderSettingsActivity.mBleRelaxReminderSettings, false, false, 24, null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.yg3
            @Override // java.lang.Runnable
            public final void run() {
                I01XX0.XIi00iiXO(I01XX0.X01IiOiIi, null, 2, null);
            }
        }, 150L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity) {
        return (AbhSettingsHeader) relaxReminderSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity) {
        return (AbhSettingsItem) relaxReminderSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity) {
        return (AbhSettingsItem) relaxReminderSettingsActivity.findViewById(R.id.item_time_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final RelaxReminderSettingsActivity relaxReminderSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.zg3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelaxReminderSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f12616IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = relaxReminderSettingsActivity.mBleRelaxReminderSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.RELAX_REMINDER, BleKeyFlag.UPDATE, relaxReminderSettingsActivity.mBleRelaxReminderSettings, false, false, 24, null);
        relaxReminderSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(RelaxReminderSettingsActivity relaxReminderSettingsActivity) {
        return relaxReminderSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.relax_reminder);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(q62.OXO1.IIX(this.mBleRelaxReminderSettings.getMBleTimeRange().getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.wg3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelaxReminderSettingsActivity.initView$lambda$0$0(this.f11942IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartMinute(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_relax_reminder_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.xg3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(RelaxReminderSettingsActivity.onSetTimeRange$lambda$0$0(this.f12166IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMStartMinute(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndHour(), this.mBleRelaxReminderSettings.getMBleTimeRange().getMEndMinute());
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
