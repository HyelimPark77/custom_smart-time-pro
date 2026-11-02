package com.sma.smartv3.p610ui.ai_note;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.p608db.entity.AIRecords;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteDetailViewModel extends ViewModel {

    @aa1
    private final ty0<AIRecords> _aiNoteFlow;

    @aa1
    private final k85<AIRecords> aiNoteFlow;

    @aa1
    private final cr4 repository = new cr4();

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$getAiRecordById$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$getAiRecordById$1", m39466f = "AiNoteDetailViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186541 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186541(long j, Continuation<? super C186541> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiNoteDetailViewModel.this.new C186541(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C186541) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            AIRecords aIRecordsXO0O10 = AiNoteDetailViewModel.this.repository.XO0O10(this.$id);
            i1O0OXO1O.OXO1.OXO1("CurrentAiNote:" + aIRecordsXO0O10);
            AiNoteDetailViewModel.this._aiNoteFlow.setValue(aIRecordsXO0O10);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$softDeleteAiNote$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$softDeleteAiNote$1", m39466f = "AiNoteDetailViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289681 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C289681(Continuation<? super C289681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiNoteDetailViewModel.this.new C289681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289681) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            AIRecords aIRecords = (AIRecords) AiNoteDetailViewModel.this._aiNoteFlow.getValue();
            if (aIRecords != null) {
                AiNoteDetailViewModel.this.repository.OXO1(aIRecords);
            }
            return Unit.OXO1;
        }
    }

    public AiNoteDetailViewModel() {
        ty0<AIRecords> ty0VarOXO1 = l85.OXO1(null);
        this._aiNoteFlow = ty0VarOXO1;
        this.aiNoteFlow = iX0XiO.XXI(ty0VarOXO1);
    }

    @aa1
    public final k85<AIRecords> getAiNoteFlow() {
        return this.aiNoteFlow;
    }

    @aa1
    public final XiOIO getAiRecordById(long j) {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C186541(j, null), 2, null);
    }

    @aa1
    public final XiOIO softDeleteAiNote() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C289681(null), 2, null);
    }
}
