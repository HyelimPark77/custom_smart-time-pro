package com.sma.smartv3.biz.wa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ta2;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.sma.smartv3.biz.wa.data.WAQrCode;
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
@DebugMetadata(c = "com.sma.smartv3.biz.wa.WAManager$getLoginQrCodeBlock$1", f = "WAManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WAManager$getLoginQrCodeBlock$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $qrcodeResult;
    int label;

    public WAManager$getLoginQrCodeBlock$1(Ref.ObjectRef<String> r1, Continuation<? super WAManager$getLoginQrCodeBlock$1> r2) {
        this.$qrcodeResult = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new WAManager$getLoginQrCodeBlock$1(this.$qrcodeResult, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WAManager$getLoginQrCodeBlock$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        pb.I0iXXO();
        if (this.label != 0) goto L24;
        ResultKt.X1ii(r5);
        WAManager r6 = WAManager.OXO1;
        String r0 = r6.II1Xi0();
        i1O0OXO1O.OXO1.OXO1("WAManager getLoginQrCodeBlock -> " + r0);
        ANRequest.PostRequestBuilder r1 = AndroidNetworking.post(WAManager.iO(r6)).setContentType(G5.L).addHeaders("Authorization", "Bearer " + r0);
        byte[] r2 = "{\"webhook\": \"\",\"waitQrCode\":false}".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        ANResponse r7 = r1.addByteBody(r2).addHeaders(NetWorkUtils.INSTANCE.getHeadersMap()).setTag(WAManager.iO(r6)).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.get(WAQrCode.class));
        if (r7.isSuccess() == false) goto L22;
        Object r8 = r7.getResult();
        if ((r8 instanceof WAQrCode) == false) goto L9;
        WAQrCode r9 = (WAQrCode) r8;
    L10:
        if (r9 == null) goto L12;
        String r3 = r9.getQrcode();
    L14:
        if (TextUtils.isEmpty(r3) == true) goto L22;
        Intrinsics.XXI(r9);     // Catch: Exception -> L19
        byte[] r10 = Base64.decode(StringsKt__StringsKt.IOIii0(r9.getQrcode(), I000IiI1O.iO.XO0O10, null, 2, null), 0);     // Catch: Exception -> L19
        Bitmap r11 = BitmapFactory.decodeByteArray(r10, 0, r10.length);     // Catch: Exception -> L19
        ta2 r4 = ta2.OXO1;     // Catch: Exception -> L19
        Intrinsics.XXI(r11);     // Catch: Exception -> L19
        ?? r12 = r4.OIi0(r11);     // Catch: Exception -> L19
        if (r12 == 0) goto L22;
        this.$qrcodeResult.element = r12;     // Catch: Exception -> L19
    L19:
        e = move-exception;
        e.printStackTrace();
        goto L22
    L12:
        r3 = null;
        goto L14
    L9:
        r9 = null;
    L22:
        return Unit.OXO1;
    L24:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
