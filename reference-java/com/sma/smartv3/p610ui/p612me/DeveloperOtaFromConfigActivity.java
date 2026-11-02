package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.BatchOtaConfig;
import com.sma.smartv3.p610ui.p612me.DeveloperOtaFromConfigActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaFromConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n69#2,3:48\n72#2,5:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n*L\n40#1:48,3\n40#1:52,5\n40#1:51\n*E\n"})
public final class DeveloperOtaFromConfigActivity extends BaseActivity {

    @aa1
    private final Lazy mEtContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaFromConfigActivity.mEtContent_delegate$lambda$0(this.f7827IO);
        }
    });

    private final EditText getMEtContent() {
        return (EditText) this.mEtContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEtContent_delegate$lambda$0(DeveloperOtaFromConfigActivity developerOtaFromConfigActivity) {
        return (EditText) developerOtaFromConfigActivity.findViewById(R.id.et_content);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_ota_from_config;
    }

    public final void onStart(@aa1 View v) {
        Object objFromJson;
        Intrinsics.X0O(v, "v");
        String string = getMEtContent().getText().toString();
        if (string.length() == 0) {
            return;
        }
        try {
            byte[] bArrBase64Decode = EncodeUtils.base64Decode(string);
            Intrinsics.O10IXXX0X(bArrBase64Decode, "base64Decode(...)");
            objFromJson = new Gson().fromJson(new String(bArrBase64Decode, Charsets.XIi00iiXO), (Class<Object>) BatchOtaConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            ToastUtils.showLong("Format error！", new Object[0]);
            objFromJson = null;
        }
        if (objFromJson != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("otaConfig", (Serializable) objFromJson);
            Intent intent = new Intent(this, (Class<?>) DeveloperOtaStartActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
