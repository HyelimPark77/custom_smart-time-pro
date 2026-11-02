package com.sma.smartv3.p610ui.p611ai;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.p610ui.p611ai.AIAnswerActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AIGridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIAnswerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n55#2,12:228\n84#2,3:240\n1#3:243\n1869#4,2:244\n*S KotlinDebug\n*F\n+ 1 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n*L\n129#1:228,12\n129#1:240,3\n210#1:244,2\n*E\n"})
public final class AIAnswerActivity extends AIAnswerBaseActivity {
    public LayoutInflater mLayoutInflater;
    private final int mAdapterSpanCount = 3;

    @aa1
    private final List<OXO1> mTabList = new ArrayList();

    public static final class OXO1 {

        @aa1
        public final String OXO1;

        @aa1
        public String XIi00iiXO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OXO1 XO0O10(OXO1 oxo1, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oxo1.OXO1;
            }
            if ((i & 2) != 0) {
                str2 = oxo1.XIi00iiXO;
            }
            return oxo1.m38300iO(str, str2);
        }

        @aa1
        public final String IiI10X() {
            return this.XIi00iiXO;
        }

        @aa1
        public final String O00() {
            return this.OXO1;
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public final void XOO0ii0(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XIi00iiXO = str;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OXO1)) {
                return false;
            }
            OXO1 oxo1 = (OXO1) obj;
            return Intrinsics.XOO0ii0(this.OXO1, oxo1.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, oxo1.XIi00iiXO);
        }

        public int hashCode() {
            return (this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode();
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final OXO1 m38300iO(@aa1 String describe, @aa1 String text) {
            Intrinsics.X0O(describe, "describe");
            Intrinsics.X0O(text, "text");
            return new OXO1(describe, text);
        }

        @aa1
        public String toString() {
            return "TabData(describe=" + this.OXO1 + ", text=" + this.XIi00iiXO + I000IiI1O.C2156iO.f1007iO;
        }

        public OXO1(@aa1 String describe, @aa1 String text) {
            Intrinsics.X0O(describe, "describe");
            Intrinsics.X0O(text, "text");
            this.OXO1 = describe;
            this.XIi00iiXO = text;
        }

        public /* synthetic */ OXO1(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[AIFunctionType.values().length];
            try {
                iArr[AIFunctionType.EAT_HEALTHY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AIFunctionType.SHORT_VIDEO_SCRIPTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AIFunctionType.DAILY_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AIFunctionType.TRAVEL_GUIDES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AIFunctionType.MOMENTS_COPYWRITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AIFunctionType.APOLOGIZE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AIFunctionType.PSYCHOLOGICAL_COUNSELOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AIFunctionType.DREAM_INTERPRETATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AIFunctionType.EVENT_PLANNING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AIFunctionType.MARKET_ANALYSIS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AIFunctionType.COMPLIMENT_MASTERS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            OXO1 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIAnswerActivity$iO */
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n130#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class C18644iO implements TextWatcher {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ OXO1 f54422IO;

        public C18644iO(OXO1 oxo1) {
            this.f54422IO = oxo1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f54422IO.XOO0ii0(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEditLayout$lambda$1(EditText editText, View view) {
        editText.getText().clear();
    }

    public static /* synthetic */ void addReyclerView$default(AIAnswerActivity aIAnswerActivity, List list, int i, String str, OXO1 oxo1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = aIAnswerActivity.mAdapterSpanCount;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        aIAnswerActivity.addReyclerView(list, i, str, oxo1);
    }

    private final String stitchTabText(String str) {
        if (this.mTabList.size() > 0) {
            for (OXO1 oxo1 : this.mTabList) {
                if (oxo1.IiI10X().length() > 0) {
                    str = ((Object) str) + (oxo1.O00().length() > 0 ? I000IiI1O.C2156iO.XO0O10 + oxo1.O00() + CertificateUtil.DELIMITER + oxo1.IiI10X() : oxo1.IiI10X());
                }
            }
        }
        return str;
    }

    public final void addEditLayout(@aa1 OXO1 tabData) {
        Intrinsics.X0O(tabData, "tabData");
        View viewInflate = getMLayoutInflater().inflate(R.layout.ai_answer_edit_layout, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.item_edit);
        Intrinsics.XXI(editText);
        editText.addTextChangedListener(new C18644iO(tabData));
        viewInflate.findViewById(R.id.item_edit_clear).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXXOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIAnswerActivity.addEditLayout$lambda$1(editText, view);
            }
        });
        Intrinsics.XXI(viewInflate);
        addView(viewInflate);
    }

    public final void addReyclerView(@aa1 List<String> list, int i, @aa1 String defaultText, @aa1 OXO1 tabData) {
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(defaultText, "defaultText");
        Intrinsics.X0O(tabData, "tabData");
        tabData.XOO0ii0(defaultText);
        RecyclerView recyclerView = new RecyclerView(getMContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getMContext(), i));
        recyclerView.setAdapter(new AIAnswerActivity$addReyclerView$mAdapter$1(list, tabData, getMContext()));
        recyclerView.addItemDecoration(new AIGridSpacingItemDecoration(i, SizeUtils.dp2px(15.0f)));
        addView(recyclerView);
    }

    public final void addTitleDescribe(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        View viewInflate = getMLayoutInflater().inflate(R.layout.ai_answer_describe, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.ai_answer_et_describe)).setText(text);
        Intrinsics.XXI(viewInflate);
        addView(viewInflate);
    }

    public final int getMAdapterSpanCount() {
        return this.mAdapterSpanCount;
    }

    @aa1
    public final LayoutInflater getMLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        Intrinsics.XXO("mLayoutInflater");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sma.smartv3.p610ui.p611ai.AIAnswerBaseActivity, com.sma.smartv3.p610ui.p611ai.BaseAIActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getMContext());
        Intrinsics.O10IXXX0X(layoutInflaterFrom, "from(...)");
        setMLayoutInflater(layoutInflaterFrom);
        this.mTabList.clear();
        AIFunction mAIFunction = getMAIFunction();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        AIFunctionType type = mAIFunction != null ? mAIFunction.getType() : null;
        int i = 2;
        switch (type == null ? -1 : XIi00iiXO.OXO1[type.ordinal()]) {
            case 1:
                String string = getString(R.string.catering_type);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                OXO1 oxo1 = new OXO1(string, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                this.mTabList.add(oxo1);
                addTitleDescribe(oxo1.O00());
                String[] stringArray = getResources().getStringArray(R.array.eat_healthy_list);
                Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
                addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(stringArray), 0, null, oxo1, 6, null);
                break;
            case 2:
                String string2 = getString(R.string.copywriting_style);
                Intrinsics.O10IXXX0X(string2, "getString(...)");
                OXO1 oxo2 = new OXO1(string2, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
                this.mTabList.add(oxo2);
                addTitleDescribe(oxo2.O00());
                String[] stringArray2 = getResources().getStringArray(R.array.short_video_scripts_list);
                Intrinsics.O10IXXX0X(stringArray2, "getStringArray(...)");
                addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(stringArray2), 0, null, oxo2, 6, null);
                String string3 = getString(R.string.time);
                Intrinsics.O10IXXX0X(string3, "getString(...)");
                OXO1 oxo3 = new OXO1(string3, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
                this.mTabList.add(oxo3);
                addTitleDescribe(oxo3.O00());
                addReyclerView$default(this, CollectionsKt__CollectionsKt.Ii1iii0("30s", "90s", "270s"), 0, null, oxo3, 6, null);
                break;
            case 3:
                String string4 = getString(R.string.number_of_words);
                Intrinsics.O10IXXX0X(string4, "getString(...)");
                OXO1 oxo4 = new OXO1(string4, objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0);
                this.mTabList.add(oxo4);
                addTitleDescribe(oxo4.O00());
                addEditLayout(oxo4);
                String string5 = getString(R.string.type);
                Intrinsics.O10IXXX0X(string5, "getString(...)");
                OXO1 oxo5 = new OXO1(string5, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0);
                this.mTabList.add(oxo5);
                addTitleDescribe(oxo5.O00());
                String[] stringArray3 = getResources().getStringArray(R.array.daily_weekly_list);
                Intrinsics.O10IXXX0X(stringArray3, "getStringArray(...)");
                addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(stringArray3), 0, null, oxo5, 6, null);
                break;
            case 4:
                String string6 = getString(R.string.travel_days);
                Intrinsics.O10IXXX0X(string6, "getString(...)");
                OXO1 oxo6 = new OXO1(string6, objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0);
                this.mTabList.add(oxo6);
                addTitleDescribe(oxo6.O00());
                addEditLayout(oxo6);
                String string7 = getString(R.string.tourism_budget);
                Intrinsics.O10IXXX0X(string7, "getString(...)");
                OXO1 oxo7 = new OXO1(string7, objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0);
                this.mTabList.add(oxo7);
                addTitleDescribe(oxo7.O00());
                addEditLayout(oxo7);
                OXO1 oxo8 = new OXO1("", objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0);
                this.mTabList.add(oxo8);
                String[] stringArray4 = getResources().getStringArray(R.array.travel_guides_list);
                Intrinsics.O10IXXX0X(stringArray4, "getStringArray(...)");
                addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(stringArray4), 2, null, oxo8, 4, null);
                break;
            case 5:
                String string8 = getString(R.string.type);
                Intrinsics.O10IXXX0X(string8, "getString(...)");
                OXO1 oxo9 = new OXO1(string8, objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0);
                this.mTabList.add(oxo9);
                addTitleDescribe(oxo9.O00());
                String[] stringArray5 = getResources().getStringArray(R.array.moments_copywriting_list);
                Intrinsics.O10IXXX0X(stringArray5, "getStringArray(...)");
                addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(stringArray5), 0, null, oxo9, 6, null);
                break;
            case 6:
                String string9 = getString(R.string.number_of_words);
                Intrinsics.O10IXXX0X(string9, "getString(...)");
                OXO1 oxo10 = new OXO1(string9, str, i, objArr21 == true ? 1 : 0);
                this.mTabList.add(oxo10);
                addTitleDescribe(oxo10.O00());
                addEditLayout(oxo10);
                String string10 = getString(R.string.type);
                Intrinsics.O10IXXX0X(string10, "getString(...)");
                OXO1 oxo11 = new OXO1(string10, objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0);
                this.mTabList.add(oxo11);
                addTitleDescribe(oxo11.O00());
                String[] stringArray6 = getResources().getStringArray(R.array.apologize_list);
                Intrinsics.O10IXXX0X(stringArray6, "getStringArray(...)");
                List listIO0XiOIi = ArraysKt___ArraysKt.iO0XiOIi(stringArray6);
                String string11 = getString(R.string.daily_weekly_list_1);
                Intrinsics.O10IXXX0X(string11, "getString(...)");
                addReyclerView$default(this, listIO0XiOIi, 0, string11, oxo11, 2, null);
                break;
        }
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIAnswerBaseActivity
    public void inputContent(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        AIFunctionType aIFunctionType = AIFunctionType.DAILY_WEEKLY;
        AIFunction mAIFunction = getMAIFunction();
        if (aIFunctionType != (mAIFunction != null ? mAIFunction.getType() : null) || (this.mTabList.size() > 0 && ((OXO1) CollectionsKt___CollectionsKt.Xi1XO00(this.mTabList)).IiI10X().length() > 0)) {
            super.inputContent(content);
        } else {
            dismissLoading();
            ToastUtils.showLong(getString(R.string.daily_weekly_no_selete_tip), new Object[0]);
        }
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIAnswerBaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_answer;
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIAnswerBaseActivity
    public void sendAIQuestion(@aa1 String content) {
        String detailsQuestion;
        String strStitchTabText;
        Intrinsics.X0O(content, "content");
        addSendRecord(content);
        AIFunction mAIFunction = getMAIFunction();
        AIFunctionType type = mAIFunction != null ? mAIFunction.getType() : null;
        switch (type == null ? -1 : XIi00iiXO.OXO1[type.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                String strStitchTabText2 = stitchTabText(content);
                StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
                AIFunction mAIFunction2 = getMAIFunction();
                detailsQuestion = mAIFunction2 != null ? mAIFunction2.getDetailsQuestion() : null;
                Intrinsics.XXI(detailsQuestion);
                strStitchTabText = String.format(detailsQuestion, Arrays.copyOf(new Object[]{strStitchTabText2}, 1));
                Intrinsics.O10IXXX0X(strStitchTabText, "format(...)");
                break;
            case 6:
            default:
                String string = getString(R.string.ai_help_me_write);
                AIFunction mAIFunction3 = getMAIFunction();
                detailsQuestion = mAIFunction3 != null ? mAIFunction3.getDetailsQuestion() : null;
                strStitchTabText = stitchTabText(string + detailsQuestion + ", " + getString(R.string.ai_help_me_write_describe) + content);
                break;
        }
        addReceivedRecord();
        super.sendAIQuestion(strStitchTabText);
    }

    public final void setMLayoutInflater(@aa1 LayoutInflater layoutInflater) {
        Intrinsics.X0O(layoutInflater, "<set-?>");
        this.mLayoutInflater = layoutInflater;
    }
}
