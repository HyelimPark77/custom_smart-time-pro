.class public final Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;
.super Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;
.source "SourceFile"


# instance fields
.field private final mCameraBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCrop$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCustomize$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEditBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/a94;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRlShareCard$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRouteImgFigure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvAvgPaceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvAvgPaceValueLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0110;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO0110;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1XXiI1O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1XXiI1O1;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCustomize$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIXXX1O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIXXX1O;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCameraBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0iI011i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0iI011i;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRlShareCard$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX0OX0II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX0OX0II;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOI0II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIOI0II;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImgFigure$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi0Ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi0Ii;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOXOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOXOX;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I00III;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I00III;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDuration$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i11OO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i11OO1i;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0XIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO0XIO;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValueLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiIiIiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiIiIiX;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCrop$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->selectAvatar$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->selectAvatar$lambda$0$1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCustomize_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCameraBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValueLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRlShareCard_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Ljava/lang/String;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->showEditPop$lambda$0$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImgFigure_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getMRlShareCard(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMRlShareCard()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMRouteImg(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMRouteImg()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMRouteImgFigure(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMRouteImgFigure()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMSelectAvatarPopup$p(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lcom/android/mltcode/paycertificationapi/xz3;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    return-object p0
.end method

.method private final getMCameraBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCameraBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCrop$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    return-object v0
.end method

.method private final getMCustomize()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mCustomize$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMEditBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMRlShareCard()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRlShareCard$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMRouteImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMRouteImgFigure()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mRouteImgFigure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTvAvgPaceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvAvgPaceValueLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvAvgPaceValueLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvDistanceUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDistanceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDuration()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->tvDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->selectAvatar$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic initCustomizeText$default(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->initCustomizeText(I)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->showEditPop()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->selectAvatar()V

    return-void
.end method

.method private static final mCameraBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a22

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCrop_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    new-instance v2, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/content/Context;)V

    invoke-direct {v1, v0, v2}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;-><init>(Ljava/lang/Object;Lcom/android/mltcode/paycertificationapi/i1Ii1i11X$XIi00iiXO;)V

    return-object v1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final mCustomize_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a21

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mEditBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a23

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRlShareCard_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a25

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRouteImgFigure_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a27

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRouteImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a26

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$0(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI0i0;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/OI0i0;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->iOOX010X(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->iO()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final selectAvatar$lambda$0$1(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->OIX0iXi()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showEditPop()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditPop:Lcom/android/mltcode/paycertificationapi/a94;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a94;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/a94;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a94;->i010I()Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O0iXOO;

    const/16 v3, 0x3c

    invoke-direct {v2, v3}, Lcom/android/mltcode/paycertificationapi/O0iXOO;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a94;->i010I()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06074d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIOiIiIX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IIOiIiIX0;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/a94;->XXX11i(Lkotlin/jvm/functions/Function2;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditPop:Lcom/android/mltcode/paycertificationapi/a94;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditPop:Lcom/android/mltcode/paycertificationapi/a94;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCustomize()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/a94;->iX1O1(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mEditPop:Lcom/android/mltcode/paycertificationapi/a94;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showEditPop$lambda$0$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Ljava/lang/String;I)Z
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCustomize()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCustomize()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final tvAvgPaceValueLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0711

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvAvgPaceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0ce0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c70

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c72

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final initCustomizeText(I)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCustomize()Landroid/widget/TextView;

    move-result-object v0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    const p1, 0x7f140396

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const p1, 0x7f140395

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p1, 0x7f140394

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, p0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;->X1ii(Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMEditBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iIXO1O;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/iIXO1O;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getGender()I

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMRlShareCard()Landroid/view/View;

    move-result-object v0

    const-string v3, "#AA87CE"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMRouteImgFigure()Landroid/widget/ImageView;

    move-result-object v0

    const v3, 0x7f081727

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCameraBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/Oi11I11OX;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/Oi11I11OX;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->X0XI11I(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x4

    if-eqz v3, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvDistanceValue()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v7

    invoke-static {v6, v7, v4, v5, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvDistanceUnit()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v5

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvDistanceValue()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvDistanceUnit()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvDuration()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v5

    mul-int/lit16 v5, v5, 0x3e8

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v3

    invoke-static {v0, v3, v4, v1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->X0XI11I(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvAvgPaceValueLayout()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvAvgPaceValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getTvAvgPaceValueLayout()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->initCustomizeText(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e89

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 10
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->getMCrop()Lcom/android/mltcode/paycertificationapi/i1Ii1i11X;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXi1XOI1;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/IXi1XOI1;-><init>(Lcom/android/mltcode/paycertificationapi/xz3;Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->iX(Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/II1OiO0O;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/II1OiO0O;-><init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/xz3;->i010I(Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->mSelectAvatarPopup:Lcom/android/mltcode/paycertificationapi/xz3;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
