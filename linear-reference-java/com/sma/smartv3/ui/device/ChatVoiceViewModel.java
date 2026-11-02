package com.sma.smartv3.ui.device;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IIiX01100;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ty0;
import com.baidu.platform.comapi.map.MapController;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
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
    private final IIiX01100 repository;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$addChatVoice$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$addChatVoice$1", f = "ChatVoiceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatVoiceAssistantMessage $item;
        int label;
        final /* synthetic */ ChatVoiceViewModel this$0;

        public AnonymousClass1(ChatVoiceAssistantMessage r1, ChatVoiceViewModel r2, Continuation<? super AnonymousClass1> r3) {
            this.$item = r1;
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$item, this.this$0, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            pb.I0iXXO();
            if (this.label != 0) goto L10;
            ResultKt.X1ii(r6);
            ChatVoiceAssistantMessage r7 = this.$item;
            ChatVoiceViewModel r0 = this.this$0;
            i1O0OXO1O r1 = i1O0OXO1O.OXO1;
            r1.OXO1("AddChatVoice:" + r7 + " isEnded:" + r7.isEnded());
            if (r7.isEnded() == false) goto L8;
            r1.XO0O10("AddChatVoice Result:" + ChatVoiceViewModel.access$getRepository$p(r0).OXO1(r7));
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$deleteAllChatByFunctionType$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$deleteAllChatByFunctionType$1", f = "ChatVoiceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34401 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChatVoiceViewModel this$0;

        public C34401(ChatVoiceViewModel r1, Continuation<? super C34401> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34401(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34401) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r2);
            ChatVoiceViewModel.access$getRepository$p(this.this$0).XIi00iiXO();
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceViewModel$queryChatList$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ChatVoiceViewModel$queryChatList$1", f = "ChatVoiceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34411 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChatVoiceViewModel this$0;

        public C34411(ChatVoiceViewModel r1, Continuation<? super C34411> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34411(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34411) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            List r4 = IIiX01100.XO0O10(ChatVoiceViewModel.access$getRepository$p(this.this$0), null, 1, null);
            ChatVoiceViewModel.access$get_chatListResultFlow$p(this.this$0).setValue(r4);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public ChatVoiceViewModel() {
        this.repository = new IIiX01100();
        ty0<List<ChatVoiceAssistantMessage>> r0 = l85.OXO1(null);
        this._chatListResultFlow = r0;
        this.chatListResultFlow = iX0XiO.XXI(r0);
        queryChatList();
    }

    public static final /* synthetic */ IIiX01100 access$getRepository$p(ChatVoiceViewModel r0) {
        return r0.repository;
    }

    public static final /* synthetic */ ty0 access$get_chatListResultFlow$p(ChatVoiceViewModel r0) {
        return r0._chatListResultFlow;
    }

    @aa1
    public final XiOIO addChatVoice(@aa1 ChatVoiceAssistantMessage r8) {
        Intrinsics.X0O(r8, MapController.ITEM_LAYER_TAG);
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(r8, this, null), 2, null);
    }

    @aa1
    public final XiOIO deleteAllChatByFunctionType() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34401(this, null), 2, null);
    }

    @aa1
    public final k85<List<ChatVoiceAssistantMessage>> getChatListResultFlow() {
        return this.chatListResultFlow;
    }

    @aa1
    public final XiOIO queryChatList() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34411(this, null), 2, null);
    }
}
