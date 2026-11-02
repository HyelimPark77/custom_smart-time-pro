package com.sma.smartv3.ui.ai;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IXXOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AIGridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
    private final int mAdapterSpanCount;
    public LayoutInflater mLayoutInflater;

    @aa1
    private final List<OXO1> mTabList;

    public static final class OXO1 {

        @aa1
        public final String OXO1;

        @aa1
        public String XIi00iiXO;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1() {
            Object[] r0 = 0 == true ? 1 : 0;
            this(null, r0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OXO1 XO0O10(OXO1 r0, String r1, String r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.XIi00iiXO;
        L9:
            return r0.iO(r1, r2);
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

        public final void XOO0ii0(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XIi00iiXO = r2;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof OXO1) == true) goto L8;
            return false;
        L8:
            OXO1 r6 = (OXO1) r5;
            if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode();
        }

        @aa1
        public final OXO1 iO(@aa1 String r2, @aa1 String r3) {
            Intrinsics.X0O(r2, "describe");
            Intrinsics.X0O(r3, "text");
            return new OXO1(r2, r3);
        }

        @aa1
        public String toString() {
            return "TabData(describe=" + this.OXO1 + ", text=" + this.XIi00iiXO + I000IiI1O.iO.iO;
        }

        public OXO1(@aa1 String r2, @aa1 String r3) {
            Intrinsics.X0O(r2, "describe");
            Intrinsics.X0O(r3, "text");
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
        }

        public /* synthetic */ OXO1(String r2, String r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = "";
        L8:
            this(r2, r3);
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[AIFunctionType.values().length];
            r0[AIFunctionType.EAT_HEALTHY.ordinal()] = 1;     // Catch: NoSuchFieldError -> L16
        L31:
            r0[AIFunctionType.SHORT_VIDEO_SCRIPTS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L17
        L47:
            r0[AIFunctionType.DAILY_WEEKLY.ordinal()] = 3;     // Catch: NoSuchFieldError -> L18
        L35:
            r0[AIFunctionType.TRAVEL_GUIDES.ordinal()] = 4;     // Catch: NoSuchFieldError -> L19
        L39:
            r0[AIFunctionType.MOMENTS_COPYWRITING.ordinal()] = 5;     // Catch: NoSuchFieldError -> L20
        L27:
            r0[AIFunctionType.APOLOGIZE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L21
        L41:
            r0[AIFunctionType.PSYCHOLOGICAL_COUNSELOR.ordinal()] = 7;     // Catch: NoSuchFieldError -> L22
        L43:
            r0[AIFunctionType.DREAM_INTERPRETATION.ordinal()] = 8;     // Catch: NoSuchFieldError -> L23
        L33:
            r0[AIFunctionType.EVENT_PLANNING.ordinal()] = 9;     // Catch: NoSuchFieldError -> L24
        L37:
            r0[AIFunctionType.MARKET_ANALYSIS.ordinal()] = 10;     // Catch: NoSuchFieldError -> L25
        L29:
            r0[AIFunctionType.COMPLIMENT_MASTERS.ordinal()] = 11;     // Catch: NoSuchFieldError -> L26
        L14:
            OXO1 = r0;
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n130#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class iO implements TextWatcher {
        public final /* synthetic */ OXO1 IO;

        public iO(OXO1 r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            this.IO.XOO0ii0(String.valueOf(r2));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public AIAnswerActivity() {
        this.mAdapterSpanCount = 3;
        this.mTabList = new ArrayList();
    }

    public static /* synthetic */ void X01IiOiIi(EditText r0, View r1) {
        addEditLayout$lambda$1(r0, r1);
    }

    private static final void addEditLayout$lambda$1(EditText r0, View r1) {
        r0.getText().clear();
    }

    public static /* synthetic */ void addReyclerView$default(AIAnswerActivity r0, List r1, int r2, String r3, OXO1 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = r0.mAdapterSpanCount;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = "";
    L8:
        r0.addReyclerView(r1, r2, r3, r4);
    }

    private final String stitchTabText(String r6) {
        if (this.mTabList.size() <= 0) goto L14;
        Iterator<T> r0 = this.mTabList.iterator();
    L6:
        if (r0.hasNext() == false) goto L14;
        OXO1 r1 = (OXO1) r0.next();
        if (r1.IiI10X().length() <= 0) goto L6;
        if (r1.O00().length() <= 0) goto L12;
        String r2 = I000IiI1O.iO.XO0O10 + r1.O00() + CertificateUtil.DELIMITER + r1.IiI10X();
    L13:
        r6 = r6 + r2;
        goto L6
    L12:
        r2 = r1.IiI10X();
    L14:
        return r6;
    }

    public final void addEditLayout(@aa1 OXO1 r4) {
        Intrinsics.X0O(r4, "tabData");
        View r0 = getMLayoutInflater().inflate(R.layout.ai_answer_edit_layout, null);
        final EditText r1 = (EditText) r0.findViewById(R.id.item_edit);
        Intrinsics.XXI(r1);
        r1.addTextChangedListener(new iO(r4));
        r0.findViewById(R.id.item_edit_clear).setOnClickListener(new IXXOO(r1));
        Intrinsics.XXI(r0);
        addView(r0);
    }

    public final void addReyclerView(@aa1 List<String> r3, int r4, @aa1 String r5, @aa1 OXO1 r6) {
        Intrinsics.X0O(r3, "list");
        Intrinsics.X0O(r5, "defaultText");
        Intrinsics.X0O(r6, "tabData");
        r6.XOO0ii0(r5);
        RecyclerView r7 = new RecyclerView(getMContext());
        r7.setLayoutManager(new GridLayoutManager(getMContext(), r4));
        r7.setAdapter(new AIAnswerActivity$addReyclerView$mAdapter$1(r3, r6, getMContext()));
        r7.addItemDecoration(new AIGridSpacingItemDecoration(r4, SizeUtils.dp2px(15.0f)));
        addView(r7);
    }

    public final void addTitleDescribe(@aa1 String r4) {
        Intrinsics.X0O(r4, "text");
        View r0 = getMLayoutInflater().inflate(R.layout.ai_answer_describe, null);
        ((TextView) r0.findViewById(R.id.ai_answer_et_describe)).setText(r4);
        Intrinsics.XXI(r0);
        addView(r0);
    }

    public final int getMAdapterSpanCount() {
        return this.mAdapterSpanCount;
    }

    @aa1
    public final LayoutInflater getMLayoutInflater() {
        LayoutInflater r0 = this.mLayoutInflater;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLayoutInflater");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sma.smartv3.ui.ai.AIAnswerBaseActivity, com.sma.smartv3.ui.ai.BaseAIActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        LayoutInflater r1 = LayoutInflater.from(getMContext());
        Intrinsics.O10IXXX0X(r1, "from(...)");
        setMLayoutInflater(r1);
        this.mTabList.clear();
        AIFunction r2 = getMAIFunction();
        String r7 = null;
        Object[] r8 = 0;
        Object[] r9 = 0;
        Object[] r10 = 0;
        Object[] r11 = 0;
        Object[] r12 = 0;
        Object[] r13 = 0;
        Object[] r14 = 0;
        Object[] r15 = 0;
        Object[] r16 = 0;
        Object[] r17 = 0;
        Object[] r18 = 0;
        Object[] r19 = 0;
        Object[] r20 = 0;
        Object[] r21 = 0;
        Object[] r22 = 0;
        Object[] r23 = 0;
        Object[] r24 = 0;
        Object[] r25 = 0;
        Object[] r26 = 0;
        Object[] r27 = 0;
        Object[] r28 = 0;
        if (r2 == null) goto L5;
        AIFunctionType r3 = r2.getType();
    L6:
        if (r3 != null) goto L8;
        int r4 = -1;
    L9:
        int r29 = 2;
        switch(r4) {
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            default: goto L11;
        };
    L11:
        return;
    L12:
        String r5 = getString(R.string.number_of_words);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        OXO1 r6 = new OXO1(r5, r7, r29, r28 == true ? 1 : 0);
        this.mTabList.add(r6);
        addTitleDescribe(r6.O00());
        addEditLayout(r6);
        String r30 = getString(R.string.type);
        Intrinsics.O10IXXX0X(r30, "getString(...)");
        OXO1 r31 = new OXO1(r30, r27 == true ? 1 : 0, r29, r26 == true ? 1 : 0);
        this.mTabList.add(r31);
        addTitleDescribe(r31.O00());
        String[] r32 = getResources().getStringArray(R.array.apologize_list);
        Intrinsics.O10IXXX0X(r32, "getStringArray(...)");
        List r33 = ArraysKt___ArraysKt.iO0XiOIi(r32);
        String r34 = getString(R.string.daily_weekly_list_1);
        Intrinsics.O10IXXX0X(r34, "getString(...)");
        addReyclerView$default(this, r33, 0, r34, r31, 2, null);
        return;
    L14:
        String r35 = getString(R.string.type);
        Intrinsics.O10IXXX0X(r35, "getString(...)");
        OXO1 r36 = new OXO1(r35, r25 == true ? 1 : 0, r29, r24 == true ? 1 : 0);
        this.mTabList.add(r36);
        addTitleDescribe(r36.O00());
        String[] r37 = getResources().getStringArray(R.array.moments_copywriting_list);
        Intrinsics.O10IXXX0X(r37, "getStringArray(...)");
        addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(r37), 0, null, r36, 6, null);
        return;
    L16:
        String r38 = getString(R.string.travel_days);
        Intrinsics.O10IXXX0X(r38, "getString(...)");
        OXO1 r39 = new OXO1(r38, r23 == true ? 1 : 0, r29, r22 == true ? 1 : 0);
        this.mTabList.add(r39);
        addTitleDescribe(r39.O00());
        addEditLayout(r39);
        String r40 = getString(R.string.tourism_budget);
        Intrinsics.O10IXXX0X(r40, "getString(...)");
        OXO1 r41 = new OXO1(r40, r21 == true ? 1 : 0, r29, r20 == true ? 1 : 0);
        this.mTabList.add(r41);
        addTitleDescribe(r41.O00());
        addEditLayout(r41);
        OXO1 r42 = new OXO1("", r19 == true ? 1 : 0, r29, r18 == true ? 1 : 0);
        this.mTabList.add(r42);
        String[] r43 = getResources().getStringArray(R.array.travel_guides_list);
        Intrinsics.O10IXXX0X(r43, "getStringArray(...)");
        addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(r43), 2, null, r42, 4, null);
        return;
    L18:
        String r44 = getString(R.string.number_of_words);
        Intrinsics.O10IXXX0X(r44, "getString(...)");
        OXO1 r45 = new OXO1(r44, r17 == true ? 1 : 0, r29, r16 == true ? 1 : 0);
        this.mTabList.add(r45);
        addTitleDescribe(r45.O00());
        addEditLayout(r45);
        String r46 = getString(R.string.type);
        Intrinsics.O10IXXX0X(r46, "getString(...)");
        OXO1 r47 = new OXO1(r46, r15 == true ? 1 : 0, r29, r14 == true ? 1 : 0);
        this.mTabList.add(r47);
        addTitleDescribe(r47.O00());
        String[] r48 = getResources().getStringArray(R.array.daily_weekly_list);
        Intrinsics.O10IXXX0X(r48, "getStringArray(...)");
        addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(r48), 0, null, r47, 6, null);
        return;
    L20:
        String r49 = getString(R.string.copywriting_style);
        Intrinsics.O10IXXX0X(r49, "getString(...)");
        OXO1 r50 = new OXO1(r49, r13 == true ? 1 : 0, r29, r12 == true ? 1 : 0);
        this.mTabList.add(r50);
        addTitleDescribe(r50.O00());
        String[] r51 = getResources().getStringArray(R.array.short_video_scripts_list);
        Intrinsics.O10IXXX0X(r51, "getStringArray(...)");
        addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(r51), 0, null, r50, 6, null);
        String r52 = getString(R.string.time);
        Intrinsics.O10IXXX0X(r52, "getString(...)");
        OXO1 r53 = new OXO1(r52, r11 == true ? 1 : 0, r29, r10 == true ? 1 : 0);
        this.mTabList.add(r53);
        addTitleDescribe(r53.O00());
        addReyclerView$default(this, CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"30s", "90s", "270s"}), 0, null, r53, 6, null);
        return;
    L22:
        String r54 = getString(R.string.catering_type);
        Intrinsics.O10IXXX0X(r54, "getString(...)");
        OXO1 r55 = new OXO1(r54, r9 == true ? 1 : 0, r29, r8 == true ? 1 : 0);
        this.mTabList.add(r55);
        addTitleDescribe(r55.O00());
        String[] r56 = getResources().getStringArray(R.array.eat_healthy_list);
        Intrinsics.O10IXXX0X(r56, "getStringArray(...)");
        addReyclerView$default(this, ArraysKt___ArraysKt.iO0XiOIi(r56), 0, null, r55, 6, null);
        return;
    L8:
        r4 = XIi00iiXO.OXO1[r3.ordinal()];
        goto L9
    L5:
        r3 = null;
        goto L6
    }

    @Override // com.sma.smartv3.ui.ai.AIAnswerBaseActivity
    public void inputContent(@aa1 String r3) {
        Intrinsics.X0O(r3, "content");
        AIFunctionType r0 = AIFunctionType.DAILY_WEEKLY;
        AIFunction r1 = getMAIFunction();
        if (r1 == null) goto L5;
        AIFunctionType r2 = r1.getType();
    L6:
        if (r0 == r2) goto L8;
    L14:
        super.inputContent(r3);
        return;
    L8:
        if (this.mTabList.size() > 0) goto L10;
    L12:
        dismissLoading();
        ToastUtils.showLong(getString(R.string.daily_weekly_no_selete_tip), new Object[0]);
        return;
    L10:
        if (((OXO1) CollectionsKt___CollectionsKt.Xi1XO00(this.mTabList)).IiI10X().length() <= 0) goto L12;
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.sma.smartv3.ui.ai.AIAnswerBaseActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_answer;
    }

    @Override // com.sma.smartv3.ui.ai.AIAnswerBaseActivity
    public void sendAIQuestion(@aa1 String r5) {
        Intrinsics.X0O(r5, "content");
        addSendRecord(r5);
        AIFunction r0 = getMAIFunction();
        String r1 = null;
        if (r0 == null) goto L5;
        AIFunctionType r2 = r0.getType();
    L6:
        if (r2 != null) goto L8;
        int r3 = -1;
    L9:
        switch(r3) {
            case 3: goto L14;
            case 4: goto L14;
            case 5: goto L14;
            case 6: goto L10;
            case 7: goto L14;
            case 8: goto L14;
            case 9: goto L14;
            case 10: goto L14;
            case 11: goto L14;
            default: goto L10;
        };
    L10:
        String r4 = getString(R.string.ai_help_me_write);
        AIFunction r6 = getMAIFunction();
        if (r6 == null) goto L13;
        r1 = r6.getDetailsQuestion();
    L13:
        String r7 = stitchTabText(r4 + r1 + ", " + getString(R.string.ai_help_me_write_describe) + r5);
    L18:
        addReceivedRecord();
        super.sendAIQuestion(r7);
        return;
    L14:
        String r8 = stitchTabText(r5);
        StringCompanionObject r9 = StringCompanionObject.OXO1;
        AIFunction r10 = getMAIFunction();
        if (r10 == null) goto L17;
        r1 = r10.getDetailsQuestion();
    L17:
        Intrinsics.XXI(r1);
        r7 = String.format(r1, Arrays.copyOf(new Object[]{r8}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        goto L18
    L8:
        r3 = XIi00iiXO.OXO1[r2.ordinal()];
        goto L9
    L5:
        r2 = null;
        goto L6
    }

    public final void setMLayoutInflater(@aa1 LayoutInflater r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLayoutInflater = r2;
    }
}
