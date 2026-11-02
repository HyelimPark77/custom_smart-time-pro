package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.p610ui.p612me.AiKeySetActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
public final class AiKeySetActivity extends BaseActivity {

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiX1IXI1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AiKeySetActivity.rootView_delegate$lambda$0(this.f5330IO);
        }
    });

    @aa1
    private final Lazy etContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIiOiIO1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AiKeySetActivity.etContent_delegate$lambda$0(this.f7957IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etContent_delegate$lambda$0(AiKeySetActivity aiKeySetActivity) {
        return (EditText) aiKeySetActivity.findViewById(R.id.et_content);
    }

    private final EditText getEtContent() {
        return (EditText) this.etContent$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(AiKeySetActivity aiKeySetActivity) {
        return aiKeySetActivity.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ai_key_set);
        String string = a01.OXO1.IiI10X().getString(b01.iI0I);
        if (string != null) {
            getEtContent().setText(string);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_key_set;
    }

    public final void onSave(@aa1 View view) {
        String string;
        Intrinsics.X0O(view, "view");
        Editable text = getEtContent().getText();
        final String string2 = (text == null || (string = text.toString()) == null) ? null : StringsKt__StringsKt.iX1X1(string).toString();
        if (TextUtils.isEmpty(string2)) {
            a01.OXO1.IiI10X().put(b01.iI0I, string2);
            finish();
        } else {
            VoiceManager voiceManager = VoiceManager.INSTANCE;
            Intrinsics.XXI(string2);
            voiceManager.openAiCheck(string2, new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.AiKeySetActivity.onSave.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    a01.OXO1.IiI10X().put(b01.iI0I, string2);
                    this.finish();
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                }
            }, this, getRootView());
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
