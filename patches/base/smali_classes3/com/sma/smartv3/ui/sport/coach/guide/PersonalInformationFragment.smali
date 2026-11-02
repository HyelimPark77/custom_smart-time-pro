.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonalInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n19#2:253\n15#2:254\n99#3,16:255\n123#3:294\n116#4,23:271\n*S KotlinDebug\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n*L\n61#1:253\n61#1:254\n224#1:255,16\n224#1:294\n224#1:271,23\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPersonalInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n19#2:253\n15#2:254\n99#3,16:255\n123#3:294\n116#4,23:271\n*S KotlinDebug\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n*L\n61#1:253\n61#1:254\n224#1:255,16\n224#1:294\n224#1:271,23\n*E\n"
    }
.end annotation


# instance fields
.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBirthdayPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBirthdayTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field protected mContext:Landroid/app/Activity;

.field private final mDateBirthLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mGenderLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGenderPopup:Lcom/android/mltcode/paycertificationapi/pv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGenderTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHeightLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mHeightPopup:Lcom/android/mltcode/paycertificationapi/XX00;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mHeightTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWeightLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeightPopup:Lcom/android/mltcode/paycertificationapi/j07;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mWeightTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vt1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/vt1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/du1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/du1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mDateBirthLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/eu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/eu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/fu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/gu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderTv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/hu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayTv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iu1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightTv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ju1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ju1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightTv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ku1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ku1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->rootView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectBirthday$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->initView$lambda$3(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectWeight$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z

    move-result p0

    return p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectGender$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectHeight$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mDateBirthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMAppUser$p(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method private final birthDataFormat(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x9

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectGender()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectBirthday()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectHeight()V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->selectWeight()V

    return-void
.end method

.method private static final mBirthdayTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0904

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mDateBirthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0903

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final mGenderLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0905

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final mGenderTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0906

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mHeightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0907

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final mHeightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0908

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mWeightLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0909

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final mWeightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a090a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final selectBirthday$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;III)Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AppUser;->setBirthday(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupBirthday()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final selectGender$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;I)Z
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/model/AppUser;->setGender(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMGenderTv()Landroid/widget/TextView;

    move-result-object p0

    if-nez p1, :cond_1

    const p1, 0x7f140e73

    goto :goto_1

    :cond_1
    const p1, 0x7f140bd1

    :goto_1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    return v1
.end method

.method private static final selectHeight$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AppUser;->setHeight(F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupHeight()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final selectWeight$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;F)Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AppUser;->setWeight(F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupWeight()V

    const/4 p0, 0x1

    return p0
.end method

.method private final setupBirthday()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    const-string v1, "01/01/2000"

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/AppUser;->setBirthday(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->XOO0ii0(Ljava/lang/String;)Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMBirthdayTv()Landroid/widget/TextView;

    move-result-object v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/i72;->IiXIIX1O1()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/i72;->XiOIO()Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$OXO1;->OXO1:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    const-string v6, "/"

    if-eq v4, v5, :cond_2

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->birthDataFormat(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setupGender()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMGenderTv()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const v1, 0x7f140e73

    goto :goto_0

    :cond_0
    const v1, 0x7f140bd1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private final setupHeight()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMHeightTv()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140ba3

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l76;->OXO1(F)[I

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMHeightTv()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    aget v2, v0, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f14039e

    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setupWeight()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMWeightTv()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140ba5

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMWeightTv()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/l76;->iO(F)F

    move-result v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iX1O1(FZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140ba6

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getMBirthdayTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMContext()Landroid/app/Activity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mContext:Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMDateBirthLayout()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mDateBirthLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getMGenderLayout()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getMGenderTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMHeightLayout()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getMHeightTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMWeightLayout()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getMWeightTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setMContext(Landroid/app/Activity;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupGender()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupBirthday()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupHeight()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->setupWeight()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMGenderLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lu1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMDateBirthLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wt1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wt1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMHeightLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xt1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xt1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMWeightLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yt1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yt1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0177

    return v0
.end method

.method public onSlideDeselected()V
    .locals 14

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/AppUser;->setThirdPlatform(Lcom/sma/smartv3/model/ThirdPlatform;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0IIOi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    new-instance v4, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v0, v5, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    sget-object v1, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/appuser/update"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$1;

    invoke-direct {v6, v5, v4, v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "avatar"

    invoke-virtual {v0, v4, v2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    :cond_0
    invoke-virtual {v0, v3}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils$upload$$inlined$upload$1;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils$upload$$inlined$upload$1;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/AppUser;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$2;

    invoke-direct {v2, v6}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OXO1(Ljava/lang/String;)I

    move-result v2

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->setUserAge(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v5

    const/16 v12, 0x3f0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OiIIX101O(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;IIFFIIFFLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XO0O10()V

    return-void
.end method

.method public onSlideSelected()V
    .locals 0

    return-void
.end method

.method public final selectBirthday()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f140210

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->iX(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/au1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/au1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->i010I(Lkotlin/jvm/functions/Function3;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mBirthdayPopup:Lcom/android/mltcode/paycertificationapi/O1100iXOX;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getBirthday()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XOO0ii0(Ljava/lang/String;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/O1100iXOX;->II1Xi0(III)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final selectGender()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderPopup:Lcom/android/mltcode/paycertificationapi/pv1;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pv1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f030020

    invoke-direct {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/pv1;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/pv1;->IXXOO(Z)V

    const v2, 0x7f140c40

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/pv1;->iX(I)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/cu1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/cu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/pv1;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderPopup:Lcom/android/mltcode/paycertificationapi/pv1;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mGenderPopup:Lcom/android/mltcode/paycertificationapi/pv1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMGenderTv()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const-string v3, "getText(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    const v3, 0x7f140e73

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/pv1;->iOO1ii1(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final selectHeight()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightPopup:Lcom/android/mltcode/paycertificationapi/XX00;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX00;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX00;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f140ccb

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX00;->iX(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX00;->IXXOO(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zt1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zt1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX00;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightPopup:Lcom/android/mltcode/paycertificationapi/XX00;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mHeightPopup:Lcom/android/mltcode/paycertificationapi/XX00;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    const/high16 v1, 0x432f0000    # 175.0f

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XX00;->II1Xi0(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final selectWeight()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightPopup:Lcom/android/mltcode/paycertificationapi/j07;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/j07;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f141500

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->i010I(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->iX(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bu1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bu1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->II1Xi0(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightPopup:Lcom/android/mltcode/paycertificationapi/j07;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mWeightPopup:Lcom/android/mltcode/paycertificationapi/j07;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    const/high16 v1, 0x42820000    # 65.0f

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/j07;->IXXOO(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final setMContext(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->mContext:Landroid/app/Activity;

    return-void
.end method
