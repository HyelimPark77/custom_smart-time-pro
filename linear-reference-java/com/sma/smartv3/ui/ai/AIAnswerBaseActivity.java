package com.sma.smartv3.ui.ai;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O001I;
import com.android.mltcode.paycertificationapi.O1O;
import com.android.mltcode.paycertificationapi.X0i1O;
import com.android.mltcode.paycertificationapi.X11iII1O1;
import com.android.mltcode.paycertificationapi.X1IX;
import com.android.mltcode.paycertificationapi.XXIIO1i11;
import com.android.mltcode.paycertificationapi.XXO;
import com.android.mltcode.paycertificationapi.XXX11i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI;
import com.android.mltcode.paycertificationapi.iIXi1iiXI;
import com.android.mltcode.paycertificationapi.iX1O1;
import com.android.mltcode.paycertificationapi.iXiX011;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIAnswerBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n87#2,7:182\n94#2,3:190\n70#2,7:193\n97#2:200\n1#3:189\n*S KotlinDebug\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n*L\n178#1:182,7\n178#1:190,3\n178#1:193,7\n178#1:200\n178#1:189\n*E\n"})
public class AIAnswerBaseActivity extends BaseAIActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy aiActivityBg$delegate;

    @aa1
    private final Lazy btnGenerate$delegate;
    private final int bytesLimit;

    @aa1
    private final Lazy centerLayout$delegate;

    @aa1
    private final Lazy etContent$delegate;

    @aa1
    private final Lazy resultsLayout$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvContent$delegate;

    @aa1
    private final Lazy tvCount$delegate;

    @aa1
    private final Lazy tvDescribe$delegate;

    @aa1
    private final Lazy tvExample$delegate;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ AIAnswerBaseActivity IO;

        public OXO1(AIAnswerBaseActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
        L3:
            if (String.valueOf(r3).length() <= AIAnswerBaseActivity.access$getBytesLimit$p(this.IO)) goto L6;
            if (r3 == null) goto L3;
            r3.delete(r3.length() - 1, r3.length());
            goto L3
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
            AIAnswerBaseActivity.access$getTvCount(this.IO).setText(String.valueOf(r1).length() + "/" + AIAnswerBaseActivity.access$getBytesLimit$p(this.IO));
        }
    }

    public static final class XIi00iiXO implements BaseAIActivity.OXO1<AIAnswer> {
        public final /* synthetic */ AIAnswerBaseActivity OXO1;

        public XIi00iiXO(AIAnswerBaseActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String r3) {
            Intrinsics.X0O(r3, "error");
            this.OXO1.dismissLoading();
            AIAnswerBaseActivity r4 = this.OXO1;
            String r0 = r4.getString(R.string.regeneration);
            Intrinsics.O10IXXX0X(r0, "getString(...)");
            r4.setBtnGenText(r0);
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public /* bridge */ /* synthetic */ void XIi00iiXO(AIAnswer r1) {
            iO(r1);
        }

        public void iO(AIAnswer r3) {
            Intrinsics.X0O(r3, "result");
            this.OXO1.dismissLoading();
            if (r3.getText().length() <= 0) goto L6;
            AIAnswerBaseActivity.access$getResultsLayout(this.OXO1).setVisibility(0);
            AIAnswerBaseActivity.access$getTvContent(this.OXO1).setText(r3.getText());
            AIAnswerBaseActivity r4 = this.OXO1;
            String r0 = r4.getString(R.string.regeneration);
            Intrinsics.O10IXXX0X(r0, "getString(...)");
            r4.setBtnGenText(r0);
            return;
        }
    }

    public AIAnswerBaseActivity() {
        this.TAG = "AIAnswerActivity";
        this.aiActivityBg$delegate = LazyKt__LazyJVMKt.iO(new O1O(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XXX11i(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new X1IX(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new X0i1O(this));
        this.bytesLimit = 500;
        this.etContent$delegate = LazyKt__LazyJVMKt.iO(new iIXi1iiXI(this));
        this.tvCount$delegate = LazyKt__LazyJVMKt.iO(new iXiX011(this));
        this.tvDescribe$delegate = LazyKt__LazyJVMKt.iO(new O001I(this));
        this.tvExample$delegate = LazyKt__LazyJVMKt.iO(new XXO(this));
        this.centerLayout$delegate = LazyKt__LazyJVMKt.iO(new XXIIO1i11(this));
        this.resultsLayout$delegate = LazyKt__LazyJVMKt.iO(new iI(this));
        this.tvContent$delegate = LazyKt__LazyJVMKt.iO(new iX1O1(this));
        this.btnGenerate$delegate = LazyKt__LazyJVMKt.iO(new X11iII1O1(this));
    }

    public static /* synthetic */ ImageView I1(AIAnswerBaseActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FrameLayout I1XOi1(AIAnswerBaseActivity r0) {
        return resultsLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FrameLayout IIX1OXO(AIAnswerBaseActivity r0) {
        return aiActivityBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(AIAnswerBaseActivity r0) {
        return tvExample_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OX(AIAnswerBaseActivity r0) {
        return centerLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OiIIX101O(AIAnswerBaseActivity r0) {
        return tvDescribe_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X0O(AIAnswerBaseActivity r0) {
        return tvCount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XX0(AIAnswerBaseActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XiOIO(AIAnswerBaseActivity r0) {
        return tvContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText XiOIii1(AIAnswerBaseActivity r0) {
        return etContent_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ int access$getBytesLimit$p(AIAnswerBaseActivity r0) {
        return r0.bytesLimit;
    }

    public static final /* synthetic */ FrameLayout access$getResultsLayout(AIAnswerBaseActivity r0) {
        return r0.getResultsLayout();
    }

    public static final /* synthetic */ PFMedium access$getTvContent(AIAnswerBaseActivity r0) {
        return r0.getTvContent();
    }

    public static final /* synthetic */ PFMedium access$getTvCount(AIAnswerBaseActivity r0) {
        return r0.getTvCount();
    }

    private static final FrameLayout aiActivityBg_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (FrameLayout) r1.findViewById(R.id.ai_answer_fl_bg);
    }

    private static final Button btnGenerate_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final LinearLayout centerLayout_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ai_answer_layout);
    }

    private static final EditText etContent_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (EditText) r1.findViewById(R.id.ai_answer_ed_content);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final FrameLayout getAiActivityBg() {
        return (FrameLayout) getValue();
    }

    private final Button getBtnGenerate() {
        return (Button) getValue();
    }

    private final LinearLayout getCenterLayout() {
        return (LinearLayout) getValue();
    }

    private final EditText getEtContent() {
        return (EditText) getValue();
    }

    private final FrameLayout getResultsLayout() {
        return (FrameLayout) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final PFMedium getTvContent() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvCount() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvDescribe() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvExample() {
        return (PFMedium) getValue();
    }

    public static /* synthetic */ View iIiiO(AIAnswerBaseActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button iOOX010X(AIAnswerBaseActivity r0) {
        return btnGenerate_delegate$lambda$0(r0);
    }

    private final void initEditText() {
        PFMedium r0 = getTvDescribe();
        AIFunction r1 = getMAIFunction();
        String r2 = null;
        if (r1 == null) goto L5;
        String r3 = r1.getDetailsDescribe();
    L6:
        r0.setText(r3);
        EditText r4 = getEtContent();
        AIFunction r5 = getMAIFunction();
        if (r5 == null) goto L9;
        String r6 = r5.getDetailsHint();
    L10:
        r4.setHint(r6);
        PFMedium r7 = getTvExample();
        AIFunction r8 = getMAIFunction();
        if (r8 == null) goto L13;
        r2 = r8.getDetailsExample();
    L13:
        r7.setText(r2);
        getEtContent().addTextChangedListener(new OXO1(this));
        return;
    L9:
        r6 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    private static final FrameLayout resultsLayout_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (FrameLayout) r1.findViewById(R.id.generate_results_frameLayout);
    }

    private static final View rootView_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final PFMedium tvContent_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ai_answer_tv_results);
    }

    private static final PFMedium tvCount_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ai_answer_et_count);
    }

    private static final PFMedium tvDescribe_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ai_answer_et_describe);
    }

    private static final PFMedium tvExample_delegate$lambda$0(AIAnswerBaseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.ai_answer_tv_example);
    }

    public final void addView(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getCenterLayout().addView(r2);
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity
    public void changeAiModel() {
        String r0 = getString(R.string.generate);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        setBtnGenText(r0);
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        super.init(r1);
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        int r0 = 0;
        setPlayResult(false);
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_history_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        ImageView r1 = getAbhTitleOtherRight();
        if (q62.OXO1.I0O() == true) goto L6;
        r0 = 8;
    L6:
        r1.setVisibility(r0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_switch_modle_icon);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        AIFunction r2 = getMAIFunction();
        if (r2 == null) goto L11;
        int r3 = r2.getDetailsBg();
        if (r3 == 0) goto L11;
        getAiActivityBg().setBackgroundResource(r3);
    L11:
        initEditText();
    }

    public void inputContent(@aa1 String r3) {
        Intrinsics.X0O(r3, "content");
        if (r3.length() != 0) goto L6;
        ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
        return;
    L6:
        showLoading(true);
        String r0 = getString(R.string.generating);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        setBtnGenText(r0);
        sendAIQuestion(r3);
    }

    public int layoutId() {
        return R.layout.activity_ai_answer;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        Editable r3 = getEtContent().getText();
        if (r3 == null) goto L6;
        String r4 = r3.toString();
        if (r4 == null) goto L6;
    L7:
        inputContent(r4);
        return;
    L6:
        r4 = "";
        goto L7
    }

    public final void onClear(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getEtContent().getText().clear();
        String r3 = getString(R.string.generate);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        setBtnGenText(r3);
    }

    public final void onCopy(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ClipboardUtils.copyText(getTvContent().getText());
        ToastUtils.showLong(R.string.copied);
    }

    public final void onTitleOtherRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onSetModel();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        AIFunction r5 = getMAIFunction();
        if (r5 == null) goto L6;
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r5);
        Intent r6 = new Intent(this, AIRecordsActivity.class);
        r6.putExtras(r0);
        startActivity(r6);
        return;
    }

    public void sendAIQuestion(@aa1 String r11) {
        Intrinsics.X0O(r11, "text");
        AIFunction r0 = getMAIFunction();
        Intrinsics.XXI(r0);
        BaseAIActivity.send$default(this, new AIQuestion(r0.getType(), r11, null, null, false, false, 60, null), new XIi00iiXO(this), false, false, false, 28, null);
    }

    public final void setBtnGenText(@aa1 String r5) {
        Intrinsics.X0O(r5, "str");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " setBtnGenText openAIDeductionPoints = " + getOpenAIDeductionPoints());
        Button r0 = getBtnGenerate();
        if (i72.OXO1.IIII0iI() == true) goto L5;
    L11:
        r0.setText(r5);
        return;
    L5:
        if (q62.OXO1.XOX() == false) goto L11;
        if (AIManager.OXO1.I0iXXO(false) != 0) goto L11;
        if (getOpenAIDeductionPoints() == 0) goto L11;
        r5 = r5 + " (-" + getOpenAIDeductionPoints() + getString(R.string.points) + I000IiI1O.iO.iO;
        goto L11
    }

    @Override // com.sma.smartv3.ui.ai.BaseAIActivity
    public void showAIDeductionPoints() {
        String r0 = getString(R.string.generate);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        setBtnGenText(r0);
    }
}
