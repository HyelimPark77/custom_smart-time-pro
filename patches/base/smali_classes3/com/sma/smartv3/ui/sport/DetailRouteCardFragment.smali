.class public final Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;
.super Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDetailRouteCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailRouteCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailRouteCardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDetailRouteCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailRouteCardFragment.kt\ncom/sma/smartv3/ui/sport/DetailRouteCardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isGetSnapShot:Z

.field private final mCameraBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCrop$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteBtnLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteDistanceLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteImgBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;-><init>()V

    const-string v0, "DetailRouteCardFragment"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0i1I1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0i1I1X;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCameraBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIOiii11X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIOiii11X;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImgBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXI10ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXXI10ii;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI0XOi11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI0XOi11;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteDistanceLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX1II01XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX1II01XI;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteBtnLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0X00OIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0X00OIO;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCrop$delegate:Lkotlin/Lazy;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setShowLineMarker(Z)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setGradient(Z)V

    const v0, 0x7f06006c

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMMapLineColor(I)V

    return-void
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteBtnLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteDistanceLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCameraBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->convertWhiteToTransparent$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getSnapShot$lambda$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImgBg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->selectAvatar$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    return-object p0
.end method

.method private static final convertWhiteToTransparent$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMRouteImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->goneMap()V

    return-void
.end method

.method private final getMCameraBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCameraBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mCrop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    return-object v0
.end method

.method private static final getSnapShot$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->isGetSnapShot:Z

    new-instance v6, Lcom/android/mltcode/paycertificationapi/Xi100;

    invoke-direct {v6, p0, p1}, Lcom/android/mltcode/paycertificationapi/Xi100;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method private static final getSnapShot$lambda$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->convertWhiteToTransparent(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getSnapShot$lambda$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 9

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->isGetSnapShot:Z

    new-instance v6, Lcom/android/mltcode/paycertificationapi/IiiI0I1O;

    invoke-direct {v6, p0, p1}, Lcom/android/mltcode/paycertificationapi/IiiI0I1O;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    :cond_0
    return-void
.end method

.method private static final getSnapShot$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->convertWhiteToTransparent(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getSnapShot$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iX1O1(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->selectAvatar$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getSnapShot$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->selectAvatar$lambda$0$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getSnapShot$lambda$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->selectAvatar()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v1

    if-eqz v1, :cond_0

    const/16 v7, 0x1e0

    const/16 v8, 0x140

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide v5, 0x3fe999999999999aL    # 0.8

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->O00(Landroid/net/Uri;DDII)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mCameraBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a22

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMRouteImgBg()Landroid/widget/ImageView;

    move-result-object p0

    const-string v2, "<get-mRouteImgBg>(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, p0}, Lcom/android/mltcode/paycertificationapi/OO1010;->OXO1(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/xz3;Landroid/widget/ImageView;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final mRouteBtnLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0aef

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRouteDistanceLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09b9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRouteImgBg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a26

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRouteImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a27

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1iI0iX0i;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1iI0iX0i;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->iOOX010X(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->iO()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$1(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->OIX0iXi()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final convertWhiteToTransparent(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "img"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " convertWhiteToTransparent"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int v1, v5, v9

    new-array v3, v1, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move v8, v5

    move-object v2, p1

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 p1, 0x0

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_2

    aget v4, v3, v2

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v6

    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v7

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    const/16 v8, 0xeb

    if-le v6, v8, :cond_0

    if-le v7, v8, :cond_0

    const/16 v10, 0xdc

    if-le v4, v10, :cond_0

    aput p1, v3, v2

    goto :goto_1

    :cond_0
    const/16 v10, 0x32

    if-ge v6, v10, :cond_1

    if-ge v7, v8, :cond_1

    const/16 v6, 0x96

    if-ge v4, v6, :cond_1

    const/4 v4, -0x1

    aput v4, v3, v2

    goto :goto_1

    :cond_1
    aput p1, v3, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move v8, v5

    move-object v2, v0

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " convertWhiteToTransparent OK"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/I11OXX1;

    invoke-direct {p1, p0, v2}, Lcom/android/mltcode/paycertificationapi/I11OXX1;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;Landroid/graphics/Bitmap;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-object v2
.end method

.method public final getMRouteBtnLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteBtnLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getMRouteDistanceLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteDistanceLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getMRouteImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRouteImgBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mRouteImgBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getSnapShot()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getSnapShot"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->isGetSnapShot:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ii0OXiO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ii0OXiO;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mGoogleMap.snapshot"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX1I1I0X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iX1I1I0X;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    return-void
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final goneMap()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMRouteBtnLayout()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCameraBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiIII10i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XiIII10i;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/q62;->X0XI11I(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMRouteDistanceLayout()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMRouteDistanceLayout()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ii1OI0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ii1OI0i;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->I0iXXO(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public initializedMapFinish()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->initializedMapFinish()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapType(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    return-void
.end method

.method public final isGetSnapShot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->isGetSnapShot:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e8c

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 10
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/16 v8, 0x1e0

    const/16 v9, 0x140

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide v6, 0x3fe999999999999aL    # 0.8

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v9}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->XOO0ii0(IILandroid/content/Intent;DDII)V

    return-void
.end method

.method public final selectAvatar()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiiiOIiOX;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/OiiiOIiOX;-><init>(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX1110ii1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XX1110ii1;-><init>(Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final setGetSnapShot(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->isGetSnapShot:Z

    return-void
.end method

.method public shareImage()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getShareCardView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getShareCardView()Landroidx/cardview/widget/CardView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getShareCardView()Landroidx/cardview/widget/CardView;

    move-result-object v3

    const-string v4, "<get-shareCardView>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getMBitmapRadius()F

    move-result v1

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->toRoundCorner(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "toRoundCorner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iOiXi11II(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
