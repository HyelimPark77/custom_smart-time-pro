package com.sma.smartv3.biz.p606wa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ta2;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.sma.smartv3.biz.p606wa.data.WAQrCode;
import com.sma.smartv3.network.NetWorkUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wa.WAManager$getLoginQrCodeBlock$1", m39466f = "WAManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WAManager$getLoginQrCodeBlock$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $qrcodeResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WAManager$getLoginQrCodeBlock$1(Ref.ObjectRef<String> objectRef, Continuation<? super WAManager$getLoginQrCodeBlock$1> continuation) {
        super(2, continuation);
        this.$qrcodeResult = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WAManager$getLoginQrCodeBlock$1(this.$qrcodeResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WAManager$getLoginQrCodeBlock$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        WAManager wAManager = WAManager.OXO1;
        String strII1Xi0 = wAManager.II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager getLoginQrCodeBlock -> " + strII1Xi0);
        ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(wAManager.IXXOO()).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + strII1Xi0);
        byte[] bytes = "{\"webhook\": \"\",\"waitQrCode\":false}".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        ANResponse aNResponseExecuteForParsed = postRequestBuilderAddHeaders.addByteBody(bytes).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag((Object) wAManager.IXXOO()).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.get(WAQrCode.class));
        if (aNResponseExecuteForParsed.isSuccess()) {
            Object result = aNResponseExecuteForParsed.getResult();
            WAQrCode wAQrCode = result instanceof WAQrCode ? (WAQrCode) result : null;
            if (!TextUtils.isEmpty(wAQrCode != null ? wAQrCode.getQrcode() : null)) {
                try {
                    Intrinsics.XXI(wAQrCode);
                    byte[] bArrDecode = Base64.decode(StringsKt__StringsKt.IOIii0(wAQrCode.getQrcode(), I000IiI1O.C2156iO.XO0O10, null, 2, null), 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    ta2 ta2Var = ta2.OXO1;
                    Intrinsics.XXI(bitmapDecodeByteArray);
                    ?? OIi0 = ta2Var.OIi0(bitmapDecodeByteArray);
                    if (OIi0 != 0) {
                        this.$qrcodeResult.element = OIi0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return Unit.OXO1;
    }
}
