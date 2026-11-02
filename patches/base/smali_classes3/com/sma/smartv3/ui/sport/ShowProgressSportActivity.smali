.class public final Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;
.super Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;
.source "SourceFile"


# instance fields
.field private final mSportButtonProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportGoalLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportGoalProgress$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportGoalValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportThreeLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportTopBgIcon$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportTopBgLL$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->mSportButtonProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ub4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ub4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalProgress$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgLL$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgIcon$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zb4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportThreeLayout$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OO(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX110i(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportThreeLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00XIX1(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->showLongPressTip$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    return-void
.end method

.method public static synthetic XOX0O0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX1Oi(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Lcom/sma/smartv3/view/NewSportButtonProgress;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->mSportButtonProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setSportEndProgressImage(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->setSportEndProgressImage()V

    return-void
.end method

.method public static synthetic i0X000X0O(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOiXi11II(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final mSportButtonProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Lcom/sma/smartv3/view/NewSportButtonProgress;
    .locals 1

    const v0, 0x7f0a0a92

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/NewSportButtonProgress;

    return-object p0
.end method

.method private final setButtonProgress()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/NewSportButtonProgress;->IiI10X(Lcom/sma/smartv3/view/NewSportButtonProgress$XIi00iiXO;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/NewSportButtonProgress;->XXI(Lcom/sma/smartv3/view/NewSportButtonProgress$iO;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$iO;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/NewSportButtonProgress;->XO0O10(Lcom/sma/smartv3/view/NewSportButtonProgress$OXO1;)V

    return-void
.end method

.method private final setSportEndProgressImage()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v1

    const/4 v2, 0x3

    if-eq v2, v1, :cond_0

    const v1, 0x7f081344

    goto :goto_0

    :cond_0
    const v1, 0x7f081347

    :goto_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/NewSportButtonProgress;->setCenterBitmap(I)V

    return-void
.end method

.method private static final showLongPressTip$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMLongPressPopup()Landroid/widget/PopupWindow;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final sportGoalLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0af3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportGoalProgress_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a0af4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private static final sportGoalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0af6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final sportThreeLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0ae1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final sportTopBgIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bc8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final sportTopBgLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public changeDeviceConnectStatus(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->changeDeviceConnectStatus(Z)V

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->stopSport(Z)V

    :cond_0
    return-void
.end method

.method public final getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->mSportButtonProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/NewSportButtonProgress;

    return-object v0
.end method

.method public final getSportGoalLayout()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getSportGoalProgress()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalProgress$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getSportGoalValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportGoalValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getSportThreeLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportThreeLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getSportTopBgIcon()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgIcon$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getSportTopBgLL()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->sportTopBgLL$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public handleSportState(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    const v0, 0x7f081344

    goto :goto_0

    :cond_0
    const v0, 0x7f081347

    :goto_0
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/NewSportButtonProgress;->setCenterBitmap(I)V

    return-void
.end method

.method public hideViewFeature(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->hideViewFeature(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportThreeLayout()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportThreeLayout()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportThreeLayout()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportThreeLayout()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
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
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportPause()Landroid/widget/ImageButton;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportTopBgLL()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportTopBgIcon()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportTopBgIcon()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportTopBgIcon()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {p0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportTopBgLL()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08157e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->setButtonProgress()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0117

    return v0
.end method

.method public setSportOneShowValue(F)V
    .locals 0

    return-void
.end method

.method public showGoalProgress(Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 5
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDataType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/db/entity/SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v3

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalLayout()Landroid/widget/RelativeLayout;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalLayout()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v1

    const-string v4, "/"

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p2

    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p2

    aget p2, p2, v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p1

    aget p1, p1, v3

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v3

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result p2

    mul-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v3

    mul-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f14133f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p1

    aget p1, p1, v2

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v2

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalProgress()Landroid/widget/ProgressBar;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMCalorie()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getSportGoalValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/SportData;->getMCalorie()I

    move-result p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object v0

    aget v0, v0, v2

    const v1, 0x7f140274

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method

.method public showLongPressTip()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMLongPressPopup()Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f39

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    const v2, 0x7f0a0bf7

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f140e41

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/android/mltcode/paycertificationapi/XXiOOOX;->OXO1(Landroid/content/Context;Landroid/view/View;)Landroid/widget/PopupWindow;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setMLongPressPopup(Landroid/widget/PopupWindow;)V

    sget-object v2, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->BOTTOM:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->O00(Lcom/sma/smartv3/view/bubbleview/ArrowDirection;)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMLongPressPopup()Landroid/widget/PopupWindow;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v2, v3

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    add-int/2addr v2, v3

    neg-int v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->getArrowWidth()F

    move-result v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XOO0ii0(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getMLongPressPopup()Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->getMSportButtonProgress()Lcom/sma/smartv3/view/NewSportButtonProgress;

    move-result-object v3

    invoke-virtual {v0, v3, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sb4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/sb4;-><init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
