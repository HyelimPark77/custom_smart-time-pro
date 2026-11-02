package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I0XIOI11X;
import com.android.mltcode.paycertificationapi.I0iO0;
import com.android.mltcode.paycertificationapi.O01iXi;
import com.android.mltcode.paycertificationapi.Oi100iii;
import com.android.mltcode.paycertificationapi.XIIXXXOO;
import com.android.mltcode.paycertificationapi.XIO0O11;
import com.android.mltcode.paycertificationapi.XXIXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0Oii0OI;
import com.android.mltcode.paycertificationapi.iOIO0iIIO;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontEditText;
import com.sma.smartv3.view.text.FontTextView;
import com.szabh.smable3.entity.BleCoaching;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,134:1\n18#2,2:135\n15#2:137\n18#2,2:138\n15#2:140\n11#2,2:172\n55#3,12:141\n84#3,3:153\n55#3,12:156\n84#3,3:168\n1#4:171\n1#4:179\n140#5,5:174\n145#5,5:180\n*S KotlinDebug\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n*L\n45#1:135,2\n45#1:137\n46#1:138,2\n46#1:140\n103#1:172,2\n66#1:141,12\n66#1:153,3\n67#1:156,12\n67#1:168,3\n132#1:179\n132#1:174,5\n132#1:180,5\n*E\n"})
public final class CoachingEditActivity extends BaseActivity {

    @aa1
    private final Lazy btnBottom$delegate;

    @aa1
    private final Lazy edtDescription$delegate;

    @aa1
    private final Lazy edtName$delegate;

    @aa1
    private final BleCoaching mCoaching;

    @aa1
    private final Function1<Editable, Unit> mDescriptionTextWatcher;

    @tb1
    private go0 mDiscardChangesPopup;

    @aa1
    private final BleCoaching mOriginCoaching;

    @tb1
    private qv1 mRepeatPopup;

    @aa1
    private final Function1<Editable, Unit> mTitleTextWatcher;

    @aa1
    private final Lazy titleRight$delegate;

    @aa1
    private final Lazy tvRepeat$delegate;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ Function1 IO;

        public OXO1(Function1 r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            invoke(r2);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ Function1 IO;

        public XIi00iiXO(Function1 r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            invoke(r2);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public CoachingEditActivity() {
        this.titleRight$delegate = LazyKt__LazyJVMKt.iO(new I0XIOI11X(this));
        this.edtName$delegate = LazyKt__LazyJVMKt.iO(new I0iO0(this));
        this.tvRepeat$delegate = LazyKt__LazyJVMKt.iO(new iOIO0iIIO(this));
        this.edtDescription$delegate = LazyKt__LazyJVMKt.iO(new XIIXXXOO(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new O01iXi(this));
        this.mTitleTextWatcher = new i0Oii0OI(this);
        this.mDescriptionTextWatcher = new Oi100iii(this);
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.XO0O10();
        Object r2 = new Gson().fromJson(r1.getString(BleCoaching.class.getName()), BleCoaching.class);
        if (r2 != null) goto L5;
        r2 = BleCoaching.class.newInstance();
    L5:
        this.mCoaching = (BleCoaching) r2;
        SPUtils r3 = r0.XO0O10();
        Object r4 = new Gson().fromJson(r3.getString(BleCoaching.class.getName()), BleCoaching.class);
        if (r4 != null) goto L8;
        r4 = BleCoaching.class.newInstance();
    L8:
        this.mOriginCoaching = (BleCoaching) r4;
    }

    public static /* synthetic */ Unit I0iXXO(CoachingEditActivity r0, Editable r1) {
        return mTitleTextWatcher$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(CoachingEditActivity r0, Editable r1) {
        return mDescriptionTextWatcher$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean IIX1OXO(CoachingEditActivity r0, int r1) {
        return setRepeat$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ FontEditText O10IXXX0X(CoachingEditActivity r0) {
        return edtDescription_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontTextView OIX0iXi(CoachingEditActivity r0) {
        return tvRepeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0O(CoachingEditActivity r0) {
        return titleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FontEditText X1ii(CoachingEditActivity r0) {
        return edtName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXI(CoachingEditActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ View XiOIO(CoachingEditActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    private static final View btnBottom_delegate$lambda$0(CoachingEditActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final void checkFields() {
        getBtnBottom().setEnabled(!TextUtils.isEmpty(this.mCoaching.getMTitle()));
        getTitleRight().setEnabled(getBtnBottom().isEnabled());
    }

    private static final FontEditText edtDescription_delegate$lambda$0(CoachingEditActivity r1) {
        return (FontEditText) r1.findViewById(R.id.edt_description);
    }

    private static final FontEditText edtName_delegate$lambda$0(CoachingEditActivity r1) {
        return (FontEditText) r1.findViewById(R.id.edt_name);
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final FontEditText getEdtDescription() {
        return (FontEditText) getValue();
    }

    private final FontEditText getEdtName() {
        return (FontEditText) getValue();
    }

    private final ImageView getTitleRight() {
        return (ImageView) getValue();
    }

    private final FontTextView getTvRepeat() {
        return (FontTextView) getValue();
    }

    private static final Unit mDescriptionTextWatcher$lambda$0(CoachingEditActivity r0, Editable r1) {
        BleCoaching r2 = r0.mCoaching;
        if (r1 == null) goto L6;
        String r3 = r1.toString();
        if (r3 == null) goto L6;
    L7:
        r2.setMDescription(r3);
        return Unit.OXO1;
    L6:
        r3 = "";
        goto L7
    }

    private static final Unit mTitleTextWatcher$lambda$0(CoachingEditActivity r1, Editable r2) {
        BleCoaching r0 = r1.mCoaching;
        if (r2 == null) goto L6;
        String r3 = r2.toString();
        if (r3 == null) goto L6;
    L7:
        r0.setMTitle(r3);
        r1.checkFields();
        return Unit.OXO1;
    L6:
        r3 = "";
        goto L7
    }

    private static final boolean onTitleLeftClick$lambda$0$0(CoachingEditActivity r0) {
        r0.finish();
        return true;
    }

    private final void save() {
        SPUtils r0 = a01.OXO1.XO0O10();
        BleCoaching r1 = this.mCoaching;
        r0.put(BleCoaching.class.getName(), new Gson().toJson(r1));
    }

    private static final boolean setRepeat$lambda$1$0(CoachingEditActivity r3, int r4) {
        int r5 = r4 + 1;
        r3.getTvRepeat().setText(String.valueOf(r5));
        r3.mCoaching.setMRepeat(r5);
        return true;
    }

    private static final ImageView titleRight_delegate$lambda$0(CoachingEditActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final FontTextView tvRepeat_delegate$lambda$0(CoachingEditActivity r1) {
        return (FontTextView) r1.findViewById(R.id.tv_repeat);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() >= 0) goto L5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add);
    L6:
        ImageView r0 = getTitleRight();
        r0.setVisibility(0);
        r0.setImageResource(R.drawable.ic_confirm);
        getEdtName().setText(this.mCoaching.getMTitle());
        getTvRepeat().setText(String.valueOf(this.mCoaching.getMRepeat()));
        getEdtDescription().setText(this.mCoaching.getMDescription());
        FontEditText r1 = getEdtName();
        Intrinsics.O10IXXX0X(r1, "<get-edtName>(...)");
        r1.addTextChangedListener(new OXO1(this.mTitleTextWatcher));
        FontEditText r2 = getEdtDescription();
        Intrinsics.O10IXXX0X(r2, "<get-edtDescription>(...)");
        r2.addTextChangedListener(new XIi00iiXO(this.mDescriptionTextWatcher));
        checkFields();
        return;
    L5:
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_coaching_edit;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r1, int r2, @tb1 Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r2 != (-1)) goto L6;
        setResult(-1);
        finish();
        return;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        save();
        startActivityForResult(new Intent(this, CoachingSegmentsActivity.class), 0);
    }

    public final void onTitleLeftClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (Intrinsics.XOO0ii0(this.mCoaching, this.mOriginCoaching) == false) goto L7;
        finish();
        return;
    L7:
        if (this.mDiscardChangesPopup != null) goto L9;
        go0 r6 = new go0(getMContext(), 0, 2, null);
        r6.O1O(R.string.discard_change_to_exercise_tip);
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.confirm, new XIO0O11(this));
        this.mDiscardChangesPopup = r6;
    L9:
        go0 r7 = this.mDiscardChangesPopup;
        if (r7 == null) goto L13;
        r7.IIX1OXO();
        return;
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        save();
        setResult(-1);
        finish();
    }

    public final void setRepeat(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mRepeatPopup != null) goto L8;
        ArrayList r5 = new ArrayList(20);
        int r1 = 0;
    L5:
        if (r1 >= 20) goto L7;
        r1 = r1 + 1;
        r5.add(String.valueOf(r1));
        goto L5
    L7:
        qv1 r0 = new qv1(this, r5);
        r0.IXXOO(R.string.repeat_times);
        r0.iOO1ii1(R.string.times);
        r0.iX(new XXIXI(this));
        this.mRepeatPopup = r0;
    L8:
        qv1 r6 = this.mRepeatPopup;
        if (r6 == null) goto L13;
        r6.O1O(this.mCoaching.getMRepeat() - 1);
        r6.IIX1OXO();
        return;
    }
}
