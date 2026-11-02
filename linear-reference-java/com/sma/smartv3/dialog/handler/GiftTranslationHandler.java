package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dialog.GiftTranslationDialogFragment;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.util.net.ApiResponse;
import com.sma.smartv3.util.websocket.data.TranslationFreeTimeEntity;
import com.sma.smartv3.util.websocket.data.TranslationTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XIi00iiXO;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nGiftTranslationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,45:1\n19#2:46\n15#2:47\n1869#3,2:48\n310#4,11:50\n*S KotlinDebug\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n*L\n20#1:46\n20#1:47\n26#1:48,2\n35#1:50,11\n*E\n"})
public final class GiftTranslationHandler extends OiOI0Iii0 {
    public float XIi00iiXO;

    public static final class OXO1 implements Function0<Unit> {
        public final /* synthetic */ IO0i<Unit> IO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(IO0i<? super Unit> r1) {
            this.IO = r1;
        }

        public final void OXO1() {
            IO0i<Unit> r0 = this.IO;
            Result.Companion r1 = Result.Companion;
            r0.resumeWith(Result.m6974constructorimpl(Unit.OXO1));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            OXO1();
            return Unit.OXO1;
        }
    }

    public GiftTranslationHandler() {
        super(6);
    }

    public static final /* synthetic */ float O00(GiftTranslationHandler r0) {
        return r0.XIi00iiXO;
    }

    @Override // com.android.mltcode.paycertificationapi.OiOI0Iii0
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Boolean> r42) {
        if ((r42 instanceof GiftTranslationHandler$shouldShow$1) == false) goto L8;
        GiftTranslationHandler$shouldShow$1 r2 = (GiftTranslationHandler$shouldShow$1) r42;
        int r3 = r2.label;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L8;
        r2.label = r3 - Integer.MIN_VALUE;
    L7:
        GiftTranslationHandler$shouldShow$1 r6 = r2;
        Object r1 = r6.result;
        Object r4 = pb.I0iXXO();
        int r5 = r6.label;
        boolean r9 = false;
        if (r5 == 0) goto L15;
        if (r5 != 1) goto L14;
        AppUser r7 = (AppUser) r6.L$0;
        ResultKt.X1ii(r1);
    L26:
        ApiResponse r8 = (ApiResponse) r1;
        if (r8.isSuccess() == false) goto L47;
        TranslationTime r10 = (TranslationTime) r8.getData();
        if (r10 == null) goto L31;
        List<TranslationFreeTimeEntity> r11 = r10.getFreeList();
    L32:
        List<TranslationFreeTimeEntity> r12 = r11;
        if (r12 == null) goto L47;
        if (r12.isEmpty() == true) goto L47;
        Iterator<T> r13 = ((TranslationTime) r8.getData()).getFreeList().iterator();
    L39:
        if (r13.hasNext() == false) goto L42;
        this.XIi00iiXO += ((TranslationFreeTimeEntity) r13.next()).getRemainDuration();
        goto L39
    L42:
        if (this.XIi00iiXO <= 0.0f) goto L45;
        r9 = true;
    L45:
        return Boxing.OXO1(r9);
    L31:
        r11 = null;
    L47:
        return Boxing.OXO1(false);
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        ResultKt.X1ii(r1);
        SPUtils r14 = a01.OXO1.IiI10X();
        Object r15 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r16 = new Gson().fromJson(r14.getString(AppUser.class.getName()), AppUser.class);
        if (r16 == null) goto L19;
        r15 = r16;
    L19:
        AppUser r17 = (AppUser) r15;
        if (r17.getIdentity().length() == 0) goto L22;
        iIX01Oi r18 = i1000.OXO1.XOO0ii0();
        String r19 = r17.getIdentity();
        r6.L$0 = SpillingKt.OXO1(r17);
        r6.label = 1;
        r1 = iIX01Oi.I0iXXO(r18, r19, null, r6, 2, null);
        if (r1 != r4) goto L26;
        return r4;
    L22:
        return Boxing.OXO1(false);
    L8:
        r2 = new GiftTranslationHandler$shouldShow$1(this, r42);
        goto L7
    }

    @Override // com.android.mltcode.paycertificationapi.OiOI0Iii0
    @tb1
    public Object XO0O10(@aa1 FragmentActivity r4, @aa1 Continuation<? super Unit> r5) {
        XIi00iiXO r0 = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(r5), 1);
        r0.XXX11i();
        GiftTranslationDialogFragment r1 = new GiftTranslationDialogFragment();
        r1.setOnDismissAction(new OXO1(r0));
        r1.setFreeTime(O00(this));
        r1.show(r4.getSupportFragmentManager(), "giftTranslation");
        Object r6 = r0.OII();
        if (r6 != pb.I0iXXO()) goto L6;
        DebugProbesKt.iO(r5);
    L6:
        if (r6 != pb.I0iXXO()) goto L9;
        return r6;
    L9:
        return Unit.OXO1;
    }
}
