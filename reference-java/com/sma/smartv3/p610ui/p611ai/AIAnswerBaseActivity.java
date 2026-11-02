package com.sma.smartv3.p610ui.p611ai;

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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.p610ui.p611ai.AIAnswerBaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIAnswerBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n87#2,7:182\n94#2,3:190\n70#2,7:193\n97#2:200\n1#3:189\n*S KotlinDebug\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n*L\n178#1:182,7\n178#1:190,3\n178#1:193,7\n178#1:200\n178#1:189\n*E\n"})
public class AIAnswerBaseActivity extends BaseAIActivity {

    @aa1
    private final String TAG = "AIAnswerActivity";

    @aa1
    private final Lazy aiActivityBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.aiActivityBg_delegate$lambda$0(this.f2731IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXX11i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.rootView_delegate$lambda$0(this.f5099IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.abhTitleRight_delegate$lambda$0(this.f4270IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0i1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.abhTitleOtherRight_delegate$lambda$0(this.f4092IO);
        }
    });
    private final int bytesLimit = 500;

    @aa1
    private final Lazy etContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIXi1iiXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.etContent_delegate$lambda$0(this.f7926IO);
        }
    });

    @aa1
    private final Lazy tvCount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXiX011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.tvCount_delegate$lambda$0(this.f8451IO);
        }
    });

    @aa1
    private final Lazy tvDescribe$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O001I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.tvDescribe_delegate$lambda$0(this.f2356IO);
        }
    });

    @aa1
    private final Lazy tvExample$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.tvExample_delegate$lambda$0(this.f5043IO);
        }
    });

    @aa1
    private final Lazy centerLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXIIO1i11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.centerLayout_delegate$lambda$0(this.f5026IO);
        }
    });

    @aa1
    private final Lazy resultsLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.resultsLayout_delegate$lambda$0(this.f7778IO);
        }
    });

    @aa1
    private final Lazy tvContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.tvContent_delegate$lambda$0(this.f8287IO);
        }
    });

    @aa1
    private final Lazy btnGenerate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X11iII1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIAnswerBaseActivity.btnGenerate_delegate$lambda$0(this.f4234IO);
        }
    });

    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            while (String.valueOf(editable).length() > AIAnswerBaseActivity.this.bytesLimit) {
                if (editable != null) {
                    editable.delete(editable.length() - 1, editable.length());
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AIAnswerBaseActivity.this.getTvCount().setText(String.valueOf(charSequence).length() + "/" + AIAnswerBaseActivity.this.bytesLimit);
        }
    }

    public static final class XIi00iiXO implements BaseAIActivity.OXO1<AIAnswer> {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        public void OXO1(String error) {
            Intrinsics.X0O(error, "error");
            AIAnswerBaseActivity.this.dismissLoading();
            AIAnswerBaseActivity aIAnswerBaseActivity = AIAnswerBaseActivity.this;
            String string = aIAnswerBaseActivity.getString(R.string.regeneration);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            aIAnswerBaseActivity.setBtnGenText(string);
        }

        @Override // com.sma.smartv3.ui.ai.BaseAIActivity.OXO1
        /* JADX INFO: renamed from: iO, reason: merged with bridge method [inline-methods] */
        public void XIi00iiXO(AIAnswer result) {
            Intrinsics.X0O(result, "result");
            AIAnswerBaseActivity.this.dismissLoading();
            if (result.getText().length() > 0) {
                AIAnswerBaseActivity.this.getResultsLayout().setVisibility(0);
                AIAnswerBaseActivity.this.getTvContent().setText(result.getText());
                AIAnswerBaseActivity aIAnswerBaseActivity = AIAnswerBaseActivity.this;
                String string = aIAnswerBaseActivity.getString(R.string.regeneration);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                aIAnswerBaseActivity.setBtnGenText(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (ImageView) aIAnswerBaseActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (ImageView) aIAnswerBaseActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout aiActivityBg_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (FrameLayout) aIAnswerBaseActivity.findViewById(R.id.ai_answer_fl_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnGenerate_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (Button) aIAnswerBaseActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout centerLayout_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (LinearLayout) aIAnswerBaseActivity.findViewById(R.id.ai_answer_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etContent_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (EditText) aIAnswerBaseActivity.findViewById(R.id.ai_answer_ed_content);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final FrameLayout getAiActivityBg() {
        return (FrameLayout) this.aiActivityBg$delegate.getValue();
    }

    private final Button getBtnGenerate() {
        return (Button) this.btnGenerate$delegate.getValue();
    }

    private final LinearLayout getCenterLayout() {
        return (LinearLayout) this.centerLayout$delegate.getValue();
    }

    private final EditText getEtContent() {
        return (EditText) this.etContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getResultsLayout() {
        return (FrameLayout) this.resultsLayout$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PFMedium getTvContent() {
        return (PFMedium) this.tvContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PFMedium getTvCount() {
        return (PFMedium) this.tvCount$delegate.getValue();
    }

    private final PFMedium getTvDescribe() {
        return (PFMedium) this.tvDescribe$delegate.getValue();
    }

    private final PFMedium getTvExample() {
        return (PFMedium) this.tvExample$delegate.getValue();
    }

    private final void initEditText() {
        PFMedium tvDescribe = getTvDescribe();
        AIFunction mAIFunction = getMAIFunction();
        tvDescribe.setText(mAIFunction != null ? mAIFunction.getDetailsDescribe() : null);
        EditText etContent = getEtContent();
        AIFunction mAIFunction2 = getMAIFunction();
        etContent.setHint(mAIFunction2 != null ? mAIFunction2.getDetailsHint() : null);
        PFMedium tvExample = getTvExample();
        AIFunction mAIFunction3 = getMAIFunction();
        tvExample.setText(mAIFunction3 != null ? mAIFunction3.getDetailsExample() : null);
        getEtContent().addTextChangedListener(new OXO1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout resultsLayout_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (FrameLayout) aIAnswerBaseActivity.findViewById(R.id.generate_results_frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return aIAnswerBaseActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvContent_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (PFMedium) aIAnswerBaseActivity.findViewById(R.id.ai_answer_tv_results);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvCount_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (PFMedium) aIAnswerBaseActivity.findViewById(R.id.ai_answer_et_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvDescribe_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (PFMedium) aIAnswerBaseActivity.findViewById(R.id.ai_answer_et_describe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvExample_delegate$lambda$0(AIAnswerBaseActivity aIAnswerBaseActivity) {
        return (PFMedium) aIAnswerBaseActivity.findViewById(R.id.ai_answer_tv_example);
    }

    public final void addView(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getCenterLayout().addView(view);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity
    public void changeAiModel() {
        String string = getString(R.string.generate);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        setBtnGenText(string);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int detailsBg;
        super.initView();
        setPlayResult(false);
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_history_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getAbhTitleOtherRight().setVisibility(q62.OXO1.I0O() ? 0 : 8);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_switch_modle_icon);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        AIFunction mAIFunction = getMAIFunction();
        if (mAIFunction != null && (detailsBg = mAIFunction.getDetailsBg()) != 0) {
            getAiActivityBg().setBackgroundResource(detailsBg);
        }
        initEditText();
    }

    public void inputContent(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        if (content.length() == 0) {
            ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
            return;
        }
        showLoading(true);
        String string = getString(R.string.generating);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        setBtnGenText(string);
        sendAIQuestion(content);
    }

    public int layoutId() {
        return R.layout.activity_ai_answer;
    }

    public final void onBottomClick(@aa1 View view) {
        String string;
        Intrinsics.X0O(view, "view");
        Editable text = getEtContent().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        inputContent(string);
    }

    public final void onClear(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getEtContent().getText().clear();
        String string = getString(R.string.generate);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        setBtnGenText(string);
    }

    public final void onCopy(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ClipboardUtils.copyText(getTvContent().getText());
        ToastUtils.showLong(R.string.copied);
    }

    public final void onTitleOtherRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onSetModel();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        AIFunction mAIFunction = getMAIFunction();
        if (mAIFunction != null) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", mAIFunction);
            Intent intent = new Intent(this, (Class<?>) AIRecordsActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    public void sendAIQuestion(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        AIFunction mAIFunction = getMAIFunction();
        Intrinsics.XXI(mAIFunction);
        BaseAIActivity.send$default(this, new AIQuestion(mAIFunction.getType(), text, null, null, false, false, 60, null), new XIi00iiXO(), false, false, false, 28, null);
    }

    public final void setBtnGenText(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " setBtnGenText openAIDeductionPoints = " + getOpenAIDeductionPoints());
        Button btnGenerate = getBtnGenerate();
        if (i72.OXO1.IIII0iI() && q62.OXO1.XOX() && AIManager.OXO1.I0iXXO(false) == 0 && getOpenAIDeductionPoints() != 0) {
            str = str + " (-" + getOpenAIDeductionPoints() + getString(R.string.points) + I000IiI1O.C2156iO.f1007iO;
        }
        btnGenerate.setText(str);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.BaseAIActivity
    public void showAIDeductionPoints() {
        String string = getString(R.string.generate);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        setBtnGenText(string);
    }
}
