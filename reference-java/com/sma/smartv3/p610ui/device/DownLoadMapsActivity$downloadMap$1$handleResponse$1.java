package com.sma.smartv3.p610ui.device;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1", m39466f = "DownLoadMapsActivity.kt", m39467i = {}, m39468l = {197}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class DownLoadMapsActivity$downloadMap$1$handleResponse$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mFileName;
    int label;
    final /* synthetic */ DownLoadMapsActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$downloadMap$1$handleResponse$1$1", m39466f = "DownLoadMapsActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186931 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $mFileName;
        int label;
        final /* synthetic */ DownLoadMapsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186931(DownLoadMapsActivity downLoadMapsActivity, String str, Continuation<? super C186931> continuation) {
            super(2, continuation);
            this.this$0 = downLoadMapsActivity;
            this.$mFileName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186931(this.this$0, this.$mFileName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Boolean> continuation) {
            return ((C186931) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            FileUtils.createOrExistsDir(new File(this.this$0.getMMapDir(), this.$mFileName));
            File file = new File(this.this$0.getMMapDir(), this.$mFileName + OTAManager.OTA_ZIP_SUFFIX);
            ZipUtils.unzipFile(file, new File(this.this$0.getMMapDir(), this.$mFileName));
            return Boxing.OXO1(FileUtils.delete(file));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownLoadMapsActivity$downloadMap$1$handleResponse$1(DownLoadMapsActivity downLoadMapsActivity, String str, Continuation<? super DownLoadMapsActivity$downloadMap$1$handleResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = downLoadMapsActivity;
        this.$mFileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownLoadMapsActivity$downloadMap$1$handleResponse$1(this.this$0, this.$mFileName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((DownLoadMapsActivity$downloadMap$1$handleResponse$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.X1ii(obj);
                CoroutineDispatcher coroutineDispatcherM712iO = IXOX0Xiii.m712iO();
                C186931 c186931 = new C186931(this.this$0, this.$mFileName, null);
                this.label = 1;
                if (I100X1.I0IIOi(coroutineDispatcherM712iO, c186931, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.XIi00iiXO(this.this$0.TAG + "  download handleError e: " + e.getMessage());
        }
        return Unit.OXO1;
    }
}
