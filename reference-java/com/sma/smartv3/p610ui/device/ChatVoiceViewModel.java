package com.sma.smartv3.p610ui.device;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IIiX01100;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.p608db.entity.ChatVoiceAssistantMessage;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatVoiceViewModel extends ViewModel {

    @aa1
    private final ty0<List<ChatVoiceAssistantMessage>> _chatListResultFlow;

    @aa1
    private final k85<List<ChatVoiceAssistantMessage>> chatListResultFlow;

    @aa1
    private final IIiX01100 repository = new IIiX01100();

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$addChatVoice$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$addChatVoice$1", m39466f = "ChatVoiceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186881 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatVoiceAssistantMessage $item;
        int label;
        final /* synthetic */ ChatVoiceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186881(ChatVoiceAssistantMessage chatVoiceAssistantMessage, ChatVoiceViewModel chatVoiceViewModel, Continuation<? super C186881> continuation) {
            super(2, continuation);
            this.$item = chatVoiceAssistantMessage;
            this.this$0 = chatVoiceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186881(this.$item, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C186881) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ChatVoiceAssistantMessage chatVoiceAssistantMessage = this.$item;
            ChatVoiceViewModel chatVoiceViewModel = this.this$0;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("AddChatVoice:" + chatVoiceAssistantMessage + " isEnded:" + chatVoiceAssistantMessage.isEnded());
            if (chatVoiceAssistantMessage.isEnded()) {
                i1o0oxo1o.XO0O10("AddChatVoice Result:" + chatVoiceViewModel.repository.OXO1(chatVoiceAssistantMessage));
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$deleteAllChatByFunctionType$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$deleteAllChatByFunctionType$1", m39466f = "ChatVoiceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289731 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C289731(Continuation<? super C289731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatVoiceViewModel.this.new C289731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289731) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ChatVoiceViewModel.this.repository.XIi00iiXO();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$queryChatList$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$queryChatList$1", m39466f = "ChatVoiceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C289741 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C289741(Continuation<? super C289741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatVoiceViewModel.this.new C289741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289741) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ChatVoiceViewModel.this._chatListResultFlow.setValue(IIiX01100.XO0O10(ChatVoiceViewModel.this.repository, null, 1, null));
            return Unit.OXO1;
        }
    }

    public ChatVoiceViewModel() {
        ty0<List<ChatVoiceAssistantMessage>> ty0VarOXO1 = l85.OXO1(null);
        this._chatListResultFlow = ty0VarOXO1;
        this.chatListResultFlow = iX0XiO.XXI(ty0VarOXO1);
        queryChatList();
    }

    @aa1
    public final XiOIO addChatVoice(@aa1 ChatVoiceAssistantMessage item) {
        Intrinsics.X0O(item, "item");
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C186881(item, this, null), 2, null);
    }

    @aa1
    public final XiOIO deleteAllChatByFunctionType() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C289731(null), 2, null);
    }

    @aa1
    public final k85<List<ChatVoiceAssistantMessage>> getChatListResultFlow() {
        return this.chatListResultFlow;
    }

    @aa1
    public final XiOIO queryChatList() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C289741(null), 2, null);
    }
}
