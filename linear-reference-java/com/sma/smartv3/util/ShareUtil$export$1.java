package com.sma.smartv3.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.bestmafen.androidbase.io.Location;
import com.blankj.utilcode.util.FileUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.File;
import java.io.FileWriter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.ShareUtil$export$1", f = "ShareUtil.kt", i = {0, 0, 0, 0}, l = {80}, m = "invokeSuspend", n = {"fileText", "fileWriter", "file", SDKConstants.PARAM_INTENT}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 1)
public final class ShareUtil$export$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $name;
    final /* synthetic */ String $textToExport;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ShareUtil$export$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.ShareUtil$export$1$1", f = "ShareUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        int label;

        public AnonymousClass1(Context r1, Intent r2, Continuation<? super AnonymousClass1> r3) {
            this.$context = r1;
            this.$intent = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$context, this.$intent, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            this.$context.startActivity(Intent.createChooser(this.$intent, "Share txt"));
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public ShareUtil$export$1(String r1, String r2, Context r3, Continuation<? super ShareUtil$export$1> r4) {
        this.$name = r1;
        this.$textToExport = r2;
        this.$context = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new ShareUtil$export$1(this.$name, this.$textToExport, this.$context, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((ShareUtil$export$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L12;
        if (r1 != 1) goto L11;
        Intent r2 = (Intent) this.L$3;
        Uri r3 = (Uri) this.L$2;
        FileWriter r4 = (FileWriter) this.L$1;
        File r5 = (File) this.L$0;
        ResultKt.X1ii(r10);     // Catch: Exception -> L8
    L21:
        return Unit.OXO1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L12:
        ResultKt.X1ii(r10);
        sz0 r11 = sz0.OXO1;
        File r6 = r11.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), this.$name);
        if (r6.exists() == false) goto L16;
        r6.delete();     // Catch: Exception -> L8
    L16:
        FileUtils.createOrExistsFile(r6);     // Catch: Exception -> L8
        FileWriter r7 = new FileWriter(r6);     // Catch: Exception -> L8
        r7.write(this.$textToExport);     // Catch: Exception -> L8
        r7.close();     // Catch: Exception -> L8
        Uri r12 = r11.XO0O10(r6);     // Catch: Exception -> L8
        Intent r8 = new Intent("android.intent.action.SEND");     // Catch: Exception -> L8
        r8.putExtra("android.intent.extra.TEXT", "Share txt");     // Catch: Exception -> L8
        r8.putExtra("android.intent.extra.STREAM", r12);     // Catch: Exception -> L8
        r8.setType("*/*");     // Catch: Exception -> L8
        r8.addFlags(268435456);     // Catch: Exception -> L8
        g10 r9 = IXOX0Xiii.O00();     // Catch: Exception -> L8
        AnonymousClass1 r13 = new AnonymousClass1(this.$context, r8, null);     // Catch: Exception -> L8
        this.L$0 = SpillingKt.OXO1(r6);     // Catch: Exception -> L8
        this.L$1 = SpillingKt.OXO1(r7);     // Catch: Exception -> L8
        this.L$2 = SpillingKt.OXO1(r12);     // Catch: Exception -> L8
        this.L$3 = SpillingKt.OXO1(r8);     // Catch: Exception -> L8
        this.label = 1;     // Catch: Exception -> L8
        if (I100X1.I0IIOi(r9, r13, this) != r0) goto L21;
        return r0;
    L8:
        e = move-exception;
        e.printStackTrace();
        goto L21
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
