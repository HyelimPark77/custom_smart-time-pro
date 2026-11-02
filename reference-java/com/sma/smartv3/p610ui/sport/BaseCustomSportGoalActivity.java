package com.sma.smartv3.p610ui.sport;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCustomSportGoalActivity extends BaseActivity {

    @aa1
    private final Lazy abh_title_right$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0010Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseCustomSportGoalActivity.abh_title_right_delegate$lambda$0(this.f3392IO);
        }
    });

    public static final class OXO1 implements TextWatcher {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ EditText f54755I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ boolean f54756IO;

        public OXO1(boolean z, EditText editText) {
            this.f54756IO = z;
            this.f54755I1 = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f54756IO || TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.f54755I1.requestFocus();
        }
    }

    public static final class XIi00iiXO implements View.OnKeyListener {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ EditText f54757I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ EditText f54758IO;
        public final /* synthetic */ EditText iX1O1;

        public XIi00iiXO(EditText editText, EditText editText2, EditText editText3) {
            this.f54758IO = editText;
            this.f54757I1 = editText2;
            this.iX1O1 = editText3;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v, int i, KeyEvent event) {
            Intrinsics.X0O(v, "v");
            Intrinsics.X0O(event, "event");
            if (event.getAction() != 0) {
                return true;
            }
            LogUtils.m11128d("setOnKeyListener   " + i + "  " + event.getAction());
            if (i == 67 && this.f54758IO.getText().toString().length() == 0) {
                this.f54757I1.requestFocus();
                this.f54757I1.getText().clear();
                return true;
            }
            if (i == 67 || this.f54758IO.getText().toString().length() <= 0) {
                return false;
            }
            this.iX1O1.requestFocus();
            this.iX1O1.onKeyDown(i, event);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abh_title_right_delegate$lambda$0(BaseCustomSportGoalActivity baseCustomSportGoalActivity) {
        return (ImageView) baseCustomSportGoalActivity.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ View.OnKeyListener setKeyListener$default(BaseCustomSportGoalActivity baseCustomSportGoalActivity, EditText editText, EditText editText2, EditText editText3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setKeyListener");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return baseCustomSportGoalActivity.setKeyListener(editText, editText2, editText3, z);
    }

    public final ImageView getAbh_title_right() {
        return (ImageView) this.abh_title_right$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbh_title_right().setVisibility(0);
        getAbh_title_right().setImageResource(R.drawable.selector_save_image);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ToastUtils.showLong("onTitleRightClick", new Object[0]);
    }

    @aa1
    public final View.OnKeyListener setKeyListener(@aa1 EditText leftEdit, @aa1 EditText middleEdit, @aa1 EditText rightEdit, boolean z) {
        Intrinsics.X0O(leftEdit, "leftEdit");
        Intrinsics.X0O(middleEdit, "middleEdit");
        Intrinsics.X0O(rightEdit, "rightEdit");
        middleEdit.addTextChangedListener(new OXO1(z, rightEdit));
        return new XIi00iiXO(middleEdit, leftEdit, rightEdit);
    }
}
