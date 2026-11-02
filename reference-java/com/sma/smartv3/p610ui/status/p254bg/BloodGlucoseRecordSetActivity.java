package com.sma.smartv3.p610ui.status.p254bg;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.model.BGEMRecordSet;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseRecordSetActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseRecordSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,125:1\n18#2,2:126\n15#2:128\n11#2,2:129\n11#2,2:131\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordSetActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordSetActivity\n*L\n33#1:126,2\n33#1:128\n111#1:129,2\n117#1:131,2\n*E\n"})
public final class BloodGlucoseRecordSetActivity extends BaseActivity {

    @aa1
    private BGEMRecordSet mSetting;

    @aa1
    private final Lazy itemCalendar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXI11XXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseRecordSetActivity.itemCalendar_delegate$lambda$0(this.f8316IO);
        }
    });

    @aa1
    private final Lazy itemStartDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1iIX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseRecordSetActivity.itemStartDate_delegate$lambda$0(this.f7719IO);
        }
    });

    @aa1
    private final Lazy itemEndDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOOXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseRecordSetActivity.itemEndDate_delegate$lambda$0(this.f4819IO);
        }
    });

    public BloodGlucoseRecordSetActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(BGEMRecordSet.class.getName()), (Class<Object>) BGEMRecordSet.class);
        this.mSetting = (BGEMRecordSet) (objFromJson == null ? BGEMRecordSet.class.newInstance() : objFromJson);
    }

    private final AbhSettingsItem getItemCalendar() {
        return (AbhSettingsItem) this.itemCalendar$delegate.getValue();
    }

    private final AbhSettingsItem getItemEndDate() {
        return (AbhSettingsItem) this.itemEndDate$delegate.getValue();
    }

    private final AbhSettingsItem getItemStartDate() {
        return (AbhSettingsItem) this.itemStartDate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemCalendar_delegate$lambda$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity) {
        return (AbhSettingsItem) bloodGlucoseRecordSetActivity.findViewById(R.id.item_calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemEndDate_delegate$lambda$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity) {
        return (AbhSettingsItem) bloodGlucoseRecordSetActivity.findViewById(R.id.item_end_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemStartDate_delegate$lambda$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity) {
        return (AbhSettingsItem) bloodGlucoseRecordSetActivity.findViewById(R.id.item_start_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCalendar$lambda$0$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity, int i) {
        bloodGlucoseRecordSetActivity.mSetting.setCalendar(i);
        bloodGlucoseRecordSetActivity.updateUI();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onEndDate$lambda$0$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, i);
        OIi1iX.OII(calendar, i2);
        OIi1iX.IIX1OXO(calendar, i3);
        OIi1iX.iIiiO(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.XX0(calendar, 0);
        bloodGlucoseRecordSetActivity.mSetting.setEndDate(calendar.getTimeInMillis());
        bloodGlucoseRecordSetActivity.updateUI();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStartDate$lambda$0$0(BloodGlucoseRecordSetActivity bloodGlucoseRecordSetActivity, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, i);
        OIi1iX.OII(calendar, i2);
        OIi1iX.IIX1OXO(calendar, i3);
        OIi1iX.iIiiO(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.XX0(calendar, 0);
        bloodGlucoseRecordSetActivity.mSetting.setStartDate(calendar.getTimeInMillis());
        bloodGlucoseRecordSetActivity.updateUI();
        return true;
    }

    private final void updateUI() {
        String str;
        AbhSettingsItem itemCalendar = getItemCalendar();
        String str2 = getResources().getStringArray(R.array.by_calendars)[this.mSetting.getCalendar()];
        Intrinsics.O10IXXX0X(str2, "get(...)");
        itemCalendar.setMRightText(str2);
        AbhSettingsItem itemStartDate = getItemStartDate();
        String str3 = "";
        if (this.mSetting.getStartDate() != 0) {
            str = O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(this.mSetting.getStartDate()));
            Intrinsics.O10IXXX0X(str, "format(...)");
        } else {
            str = "";
        }
        itemStartDate.setMRightText(str);
        AbhSettingsItem itemEndDate = getItemEndDate();
        if (this.mSetting.getEndDate() != 0) {
            str3 = O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(this.mSetting.getEndDate()));
            Intrinsics.O10IXXX0X(str3, "format(...)");
        }
        itemEndDate.setMRightText(str3);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measurement_logs);
        updateUI();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_record_set;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(BGEMRecordSet.class.getName(), new Gson().toJson(this.mSetting));
        I01XX0.XIi00iiXO(I01XX0.IX0iIX, null, 2, null);
        finish();
    }

    public final void onCalendar(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        dj4 dj4Var = new dj4(this, R.array.by_calendars, 0, 4, (DefaultConstructorMarker) null);
        dj4Var.m1671iX(R.string.by_calendar);
        dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.Oi1IOII11
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BloodGlucoseRecordSetActivity.onCalendar$lambda$0$0(this.f3666IO, ((Integer) obj).intValue()));
            }
        });
        dj4Var.II1Xi0(this.mSetting.getCalendar());
        dj4Var.IIX1OXO();
    }

    public final void onEndDate(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        O1100iXOX o1100iXOX = new O1100iXOX(this);
        o1100iXOX.m806iX(R.string.end_date);
        o1100iXOX.i010I(new Function3() { // from class: com.android.mltcode.paycertificationapi.iOXiIIiX
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(BloodGlucoseRecordSetActivity.onEndDate$lambda$0$0(this.f8175IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
        o1100iXOX.iOO1ii1(this.mSetting.getEndDate());
        o1100iXOX.IIX1OXO();
    }

    public final void onReset(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mSetting = new BGEMRecordSet(0, 0L, 0L, 7, null);
        a01.OXO1.IiI10X().put(BGEMRecordSet.class.getName(), new Gson().toJson(this.mSetting));
        I01XX0.XIi00iiXO(I01XX0.IX0iIX, null, 2, null);
        updateUI();
    }

    public final void onStartDate(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        O1100iXOX o1100iXOX = new O1100iXOX(this);
        o1100iXOX.m806iX(R.string.start_date);
        o1100iXOX.i010I(new Function3() { // from class: com.android.mltcode.paycertificationapi.OIOOXii
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(BloodGlucoseRecordSetActivity.onStartDate$lambda$0$0(this.f3015IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        });
        o1100iXOX.iOO1ii1(this.mSetting.getStartDate());
        o1100iXOX.IIX1OXO();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
