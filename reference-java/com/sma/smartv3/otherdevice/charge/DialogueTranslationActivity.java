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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.z16;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
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
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LeftAndRightPlayControl;
import com.sma.smartv3.otherdevice.charge.DialogueTranslationActivity;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.szabh.smable3.component.BleConnector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDialogueTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogueTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,600:1\n85#2,3:601\n85#2,3:604\n85#2,3:645\n85#2,3:648\n173#3,7:607\n180#3,3:615\n143#3,7:618\n183#3:625\n173#3,7:626\n180#3,3:634\n143#3,7:637\n183#3:644\n87#3,7:653\n94#3,3:661\n70#3,7:664\n97#3:671\n1#4:614\n1#4:633\n1#4:660\n1869#5,2:651\n*S KotlinDebug\n*F\n+ 1 DialogueTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/DialogueTranslationActivity\n*L\n211#1:601,3\n212#1:604,3\n569#1:645,3\n584#1:648,3\n523#1:607,7\n523#1:615,3\n523#1:618,7\n523#1:625\n528#1:626,7\n528#1:634,3\n528#1:637,7\n528#1:644\n552#1:653,7\n552#1:661,3\n552#1:664,7\n552#1:671\n523#1:614\n528#1:633\n552#1:660\n494#1:651,2\n*E\n"})
public final class DialogueTranslationActivity extends BaseTranslationActivity {
    private long lastScrollTime;
    private MultiItemTypeAdapter<AIRecords> mAdapter;

    @tb1
    private go0 mAllDeleteTipPopup;
    private List<AIRecords> mList;

    @tb1
    private z16 popTip;
    private long showChatTime;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.rootView_delegate$lambda$0(this.f7997IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOO0iOXXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mRecyclerView_delegate$lambda$0(this.f3255IO);
        }
    });

    @aa1
    private final Lazy mChatContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii1I0X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mChatContent_delegate$lambda$0(this.f8550IO);
        }
    });

    @aa1
    private final Lazy mLeftRecording$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I011XiiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mLeftRecording_delegate$lambda$0(this.f1054IO);
        }
    });

    @aa1
    private final Lazy mRightRecording$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00IIiOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mRightRecording_delegate$lambda$0(this.f2363IO);
        }
    });

    @aa1
    private final Lazy mLeftRecordDetail$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0OO11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mLeftRecordDetail_delegate$lambda$0(this.f2883IO);
        }
    });

    @aa1
    private final Lazy mRightRecordDetail$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10II0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.mRightRecordDetail_delegate$lambda$0(this.f4140IO);
        }
    });

    @aa1
    private final Lazy gifImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.gifImg_delegate$lambda$0(this.f5058IO);
        }
    });

    @aa1
    private final Lazy ll_top_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOIXIXiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.ll_top_select_language_delegate$lambda$0(this.f2053IO);
        }
    });

    @aa1
    private final Lazy img_change_big$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0III0i0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.img_change_big_delegate$lambda$0(this.f2445IO);
        }
    });

    @aa1
    private final Lazy ll_left_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10IXOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.ll_left_language_delegate$lambda$0(this.f2624IO);
        }
    });

    @aa1
    private final Lazy ll_right_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XII0OiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.ll_right_language_delegate$lambda$0(this.f2551IO);
        }
    });

    @aa1
    private final Lazy tv_left_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIi0XX1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.tv_left_select_language_delegate$lambda$0(this.f7938IO);
        }
    });

    @aa1
    private final Lazy tv_right_select_language$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Iiii0Xi1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.tv_right_select_language_delegate$lambda$0(this.f2340IO);
        }
    });

    @aa1
    private final Lazy img_Left$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0iOI00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialogueTranslationActivity.img_Left_delegate$lambda$0(this.f3418IO);
        }
    });

    public DialogueTranslationActivity() {
        setMAIFunctionType(AIFunctionType.AI_TRANSLATION.getType());
    }

    private final void addQuestion(String str) {
        setMAIRecords(new AIRecords(0, 0L, null, AIFunctionType.AI_TRANSLATION.getType(), getMAIRecordsType(), str, null, 0, 0, 0, null, null, null, null, null, 0, getTtsVoiceName(), 65479, null));
        List<AIRecords> list = this.mList;
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        AIRecords mAIRecords = getMAIRecords();
        Intrinsics.XXI(mAIRecords);
        list.add(mAIRecords);
        setMRecyclerViewAutoRefresh(true);
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter2 = this.mAdapter;
        if (multiItemTypeAdapter2 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter = multiItemTypeAdapter2;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        scrollView();
        sendTranslate(str);
    }

    private final ImageView getGifImg() {
        return (ImageView) this.gifImg$delegate.getValue();
    }

    private final ImageView getImg_Left() {
        return (ImageView) this.img_Left$delegate.getValue();
    }

    private final ImageView getImg_change_big() {
        return (ImageView) this.img_change_big$delegate.getValue();
    }

    private final LinearLayout getLl_left_language() {
        return (LinearLayout) this.ll_left_language$delegate.getValue();
    }

    private final LinearLayout getLl_right_language() {
        return (LinearLayout) this.ll_right_language$delegate.getValue();
    }

    private final LinearLayout getLl_top_select_language() {
        return (LinearLayout) this.ll_top_select_language$delegate.getValue();
    }

    private final EditText getMChatContent() {
        return (EditText) this.mChatContent$delegate.getValue();
    }

    private final TextView getMLeftRecordDetail() {
        return (TextView) this.mLeftRecordDetail$delegate.getValue();
    }

    private final ImageView getMLeftRecording() {
        return (ImageView) this.mLeftRecording$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final TextView getMRightRecordDetail() {
        return (TextView) this.mRightRecordDetail$delegate.getValue();
    }

    private final ImageView getMRightRecording() {
        return (ImageView) this.mRightRecording$delegate.getValue();
    }

    private final TextView getTv_left_select_language() {
        return (TextView) this.tv_left_select_language$delegate.getValue();
    }

    private final TextView getTv_right_select_language() {
        return (TextView) this.tv_right_select_language$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView gifImg_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (ImageView) dialogueTranslationActivity.findViewById(R.id.pop_recording_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_Left_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (ImageView) dialogueTranslationActivity.findViewById(R.id.translate_left_iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_change_big_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (ImageView) dialogueTranslationActivity.findViewById(R.id.img_change_big);
    }

    private final void initAdapter() {
        List<AIRecords> list = this.mList;
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        this.mAdapter = new MultiItemTypeAdapter<AIRecords>(this, list) { // from class: com.sma.smartv3.otherdevice.charge.DialogueTranslationActivity.initAdapter.1

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.DialogueTranslationActivity$initAdapter$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AIRecords> {
                public static final void IiI10X(AIRecords aIRecords, View view) {
                    MicrosoftSDKManage.X11iII1O1(MicrosoftSDKManage.O1O.OXO1(), aIRecords.getMExtraInfo(), aIRecords.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, 0, 8, null);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                    TextView textView = (TextView) holder.getView(R.id.tv_original);
                    TextView textView2 = (TextView) holder.getView(R.id.tv_translated);
                    textView.setText(mAIRecords.getMContent());
                    textView2.setText(mAIRecords.getMExtraInfo());
                    if (mAIRecords.getMExtraInfo().length() > 0) {
                        holder.setVisible(R.id.iv_play, true);
                    } else {
                        holder.setVisible(R.id.iv_play, false);
                    }
                    holder.setOnClickListener(R.id.iv_play, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XXi1i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DialogueTranslationActivity.C186331.OXO1.IiI10X(mAIRecords, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_binaural_right;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 1;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.DialogueTranslationActivity$initAdapter$1$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<AIRecords> {
                /* JADX INFO: Access modifiers changed from: private */
                public static final void IiI10X(AIRecords aIRecords, View view) {
                    MicrosoftSDKManage.O1O.OXO1().iX1O1(aIRecords.getMExtraInfo(), aIRecords.getTtsVoiceName(), LeftAndRightPlayControl.LEFT_AND_RIGHT, aIRecords.getMType() == 1 ? 8 : 2);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final AIRecords mAIRecords, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAIRecords, "mAIRecords");
                    TextView textView = (TextView) holder.getView(R.id.tv_original);
                    TextView textView2 = (TextView) holder.getView(R.id.tv_translated);
                    textView.setText(mAIRecords.getMContent());
                    textView2.setText(mAIRecords.getMExtraInfo());
                    if (mAIRecords.getMExtraInfo().length() > 0) {
                        holder.setVisible(R.id.iv_play, true);
                    } else {
                        holder.setVisible(R.id.iv_play, false);
                    }
                    holder.setOnClickListener(R.id.translated_play_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OXi1IOi0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DialogueTranslationActivity.C186331.XIi00iiXO.IiI10X(mAIRecords, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_binaural_left;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AIRecords aIRecords, int i) {
                    return aIRecords != null && aIRecords.getMType() == 2;
                }
            }

            {
                addItemViewDelegate(1, new OXO1());
                addItemViewDelegate(2, new XIi00iiXO());
            }
        };
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView mRecyclerView = getMRecyclerView();
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter2 = this.mAdapter;
        if (multiItemTypeAdapter2 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter = multiItemTypeAdapter2;
        }
        mRecyclerView.setAdapter(multiItemTypeAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_left_language_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (LinearLayout) dialogueTranslationActivity.findViewById(R.id.ll_left_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_right_language_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (LinearLayout) dialogueTranslationActivity.findViewById(R.id.ll_right_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout ll_top_select_language_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (LinearLayout) dialogueTranslationActivity.findViewById(R.id.ll_top_select_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mChatContent_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (EditText) dialogueTranslationActivity.findViewById(R.id.et_chat_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mLeftRecordDetail_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (TextView) dialogueTranslationActivity.findViewById(R.id.left_record_detail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mLeftRecording_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (ImageView) dialogueTranslationActivity.findViewById(R.id.left_recording_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (RecyclerView) dialogueTranslationActivity.findViewById(R.id.recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mRightRecordDetail_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (TextView) dialogueTranslationActivity.findViewById(R.id.right_record_detail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRightRecording_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (ImageView) dialogueTranslationActivity.findViewById(R.id.right_recording_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return dialogueTranslationActivity.findViewById(R.id.root_view);
    }

    private final void scrollView() {
        RecyclerView.ItemAnimator itemAnimator = getMRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        this.lastScrollTime = System.currentTimeMillis();
        if (getMRecyclerViewAutoRefresh()) {
            RecyclerView.LayoutManager layoutManager = getMRecyclerView().getLayoutManager();
            Intrinsics.X1ii(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            List<AIRecords> list = this.mList;
            if (list == null) {
                Intrinsics.XXO("mList");
                list = null;
            }
            linearLayoutManager.scrollToPositionWithOffset(CollectionsKt__CollectionsKt.X11iII1O1(list), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$1(DialogueTranslationActivity dialogueTranslationActivity) {
        List<AIRecords> list = dialogueTranslationActivity.mList;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        for (AIRecords aIRecords : list) {
            aIRecords.setMIsDelete(1);
            aIRecords.setMIsSync(0);
        }
        AIRecordsDao mRecordsDao = dialogueTranslationActivity.getMRecordsDao();
        List<AIRecords> list2 = dialogueTranslationActivity.mList;
        if (list2 == null) {
            Intrinsics.XXO("mList");
            list2 = null;
        }
        mRecordsDao.update(list2);
        List<AIRecords> list3 = dialogueTranslationActivity.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
            list3 = null;
        }
        list3.clear();
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = dialogueTranslationActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTranslationTipPopup() {
        if (this.popTip == null) {
            z16 z16Var = new z16(this);
            z16Var.X11iII1O1(getString(R.string.dialogue_tip_1));
            z16Var.XXX11i(getString(R.string.dialogue_tip_2));
            z16Var.XXIIO1i11(Integer.valueOf(R.drawable.ic_dialogue_tip));
            z16Var.X1IX(Boolean.valueOf(a01.OXO1.OXO1().getBoolean(b01.XOOXII, false)));
            z16Var.m3361iX().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.I0IOXOOX
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DialogueTranslationActivity.showTranslationTipPopup$lambda$0$0(compoundButton, z);
                }
            });
            z16Var.OII().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1X00O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogueTranslationActivity.showTranslationTipPopup$lambda$0$1(this.f2772IO, view);
                }
            });
            this.popTip = z16Var;
        }
        z16 z16Var2 = this.popTip;
        if (z16Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            z16Var2.XiOIO(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTranslationTipPopup$lambda$0$0(CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        LogUtils.m11128d("isChecked = " + z);
        a01.OXO1.OXO1().put(b01.XOOXII, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTranslationTipPopup$lambda$0$1(DialogueTranslationActivity dialogueTranslationActivity, View view) {
        String str;
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null)) {
            str = "2";
        } else {
            str = q62Var.X0100I() ? "3" : "1";
        }
        int iM38573iO = WebViewActivity.Companion.m38573iO();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/videoPlayer/?type=" + str + "&id=4");
        bundle.putInt("mArg1", iM38573iO);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(dialogueTranslationActivity, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        dialogueTranslationActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRotateAnimation$lambda$0(RotateAnimation rotateAnimation, RotateAnimation rotateAnimation2, DialogueTranslationActivity dialogueTranslationActivity) {
        rotateAnimation.cancel();
        rotateAnimation2.cancel();
        dialogueTranslationActivity.getMTransformLanguageImg().clearAnimation();
        dialogueTranslationActivity.getImg_change_big().clearAnimation();
        dialogueTranslationActivity.setSwitchRotateAnimation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchListener$lambda$0(DialogueTranslationActivity dialogueTranslationActivity, View view) {
        dialogueTranslationActivity.getLl_top_select_language().setVisibility(8);
        if (RecordingManager.Companion.getInstance().isRecording()) {
            dialogueTranslationActivity.stopRecording(true);
            DcsTtsPlayer.INSTANCE.stop();
            dialogueTranslationActivity.getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
            dialogueTranslationActivity.getGifImg().setVisibility(8);
            dialogueTranslationActivity.getMLeftRecordDetail().setText(dialogueTranslationActivity.getString(R.string.click_ear_phone_record));
            return;
        }
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        dialogueTranslationActivity.getMLeftRecording().setImageResource(R.drawable.ic_earphone_recording);
        dialogueTranslationActivity.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
        dialogueTranslationActivity.clickDownRecording(2);
        dialogueTranslationActivity.getMLeftRecordDetail().setText(dialogueTranslationActivity.getString(R.string.click_close_record));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchListener$lambda$1(DialogueTranslationActivity dialogueTranslationActivity, View view) {
        dialogueTranslationActivity.getLl_top_select_language().setVisibility(8);
        if (RecordingManager.Companion.getInstance().isRecording()) {
            dialogueTranslationActivity.stopRecording(true);
            DcsTtsPlayer.INSTANCE.stop();
            dialogueTranslationActivity.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
            dialogueTranslationActivity.getGifImg().setVisibility(8);
            dialogueTranslationActivity.getMRightRecordDetail().setText(dialogueTranslationActivity.getString(R.string.click_mobile_phone_record));
            return;
        }
        VoiceManager.INSTANCE.setRecordBluetooth(false);
        dialogueTranslationActivity.getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        dialogueTranslationActivity.getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_recording);
        dialogueTranslationActivity.clickDownRecording(1);
        dialogueTranslationActivity.getMRightRecordDetail().setText(dialogueTranslationActivity.getString(R.string.click_close_record));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$2(DialogueTranslationActivity dialogueTranslationActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            dialogueTranslationActivity.setMRecyclerViewAutoRefresh(false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_left_select_language_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (TextView) dialogueTranslationActivity.findViewById(R.id.tv_left_select_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_right_select_language_delegate$lambda$0(DialogueTranslationActivity dialogueTranslationActivity) {
        return (TextView) dialogueTranslationActivity.findViewById(R.id.tv_right_select_language);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void addList() {
        AIRecords mAIRecords = getMAIRecords();
        if (mAIRecords != null) {
            List<AIRecords> list = this.mList;
            if (list == null) {
                Intrinsics.XXO("mList");
                list = null;
            }
            list.add(mAIRecords);
        }
    }

    public final void clickDownRecording(int i) {
        if (getMAIRecordsType() != i) {
            stopRecording(true);
        }
        setMAIRecordsType(i);
        if (!PermissionUtils.isGranted(PermissionConstants.MICROPHONE)) {
            permission();
        } else {
            setLangAndVoice();
            startRecording();
        }
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
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
    }

    @aa1
    public final List<AIRecords> initList() {
        ArrayList arrayList = new ArrayList();
        this.mList = arrayList;
        return arrayList;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int i;
        super.initView();
        initList();
        initViewTranslate();
        initAdapter();
        touchListener();
        scrollView();
        ImageView img_Left = getImg_Left();
        q62 q62Var = q62.OXO1;
        if (q62Var.X0100I()) {
            getMLeftRecording().setImageResource(R.drawable.ic_ringphone_record);
            getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record2));
            i = R.drawable.ic_left_ear_ring;
        } else if (q62.OiO0IOX(q62Var, null, 1, null) || !BleConnector.INSTANCE.isBound()) {
            getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
            getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record));
            i = R.drawable.ic_left_ear;
        } else {
            getMLeftRecording().setImageResource(R.drawable.ic_watchphone_record);
            getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record2));
            i = R.drawable.ic_left_ear_watch;
        }
        img_Left.setBackgroundResource(i);
    }

    public final void initViewTranslate() {
        getTv_left_select_language().setText(getMLeftLanguage().getName());
        getTv_right_select_language().setText(getMRightLanguage().getName());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleCenter().setVisibility(8);
        getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IIOX10O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1628IO.showTranslationTipPopup();
            }
        });
        if (!a01.OXO1.OXO1().getBoolean(b01.XOOXII, false)) {
            getRootView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I0IXiI0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1132IO.showTranslationTipPopup();
                }
            });
        }
        getImg_change_big().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IiXXXi1I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2303IO.startRotateAnimation();
            }
        });
    }

    public final void isShowTime(@aa1 TextView tvTime, long j) {
        int i;
        Intrinsics.X0O(tvTime, "tvTime");
        long j2 = this.showChatTime;
        if (j2 == 0 || j - j2 > 300000) {
            this.showChatTime = j;
            tvTime.setText(O0X11OiO.m793iI().format(Long.valueOf(j)));
            i = 0;
        } else {
            i = 8;
        }
        tvTime.setVisibility(i);
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_dialogue_translation;
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void notifyViewData() {
        super.notifyViewData();
        MultiItemTypeAdapter<AIRecords> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        scrollView();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0) {
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("language") : null;
                Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) serializableExtra;
                if (Intrinsics.XOO0ii0(languageTranslationData.getName(), getMRightLanguage().getName())) {
                    setSwitchRotateAnimation(true);
                    startRotateAnimation();
                    return;
                }
                setMLeftLanguage(languageTranslationData);
                getMTransformLanguageLeftTv().setText(getMLeftLanguage().getName());
                getTv_left_select_language().setText(getMLeftLanguage().getName());
                a01.OXO1.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
                I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
                return;
            }
            if (i != 1) {
                return;
            }
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("language") : null;
            Intrinsics.X1ii(serializableExtra2, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
            LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) serializableExtra2;
            if (Intrinsics.XOO0ii0(getMLeftLanguage().getName(), languageTranslationData2.getName())) {
                setSwitchRotateAnimation(true);
                startRotateAnimation();
                return;
            }
            setMRightLanguage(languageTranslationData2);
            getMTransformLanguageRightTv().setText(getMRightLanguage().getName());
            getTv_right_select_language().setText(getMRightLanguage().getName());
            a01.OXO1.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        }
    }

    public final void onSend(@aa1 View view) {
        String string;
        Intrinsics.X0O(view, "view");
        Editable text = getMChatContent().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            ToastUtils.showLong(getString(R.string.enter_content), new Object[0]);
            return;
        }
        KeyboardUtils.hideSoftInput(this);
        getMChatContent().getText().clear();
        setLangAndVoice();
        addQuestion(string);
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showDeleteTipPopup();
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void onTranslationLanguage(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        switch (view.getId()) {
            case R.id.dialogue_translation_left_tv /* 2131362573 */:
            case R.id.ll_left_language /* 2131363583 */:
                LanguageTranslationData mLeftLanguage = getMLeftLanguage();
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", null);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", mLeftLanguage);
                Intent intent = new Intent(this, (Class<?>) ChooseLanguageActivity.class);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                break;
            case R.id.dialogue_translation_right_tv /* 2131362574 */:
            case R.id.ll_right_language /* 2131363609 */:
                LanguageTranslationData mRightLanguage = getMRightLanguage();
                Bundle bundle2 = new Bundle();
                bundle2.putString("mArg0", null);
                bundle2.putParcelable("mArg2", null);
                bundle2.putSerializable("mArg3", mRightLanguage);
                Intent intent2 = new Intent(this, (Class<?>) ChooseLanguageActivity.class);
                intent2.putExtras(bundle2);
                startActivityForResult(intent2, 1);
                break;
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void saveDBRecord() {
        super.saveDBRecord();
        AIRecords mAIRecords = getMAIRecords();
        Intrinsics.XXI(mAIRecords);
        addSendRecord(mAIRecords);
    }

    public final void setPopTip(@tb1 z16 z16Var) {
        this.popTip = z16Var;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_list));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.O101iX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DialogueTranslationActivity.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.I0Xi1OO0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DialogueTranslationActivity.showDeleteTipPopup$lambda$0$1(this.f1244IO));
                }
            });
            this.mAllDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mAllDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void showRecordingPopup() {
        Glide.with((FragmentActivity) this).asGif().load(Integer.valueOf(R.drawable.pop_recording_animation_img)).into(getGifImg());
        getGifImg().setVisibility(0);
        getLl_top_select_language().setVisibility(8);
        RecordingManager.Companion.getInstance().setRecording(true);
        if (getMAIRecordsType() == 2) {
            getMLeftRecording().setImageResource(R.drawable.ic_earphone_recording);
            getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_record);
            getMLeftRecordDetail().setText(getString(R.string.click_close_record));
            getMRightRecordDetail().setText(getString(R.string.click_mobile_phone_record));
            return;
        }
        getMLeftRecording().setImageResource(R.drawable.ic_earphone_record);
        getMRightRecording().setImageResource(R.drawable.ic_mobile_phone_recording);
        getMLeftRecordDetail().setText(getString(R.string.click_ear_phone_record));
        getMRightRecordDetail().setText(getString(R.string.click_close_record));
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void startRotateAnimation() {
        if (getSwitchRotateAnimation()) {
            getMTransformLanguageImg().clearAnimation();
            getImg_change_big().clearAnimation();
            CharSequence text = getMTransformLanguageLeftTv().getText();
            CharSequence text2 = getMTransformLanguageRightTv().getText();
            final RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(500L);
            rotateAnimation.setRepeatCount(-1);
            setSwitchRotateAnimation(false);
            getMTransformLanguageImg().startAnimation(rotateAnimation);
            final RotateAnimation rotateAnimation2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setDuration(500L);
            rotateAnimation2.setRepeatCount(-1);
            getImg_change_big().startAnimation(rotateAnimation2);
            getMTransformLanguageLeftTv().setText(text2);
            getMTransformLanguageRightTv().setText(text);
            getTv_left_select_language().setText(text2);
            getTv_right_select_language().setText(text);
            setMCacheLanguage(getMLeftLanguage());
            setMLeftLanguage(getMRightLanguage());
            LanguageTranslationData mCacheLanguage = getMCacheLanguage();
            Intrinsics.XXI(mCacheLanguage);
            setMRightLanguage(mCacheLanguage);
            a01 a01Var = a01.OXO1;
            a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMLeftLanguage()), false);
            a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getMRightLanguage()), false);
            I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
            getMHandler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XXiXXX
                @Override // java.lang.Runnable
                public final void run() {
                    DialogueTranslationActivity.startRotateAnimation$lambda$0(rotateAnimation, rotateAnimation2, this);
                }
            }, 500L);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMLeftRecording().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i001iX1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogueTranslationActivity.touchListener$lambda$0(this.f7265IO, view);
            }
        });
        getMRightRecording().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X10O0I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogueTranslationActivity.touchListener$lambda$1(this.f4150IO, view);
            }
        });
        getMRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.IO11X00i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogueTranslationActivity.touchListener$lambda$2(this.f1758IO, view, motionEvent);
            }
        });
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseTranslationActivity
    public void upDataLastList() {
        super.upDataLastList();
        List<AIRecords> list = this.mList;
        List<AIRecords> list2 = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        if (list.isEmpty() || getMAIRecords() == null) {
            return;
        }
        List<AIRecords> list3 = this.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
            list3 = null;
        }
        List<AIRecords> list4 = this.mList;
        if (list4 == null) {
            Intrinsics.XXO("mList");
        } else {
            list2 = list4;
        }
        int iX11iII1O1 = CollectionsKt__CollectionsKt.X11iII1O1(list2);
        AIRecords mAIRecords = getMAIRecords();
        Intrinsics.XXI(mAIRecords);
        list3.set(iX11iII1O1, mAIRecords);
    }
}
