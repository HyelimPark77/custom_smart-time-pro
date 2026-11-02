.class public Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;
.super Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;
.source "SourceFile"


# instance fields
.field private final btnShare$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivAvatar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBitmapRadius:F

.field private final paceValueLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final shareCardView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgPaceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDetailname$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNickname$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI0XI00X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI0XI00X0;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->ivAvatar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX00XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX00XX;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvNickname$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOO00I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOO00I;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvDetailname$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0Xi0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0Xi0I;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->paceValueLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1II110;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1II110;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1IX;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->btnShare$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXI0X01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXI0X01;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareCardView$delegate:Lkotlin/Lazy;

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->mBitmapRadius:F

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareImage$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvDetailname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final avatarShow()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f081568

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method private static final btnShare_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01e8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->ivAvatar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object v0
.end method

.method private final getPaceValueLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->paceValueLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvAvgPaceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDetailname()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvDetailname$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNickname()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->tvNickname$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->paceValueLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareImage$lambda$1(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->btnShare_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareCardView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareImage()V

    return-void
.end method

.method private static final ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a060f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object p0
.end method

.method private static final paceValueLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0711

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final saveBitmap(Landroid/graphics/Bitmap;)V
    .locals 6

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

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getShareCardView()Landroidx/cardview/widget/CardView;

    move-result-object v4

    const-string v5, "<get-shareCardView>(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v1, p1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->mBitmapRadius:F

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ImageUtils;->toRoundCorner(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "toRoundCorner(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->iOiXi11II(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final shareCardView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroidx/cardview/widget/CardView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a010c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method private static final shareImage$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->saveBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final shareImage$lambda$1(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->saveBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0ce0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDetailname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0349

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getBtnShare()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->btnShare$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getMBitmapRadius()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->mBitmapRadius:F

    return v0
.end method

.method public final getShareCardView()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->shareCardView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getTvDetailname()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getTvNickname()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->avatarShow()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getPaceValueLayout()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getTvAvgPaceValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getPaceValueLayout()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->getBtnShare()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O010X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O010X;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initializedMapFinish()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-static {}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomOut()Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BaiduMap;->getUiSettings()Lcom/baidu/mapapi/map/UiSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/UiSettings;->setAllGesturesEnabled(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomOut()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    return-void
.end method

.method public shareImage()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXXXI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XXXXI;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO10010;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IO10010;-><init>(Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    return-void
.end method
