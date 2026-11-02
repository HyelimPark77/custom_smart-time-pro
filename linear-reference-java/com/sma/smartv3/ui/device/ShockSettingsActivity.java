package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ka4;
import com.android.mltcode.paycertificationapi.la4;
import com.android.mltcode.paycertificationapi.ma4;
import com.android.mltcode.paycertificationapi.na4;
import com.android.mltcode.paycertificationapi.oa4;
import com.android.mltcode.paycertificationapi.pa4;
import com.android.mltcode.paycertificationapi.qa4;
import com.android.mltcode.paycertificationapi.ra4;
import com.android.mltcode.paycertificationapi.sa4;
import com.android.mltcode.paycertificationapi.ta4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ua4;
import com.android.mltcode.paycertificationapi.va4;
import com.android.mltcode.paycertificationapi.wa4;
import com.android.mltcode.paycertificationapi.xa4;
import com.bestmafen.androidbase.base.BaseActivity;
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
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvAlarmClockCirculation$delegate;

    @aa1
    private final Lazy tvAlarmClockShockMode$delegate;

    @aa1
    private final Lazy tvIncomingCallCirculation$delegate;

    @aa1
    private final Lazy tvIncomingCallShockMode$delegate;

    @aa1
    private final Lazy tvMessagePushCirculation$delegate;

    @aa1
    private final Lazy tvMessagePushShockMode$delegate;

    @aa1
    private final Lazy tvScheduleCirculation$delegate;

    @aa1
    private final Lazy tvScheduleShockMode$delegate;

    @aa1
    private final Lazy tvSedentaryCirculation$delegate;

    @aa1
    private final Lazy tvSedentaryShockMode$delegate;

    public ShockSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new qa4(this));
        this.tvIncomingCallShockMode$delegate = LazyKt__LazyJVMKt.iO(new ta4(this));
        this.tvIncomingCallCirculation$delegate = LazyKt__LazyJVMKt.iO(new ua4(this));
        this.tvAlarmClockShockMode$delegate = LazyKt__LazyJVMKt.iO(new va4(this));
        this.tvAlarmClockCirculation$delegate = LazyKt__LazyJVMKt.iO(new wa4(this));
        this.tvScheduleShockMode$delegate = LazyKt__LazyJVMKt.iO(new xa4(this));
        this.tvScheduleCirculation$delegate = LazyKt__LazyJVMKt.iO(new la4(this));
        this.tvSedentaryShockMode$delegate = LazyKt__LazyJVMKt.iO(new ma4(this));
        this.tvSedentaryCirculation$delegate = LazyKt__LazyJVMKt.iO(new na4(this));
        this.tvMessagePushShockMode$delegate = LazyKt__LazyJVMKt.iO(new oa4(this));
        this.tvMessagePushCirculation$delegate = LazyKt__LazyJVMKt.iO(new ra4(this));
        IntRange r0 = new IntRange(0, 6);
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<Integer> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r1.add(cp5.XOIX(((IntIterator) r2).nextInt()));
        goto L4
    L6:
        this.mCirculations = r1;
        this.mShockModes$delegate = LazyKt__LazyJVMKt.iO(new sa4(this));
    }

    public static /* synthetic */ View I0iXXO(ShockSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ String[] I1XOi1(ShockSettingsActivity r0) {
        return mShockModes_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(ShockSettingsActivity r0) {
        return tvScheduleShockMode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(ShockSettingsActivity r0) {
        return tvAlarmClockCirculation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(ShockSettingsActivity r0) {
        return tvSedentaryCirculation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(ShockSettingsActivity r0) {
        return tvIncomingCallShockMode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OiIIX101O(ShockSettingsActivity r0) {
        return tvAlarmClockShockMode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(int r0, ShockSettingsActivity r1, int r2) {
        return onItemClick$lambda$2$0(r0, r1, r2);
    }

    public static /* synthetic */ PFMedium X1ii(ShockSettingsActivity r0) {
        return tvMessagePushShockMode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XX0(ShockSettingsActivity r0) {
        return tvIncomingCallCirculation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(ShockSettingsActivity r0) {
        return tvSedentaryShockMode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIO(ShockSettingsActivity r0) {
        return tvMessagePushCirculation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIii1(ShockSettingsActivity r0) {
        return tvScheduleCirculation_delegate$lambda$0(r0);
    }

    private final String[] getMShockModes() {
        return (String[]) getValue();
    }

    private final PFMedium getTvAlarmClockCirculation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvAlarmClockShockMode() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvIncomingCallCirculation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvIncomingCallShockMode() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvMessagePushCirculation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvMessagePushShockMode() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvScheduleCirculation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvScheduleShockMode() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvSedentaryCirculation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvSedentaryShockMode() {
        return (PFMedium) getValue();
    }

    public static /* synthetic */ boolean iIiiO(int r0, ShockSettingsActivity r1, int r2) {
        return onItemClick$lambda$0$0(r0, r1, r2);
    }

    private static final String[] mShockModes_delegate$lambda$0(ShockSettingsActivity r1) {
        return r1.getResources().getStringArray(R.array.shock_mode);
    }

    private static final boolean onItemClick$lambda$0$0(int r0, ShockSettingsActivity r1, int r2) {
        switch(r0) {
            case 2131363536: goto L8;
            case 2131363579: goto L7;
            case 2131363591: goto L6;
            case 2131363614: goto L5;
            case 2131363619: goto L4;
            default: goto L15;
        };
    L4:
        r1.getTvSedentaryShockMode().setText(r1.getMShockModes()[r2]);
        return true;
    L5:
        r1.getTvScheduleShockMode().setText(r1.getMShockModes()[r2]);
        return true;
    L6:
        r1.getTvMessagePushShockMode().setText(r1.getMShockModes()[r2]);
        return true;
    L7:
        r1.getTvIncomingCallShockMode().setText(r1.getMShockModes()[r2]);
        return true;
    L8:
        r1.getTvAlarmClockShockMode().setText(r1.getMShockModes()[r2]);
        return true;
    L15:
        return true;
    }

    private static final boolean onItemClick$lambda$2$0(int r0, ShockSettingsActivity r1, int r2) {
        switch(r0) {
            case 2131363535: goto L8;
            case 2131363578: goto L7;
            case 2131363590: goto L6;
            case 2131363613: goto L5;
            case 2131363618: goto L4;
            default: goto L15;
        };
    L4:
        r1.getTvSedentaryCirculation().setText(r1.mCirculations.get(r2));
        return true;
    L5:
        r1.getTvScheduleCirculation().setText(r1.mCirculations.get(r2));
        return true;
    L6:
        r1.getTvMessagePushCirculation().setText(r1.mCirculations.get(r2));
        return true;
    L7:
        r1.getTvIncomingCallCirculation().setText(r1.mCirculations.get(r2));
        return true;
    L8:
        r1.getTvAlarmClockCirculation().setText(r1.mCirculations.get(r2));
        return true;
    L15:
        return true;
    }

    private static final View rootView_delegate$lambda$0(ShockSettingsActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final PFMedium tvAlarmClockCirculation_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_alarm_clock_circulation);
    }

    private static final PFMedium tvAlarmClockShockMode_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_alarm_clock_shock_mode);
    }

    private static final PFMedium tvIncomingCallCirculation_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_incoming_call_circulation);
    }

    private static final PFMedium tvIncomingCallShockMode_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_incoming_call_shock_mode);
    }

    private static final PFMedium tvMessagePushCirculation_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_message_push_circulation);
    }

    private static final PFMedium tvMessagePushShockMode_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_message_push_shock_mode);
    }

    private static final PFMedium tvScheduleCirculation_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_schedule_circulation);
    }

    private static final PFMedium tvScheduleShockMode_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_schedule_shock_mode);
    }

    private static final PFMedium tvSedentaryCirculation_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_sedentary_circulation);
    }

    private static final PFMedium tvSedentaryShockMode_delegate$lambda$0(ShockSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_sedentary_shock_mode);
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_shock_settings;
    }

    public final void onItemClick(@aa1 View r15) {
        Intrinsics.X0O(r15, "view");
        final int r16 = r15.getId();
        switch(r16) {
            case 2131363535: goto L7;
            case 2131363536: goto L5;
            case 2131363578: goto L7;
            case 2131363579: goto L5;
            case 2131363590: goto L7;
            case 2131363591: goto L5;
            case 2131363613: goto L7;
            case 2131363614: goto L5;
            case 2131363618: goto L7;
            case 2131363619: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        int r4 = R.array.shock_mode;
        int r5 = 0;
        dj4 r2 = new dj4(this, r4, r5, 4, null);
        r2.iX(R.string.shock_model);
        r2.i010I(new ka4(r16, this));
        this.mShockModePopup = r2;
        r2.II1Xi0(0);
        View r17 = getRootView();
        Intrinsics.O10IXXX0X(r17, "<get-rootView>(...)");
        r2.I1XOi1(r17);
        return;
    L7:
        int r11 = 0;
        dj4 r8 = new dj4(this, this.mCirculations, r11, 4, null);
        r8.iX(R.string.circulation);
        r8.i010I(new pa4(r16, this));
        this.mCirculationPopup = r8;
        r8.II1Xi0(0);
        View r18 = getRootView();
        Intrinsics.O10IXXX0X(r18, "<get-rootView>(...)");
        r8.I1XOi1(r18);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
