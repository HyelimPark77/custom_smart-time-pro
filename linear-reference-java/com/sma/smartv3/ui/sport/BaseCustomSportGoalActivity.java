package com.sma.smartv3.ui.sport;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.OX0010Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCustomSportGoalActivity extends BaseActivity {

    @aa1
    private final Lazy abh_title_right$delegate;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ EditText I1;
        public final /* synthetic */ boolean IO;

        public OXO1(boolean r1, EditText r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r1) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
            if (this.IO == true) goto L5;
            return;
        L5:
            if (TextUtils.isEmpty(r1) == true) goto L9;
            this.I1.requestFocus();
            return;
        }
    }

    public static final class XIi00iiXO implements View.OnKeyListener {
        public final /* synthetic */ EditText I1;
        public final /* synthetic */ EditText IO;
        public final /* synthetic */ EditText iX1O1;

        public XIi00iiXO(EditText r1, EditText r2, EditText r3) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View r4, int r5, KeyEvent r6) {
            Intrinsics.X0O(r4, "v");
            Intrinsics.X0O(r6, NotificationCompat.CATEGORY_EVENT);
            if (r6.getAction() != 0) goto L16;
            LogUtils.d(new Object[]{"setOnKeyListener   " + r5 + "  " + r6.getAction()});
            if (r5 == 67) goto L7;
        L10:
            if (r5 != 67) goto L12;
            return false;
        L12:
            if (this.IO.getText().toString().length() <= 0) goto L18;
            this.iX1O1.requestFocus();
            this.iX1O1.onKeyDown(r5, r6);
            return false;
        L18:
            return false;
        L7:
            if (this.IO.getText().toString().length() != 0) goto L10;
            this.I1.requestFocus();
            this.I1.getText().clear();
            return true;
        L16:
            return true;
        }
    }

    public BaseCustomSportGoalActivity() {
        this.abh_title_right$delegate = LazyKt__LazyJVMKt.iO(new OX0010Xi(this));
    }

    public static /* synthetic */ ImageView OIX0iXi(BaseCustomSportGoalActivity r0) {
        return abh_title_right_delegate$lambda$0(r0);
    }

    private static final ImageView abh_title_right_delegate$lambda$0(BaseCustomSportGoalActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ View.OnKeyListener setKeyListener$default(BaseCustomSportGoalActivity r0, EditText r1, EditText r2, EditText r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 8) == 0) goto L7;
        r4 = true;
    L7:
        return r0.setKeyListener(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setKeyListener");
    }

    public final ImageView getAbh_title_right() {
        return (ImageView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbh_title_right().setVisibility(0);
        getAbh_title_right().setImageResource(R.drawable.selector_save_image);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ToastUtils.showLong("onTitleRightClick", new Object[0]);
    }

    @aa1
    public final View.OnKeyListener setKeyListener(@aa1 EditText r2, @aa1 EditText r3, @aa1 EditText r4, boolean r5) {
        Intrinsics.X0O(r2, "leftEdit");
        Intrinsics.X0O(r3, "middleEdit");
        Intrinsics.X0O(r4, "rightEdit");
        r3.addTextChangedListener(new OXO1(r5, r4));
        return new XIi00iiXO(r3, r2, r4);
    }
}
