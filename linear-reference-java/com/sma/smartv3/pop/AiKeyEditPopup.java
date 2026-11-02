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
import com.android.mltcode.paycertificationapi.II0X1i;
import com.android.mltcode.paycertificationapi.O1ii0;
import com.android.mltcode.paycertificationapi.X00001X0;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XO1OIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1111i;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
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
    private String mTitleText;

    @tb1
    private TextView tvTitle;

    public AiKeyEditPopup() {
        this.mTitleText = "";
    }

    public static /* synthetic */ boolean IiI10X(AiKeyEditPopup r0, TextView r1, int r2, KeyEvent r3) {
        return onCreateView$lambda$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ void O00(AiKeyEditPopup r0, View r1) {
        onCreateView$lambda$5$0(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(AiKeyEditPopup r0, View r1) {
        onCreateView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ void XO0O10(AiKeyEditPopup r0, View r1) {
        onCreateView$lambda$3(r0, r1);
    }

    public static /* synthetic */ void iO(AiKeyEditPopup r0, View r1) {
        onCreateView$lambda$4(r0, r1);
    }

    private final void inputComplete() {
        Function1<? super String, Boolean> r0 = this.mListener;
        if (r0 == null) goto L15;
        Intrinsics.XXI(r0);
        EditText r1 = this.edt;
        if (r1 == null) goto L10;
        Editable r2 = r1.getText();
        if (r2 == null) goto L10;
        String r3 = r2.toString();
        if (r3 == null) goto L10;
    L12:
        if (r0.invoke(r3).booleanValue() == true) goto L15;
        return;
    L10:
        r3 = "";
    L15:
        EditText r4 = this.edt;
        if (r4 == null) goto L18;
        r4.setText(null);
    L18:
        dismiss();
    }

    private static final void onCreateView$lambda$1$0(AiKeyEditPopup r0, View r1) {
        r0.dismiss();
    }

    private static final boolean onCreateView$lambda$2(AiKeyEditPopup r0, TextView r1, int r2, KeyEvent r3) {
        if (r2 != 6) goto L7;
        r0.inputComplete();
        return false;
    L7:
        return false;
    }

    private static final void onCreateView$lambda$3(AiKeyEditPopup r0, View r1) {
        r0.dismiss();
    }

    private static final void onCreateView$lambda$4(AiKeyEditPopup r0, View r1) {
        r0.inputComplete();
    }

    private static final void onCreateView$lambda$5$0(AiKeyEditPopup r0, View r1) {
        FragmentActivity r2 = r0.getActivity();
        if (r2 == null) goto L6;
        X1OOO.i010I(r2, i72.OXO1.XXX11i());
        return;
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
    public View onCreateView(@aa1 LayoutInflater r1, @tb1 ViewGroup r2, @tb1 Bundle r3) {
        Intrinsics.X0O(r1, "inflater");
        FrameLayout r4 = new FrameLayout(requireActivity());
        this.mRoot = r4;
        r4.setBackgroundResource(R.color.popup_root_bg_color);
        this.mLayout = new FrameLayout(requireActivity());
        FrameLayout.LayoutParams r5 = new FrameLayout.LayoutParams(-1, -2);
        r5.gravity = 80;
        FrameLayout r6 = this.mRoot;
        if (r6 == null) goto L7;
        r6.addView(this.mLayout, r5);
        r6.setOnClickListener(new II0X1i(this));
        FrameLayout r7 = this.mLayout;
        if (r7 == null) goto L7;
        r7.setClickable(true);
    L7:
        LayoutInflater.from(requireActivity()).inflate(R.layout.pop_aikey_edit, this.mLayout);
        FrameLayout r8 = this.mLayout;
        EditText r9 = null;
        if (r8 == null) goto L10;
        TextView r10 = (TextView) r8.findViewById(R.id.tv_title);
    L11:
        this.tvTitle = r10;
        if (r10 == null) goto L14;
        r10.setText(R.string.ai_key_set);
    L14:
        FrameLayout r11 = this.mLayout;
        if (r11 == null) goto L17;
        r9 = (EditText) r11.findViewById(R.id.edt);
    L17:
        this.edt = r9;
        if (r9 == null) goto L20;
        r9.setHint(R.string.ai_key_input_tip);
    L20:
        EditText r12 = this.edt;
        if (r12 == null) goto L23;
        r12.setOnEditorActionListener(new XO1OIO(this));
    L23:
        FrameLayout r13 = this.mLayout;
        if (r13 == null) goto L28;
        View r14 = r13.findViewById(R.id.action1);
        if (r14 == null) goto L28;
        r14.setOnClickListener(new i1111i(this));
    L28:
        FrameLayout r15 = this.mLayout;
        if (r15 == null) goto L33;
        View r16 = r15.findViewById(R.id.action2);
        if (r16 == null) goto L33;
        r16.setOnClickListener(new O1ii0(this));
    L33:
        FrameLayout r17 = this.mLayout;
        if (r17 == null) goto L38;
        TextView r18 = (TextView) r17.findViewById(R.id.tv_right_top);
        if (r18 == null) goto L38;
        r18.setText(R.string.help);
        r18.setOnClickListener(new X00001X0(this));
    L38:
        FrameLayout r19 = this.mRoot;
        Intrinsics.XXI(r19);
        return r19;
    L10:
        r10 = null;
        goto L11
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog r0 = getDialog();
        if (r0 == null) goto L10;
        Window r1 = r0.getWindow();
        if (r1 == null) goto L11;
        r1.setBackgroundDrawableResource(android.R.color.transparent);
        r1.setLayout(-1, -1);
        FrameLayout r2 = this.mLayout;
        if (r2 == null) goto L12;
        r2.startAnimation(AnimationUtils.loadAnimation(requireActivity(), R.anim.pop_bottom_show_2));
        return;
    L12:
        return;
    L11:
        return;
    }

    public final void setEdt(@tb1 EditText r1) {
        this.edt = r1;
    }

    public final void setMLayout(@tb1 FrameLayout r1) {
        this.mLayout = r1;
    }

    public final void setMListener(@tb1 Function1<? super String, Boolean> r1) {
        this.mListener = r1;
    }

    public final void setMRoot(@tb1 FrameLayout r1) {
        this.mRoot = r1;
    }

    public final void setMTitle(int r1) {
        this.mTitle = r1;
    }

    public final void setMTitleText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitleText = r2;
    }

    public final void setTvTitle(@tb1 TextView r1) {
        this.tvTitle = r1;
    }

    public final void show(@aa1 AppCompatActivity r2) {
        Intrinsics.X0O(r2, "activity");
        show(r2.getSupportFragmentManager(), "showAiKeyPopup");
    }
}
