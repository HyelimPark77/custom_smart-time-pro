.class public Lcom/sma/smartv3/ui/me/item/MeBottom2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private btContactUs:Landroid/widget/LinearLayout;

.field public btExerciseCourse:Landroid/view/View;

.field private btFAQ:Landroid/widget/LinearLayout;

.field public btFeedBack:Landroid/view/View;

.field public btFirmwareRepair:Landroid/view/View;

.field public btFont:Landroid/view/View;

.field private btHelp:Landroid/widget/LinearLayout;

.field private btLanguageRepair:Landroid/view/View;

.field public btPermissionSetting:Landroid/view/View;

.field private btTalk:Landroid/widget/LinearLayout;

.field public btThemeSwitch:Landroid/view/View;

.field public btUiRepair:Landroid/view/View;

.field private final initEvent:Z

.field private isFirstLoad:Z

.field private isLoaded:Z

.field private isLoading:Z

.field private isVisibility:Z

.field public ivRemind:Landroid/widget/ImageView;

.field private mOnClick:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mViewWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const-string v0, "MeBottom2Item"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->initEvent:Z

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd$lambda$1$1(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd$lambda$1$0(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd$lambda$0$0(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd$lambda$0$1(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setLoaded$p(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoaded:Z

    return-void
.end method

.method public static final synthetic access$setLoading$p(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    return-void
.end method

.method private final loadAd()V
    .locals 9

    iget v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btContactUs:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const-string v2, "btContactUs"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btContactUs:Landroid/widget/LinearLayout;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f070000

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v2, :cond_4

    iget v4, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v1, :cond_4

    iget v3, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private final showAd()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/sma/smartv3/ui/me/item/MeBottom2Item$OXO1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item$OXO1;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/de0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/de0;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ee0;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/ee0;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/sma/smartv3/ui/me/item/MeBottom2Item$XIi00iiXO;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fe0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/fe0;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ge0;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/ge0;-><init>(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Ad State : hide"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method private static final showAd$lambda$0$0(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    if-ne p2, p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoaded:Z

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Lifecycle, Event: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", isLoaded: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", isLoading: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoaded:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$0$1(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " -> Ad State : loadAdView viewWidth:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", id:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$1$0(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    if-ne p2, p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoaded:Z

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Lifecycle, Event: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", isLoaded: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", isLoading: "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoaded:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$1$1(Lcom/sma/smartv3/ui/me/item/MeBottom2Item;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isFirstLoad:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isLoading:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " -> Ad State : loadAdView viewWidth:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", id:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 12
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0609

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setIvRemind(Landroid/widget/ImageView;)V

    const v0, 0x7f0a017a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtExerciseCourse(Landroid/view/View;)V

    const v1, 0x7f0a017d

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtFirmwareRepair(Landroid/view/View;)V

    const v2, 0x7f0a018b

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtUiRepair(Landroid/view/View;)V

    const v3, 0x7f0a0189

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtThemeSwitch(Landroid/view/View;)V

    const v4, 0x7f0a017c

    invoke-virtual {p1, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v5}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtFeedBack(Landroid/view/View;)V

    const v5, 0x7f0a017e

    invoke-virtual {p1, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v6}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtFont(Landroid/view/View;)V

    const v6, 0x7f0a0184

    invoke-virtual {p1, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v7}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setBtPermissionSetting(Landroid/view/View;)V

    const v7, 0x7f0a0182

    invoke-virtual {p1, v7}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btHelp:Landroid/widget/LinearLayout;

    const v8, 0x7f0a018a

    invoke-virtual {p1, v8}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v9, Landroid/widget/LinearLayout;

    iput-object v9, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btTalk:Landroid/widget/LinearLayout;

    const v9, 0x7f0a0179

    invoke-virtual {p1, v9}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v10, Landroid/widget/LinearLayout;

    iput-object v10, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btContactUs:Landroid/widget/LinearLayout;

    const v10, 0x7f0a017b

    invoke-virtual {p1, v10}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v11, Landroid/widget/LinearLayout;

    iput-object v11, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFAQ:Landroid/widget/LinearLayout;

    iget-object v11, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v11}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v3, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v5, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0188

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0178

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v4, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v5, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v6, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v7, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v8, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v9, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v10, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a008b

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    const v0, 0x7f0a0097

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd()V

    return-void
.end method

.method public final getAdpAdContainerView()Lcom/sma/smartv3/view/ad/ADPAdContainerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    return-object v0
.end method

.method public final getAdpcAdContainerView()Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    return-object v0
.end method

.method public final getBtExerciseCourse()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btExerciseCourse:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btExerciseCourse"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtFeedBack()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFeedBack:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btFeedBack"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtFirmwareRepair()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFirmwareRepair:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btFirmwareRepair"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtFont()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFont:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btFont"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtPermissionSetting()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btPermissionSetting:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btPermissionSetting"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtThemeSwitch()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btThemeSwitch:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btThemeSwitch"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtUiRepair()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btUiRepair:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btUiRepair"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->initEvent:Z

    return v0
.end method

.method public final getIvRemind()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->ivRemind:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "ivRemind"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMOnClick()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public final getMViewWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    return v0
.end method

.method public initView()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtThemeSwitch()Landroid/view/View;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-le v1, v2, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->X1OI()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X00Xi1X()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtFont()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->XIIO11I()Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtUiRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->I0i0()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X1i()Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v3

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtFirmwareRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iii0()Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    move v2, v4

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtFont()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtUiRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtFirmwareRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtExerciseCourse()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iiIOiX()I

    move-result v2

    if-eqz v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    move v2, v4

    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtPermissionSetting()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X00O0()Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    move v2, v4

    :goto_6
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getBtFeedBack()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX1XiI()Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    move v2, v4

    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btHelp:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    if-nez v1, :cond_8

    const-string v1, "btHelp"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_8
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0IXOi()Z

    move-result v5

    if-eqz v5, :cond_9

    move v5, v3

    goto :goto_8

    :cond_9
    move v5, v4

    :goto_8
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btTalk:Landroid/widget/LinearLayout;

    if-nez v1, :cond_a

    const-string v1, "btTalk"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_a
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iIX0i()Z

    move-result v5

    if-eqz v5, :cond_b

    move v5, v3

    goto :goto_9

    :cond_b
    move v5, v4

    :goto_9
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btContactUs:Landroid/widget/LinearLayout;

    if-nez v1, :cond_c

    const-string v1, "btContactUs"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_c
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->Oi()Z

    move-result v5

    if-eqz v5, :cond_d

    move v5, v3

    goto :goto_a

    :cond_d
    move v5, v4

    :goto_a
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFAQ:Landroid/widget/LinearLayout;

    if-nez v1, :cond_e

    const-string v1, "btFAQ"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_b

    :cond_e
    move-object v2, v1

    :goto_b
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iOI()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_c

    :cond_f
    move v3, v4

    :goto_c
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final isVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1094

    return v0
.end method

.method public final onAIViewVisibilityChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AD_STATE_CHANGE_ME"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State :  onAIViewVisibilityChange  isVisibility = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->loadAd()V

    :cond_0
    return-void
.end method

.method public final onAdStateChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AD_STATE_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : onAdStateChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->showAd()V

    return-void
.end method

.method public final onBindStateChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bind_stage_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->initView()V

    return-void
.end method

.method public final onNewVersionShow(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "new_version"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->getIvRemind()Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final setAdpAdContainerView(Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/ad/ADPAdContainerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    return-void
.end method

.method public final setAdpcAdContainerView(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    return-void
.end method

.method public final setBtExerciseCourse(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btExerciseCourse:Landroid/view/View;

    return-void
.end method

.method public final setBtFeedBack(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFeedBack:Landroid/view/View;

    return-void
.end method

.method public final setBtFirmwareRepair(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFirmwareRepair:Landroid/view/View;

    return-void
.end method

.method public final setBtFont(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btFont:Landroid/view/View;

    return-void
.end method

.method public final setBtPermissionSetting(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btPermissionSetting:Landroid/view/View;

    return-void
.end method

.method public final setBtThemeSwitch(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btThemeSwitch:Landroid/view/View;

    return-void
.end method

.method public final setBtUiRepair(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->btUiRepair:Landroid/view/View;

    return-void
.end method

.method public final setIvRemind(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->ivRemind:Landroid/widget/ImageView;

    return-void
.end method

.method public final setMOnClick(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setMViewWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->mViewWidth:I

    return-void
.end method

.method public final setVisibility(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->isVisibility:Z

    return-void
.end method
