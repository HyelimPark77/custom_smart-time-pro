package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.r45;
import com.android.mltcode.paycertificationapi.s45;
import com.android.mltcode.paycertificationapi.t45;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u45;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.PermissionSettingsActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n69#2,3:59\n72#2,5:63\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n*L\n56#1:59,3\n56#1:63,5\n56#1:62\n*E\n"})
public final class SportSettingActivity extends BaseActivity {

    @aa1
    private final Lazy llVoiceBroadcast$delegate;

    @aa1
    private final Lazy screenAlwaysOnCB$delegate;

    @aa1
    private final Lazy voiceBroadcastCB$delegate;

    public SportSettingActivity() {
        this.screenAlwaysOnCB$delegate = LazyKt__LazyJVMKt.iO(new s45(this));
        this.llVoiceBroadcast$delegate = LazyKt__LazyJVMKt.iO(new t45(this));
        this.voiceBroadcastCB$delegate = LazyKt__LazyJVMKt.iO(new u45(this));
    }

    public static /* synthetic */ View I0iXXO(SportSettingActivity r0) {
        return llVoiceBroadcast_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatCheckBox OIX0iXi(SportSettingActivity r0) {
        return screenAlwaysOnCB_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(CompoundButton r0, boolean r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ AppCompatCheckBox XXI(SportSettingActivity r0) {
        return voiceBroadcastCB_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "buttonView");
        a01.OXO1.IiI10X().put(b01.Ii0i, r2);
        I01XX0.XIi00iiXO(b01.Ii0i, null, 2, null);
    }

    private static final void initView$lambda$1(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "buttonView");
        a01.OXO1.IiI10X().put(b01.XX00XX, r2);
    }

    private static final View llVoiceBroadcast_delegate$lambda$0(SportSettingActivity r1) {
        return r1.findViewById(R.id.llVoiceBroadcast);
    }

    private static final AppCompatCheckBox screenAlwaysOnCB_delegate$lambda$0(SportSettingActivity r1) {
        return (AppCompatCheckBox) r1.findViewById(R.id.screenAlwaysOnCB);
    }

    private static final AppCompatCheckBox voiceBroadcastCB_delegate$lambda$0(SportSettingActivity r1) {
        return (AppCompatCheckBox) r1.findViewById(R.id.voiceBroadcastCB);
    }

    public final View getLlVoiceBroadcast() {
        return (View) getValue();
    }

    public final AppCompatCheckBox getScreenAlwaysOnCB() {
        return (AppCompatCheckBox) getValue();
    }

    public final AppCompatCheckBox getVoiceBroadcastCB() {
        return (AppCompatCheckBox) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.settings);
        getScreenAlwaysOnCB().setChecked(a01.OXO1.IiI10X().getBoolean(b01.Ii0i));
        getScreenAlwaysOnCB().setOnCheckedChangeListener(new r45());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_setting;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void sportPermissionSetClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, PermissionSettingsActivity.class));
    }
}
