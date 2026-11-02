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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiChatBinding implements ViewBinding {

    @NonNull
    public final ImageView abhTitleOtherRight;

    @NonNull
    public final ImageView abhTitleRight;

    @NonNull
    public final PFMedium aiChatOpenDeductionConfigTv;

    @NonNull
    public final Button btnChatAudio;

    @NonNull
    public final Button btnChatSend;

    @NonNull
    public final RelativeLayout chatBottom;

    @NonNull
    public final EditText etChatContent;

    @NonNull
    public final ImageView ivChatVoice;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final RelativeLayout rlInput;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View viewKeyboardHeight;

    private ActivityAiChatBinding(@NonNull LinearLayout rootView, @NonNull ImageView abhTitleOtherRight, @NonNull ImageView abhTitleRight, @NonNull PFMedium aiChatOpenDeductionConfigTv, @NonNull Button btnChatAudio, @NonNull Button btnChatSend, @NonNull RelativeLayout chatBottom, @NonNull EditText etChatContent, @NonNull ImageView ivChatVoice, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout rlInput, @NonNull View viewKeyboardHeight) {
        this.rootView = rootView;
        this.abhTitleOtherRight = abhTitleOtherRight;
        this.abhTitleRight = abhTitleRight;
        this.aiChatOpenDeductionConfigTv = aiChatOpenDeductionConfigTv;
        this.btnChatAudio = btnChatAudio;
        this.btnChatSend = btnChatSend;
        this.chatBottom = chatBottom;
        this.etChatContent = etChatContent;
        this.ivChatVoice = ivChatVoice;
        this.recyclerView = recyclerView;
        this.rlInput = rlInput;
        this.viewKeyboardHeight = viewKeyboardHeight;
    }

    @NonNull
    public static ActivityAiChatBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_title_other_right;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_other_right);
        if (r4 == null) goto L27;
        r0 = R.id.abh_title_right;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
        if (r5 == null) goto L27;
        r0 = R.id.ai_chat_open_deduction_config_tv;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_chat_open_deduction_config_tv);
        if (r6 == null) goto L27;
        r0 = R.id.btn_chat_audio;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_audio);
        if (r7 == null) goto L27;
        r0 = R.id.btn_chat_send;
        Button r8 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_send);
        if (r8 == null) goto L27;
        r0 = R.id.chat_bottom;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.chat_bottom);
        if (r9 == null) goto L27;
        r0 = R.id.et_chat_content;
        EditText r10 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_chat_content);
        if (r10 == null) goto L27;
        r0 = R.id.iv_chat_voice;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_chat_voice);
        if (r11 == null) goto L27;
        r0 = R.id.recycler_view;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (r12 == null) goto L27;
        r0 = R.id.rl_input;
        RelativeLayout r13 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_input);
        if (r13 == null) goto L27;
        r0 = R.id.view_keyboard_height;
        View r14 = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
        if (r14 == null) goto L27;
        return new ActivityAiChatBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_chat, parent, false);
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
