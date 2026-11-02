package com.sma.smartv3.ui.device;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1", f = "DownLoadMapsActivity.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class DownLoadMapsActivity$downloadMap$1$handleResponse$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mFileName;
    int label;
    final /* synthetic */ DownLoadMapsActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1$1", f = "DownLoadMapsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $mFileName;
        int label;
        final /* synthetic */ DownLoadMapsActivity this$0;

        public AnonymousClass1(DownLoadMapsActivity r1, String r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r1;
            this.$mFileName = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, this.$mFileName, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Boolean> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r4);
            FileUtils.createOrExistsDir(new File(this.this$0.getMMapDir(), this.$mFileName));
            File r5 = new File(this.this$0.getMMapDir(), this.$mFileName + OTAManager.OTA_ZIP_SUFFIX);
            ZipUtils.unzipFile(r5, new File(this.this$0.getMMapDir(), this.$mFileName));
            return Boxing.OXO1(FileUtils.delete(r5));
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Boolean> r2) {
            return invoke2(r1, r2);
        }
    }

    public DownLoadMapsActivity$downloadMap$1$handleResponse$1(DownLoadMapsActivity r1, String r2, Continuation<? super DownLoadMapsActivity$downloadMap$1$handleResponse$1> r3) {
        this.this$0 = r1;
        this.$mFileName = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new DownLoadMapsActivity$downloadMap$1$handleResponse$1(this.this$0, this.$mFileName, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((DownLoadMapsActivity$downloadMap$1$handleResponse$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L11;
        if (r1 != 1) goto L10;
        ResultKt.X1ii(r7);     // Catch: Exception -> L7
    L18:
    L17:
        return Unit.OXO1;
    L10:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L11:
        ResultKt.X1ii(r7);
        CoroutineDispatcher r8 = IXOX0Xiii.iO();     // Catch: Exception -> L7
        AnonymousClass1 r2 = new AnonymousClass1(this.this$0, this.$mFileName, null);     // Catch: Exception -> L7
        this.label = 1;     // Catch: Exception -> L7
        if (I100X1.I0IIOi(r8, r2, this) != r0) goto L18;
        return r0;
    L7:
        e = move-exception;
        i1O0OXO1O.OXO1.XIi00iiXO(DownLoadMapsActivity.access$getTAG$p(this.this$0) + "  download handleError e: " + e.getMessage());
        goto L17
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
