package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.Iii1I;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ar5;
import com.android.mltcode.paycertificationapi.br5;
import com.android.mltcode.paycertificationapi.cr5;
import com.android.mltcode.paycertificationapi.dr5;
import com.android.mltcode.paycertificationapi.er5;
import com.android.mltcode.paycertificationapi.fr5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gr5;
import com.android.mltcode.paycertificationapi.hr5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ir5;
import com.android.mltcode.paycertificationapi.jr5;
import com.android.mltcode.paycertificationapi.kr5;
import com.android.mltcode.paycertificationapi.mp;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yq5;
import com.android.mltcode.paycertificationapi.zq5;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.dto.ChatEndType;
import com.sma.smartv3.dto.ChatShowType;
import com.sma.smartv3.model.AiChatAnswerData;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.SearchOnlineActivity;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nThirdPartyVoiceAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,207:1\n19#2:208\n15#2:209\n*S KotlinDebug\n*F\n+ 1 ThirdPartyVoiceAssistantActivity.kt\ncom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity\n*L\n84#1:208\n84#1:209\n*E\n"})
public final class ThirdPartyVoiceAssistantActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final ChatVoiceAssistantMessage chatMsg;

    @aa1
    private final Lazy chatSendBt$delegate;

    @aa1
    private final ChatWithQWManager chatWithQWManager;

    @aa1
    private final Lazy etContent$delegate;
    private boolean isSending;

    @aa1
    private final Lazy mAdapter$delegate;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private mp mListPop;

    @tb1
    private go0 mPayTipPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;
    private boolean mRecyclerViewAutoRefresh;

    @aa1
    private String mTitle;

    @aa1
    private final Lazy viewKeyboardHeight$delegate;

    @aa1
    private final Lazy viewModel$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$1", f = "ThirdPartyVoiceAssistantActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends ChatVoiceAssistantMessage>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ThirdPartyVoiceAssistantActivity this$0;

        public AnonymousClass1(ThirdPartyVoiceAssistantActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatVoiceAssistantMessage> r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            List<ChatVoiceAssistantMessage> r0 = (List) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L12;
            ResultKt.X1ii(r3);
            if (r0 == null) goto L10;
            ThirdPartyVoiceAssistantActivity r4 = this.this$0;
            ThirdPartyVoiceAssistantActivity.access$getMAdapter(r4).setData(r0);
            if (r0.isEmpty() == true) goto L10;
            ThirdPartyVoiceAssistantActivity.access$getMRecyclerView(r4).smoothScrollToPosition(ThirdPartyVoiceAssistantActivity.access$getMAdapter(r4).getItemCount() - 1);
        L10:
            return Unit.OXO1;
        L12:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ChatVoiceAssistantMessage> r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$2", f = "ThirdPartyVoiceAssistantActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Iii1I, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ThirdPartyVoiceAssistantActivity this$0;

        public AnonymousClass2(ThirdPartyVoiceAssistantActivity r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Iii1I r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            Iii1I r0 = (Iii1I) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            ThirdPartyVoiceAssistantActivity.access$setSending$p(this.this$0, r0 instanceof Iii1I.iO);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Iii1I r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$3, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$3", f = "ThirdPartyVoiceAssistantActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<AiChatAnswerData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ThirdPartyVoiceAssistantActivity this$0;

        public AnonymousClass3(ThirdPartyVoiceAssistantActivity r1, Continuation<? super AnonymousClass3> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass3 r0 = new AnonymousClass3(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AiChatAnswerData r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass3) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            AiChatAnswerData r0 = (AiChatAnswerData) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r11);
            ChatVoiceAssistantMessage r12 = ChatVoiceAssistantMessage.copy$default(ThirdPartyVoiceAssistantActivity.access$getChatMsg$p(this.this$0), 0, r0.getText(), null, null, r0.getEnded(), ChatShowType.TO, 13, null);
            ThirdPartyVoiceAssistantActivity.access$getMAdapter(this.this$0).addOrUpdateStream(r12);
            this.this$0.getViewModel().addChatVoice(r12);
            ThirdPartyVoiceAssistantActivity.access$scrollList(this.this$0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AiChatAnswerData r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public ThirdPartyVoiceAssistantActivity() {
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new yq5(this));
        this.etContent$delegate = LazyKt__LazyJVMKt.iO(new cr5(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new dr5(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new er5(this));
        this.chatSendBt$delegate = LazyKt__LazyJVMKt.iO(new fr5(this));
        this.mAdapter$delegate = LazyKt__LazyJVMKt.iO(new gr5());
        this.mTitle = q62.OXO1.XI();
        this.mRecyclerViewAutoRefresh = true;
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new hr5(this));
        this.viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.iO(new ir5(this));
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new jr5(this));
        this.chatWithQWManager = new ChatWithQWManager();
        this.chatMsg = new ChatVoiceAssistantMessage(0, null, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ void I0iXXO(ThirdPartyVoiceAssistantActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView I1XOi1(ThirdPartyVoiceAssistantActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IIX1OXO(ThirdPartyVoiceAssistantActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(ThirdPartyVoiceAssistantActivity r0, View r1) {
        initListener$lambda$0(r0, r1);
    }

    public static /* synthetic */ ChatVoiceViewModel OIX0iXi(ThirdPartyVoiceAssistantActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ChatVoiceAssistantAdapter OiIIX101O() {
        return mAdapter_delegate$lambda$0();
    }

    public static /* synthetic */ View X0O(ThirdPartyVoiceAssistantActivity r0) {
        return viewKeyboardHeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView X1ii(ThirdPartyVoiceAssistantActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText XX0(ThirdPartyVoiceAssistantActivity r0) {
        return etContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(ThirdPartyVoiceAssistantActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(ThirdPartyVoiceAssistantActivity r0) {
        return onTitleRightClick$lambda$0$0(r0);
    }

    public static /* synthetic */ Button XiOIii1(ThirdPartyVoiceAssistantActivity r0) {
        return chatSendBt_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ ChatVoiceAssistantMessage access$getChatMsg$p(ThirdPartyVoiceAssistantActivity r0) {
        return r0.chatMsg;
    }

    public static final /* synthetic */ ChatVoiceAssistantAdapter access$getMAdapter(ThirdPartyVoiceAssistantActivity r0) {
        return r0.getMAdapter();
    }

    public static final /* synthetic */ RecyclerView access$getMRecyclerView(ThirdPartyVoiceAssistantActivity r0) {
        return r0.getMRecyclerView();
    }

    public static final /* synthetic */ void access$scrollList(ThirdPartyVoiceAssistantActivity r0) {
        r0.scrollList();
    }

    public static final /* synthetic */ void access$setSending$p(ThirdPartyVoiceAssistantActivity r0, boolean r1) {
        r0.isSending = r1;
    }

    private final void addSendTextToAdapter(String r10) {
        ChatVoiceAssistantMessage r11 = ChatVoiceAssistantMessage.copy$default(this.chatMsg, 0, r10, null, null, ChatEndType.Ended.getFlag(), null, 45, null);
        getMAdapter().add(r11);
        getViewModel().addChatVoice(r11);
        getMAdapter().add(ChatVoiceAssistantMessage.copy$default(this.chatMsg, 0, "请稍等...", null, null, ChatEndType.Sending.getFlag(), ChatShowType.TO, 13, null));
        scrollList();
    }

    private static final Button chatSendBt_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (Button) r1.findViewById(R.id.btn_chat_send);
    }

    private final void collectSendState() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getChatListResultFlow(), null, new AnonymousClass1(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, this.chatWithQWManager.I0IIOi(), null, new AnonymousClass2(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, this.chatWithQWManager.XOO0ii0(), null, new AnonymousClass3(this, null), 2, null);
    }

    private static final EditText etContent_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (EditText) r1.findViewById(R.id.et_chat_content);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getChatSendBt() {
        return (Button) getValue();
    }

    private final EditText getEtContent() {
        return (EditText) getValue();
    }

    private final ChatVoiceAssistantAdapter getMAdapter() {
        return (ChatVoiceAssistantAdapter) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final View getViewKeyboardHeight() {
        return (View) getValue();
    }

    public static /* synthetic */ boolean iIiiO(ThirdPartyVoiceAssistantActivity r0, View r1, MotionEvent r2) {
        return touchListener$lambda$0(r0, r1, r2);
    }

    private static final void initListener$lambda$0(ThirdPartyVoiceAssistantActivity r0, View r1) {
        Editable r2 = r0.getEtContent().getText();
        if (r2 == null) goto L6;
        String r3 = r2.toString();
        if (r3 == null) goto L6;
    L7:
        r0.sendMessage(r3);
        return;
    L6:
        r3 = "";
        goto L7
    }

    private static final void initView$lambda$0(ThirdPartyVoiceAssistantActivity r1, View r2) {
        r1.startActivity(new Intent(r1, SearchOnlineActivity.class));
    }

    private static final ChatVoiceAssistantAdapter mAdapter_delegate$lambda$0() {
        return new ChatVoiceAssistantAdapter();
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.thirdPartyChatRv);
    }

    private static final boolean onTitleRightClick$lambda$0$0(ThirdPartyVoiceAssistantActivity r1) {
        r1.getViewModel().deleteAllChatByFunctionType();
        r1.getMAdapter().setData(new ArrayList());
        return true;
    }

    private final void scrollList() {
        if (this.mRecyclerViewAutoRefresh == false) goto L9;
        RecyclerView.ItemAnimator r0 = getMRecyclerView().getItemAnimator();
        if (r0 == null) goto L7;
        r0.endAnimations();
    L7:
        getMRecyclerView().smoothScrollToPosition(getMAdapter().getItemCount() - 1);
        return;
    }

    private final void sendMessage(String r3) {
        if (r3.length() != 0) goto L6;
        return;
    L6:
        if (Intrinsics.XOO0ii0(this.chatWithQWManager.I0IIOi().getValue(), Iii1I.iO.OXO1) == false) goto L8;
        return;
    L8:
        KeyboardUtils.hideSoftInput(this);
        this.mRecyclerViewAutoRefresh = true;
        getEtContent().setText("");
        addSendTextToAdapter(r3);
        this.chatWithQWManager.OIi0(r3);
    }

    private static final boolean touchListener$lambda$0(ThirdPartyVoiceAssistantActivity r1, View r2, MotionEvent r3) {
        if (r3.getAction() != 2) goto L5;
        r1.mRecyclerViewAutoRefresh = false;
    L5:
        return false;
    }

    private static final View viewKeyboardHeight_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return r1.findViewById(R.id.view_keyboard_height);
    }

    private static final ChatVoiceViewModel viewModel_delegate$lambda$0(ThirdPartyVoiceAssistantActivity r1) {
        return (ChatVoiceViewModel) new ViewModelProvider(r1).get(ChatVoiceViewModel.class);
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
        return (ChatVoiceViewModel) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    public final void initListener() {
        getChatSendBt().setOnClickListener(new br5(this));
        getChatSendBt().setEnabled(true);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(this.mTitle);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleOtherRight().setVisibility(8);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_network_settings_icon);
        getAbhTitleOtherRight().setOnClickListener(new ar5(this));
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        com.sma.smartv3.dto.OXO1.C0558OXO1 r1 = com.sma.smartv3.dto.OXO1.I0iXXO;
        if (r1.IiI10X() == true) goto L6;
        getChatSendBt().setEnabled(false);
        ToastUtils.showLong("请先激活使用", new Object[0]);
        return;
    L6:
        SPUtils r3 = a01.OXO1.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r5 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L10;
        r4 = r5;
    L10:
        String r6 = ((AppUser) r4).getDbUrl();
        if (r6 != null) goto L13;
    L16:
        boolean r7 = true;
    L17:
        if (r7 == false) goto L20;
        getChatSendBt().setEnabled(false);
        ToastUtils.showLong("请先登录使用", new Object[0]);
        return;
    L20:
        i1O0OXO1O.OXO1.OXO1("DeviceInfo:" + r1.XIi00iiXO());
        initListener();
        touchListener();
        getMRecyclerView().setAdapter(getMAdapter());
        collectSendState();
        return;
    L13:
        if (r6.length() == 0) goto L16;
        r7 = false;
        goto L17
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_third_party_voice_assistant;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mp r0 = this.mListPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.chatWithQWManager.IO();
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_record_remind);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new kr5(this));
        this.mDeletePopup = r5;
    L5:
        go0 r6 = this.mDeletePopup;
        if (r6 == null) goto L9;
        r6.IIX1OXO();
        return;
    }

    public final void setMRecyclerViewAutoRefresh(boolean r1) {
        this.mRecyclerViewAutoRefresh = r1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMRecyclerView().setOnTouchListener(new zq5(this));
    }
}
