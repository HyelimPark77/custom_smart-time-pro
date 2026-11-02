package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.ShockSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "已废弃")
@SourceDebugExtension({"SMAP\nShockSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1563#2:142\n1634#2,3:143\n*S KotlinDebug\n*F\n+ 1 ShockSettingsActivity.kt\ncom/sma/smartv3/ui/device/ShockSettingsActivity\n*L\n42#1:142\n42#1:143,3\n*E\n"})
public final class ShockSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mCirculationPopup;

    @aa1
    private final List<String> mCirculations;

    @tb1
    private dj4 mShockModePopup;

    @aa1
    private final Lazy mShockModes$delegate;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qa4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.rootView_delegate$lambda$0(this.f10566IO);
        }
    });

    @aa1
    private final Lazy tvIncomingCallShockMode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ta4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvIncomingCallShockMode_delegate$lambda$0(this.f11222IO);
        }
    });

    @aa1
    private final Lazy tvIncomingCallCirculation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ua4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvIncomingCallCirculation_delegate$lambda$0(this.f11453IO);
        }
    });

    @aa1
    private final Lazy tvAlarmClockShockMode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.va4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvAlarmClockShockMode_delegate$lambda$0(this.f11686IO);
        }
    });

    @aa1
    private final Lazy tvAlarmClockCirculation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wa4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvAlarmClockCirculation_delegate$lambda$0(this.f11912IO);
        }
    });

    @aa1
    private final Lazy tvScheduleShockMode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xa4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvScheduleShockMode_delegate$lambda$0(this.f12137IO);
        }
    });

    @aa1
    private final Lazy tvScheduleCirculation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.la4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvScheduleCirculation_delegate$lambda$0(this.f9395IO);
        }
    });

    @aa1
    private final Lazy tvSedentaryShockMode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ma4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvSedentaryShockMode_delegate$lambda$0(this.f9660IO);
        }
    });

    @aa1
    private final Lazy tvSedentaryCirculation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.na4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvSedentaryCirculation_delegate$lambda$0(this.f9899IO);
        }
    });

    @aa1
    private final Lazy tvMessagePushShockMode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oa4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvMessagePushShockMode_delegate$lambda$0(this.f10097IO);
        }
    });

    @aa1
    private final Lazy tvMessagePushCirculation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ra4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShockSettingsActivity.tvMessagePushCirculation_delegate$lambda$0(this.f10779IO);
        }
    });

    public ShockSettingsActivity() {
        IntRange intRange = new IntRange(0, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(cp5.XOIX(((IntIterator) it).nextInt()));
        }
        this.mCirculations = arrayList;
        this.mShockModes$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sa4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ShockSettingsActivity.mShockModes_delegate$lambda$0(this.f10993IO);
            }
        });
    }

    private final String[] getMShockModes() {
        return (String[]) this.mShockModes$delegate.getValue();
    }

    private final PFMedium getTvAlarmClockCirculation() {
        return (PFMedium) this.tvAlarmClockCirculation$delegate.getValue();
    }

    private final PFMedium getTvAlarmClockShockMode() {
        return (PFMedium) this.tvAlarmClockShockMode$delegate.getValue();
    }

    private final PFMedium getTvIncomingCallCirculation() {
        return (PFMedium) this.tvIncomingCallCirculation$delegate.getValue();
    }

    private final PFMedium getTvIncomingCallShockMode() {
        return (PFMedium) this.tvIncomingCallShockMode$delegate.getValue();
    }

    private final PFMedium getTvMessagePushCirculation() {
        return (PFMedium) this.tvMessagePushCirculation$delegate.getValue();
    }

    private final PFMedium getTvMessagePushShockMode() {
        return (PFMedium) this.tvMessagePushShockMode$delegate.getValue();
    }

    private final PFMedium getTvScheduleCirculation() {
        return (PFMedium) this.tvScheduleCirculation$delegate.getValue();
    }

    private final PFMedium getTvScheduleShockMode() {
        return (PFMedium) this.tvScheduleShockMode$delegate.getValue();
    }

    private final PFMedium getTvSedentaryCirculation() {
        return (PFMedium) this.tvSedentaryCirculation$delegate.getValue();
    }

    private final PFMedium getTvSedentaryShockMode() {
        return (PFMedium) this.tvSedentaryShockMode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] mShockModes_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return shockSettingsActivity.getResources().getStringArray(R.array.shock_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onItemClick$lambda$0$0(int i, ShockSettingsActivity shockSettingsActivity, int i2) {
        switch (i) {
            case R.id.ll_alarm_clock_shock_mode /* 2131363536 */:
                shockSettingsActivity.getTvAlarmClockShockMode().setText(shockSettingsActivity.getMShockModes()[i2]);
                break;
            case R.id.ll_incoming_call_shock_mode /* 2131363579 */:
                shockSettingsActivity.getTvIncomingCallShockMode().setText(shockSettingsActivity.getMShockModes()[i2]);
                break;
            case R.id.ll_message_push_shock_mode /* 2131363591 */:
                shockSettingsActivity.getTvMessagePushShockMode().setText(shockSettingsActivity.getMShockModes()[i2]);
                break;
            case R.id.ll_schedule_shock_mode /* 2131363614 */:
                shockSettingsActivity.getTvScheduleShockMode().setText(shockSettingsActivity.getMShockModes()[i2]);
                break;
            case R.id.ll_sedentary_shock_mode /* 2131363619 */:
                shockSettingsActivity.getTvSedentaryShockMode().setText(shockSettingsActivity.getMShockModes()[i2]);
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onItemClick$lambda$2$0(int i, ShockSettingsActivity shockSettingsActivity, int i2) {
        switch (i) {
            case R.id.ll_alarm_clock_circulation /* 2131363535 */:
                shockSettingsActivity.getTvAlarmClockCirculation().setText(shockSettingsActivity.mCirculations.get(i2));
                break;
            case R.id.ll_incoming_call_circulation /* 2131363578 */:
                shockSettingsActivity.getTvIncomingCallCirculation().setText(shockSettingsActivity.mCirculations.get(i2));
                break;
            case R.id.ll_message_push_circulation /* 2131363590 */:
                shockSettingsActivity.getTvMessagePushCirculation().setText(shockSettingsActivity.mCirculations.get(i2));
                break;
            case R.id.ll_schedule_circulation /* 2131363613 */:
                shockSettingsActivity.getTvScheduleCirculation().setText(shockSettingsActivity.mCirculations.get(i2));
                break;
            case R.id.ll_sedentary_circulation /* 2131363618 */:
                shockSettingsActivity.getTvSedentaryCirculation().setText(shockSettingsActivity.mCirculations.get(i2));
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return shockSettingsActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvAlarmClockCirculation_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_alarm_clock_circulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvAlarmClockShockMode_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_alarm_clock_shock_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvIncomingCallCirculation_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_incoming_call_circulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvIncomingCallShockMode_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_incoming_call_shock_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvMessagePushCirculation_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_message_push_circulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvMessagePushShockMode_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_message_push_shock_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvScheduleCirculation_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_schedule_circulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvScheduleShockMode_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_schedule_shock_mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvSedentaryCirculation_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_sedentary_circulation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvSedentaryShockMode_delegate$lambda$0(ShockSettingsActivity shockSettingsActivity) {
        return (PFMedium) shockSettingsActivity.findViewById(R.id.tv_sedentary_shock_mode);
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.shock);
        getTvIncomingCallShockMode().setText(getMShockModes()[0]);
        getTvIncomingCallCirculation().setText(this.mCirculations.get(0));
        getTvAlarmClockShockMode().setText(getMShockModes()[1]);
        getTvAlarmClockCirculation().setText(this.mCirculations.get(0));
        getTvScheduleShockMode().setText(getMShockModes()[2]);
        getTvScheduleCirculation().setText(this.mCirculations.get(0));
        getTvSedentaryShockMode().setText(getMShockModes()[3]);
        getTvSedentaryCirculation().setText(this.mCirculations.get(0));
        getTvMessagePushShockMode().setText(getMShockModes()[4]);
        getTvMessagePushCirculation().setText(this.mCirculations.get(0));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_shock_settings;
    }

    public final void onItemClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        final int id = view.getId();
        switch (id) {
            case R.id.ll_alarm_clock_circulation /* 2131363535 */:
            case R.id.ll_incoming_call_circulation /* 2131363578 */:
            case R.id.ll_message_push_circulation /* 2131363590 */:
            case R.id.ll_schedule_circulation /* 2131363613 */:
            case R.id.ll_sedentary_circulation /* 2131363618 */:
                dj4 dj4Var = new dj4(this, this.mCirculations, 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.circulation);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.pa4
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(ShockSettingsActivity.onItemClick$lambda$2$0(id, this, ((Integer) obj).intValue()));
                    }
                });
                this.mCirculationPopup = dj4Var;
                dj4Var.II1Xi0(0);
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                dj4Var.I1XOi1(rootView);
                break;
            case R.id.ll_alarm_clock_shock_mode /* 2131363536 */:
            case R.id.ll_incoming_call_shock_mode /* 2131363579 */:
            case R.id.ll_message_push_shock_mode /* 2131363591 */:
            case R.id.ll_schedule_shock_mode /* 2131363614 */:
            case R.id.ll_sedentary_shock_mode /* 2131363619 */:
                dj4 dj4Var2 = new dj4(this, R.array.shock_mode, 0, 4, (DefaultConstructorMarker) null);
                dj4Var2.m1671iX(R.string.shock_model);
                dj4Var2.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.ka4
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(ShockSettingsActivity.onItemClick$lambda$0$0(id, this, ((Integer) obj).intValue()));
                    }
                });
                this.mShockModePopup = dj4Var2;
                dj4Var2.II1Xi0(0);
                View rootView2 = getRootView();
                Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
                dj4Var2.I1XOi1(rootView2);
                break;
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
