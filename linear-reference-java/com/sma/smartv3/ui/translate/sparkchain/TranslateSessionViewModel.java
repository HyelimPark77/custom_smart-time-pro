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
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
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
    private final ty0<com.sma.smartv3.ui.ai_note.OXO1> _stateFlow;

    @aa1
    private final SparkChainSessionRepository repository;

    @aa1
    private final k85<List<TranslateSessionWithFirstEntity>> resultFlow;

    @aa1
    private final List<TranslateSessionEntity> sessionList;

    @aa1
    private final k85<com.sma.smartv3.ui.ai_note.OXO1> stateFlow;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$deleteAllSparkChainSessionList$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$deleteAllSparkChainSessionList$1", f = "TranslateSessionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1869#2,2:61\n*S KotlinDebug\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1\n*L\n54#1:61,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TranslateSessionViewModel this$0;

        public AnonymousClass1(TranslateSessionViewModel r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L11;
            ResultKt.X1ii(r4);
            List r5 = TranslateSessionViewModel.access$getSessionList$p(this.this$0);
            TranslateSessionViewModel r0 = this.this$0;
            Iterator r6 = r5.iterator();
        L6:
            if (r6.hasNext() == false) goto L9;
            TranslateSessionEntity r1 = (TranslateSessionEntity) r6.next();
            TranslateSessionViewModel.access$getRepository$p(r0).X1ii(r1.getSessionId());
            goto L6
        L9:
            return Unit.OXO1;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$getSparkChainSessionList$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionViewModel$getSparkChainSessionList$1", f = "TranslateSessionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1869#2,2:61\n*S KotlinDebug\n*F\n+ 1 TranslateSessionViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1\n*L\n41#1:61,2\n*E\n"})
    public static final class C34941 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TranslateSessionViewModel this$0;

        public C34941(TranslateSessionViewModel r1, Continuation<? super C34941> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34941(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34941) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L11;
            ResultKt.X1ii(r4);
            TranslateSessionViewModel.access$get_stateFlow$p(this.this$0).setValue(com.sma.smartv3.ui.ai_note.OXO1.XO0O10.OXO1);
            List<TranslateSessionWithFirstEntity> r5 = TranslateSessionViewModel.access$getRepository$p(this.this$0).IO();
            TranslateSessionViewModel.access$get_resultFlow$p(this.this$0).setValue(r5);
            TranslateSessionViewModel r0 = this.this$0;
            Iterator<T> r6 = r5.iterator();
        L6:
            if (r6.hasNext() == false) goto L8;
            TranslateSessionWithFirstEntity r1 = (TranslateSessionWithFirstEntity) r6.next();
            TranslateSessionViewModel.access$getSessionList$p(r0).add(r1.getSession());
            goto L6
        L8:
            TranslateSessionViewModel.access$get_stateFlow$p(this.this$0).setValue(com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO.OXO1);
            return Unit.OXO1;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public TranslateSessionViewModel() {
        this.repository = new SparkChainSessionRepository();
        ty0<List<TranslateSessionWithFirstEntity>> r0 = l85.OXO1(null);
        this._resultFlow = r0;
        this.sessionList = new ArrayList();
        this.resultFlow = iX0XiO.XXI(r0);
        ty0<com.sma.smartv3.ui.ai_note.OXO1> r1 = l85.OXO1(com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO.OXO1);
        this._stateFlow = r1;
        this.stateFlow = iX0XiO.XXI(r1);
        getSparkChainSessionList();
    }

    public static final /* synthetic */ SparkChainSessionRepository access$getRepository$p(TranslateSessionViewModel r0) {
        return r0.repository;
    }

    public static final /* synthetic */ List access$getSessionList$p(TranslateSessionViewModel r0) {
        return r0.sessionList;
    }

    public static final /* synthetic */ ty0 access$get_resultFlow$p(TranslateSessionViewModel r0) {
        return r0._resultFlow;
    }

    public static final /* synthetic */ ty0 access$get_stateFlow$p(TranslateSessionViewModel r0) {
        return r0._stateFlow;
    }

    @aa1
    public final XiOIO deleteAllSparkChainSessionList() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }

    @aa1
    public final k85<List<TranslateSessionWithFirstEntity>> getResultFlow() {
        return this.resultFlow;
    }

    @aa1
    public final XiOIO getSparkChainSessionList() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34941(this, null), 2, null);
    }

    @aa1
    public final k85<com.sma.smartv3.ui.ai_note.OXO1> getStateFlow() {
        return this.stateFlow;
    }
}
