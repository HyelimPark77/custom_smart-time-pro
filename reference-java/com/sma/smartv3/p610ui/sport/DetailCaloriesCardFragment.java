package com.sma.smartv3.p610ui.sport;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.DetailCaloriesCardFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import java.io.Serializable;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDetailCaloriesCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailCaloriesCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailCaloriesCardFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,102:1\n19#2:103\n15#2:104\n*S KotlinDebug\n*F\n+ 1 DetailCaloriesCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailCaloriesCardFragment\n*L\n45#1:103\n45#1:104\n*E\n"})
public class DetailCaloriesCardFragment extends BaseFragment {

    @aa1
    private final Lazy btnShare$delegate;
    private final float mBitmapRadius;
    public Workout mWorkout;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy shareCardView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX0i00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.shareCardView_delegate$lambda$0(this.f3413IO);
        }
    });

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOO00OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.ivAvatar_delegate$lambda$0(this.f4815IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXi0X1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.tvNickname_delegate$lambda$0(this.f3565IO);
        }
    });

    @aa1
    private final Lazy tvDateTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0ii0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.tvDateTime_delegate$lambda$0(this.f2607IO);
        }
    });

    @aa1
    private final Lazy tvCaloriesValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1II0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.tvCaloriesValue_delegate$lambda$0(this.f8028IO);
        }
    });

    @aa1
    private final Lazy tvDetailname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii10IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailCaloriesCardFragment.tvDetailname_delegate$lambda$0(this.f2194IO);
        }
    });

    public DetailCaloriesCardFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.btnShare$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1OIOOI1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DetailCaloriesCardFragment.btnShare_delegate$lambda$0(this.f4732IO);
            }
        });
        this.mBitmapRadius = 30.0f;
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnShare_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (Button) detailCaloriesCardFragment.getMView().findViewById(R.id.btn_share);
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) this.tvCaloriesValue$delegate.getValue();
    }

    private final TextView getTvDateTime() {
        return (TextView) this.tvDateTime$delegate.getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) this.tvDetailname$delegate.getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) this.tvNickname$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (ImageViewRound) detailCaloriesCardFragment.getMView().findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView shareCardView_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (CardView) detailCaloriesCardFragment.getMView().findViewById(R.id.base_share_cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCaloriesValue_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (TextView) detailCaloriesCardFragment.getMView().findViewById(R.id.tv_calories_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDateTime_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (TextView) detailCaloriesCardFragment.getMView().findViewById(R.id.tv_dateTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDetailname_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (TextView) detailCaloriesCardFragment.getMView().findViewById(R.id.tv_detail_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickname_delegate$lambda$0(DetailCaloriesCardFragment detailCaloriesCardFragment) {
        return (TextView) detailCaloriesCardFragment.getMView().findViewById(R.id.edt_nickname);
    }

    public final Button getBtnShare() {
        return (Button) this.btnShare$delegate.getValue();
    }

    public final float getMBitmapRadius() {
        return this.mBitmapRadius;
    }

    @aa1
    public final Workout getMWorkout() {
        Workout workout = this.mWorkout;
        if (workout != null) {
            return workout;
        }
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final CardView getShareCardView() {
        return (CardView) this.shareCardView$delegate.getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) mArg3);
        getTvDetailname().setText(q62.OXO1.i01OOiI(getMWorkout().getMMode()));
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        getTvNickname().setText(this.userProfile.getNickname());
        getTvCaloriesValue().setText(String.valueOf(getMWorkout().getMCalorie() / 1000));
        avatarShow();
        getBtnShare().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I1XO1OIX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1455IO.shareImage();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_calories;
    }

    public final void setMWorkout(@aa1 Workout workout) {
        Intrinsics.X0O(workout, "<set-?>");
        this.mWorkout = workout;
    }

    public final void shareImage() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        CardView shareCardView = getShareCardView();
        Intrinsics.O10IXXX0X(shareCardView, "<get-shareCardView>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(shareCardView), 0.0f, 0.0f, (Paint) null);
        Bitmap roundCorner = ImageUtils.toRoundCorner(bitmapCreateBitmap, this.mBitmapRadius);
        Intrinsics.O10IXXX0X(roundCorner, "toRoundCorner(...)");
        ImageUtils.save(roundCorner, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }
}
