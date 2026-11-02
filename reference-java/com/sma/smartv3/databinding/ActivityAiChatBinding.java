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
        int i = R.id.abh_title_other_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_other_right);
        if (imageView != null) {
            i = R.id.abh_title_right;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.abh_title_right);
            if (imageView2 != null) {
                i = R.id.ai_chat_open_deduction_config_tv;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_chat_open_deduction_config_tv);
                if (pFMedium != null) {
                    i = R.id.btn_chat_audio;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_audio);
                    if (button != null) {
                        i = R.id.btn_chat_send;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_send);
                        if (button2 != null) {
                            i = R.id.chat_bottom;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.chat_bottom);
                            if (relativeLayout != null) {
                                i = R.id.et_chat_content;
                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_chat_content);
                                if (editText != null) {
                                    i = R.id.iv_chat_voice;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_chat_voice);
                                    if (imageView3 != null) {
                                        i = R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
                                        if (recyclerView != null) {
                                            i = R.id.rl_input;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_input);
                                            if (relativeLayout2 != null) {
                                                i = R.id.view_keyboard_height;
                                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
                                                if (viewFindChildViewById != null) {
                                                    return new ActivityAiChatBinding((LinearLayout) rootView, imageView, imageView2, pFMedium, button, button2, relativeLayout, editText, imageView3, recyclerView, relativeLayout2, viewFindChildViewById);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_chat, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
