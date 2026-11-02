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
public final class ActivityVoiceBinding implements ViewBinding {

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

    private ActivityVoiceBinding(@NonNull LinearLayout rootView, @NonNull Button btnChatSend, @NonNull RelativeLayout chatBottom, @NonNull EditText etChatContent, @NonNull ImageView ivChatVoice, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout rlInput, @NonNull View viewKeyboardHeight) {
        this.rootView = rootView;
        this.btnChatSend = btnChatSend;
        this.chatBottom = chatBottom;
        this.etChatContent = etChatContent;
        this.ivChatVoice = ivChatVoice;
        this.recyclerView = recyclerView;
        this.rlInput = rlInput;
        this.viewKeyboardHeight = viewKeyboardHeight;
    }

    @NonNull
    public static ActivityVoiceBinding bind(@NonNull View rootView) {
        int i = R.id.btn_chat_send;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_chat_send);
        if (button != null) {
            i = R.id.chat_bottom;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.chat_bottom);
            if (relativeLayout != null) {
                i = R.id.et_chat_content;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_chat_content);
                if (editText != null) {
                    i = R.id.iv_chat_voice;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_chat_voice);
                    if (imageView != null) {
                        i = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
                        if (recyclerView != null) {
                            i = R.id.rl_input;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_input);
                            if (relativeLayout2 != null) {
                                i = R.id.view_keyboard_height;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_keyboard_height);
                                if (viewFindChildViewById != null) {
                                    return new ActivityVoiceBinding((LinearLayout) rootView, button, relativeLayout, editText, imageView, recyclerView, relativeLayout2, viewFindChildViewById);
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
    public static ActivityVoiceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityVoiceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_voice, parent, false);
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
