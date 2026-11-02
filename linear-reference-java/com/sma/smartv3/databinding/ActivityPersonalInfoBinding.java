package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.picker.DatePicker;
import com.sma.smartv3.view.picker.HeightPicker;
import com.sma.smartv3.view.picker.WeightPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityPersonalInfoBinding implements ViewBinding {

    @NonNull
    public final DatePicker datePicker;

    @NonNull
    public final TextInputEditText edtNickname;

    @NonNull
    public final HeightPicker heightPicker;

    @Nullable
    public final Button infoNext;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final RelativeLayout llBirthdayAndUnit;

    @NonNull
    public final RelativeLayout llHeightAndWeight;

    @NonNull
    public final RelativeLayout llNameAndGender;

    @NonNull
    public final View nickNameLine;

    @NonNull
    public final RadioButton rbFemale;

    @NonNull
    public final RadioButton rbImperial;

    @NonNull
    public final RadioButton rbMale;

    @NonNull
    public final RadioButton rbMetric;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final WeightPicker weightPicker;

    private ActivityPersonalInfoBinding(@NonNull LinearLayout rootView_, @NonNull DatePicker datePicker, @NonNull TextInputEditText edtNickname, @NonNull HeightPicker heightPicker, @Nullable Button infoNext, @NonNull ImageViewRound ivAvatar, @NonNull RelativeLayout llBirthdayAndUnit, @NonNull RelativeLayout llHeightAndWeight, @NonNull RelativeLayout llNameAndGender, @NonNull View nickNameLine, @NonNull RadioButton rbFemale, @NonNull RadioButton rbImperial, @NonNull RadioButton rbMale, @NonNull RadioButton rbMetric, @NonNull LinearLayout rootView, @NonNull WeightPicker weightPicker) {
        this.rootView_ = rootView_;
        this.datePicker = datePicker;
        this.edtNickname = edtNickname;
        this.heightPicker = heightPicker;
        this.infoNext = infoNext;
        this.ivAvatar = ivAvatar;
        this.llBirthdayAndUnit = llBirthdayAndUnit;
        this.llHeightAndWeight = llHeightAndWeight;
        this.llNameAndGender = llNameAndGender;
        this.nickNameLine = nickNameLine;
        this.rbFemale = rbFemale;
        this.rbImperial = rbImperial;
        this.rbMale = rbMale;
        this.rbMetric = rbMetric;
        this.rootView = rootView;
        this.weightPicker = weightPicker;
    }

    @NonNull
    public static ActivityPersonalInfoBinding bind(@NonNull View rootView) {
        int r1 = R.id.datePicker;
        DatePicker r5 = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.datePicker);
        if (r5 == null) goto L31;
        r1 = R.id.edtNickname;
        TextInputEditText r6 = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.edtNickname);
        if (r6 == null) goto L31;
        r1 = R.id.heightPicker;
        HeightPicker r7 = (HeightPicker) ViewBindings.findChildViewById(rootView, R.id.heightPicker);
        if (r7 == null) goto L31;
        Button r8 = (Button) ViewBindings.findChildViewById(rootView, R.id.info_next);
        r1 = R.id.iv_avatar;
        ImageViewRound r9 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r9 == null) goto L31;
        r1 = R.id.llBirthdayAndUnit;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llBirthdayAndUnit);
        if (r10 == null) goto L31;
        r1 = R.id.llHeightAndWeight;
        RelativeLayout r11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llHeightAndWeight);
        if (r11 == null) goto L31;
        r1 = R.id.llNameAndGender;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llNameAndGender);
        if (r12 == null) goto L31;
        r1 = R.id.nickNameLine;
        View r13 = ViewBindings.findChildViewById(rootView, R.id.nickNameLine);
        if (r13 == null) goto L31;
        r1 = R.id.rbFemale;
        RadioButton r14 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbFemale);
        if (r14 == null) goto L31;
        r1 = R.id.rbImperial;
        RadioButton r15 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbImperial);
        if (r15 == null) goto L31;
        r1 = R.id.rbMale;
        RadioButton r16 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbMale);
        if (r16 == null) goto L31;
        r1 = R.id.rbMetric;
        RadioButton r17 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbMetric);
        if (r17 == null) goto L31;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.weightPicker;
        WeightPicker r19 = (WeightPicker) ViewBindings.findChildViewById(rootView, R.id.weightPicker);
        if (r19 == null) goto L31;
        return new ActivityPersonalInfoBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r4, r19);
    L31:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityPersonalInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityPersonalInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_personal_info, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
