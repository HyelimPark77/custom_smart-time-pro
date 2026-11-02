package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.I11OXX1;
import com.android.mltcode.paycertificationapi.IX1II01XI;
import com.android.mltcode.paycertificationapi.IiiI0I1O;
import com.android.mltcode.paycertificationapi.O0i1I1X;
import com.android.mltcode.paycertificationapi.OI0XOi11;
import com.android.mltcode.paycertificationapi.OIOiii11X;
import com.android.mltcode.paycertificationapi.OO1010;
import com.android.mltcode.paycertificationapi.OiiiOIiOX;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XX1110ii1;
import com.android.mltcode.paycertificationapi.Xi100;
import com.android.mltcode.paycertificationapi.XiIII10i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i0X00OIO;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iI0iX0i;
import com.android.mltcode.paycertificationapi.iX1I1I0X;
import com.android.mltcode.paycertificationapi.iXXI10ii;
import com.android.mltcode.paycertificationapi.ii0OXiO;
import com.android.mltcode.paycertificationapi.ii1OI0i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tn4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDetailRouteCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailRouteCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailRouteCardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class DetailRouteCardFragment extends BaseDetailCardFragment {

    @aa1
    private final String TAG;
    private boolean isGetSnapShot;

    @aa1
    private final Lazy mCameraBtn$delegate;

    @aa1
    private final Lazy mCrop$delegate;

    @aa1
    private final Lazy mRouteBtnLayout$delegate;

    @aa1
    private final Lazy mRouteDistanceLayout$delegate;

    @aa1
    private final Lazy mRouteImg$delegate;

    @aa1
    private final Lazy mRouteImgBg$delegate;

    @tb1
    private xz3 mSelectAvatarPopup;

    public DetailRouteCardFragment() {
        this.TAG = "DetailRouteCardFragment";
        this.mCameraBtn$delegate = LazyKt__LazyJVMKt.iO(new O0i1I1X(this));
        this.mRouteImgBg$delegate = LazyKt__LazyJVMKt.iO(new OIOiii11X(this));
        this.mRouteImg$delegate = LazyKt__LazyJVMKt.iO(new iXXI10ii(this));
        this.mRouteDistanceLayout$delegate = LazyKt__LazyJVMKt.iO(new OI0XOi11(this));
        this.mRouteBtnLayout$delegate = LazyKt__LazyJVMKt.iO(new IX1II01XI(this));
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new i0X00OIO(this));
        setShowLineMarker(false);
        setGradient(false);
        setMMapLineColor(R.color.black);
    }

    public static /* synthetic */ View Ii1iii0(DetailRouteCardFragment r0) {
        return mRouteBtnLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O001I(DetailRouteCardFragment r0) {
        return mRouteDistanceLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0i1O(DetailRouteCardFragment r0) {
        return mCameraBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X100O(DetailRouteCardFragment r0, Bitmap r1) {
        convertWhiteToTransparent$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X11I(DetailRouteCardFragment r0, Bitmap r1) {
        return getSnapShot$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView X11iII1O1(DetailRouteCardFragment r0) {
        return mRouteImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1IX(DetailRouteCardFragment r0) {
        return mRouteImgBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXIIO1i11(DetailRouteCardFragment r0, Uri r1) {
        return initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit XXO(DetailRouteCardFragment r0, boolean r1) {
        return selectAvatar$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ i1Ii1i11X XXX11i(DetailRouteCardFragment r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    private static final void convertWhiteToTransparent$lambda$0(DetailRouteCardFragment r1, Bitmap r2) {
        r1.getMRouteImg().setImageBitmap(r2);
        r1.goneMap();
    }

    private final ImageView getMCameraBtn() {
        return (ImageView) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private static final void getSnapShot$lambda$0(final DetailRouteCardFragment r9, final Bitmap r10) {
        r9.isGetSnapShot = true;
        ThreadsKt.iO(true, false, null, null, 0, new Xi100(r9, r10), 30, null);
    }

    private static final Unit getSnapShot$lambda$0$0(DetailRouteCardFragment r0, Bitmap r1) {
        Intrinsics.XXI(r1);
        r0.convertWhiteToTransparent(r1);
        return Unit.OXO1;
    }

    private static final void getSnapShot$lambda$1(final DetailRouteCardFragment r9, final Bitmap r10) {
        if (r10 == null) goto L5;
        r9.isGetSnapShot = true;
        ThreadsKt.iO(true, false, null, null, 0, new IiiI0I1O(r9, r10), 30, null);
        return;
    }

    private static final Unit getSnapShot$lambda$1$0$0(DetailRouteCardFragment r0, Bitmap r1) {
        r0.convertWhiteToTransparent(r1);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iI(DetailRouteCardFragment r0, Bitmap r1) {
        return getSnapShot$lambda$1$0$0(r0, r1);
    }

    public static /* synthetic */ void iIXi1iiXI(DetailRouteCardFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iX1O1(xz3 r0, DetailRouteCardFragment r1) {
        return selectAvatar$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void iXiX011(DetailRouteCardFragment r0, Bitmap r1) {
        getSnapShot$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iXiiiO(DetailRouteCardFragment r0) {
        return selectAvatar$lambda$0$1(r0);
    }

    public static /* synthetic */ void iiiO(DetailRouteCardFragment r0, Bitmap r1) {
        getSnapShot$lambda$1(r0, r1);
    }

    private static final void initView$lambda$0(DetailRouteCardFragment r0, View r1) {
        r0.selectAvatar();
    }

    private static final Unit initView$lambda$1(DetailRouteCardFragment r9, Uri r10) {
        Intrinsics.X0O(r10, "it");
        i1Ii1i11X r1 = r9.getMCrop();
        if (r1 == null) goto L6;
        r1.O00(r10, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    L6:
        return Unit.OXO1;
    }

    private static final ImageView mCameraBtn_delegate$lambda$0(DetailRouteCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_map_camera);
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(DetailRouteCardFragment r3) {
        Context r0 = r3.getContext();
        if (r0 == null) goto L6;
        xz3 r1 = r3.mSelectAvatarPopup;
        ImageView r4 = r3.getMRouteImgBg();
        Intrinsics.O10IXXX0X(r4, "<get-mRouteImgBg>(...)");
        return OO1010.OXO1(r0, r1, r4);
    L6:
        return null;
    }

    private static final View mRouteBtnLayout_delegate$lambda$0(DetailRouteCardFragment r1) {
        return r1.getMView().findViewById(R.id.sport_detail_share_card_route_btn_layout);
    }

    private static final View mRouteDistanceLayout_delegate$lambda$0(DetailRouteCardFragment r1) {
        return r1.getMView().findViewById(R.id.route_distance_ll);
    }

    private static final ImageView mRouteImgBg_delegate$lambda$0(DetailRouteCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_route_image);
    }

    private static final ImageView mRouteImg_delegate$lambda$0(DetailRouteCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_route_image_figure);
    }

    private static final Unit selectAvatar$lambda$0$0(xz3 r2, final DetailRouteCardFragment r3) {
        hr1.OXO1.iOOX010X(r2.XO0O10(), new i1iI0iX0i(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$0$0(DetailRouteCardFragment r0, boolean r1) {
        if (r1 == false) goto L5;
        i1Ii1i11X r2 = r0.getMCrop();
        Intrinsics.XXI(r2);
        r2.iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1(DetailRouteCardFragment r0) {
        i1Ii1i11X r1 = r0.getMCrop();
        Intrinsics.XXI(r1);
        r1.OIX0iXi();
        return Unit.OXO1;
    }

    @aa1
    public final Bitmap convertWhiteToTransparent(@aa1 Bitmap r12) {
        Intrinsics.X0O(r12, tn4.X01IiOiIi);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " convertWhiteToTransparent");
        int r5 = r12.getWidth();
        int r9 = r12.getHeight();
        final Bitmap r0 = Bitmap.createBitmap(r5, r9, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        int r1 = r5 * r9;
        int[] r3 = new int[r1];
        r12.getPixels(r3, 0, r5, 0, 0, r5, r9);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L18;
        int r4 = r3[r2];
        int r6 = Color.red(r4);
        int r7 = Color.green(r4);
        int r8 = Color.blue(r4);
        if (r6 <= 235) goto L11;
        if (r7 <= 235) goto L11;
        if (r8 <= 220) goto L11;
        r3[r2] = 0;
    L17:
        r2 = r2 + 1;
    L11:
        if (r6 >= 50) goto L16;
        if (r7 >= 235) goto L16;
        if (r8 >= 150) goto L16;
        r3[r2] = -1;
    L16:
        r3[r2] = 0;
        goto L17
    L18:
        r0.setPixels(r3, 0, r5, 0, 0, r5, r9);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " convertWhiteToTransparent OK");
        ThreadUtils.runOnUiThread(new I11OXX1(this, r0));
        return r0;
    }

    public final View getMRouteBtnLayout() {
        return (View) getValue();
    }

    public final View getMRouteDistanceLayout() {
        return (View) getValue();
    }

    public final ImageView getMRouteImg() {
        return (ImageView) getValue();
    }

    public final ImageView getMRouteImgBg() {
        return (ImageView) getValue();
    }

    public final void getSnapShot() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1(this.TAG + " getSnapShot");
        if (this.isGetSnapShot == false) goto L8;
        if (isLocationEmpty() == true) goto L8;
        return;
    L8:
        if (isInChinaMainland() == false) goto L11;
        getMBaiDuMap().snapshot(new ii0OXiO(this));
        return;
    L11:
        r0.OXO1(this.TAG + " mGoogleMap.snapshot");
        getMGoogleMap().snapshot(new iX1I1I0X(this));
    }

    @aa1
    public final String getTAG() {
        return this.TAG;
    }

    public final void goneMap() {
        if (isInChinaMainland() == false) goto L11;
        if (isLocationEmpty() == true) goto L7;
        return;
    L7:
        if (getMBMapView() == null) goto L17;
        getMBMapView().setVisibility(4);
        return;
    L17:
        return;
    L11:
        if (isLocationEmpty() == true) goto L13;
        return;
    L13:
        if (getMGMapView() == null) goto L19;
        getMGMapView().setVisibility(4);
        return;
    }

    @Override // com.sma.smartv3.ui.sport.BaseDetailCardFragment, com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getMRouteBtnLayout().setVisibility(8);
        getMCameraBtn().setOnClickListener(new XiIII10i(this));
        if (q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null) == false) goto L5;
        getMRouteDistanceLayout().setVisibility(0);
    L6:
        i1Ii1i11X r0 = getMCrop();
        if (r0 == null) goto L10;
        r0.I0iXXO(this, new ii1OI0i(this));
        return;
    L10:
        return;
    L5:
        getMRouteDistanceLayout().setVisibility(4);
        goto L6
    }

    @Override // com.sma.smartv3.ui.sport.BaseDetailCardFragment, com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        super.initializedMapFinish();
        if (isInChinaMainland() == false) goto L6;
        getMBaiDuMap().setMapType(3);
        return;
    L6:
        getMGoogleMap().setMapType(0);
    }

    public final boolean isGetSnapShot() {
        return this.isGetSnapShot;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_route;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r11, int r12, @tb1 Intent r13) {
        super.onActivityResult(r11, r12, r13);
        i1Ii1i11X r0 = getMCrop();
        Intrinsics.XXI(r0);
        r0.XOO0ii0(r11, r12, r13, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    }

    public final void selectAvatar() {
        if (this.mSelectAvatarPopup != null) goto L5;
        final xz3 r0 = new xz3(getMActivity());
        r0.iX(new OiiiOIiOX(r0, this));
        r0.i010I(new XX1110ii1(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    public final void setGetSnapShot(boolean r1) {
        this.isGetSnapShot = r1;
    }

    @Override // com.sma.smartv3.ui.sport.BaseDetailCardFragment
    public void shareImage() {
        Bitmap r0 = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        Canvas r1 = new Canvas(r0);
        XIi1i01O r2 = XIi1i01O.OXO1;
        CardView r3 = getShareCardView();
        Intrinsics.O10IXXX0X(r3, "<get-shareCardView>(...)");
        r1.drawBitmap(r2.XIi00iiXO(r3), 0.0f, 0.0f, null);
        Bitmap r4 = ImageUtils.toRoundCorner(r0, getMBitmapRadius());
        Intrinsics.O10IXXX0X(r4, "toRoundCorner(...)");
        ImageUtils.save(r4, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }
}
