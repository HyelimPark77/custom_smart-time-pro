package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iI1OO;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.BatchOtaConfig;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaFromConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n69#2,3:48\n72#2,5:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n*L\n40#1:48,3\n40#1:52,5\n40#1:51\n*E\n"})
public final class DeveloperOtaFromConfigActivity extends BaseActivity {

    @aa1
    private final Lazy mEtContent$delegate;

    public DeveloperOtaFromConfigActivity() {
        this.mEtContent$delegate = LazyKt__LazyJVMKt.iO(new iI1OO(this));
    }

    public static /* synthetic */ EditText OIX0iXi(DeveloperOtaFromConfigActivity r0) {
        return mEtContent_delegate$lambda$0(r0);
    }

    private final EditText getMEtContent() {
        return (EditText) getValue();
    }

    private static final EditText mEtContent_delegate$lambda$0(DeveloperOtaFromConfigActivity r1) {
        return (EditText) r1.findViewById(R.id.et_content);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_ota_from_config;
    }

    public final void onStart(@aa1 View r3) {
        Intrinsics.X0O(r3, "v");
        String r4 = getMEtContent().getText().toString();
        if (r4.length() != 0) goto L12;
        return;
    L12:
        byte[] r5 = EncodeUtils.base64Decode(r4);     // Catch: Exception -> L7
        Intrinsics.O10IXXX0X(r5, "base64Decode(...)");     // Catch: Exception -> L7
        String r0 = new String(r5, Charsets.XIi00iiXO);     // Catch: Exception -> L7
        Object r6 = new Gson().fromJson(r0, BatchOtaConfig.class);     // Catch: Exception -> L7
    L9:
        if (r6 == null) goto L14;
        Bundle r1 = new Bundle();
        r1.putSerializable("otaConfig", (Serializable) r6);
        Intent r7 = new Intent(this, DeveloperOtaStartActivity.class);
        r7.putExtras(r1);
        startActivity(r7);
        return;
    L14:
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
        ToastUtils.showLong("Format error！", new Object[0]);
        r6 = null;
        goto L9
    }
}
