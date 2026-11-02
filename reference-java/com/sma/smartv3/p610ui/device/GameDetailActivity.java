package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserAloneGameDetail;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.p610ui.device.GameDetailActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGameControl;
import com.tenmeter.smlibrary.entity.SMGameInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailActivity.kt\ncom/sma/smartv3/ui/device/GameDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n19#2:345\n15#2:346\n93#2,2:347\n90#2:349\n93#2,2:350\n90#2:352\n93#2,2:353\n90#2:355\n87#3,7:356\n94#3,3:364\n70#3,7:367\n97#3:374\n87#3,7:375\n94#3,3:383\n70#3,7:386\n97#3:393\n1#4:363\n1#4:382\n*S KotlinDebug\n*F\n+ 1 GameDetailActivity.kt\ncom/sma/smartv3/ui/device/GameDetailActivity\n*L\n67#1:345\n67#1:346\n108#1:347,2\n108#1:349\n109#1:350,2\n109#1:352\n291#1:353,2\n291#1:355\n177#1:356,7\n177#1:364,3\n177#1:367,7\n177#1:374\n179#1:375,7\n179#1:383,3\n179#1:386,7\n179#1:393\n177#1:363\n179#1:382\n*E\n"})
public final class GameDetailActivity extends BaseActivity {
    private boolean isFree;
    private boolean isGetServerData;
    private boolean isNeedPayDialog;

    @tb1
    private go0 mLoginTipPopup;

    @tb1
    private go0 mPayconfirmPopup;
    public SMGameInfo mSMGameInfo;

    @tb1
    private go0 mStartGameTipPopup;

    @aa1
    private final AppUser mUser;

    @tb1
    private UserAloneGameDetail mUserAloneGameDetail;

    @tb1
    private UserMember mUserMember;
    private boolean startGameTouch;

    @aa1
    private final String TAG = "GameDetailActivity";

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1I0X1i0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.abhTitleRight_delegate$lambda$0(this.f4464IO);
        }
    });

    @aa1
    private final Lazy mGameIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOi01Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameIcon_delegate$lambda$0(this.f3359IO);
        }
    });

    @aa1
    private final Lazy mGameTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0Oi11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameTitle_delegate$lambda$0(this.f4436IO);
        }
    });

    @aa1
    private final Lazy mGamePlayNum$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0IXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGamePlayNum_delegate$lambda$0(this.f4426IO);
        }
    });

    @aa1
    private final Lazy mGameNewLabel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1iX1I0XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameNewLabel_delegate$lambda$0(this.f2853IO);
        }
    });

    @aa1
    private final Lazy mGamePayLabel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OO10O10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGamePayLabel_delegate$lambda$0(this.f2751IO);
        }
    });

    @aa1
    private final Lazy mGameImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X010I1IXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameImg_delegate$lambda$0(this.f3905IO);
        }
    });

    @aa1
    private final Lazy mGameContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIIIIO1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameContent_delegate$lambda$0(this.f2963IO);
        }
    });

    @aa1
    private final Lazy mGamePayLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1Oii1XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGamePayLayout_delegate$lambda$0(this.f4325IO);
        }
    });

    @aa1
    private final Lazy mGameAlonePayBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIiiiOiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGameAlonePayBtn_delegate$lambda$0(this.f7966IO);
        }
    });

    @aa1
    private final Lazy mGamePayMemberBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0I1IOii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameDetailActivity.mGamePayMemberBtn_delegate$lambda$0(this.f3949IO);
        }
    });

    @aa1
    private String orderNum = "";

    public GameDetailActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (ImageView) gameDetailActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getMGameAlonePayBtn() {
        return (Button) this.mGameAlonePayBtn$delegate.getValue();
    }

    private final TextView getMGameContent() {
        return (TextView) this.mGameContent$delegate.getValue();
    }

    private final ImageViewRound getMGameIcon() {
        return (ImageViewRound) this.mGameIcon$delegate.getValue();
    }

    private final ImageViewRound getMGameImg() {
        return (ImageViewRound) this.mGameImg$delegate.getValue();
    }

    private final TextView getMGameNewLabel() {
        return (TextView) this.mGameNewLabel$delegate.getValue();
    }

    private final TextView getMGamePayLabel() {
        return (TextView) this.mGamePayLabel$delegate.getValue();
    }

    private final View getMGamePayLayout() {
        return (View) this.mGamePayLayout$delegate.getValue();
    }

    private final Button getMGamePayMemberBtn() {
        return (Button) this.mGamePayMemberBtn$delegate.getValue();
    }

    private final TextView getMGamePlayNum() {
        return (TextView) this.mGamePlayNum$delegate.getValue();
    }

    private final TextView getMGameTitle() {
        return (TextView) this.mGameTitle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getServerData$lambda$0(GameDetailActivity gameDetailActivity, Boolean bool) {
        OrderManager.OXO1.O10IXXX0X(String.valueOf(gameDetailActivity.getMSMGameInfo().getGid()), new Function1() { // from class: com.android.mltcode.paycertificationapi.X0IX11iO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameDetailActivity.getServerData$lambda$0$0((Boolean) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getServerData$lambda$0$0(Boolean bool) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final GameDetailActivity gameDetailActivity, View view) {
        if (gameDetailActivity.mUserAloneGameDetail == null) {
            i0O111.OXO1.iIiiO(gameDetailActivity);
        } else if (i72.OXO1.iOIi00Ii()) {
            OrderManager.OXO1.OXO1("Game", String.valueOf(gameDetailActivity.getMSMGameInfo().getGid()), gameDetailActivity, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiI0i0X11
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GameDetailActivity.initView$lambda$0$0(this.f8570IO, (AccountCreateOrder) obj);
                }
            });
        } else {
            showLoginTipPopup$default(gameDetailActivity, 0, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(GameDetailActivity gameDetailActivity, AccountCreateOrder accountCreateOrder) {
        if (accountCreateOrder != null) {
            gameDetailActivity.isNeedPayDialog = true;
            gameDetailActivity.orderNum = accountCreateOrder.getOrderNum();
            if (i72.OXO1.m2049OX()) {
                String strOIX0iXi = i0O111.OXO1.OIX0iXi(gameDetailActivity.orderNum);
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", strOIX0iXi);
                bundle.putInt("mArg1", 2);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(gameDetailActivity, (Class<?>) GoogleWebViewActivity.class);
                intent.putExtras(bundle);
                gameDetailActivity.startActivity(intent);
            } else {
                String strOIX0iXi2 = i0O111.OXO1.OIX0iXi(gameDetailActivity.orderNum);
                Bundle bundle2 = new Bundle();
                bundle2.putString("mArg0", strOIX0iXi2);
                bundle2.putInt("mArg1", 2);
                bundle2.putParcelable("mArg2", null);
                bundle2.putSerializable("mArg3", null);
                Intent intent2 = new Intent(gameDetailActivity, (Class<?>) WebViewActivity.class);
                intent2.putExtras(bundle2);
                gameDetailActivity.startActivity(intent2);
            }
        } else {
            ToastUtils.showLong(gameDetailActivity.getString(R.string.fail_order), new Object[0]);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(GameDetailActivity gameDetailActivity, View view) {
        if (!i72.OXO1.iOIi00Ii() && !gameDetailActivity.isFree) {
            showLoginTipPopup$default(gameDetailActivity, 0, 1, null);
            return;
        }
        i0O111 i0o111 = i0O111.OXO1;
        UserMember userMember = gameDetailActivity.mUserMember;
        Intrinsics.XXI(userMember);
        if (!i0o111.OII(userMember)) {
            UserAloneGameDetail userAloneGameDetail = gameDetailActivity.mUserAloneGameDetail;
            if (!Intrinsics.XOO0ii0(userAloneGameDetail != null ? userAloneGameDetail.getPayStatus() : null, "Payed") && !gameDetailActivity.isFree) {
                i0o111.iIiiO(gameDetailActivity);
                return;
            }
        }
        gameDetailActivity.startGame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mGameAlonePayBtn_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (Button) gameDetailActivity.findViewById(R.id.game_alone_pay_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGameContent_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (TextView) gameDetailActivity.findViewById(R.id.game_detail_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound mGameIcon_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (ImageViewRound) gameDetailActivity.findViewById(R.id.game_detail_iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound mGameImg_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (ImageViewRound) gameDetailActivity.findViewById(R.id.game_detail_content_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGameNewLabel_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (TextView) gameDetailActivity.findViewById(R.id.game_detail_new_label);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGamePayLabel_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (TextView) gameDetailActivity.findViewById(R.id.game_detail_pay_label);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mGamePayLayout_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return gameDetailActivity.findViewById(R.id.game_pay_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mGamePayMemberBtn_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (Button) gameDetailActivity.findViewById(R.id.game_pay_member_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGamePlayNum_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (TextView) gameDetailActivity.findViewById(R.id.game_detail_play_num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGameTitle_delegate$lambda$0(GameDetailActivity gameDetailActivity) {
        return (TextView) gameDetailActivity.findViewById(R.id.game_detail_title);
    }

    public static /* synthetic */ void showLoginTipPopup$default(GameDetailActivity gameDetailActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.game_nologin_tip;
        }
        gameDetailActivity.showLoginTipPopup(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoginTipPopup$lambda$0$0(GameDetailActivity gameDetailActivity) {
        i72.OXO1.OiXXXi10(gameDetailActivity.getMContext());
        return true;
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.payment_completed_tip);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.IXO1OI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(GameDetailActivity.showPayConfirm$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.yes_payment, new Function0() { // from class: com.android.mltcode.paycertificationapi.iO0I011I1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(GameDetailActivity.showPayConfirm$lambda$0$1(this.f7986IO));
                }
            });
            this.mPayconfirmPopup = go0Var;
        }
        go0 go0Var2 = this.mPayconfirmPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayConfirm$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayConfirm$lambda$0$1(GameDetailActivity gameDetailActivity) {
        gameDetailActivity.onOrderPayStatusChange("");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showStartGameTipPopup$lambda$0$0(GameDetailActivity gameDetailActivity, go0 go0Var) {
        boolean z = gameDetailActivity.startGameTouch;
        gameDetailActivity.startGameTouch = !z;
        if (!z) {
            i0O111.OXO1.X01IiOiIi(gameDetailActivity.getMSMGameInfo(), gameDetailActivity);
        }
        go0Var.dismiss();
        return true;
    }

    @aa1
    public final SMGameInfo getMSMGameInfo() {
        SMGameInfo sMGameInfo = this.mSMGameInfo;
        if (sMGameInfo != null) {
            return sMGameInfo;
        }
        Intrinsics.XXO("mSMGameInfo");
        return null;
    }

    @aa1
    public final AppUser getMUser() {
        return this.mUser;
    }

    @tb1
    public final UserAloneGameDetail getMUserAloneGameDetail() {
        return this.mUserAloneGameDetail;
    }

    @tb1
    public final UserMember getMUserMember() {
        return this.mUserMember;
    }

    public final void getServerData() {
        boolean zContains = i0O111.OXO1.OIi0().contains(Integer.valueOf(getMSMGameInfo().getGid()));
        this.isFree = zContains;
        if (zContains) {
            return;
        }
        if (i72.OXO1.iOIi00Ii()) {
            this.isGetServerData = true;
            OrderManager.OXO1.O1O(new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1OX0i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GameDetailActivity.getServerData$lambda$0(this.f8036IO, (Boolean) obj);
                }
            });
            return;
        }
        View mGamePayLayout = getMGamePayLayout();
        if (mGamePayLayout != null) {
            mGamePayLayout.setVisibility(0);
        }
        Button mGameAlonePayBtn = getMGameAlonePayBtn();
        if (mGameAlonePayBtn != null) {
            mGameAlonePayBtn.setVisibility(8);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Parcelable mArg2 = getMArg2();
        Intrinsics.X1ii(mArg2, "null cannot be cast to non-null type com.tenmeter.smlibrary.entity.SMGameInfo");
        setMSMGameInfo((SMGameInfo) mArg2);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " gid = " + getMSMGameInfo().getGid() + "  " + getMSMGameInfo().getLabel());
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01cf  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        int color;
        String strM1385iO;
        String string;
        if (!this.isGetServerData) {
            getServerData();
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
        if (objFromJson == null) {
            objFromJson = UserMember.class.newInstance();
        }
        this.mUserMember = (UserMember) objFromJson;
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.I0IIOI + '_' + UserAloneGameDetail.class.getName()), (Class<Object>) UserAloneGameDetail.class);
        if (objFromJson2 == null) {
            objFromJson2 = UserAloneGameDetail.class.newInstance();
        }
        this.mUserAloneGameDetail = (UserAloneGameDetail) objFromJson2;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_detail_title);
        Glide.with((FragmentActivity) this).load(getMSMGameInfo().getBackground()).into(getMGameIcon());
        Glide.with((FragmentActivity) this).load(getMSMGameInfo().getBackground()).into(getMGameImg());
        getAbhTitleRight().setImageResource(R.drawable.game_detail_right_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (this.isFree) {
            getMGamePayLayout().setVisibility(0);
            getMGamePayLabel().setText(getString(R.string.free_order_amount));
            color = getResources().getColor(R.color.game_member_free_tv_color);
        } else {
            getMGamePayLabel().setText(getString(R.string.game_detail_pay_tip));
            color = getResources().getColor(R.color.game_member_pay_tv_color);
        }
        gradientDrawable.setCornerRadii(new float[]{20.0f, 20.0f, 20.0f, 20.0f, 20.0f, 20.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(color);
        getMGamePayLabel().setBackground(gradientDrawable);
        getMGameTitle().setText(getMSMGameInfo().getGname());
        getMGamePlayNum().setText(getString(R.string.game_play_num, Long.valueOf(getMSMGameInfo().getPlayNum())));
        getMGameContent().setText(getMSMGameInfo().getDetails());
        Button mGameAlonePayBtn = getMGameAlonePayBtn();
        i72 i72Var = i72.OXO1;
        if (i72Var.m2049OX()) {
            UserAloneGameDetail userAloneGameDetail = this.mUserAloneGameDetail;
            Intrinsics.XXI(userAloneGameDetail);
            strM1385iO = XXiO.m1385iO(userAloneGameDetail.getDollar(), null, 2, null);
        } else {
            UserAloneGameDetail userAloneGameDetail2 = this.mUserAloneGameDetail;
            Intrinsics.XXI(userAloneGameDetail2);
            strM1385iO = XXiO.m1385iO(userAloneGameDetail2.getAmount(), null, 2, null);
        }
        mGameAlonePayBtn.setText(strM1385iO);
        Button mGamePayMemberBtn = getMGamePayMemberBtn();
        i0O111 i0o111 = i0O111.OXO1;
        UserMember userMember = this.mUserMember;
        Intrinsics.XXI(userMember);
        if (i0o111.OII(userMember)) {
            getMGameAlonePayBtn().setVisibility(8);
            string = getString(R.string.game_detail_start_game);
        } else {
            UserAloneGameDetail userAloneGameDetail3 = this.mUserAloneGameDetail;
            if (Intrinsics.XOO0ii0(userAloneGameDetail3 != null ? userAloneGameDetail3.getPayStatus() : null, "Payed") || this.isFree) {
                getMGameAlonePayBtn().setVisibility(8);
                string = getString(R.string.game_detail_start_game);
            } else {
                UserMember userMember2 = this.mUserMember;
                Intrinsics.XXI(userMember2);
                if (userMember2.getLatestGameMemberDateTime() > 0) {
                    string = getString(R.string.game_detail_renewal_member);
                } else {
                    string = i72Var.iOIi00Ii() ? getString(R.string.game_detail_pay_member) : getString(R.string.game_detail_start_game);
                }
            }
        }
        mGamePayMemberBtn.setText(string);
        getMGameAlonePayBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1O1XIXO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameDetailActivity.initView$lambda$0(this.f2743IO, view);
            }
        });
        getMGamePayMemberBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOOOX0I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameDetailActivity.initView$lambda$1(this.f8120IO, view);
            }
        });
        getAbhTitleRight().setVisibility(0);
    }

    public final boolean isFree() {
        return this.isFree;
    }

    public final boolean isGetServerData() {
        return this.isGetServerData;
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_game_detail;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.GAME_CONTROL, BleKeyFlag.UPDATE, new BleGameControl(4, 0, 0, 0, 14, null), false, false, 24, null);
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 go0Var = this.mPayconfirmPopup;
        if (go0Var != null && go0Var != null) {
            go0Var.dismiss();
        }
        getMGamePayLayout().setVisibility(8);
        getServerData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog) {
            this.isNeedPayDialog = false;
            showPayConfirm();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (i72.OXO1.iOIi00Ii()) {
            i0O111.OXO1.iIiiO(this);
        } else {
            showLoginTipPopup$default(this, 0, 1, null);
        }
    }

    @sf5(tag = I01XX0.I0IIOI)
    public final void onUserGameDetailChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        String strM1385iO;
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onUserMemberChange");
        getMGamePayLayout().setVisibility(0);
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.I0IIOI + '_' + UserAloneGameDetail.class.getName()), (Class<Object>) UserAloneGameDetail.class);
        if (objFromJson == null) {
            objFromJson = UserAloneGameDetail.class.newInstance();
        }
        UserAloneGameDetail userAloneGameDetail = (UserAloneGameDetail) objFromJson;
        this.mUserAloneGameDetail = userAloneGameDetail;
        if (!Intrinsics.XOO0ii0(userAloneGameDetail != null ? userAloneGameDetail.getPayStatus() : null, "Payed")) {
            i0O111 i0o111 = i0O111.OXO1;
            UserMember userMember = this.mUserMember;
            Intrinsics.XXI(userMember);
            if (!i0o111.OII(userMember)) {
                Button mGameAlonePayBtn = getMGameAlonePayBtn();
                if (i72.OXO1.m2049OX()) {
                    UserAloneGameDetail userAloneGameDetail2 = this.mUserAloneGameDetail;
                    Intrinsics.XXI(userAloneGameDetail2);
                    strM1385iO = XXiO.m1385iO(userAloneGameDetail2.getDollar(), null, 2, null);
                } else {
                    UserAloneGameDetail userAloneGameDetail3 = this.mUserAloneGameDetail;
                    Intrinsics.XXI(userAloneGameDetail3);
                    strM1385iO = XXiO.m1385iO(userAloneGameDetail3.getAmount(), null, 2, null);
                }
                mGameAlonePayBtn.setText(strM1385iO);
                getMGameAlonePayBtn().setVisibility(0);
            }
        }
        initView();
    }

    public final void setFree(boolean z) {
        this.isFree = z;
    }

    public final void setGetServerData(boolean z) {
        this.isGetServerData = z;
    }

    public final void setMSMGameInfo(@aa1 SMGameInfo sMGameInfo) {
        Intrinsics.X0O(sMGameInfo, "<set-?>");
        this.mSMGameInfo = sMGameInfo;
    }

    public final void setMUserAloneGameDetail(@tb1 UserAloneGameDetail userAloneGameDetail) {
        this.mUserAloneGameDetail = userAloneGameDetail;
    }

    public final void setMUserMember(@tb1 UserMember userMember) {
        this.mUserMember = userMember;
    }

    public final void setNeedPayDialog(boolean z) {
        this.isNeedPayDialog = z;
    }

    public final void showLoginTipPopup(int i) {
        go0 go0Var;
        if (this.mLoginTipPopup == null) {
            go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.O1O(R.string.tip);
            go0Var2.m1865iX(Integer.valueOf(i));
            go0Var2.IXXOO(1);
            go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var2.X1IX(R.string.yes_payment_go, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXi0Xi1I
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(GameDetailActivity.showLoginTipPopup$lambda$0$0(this.f3566IO));
                }
            });
            this.mLoginTipPopup = go0Var2;
        }
        go0 go0Var3 = this.mLoginTipPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mLoginTipPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    public final void showStartGameTipPopup() {
        if (this.mStartGameTipPopup == null) {
            final go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.game_detail_guidance_content));
            go0Var.IXXOO(1);
            go0.X11iII1O1(go0Var, null, null, 2, null);
            go0Var.X1IX(R.string.game_detail_guidance_knew, new Function0() { // from class: com.android.mltcode.paycertificationapi.i0OiOOO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(GameDetailActivity.showStartGameTipPopup$lambda$0$0(this.f7410IO, go0Var));
                }
            });
            this.mStartGameTipPopup = go0Var;
        }
        this.startGameTouch = false;
        go0 go0Var2 = this.mStartGameTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x009c  */
    public final void startGame() {
        a01 a01Var = a01.OXO1;
        String string = a01Var.OXO1().getString(b01.iIIIi + this.mUser.getIdentity(), "");
        Intrinsics.XXI(string);
        if (string.length() > 0) {
            if (Intrinsics.XOO0ii0(string, this.mUser.getNickname() + this.mUser.getAvatarUrl())) {
                i0O111.OXO1.iOOX010X(this.mUser.getIdentity(), this.mUser.getNickname(), this.mUser.getAvatarUrl());
            } else {
                a01Var.OXO1().put(b01.iIIIi + this.mUser.getIdentity(), this.mUser.getNickname() + this.mUser.getAvatarUrl());
                i0O111.OXO1.m1971OX(this.mUser.getIdentity(), this.mUser.getNickname(), this.mUser.getAvatarUrl());
            }
        } else {
            i0O111.OXO1.iOOX010X(this.mUser.getIdentity(), this.mUser.getNickname(), this.mUser.getAvatarUrl());
        }
        showStartGameTipPopup();
    }
}
