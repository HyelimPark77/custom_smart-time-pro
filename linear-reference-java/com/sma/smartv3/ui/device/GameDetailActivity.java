package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXO1OI;
import com.android.mltcode.paycertificationapi.O1O1XIXO;
import com.android.mltcode.paycertificationapi.O1OO10O10;
import com.android.mltcode.paycertificationapi.O1iX1I0XI;
import com.android.mltcode.paycertificationapi.OIIIIO1X;
import com.android.mltcode.paycertificationapi.OOi01Oi;
import com.android.mltcode.paycertificationapi.OXi0Xi1I;
import com.android.mltcode.paycertificationapi.X010I1IXI;
import com.android.mltcode.paycertificationapi.X0I1IOii;
import com.android.mltcode.paycertificationapi.X0IX11iO;
import com.android.mltcode.paycertificationapi.X1Oii1XI;
import com.android.mltcode.paycertificationapi.XI0IXI;
import com.android.mltcode.paycertificationapi.XI0Oi11;
import com.android.mltcode.paycertificationapi.XI1I0X1i0;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i0OiOOO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIiiiOiXi;
import com.android.mltcode.paycertificationapi.iO0I011I1;
import com.android.mltcode.paycertificationapi.iO1OX0i;
import com.android.mltcode.paycertificationapi.iOOOX0I;
import com.android.mltcode.paycertificationapi.iiI0i0X11;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.me.WebViewActivity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailActivity.kt\ncom/sma/smartv3/ui/device/GameDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n19#2:345\n15#2:346\n93#2,2:347\n90#2:349\n93#2,2:350\n90#2:352\n93#2,2:353\n90#2:355\n87#3,7:356\n94#3,3:364\n70#3,7:367\n97#3:374\n87#3,7:375\n94#3,3:383\n70#3,7:386\n97#3:393\n1#4:363\n1#4:382\n*S KotlinDebug\n*F\n+ 1 GameDetailActivity.kt\ncom/sma/smartv3/ui/device/GameDetailActivity\n*L\n67#1:345\n67#1:346\n108#1:347,2\n108#1:349\n109#1:350,2\n109#1:352\n291#1:353,2\n291#1:355\n177#1:356,7\n177#1:364,3\n177#1:367,7\n177#1:374\n179#1:375,7\n179#1:383,3\n179#1:386,7\n179#1:393\n177#1:363\n179#1:382\n*E\n"})
public final class GameDetailActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean isFree;
    private boolean isGetServerData;
    private boolean isNeedPayDialog;

    @aa1
    private final Lazy mGameAlonePayBtn$delegate;

    @aa1
    private final Lazy mGameContent$delegate;

    @aa1
    private final Lazy mGameIcon$delegate;

    @aa1
    private final Lazy mGameImg$delegate;

    @aa1
    private final Lazy mGameNewLabel$delegate;

    @aa1
    private final Lazy mGamePayLabel$delegate;

    @aa1
    private final Lazy mGamePayLayout$delegate;

    @aa1
    private final Lazy mGamePayMemberBtn$delegate;

    @aa1
    private final Lazy mGamePlayNum$delegate;

    @aa1
    private final Lazy mGameTitle$delegate;

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

    @aa1
    private String orderNum;
    private boolean startGameTouch;

    public GameDetailActivity() {
        this.TAG = "GameDetailActivity";
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XI1I0X1i0(this));
        this.mGameIcon$delegate = LazyKt__LazyJVMKt.iO(new OOi01Oi(this));
        this.mGameTitle$delegate = LazyKt__LazyJVMKt.iO(new XI0Oi11(this));
        this.mGamePlayNum$delegate = LazyKt__LazyJVMKt.iO(new XI0IXI(this));
        this.mGameNewLabel$delegate = LazyKt__LazyJVMKt.iO(new O1iX1I0XI(this));
        this.mGamePayLabel$delegate = LazyKt__LazyJVMKt.iO(new O1OO10O10(this));
        this.mGameImg$delegate = LazyKt__LazyJVMKt.iO(new X010I1IXI(this));
        this.mGameContent$delegate = LazyKt__LazyJVMKt.iO(new OIIIIO1X(this));
        this.mGamePayLayout$delegate = LazyKt__LazyJVMKt.iO(new X1Oii1XI(this));
        this.mGameAlonePayBtn$delegate = LazyKt__LazyJVMKt.iO(new iIiiiOiXi(this));
        this.mGamePayMemberBtn$delegate = LazyKt__LazyJVMKt.iO(new X0I1IOii(this));
        this.orderNum = "";
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mUser = (AppUser) r2;
    }

    public static /* synthetic */ void I0iXXO(GameDetailActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ TextView I1(GameDetailActivity r0) {
        return mGameTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(GameDetailActivity r0) {
        return mGamePayLabel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView II1Xi0(GameDetailActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(GameDetailActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(GameDetailActivity r0, Boolean r1) {
        return getServerData$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean OII(GameDetailActivity r0) {
        return showPayConfirm$lambda$0$1(r0);
    }

    public static /* synthetic */ Button OIX0iXi(GameDetailActivity r0) {
        return mGamePayMemberBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OX(GameDetailActivity r0, go0 r1) {
        return showStartGameTipPopup$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View OiIIX101O(GameDetailActivity r0) {
        return mGamePayLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X01IiOiIi(GameDetailActivity r0) {
        return showLoginTipPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView X0O(GameDetailActivity r0) {
        return mGameContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(GameDetailActivity r0) {
        return mGameNewLabel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(Boolean r0) {
        return getServerData$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView XXI(GameDetailActivity r0) {
        return mGamePlayNum_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound XiOIO(GameDetailActivity r0) {
        return mGameImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XiOIii1(GameDetailActivity r0) {
        return mGameAlonePayBtn_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(GameDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getMGameAlonePayBtn() {
        return (Button) getValue();
    }

    private final TextView getMGameContent() {
        return (TextView) getValue();
    }

    private final ImageViewRound getMGameIcon() {
        return (ImageViewRound) getValue();
    }

    private final ImageViewRound getMGameImg() {
        return (ImageViewRound) getValue();
    }

    private final TextView getMGameNewLabel() {
        return (TextView) getValue();
    }

    private final TextView getMGamePayLabel() {
        return (TextView) getValue();
    }

    private final View getMGamePayLayout() {
        return (View) getValue();
    }

    private final Button getMGamePayMemberBtn() {
        return (Button) getValue();
    }

    private final TextView getMGamePlayNum() {
        return (TextView) getValue();
    }

    private final TextView getMGameTitle() {
        return (TextView) getValue();
    }

    private static final Unit getServerData$lambda$0(GameDetailActivity r1, Boolean r2) {
        OrderManager.OXO1.O10IXXX0X(String.valueOf(r1.getMSMGameInfo().getGid()), new X0IX11iO());
        return Unit.OXO1;
    }

    private static final Unit getServerData$lambda$0$0(Boolean r0) {
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit i010I(GameDetailActivity r0, AccountCreateOrder r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageViewRound iIiiO(GameDetailActivity r0) {
        return mGameIcon_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOOX010X() {
        return showPayConfirm$lambda$0$0();
    }

    private static final void initView$lambda$0(final GameDetailActivity r3, View r4) {
        if (r3.mUserAloneGameDetail != null) goto L5;
        i0O111.OXO1.iIiiO(r3);
        return;
    L5:
        if (i72.OXO1.iOIi00Ii() == true) goto L8;
        showLoginTipPopup$default(r3, 0, 1, null);
        return;
    L8:
        OrderManager.OXO1.OXO1("Game", String.valueOf(r3.getMSMGameInfo().getGid()), r3, new iiI0i0X11(r3));
    }

    private static final Unit initView$lambda$0$0(GameDetailActivity r7, AccountCreateOrder r8) {
        if (r8 == null) goto L7;
        r7.isNeedPayDialog = true;
        r7.orderNum = r8.getOrderNum();
        if (i72.OXO1.OX() == false) goto L6;
        String r9 = i0O111.OXO1.OIX0iXi(r7.orderNum);
        Bundle r6 = new Bundle();
        r6.putString("mArg0", r9);
        r6.putInt("mArg1", 2);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", null);
        Intent r10 = new Intent(r7, GoogleWebViewActivity.class);
        r10.putExtras(r6);
        r7.startActivity(r10);
    L9:
        return Unit.OXO1;
    L6:
        String r11 = i0O111.OXO1.OIX0iXi(r7.orderNum);
        Bundle r12 = new Bundle();
        r12.putString("mArg0", r11);
        r12.putInt("mArg1", 2);
        r12.putParcelable("mArg2", null);
        r12.putSerializable("mArg3", null);
        Intent r13 = new Intent(r7, WebViewActivity.class);
        r13.putExtras(r12);
        r7.startActivity(r13);
        goto L9
    L7:
        ToastUtils.showLong(r7.getString(R.string.fail_order), new Object[0]);
        goto L9
    }

    private static final void initView$lambda$1(GameDetailActivity r2, View r3) {
        String r0 = null;
        if (i72.OXO1.iOIi00Ii() == false) goto L5;
    L8:
        i0O111 r4 = i0O111.OXO1;
        UserMember r1 = r2.mUserMember;
        Intrinsics.XXI(r1);
        if (r4.OII(r1) == true) goto L20;
        UserAloneGameDetail r5 = r2.mUserAloneGameDetail;
        if (r5 == null) goto L14;
        r0 = r5.getPayStatus();
    L14:
        if (Intrinsics.XOO0ii0(r0, "Payed") == true) goto L20;
        if (r2.isFree == true) goto L20;
        r4.iIiiO(r2);
        return;
    L20:
        r2.startGame();
        return;
    L5:
        if (r2.isFree == true) goto L8;
        showLoginTipPopup$default(r2, 0, 1, null);
    }

    private static final Button mGameAlonePayBtn_delegate$lambda$0(GameDetailActivity r1) {
        return (Button) r1.findViewById(R.id.game_alone_pay_btn);
    }

    private static final TextView mGameContent_delegate$lambda$0(GameDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.game_detail_content);
    }

    private static final ImageViewRound mGameIcon_delegate$lambda$0(GameDetailActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.game_detail_iv_avatar);
    }

    private static final ImageViewRound mGameImg_delegate$lambda$0(GameDetailActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.game_detail_content_icon);
    }

    private static final TextView mGameNewLabel_delegate$lambda$0(GameDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.game_detail_new_label);
    }

    private static final TextView mGamePayLabel_delegate$lambda$0(GameDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.game_detail_pay_label);
    }

    private static final View mGamePayLayout_delegate$lambda$0(GameDetailActivity r1) {
        return r1.findViewById(R.id.game_pay_layout);
    }

    private static final Button mGamePayMemberBtn_delegate$lambda$0(GameDetailActivity r1) {
        return (Button) r1.findViewById(R.id.game_pay_member_btn);
    }

    private static final TextView mGamePlayNum_delegate$lambda$0(GameDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.game_detail_play_num);
    }

    private static final TextView mGameTitle_delegate$lambda$0(GameDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.game_detail_title);
    }

    public static /* synthetic */ void showLoginTipPopup$default(GameDetailActivity r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = R.string.game_nologin_tip;
    L5:
        r0.showLoginTipPopup(r1);
    }

    private static final boolean showLoginTipPopup$lambda$0$0(GameDetailActivity r1) {
        i72.OXO1.OiXXXi10(r1.getMContext());
        return true;
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.payment_completed_tip);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new IXO1OI());
        r0.X1IX(R.string.yes_payment, new iO0I011I1(this));
        this.mPayconfirmPopup = r0;
    L5:
        go0 r1 = this.mPayconfirmPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean showPayConfirm$lambda$0$0() {
        return true;
    }

    private static final boolean showPayConfirm$lambda$0$1(GameDetailActivity r1) {
        r1.onOrderPayStatusChange("");
        return true;
    }

    private static final boolean showStartGameTipPopup$lambda$0$0(GameDetailActivity r2, go0 r3) {
        boolean r0 = r2.startGameTouch;
        r2.startGameTouch = !r0;
        if (r0 == true) goto L5;
        i0O111.OXO1.X01IiOiIi(r2.getMSMGameInfo(), r2);
    L5:
        r3.dismiss();
        return true;
    }

    @aa1
    public final SMGameInfo getMSMGameInfo() {
        SMGameInfo r0 = this.mSMGameInfo;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        boolean r0 = i0O111.OXO1.OIi0().contains(Integer.valueOf(getMSMGameInfo().getGid()));
        this.isFree = r0;
        if (r0 == false) goto L5;
        return;
    L5:
        if (i72.OXO1.iOIi00Ii() == false) goto L8;
        this.isGetServerData = true;
        OrderManager.OXO1.O1O(new iO1OX0i(this));
        return;
    L8:
        View r1 = getMGamePayLayout();
        if (r1 == null) goto L11;
        r1.setVisibility(0);
    L11:
        Button r2 = getMGameAlonePayBtn();
        if (r2 == null) goto L16;
        r2.setVisibility(8);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        Parcelable r6 = getMArg2();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.tenmeter.smlibrary.entity.SMGameInfo");
        setMSMGameInfo((SMGameInfo) r6);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " gid = " + getMSMGameInfo().getGid() + "  " + getMSMGameInfo().getLabel());
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (this.isGetServerData == true) goto L5;
        getServerData();
    L5:
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new Gson().fromJson(r2.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r3 != null) goto L8;
        r3 = UserMember.class.newInstance();
    L8:
        this.mUserMember = (UserMember) r3;
        SPUtils r4 = r1.IiI10X();
        Object r5 = new Gson().fromJson(r4.getString(I01XX0.I0IIOI + '_' + UserAloneGameDetail.class.getName()), UserAloneGameDetail.class);
        if (r5 != null) goto L11;
        r5 = UserAloneGameDetail.class.newInstance();
    L11:
        this.mUserAloneGameDetail = (UserAloneGameDetail) r5;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_detail_title);
        Glide.with(this).load(getMSMGameInfo().getBackground()).into(getMGameIcon());
        Glide.with(this).load(getMSMGameInfo().getBackground()).into(getMGameImg());
        getAbhTitleRight().setImageResource(R.drawable.game_detail_right_icon);
        GradientDrawable r6 = new GradientDrawable();
        if (this.isFree == false) goto L14;
        getMGamePayLayout().setVisibility(0);
        getMGamePayLabel().setText(getString(R.string.free_order_amount));
        int r7 = getResources().getColor(R.color.game_member_free_tv_color);
    L15:
        r6.setCornerRadii(new float[]{20.0f, 20.0f, 20.0f, 20.0f, 20.0f, 20.0f, 0.0f, 0.0f});
        r6.setColor(r7);
        getMGamePayLabel().setBackground(r6);
        getMGameTitle().setText(getMSMGameInfo().getGname());
        getMGamePlayNum().setText(getString(R.string.game_play_num, new Object[]{Long.valueOf(getMSMGameInfo().getPlayNum())}));
        getMGameContent().setText(getMSMGameInfo().getDetails());
        Button r8 = getMGameAlonePayBtn();
        i72 r9 = i72.OXO1;
        String r10 = null;
        if (r9.OX() == false) goto L18;
        UserAloneGameDetail r11 = this.mUserAloneGameDetail;
        Intrinsics.XXI(r11);
        String r12 = XXiO.iO(r11.getDollar(), null, 2, null);
    L19:
        r8.setText(r12);
        Button r13 = getMGamePayMemberBtn();
        i0O111 r14 = i0O111.OXO1;
        UserMember r15 = this.mUserMember;
        Intrinsics.XXI(r15);
        if (r14.OII(r15) == true) goto L36;
        UserAloneGameDetail r16 = this.mUserAloneGameDetail;
        if (r16 == null) goto L25;
        r10 = r16.getPayStatus();
    L25:
        if (Intrinsics.XOO0ii0(r10, "Payed") == true) goto L36;
        if (this.isFree == true) goto L36;
        UserMember r0 = this.mUserMember;
        Intrinsics.XXI(r0);
        if (r0.getLatestGameMemberDateTime() <= 0) goto L33;
        String r17 = getString(R.string.game_detail_renewal_member);
    L37:
        r13.setText(r17);
        getMGameAlonePayBtn().setOnClickListener(new O1O1XIXO(this));
        getMGamePayMemberBtn().setOnClickListener(new iOOOX0I(this));
        getAbhTitleRight().setVisibility(0);
        return;
    L33:
        if (r9.iOIi00Ii() == false) goto L35;
        r17 = getString(R.string.game_detail_pay_member);
        goto L37
    L35:
        r17 = getString(R.string.game_detail_start_game);
    L36:
        getMGameAlonePayBtn().setVisibility(8);
        r17 = getString(R.string.game_detail_start_game);
        goto L37
    L18:
        UserAloneGameDetail r18 = this.mUserAloneGameDetail;
        Intrinsics.XXI(r18);
        r12 = XXiO.iO(r18.getAmount(), null, 2, null);
        goto L19
    L14:
        getMGamePayLabel().setText(getString(R.string.game_detail_pay_tip));
        r7 = getResources().getColor(R.color.game_member_pay_tv_color);
        goto L15
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_game_detail;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.GAME_CONTROL, BleKeyFlag.UPDATE, new BleGameControl(4, 0, 0, 0, 14, null), false, false, 24, null);
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 r4 = this.mPayconfirmPopup;
        if (r4 == null) goto L6;
        if (r4 == null) goto L6;
        r4.dismiss();
    L6:
        getMGamePayLayout().setVisibility(8);
        getServerData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog == false) goto L6;
        this.isNeedPayDialog = false;
        showPayConfirm();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (i72.OXO1.iOIi00Ii() == false) goto L6;
        i0O111.OXO1.iIiiO(this);
        return;
    L6:
        showLoginTipPopup$default(this, 0, 1, null);
    }

    @sf5(tag = I01XX0.I0IIOI)
    public final void onUserGameDetailChange(@aa1 Object r6) {
        Intrinsics.X0O(r6, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onUserMemberChange");
        getMGamePayLayout().setVisibility(0);
        SPUtils r7 = a01.OXO1.IiI10X();
        Object r8 = new Gson().fromJson(r7.getString(I01XX0.I0IIOI + '_' + UserAloneGameDetail.class.getName()), UserAloneGameDetail.class);
        if (r8 != null) goto L5;
        r8 = UserAloneGameDetail.class.newInstance();
    L5:
        UserAloneGameDetail r9 = (UserAloneGameDetail) r8;
        this.mUserAloneGameDetail = r9;
        if (r9 == null) goto L8;
        String r10 = r9.getPayStatus();
    L10:
        if (Intrinsics.XOO0ii0(r10, "Payed") == true) goto L18;
        i0O111 r11 = i0O111.OXO1;
        UserMember r2 = this.mUserMember;
        Intrinsics.XXI(r2);
        if (r11.OII(r2) == true) goto L18;
        Button r12 = getMGameAlonePayBtn();
        if (i72.OXO1.OX() == false) goto L16;
        UserAloneGameDetail r3 = this.mUserAloneGameDetail;
        Intrinsics.XXI(r3);
        String r1 = XXiO.iO(r3.getDollar(), null, 2, null);
    L17:
        r12.setText(r1);
        getMGameAlonePayBtn().setVisibility(0);
        goto L18
    L16:
        UserAloneGameDetail r4 = this.mUserAloneGameDetail;
        Intrinsics.XXI(r4);
        r1 = XXiO.iO(r4.getAmount(), null, 2, null);
    L18:
        initView();
        return;
    L8:
        r10 = null;
        goto L10
    }

    public final void setFree(boolean r1) {
        this.isFree = r1;
    }

    public final void setGetServerData(boolean r1) {
        this.isGetServerData = r1;
    }

    public final void setMSMGameInfo(@aa1 SMGameInfo r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSMGameInfo = r2;
    }

    public final void setMUserAloneGameDetail(@tb1 UserAloneGameDetail r1) {
        this.mUserAloneGameDetail = r1;
    }

    public final void setMUserMember(@tb1 UserMember r1) {
        this.mUserMember = r1;
    }

    public final void setNeedPayDialog(boolean r1) {
        this.isNeedPayDialog = r1;
    }

    public final void showLoginTipPopup(int r6) {
        if (this.mLoginTipPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(r6));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.yes_payment_go, new OXi0Xi1I(this));
        this.mLoginTipPopup = r0;
    L5:
        go0 r7 = this.mLoginTipPopup;
        if (r7 != null) goto L8;
    L10:
        go0 r8 = this.mLoginTipPopup;
        if (r8 == null) goto L14;
        r8.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r7.isShowing() != true) goto L10;
    }

    public final void showStartGameTipPopup() {
        int r1 = 0;
        if (this.mStartGameTipPopup != null) goto L5;
        final go0 r0 = new go0(this, r1, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.game_detail_guidance_content));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, null, null, 2, null);
        r0.X1IX(R.string.game_detail_guidance_knew, new i0OiOOO(this, r0));
        this.mStartGameTipPopup = r0;
    L5:
        this.startGameTouch = false;
        go0 r2 = this.mStartGameTipPopup;
        if (r2 == null) goto L9;
        r2.IIX1OXO();
        return;
    }

    public final void startGame() {
        a01 r0 = a01.OXO1;
        String r1 = r0.OXO1().getString(b01.iIIIi + this.mUser.getIdentity(), "");
        Intrinsics.XXI(r1);
        if (r1.length() > 0) goto L5;
    L7:
        i0O111.OXO1.iOOX010X(this.mUser.getIdentity(), this.mUser.getNickname(), this.mUser.getAvatarUrl());
    L8:
        showStartGameTipPopup();
        return;
    L5:
        if (Intrinsics.XOO0ii0(r1, this.mUser.getNickname() + this.mUser.getAvatarUrl()) == true) goto L7;
        r0.OXO1().put(b01.iIIIi + this.mUser.getIdentity(), this.mUser.getNickname() + this.mUser.getAvatarUrl());
        i0O111.OXO1.OX(this.mUser.getIdentity(), this.mUser.getNickname(), this.mUser.getAvatarUrl());
        goto L8
    }
}
