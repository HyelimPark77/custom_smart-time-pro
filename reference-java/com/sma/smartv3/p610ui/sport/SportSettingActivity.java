package com.sma.smartv3.p610ui.sport;

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
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.p612me.PermissionSettingsActivity;
import com.sma.smartv3.p610ui.sport.SportSettingActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n69#2,3:59\n72#2,5:63\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SportSettingActivity.kt\ncom/sma/smartv3/ui/sport/SportSettingActivity\n*L\n56#1:59,3\n56#1:63,5\n56#1:62\n*E\n"})
public final class SportSettingActivity extends BaseActivity {

    @aa1
    private final Lazy screenAlwaysOnCB$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s45
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportSettingActivity.screenAlwaysOnCB_delegate$lambda$0(this.f10965IO);
        }
    });

    @aa1
    private final Lazy llVoiceBroadcast$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t45
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportSettingActivity.llVoiceBroadcast_delegate$lambda$0(this.f11188IO);
        }
    });

    @aa1
    private final Lazy voiceBroadcastCB$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u45
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportSettingActivity.voiceBroadcastCB_delegate$lambda$0(this.f11423IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        a01.OXO1.IiI10X().put(b01.Ii0i, z);
        I01XX0.XIi00iiXO(b01.Ii0i, null, 2, null);
    }

    private static final void initView$lambda$1(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        a01.OXO1.IiI10X().put(b01.XX00XX, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llVoiceBroadcast_delegate$lambda$0(SportSettingActivity sportSettingActivity) {
        return sportSettingActivity.findViewById(R.id.llVoiceBroadcast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox screenAlwaysOnCB_delegate$lambda$0(SportSettingActivity sportSettingActivity) {
        return (AppCompatCheckBox) sportSettingActivity.findViewById(R.id.screenAlwaysOnCB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox voiceBroadcastCB_delegate$lambda$0(SportSettingActivity sportSettingActivity) {
        return (AppCompatCheckBox) sportSettingActivity.findViewById(R.id.voiceBroadcastCB);
    }

    public final View getLlVoiceBroadcast() {
        return (View) this.llVoiceBroadcast$delegate.getValue();
    }

    public final AppCompatCheckBox getScreenAlwaysOnCB() {
        return (AppCompatCheckBox) this.screenAlwaysOnCB$delegate.getValue();
    }

    public final AppCompatCheckBox getVoiceBroadcastCB() {
        return (AppCompatCheckBox) this.voiceBroadcastCB$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.settings);
        getScreenAlwaysOnCB().setChecked(a01.OXO1.IiI10X().getBoolean(b01.Ii0i));
        getScreenAlwaysOnCB().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.r45
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportSettingActivity.initView$lambda$0(compoundButton, z);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_setting;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void sportPermissionSetClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) PermissionSettingsActivity.class));
    }
}
