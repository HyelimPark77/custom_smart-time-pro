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
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.p608db.entity.TranslateSessionEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.p610ui.ai_note.OXO1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class TranslateSessionViewModel extends ViewModel {

    @aa1
    private final ty0<List<TranslateSessionWithFirstEntity>> _resultFlow;

    @aa1
    private final ty0<OXO1> _stateFlow;

    @aa1
    private final SparkChainSessionRepository repository = new SparkChainSessionRepository();

    @aa1
    private final k85<List<TranslateSessionWithFirstEntity>> resultFlow;

    @aa1
    private final List<TranslateSessionEntity> sessionList;

    @aa1
    private final k85<OXO1> stateFlow;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$deleteAllSparkChainSessionList$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$deleteAllSparkChainSessionList$1", m39466f = "TranslateSessionViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1869#2,2:61\n*S KotlinDebug\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1\n*L\n54#1:61,2\n*E\n"})
    public static final class C190301 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C190301(Continuation<? super C190301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslateSessionViewModel.this.new C190301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190301) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            List list = TranslateSessionViewModel.this.sessionList;
            TranslateSessionViewModel translateSessionViewModel = TranslateSessionViewModel.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                translateSessionViewModel.repository.X1ii(((TranslateSessionEntity) it.next()).getSessionId());
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$getSparkChainSessionList$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$getSparkChainSessionList$1", m39466f = "TranslateSessionViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1869#2,2:61\n*S KotlinDebug\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1\n*L\n41#1:61,2\n*E\n"})
    public static final class C290271 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290271(Continuation<? super C290271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslateSessionViewModel.this.new C290271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290271) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            TranslateSessionViewModel.this._stateFlow.setValue(OXO1.XO0O10.OXO1);
            List<TranslateSessionWithFirstEntity> listM38777IO = TranslateSessionViewModel.this.repository.m38777IO();
            TranslateSessionViewModel.this._resultFlow.setValue(listM38777IO);
            TranslateSessionViewModel translateSessionViewModel = TranslateSessionViewModel.this;
            Iterator<T> it = listM38777IO.iterator();
            while (it.hasNext()) {
                translateSessionViewModel.sessionList.add(((TranslateSessionWithFirstEntity) it.next()).getSession());
            }
            TranslateSessionViewModel.this._stateFlow.setValue(OXO1.XIi00iiXO.OXO1);
            return Unit.OXO1;
        }
    }

    public TranslateSessionViewModel() {
        ty0<List<TranslateSessionWithFirstEntity>> ty0VarOXO1 = l85.OXO1(null);
        this._resultFlow = ty0VarOXO1;
        this.sessionList = new ArrayList();
        this.resultFlow = iX0XiO.XXI(ty0VarOXO1);
        ty0<OXO1> ty0VarOXO2 = l85.OXO1(OXO1.XIi00iiXO.OXO1);
        this._stateFlow = ty0VarOXO2;
        this.stateFlow = iX0XiO.XXI(ty0VarOXO2);
        getSparkChainSessionList();
    }

    @aa1
    public final XiOIO deleteAllSparkChainSessionList() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C190301(null), 2, null);
    }

    @aa1
    public final k85<List<TranslateSessionWithFirstEntity>> getResultFlow() {
        return this.resultFlow;
    }

    @aa1
    public final XiOIO getSparkChainSessionList() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290271(null), 2, null);
    }

    @aa1
    public final k85<OXO1> getStateFlow() {
        return this.stateFlow;
    }
}
