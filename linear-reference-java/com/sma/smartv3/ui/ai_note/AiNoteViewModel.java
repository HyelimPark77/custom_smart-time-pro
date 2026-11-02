package com.sma.smartv3.ui.ai_note;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.db.entity.AIRecords;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteViewModel extends ViewModel {

    @aa1
    private final ty0<List<AIRecords>> _aiNotesFlow;

    @aa1
    private final ty0<OXO1> _stateFlow;

    @aa1
    private final k85<List<AIRecords>> aiNotesFLow;

    @aa1
    private final cr4 repository;

    @aa1
    private final k85<OXO1> stateFlow;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteViewModel$deleteAllInfo$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteViewModel$deleteAllInfo$1", f = "AiNoteViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AiNoteViewModel this$0;

        public AnonymousClass1(AiNoteViewModel r1, Continuation<? super AnonymousClass1> r2) {
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
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r4);
            cr4.iO(this.this$0.getRepository(), 0, 1, null);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteViewModel$getNotes$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteViewModel$getNotes$1", f = "AiNoteViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nAiNoteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n774#2:38\n865#2,2:39\n*S KotlinDebug\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n*L\n27#1:38\n27#1:39,2\n*E\n"})
    public static final class C34361 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $type;
        int label;
        final /* synthetic */ AiNoteViewModel this$0;

        public C34361(AiNoteViewModel r1, int r2, Continuation<? super C34361> r3) {
            this.this$0 = r1;
            this.$type = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C34361(this.this$0, this.$type, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34361) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            pb.I0iXXO();
            if (this.label != 0) goto L13;
            ResultKt.X1ii(r4);
            AiNoteViewModel.access$get_stateFlow$p(this.this$0).setValue(OXO1.XO0O10.OXO1);
            List<AIRecords> r5 = this.this$0.getRepository().IiI10X(this.$type);
            ArrayList r0 = new ArrayList();
            Iterator<T> r6 = r5.iterator();
        L6:
            if (r6.hasNext() == false) goto L10;
            Object r1 = r6.next();
            if (((AIRecords) r1).getMContent().length() <= 0) goto L6;
            r0.add(r1);
            goto L6
        L10:
            AiNoteViewModel.access$get_aiNotesFlow$p(this.this$0).setValue(r0);
            AiNoteViewModel.access$get_stateFlow$p(this.this$0).setValue(OXO1.XIi00iiXO.OXO1);
            return Unit.OXO1;
        L13:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AiNoteViewModel() {
        ty0<List<AIRecords>> r0 = l85.OXO1(CollectionsKt__CollectionsKt.iI());
        this._aiNotesFlow = r0;
        this.aiNotesFLow = iX0XiO.XXI(r0);
        this.repository = new cr4();
        ty0<OXO1> r1 = l85.OXO1(OXO1.XIi00iiXO.OXO1);
        this._stateFlow = r1;
        this.stateFlow = iX0XiO.XXI(r1);
    }

    public static final /* synthetic */ ty0 access$get_aiNotesFlow$p(AiNoteViewModel r0) {
        return r0._aiNotesFlow;
    }

    public static final /* synthetic */ ty0 access$get_stateFlow$p(AiNoteViewModel r0) {
        return r0._stateFlow;
    }

    public static /* synthetic */ XiOIO getNotes$default(AiNoteViewModel r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.repository.O00();
    L6:
        return r0.getNotes(r1);
    }

    @aa1
    public final XiOIO deleteAllInfo() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }

    @aa1
    public final k85<List<AIRecords>> getAiNotesFLow() {
        return this.aiNotesFLow;
    }

    @aa1
    public final XiOIO getNotes(int r7) {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34361(this, r7, null), 2, null);
    }

    @aa1
    public final cr4 getRepository() {
        return this.repository;
    }

    @aa1
    public final k85<OXO1> getStateFlow() {
        return this.stateFlow;
    }
}
