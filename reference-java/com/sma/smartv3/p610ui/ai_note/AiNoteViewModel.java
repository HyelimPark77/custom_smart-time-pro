package com.sma.smartv3.p610ui.ai_note;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.p608db.entity.AIRecords;
import java.util.ArrayList;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteViewModel$deleteAllInfo$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteViewModel$deleteAllInfo$1", m39466f = "AiNoteViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186581 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C186581(Continuation<? super C186581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiNoteViewModel.this.new C186581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C186581) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            cr4.m1627iO(AiNoteViewModel.this.getRepository(), 0, 1, null);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteViewModel$getNotes$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteViewModel$getNotes$1", m39466f = "AiNoteViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nAiNoteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n774#2:38\n865#2,2:39\n*S KotlinDebug\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n*L\n27#1:38\n27#1:39,2\n*E\n"})
    public static final class C289691 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C289691(int i, Continuation<? super C289691> continuation) {
            super(2, continuation);
            this.$type = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AiNoteViewModel.this.new C289691(this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289691) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            AiNoteViewModel.this._stateFlow.setValue(OXO1.XO0O10.OXO1);
            List<AIRecords> listIiI10X = AiNoteViewModel.this.getRepository().IiI10X(this.$type);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listIiI10X) {
                if (((AIRecords) obj2).getMContent().length() > 0) {
                    arrayList.add(obj2);
                }
            }
            AiNoteViewModel.this._aiNotesFlow.setValue(arrayList);
            AiNoteViewModel.this._stateFlow.setValue(OXO1.XIi00iiXO.OXO1);
            return Unit.OXO1;
        }
    }

    public AiNoteViewModel() {
        ty0<List<AIRecords>> ty0VarOXO1 = l85.OXO1(CollectionsKt__CollectionsKt.m39402iI());
        this._aiNotesFlow = ty0VarOXO1;
        this.aiNotesFLow = iX0XiO.XXI(ty0VarOXO1);
        this.repository = new cr4();
        ty0<OXO1> ty0VarOXO2 = l85.OXO1(OXO1.XIi00iiXO.OXO1);
        this._stateFlow = ty0VarOXO2;
        this.stateFlow = iX0XiO.XXI(ty0VarOXO2);
    }

    public static /* synthetic */ XiOIO getNotes$default(AiNoteViewModel aiNoteViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aiNoteViewModel.repository.O00();
        }
        return aiNoteViewModel.getNotes(i);
    }

    @aa1
    public final XiOIO deleteAllInfo() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C186581(null), 2, null);
    }

    @aa1
    public final k85<List<AIRecords>> getAiNotesFLow() {
        return this.aiNotesFLow;
    }

    @aa1
    public final XiOIO getNotes(int i) {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C289691(i, null), 2, null);
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
