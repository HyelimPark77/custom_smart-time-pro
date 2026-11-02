package com.sma.smartv3.p610ui.device;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2699mp;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.Iii1I;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dto.ChatEndType;
import com.sma.smartv3.dto.ChatShowType;
import com.sma.smartv3.dto.OXO1;
import com.sma.smartv3.model.AiChatAnswerData;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.p610ui.device.ThirdPartyVoiceAssistantActivity;
import com.sma.smartv3.p610ui.p611ai.SearchOnlineActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.ActivityUtilKt;
import com.sma.smartv3.util.ChatWithQWManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nThirdPartyVoiceAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,207:1\n19#2:208\n15#2:209\n*S KotlinDebug\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n*L\n84#1:208\n84#1:209\n*E\n"})
public final class ThirdPartyVoiceAssistantActivity extends BaseActivity {
    private boolean isSending;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private C2699mp mListPop;

    @tb1
    private go0 mPayTipPopup;

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yq5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.mRecyclerView_delegate$lambda$0(this.f12430IO);
        }
    });

    @aa1
    private final Lazy etContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.etContent_delegate$lambda$0(this.f6038IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.abhTitleRight_delegate$lambda$0(this.f6253IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.er5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.abhTitleOtherRight_delegate$lambda$0(this.f6470IO);
        }
    });

    @aa1
    private final Lazy chatSendBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.chatSendBt_delegate$lambda$0(this.f6712IO);
        }
    });

    @aa1
    private final Lazy mAdapter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.mAdapter_delegate$lambda$0();
        }
    });

    @aa1
    private String mTitle = q62.OXO1.m2887XI();
    private boolean mRecyclerViewAutoRefresh = true;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.abhTitleCenter_delegate$lambda$0(this.f7186IO);
        }
    });

    @aa1
    private final Lazy viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ir5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.viewKeyboardHeight_delegate$lambda$0(this.f8744IO);
        }
    });

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jr5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ThirdPartyVoiceAssistantActivity.viewModel_delegate$lambda$0(this.f9028IO);
        }
    });

    @aa1
    private final ChatWithQWManager chatWithQWManager = new ChatWithQWManager();

    @aa1
    private final ChatVoiceAssistantMessage chatMsg = new ChatVoiceAssistantMessage(0, null, null, null, 0, null, 63, null);

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$1", m39466f = "ThirdPartyVoiceAssistantActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C187771 extends SuspendLambda implements Function2<List<? extends ChatVoiceAssistantMessage>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C187771(Continuation<? super C187771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187771 c187771 = ThirdPartyVoiceAssistantActivity.this.new C187771(continuation);
            c187771.L$0 = obj;
            return c187771;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(List<? extends ChatVoiceAssistantMessage> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ChatVoiceAssistantMessage>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<ChatVoiceAssistantMessage> list = (List) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (list != null) {
                ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity = ThirdPartyVoiceAssistantActivity.this;
                thirdPartyVoiceAssistantActivity.getMAdapter().setData(list);
                if (!list.isEmpty()) {
                    thirdPartyVoiceAssistantActivity.getMRecyclerView().smoothScrollToPosition(thirdPartyVoiceAssistantActivity.getMAdapter().getItemCount() - 1);
                }
            }
            return Unit.OXO1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatVoiceAssistantMessage> list, Continuation<? super Unit> continuation) {
            return ((C187771) create(list, continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$2", m39466f = "ThirdPartyVoiceAssistantActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C187782 extends SuspendLambda implements Function2<Iii1I, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C187782(Continuation<? super C187782> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187782 c187782 = ThirdPartyVoiceAssistantActivity.this.new C187782(continuation);
            c187782.L$0 = obj;
            return c187782;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Iii1I iii1I, Continuation<? super Unit> continuation) {
            return ((C187782) create(iii1I, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iii1I iii1I = (Iii1I) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ThirdPartyVoiceAssistantActivity.this.isSending = iii1I instanceof Iii1I.C2166iO;
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$3 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$3", m39466f = "ThirdPartyVoiceAssistantActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C187793 extends SuspendLambda implements Function2<AiChatAnswerData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C187793(Continuation<? super C187793> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187793 c187793 = ThirdPartyVoiceAssistantActivity.this.new C187793(continuation);
            c187793.L$0 = obj;
            return c187793;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AiChatAnswerData aiChatAnswerData, Continuation<? super Unit> continuation) {
            return ((C187793) create(aiChatAnswerData, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AiChatAnswerData aiChatAnswerData = (AiChatAnswerData) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ChatVoiceAssistantMessage chatVoiceAssistantMessageCopy$default = ChatVoiceAssistantMessage.copy$default(ThirdPartyVoiceAssistantActivity.this.chatMsg, 0, aiChatAnswerData.getText(), null, null, aiChatAnswerData.getEnded(), ChatShowType.TO, 13, null);
            ThirdPartyVoiceAssistantActivity.this.getMAdapter().addOrUpdateStream(chatVoiceAssistantMessageCopy$default);
            ThirdPartyVoiceAssistantActivity.this.getViewModel().addChatVoice(chatVoiceAssistantMessageCopy$default);
            ThirdPartyVoiceAssistantActivity.this.scrollList();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (TextView) thirdPartyVoiceAssistantActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (ImageView) thirdPartyVoiceAssistantActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (ImageView) thirdPartyVoiceAssistantActivity.findViewById(R.id.abh_title_right);
    }

    private final void addSendTextToAdapter(String str) {
        ChatVoiceAssistantMessage chatVoiceAssistantMessageCopy$default = ChatVoiceAssistantMessage.copy$default(this.chatMsg, 0, str, null, null, ChatEndType.Ended.getFlag(), null, 45, null);
        getMAdapter().add(chatVoiceAssistantMessageCopy$default);
        getViewModel().addChatVoice(chatVoiceAssistantMessageCopy$default);
        getMAdapter().add(ChatVoiceAssistantMessage.copy$default(this.chatMsg, 0, "请稍等...", null, null, ChatEndType.Sending.getFlag(), ChatShowType.TO, 13, null));
        scrollList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button chatSendBt_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (Button) thirdPartyVoiceAssistantActivity.findViewById(R.id.btn_chat_send);
    }

    private final void collectSendState() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getChatListResultFlow(), null, new C187771(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, this.chatWithQWManager.I0IIOi(), null, new C187782(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, this.chatWithQWManager.XOO0ii0(), null, new C187793(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etContent_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (EditText) thirdPartyVoiceAssistantActivity.findViewById(R.id.et_chat_content);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getChatSendBt() {
        return (Button) this.chatSendBt$delegate.getValue();
    }

    private final EditText getEtContent() {
        return (EditText) this.etContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatVoiceAssistantAdapter getMAdapter() {
        return (ChatVoiceAssistantAdapter) this.mAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final View getViewKeyboardHeight() {
        return (View) this.viewKeyboardHeight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity, View view) {
        String string;
        Editable text = thirdPartyVoiceAssistantActivity.getEtContent().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        thirdPartyVoiceAssistantActivity.sendMessage(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity, View view) {
        thirdPartyVoiceAssistantActivity.startActivity(new Intent(thirdPartyVoiceAssistantActivity, (Class<?>) SearchOnlineActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatVoiceAssistantAdapter mAdapter_delegate$lambda$0() {
        return new ChatVoiceAssistantAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (RecyclerView) thirdPartyVoiceAssistantActivity.findViewById(R.id.thirdPartyChatRv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleRightClick$lambda$0$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        thirdPartyVoiceAssistantActivity.getViewModel().deleteAllChatByFunctionType();
        thirdPartyVoiceAssistantActivity.getMAdapter().setData(new ArrayList());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollList() {
        if (this.mRecyclerViewAutoRefresh) {
            RecyclerView.ItemAnimator itemAnimator = getMRecyclerView().getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            getMRecyclerView().smoothScrollToPosition(getMAdapter().getItemCount() - 1);
        }
    }

    private final void sendMessage(String str) {
        if (str.length() == 0 || Intrinsics.XOO0ii0(this.chatWithQWManager.I0IIOi().getValue(), Iii1I.C2166iO.OXO1)) {
            return;
        }
        KeyboardUtils.hideSoftInput(this);
        this.mRecyclerViewAutoRefresh = true;
        getEtContent().setText("");
        addSendTextToAdapter(str);
        this.chatWithQWManager.OIi0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            thirdPartyVoiceAssistantActivity.mRecyclerViewAutoRefresh = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewKeyboardHeight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return thirdPartyVoiceAssistantActivity.findViewById(R.id.view_keyboard_height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatVoiceViewModel viewModel_delegate$lambda$0(ThirdPartyVoiceAssistantActivity thirdPartyVoiceAssistantActivity) {
        return (ChatVoiceViewModel) new ViewModelProvider(thirdPartyVoiceAssistantActivity).get(ChatVoiceViewModel.class);
    }

    @aa1
    public final ChatWithQWManager getChatWithQWManager() {
        return this.chatWithQWManager;
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
    }

    @aa1
    public final ChatVoiceViewModel getViewModel() {
        return (ChatVoiceViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    public final void initListener() {
        getChatSendBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.br5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyVoiceAssistantActivity.initListener$lambda$0(this.f5799IO, view);
            }
        });
        getChatSendBt().setEnabled(true);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(this.mTitle);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleOtherRight().setVisibility(8);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_network_settings_icon);
        getAbhTitleOtherRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ar5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyVoiceAssistantActivity.initView$lambda$0(this.f5549IO, view);
            }
        });
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        OXO1.C22040OXO1 c22040oxo1 = OXO1.I0iXXO;
        if (!c22040oxo1.IiI10X()) {
            getChatSendBt().setEnabled(false);
            ToastUtils.showLong("请先激活使用", new Object[0]);
            return;
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        String dbUrl = ((AppUser) appUser).getDbUrl();
        if (dbUrl == null || dbUrl.length() == 0) {
            getChatSendBt().setEnabled(false);
            ToastUtils.showLong("请先登录使用", new Object[0]);
            return;
        }
        i1O0OXO1O.OXO1.OXO1("DeviceInfo:" + c22040oxo1.XIi00iiXO());
        initListener();
        touchListener();
        getMRecyclerView().setAdapter(getMAdapter());
        collectSendState();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_third_party_voice_assistant;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2699mp c2699mp = this.mListPop;
        if (c2699mp != null) {
            c2699mp.dismiss();
        }
        this.chatWithQWManager.m38804IO();
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_record_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.kr5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(ThirdPartyVoiceAssistantActivity.onTitleRightClick$lambda$0$0(this.f9263IO));
                }
            });
            this.mDeletePopup = go0Var;
        }
        go0 go0Var2 = this.mDeletePopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void setMRecyclerViewAutoRefresh(boolean z) {
        this.mRecyclerViewAutoRefresh = z;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.zq5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ThirdPartyVoiceAssistantActivity.touchListener$lambda$0(this.f12675IO, view, motionEvent);
            }
        });
    }
}
