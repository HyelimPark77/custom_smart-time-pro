package com.sma.smartv3.ui.me;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.XiX1IXI1i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.iIiOiIO1I;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
public final class AiKeySetActivity extends BaseActivity {

    @aa1
    private final Lazy etContent$delegate;

    @aa1
    private final Lazy rootView$delegate;

    public AiKeySetActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XiX1IXI1i(this));
        this.etContent$delegate = LazyKt__LazyJVMKt.iO(new iIiOiIO1I(this));
    }

    public static /* synthetic */ View I0iXXO(AiKeySetActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OIX0iXi(AiKeySetActivity r0) {
        return etContent_delegate$lambda$0(r0);
    }

    private static final EditText etContent_delegate$lambda$0(AiKeySetActivity r1) {
        return (EditText) r1.findViewById(R.id.et_content);
    }

    private final EditText getEtContent() {
        return (EditText) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private static final View rootView_delegate$lambda$0(AiKeySetActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ai_key_set);
        String r0 = a01.OXO1.IiI10X().getString(b01.iI0I);
        if (r0 == null) goto L6;
        getEtContent().setText(r0);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_key_set;
    }

    public final void onSave(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Editable r5 = getEtContent().getText();
        if (r5 == null) goto L7;
        String r6 = r5.toString();
        if (r6 == null) goto L7;
        final String r7 = StringsKt__StringsKt.iX1X1(r6).toString();
    L9:
        if (TextUtils.isEmpty(r7) == false) goto L12;
        a01.OXO1.IiI10X().put(b01.iI0I, r7);
        finish();
        return;
    L12:
        VoiceManager r0 = VoiceManager.INSTANCE;
        Intrinsics.XXI(r7);
        r0.openAiCheck(r7, new AnonymousClass1(r7, this), this, getRootView());
        return;
    L7:
        r7 = null;
        goto L9
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
