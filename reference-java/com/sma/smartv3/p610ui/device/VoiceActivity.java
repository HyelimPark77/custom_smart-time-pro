package com.sma.smartv3.p610ui.device;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.android.mltcode.paycertificationapi.C2699mp;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
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
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.biz.voice.p245v2.VoiceManagerV2;
import com.sma.smartv3.p610ui.device.VoiceActivity;
import com.sma.smartv3.p610ui.p611ai.AIBenefitExpiredTipActivity;
import com.sma.smartv3.p610ui.p611ai.SearchOnlineActivity;
import com.sma.smartv3.p610ui.p612me.AiKeySetActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nVoiceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceActivity.kt\ncom/sma/smartv3/ui/device/VoiceActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n39#2,3:589\n42#2:595\n44#2,2:597\n31#2,2:608\n39#2,3:613\n42#2:619\n44#2,2:621\n31#2,2:634\n31#2,2:638\n1563#3:592\n1634#3,2:593\n1636#3:596\n774#3:610\n865#3,2:611\n1563#3:616\n1634#3,2:617\n1636#3:620\n1869#3,2:632\n1869#3,2:636\n69#4,3:599\n72#4,5:603\n69#4,3:623\n72#4,5:627\n87#4,7:640\n94#4,3:648\n70#4,7:651\n97#4:658\n1#5:602\n1#5:626\n1#5:647\n*S KotlinDebug\n*F\n+ 1 VoiceActivity.kt\ncom/sma/smartv3/ui/device/VoiceActivity\n*L\n391#1:589,3\n391#1:595\n391#1:597,2\n420#1:608,2\n487#1:613,3\n487#1:619\n487#1:621,2\n582#1:634,2\n471#1:638,2\n391#1:592\n391#1:593,2\n391#1:596\n444#1:610\n444#1:611,2\n487#1:616\n487#1:617,2\n487#1:620\n570#1:632,2\n464#1:636,2\n400#1:599,3\n400#1:603,5\n512#1:623,3\n512#1:627,5\n525#1:640,7\n525#1:648,3\n525#1:651,7\n525#1:658\n400#1:602\n512#1:626\n525#1:647\n*E\n"})
public final class VoiceActivity extends BaseActivity {
    private MultiItemTypeAdapter<VoiceMessage> mAdapter;
    private int mClicked;

    @tb1
    private go0 mDeletePopup;

    @tb1
    private C2699mp mListPop;

    @tb1
    private CommonAdapter<String> mListPopupAdapter;

    @tb1
    private go0 mPayTipPopup;

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.mRecyclerView_delegate$lambda$0(this.f8564IO);
        }
    });

    @aa1
    private final Lazy etContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ji6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.etContent_delegate$lambda$0(this.f8976IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ki6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.abhTitleRight_delegate$lambda$0(this.f9181IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.li6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.abhTitleOtherRight_delegate$lambda$0(this.f9442IO);
        }
    });

    @aa1
    private String mTitle = q62.OXO1.m2887XI();
    private boolean mRecyclerViewAutoRefresh = true;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mi6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.abhTitleCenter_delegate$lambda$0(this.f9711IO);
        }
    });

    @aa1
    private final Lazy viewKeyboardHeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ni6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceActivity.viewKeyboardHeight_delegate$lambda$0(this.f9946IO);
        }
    });

    @aa1
    private List<String> mListPopData = CollectionsKt__CollectionsKt.Ii1iii0("准备就绪");

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(VoiceActivity voiceActivity) {
        return (TextView) voiceActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(VoiceActivity voiceActivity) {
        return (ImageView) voiceActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(VoiceActivity voiceActivity) {
        return (ImageView) voiceActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etContent_delegate$lambda$0(VoiceActivity voiceActivity) {
        return (EditText) voiceActivity.findViewById(R.id.et_chat_content);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final EditText getEtContent() {
        return (EditText) this.etContent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getViewKeyboardHeight() {
        return (View) this.viewKeyboardHeight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(VoiceActivity voiceActivity, View view) {
        voiceActivity.startActivity(new Intent(voiceActivity, (Class<?>) SearchOnlineActivity.class));
    }

    private static final void initView$lambda$1(VoiceActivity voiceActivity, View view) {
        int i = voiceActivity.mClicked + 1;
        voiceActivity.mClicked = i;
        if (i == 10) {
            voiceActivity.mClicked = 0;
            voiceActivity.showListPoP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(VoiceActivity voiceActivity) {
        return (RecyclerView) voiceActivity.findViewById(R.id.recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleRightClick$lambda$0$0(VoiceActivity voiceActivity) {
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = voiceActivity.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter2 = null;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        for (VoiceMessage voiceMessage : datas) {
            if (voiceMessage.getMExtraInfo().length() > 0) {
                FileUtils.delete(voiceMessage.getMExtraInfo());
            }
        }
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter3 = voiceActivity.mAdapter;
        if (multiItemTypeAdapter3 == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter3 = null;
        }
        multiItemTypeAdapter3.getDatas().clear();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter4 = voiceActivity.mAdapter;
        if (multiItemTypeAdapter4 == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter4 = null;
        }
        multiItemTypeAdapter4.notifyDataSetChanged();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter5 = voiceActivity.mAdapter;
        if (multiItemTypeAdapter5 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter2 = multiItemTypeAdapter5;
        }
        List<VoiceMessage> datas2 = multiItemTypeAdapter2.getDatas();
        Intrinsics.O10IXXX0X(datas2, "getDatas(...)");
        sPUtilsIiI10X.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(datas2));
        return true;
    }

    private final void processingEditTextKeyboard() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        getMRecyclerView().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qi6
            @Override // java.lang.Runnable
            public final void run() {
                VoiceActivity.processingEditTextKeyboard$lambda$0(intRef, this);
            }
        });
        KeyboardUtils.registerSoftInputChangedListener(getWindow(), new KeyboardUtils.OnSoftInputChangedListener() { // from class: com.android.mltcode.paycertificationapi.gi6
            @Override // com.blankj.utilcode.util.KeyboardUtils.OnSoftInputChangedListener
            public final void onSoftInputChanged(int i) {
                VoiceActivity.processingEditTextKeyboard$lambda$1(this.OXO1, intRef, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processingEditTextKeyboard$lambda$0(Ref.IntRef intRef, VoiceActivity voiceActivity) {
        intRef.element = voiceActivity.getMRecyclerView().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processingEditTextKeyboard$lambda$1(VoiceActivity voiceActivity, Ref.IntRef intRef, int i) {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(voiceActivity), null, null, new VoiceActivity$processingEditTextKeyboard$2$1(voiceActivity, i, intRef, null), 3, null);
    }

    private final void refreshView() {
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter2 = null;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.notifyDataSetChanged();
        if (this.mRecyclerViewAutoRefresh) {
            RecyclerView.ItemAnimator itemAnimator = getMRecyclerView().getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            RecyclerView mRecyclerView = getMRecyclerView();
            MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter3 = this.mAdapter;
            if (multiItemTypeAdapter3 == null) {
                Intrinsics.XXO("mAdapter");
            } else {
                multiItemTypeAdapter2 = multiItemTypeAdapter3;
            }
            mRecyclerView.scrollToPosition(multiItemTypeAdapter2.getDatas().size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPlayStatus() {
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter2 = null;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        for (VoiceMessage voiceMessage : datas) {
            if (voiceMessage.getMType() == 3) {
                voiceMessage.setMStatus(0);
            }
        }
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter3 = this.mAdapter;
        if (multiItemTypeAdapter3 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter2 = multiItemTypeAdapter3;
        }
        multiItemTypeAdapter2.notifyDataSetChanged();
    }

    public static /* synthetic */ void showPayTipPopup$default(VoiceActivity voiceActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.points_insufficient_tip;
        }
        voiceActivity.showPayTipPopup(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayTipPopup$lambda$0$0(VoiceActivity voiceActivity) {
        String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(voiceActivity, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        voiceActivity.startActivity(intent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(VoiceActivity voiceActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            voiceActivity.mRecyclerViewAutoRefresh = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewKeyboardHeight_delegate$lambda$0(VoiceActivity voiceActivity) {
        return voiceActivity.findViewById(R.id.view_keyboard_height);
    }

    public final boolean getMRecyclerViewAutoRefresh() {
        return this.mRecyclerViewAutoRefresh;
    }

    public final int getQueryAIMode() {
        if (!i72.OXO1.I0IIOI()) {
            return -1;
        }
        int iIXiX011 = q62.OXO1.iXiX011();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : datas) {
            if (((VoiceMessage) obj).getMType() == 2) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            iIXiX011 = ((VoiceMessage) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).getMAIMode();
        }
        VoiceManager.INSTANCE.setAIMode(iIXiX011);
        return iIXiX011;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<VoiceMessage> initList() {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        return CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(this.mTitle);
        getAbhTitleRight().setVisibility(0);
        if (q62.OXO1.i0Ii001()) {
            getAbhTitleOtherRight().setVisibility(0);
        }
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ai_answer_network_settings_icon);
        getAbhTitleOtherRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.oi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceActivity.initView$lambda$0(this.f10149IO, view);
            }
        });
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMContext(), 3));
        touchListener();
        this.mAdapter = new MultiItemTypeAdapter<VoiceMessage>(this, initList()) { // from class: com.sma.smartv3.ui.device.VoiceActivity.initView.2

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.VoiceActivity$initView$2$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<VoiceMessage> {
                public final /* synthetic */ VoiceActivity OXO1;

                public OXO1(VoiceActivity voiceActivity) {
                    this.OXO1 = voiceActivity;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(VoiceMessage voiceMessage, int i) {
                    return voiceMessage != null && voiceMessage.getMType() == 1;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_voice_chat_send;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, VoiceMessage t, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(t, "t");
                    ((TextView) holder.getView(R.id.tv_send_content)).setText(t.getMContent());
                    ImageView imageView = (ImageView) holder.getView(R.id.iv_send_picture);
                    imageView.setImageDrawable(gk4.XOO0ii0(this.OXO1, R.drawable.icon_voice_default_icon));
                    sz0 sz0Var = sz0.OXO1;
                    if (uz0.OIi0(sz0Var).exists()) {
                        imageView.setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
                    }
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.VoiceActivity$initView$2$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<VoiceMessage> {
                public final /* synthetic */ VoiceActivity OXO1;
                public final /* synthetic */ C187822 XIi00iiXO;

                public XIi00iiXO(VoiceActivity voiceActivity, C187822 c187822) {
                    this.OXO1 = voiceActivity;
                    this.XIi00iiXO = c187822;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(VoiceMessage voiceMessage, int i) {
                    return voiceMessage != null && voiceMessage.getMType() == 2;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_voice_chat_receive;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, VoiceMessage t, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(t, "t");
                    String string = TextUtils.isEmpty(t.getMContent()) ? this.OXO1.getString(R.string.waiting) : t.getMContent();
                    Intrinsics.XXI(string);
                    View view = holder.getView(R.id.tv_receive_content);
                    C187822 c187822 = this.XIi00iiXO;
                    TextView textView = (TextView) view;
                    textView.setText(string);
                    textView.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(((MultiItemTypeAdapter) c187822).mContext, R.color.voice_receive_bg_color)));
                    TextView textView2 = (TextView) holder.getView(R.id.tv_receive_nick);
                    textView2.setText(this.OXO1.mTitle);
                    ImageView imageView = (ImageView) holder.getView(R.id.iv_receive_picture);
                    if (i72.OXO1.I0IIOI()) {
                        String string2 = this.OXO1.mTitle;
                        int iIiiiOIIi0 = q62.OXO1.IiiiOIIi0();
                        int mAIMode = t.getMAIMode();
                        if (mAIMode == 0) {
                            string2 = this.OXO1.getString(R.string.wenxinyiyan);
                            Intrinsics.O10IXXX0X(string2, "getString(...)");
                            iIiiiOIIi0 = R.drawable.icon_voice_bd;
                        } else if (mAIMode == 2) {
                            string2 = this.OXO1.getString(R.string.ai_model_spark_chain);
                            Intrinsics.O10IXXX0X(string2, "getString(...)");
                            iIiiiOIIi0 = R.drawable.icon_voice_spark_chain;
                        } else if (mAIMode == 3) {
                            string2 = this.OXO1.getString(R.string.pay_dail_aigc_deep_seek);
                            Intrinsics.O10IXXX0X(string2, "getString(...)");
                            iIiiiOIIi0 = R.drawable.icon_voice_ds;
                        }
                        textView2.setText(string2);
                        imageView.setImageDrawable(gk4.XOO0ii0(this.OXO1, iIiiiOIIi0));
                    }
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.VoiceActivity$initView$2$XO0O10 */
            public static final class XO0O10 implements InterfaceC2572jc<VoiceMessage> {
                public final /* synthetic */ VoiceActivity OXO1;

                public XO0O10(VoiceActivity voiceActivity) {
                    this.OXO1 = voiceActivity;
                }

                public static final void I0IIOi(VoiceActivity voiceActivity) {
                    voiceActivity.resetPlayStatus();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void XOO0ii0(VoiceMessage voiceMessage, final VoiceActivity voiceActivity, ImageView imageView, int i, View view) {
                    fq1 fq1Var = fq1.OXO1;
                    fq1Var.OIi0();
                    if (fq1Var.XIi00iiXO()) {
                        int mStatus = voiceMessage.getMStatus();
                        fq1Var.OIi0();
                        voiceActivity.resetPlayStatus();
                        if (mStatus == 3) {
                            imageView.setImageResource(R.drawable.icon_play);
                            return;
                        }
                    }
                    MultiItemTypeAdapter multiItemTypeAdapter = voiceActivity.mAdapter;
                    MultiItemTypeAdapter multiItemTypeAdapter2 = null;
                    if (multiItemTypeAdapter == null) {
                        Intrinsics.XXO("mAdapter");
                        multiItemTypeAdapter = null;
                    }
                    ((VoiceMessage) multiItemTypeAdapter.getDatas().get(i)).setMStatus(3);
                    fq1.O00(fq1Var, voiceMessage.getMExtraInfo(), 0, 2, null);
                    MultiItemTypeAdapter multiItemTypeAdapter3 = voiceActivity.mAdapter;
                    if (multiItemTypeAdapter3 == null) {
                        Intrinsics.XXO("mAdapter");
                    } else {
                        multiItemTypeAdapter2 = multiItemTypeAdapter3;
                    }
                    multiItemTypeAdapter2.notifyDataSetChanged();
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ti6
                        @Override // java.lang.Runnable
                        public final void run() {
                            VoiceActivity.C187822.XO0O10.I0IIOi(voiceActivity);
                        }
                    }, 4000L);
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: IiI10X, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final VoiceMessage t, final int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(t, "t");
                    ((TextView) holder.getView(R.id.tv_send_content)).setText(t.getMContent());
                    ImageView imageView = (ImageView) holder.getView(R.id.iv_send_picture);
                    imageView.setImageDrawable(gk4.XOO0ii0(this.OXO1, R.drawable.icon_voice_chat_gpt));
                    sz0 sz0Var = sz0.OXO1;
                    if (uz0.OIi0(sz0Var).exists()) {
                        imageView.setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
                    }
                    final ImageView imageView2 = (ImageView) holder.getView(R.id.btn_play);
                    t.getMExtraInfo().length();
                    imageView2.setVisibility(8);
                    final VoiceActivity voiceActivity = this.OXO1;
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ui6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VoiceActivity.C187822.XO0O10.XOO0ii0(t, voiceActivity, imageView2, i, view);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: OIi0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(VoiceMessage voiceMessage, int i) {
                    return voiceMessage != null && voiceMessage.getMType() == 4;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_voice_chat_audio_send;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.VoiceActivity$initView$2$iO */
            public static final class iO implements InterfaceC2572jc<VoiceMessage> {
                public final /* synthetic */ VoiceActivity OXO1;
                public final /* synthetic */ C187822 XIi00iiXO;

                public iO(VoiceActivity voiceActivity, C187822 c187822) {
                    this.OXO1 = voiceActivity;
                    this.XIi00iiXO = c187822;
                }

                public static final Unit I0IIOi(VoiceActivity voiceActivity, boolean z) {
                    voiceActivity.resetPlayStatus();
                    return Unit.OXO1;
                }

                public static final void XOO0ii0(VoiceMessage voiceMessage, final VoiceActivity voiceActivity, ImageView imageView, int i, View view) throws IOException {
                    VoicePlayer voicePlayer = VoicePlayer.INSTANCE;
                    if (voicePlayer.isPlay()) {
                        int mStatus = voiceMessage.getMStatus();
                        voicePlayer.stop();
                        voiceActivity.resetPlayStatus();
                        if (mStatus == 3) {
                            imageView.setImageResource(R.drawable.icon_play);
                            return;
                        }
                    }
                    MultiItemTypeAdapter multiItemTypeAdapter = voiceActivity.mAdapter;
                    MultiItemTypeAdapter multiItemTypeAdapter2 = null;
                    if (multiItemTypeAdapter == null) {
                        Intrinsics.XXO("mAdapter");
                        multiItemTypeAdapter = null;
                    }
                    ((VoiceMessage) multiItemTypeAdapter.getDatas().get(i)).setMStatus(3);
                    voicePlayer.play(voiceMessage.getMExtraInfo(), new Function1() { // from class: com.android.mltcode.paycertificationapi.si6
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return VoiceActivity.C187822.iO.I0IIOi(voiceActivity, ((Boolean) obj).booleanValue());
                        }
                    });
                    MultiItemTypeAdapter multiItemTypeAdapter3 = voiceActivity.mAdapter;
                    if (multiItemTypeAdapter3 == null) {
                        Intrinsics.XXO("mAdapter");
                    } else {
                        multiItemTypeAdapter2 = multiItemTypeAdapter3;
                    }
                    multiItemTypeAdapter2.notifyDataSetChanged();
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: IiI10X, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final VoiceMessage t, final int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(t, "t");
                    String string = TextUtils.isEmpty(t.getMContent()) ? this.OXO1.getString(R.string.waiting) : t.getMContent();
                    Intrinsics.XXI(string);
                    View view = holder.getView(R.id.tv_receive_content);
                    C187822 c187822 = this.XIi00iiXO;
                    TextView textView = (TextView) view;
                    textView.setText(string);
                    textView.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(((MultiItemTypeAdapter) c187822).mContext, R.color.voice_receive_bg_color)));
                    ((TextView) holder.getView(R.id.tv_receive_nick)).setText(this.OXO1.mTitle);
                    final ImageView imageView = (ImageView) holder.getView(R.id.btn_play);
                    if (t.getMStatus() == 3) {
                        imageView.setImageResource(R.drawable.icon_playing);
                    } else {
                        imageView.setImageResource(R.drawable.icon_play);
                    }
                    final VoiceActivity voiceActivity = this.OXO1;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ri6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) throws IOException {
                            VoiceActivity.C187822.iO.XOO0ii0(t, voiceActivity, imageView, i, view2);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: OIi0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(VoiceMessage voiceMessage, int i) {
                    return voiceMessage != null && voiceMessage.getMType() == 3;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_voice_chat_receive_audio;
                }
            }

            {
                addItemViewDelegate(1, new OXO1(this));
                addItemViewDelegate(2, new XIi00iiXO(this, this));
                addItemViewDelegate(3, new iO(this, this));
                addItemViewDelegate(4, new XO0O10(this));
            }
        };
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView mRecyclerView = getMRecyclerView();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        mRecyclerView.setAdapter(multiItemTypeAdapter);
        refreshView();
        a01.OXO1.OXO1().put(b01.iIXX0i, false);
        processingEditTextKeyboard();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_voice;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        resetPlayStatus();
        C2699mp c2699mp = this.mListPop;
        if (c2699mp != null) {
            c2699mp.dismiss();
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        sPUtilsIiI10X.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(datas));
        I01XX0.XIi00iiXO(I01XX0.i100IXOX, null, 2, null);
        KeyboardUtils.unregisterSoftInputChangedListener(getWindow());
    }

    public final void onSend(@aa1 View view) {
        String string;
        Intrinsics.X0O(view, "view");
        q62 q62Var = q62.OXO1;
        if (!q62Var.IiX1ii() && !q62Var.OIXOOi() && TextUtils.isEmpty(q62Var.iIiiO()) && !q62Var.XOX()) {
            ToastUtils.showLong(R.string.no_ai_key);
            startActivity(new Intent(this, (Class<?>) AiKeySetActivity.class));
            return;
        }
        Editable text = getEtContent().getText();
        String str = (text == null || (string = text.toString()) == null) ? "" : string;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (VoiceManager.INSTANCE.isTaskRunning()) {
            ToastUtils.showLong(R.string.task_running_wait_tip);
            return;
        }
        KeyboardUtils.hideSoftInput(this);
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter2 = null;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.getDatas().add(new VoiceMessage(0, null, 1, str, null, 0, 0, 115, null));
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter3 = this.mAdapter;
        if (multiItemTypeAdapter3 == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter3 = null;
        }
        multiItemTypeAdapter3.getDatas().add(new VoiceMessage(0, null, 2, "", null, 1, getQueryAIMode(), 19, null));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter4 = this.mAdapter;
        if (multiItemTypeAdapter4 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter2 = multiItemTypeAdapter4;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter2.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        sPUtilsIiI10X.put(VoiceMessage.class.getName() + is3.OXO1, new Gson().toJson(datas));
        refreshView();
        this.mRecyclerViewAutoRefresh = true;
        if (q62Var.I1OX()) {
            VoiceManagerV2 voiceManagerV2 = VoiceManagerV2.INSTANCE;
            voiceManagerV2.stop();
            voiceManagerV2.onAIResultConsumption(str, 0);
        } else {
            I01XX0.OXO1(I01XX0.iIi1, str);
        }
        getEtContent().setText("");
    }

    @sf5(tag = I01XX0.X00O0)
    public final void onSendVoice(@aa1 Object data) {
        Collection<? extends VoiceMessage> collectionM39402iI;
        Intrinsics.X0O(data, "data");
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter = this.mAdapter;
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter2 = null;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        multiItemTypeAdapter.getDatas().clear();
        MultiItemTypeAdapter<VoiceMessage> multiItemTypeAdapter3 = this.mAdapter;
        if (multiItemTypeAdapter3 == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter2 = multiItemTypeAdapter3;
        }
        List<VoiceMessage> datas = multiItemTypeAdapter2.getDatas();
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(VoiceMessage.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList<>(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), VoiceMessage.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        datas.addAll(collectionM39402iI);
        refreshView();
    }

    @sf5(tag = I01XX0.X111IO)
    public final void onSendVoiceAutoRefresh(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.mRecyclerViewAutoRefresh = true;
    }

    @sf5(tag = b01.X1i)
    public final void onTakeOverVoiceLog(@aa1 String data) {
        Intrinsics.X0O(data, "data");
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mDeletePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.delete_record_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.fi6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(VoiceActivity.onTitleRightClick$lambda$0$0(this.f6649IO));
                }
            });
            this.mDeletePopup = go0Var;
        }
        go0 go0Var2 = this.mDeletePopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @sf5(tag = b01.II1)
    public final void onVoiceMember(@aa1 String data) {
        Intrinsics.X0O(data, "data");
        int iHashCode = data.hashCode();
        if (iHashCode == 1596802) {
            if (data.equals("4006")) {
                showPayTipPopup(R.string.points_insufficient_tip);
                return;
            }
            return;
        }
        switch (iHashCode) {
            case 1626588:
                if (data.equals("5001")) {
                    showPayTipPopup(R.string.ai_benefit_buy_tip);
                    break;
                }
                break;
            case 1626589:
                if (data.equals("5002")) {
                    showPayTipPopup(R.string.ai_benefit_expired_tip);
                    break;
                }
                break;
            case 1626590:
                if (data.equals("5003")) {
                    startActivity(new Intent(this, (Class<?>) AIBenefitExpiredTipActivity.class));
                    break;
                }
                break;
        }
    }

    public final void setMRecyclerViewAutoRefresh(boolean z) {
        this.mRecyclerViewAutoRefresh = z;
    }

    public final void showListPoP() {
        if (this.mListPopupAdapter == null) {
            this.mListPopupAdapter = new CommonAdapter<String>(getMContext(), CollectionsKt___CollectionsKt.OO0Oi10(this.mListPopData)) { // from class: com.sma.smartv3.ui.device.VoiceActivity.showListPoP.1
                @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
                public void convert(ViewHolder viewHolder, String item, int i) {
                    Intrinsics.X0O(viewHolder, "viewHolder");
                    Intrinsics.X0O(item, "item");
                    viewHolder.setText(R.id.course_type_tv, item);
                }
            };
        }
        if (this.mListPop == null) {
            C2699mp c2699mp = new C2699mp(this, R.layout.pop_list2);
            c2699mp.X11iII1O1(this.mListPopupAdapter);
            this.mListPop = c2699mp;
            c2699mp.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#66000000")));
            C2699mp c2699mp2 = this.mListPop;
            if (c2699mp2 != null) {
                c2699mp2.I0iXXO(false);
            }
        }
        C2699mp c2699mp3 = this.mListPop;
        if (c2699mp3 != null) {
            TextView abhTitleCenter = getAbhTitleCenter();
            Intrinsics.O10IXXX0X(abhTitleCenter, "<get-abhTitleCenter>(...)");
            c2699mp3.XiOIO(abhTitleCenter);
        }
    }

    public final void showPayTipPopup(int i) {
        go0 go0Var;
        if (this.mPayTipPopup == null) {
            go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.O1O(R.string.tip);
            go0Var2.m1865iX(Integer.valueOf(i));
            go0Var2.IXXOO(1);
            go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.pi6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(VoiceActivity.showPayTipPopup$lambda$0$0(this.f10372IO));
                }
            });
            this.mPayTipPopup = go0Var2;
        }
        go0 go0Var3 = this.mPayTipPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mPayTipPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void touchListener() {
        getMRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.hi6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VoiceActivity.touchListener$lambda$0(this.f7134IO, view, motionEvent);
            }
        });
    }
}
