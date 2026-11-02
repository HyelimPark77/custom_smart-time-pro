package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.p610ui.p612me.CoachingEditActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.FontEditText;
import com.sma.smartv3.view.text.FontTextView;
import com.szabh.smable3.entity.BleCoaching;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,134:1\n18#2,2:135\n15#2:137\n18#2,2:138\n15#2:140\n11#2,2:172\n55#3,12:141\n84#3,3:153\n55#3,12:156\n84#3,3:168\n1#4:171\n1#4:179\n140#5,5:174\n145#5,5:180\n*S KotlinDebug\n*F\n+ 1 CoachingEditActivity.kt\ncom/sma/smartv3/ui/me/CoachingEditActivity\n*L\n45#1:135,2\n45#1:137\n46#1:138,2\n46#1:140\n103#1:172,2\n66#1:141,12\n66#1:153,3\n67#1:156,12\n67#1:168,3\n132#1:179\n132#1:174,5\n132#1:180,5\n*E\n"})
public final class CoachingEditActivity extends BaseActivity {

    @aa1
    private final BleCoaching mCoaching;

    @tb1
    private go0 mDiscardChangesPopup;

    @aa1
    private final BleCoaching mOriginCoaching;

    @tb1
    private qv1 mRepeatPopup;

    @aa1
    private final Lazy titleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XIOI11X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingEditActivity.titleRight_delegate$lambda$0(this.f1209IO);
        }
    });

    @aa1
    private final Lazy edtName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0iO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingEditActivity.edtName_delegate$lambda$0(this.f1270IO);
        }
    });

    @aa1
    private final Lazy tvRepeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOIO0iIIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingEditActivity.tvRepeat_delegate$lambda$0(this.f8070IO);
        }
    });

    @aa1
    private final Lazy edtDescription$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIXXXOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingEditActivity.edtDescription_delegate$lambda$0(this.f4523IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01iXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CoachingEditActivity.btnBottom_delegate$lambda$0(this.f2426IO);
        }
    });

    @aa1
    private final Function1<Editable, Unit> mTitleTextWatcher = new Function1() { // from class: com.android.mltcode.paycertificationapi.i0Oii0OI
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return CoachingEditActivity.mTitleTextWatcher$lambda$0(this.f7411IO, (Editable) obj);
        }
    };

    @aa1
    private final Function1<Editable, Unit> mDescriptionTextWatcher = new Function1() { // from class: com.android.mltcode.paycertificationapi.Oi100iii
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return CoachingEditActivity.mDescriptionTextWatcher$lambda$0(this.f3647IO, (Editable) obj);
        }
    };

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class OXO1 implements TextWatcher {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54651IO;

        public OXO1(Function1 function1) {
            this.f54651IO = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f54651IO.invoke2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f54652IO;

        public XIi00iiXO(Function1 function1) {
            this.f54652IO = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f54652IO.invoke2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public CoachingEditActivity() {
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.XO0O10().getString(BleCoaching.class.getName()), (Class<Object>) BleCoaching.class);
        this.mCoaching = (BleCoaching) (objFromJson == null ? BleCoaching.class.newInstance() : objFromJson);
        Object objFromJson2 = new Gson().fromJson(a01Var.XO0O10().getString(BleCoaching.class.getName()), (Class<Object>) BleCoaching.class);
        this.mOriginCoaching = (BleCoaching) (objFromJson2 == null ? BleCoaching.class.newInstance() : objFromJson2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnBottom_delegate$lambda$0(CoachingEditActivity coachingEditActivity) {
        return coachingEditActivity.findViewById(R.id.btn_bottom);
    }

    private final void checkFields() {
        getBtnBottom().setEnabled(!TextUtils.isEmpty(this.mCoaching.getMTitle()));
        getTitleRight().setEnabled(getBtnBottom().isEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontEditText edtDescription_delegate$lambda$0(CoachingEditActivity coachingEditActivity) {
        return (FontEditText) coachingEditActivity.findViewById(R.id.edt_description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontEditText edtName_delegate$lambda$0(CoachingEditActivity coachingEditActivity) {
        return (FontEditText) coachingEditActivity.findViewById(R.id.edt_name);
    }

    private final View getBtnBottom() {
        return (View) this.btnBottom$delegate.getValue();
    }

    private final FontEditText getEdtDescription() {
        return (FontEditText) this.edtDescription$delegate.getValue();
    }

    private final FontEditText getEdtName() {
        return (FontEditText) this.edtName$delegate.getValue();
    }

    private final ImageView getTitleRight() {
        return (ImageView) this.titleRight$delegate.getValue();
    }

    private final FontTextView getTvRepeat() {
        return (FontTextView) this.tvRepeat$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mDescriptionTextWatcher$lambda$0(CoachingEditActivity coachingEditActivity, Editable editable) {
        String string;
        BleCoaching bleCoaching = coachingEditActivity.mCoaching;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        bleCoaching.setMDescription(string);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mTitleTextWatcher$lambda$0(CoachingEditActivity coachingEditActivity, Editable editable) {
        String string;
        BleCoaching bleCoaching = coachingEditActivity.mCoaching;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        bleCoaching.setMTitle(string);
        coachingEditActivity.checkFields();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(CoachingEditActivity coachingEditActivity) {
        coachingEditActivity.finish();
        return true;
    }

    private final void save() {
        a01.OXO1.XO0O10().put(BleCoaching.class.getName(), new Gson().toJson(this.mCoaching));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setRepeat$lambda$1$0(CoachingEditActivity coachingEditActivity, int i) {
        int i2 = i + 1;
        coachingEditActivity.getTvRepeat().setText(String.valueOf(i2));
        coachingEditActivity.mCoaching.setMRepeat(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView titleRight_delegate$lambda$0(CoachingEditActivity coachingEditActivity) {
        return (ImageView) coachingEditActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontTextView tvRepeat_delegate$lambda$0(CoachingEditActivity coachingEditActivity) {
        return (FontTextView) coachingEditActivity.findViewById(R.id.tv_repeat);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        if (getMArg1() < 0) {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add);
        } else {
            ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit);
        }
        ImageView titleRight = getTitleRight();
        titleRight.setVisibility(0);
        titleRight.setImageResource(R.drawable.ic_confirm);
        getEdtName().setText(this.mCoaching.getMTitle());
        getTvRepeat().setText(String.valueOf(this.mCoaching.getMRepeat()));
        getEdtDescription().setText(this.mCoaching.getMDescription());
        FontEditText edtName = getEdtName();
        Intrinsics.O10IXXX0X(edtName, "<get-edtName>(...)");
        edtName.addTextChangedListener(new OXO1(this.mTitleTextWatcher));
        FontEditText edtDescription = getEdtDescription();
        Intrinsics.O10IXXX0X(edtDescription, "<get-edtDescription>(...)");
        edtDescription.addTextChangedListener(new XIi00iiXO(this.mDescriptionTextWatcher));
        checkFields();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_coaching_edit;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        save();
        startActivityForResult(new Intent(this, (Class<?>) CoachingSegmentsActivity.class), 0);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (Intrinsics.XOO0ii0(this.mCoaching, this.mOriginCoaching)) {
            finish();
            return;
        }
        if (this.mDiscardChangesPopup == null) {
            go0 go0Var = new go0(getMContext(), 0, 2, null);
            go0Var.O1O(R.string.discard_change_to_exercise_tip);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XIO0O11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(CoachingEditActivity.onTitleLeftClick$lambda$0$0(this.f4531IO));
                }
            });
            this.mDiscardChangesPopup = go0Var;
        }
        go0 go0Var2 = this.mDiscardChangesPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        save();
        setResult(-1);
        finish();
    }

    public final void setRepeat(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mRepeatPopup == null) {
            ArrayList arrayList = new ArrayList(20);
            int i = 0;
            while (i < 20) {
                i++;
                arrayList.add(String.valueOf(i));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.repeat_times);
            qv1Var.iOO1ii1(R.string.times);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXIXI
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(CoachingEditActivity.setRepeat$lambda$1$0(this.f5036IO, ((Integer) obj).intValue()));
                }
            });
            this.mRepeatPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mRepeatPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mCoaching.getMRepeat() - 1);
            qv1Var2.IIX1OXO();
        }
    }
}
