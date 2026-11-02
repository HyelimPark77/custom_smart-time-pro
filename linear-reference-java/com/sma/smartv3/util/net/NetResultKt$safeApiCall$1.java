package com.sma.smartv3.util.net;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.net.NetResultKt", f = "NetResult.kt", i = {0, 0}, l = {17}, m = "safeApiCall", n = {"block", "$i$f$safeApiCall"}, s = {"L$0", "I$0"}, v = 1)
@SourceDebugExtension({"SMAP\nNetResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt$safeApiCall$1\n*L\n1#1,31:1\n*E\n"})
public final class NetResultKt$safeApiCall$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public NetResultKt$safeApiCall$1(Continuation<? super NetResultKt$safeApiCall$1> r1) {
        super(r1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return NetResultKt.OXO1(null, this);
    }
}
