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
        int i = R.id.datePicker;
        DatePicker datePicker = (DatePicker) ViewBindings.findChildViewById(rootView, R.id.datePicker);
        if (datePicker != null) {
            i = R.id.edtNickname;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.edtNickname);
            if (textInputEditText != null) {
                i = R.id.heightPicker;
                HeightPicker heightPicker = (HeightPicker) ViewBindings.findChildViewById(rootView, R.id.heightPicker);
                if (heightPicker != null) {
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.info_next);
                    i = R.id.iv_avatar;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                    if (imageViewRound != null) {
                        i = R.id.llBirthdayAndUnit;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llBirthdayAndUnit);
                        if (relativeLayout != null) {
                            i = R.id.llHeightAndWeight;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llHeightAndWeight);
                            if (relativeLayout2 != null) {
                                i = R.id.llNameAndGender;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llNameAndGender);
                                if (relativeLayout3 != null) {
                                    i = R.id.nickNameLine;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.nickNameLine);
                                    if (viewFindChildViewById != null) {
                                        i = R.id.rbFemale;
                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbFemale);
                                        if (radioButton != null) {
                                            i = R.id.rbImperial;
                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbImperial);
                                            if (radioButton2 != null) {
                                                i = R.id.rbMale;
                                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbMale);
                                                if (radioButton3 != null) {
                                                    i = R.id.rbMetric;
                                                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbMetric);
                                                    if (radioButton4 != null) {
                                                        LinearLayout linearLayout = (LinearLayout) rootView;
                                                        i = R.id.weightPicker;
                                                        WeightPicker weightPicker = (WeightPicker) ViewBindings.findChildViewById(rootView, R.id.weightPicker);
                                                        if (weightPicker != null) {
                                                            return new ActivityPersonalInfoBinding(linearLayout, datePicker, textInputEditText, heightPicker, button, imageViewRound, relativeLayout, relativeLayout2, relativeLayout3, viewFindChildViewById, radioButton, radioButton2, radioButton3, radioButton4, linearLayout, weightPicker);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPersonalInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPersonalInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_personal_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
