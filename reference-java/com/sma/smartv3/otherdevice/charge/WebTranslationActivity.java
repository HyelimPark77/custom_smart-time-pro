package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.AITranslationUrl;
import com.sma.smartv3.otherdevice.charge.WebTranslationActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
public final class WebTranslationActivity extends WebViewActivity {
    public AITranslationUrl mAITranslationUrl;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rw6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebTranslationActivity.abhTitleRight_delegate$lambda$0(this.f10918IO);
        }
    });

    @aa1
    private final Lazy mTitleLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sw6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebTranslationActivity.mTitleLayout_delegate$lambda$0(this.f11147IO);
        }
    });

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.WebTranslationActivity$initView$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.otherdevice.charge.WebTranslationActivity$initView$1", m39466f = "WebTranslationActivity.kt", m39467i = {}, m39468l = {42}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186361 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C186361(Continuation<? super C186361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebTranslationActivity.this.new C186361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C186361) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(2000L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            WebTranslationActivity.this.share();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(WebTranslationActivity webTranslationActivity) {
        return (ImageView) webTranslationActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final View getMTitleLayout() {
        return (View) this.mTitleLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mTitleLayout_delegate$lambda$0(WebTranslationActivity webTranslationActivity) {
        return webTranslationActivity.findViewById(R.id.abh_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", getMAITranslationUrl().getShareUrl());
        startActivity(Intent.createChooser(intent, "share url"));
    }

    @aa1
    public final AITranslationUrl getMAITranslationUrl() {
        AITranslationUrl aITranslationUrl = this.mAITranslationUrl;
        if (aITranslationUrl != null) {
            return aITranslationUrl;
        }
        Intrinsics.XXO("mAITranslationUrl");
        return null;
    }

    @Override // com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.AITranslationUrl");
        setMAITranslationUrl((AITranslationUrl) mArg3);
        i1O0OXO1O.OXO1.OXO1("WebTranslationActivity " + getMAITranslationUrl() + " ");
    }

    @Override // com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMTitleLayout().setVisibility(8);
        super.initView();
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.call_share_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C186361(null), 3, null);
    }

    @Override // com.sma.smartv3.p610ui.p612me.WebViewActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_translation_call_web;
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        share();
    }

    public final void setMAITranslationUrl(@aa1 AITranslationUrl aITranslationUrl) {
        Intrinsics.X0O(aITranslationUrl, "<set-?>");
        this.mAITranslationUrl = aITranslationUrl;
    }

    @JavascriptInterface
    public final void sharePage() {
        share();
    }
}
