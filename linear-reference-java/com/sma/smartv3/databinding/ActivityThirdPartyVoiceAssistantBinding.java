package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityThirdPartyVoiceAssistantBinding implements ViewBinding {

    @NonNull
    public final Button btnChatSend;

    @NonNull
    public final RelativeLayout chatBottom;

    @NonNull
    public final EditText etChatContent;

    @NonNull
    public final ImageView ivChatVoice;

    @NonNull
    public final RelativeLayout rlInput;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView thirdPartyChatRv;

    private ActivityThirdPartyVoiceAssistantBinding(@NonNull LinearLayout rootView, @NonNull Button btnChatSend, @NonNull RelativeLayout chatBottom, @NonNull EditText etChatContent, @NonNull ImageView ivChatVoice, @NonNull RelativeLayout rlInput, @NonNull RecyclerView thirdPartyChatRv) {
        this.rootView = rootView;
        this.btnChatSend = btnChatSend;
        this.chatBottom = chatBottom;
        this.etChatContent = etChatContent;
        this.ivChatVoice = ivChatVoice;
        this.rlInput = rlInput;
        this.thirdPartyChatRv = thirdPartyChatRv;
    }

    @NonNull
    public static ActivityThirdPartyVoiceAssistantBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_chat_send;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_send);
        if (r4 == null) goto L17;
        r0 = R.id.chat_bottom;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.chat_bottom);
        if (r5 == null) goto L17;
        r0 = R.id.et_chat_content;
        EditText r6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_chat_content);
        if (r6 == null) goto L17;
        r0 = R.id.iv_chat_voice;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_chat_voice);
        if (r7 == null) goto L17;
        r0 = R.id.rl_input;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_input);
        if (r8 == null) goto L17;
        r0 = R.id.thirdPartyChatRv;
        RecyclerView r9 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.thirdPartyChatRv);
        if (r9 == null) goto L17;
        return new ActivityThirdPartyVoiceAssistantBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityThirdPartyVoiceAssistantBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityThirdPartyVoiceAssistantBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_third_party_voice_assistant, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
