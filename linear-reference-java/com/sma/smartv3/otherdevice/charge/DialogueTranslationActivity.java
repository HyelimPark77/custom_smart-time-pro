package com.sma.smartv3.otherdevice.charge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I011XiiI;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0IOXOOX;
import com.android.mltcode.paycertificationapi.I0IXiI0;
import com.android.mltcode.paycertificationapi.I0Xi1OO0;
import com.android.mltcode.paycertificationapi.IIOX10O;
import com.android.mltcode.paycertificationapi.IO11X00i;
import com.android.mltcode.paycertificationapi.IXOIXIXiO;
import com.android.mltcode.paycertificationapi.IiXXXi1I;
import com.android.mltcode.paycertificationapi.Iiii0Xi1i;
import com.android.mltcode.paycertificationapi.O00IIiOX;
import com.android.mltcode.paycertificationapi.O0III0i0I;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0XII0OiI;
import com.android.mltcode.paycertificationapi.O101iX;
import com.android.mltcode.paycertificationapi.O10IXOI;
import com.android.mltcode.paycertificationapi.O1X00O;
import com.android.mltcode.paycertificationapi.OI0OO11;
import com.android.mltcode.paycertificationapi.OOO0iOXXI;
import com.android.mltcode.paycertificationapi.OX0iOI00;
import com.android.mltcode.paycertificationapi.X10II0I;
import com.android.mltcode.paycertificationapi.X10O0I0;
import com.android.mltcode.paycertificationapi.XXOIO;
import com.android.mltcode.paycertificationapi.XXiXXX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i001iX1;
import com.android.mltcode.paycertificationapi.iIi0XX1I;
import com.android.mltcode.paycertificationapi.iO0X;
import com.android.mltcode.paycertificationapi.ii1I0X0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.z16;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.szabh.smable3.component.BleConnector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDialogueTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogueTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,600:1\n85#2,3:601\n85#2,3:604\n85#2,3:645\n85#2,3:648\n173#3,7:607\n180#3,3:615\n143#3,7:618\n183#3:625\n173#3,7:626\n180#3,3:634\n143#3,7:637\n183#3:644\n87#3,7:653\n94#3,3:661\n70#3,7:664\n97#3:671\n1#4:614\n1#4:633\n1#4:660\n1869#5,2:651\n*S KotlinDebug\n*F\n+ 1 DialogueTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity\n*L\n211#1:601,3\n212#1:604,3\n569#1:645,3\n584#1:648,3\n523#1:607,7\n523#1:615,3\n523#1:618,7\n523#1:625\n528#1:626,7\n528#1:634,3\n528#1:637,7\n528#1:644\n552#1:653,7\n552#1:661,3\n552#1:664,7\n552#1:671\n523#1:614\n528#1:633\n552#1:660\n494#1:651,2\n*E\n"})
public final class DialogueTranslationActivity extends BaseTranslationActivity {

    @aa1
    private final Lazy gifImg$delegate;

    @aa1
    private final Lazy img_Left$delegate;

    @aa1
    private final Lazy img_change_big$delegate;
    private long lastScrollTime;

    @aa1
    private final Lazy ll_left_language$delegate;

    @aa1
    private final Lazy ll_right_language$delegate;

    @aa1
    private final Lazy ll_top_select_language$delegate;
    private MultiItemTypeAdapter<AIRecords> mAdapter;

    @tb1
    private go0 mAllDeleteTipPopup;

    @aa1
    private final Lazy mChatContent$delegate;

    @aa1
    private final Lazy mLeftRecordDetail$delegate;

    @aa1
    private final Lazy mLeftRecording$delegate;
    private List<AIRecords> mList;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mRightRecordDetail$delegate;

    @aa1
    private final Lazy mRightRecording$delegate;

    @tb1
    private z16 popTip;

    @aa1
    private final Lazy rootView$delegate;
    private long showChatTime;

    @aa1
    private final Lazy tv_left_select_language$delegate;

    @aa1
    private final Lazy tv_right_select_language$delegate;

    public DialogueTranslationActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iO0X(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new OOO0iOXXI(this));
        this.mChatContent$delegate = LazyKt__LazyJVMKt.iO(new ii1I0X0(this));
        this.mLeftRecording$delegate = LazyKt__LazyJVMKt.iO(new I011XiiI(this));
        this.mRightRecording$delegate = LazyKt__LazyJVMKt.iO(new O00IIiOX(this));
        this.mLeftRecordDetail$delegate = LazyKt__LazyJVMKt.iO(new OI0OO11(this));
        this.mRightRecordDetail$delegate = LazyKt__LazyJVMKt.iO(new X10II0I(this));
        this.gifImg$delegate = LazyKt__LazyJVMKt.iO(new XXOIO(this));
        this.ll_top_select_language$delegate = LazyKt__LazyJVMKt.iO(new IXOIXIXiO(this));
        this.img_change_big$delegate = LazyKt__LazyJVMKt.iO(new O0III0i0I(this));
        this.ll_left_language$delegate = LazyKt__LazyJVMKt.iO(new O10IXOI(this));
        this.ll_right_language$delegate = LazyKt__LazyJVMKt.iO(new O0XII0OiI(this));
        this.tv_left_select_language$delegate = LazyKt__LazyJVMKt.iO(new iIi0XX1I(this));
        this.tv_right_select_language$delegate = LazyKt__LazyJVMKt.iO(new Iiii0Xi1i(this));
        this.img_Left$delegate = LazyKt__LazyJVMKt.iO(new OX0iOI00(this));
        setMAIFunctionType(AIFunctionType.AI_TRANSLATION.getType());
    }

    public static /* synthetic */ TextView I1(DialogueTranslationActivity r0) {
        return mLeftRecordDetail_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(DialogueTranslationActivity r0) {
        return tv_right_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IXXOO(DialogueTranslationActivity r0) {
        return showDeleteTipPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ void Ii1iii0(DialogueTranslationActivity r0, View r1) {
        showTranslationTipPopup$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ boolean O001I() {
        return showDeleteTipPopup$lambda$0$0();
    }

    public static /* synthetic */ LinearLayout O1O(DialogueTranslationActivity r0) {
        return ll_right_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(DialogueTranslationActivity r0) {
        return mRightRecordDetail_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0i1O(DialogueTranslationActivity r0, View r1, MotionEvent r2) {
        return touchListener$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ ImageView X100O(DialogueTranslationActivity r0) {
        return mRightRecording_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X11I(DialogueTranslationActivity r0) {
        return ll_left_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X11iII1O1(DialogueTranslationActivity r0) {
        return img_change_big_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1IX(DialogueTranslationActivity r0, View r1) {
        initViewTranslate$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText XX1Oi(DialogueTranslationActivity r0) {
        return mChatContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXIIO1i11(DialogueTranslationActivity r0, View r1) {
        touchListener$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XXO(DialogueTranslationActivity r0) {
        initViewTranslate$lambda$1(r0);
    }

    public static /* synthetic */ void XXX11i(DialogueTranslationActivity r0, View r1) {
        initViewTranslate$lambda$2(r0, r1);
    }

    private final void addQuestion(String r23) {
        setMAIRecords(new AIRecords(0, 0, null, AIFunctionType.AI_TRANSLATION.getType(), getMAIRecordsType(), r23, null, 0, 0, 0, null, null, null, null, null, 0, getTtsVoiceName(), 65479, null));
        List<AIRecords> r1 = this.mList;
        MultiItemTypeAdapter<AIRecords> r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mList");
        r1 = null;
    L5:
        AIRecords r3 = getMAIRecords();
        Intrinsics.XXI(r3);
        r1.add(r3);
        setMRecyclerViewAutoRefresh(true);
        MultiItemTypeAdapter<AIRecords> r4 = this.mAdapter;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mAdapter");
    L9:
        r2.notifyDataSetChanged();
        scrollView();
        sendTranslate(r23);
        return;
    L8:
        r2 = r4;
        goto L9
    }

    private final ImageView getGifImg() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_Left() {
        return (ImageView) getValue();
    }

    private final ImageView getImg_change_big() {
        return (ImageView) getValue();
    }

    private final LinearLayout getLl_left_language() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLl_right_language() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLl_top_select_language() {
        return (LinearLayout) getValue();
    }

    private final EditText getMChatContent() {
        return (EditText) getValue();
    }

    private final TextView getMLeftRecordDetail() {
        return (TextView) getValue();
    }

    private final ImageView getMLeftRecording() {
        return (ImageView) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final TextView getMRightRecordDetail() {
        return (TextView) getValue();
    }

    private final ImageView getMRightRecording() {
        return (ImageView) getValue();
    }

    private final TextView getTv_left_select_language() {
        return (TextView) getValue();
    }

    private final TextView getTv_right_select_language() {
        return (TextView) getValue();
    }

    private static final ImageView gifImg_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.pop_recording_img);
    }

    public static /* synthetic */ ImageView i010I(DialogueTranslationActivity r0) {
        return img_Left_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iI(DialogueTranslationActivity r0) {
        return gifImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iIXi1iiXI(DialogueTranslationActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iOO1ii1(DialogueTranslationActivity r0) {
        return ll_top_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(DialogueTranslationActivity r0) {
        return tv_left_select_language_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iX(CompoundButton r0, boolean r1) {
        showTranslationTipPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void iX1O1(RotateAnimation r0, RotateAnimation r1, DialogueTranslationActivity r2) {
        startRotateAnimation$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ ImageView iXiX011(DialogueTranslationActivity r0) {
        return mLeftRecording_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iXiiiO(DialogueTranslationActivity r0, View r1) {
        touchListener$lambda$1(r0, r1);
    }

    public static /* synthetic */ RecyclerView iiiO(DialogueTranslationActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    private static final ImageView img_Left_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.translate_left_iv);
    }

    private static final ImageView img_change_big_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_change_big);
    }

    private final void initAdapter() {
        final List<AIRecords> r0 = this.mList;
        MultiItemTypeAdapter<AIRecords> r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        this.mAdapter = new AnonymousClass1(this, r0);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r2 = getMRecyclerView();
        MultiItemTypeAdapter<AIRecords> r3 = this.mAdapter;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mAdapter");
    L9:
        r2.setAdapter(r1);
        return;
    L8:
        r1 = r3;
        goto L9
    }

    private static final void initViewTranslate$lambda$0(DialogueTranslationActivity r0, View r1) {
        r0.showTranslationTipPopup();
    }

    private static final void initViewTranslate$lambda$1(DialogueTranslationActivity r0) {
        r0.showTranslationTipPopup();
    }

    private static final void initViewTranslate$lambda$2(DialogueTranslationActivity r0, View r1) {
        r0.startRotateAnimation();
    }

    private static final LinearLayout ll_left_language_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_left_language);
    }

    private static final LinearLayout ll_right_language_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_right_language);
    }

    private static final LinearLayout ll_top_select_language_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_top_select_language);
    }

    private static final EditText mChatContent_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (EditText) r1.findViewById(R.id.et_chat_content);
    }

    private static final TextView mLeftRecordDetail_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.left_record_detail);
    }

    private static final ImageView mLeftRecording_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.left_recording_img);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recycler_view);
    }

    private static final TextView mRightRecordDetail_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.right_record_detail);
    }

    private static final ImageView mRightRecording_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.right_recording_img);
    }

    private static final View rootView_delegate$lambda$0(DialogueTranslationActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void scrollView() {
        RecyclerView.ItemAnimator r0 = getMRecyclerView().getItemAnimator();
        if (r0 == null) goto L5;
        r0.endAnimations();
    L5:
        this.lastScrollTime = System.currentTimeMillis();
        if (getMRecyclerViewAutoRefresh() == false) goto L12;
        RecyclerView.LayoutManager r1 = getMRecyclerView().getLayoutManager();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager r2 = (LinearLayoutManager) r1;
        List<AIRecords> r3 = this.mList;
        if (r3 != null) goto L10;
        Intrinsics.XXO("mList");
        r3 = null;
    L10:
        r2.scrollToPositionWithOffset(CollectionsKt__CollectionsKt.X11iII1O1(r3), 0);
        return;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$1(DialogueTranslationActivity r5) {
        List<AIRecords> r0 = r5.mList;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        Iterator<T> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        AIRecords r3 = (AIRecords) r1.next();
        r3.setMIsDelete(1);
        r3.setMIsSync(0);
        goto L7
    L9:
        AIRecordsDao r2 = r5.getMRecordsDao();
        List<AIRecords> r4 = r5.mList;
        if (r4 != null) goto L12;
        Intrinsics.XXO("mList");
        r4 = null;
    L12:
        r2.update(r4);
        List<AIRecords> r6 = r5.mList;
        if (r6 != null) goto L15;
        Intrinsics.XXO("mList");
        r6 = null;
    L15:
        r6.clear();
        MultiItemTypeAdapter<AIRecords> r7 = r5.mAdapter;
        if (r7 != null) goto L18;
        Intrinsics.XXO("mAdapter");
        r7 = null;
    L18:
        r7.notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    private final void showTranslationTipPopup() {
        if (this.popTip != null) goto L5;
        z16 r0 = new z16(this);
        r0.X11iII1O1(getString(R.string.dialogue_tip_1));
        r0.XXX11i(getString(R.string.dialogue_tip_2));
        r0.XXIIO1i11(Integer.valueOf(R.drawable.ic_dialogue_tip));
        r0.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.XOOXII, false)));
        r0.iX().setOnCheckedChangeListener(new I0IOXOOX());
        r0.OII().setOnClickListener(new O1X00O(this));
        this.popTip = r0;
    L5:
        z16 r1 = this.popTip;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.XiOIO(r2);
        return;
    }

    private static final void showTranslationTipPopup$lambda$0$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "buttonView");
        LogUtils.d(new Object[]{"isChecked = " + r2});
        a01.OXO1.OXO1().put(b01.XOOXII, r2);
    }

    private static final void showTranslationTipPopup$lambda$0$1(DialogueTranslationActivity r4, View r5) {
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        int r0 = WebViewActivity.Companion.iO();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + r7 + "&id=4");
        r2.putInt("mArg1", r0);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r8 = new Intent(r4, WebViewActivity.class);
        r8.putExtras(r2);
        r4.startActivity(r8);
        return;
    L6:
        if (r6.X0100I() == false) goto L8;
        r7 = "3";
        goto L9
    L8:
        r7 = "1";
        goto L9
    }

    private static final void startRotateAnimation$lambda$0(RotateAnimation r0, RotateAnimation r1, DialogueTranslationActivity r2) {
        r0.cancel();
        r1.cancel();
        r2.getMTransformLanguageImg().clearAnimation();
        r2.getImg_change_big().clearAnimation();
        r2.setSwitchRotateAnimation(true);
    }

    private static final void touchListener$lambda$0(DialogueTranslationActivity r2, View r3) {
        r2.getLl_top_select_language().setVisibility(8);
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r2.stopRecording(true);
        DcsTtsPlayer.INSTANCE.stop();
        r2.getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        r2.getGifImg().setVisibility(8);
        r2.getMLeftRecordDetail().setText(r2.getString(R.string.click_ear_phone_record));
        return;
    L6:
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        r2.getMLeftRecording().setImageResource(R.drawable.ic_earphone_recording);
        r2.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
        r2.clickDownRecording(2);
        r2.getMLeftRecordDetail().setText(r2.getString(R.string.click_close_record));
    }

    private static final void touchListener$lambda$1(DialogueTranslationActivity r2, View r3) {
        r2.getLl_top_select_language().setVisibility(8);
        if (RecordingManager.Companion.getInstance().isRecording() == false) goto L6;
        r2.stopRecording(true);
        DcsTtsPlayer.INSTANCE.stop();
        r2.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
        r2.getGifImg().setVisibility(8);
        r2.getMRightRecordDetail().setText(r2.getString(R.string.click_mobile_phone_record));
        return;
    L6:
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        r2.getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        r2.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_recording);
        r2.clickDownRecording(1);
        r2.getMRightRecordDetail().setText(r2.getString(R.string.click_close_record));
    }

    private static final boolean touchListener$lambda$2(DialogueTranslationActivity r1, View r2, MotionEvent r3) {
        if (r3.getAction() != 2) goto L5;
        r1.setMRecyclerViewAutoRefresh(false);
    L5:
        return false;
    }

    private static final TextView tv_left_select_language_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_left_select_language);
    }

    private static final TextView tv_right_select_language_delegate$lambda$0(DialogueTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_right_select_language);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void addList() {
        AIRecords r0 = getMAIRecords();
        if (r0 == null) goto L9;
        List<AIRecords> r1 = this.mList;
        if (r1 != null) goto L7;
        Intrinsics.XXO("mList");
        r1 = null;
    L7:
        r1.add(r0);
        return;
    }

    public final void clickDownRecording(int r2) {
        if (getMAIRecordsType() == r2) goto L5;
        stopRecording(true);
    L5:
        setMAIRecordsType(r2);
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE}) == false) goto L9;
        setLangAndVoice();
        startRecording();
        return;
    L9:
        permission();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void disRecordingPopup() {
        getGifImg().setVisibility(8);
        getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record));
        getMRightRecordDetail().setText(getString(R.string.click_mobile_phone_record));
    }

    @tb1
    public final z16 getPopTip() {
        return this.popTip;
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        super.init(r1);
    }

    @aa1
    public final List<AIRecords> initList() {
        ArrayList r0 = new ArrayList();
        this.mList = r0;
        return r0;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        initList();
        initViewTranslate();
        initAdapter();
        touchListener();
        scrollView();
        ImageView r0 = getImg_Left();
        q62 r1 = q62.OXO1;
        if (r1.X0100I() == false) goto L6;
        getMLeftRecording().setImageResource(R.drawable.ic_ringphone_record);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record2));
        int r2 = R.drawable.ic_left_ear_ring;
    L11:
        r0.setBackgroundResource(r2);
        return;
    L6:
        if (q62.OiO0IOX(r1, null, 1, null) == false) goto L8;
    L10:
        getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record));
        r2 = R.drawable.ic_left_ear;
        goto L11
    L8:
        if (BleConnector.INSTANCE.isBound() == false) goto L10;
        getMLeftRecording().setImageResource(R.drawable.ic_watchphone_record);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record2));
        r2 = R.drawable.ic_left_ear_watch;
        goto L11
    }

    public final void initViewTranslate() {
        getTv_left_select_language().setText(getMLeftLanguage().getName());
        getTv_right_select_language().setText(getMRightLanguage().getName());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleCenter().setVisibility(8);
        getAbhTitleRight().setOnClickListener(new IIOX10O(this));
        if (a01.OXO1.OXO1().getBoolean(b01.XOOXII, false) == true) goto L5;
        getRootView().post(new I0IXiI0(this));
    L5:
        getImg_change_big().setOnClickListener(new IiXXXi1I(this));
    }

    public final void isShowTime(@aa1 TextView r5, long r6) {
        Intrinsics.X0O(r5, "tvTime");
        long r0 = this.showChatTime;
        if (r0 != 0) goto L5;
    L8:
        this.showChatTime = r6;
        r5.setText(O0X11OiO.iI().format(Long.valueOf(r6)));
        int r7 = 0;
    L9:
        r5.setVisibility(r7);
        return;
    L5:
        if ((r6 - r0) > 300000) goto L8;
        r7 = 8;
        goto L9
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_dialogue_translation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void notifyViewData() {
        super.notifyViewData();
        MultiItemTypeAdapter<AIRecords> r0 = this.mAdapter;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L5:
        r0.notifyDataSetChanged();
        scrollView();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r9, int r10, @tb1 Intent r11) {
        super.onActivityResult(r9, r10, r11);
        if (r10 == (-1)) goto L5;
        return;
    L5:
        if (r9 == 0) goto L17;
        if (r9 != 1) goto L27;
        if (r11 == null) goto L10;
        Serializable r12 = r11.getSerializableExtra("language");
    L11:
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r13 = (LanguageTranslationData) r12;
        if (Intrinsics.XOO0ii0(getMLeftLanguage().getName(), r13.getName()) == true) goto L15;
        setMRightLanguage(r13);
        getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
        getTv_right_select_language().setText(getMRightLanguage().getName());
        a01.OXO1.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L15:
        setSwitchRotateAnimation(true);
        startRotateAnimation();
        return;
    L10:
        r12 = null;
        goto L11
    L27:
        return;
    L17:
        if (r11 == null) goto L19;
        Serializable r14 = r11.getSerializableExtra("language");
    L20:
        Intrinsics.X1ii(r14, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r15 = (LanguageTranslationData) r14;
        if (Intrinsics.XOO0ii0(r15.getName(), getMRightLanguage().getName()) == true) goto L24;
        setMLeftLanguage(r15);
        getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
        getTv_left_select_language().setText(getMLeftLanguage().getName());
        a01.OXO1.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L24:
        setSwitchRotateAnimation(true);
        startRotateAnimation();
        return;
    L19:
        r14 = null;
        goto L20
    }

    public final void onSend(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        Editable r3 = getMChatContent().getText();
        if (r3 == null) goto L6;
        String r4 = r3.toString();
        if (r4 == null) goto L6;
    L8:
        if (r4.length() != 0) goto L11;
        ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
        return;
    L11:
        KeyboardUtils.hideSoftInput(this);
        getMChatContent().getText().clear();
        setLangAndVoice();
        addQuestion(r4);
        return;
    L6:
        r4 = "";
        goto L8
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showDeleteTipPopup();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void onTranslationLanguage(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        switch(r7.getId()) {
            case 2131362573: goto L7;
            case 2131362574: goto L5;
            case 2131363583: goto L7;
            case 2131363609: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        LanguageTranslationData r8 = getMRightLanguage();
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r8);
        Intent r9 = new Intent(this, ChooseLanguageActivity.class);
        r9.putExtras(r5);
        startActivityForResult(r9, 1);
        return;
    L7:
        LanguageTranslationData r10 = getMLeftLanguage();
        Bundle r6 = new Bundle();
        r6.putString("mArg0", null);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", r10);
        Intent r11 = new Intent(this, ChooseLanguageActivity.class);
        r11.putExtras(r6);
        startActivityForResult(r11, 0);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void saveDBRecord() {
        super.saveDBRecord();
        AIRecords r0 = getMAIRecords();
        Intrinsics.XXI(r0);
        addSendRecord(r0);
    }

    public final void setPopTip(@tb1 z16 r1) {
        this.popTip = r1;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_list));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new O101iX());
        r0.X1IX(R.string.confirm, new I0Xi1OO0(this));
        this.mAllDeleteTipPopup = r0;
    L5:
        go0 r1 = this.mAllDeleteTipPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void showRecordingPopup() {
        Glide.with(this).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getGifImg());
        getGifImg().setVisibility(0);
        getLl_top_select_language().setVisibility(8);
        RecordingManager.Companion.getInstance().setRecording(true);
        if (getMAIRecordsType() != 2) goto L6;
        getMLeftRecording().setImageResource(R.drawable.ic_earphone_recording);
        getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
        getMLeftRecordDetail().setText(getString(R.string.click_close_record));
        getMRightRecordDetail().setText(getString(R.string.click_mobile_phone_record));
        return;
    L6:
        getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_recording);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record));
        getMRightRecordDetail().setText(getString(R.string.click_close_record));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (getSwitchRotateAnimation() == false) goto L6;
        getMTransformLanguageImg().clearAnimation();
        getImg_change_big().clearAnimation();
        CharSequence r0 = getMTransformLanguageLeftTv().getText();
        CharSequence r1 = getMTransformLanguageRightTv().getText();
        final RotateAnimation r2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r2.setDuration(500);
        r2.setRepeatCount(-1);
        setSwitchRotateAnimation(false);
        getMTransformLanguageImg().startAnimation(r2);
        final RotateAnimation r8 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r8.setDuration(500);
        r8.setRepeatCount(-1);
        getImg_change_big().startAnimation(r8);
        getMTransformLanguageLeftTv().setText(r1);
        getMTransformLanguageRightTv().setText(r0);
        getTv_left_select_language().setText(r1);
        getTv_right_select_language().setText(r0);
        setMCacheLanguage(getMLeftLanguage());
        setMLeftLanguage(getMRightLanguage());
        LanguageTranslationData r3 = getMCacheLanguage();
        Intrinsics.XXI(r3);
        setMRightLanguage(r3);
        a01 r4 = a01.OXO1;
        r4.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
        r4.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        getMHandler().postDelayed(new XXiXXX(r2, r8, this), 500);
        return;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMLeftRecording().setOnClickListener(new i001iX1(this));
        getMRightRecording().setOnClickListener(new X10O0I0(this));
        getMRecyclerView().setOnTouchListener(new IO11X00i(this));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void upDataLastList() {
        super.upDataLastList();
        List<AIRecords> r0 = this.mList;
        List<AIRecords> r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mList");
        r0 = null;
    L6:
        if (r0.isEmpty() == false) goto L8;
        return;
    L8:
        if (getMAIRecords() == null) goto L19;
        List<AIRecords> r2 = this.mList;
        if (r2 != null) goto L12;
        Intrinsics.XXO("mList");
        r2 = null;
    L12:
        List<AIRecords> r3 = this.mList;
        if (r3 != null) goto L15;
        Intrinsics.XXO("mList");
    L16:
        int r4 = CollectionsKt__CollectionsKt.X11iII1O1(r1);
        AIRecords r5 = getMAIRecords();
        Intrinsics.XXI(r5);
        r2.set(r4, r5);
        return;
    L15:
        r1 = r3;
        goto L16
    }
}
