package com.sma.smartv3.ui.ai_note;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.db.entity.AIRecords;
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
    private final cr4 repository;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$getAiRecordById$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$getAiRecordById$1", f = "AiNoteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;
        final /* synthetic */ AiNoteDetailViewModel this$0;

        public AnonymousClass1(AiNoteDetailViewModel r1, long r2, Continuation<? super AnonymousClass1> r4) {
            this.this$0 = r1;
            this.$id = r2;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new AnonymousClass1(this.this$0, this.$id, r5);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r4);
            AIRecords r5 = AiNoteDetailViewModel.access$getRepository$p(this.this$0).XO0O10(this.$id);
            i1O0OXO1O.OXO1.OXO1("CurrentAiNote:" + r5);
            AiNoteDetailViewModel.access$get_aiNoteFlow$p(this.this$0).setValue(r5);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$softDeleteAiNote$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$softDeleteAiNote$1", f = "AiNoteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34351 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AiNoteDetailViewModel this$0;

        public C34351(AiNoteDetailViewModel r1, Continuation<? super C34351> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34351(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34351) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            pb.I0iXXO();
            if (this.label != 0) goto L10;
            ResultKt.X1ii(r2);
            AIRecords r3 = (AIRecords) AiNoteDetailViewModel.access$get_aiNoteFlow$p(this.this$0).getValue();
            if (r3 == null) goto L8;
            AiNoteDetailViewModel.access$getRepository$p(this.this$0).OXO1(r3);
        L8:
            return Unit.OXO1;
        L10:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AiNoteDetailViewModel() {
        this.repository = new cr4();
        ty0<AIRecords> r0 = l85.OXO1(null);
        this._aiNoteFlow = r0;
        this.aiNoteFlow = iX0XiO.XXI(r0);
    }

    public static final /* synthetic */ cr4 access$getRepository$p(AiNoteDetailViewModel r0) {
        return r0.repository;
    }

    public static final /* synthetic */ ty0 access$get_aiNoteFlow$p(AiNoteDetailViewModel r0) {
        return r0._aiNoteFlow;
    }

    @aa1
    public final k85<AIRecords> getAiNoteFlow() {
        return this.aiNoteFlow;
    }

    @aa1
    public final XiOIO getAiRecordById(long r7) {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, r7, null), 2, null);
    }

    @aa1
    public final XiOIO softDeleteAiNote() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34351(this, null), 2, null);
    }
}
