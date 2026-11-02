package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.rw6;
import com.android.mltcode.paycertificationapi.sw6;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.AITranslationUrl;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
public final class WebTranslationActivity extends WebViewActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;
    public AITranslationUrl mAITranslationUrl;

    @aa1
    private final Lazy mTitleLayout$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.WebTranslationActivity$initView$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.otherdevice.charge.WebTranslationActivity$initView$1", f = "WebTranslationActivity.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebTranslationActivity this$0;

        public AnonymousClass1(WebTranslationActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            WebTranslationActivity.access$share(this.this$0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(2000, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public WebTranslationActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new rw6(this));
        this.mTitleLayout$delegate = LazyKt__LazyJVMKt.iO(new sw6(this));
    }

    public static /* synthetic */ View IIX1OXO(WebTranslationActivity r0) {
        return mTitleLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIO(WebTranslationActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(WebTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$share(WebTranslationActivity r0) {
        r0.share();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final View getMTitleLayout() {
        return (View) getValue();
    }

    private static final View mTitleLayout_delegate$lambda$0(WebTranslationActivity r1) {
        return r1.findViewById(R.id.abh_title);
    }

    private final void share() {
        Intent r0 = new Intent("android.intent.action.SEND");
        r0.setType("text/plain");
        r0.putExtra("android.intent.extra.TEXT", getMAITranslationUrl().getShareUrl());
        startActivity(Intent.createChooser(r0, "share url"));
    }

    @aa1
    public final AITranslationUrl getMAITranslationUrl() {
        AITranslationUrl r0 = this.mAITranslationUrl;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mAITranslationUrl");
        return null;
    }

    @Override // com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        Serializable r5 = getMArg3();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.model.AITranslationUrl");
        setMAITranslationUrl((AITranslationUrl) r5);
        i1O0OXO1O.OXO1.OXO1("WebTranslationActivity " + getMAITranslationUrl() + " ");
    }

    @Override // com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMTitleLayout().setVisibility(8);
        super.initView();
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.call_share_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.sma.smartv3.ui.me.WebViewActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_translation_call_web;
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        share();
    }

    public final void setMAITranslationUrl(@aa1 AITranslationUrl r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAITranslationUrl = r2;
    }

    @JavascriptInterface
    public final void sharePage() {
        share();
    }
}
