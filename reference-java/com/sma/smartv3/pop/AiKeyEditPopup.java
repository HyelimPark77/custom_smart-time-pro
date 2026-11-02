package com.sma.smartv3.pop;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pop.AiKeyEditPopup;
import com.sma.smartv3.pro.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AiKeyEditPopup extends DialogFragment {

    @tb1
    private EditText edt;

    @tb1
    private FrameLayout mLayout;

    @tb1
    private Function1<? super String, Boolean> mListener;

    @tb1
    private FrameLayout mRoot;
    private int mTitle;

    @aa1
    private String mTitleText = "";

    @tb1
    private TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: private */
    public final void inputComplete() {
        String string;
        Editable text;
        Function1<? super String, Boolean> function1 = this.mListener;
        if (function1 != null) {
            Intrinsics.XXI(function1);
            EditText editText = this.edt;
            if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            if (!function1.invoke2(string).booleanValue()) {
                return;
            }
        }
        EditText editText2 = this.edt;
        if (editText2 != null) {
            editText2.setText((CharSequence) null);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateView$lambda$2(AiKeyEditPopup aiKeyEditPopup, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        aiKeyEditPopup.inputComplete();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$5$0(AiKeyEditPopup aiKeyEditPopup, View view) {
        FragmentActivity activity = aiKeyEditPopup.getActivity();
        if (activity != null) {
            X1OOO.i010I(activity, i72.OXO1.XXX11i());
        }
    }

    @tb1
    public final EditText getEdt() {
        return this.edt;
    }

    @tb1
    public final FrameLayout getMLayout() {
        return this.mLayout;
    }

    @tb1
    public final Function1<String, Boolean> getMListener() {
        return this.mListener;
    }

    @tb1
    public final FrameLayout getMRoot() {
        return this.mRoot;
    }

    public final int getMTitle() {
        return this.mTitle;
    }

    @aa1
    public final String getMTitleText() {
        return this.mTitleText;
    }

    @tb1
    public final TextView getTvTitle() {
        return this.tvTitle;
    }

    @Override // androidx.fragment.app.Fragment
    @aa1
    public View onCreateView(@aa1 LayoutInflater inflater, @tb1 ViewGroup viewGroup, @tb1 Bundle bundle) {
        TextView textView;
        View viewFindViewById;
        View viewFindViewById2;
        Intrinsics.X0O(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.mRoot = frameLayout;
        frameLayout.setBackgroundResource(R.color.popup_root_bg_color);
        this.mLayout = new FrameLayout(requireActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        FrameLayout frameLayout2 = this.mRoot;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.mLayout, layoutParams);
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.II0X1i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f1530IO.dismiss();
                }
            });
            FrameLayout frameLayout3 = this.mLayout;
            if (frameLayout3 != null) {
                frameLayout3.setClickable(true);
            }
        }
        LayoutInflater.from(requireActivity()).inflate(R.layout.pop_aikey_edit, this.mLayout);
        FrameLayout frameLayout4 = this.mLayout;
        TextView textView2 = frameLayout4 != null ? (TextView) frameLayout4.findViewById(R.id.tv_title) : null;
        this.tvTitle = textView2;
        if (textView2 != null) {
            textView2.setText(R.string.ai_key_set);
        }
        FrameLayout frameLayout5 = this.mLayout;
        EditText editText = frameLayout5 != null ? (EditText) frameLayout5.findViewById(R.id.edt) : null;
        this.edt = editText;
        if (editText != null) {
            editText.setHint(R.string.ai_key_input_tip);
        }
        EditText editText2 = this.edt;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.android.mltcode.paycertificationapi.XO1OIO
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                    return AiKeyEditPopup.onCreateView$lambda$2(this.f4731IO, textView3, i, keyEvent);
                }
            });
        }
        FrameLayout frameLayout6 = this.mLayout;
        if (frameLayout6 != null && (viewFindViewById2 = frameLayout6.findViewById(R.id.action1)) != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i1111i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7535IO.dismiss();
                }
            });
        }
        FrameLayout frameLayout7 = this.mLayout;
        if (frameLayout7 != null && (viewFindViewById = frameLayout7.findViewById(R.id.action2)) != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1ii0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2857IO.inputComplete();
                }
            });
        }
        FrameLayout frameLayout8 = this.mLayout;
        if (frameLayout8 != null && (textView = (TextView) frameLayout8.findViewById(R.id.tv_right_top)) != null) {
            textView.setText(R.string.help);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X00001X0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiKeyEditPopup.onCreateView$lambda$5$0(this.f3844IO, view);
                }
            });
        }
        FrameLayout frameLayout9 = this.mRoot;
        Intrinsics.XXI(frameLayout9);
        return frameLayout9;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setLayout(-1, -1);
        FrameLayout frameLayout = this.mLayout;
        if (frameLayout != null) {
            frameLayout.startAnimation(AnimationUtils.loadAnimation(requireActivity(), R.anim.pop_bottom_show_2));
        }
    }

    public final void setEdt(@tb1 EditText editText) {
        this.edt = editText;
    }

    public final void setMLayout(@tb1 FrameLayout frameLayout) {
        this.mLayout = frameLayout;
    }

    public final void setMListener(@tb1 Function1<? super String, Boolean> function1) {
        this.mListener = function1;
    }

    public final void setMRoot(@tb1 FrameLayout frameLayout) {
        this.mRoot = frameLayout;
    }

    public final void setMTitle(int i) {
        this.mTitle = i;
    }

    public final void setMTitleText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitleText = str;
    }

    public final void setTvTitle(@tb1 TextView textView) {
        this.tvTitle = textView;
    }

    public final void show(@aa1 AppCompatActivity activity) {
        Intrinsics.X0O(activity, "activity");
        show(activity.getSupportFragmentManager(), "showAiKeyPopup");
    }
}
