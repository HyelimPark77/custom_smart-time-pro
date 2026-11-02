package com.sma.smartv3.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.sz0;
import com.bestmafen.androidbase.p057io.Location;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.ShareUtil$export$1", m39466f = "ShareUtil.kt", m39467i = {0, 0, 0, 0}, m39468l = {80}, m39469m = "invokeSuspend", m39470n = {"fileText", "fileWriter", "file", SDKConstants.PARAM_INTENT}, m39472s = {"L$0", "L$1", "L$2", "L$3"}, m39473v = 1)
public final class ShareUtil$export$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $name;
    final /* synthetic */ String $textToExport;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ShareUtil$export$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.ShareUtil$export$1$1", m39466f = "ShareUtil.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190551 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190551(Context context, Intent intent, Continuation<? super C190551> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190551(this.$context, this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190551) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            this.$context.startActivity(Intent.createChooser(this.$intent, "Share txt"));
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareUtil$export$1(String str, String str2, Context context, Continuation<? super ShareUtil$export$1> continuation) {
        super(2, continuation);
        this.$name = str;
        this.$textToExport = str2;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareUtil$export$1(this.$name, this.$textToExport, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((ShareUtil$export$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.X1ii(obj);
                sz0 sz0Var = sz0.OXO1;
                File fileOXO1 = sz0Var.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), this.$name);
                if (fileOXO1.exists()) {
                    fileOXO1.delete();
                }
                FileUtils.createOrExistsFile(fileOXO1);
                FileWriter fileWriter = new FileWriter(fileOXO1);
                fileWriter.write(this.$textToExport);
                fileWriter.close();
                Uri uriXO0O10 = sz0Var.XO0O10(fileOXO1);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", "Share txt");
                intent.putExtra("android.intent.extra.STREAM", uriXO0O10);
                intent.setType("*/*");
                intent.addFlags(268435456);
                g10 g10VarO00 = IXOX0Xiii.O00();
                C190551 c190551 = new C190551(this.$context, intent, null);
                this.L$0 = SpillingKt.OXO1(fileOXO1);
                this.L$1 = SpillingKt.OXO1(fileWriter);
                this.L$2 = SpillingKt.OXO1(uriXO0O10);
                this.L$3 = SpillingKt.OXO1(intent);
                this.label = 1;
                if (I100X1.I0IIOi(g10VarO00, c190551, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.OXO1;
    }
}
