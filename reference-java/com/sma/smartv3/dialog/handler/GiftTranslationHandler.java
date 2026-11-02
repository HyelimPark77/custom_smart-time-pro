package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
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

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ IO0i<Unit> f51199IO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(IO0i<? super Unit> iO0i) {
            this.f51199IO = iO0i;
        }

        public final void OXO1() {
            IO0i<Unit> iO0i = this.f51199IO;
            Result.Companion companion = Result.Companion;
            iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2() {
            OXO1();
            return Unit.OXO1;
        }
    }

    public GiftTranslationHandler() {
        super(6);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.android.mltcode.paycertificationapi.OiOI0Iii0
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Boolean> continuation) {
        GiftTranslationHandler$shouldShow$1 giftTranslationHandler$shouldShow$1;
        if (continuation instanceof GiftTranslationHandler$shouldShow$1) {
            giftTranslationHandler$shouldShow$1 = (GiftTranslationHandler$shouldShow$1) continuation;
            int i = giftTranslationHandler$shouldShow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                giftTranslationHandler$shouldShow$1.label = i - Integer.MIN_VALUE;
            } else {
                giftTranslationHandler$shouldShow$1 = new GiftTranslationHandler$shouldShow$1(this, continuation);
            }
        } else {
            giftTranslationHandler$shouldShow$1 = new GiftTranslationHandler$shouldShow$1(this, continuation);
        }
        GiftTranslationHandler$shouldShow$1 giftTranslationHandler$shouldShow$2 = giftTranslationHandler$shouldShow$1;
        Object objI0iXXO = giftTranslationHandler$shouldShow$2.result;
        Object objI0iXXO2 = C2798pb.I0iXXO();
        int i2 = giftTranslationHandler$shouldShow$2.label;
        if (i2 == 0) {
            ResultKt.X1ii(objI0iXXO);
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            AppUser appUser2 = (AppUser) appUser;
            if (appUser2.getIdentity().length() == 0) {
                return Boxing.OXO1(false);
            }
            iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
            String identity = appUser2.getIdentity();
            giftTranslationHandler$shouldShow$2.L$0 = SpillingKt.OXO1(appUser2);
            giftTranslationHandler$shouldShow$2.label = 1;
            objI0iXXO = iIX01Oi.I0iXXO(iix01oiXOO0ii0, identity, null, giftTranslationHandler$shouldShow$2, 2, null);
            if (objI0iXXO == objI0iXXO2) {
                return objI0iXXO2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(objI0iXXO);
        }
        ApiResponse apiResponse = (ApiResponse) objI0iXXO;
        if (apiResponse.isSuccess()) {
            TranslationTime translationTime = (TranslationTime) apiResponse.getData();
            List<TranslationFreeTimeEntity> freeList = translationTime != null ? translationTime.getFreeList() : null;
            if (freeList != null && !freeList.isEmpty()) {
                Iterator<T> it = ((TranslationTime) apiResponse.getData()).getFreeList().iterator();
                while (it.hasNext()) {
                    this.XIi00iiXO += ((TranslationFreeTimeEntity) it.next()).getRemainDuration();
                }
                return Boxing.OXO1(this.XIi00iiXO > 0.0f);
            }
        }
        return Boxing.OXO1(false);
    }

    @Override // com.android.mltcode.paycertificationapi.OiOI0Iii0
    @tb1
    public Object XO0O10(@aa1 FragmentActivity fragmentActivity, @aa1 Continuation<? super Unit> continuation) {
        XIi00iiXO xIi00iiXO = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation), 1);
        xIi00iiXO.XXX11i();
        GiftTranslationDialogFragment giftTranslationDialogFragment = new GiftTranslationDialogFragment();
        giftTranslationDialogFragment.setOnDismissAction(new OXO1(xIi00iiXO));
        giftTranslationDialogFragment.setFreeTime(this.XIi00iiXO);
        giftTranslationDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "giftTranslation");
        Object objOII = xIi00iiXO.OII();
        if (objOII == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objOII == C2798pb.I0iXXO() ? objOII : Unit.OXO1;
    }
}
