package com.sma.smartv3.ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.ui.translate.ActionDoneType;
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
    private final ty0<com.sma.smartv3.ui.ai_note.OXO1> _stateFlow;

    @aa1
    private String currentSessionId;

    @aa1
    private final SparkChainSessionRepository repository;

    @aa1
    private final k85<List<TranslateEntity>> resultFlow;

    @aa1
    private final k85<com.sma.smartv3.ui.ai_note.OXO1> stateFlow;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailViewModel$getAllSessionEntity$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailViewModel$getAllSessionEntity$1", f = "TranslateSessionDetailViewModel.kt", i = {}, l = {28, 35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        int label;
        final /* synthetic */ TranslateSessionDetailViewModel this$0;

        public AnonymousClass1(String r1, TranslateSessionDetailViewModel r2, Continuation<? super AnonymousClass1> r3) {
            this.$sessionId = r1;
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$sessionId, this.this$0, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L10;
            if (r1 == 1) goto L9;
            if (r1 != 2) goto L8;
            ResultKt.X1ii(r6);
        L27:
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ResultKt.X1ii(r6);
        L18:
            TranslateSessionDetailViewModel.access$setCurrentSessionId$p(this.this$0, this.$sessionId);
            TranslateSessionWithTranslation r7 = this.this$0.getRepository().XOO0ii0(this.$sessionId);
            if (r7 == null) goto L23;
            TranslateSessionDetailViewModel r2 = this.this$0;
            if (r7.getSession().isDelete() == ActionDoneType.COMPLETE.getFlag()) goto L23;
            TranslateSessionDetailViewModel.access$get_resultFlow$p(r2).setValue(r7.getTranslations());
        L23:
            ty0 r8 = TranslateSessionDetailViewModel.access$get_stateFlow$p(this.this$0);
            com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO r3 = com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO.OXO1;
            this.label = 2;
            if (r8.emit(r3, this) != r0) goto L27;
        L25:
            return r0;
        L10:
            ResultKt.X1ii(r6);
            String r9 = this.$sessionId;
            if (r9 == null) goto L29;
            if (r9.length() == 0) goto L29;
            ty0 r10 = TranslateSessionDetailViewModel.access$get_stateFlow$p(this.this$0);
            com.sma.smartv3.ui.ai_note.OXO1.XO0O10 r4 = com.sma.smartv3.ui.ai_note.OXO1.XO0O10.OXO1;
            this.label = 1;
            if (r10.emit(r4, this) != r0) goto L18;
        L29:
            return Unit.OXO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public TranslateSessionDetailViewModel() {
        this.repository = new SparkChainSessionRepository();
        this.currentSessionId = "";
        ty0<com.sma.smartv3.ui.ai_note.OXO1> r0 = l85.OXO1(com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO.OXO1);
        this._stateFlow = r0;
        this.stateFlow = iX0XiO.XXI(r0);
        ty0<List<TranslateEntity>> r1 = l85.OXO1(CollectionsKt__CollectionsKt.iI());
        this._resultFlow = r1;
        this.resultFlow = iX0XiO.XXI(r1);
    }

    public static final /* synthetic */ ty0 access$get_resultFlow$p(TranslateSessionDetailViewModel r0) {
        return r0._resultFlow;
    }

    public static final /* synthetic */ ty0 access$get_stateFlow$p(TranslateSessionDetailViewModel r0) {
        return r0._stateFlow;
    }

    public static final /* synthetic */ void access$setCurrentSessionId$p(TranslateSessionDetailViewModel r0, String r1) {
        r0.currentSessionId = r1;
    }

    public final void deleteSession() {
        if (this.currentSessionId.length() != 0) goto L5;
        return;
    L5:
        this.repository.X1ii(this.currentSessionId);
    }

    @aa1
    public final XiOIO getAllSessionEntity(@tb1 String r7) {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(r7, this, null), 2, null);
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
    public final k85<com.sma.smartv3.ui.ai_note.OXO1> getStateFlow() {
        return this.stateFlow;
    }
}
