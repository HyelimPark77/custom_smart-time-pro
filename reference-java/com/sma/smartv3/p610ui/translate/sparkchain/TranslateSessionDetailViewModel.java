package com.sma.smartv3.p610ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.p610ui.ai_note.OXO1;
import com.sma.smartv3.p610ui.translate.ActionDoneType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class TranslateSessionDetailViewModel extends ViewModel {

    @aa1
    private final ty0<List<TranslateEntity>> _resultFlow;

    @aa1
    private final ty0<OXO1> _stateFlow;

    @aa1
    private final k85<List<TranslateEntity>> resultFlow;

    @aa1
    private final k85<OXO1> stateFlow;

    @aa1
    private final SparkChainSessionRepository repository = new SparkChainSessionRepository();

    @aa1
    private String currentSessionId = "";

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailViewModel$getAllSessionEntity$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailViewModel$getAllSessionEntity$1", m39466f = "TranslateSessionDetailViewModel.kt", m39467i = {}, m39468l = {28, 35}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190261 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        int label;
        final /* synthetic */ TranslateSessionDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190261(String str, TranslateSessionDetailViewModel translateSessionDetailViewModel, Continuation<? super C190261> continuation) {
            super(2, continuation);
            this.$sessionId = str;
            this.this$0 = translateSessionDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190261(this.$sessionId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190261) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.X1ii(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                return Unit.OXO1;
            }
            ResultKt.X1ii(obj);
            String str = this.$sessionId;
            if (str == null || str.length() == 0) {
                return Unit.OXO1;
            }
            ty0 ty0Var = this.this$0._stateFlow;
            OXO1.XO0O10 xo0o10 = OXO1.XO0O10.OXO1;
            this.label = 1;
            if (ty0Var.emit(xo0o10, this) != objI0iXXO) {
            }
            return objI0iXXO;
            this.this$0.currentSessionId = this.$sessionId;
            TranslateSessionWithTranslation translateSessionWithTranslationXOO0ii0 = this.this$0.getRepository().XOO0ii0(this.$sessionId);
            if (translateSessionWithTranslationXOO0ii0 != null) {
                TranslateSessionDetailViewModel translateSessionDetailViewModel = this.this$0;
                if (translateSessionWithTranslationXOO0ii0.getSession().isDelete() != ActionDoneType.COMPLETE.getFlag()) {
                    translateSessionDetailViewModel._resultFlow.setValue(translateSessionWithTranslationXOO0ii0.getTranslations());
                }
            }
            ty0 ty0Var2 = this.this$0._stateFlow;
            OXO1.XIi00iiXO xIi00iiXO = OXO1.XIi00iiXO.OXO1;
            this.label = 2;
        }
    }

    public TranslateSessionDetailViewModel() {
        ty0<OXO1> ty0VarOXO1 = l85.OXO1(OXO1.XIi00iiXO.OXO1);
        this._stateFlow = ty0VarOXO1;
        this.stateFlow = iX0XiO.XXI(ty0VarOXO1);
        ty0<List<TranslateEntity>> ty0VarOXO2 = l85.OXO1(CollectionsKt__CollectionsKt.m39402iI());
        this._resultFlow = ty0VarOXO2;
        this.resultFlow = iX0XiO.XXI(ty0VarOXO2);
    }

    public final void deleteSession() {
        if (this.currentSessionId.length() == 0) {
            return;
        }
        this.repository.X1ii(this.currentSessionId);
    }

    @aa1
    public final XiOIO getAllSessionEntity(@tb1 String str) {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C190261(str, this, null), 2, null);
    }

    @aa1
    public final SparkChainSessionRepository getRepository() {
        return this.repository;
    }

    @aa1
    public final k85<List<TranslateEntity>> getResultFlow() {
        return this.resultFlow;
    }

    @aa1
    public final k85<OXO1> getStateFlow() {
        return this.stateFlow;
    }
}
