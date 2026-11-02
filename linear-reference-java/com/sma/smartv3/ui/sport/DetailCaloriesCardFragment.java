package com.sma.smartv3.ui.sport;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.mltcode.paycertificationapi.I1XO1OIX;
import com.android.mltcode.paycertificationapi.Ii10IX;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0ii0iO;
import com.android.mltcode.paycertificationapi.OX0i00;
import com.android.mltcode.paycertificationapi.OXi0X1O;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XO1OIOOI1;
import com.android.mltcode.paycertificationapi.XOOO00OO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1II0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import java.io.Serializable;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDetailCaloriesCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailCaloriesCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailCaloriesCardFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,102:1\n19#2:103\n15#2:104\n*S KotlinDebug\n*F\n+ 1 DetailCaloriesCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailCaloriesCardFragment\n*L\n45#1:103\n45#1:104\n*E\n"})
public class DetailCaloriesCardFragment extends BaseFragment {

    @aa1
    private final Lazy btnShare$delegate;

    @aa1
    private final Lazy ivAvatar$delegate;
    private final float mBitmapRadius;
    public Workout mWorkout;

    @aa1
    private final Lazy shareCardView$delegate;

    @aa1
    private final Lazy tvCaloriesValue$delegate;

    @aa1
    private final Lazy tvDateTime$delegate;

    @aa1
    private final Lazy tvDetailname$delegate;

    @aa1
    private final Lazy tvNickname$delegate;

    @aa1
    private final AppUser userProfile;

    public DetailCaloriesCardFragment() {
        this.shareCardView$delegate = LazyKt__LazyJVMKt.iO(new OX0i00(this));
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new XOOO00OO(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new OXi0X1O(this));
        this.tvDateTime$delegate = LazyKt__LazyJVMKt.iO(new O0ii0iO(this));
        this.tvCaloriesValue$delegate = LazyKt__LazyJVMKt.iO(new iO1II0(this));
        this.tvDetailname$delegate = LazyKt__LazyJVMKt.iO(new Ii10IX(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.btnShare$delegate = LazyKt__LazyJVMKt.iO(new XO1OIOOI1(this));
        this.mBitmapRadius = 30.0f;
    }

    public static /* synthetic */ TextView I0IIOi(DetailCaloriesCardFragment r0) {
        return tvDateTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IiI10X(DetailCaloriesCardFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView O00(DetailCaloriesCardFragment r0) {
        return tvCaloriesValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIi0(DetailCaloriesCardFragment r0) {
        return tvDetailname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound XIi00iiXO(DetailCaloriesCardFragment r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(DetailCaloriesCardFragment r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CardView XOO0ii0(DetailCaloriesCardFragment r0) {
        return shareCardView_delegate$lambda$0(r0);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    }

    private static final Button btnShare_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_share);
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDateTime() {
        return (TextView) getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) getValue();
    }

    public static /* synthetic */ Button iO(DetailCaloriesCardFragment r0) {
        return btnShare_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(DetailCaloriesCardFragment r0, View r1) {
        r0.shareImage();
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (ImageViewRound) r1.getMView().findViewById(R.id.iv_avatar);
    }

    private static final CardView shareCardView_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (CardView) r1.getMView().findViewById(R.id.base_share_cardView);
    }

    private static final TextView tvCaloriesValue_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_calories_value);
    }

    private static final TextView tvDateTime_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_dateTime);
    }

    private static final TextView tvDetailname_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_detail_name);
    }

    private static final TextView tvNickname_delegate$lambda$0(DetailCaloriesCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.edt_nickname);
    }

    public final Button getBtnShare() {
        return (Button) getValue();
    }

    public final float getMBitmapRadius() {
        return this.mBitmapRadius;
    }

    @aa1
    public final Workout getMWorkout() {
        Workout r0 = this.mWorkout;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final CardView getShareCardView() {
        return (CardView) getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        Serializable r0 = getMArg3();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) r0);
        getTvDetailname().setText(q62.OXO1.i01OOiI(getMWorkout().getMMode()));
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        getTvNickname().setText(this.userProfile.getNickname());
        getTvCaloriesValue().setText(String.valueOf(getMWorkout().getMCalorie() / 1000));
        avatarShow();
        getBtnShare().setOnClickListener(new I1XO1OIX(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_calories;
    }

    public final void setMWorkout(@aa1 Workout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWorkout = r2;
    }

    public final void shareImage() {
        Bitmap r0 = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        Canvas r1 = new Canvas(r0);
        XIi1i01O r2 = XIi1i01O.OXO1;
        CardView r3 = getShareCardView();
        Intrinsics.O10IXXX0X(r3, "<get-shareCardView>(...)");
        r1.drawBitmap(r2.XIi00iiXO(r3), 0.0f, 0.0f, null);
        Bitmap r4 = ImageUtils.toRoundCorner(r0, this.mBitmapRadius);
        Intrinsics.O10IXXX0X(r4, "toRoundCorner(...)");
        ImageUtils.save(r4, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }
}
