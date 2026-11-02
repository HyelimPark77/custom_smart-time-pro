package com.sma.smartv3.ui.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.fi6;
import com.android.mltcode.paycertificationapi.gi6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hi6;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii6;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.ji6;
import com.android.mltcode.paycertificationapi.ki6;
import com.android.mltcode.paycertificationapi.li6;
import com.android.mltcode.paycertificationapi.mi6;
import com.android.mltcode.paycertificationapi.mp;
import com.android.mltcode.paycertificationapi.ni6;
import com.android.mltcode.paycertificationapi.oi6;
import com.android.mltcode.paycertificationapi.pi6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qi6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.biz.voice.VoiceMessage;
import com.sma.smartv3.biz.voice.v2.VoiceManagerV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.AIBenefitExpiredTipActivity;
import com.sma.smartv3.ui.ai.SearchOnlineActivity;
import com.sma.smartv3.ui.me.AiKeySetActivity;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nVoiceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceActivity.kt\ncom/sma/smartv3/ui/device/VoiceActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n39#2,3:589\n42#2:595\n44#2,2:597\n31#2,2:608\n39#2,3:613\n42#2:619\n44#2,2:621\n31#2,2:634\n31#2,2:638\n1563#3:592\n1634#3,2:593\n1636#3:596\n774#3:610\n865#3,2:611\n1563#3:616\n1634#3,2:617\n1636#3:620\n1869#3,2:632\n1869#3,2:636\n69#4,3:599\n72#4,5:603\n69#4,3:623\n72#4,5:627\n87#4,7:640\n94#4,3:648\n70#4,7:651\n97#4:658\n1#5:602\n1#5:626\n1#5:647\n*S KotlinDebug\n*F\n+ 1 VoiceActivity.kt\ncom/sma/smartv3/ui/device/VoiceActivity\n*L\n391#1:589,3\n391#1:595\n391#1:597,2\n420#1:608,2\n487#1:613,3\n487#1:619\n487#1:621,2\n582#1:634,2\n471#1:638,2\n391#1:592\n391#1:593,2\n391#1:596\n444#1:610\n444#1:611,2\n487#1:616\n487#1:617,2\n487#1:620\n570#1:632,2\n464#1:636,2\n400#1:599,3\n400#1:603,5\n512#1:623,3\n512#1:627,5\n525#1:640,7\n525#1:648,3\n525#1:651,7\n525#1:658\n400#1:602\n512#1:626\n525#1:647\n*E\n"})
public final class VoiceActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy etContent$delegate;
    private MultiItemTypeAdapter<VoiceMessage> mAdapter;
    private int mClicked;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private mp mListPop;

    @aa1
    private List<String> mListPopData;

    @tb1
    private CommonAdapter<String> mListPopupAdapter;

    @tb1
    private go0 mPayTipPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;
    private boolean mRecyclerViewAutoRefresh;

    @aa1
    private String mTitle;

    @aa1
    private final Lazy viewKeyboardHeight$delegate;

    public VoiceActivity() {
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new ii6(this));
        this.etContent$delegate = LazyKt__LazyJVMKt.iO(new ji6(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ki6(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new li6(this));
        this.mTitle = q62.OXO1.XI();
        this.mRecyclerViewAutoRefresh = true;
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new mi6(this));
        this.viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.iO(new ni6(this));
        this.mListPopData = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"准备就绪"});
    }

    public static /* synthetic */ void I0iXXO(Ref.IntRef r0, VoiceActivity r1) {
        processingEditTextKeyboard$lambda$0(r0, r1);
    }

    public static /* synthetic */ View I1XOi1(VoiceActivity r0) {
        return viewKeyboardHeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(VoiceActivity r0) {
        return onTitleRightClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(VoiceActivity r0, View r1, MotionEvent r2) {
        return touchListener$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ ImageView OIX0iXi(VoiceActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OiIIX101O(VoiceActivity r0) {
        return showPayTipPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ ImageView X0O(VoiceActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(VoiceActivity r0) {
        return etContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XX0(VoiceActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(VoiceActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XiOIO(VoiceActivity r0, Ref.IntRef r1, int r2) {
        processingEditTextKeyboard$lambda$1(r0, r1, r2);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(VoiceActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(VoiceActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(VoiceActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ MultiItemTypeAdapter access$getMAdapter$p(VoiceActivity r0) {
        return r0.mAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getMRecyclerView(VoiceActivity r0) {
        return r0.getMRecyclerView();
    }

    public static final /* synthetic */ String access$getMTitle$p(VoiceActivity r0) {
        return r0.mTitle;
    }

    public static final /* synthetic */ View access$getViewKeyboardHeight(VoiceActivity r0) {
        return r0.getViewKeyboardHeight();
    }

    public static final /* synthetic */ void access$resetPlayStatus(VoiceActivity r0) {
        r0.resetPlayStatus();
    }

    private static final EditText etContent_delegate$lambda$0(VoiceActivity r1) {
        return (EditText) r1.findViewById(R.id.et_chat_content);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final EditText getEtContent() {
        return (EditText) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final View getViewKeyboardHeight() {
        return (View) getValue();
    }

    public static /* synthetic */ TextView iIiiO(VoiceActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(VoiceActivity r1, View r2) {
        r1.startActivity(new Intent(r1, SearchOnlineActivity.class));
    }

    private static final void initView$lambda$1(VoiceActivity r1, View r2) {
        int r3 = r1.mClicked + 1;
        r1.mClicked = r3;
        if (r3 != 10) goto L6;
        r1.mClicked = 0;
        r1.showListPoP();
        return;
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(VoiceActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recycler_view);
    }

    private static final boolean onTitleRightClick$lambda$0$0(VoiceActivity r6) {
        MultiItemTypeAdapter<VoiceMessage> r0 = r6.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        List<VoiceMessage> r2 = r0.getDatas();
        Intrinsics.O10IXXX0X(r2, "getDatas(...)");
        Iterator<T> r3 = r2.iterator();
    L7:
        if (r3.hasNext() == false) goto L11;
        VoiceMessage r4 = (VoiceMessage) r3.next();
        if (r4.getMExtraInfo().length() <= 0) goto L7;
        FileUtils.delete(r4.getMExtraInfo());
        goto L7
    L11:
        MultiItemTypeAdapter<VoiceMessage> r5 = r6.mAdapter;
        if (r5 != null) goto L14;
        Intrinsics.XXO("mAdapter");
        r5 = null;
    L14:
        r5.getDatas().clear();
        MultiItemTypeAdapter<VoiceMessage> r7 = r6.mAdapter;
        if (r7 != null) goto L17;
        Intrinsics.XXO("mAdapter");
        r7 = null;
    L17:
        r7.notifyDataSetChanged();
        SPUtils r8 = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> r9 = r6.mAdapter;
        if (r9 != null) goto L20;
        Intrinsics.XXO("mAdapter");
    L21:
        List<VoiceMessage> r10 = r1.getDatas();
        Intrinsics.O10IXXX0X(r10, "getDatas(...)");
        r8.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r10));
        return true;
    L20:
        r1 = r9;
        goto L21
    }

    private final void processingEditTextKeyboard() {
        final Ref.IntRef r0 = new Ref.IntRef();
        r0.element = -1;
        getMRecyclerView().post(new qi6(r0, this));
        KeyboardUtils.registerSoftInputChangedListener(getWindow(), new gi6(this, r0));
    }

    private static final void processingEditTextKeyboard$lambda$0(Ref.IntRef r0, VoiceActivity r1) {
        r0.element = r1.getMRecyclerView().getHeight();
    }

    private static final void processingEditTextKeyboard$lambda$1(VoiceActivity r6, Ref.IntRef r7, int r8) {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r6), null, null, new VoiceActivity$processingEditTextKeyboard$2$1(r6, r8, r7, null), 3, null);
    }

    private final void refreshView() {
        MultiItemTypeAdapter<VoiceMessage> r0 = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        r0.notifyDataSetChanged();
        if (this.mRecyclerViewAutoRefresh == false) goto L16;
        RecyclerView.ItemAnimator r2 = getMRecyclerView().getItemAnimator();
        if (r2 == null) goto L10;
        r2.endAnimations();
    L10:
        RecyclerView r3 = getMRecyclerView();
        MultiItemTypeAdapter<VoiceMessage> r4 = this.mAdapter;
        if (r4 != null) goto L13;
        Intrinsics.XXO("mAdapter");
    L14:
        r3.scrollToPosition(r1.getDatas().size() - 1);
        return;
    L13:
        r1 = r4;
        goto L14
    }

    private final void resetPlayStatus() {
        MultiItemTypeAdapter<VoiceMessage> r0 = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        List<VoiceMessage> r2 = r0.getDatas();
        Intrinsics.O10IXXX0X(r2, "getDatas(...)");
        Iterator<T> r3 = r2.iterator();
    L7:
        if (r3.hasNext() == false) goto L11;
        VoiceMessage r4 = (VoiceMessage) r3.next();
        if (r4.getMType() != 3) goto L7;
        r4.setMStatus(0);
        goto L7
    L11:
        MultiItemTypeAdapter<VoiceMessage> r5 = this.mAdapter;
        if (r5 != null) goto L14;
        Intrinsics.XXO("mAdapter");
    L15:
        r1.notifyDataSetChanged();
        return;
    L14:
        r1 = r5;
        goto L15
    }

    public static /* synthetic */ void showPayTipPopup$default(VoiceActivity r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = R.string.points_insufficient_tip;
    L5:
        r0.showPayTipPopup(r1);
    }

    private static final boolean showPayTipPopup$lambda$0$0(VoiceActivity r4) {
        String r0 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r0);
        r1.putInt("mArg1", 2);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", null);
        Intent r2 = new Intent(r4, GoogleWebViewActivity.class);
        r2.putExtras(r1);
        r4.startActivity(r2);
        return true;
    }

    private static final boolean touchListener$lambda$0(VoiceActivity r1, View r2, MotionEvent r3) {
        if (r3.getAction() != 2) goto L5;
        r1.mRecyclerViewAutoRefresh = false;
    L5:
        return false;
    }

    private static final View viewKeyboardHeight_delegate$lambda$0(VoiceActivity r1) {
        return r1.findViewById(R.id.view_keyboard_height);
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
    }

    public final int getQueryAIMode() {
        if (i72.OXO1.I0IIOI() == true) goto L6;
        return -1;
    L6:
        int r0 = q62.OXO1.iXiX011();
        MultiItemTypeAdapter<VoiceMessage> r1 = this.mAdapter;
        if (r1 != null) goto L9;
        Intrinsics.XXO("mAdapter");
        r1 = null;
    L9:
        List<VoiceMessage> r2 = r1.getDatas();
        Intrinsics.O10IXXX0X(r2, "getDatas(...)");
        ArrayList r3 = new ArrayList();
        Iterator<T> r4 = r2.iterator();
    L11:
        if (r4.hasNext() == false) goto L16;
        Object r5 = r4.next();
        if (((VoiceMessage) r5).getMType() != 2) goto L11;
        r3.add(r5);
        goto L11
    L16:
        if (r3.isEmpty() == true) goto L18;
        r0 = ((VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(r3)).getMAIMode();
    L18:
        VoiceManager.INSTANCE.setAIMode(r0);
        return r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<VoiceMessage> initList() {
        JsonArray r1 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r1);     // Catch: Exception -> L8
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L8
    L5:
        if (r3.hasNext() == false) goto L10;
        r2.add(new Gson().fromJson(r3.next(), VoiceMessage.class));     // Catch: Exception -> L8
    L10:
        return CollectionsKt___CollectionsKt.OO0Oi10(r2);
    L8:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L10
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(this.mTitle);
        getAbhTitleRight().setVisibility(0);
        if (q62.OXO1.i0Ii001() == false) goto L5;
        getAbhTitleOtherRight().setVisibility(0);
    L5:
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_network_settings_icon);
        getAbhTitleOtherRight().setOnClickListener(new oi6(this));
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMContext(), 3));
        touchListener();
        final List<VoiceMessage> r0 = initList();
        this.mAdapter = new AnonymousClass2(this, r0);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r1 = getMRecyclerView();
        MultiItemTypeAdapter<VoiceMessage> r2 = this.mAdapter;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mAdapter");
        r2 = null;
    L8:
        r1.setAdapter(r2);
        refreshView();
        a01.OXO1.OXO1().put(b01.iIXX0i, false);
        processingEditTextKeyboard();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_voice;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        resetPlayStatus();
        mp r0 = this.mListPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        SPUtils r1 = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> r2 = this.mAdapter;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mAdapter");
        r2 = null;
    L8:
        List<VoiceMessage> r3 = r2.getDatas();
        Intrinsics.O10IXXX0X(r3, "getDatas(...)");
        r1.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r3));
        I01XX0.XIi00iiXO(I01XX0.i100IXOX, null, 2, null);
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onSend(@aa1 View r27) {
        Intrinsics.X0O(r27, "view");
        q62 r1 = q62.OXO1;
        if (r1.IiX1ii() == false) goto L5;
    L12:
        Editable r2 = getEtContent().getText();
        if (r2 == null) goto L18;
        String r3 = r2.toString();
        if (r3 == null) goto L18;
        String r8 = r3;
    L20:
        if (TextUtils.isEmpty(r8) == false) goto L22;
        return;
    L22:
        if (VoiceManager.INSTANCE.isTaskRunning() == false) goto L25;
        ToastUtils.showLong(R.string.task_running_wait_tip);
        return;
    L25:
        KeyboardUtils.hideSoftInput(this);
        MultiItemTypeAdapter<VoiceMessage> r4 = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> r14 = null;
        if (r4 != null) goto L28;
        Intrinsics.XXO("mAdapter");
        r4 = null;
    L28:
        r4.getDatas().add(new VoiceMessage(0, null, 1, r8, null, 0, 0, 115, null));
        MultiItemTypeAdapter<VoiceMessage> r5 = this.mAdapter;
        if (r5 != null) goto L31;
        Intrinsics.XXO("mAdapter");
        r5 = null;
    L31:
        r5.getDatas().add(new VoiceMessage(0, null, 2, "", null, 1, getQueryAIMode(), 19, null));
        SPUtils r6 = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> r7 = this.mAdapter;
        if (r7 != null) goto L34;
        Intrinsics.XXO("mAdapter");
    L35:
        List<VoiceMessage> r9 = r14.getDatas();
        Intrinsics.O10IXXX0X(r9, "getDatas(...)");
        r6.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(r9));
        refreshView();
        this.mRecyclerViewAutoRefresh = true;
        if (r1.I1OX() == false) goto L38;
        VoiceManagerV2 r10 = VoiceManagerV2.INSTANCE;
        r10.stop();
        r10.onAIResultConsumption(r8, 0);
    L39:
        getEtContent().setText("");
        return;
    L38:
        I01XX0.OXO1(I01XX0.iIi1, r8);
        goto L39
    L34:
        r14 = r7;
    L18:
        r8 = "";
        goto L20
    L5:
        if (r1.OIXOOi() == true) goto L12;
        if (TextUtils.isEmpty(r1.iIiiO()) == false) goto L12;
        if (r1.XOX() == true) goto L12;
        ToastUtils.showLong(R.string.no_ai_key);
        startActivity(new Intent(this, AiKeySetActivity.class));
    }

    @sf5(tag = I01XX0.X00O0)
    public final void onSendVoice(@aa1 Object r6) {
        Intrinsics.X0O(r6, "data");
        MultiItemTypeAdapter<VoiceMessage> r7 = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> r1 = null;
        if (r7 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r7 = null;
    L5:
        r7.getDatas().clear();
        MultiItemTypeAdapter<VoiceMessage> r8 = this.mAdapter;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mAdapter");
    L9:
        List<VoiceMessage> r9 = r1.getDatas();
        JsonArray r2 = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L15
        Intrinsics.XXI(r2);     // Catch: Exception -> L15
        Collection<? extends VoiceMessage> r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));     // Catch: Exception -> L15
        Iterator<JsonElement> r4 = r2.iterator();     // Catch: Exception -> L15
    L12:
        if (r4.hasNext() == false) goto L16;
        r3.add(new Gson().fromJson(r4.next(), VoiceMessage.class));     // Catch: Exception -> L15
    L16:
        r9.addAll(r3);
        refreshView();
        return;
    L15:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L16
    L8:
        r1 = r8;
        goto L9
    }

    @sf5(tag = I01XX0.X111IO)
    public final void onSendVoiceAutoRefresh(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        this.mRecyclerViewAutoRefresh = true;
    }

    @sf5(tag = b01.X1i)
    public final void onTakeOverVoiceLog(@aa1 String r2) {
        Intrinsics.X0O(r2, "data");
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mDeletePopup != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.O1O(R.string.delete_record_remind);
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.delete, new fi6(this));
        this.mDeletePopup = r5;
    L5:
        go0 r6 = this.mDeletePopup;
        if (r6 == null) goto L9;
        r6.IIX1OXO();
        return;
    }

    @sf5(tag = b01.II1)
    public final void onVoiceMember(@aa1 String r3) {
        Intrinsics.X0O(r3, "data");
        int r0 = r3.hashCode();
        if (r0 == 1596802) goto L22;
        switch(r0) {
            case 1626588: goto L17;
            case 1626589: goto L12;
            case 1626590: goto L7;
            default: goto L26;
        };
    L26:
        return;
    L7:
        if (r3.equals("5003") == false) goto L27;
        startActivity(new Intent(this, AIBenefitExpiredTipActivity.class));
        return;
    L27:
        return;
    L12:
        if (r3.equals("5002") == false) goto L28;
        showPayTipPopup(R.string.ai_benefit_expired_tip);
        return;
    L28:
        return;
    L17:
        if (r3.equals("5001") == false) goto L29;
        showPayTipPopup(R.string.ai_benefit_buy_tip);
        return;
    L29:
        return;
    L22:
        if (r3.equals("4006") == false) goto L25;
        showPayTipPopup(R.string.points_insufficient_tip);
        return;
    }

    public final void setMRecyclerViewAutoRefresh(boolean r1) {
        this.mRecyclerViewAutoRefresh = r1;
    }

    public final void showListPoP() {
        if (this.mListPopupAdapter != null) goto L6;
        final Activity r0 = getMContext();
        final List r1 = CollectionsKt___CollectionsKt.OO0Oi10(this.mListPopData);
        this.mListPopupAdapter = new AnonymousClass1(r0, r1);
    L6:
        if (this.mListPop != null) goto L10;
        mp r2 = new mp(this, R.layout.pop_list2);
        r2.X11iII1O1(this.mListPopupAdapter);
        this.mListPop = r2;
        r2.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#66000000")));
        mp r3 = this.mListPop;
        if (r3 == null) goto L10;
        r3.I0iXXO(false);
    L10:
        mp r4 = this.mListPop;
        if (r4 == null) goto L14;
        TextView r5 = getAbhTitleCenter();
        Intrinsics.O10IXXX0X(r5, "<get-abhTitleCenter>(...)");
        r4.XiOIO(r5);
        return;
    }

    public final void showPayTipPopup(int r6) {
        if (this.mPayTipPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(r6));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new pi6(this));
        this.mPayTipPopup = r0;
    L5:
        go0 r7 = this.mPayTipPopup;
        if (r7 != null) goto L8;
    L10:
        go0 r8 = this.mPayTipPopup;
        if (r8 == null) goto L14;
        r8.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r7.isShowing() != true) goto L10;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMRecyclerView().setOnTouchListener(new hi6(this));
    }
}
