.class public Lcom/sma/smartv3/ui/me/item/MainBottomItem;
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

.field public btExerciseCourse:Landroid/view/View;

.field public btFeedBack:Landroid/view/View;

.field public btFirmwareRepair:Landroid/view/View;

.field public btFont:Landroid/view/View;

.field public btPermissionSetting:Landroid/view/View;

.field public btThemeSwitch:Landroid/view/View;

.field public btUiRepair:Landroid/view/View;

.field public btUserInfo:Landroid/view/View;

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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const-string v0, "MainBottomItem"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->initEvent:Z

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd$lambda$0$0(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd$lambda$1$0(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd$lambda$1$1(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd$lambda$0$1(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/item/MainBottomItem;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setLoaded$p(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoaded:Z

    return-void
.end method

.method public static final synthetic access$setLoading$p(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/sma/smartv3/ui/me/item/MainBottomItem$OXO1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem$OXO1;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c10;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/c10;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/d10;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/d10;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/sma/smartv3/ui/me/item/MainBottomItem$XIi00iiXO;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/e10;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/e10;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/f10;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/f10;-><init>(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Ad State : hide"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method private static final showAd$lambda$0$0(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    if-ne p2, p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoaded:Z

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

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

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoaded:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$0$1(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 8

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isVisibility:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " -> Ad State : loadAdView viewWidth:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", id:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$1$0(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    if-ne p2, p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoaded:Z

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

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

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoaded:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method private static final showAd$lambda$1$1(Lcom/sma/smartv3/ui/me/item/MainBottomItem;Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 8

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isVisibility:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isFirstLoad:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isLoading:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " -> Ad State : loadAdView viewWidth:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", id:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 9
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

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setIvRemind(Landroid/widget/ImageView;)V

    const v0, 0x7f0a017a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtExerciseCourse(Landroid/view/View;)V

    const v1, 0x7f0a018c

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtUserInfo(Landroid/view/View;)V

    const v2, 0x7f0a017d

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtFirmwareRepair(Landroid/view/View;)V

    const v3, 0x7f0a018b

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtUiRepair(Landroid/view/View;)V

    const v4, 0x7f0a0189

    invoke-virtual {p1, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v5}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtThemeSwitch(Landroid/view/View;)V

    const v5, 0x7f0a017c

    invoke-virtual {p1, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v6}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtFeedBack(Landroid/view/View;)V

    const v6, 0x7f0a017e

    invoke-virtual {p1, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v7}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtFont(Landroid/view/View;)V

    const v7, 0x7f0a0184

    invoke-virtual {p1, v7}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v8}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->setBtPermissionSetting(Landroid/view/View;)V

    iget-object v8, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v8}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v4, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v6, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v3, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0188

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0178

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v5, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v6, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v7, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0097

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    const v0, 0x7f0a008b

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd()V

    return-void
.end method

.method public final getAdpAdContainerView()Lcom/sma/smartv3/view/ad/ADPAdContainerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    return-object v0
.end method

.method public final getAdpcAdContainerView()Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    return-object v0
.end method

.method public final getBtExerciseCourse()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btExerciseCourse:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFeedBack:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFirmwareRepair:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFont:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btPermissionSetting:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btThemeSwitch:Landroid/view/View;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btUiRepair:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btUiRepair"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtUserInfo()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btUserInfo:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btUserInfo"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->initEvent:Z

    return v0
.end method

.method public final getIvRemind()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->ivRemind:Landroid/widget/ImageView;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public initView()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtThemeSwitch()Landroid/view/View;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtFont()Landroid/view/View;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtUiRepair()Landroid/view/View;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtFirmwareRepair()Landroid/view/View;

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
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtFont()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtUiRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtFirmwareRepair()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtExerciseCourse()Landroid/view/View;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtUserInfo()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0()Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    move v2, v4

    :goto_6
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtPermissionSetting()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X00O0()Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    move v2, v4

    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getBtFeedBack()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX1XiI()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move v3, v4

    :goto_8
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final isVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isVisibility:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0fc3

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

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Xi0I()Z

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Ad State :  onAIViewVisibilityChange "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isVisibility:Z

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : onAdStateChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->showAd()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->initView()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->getIvRemind()Landroid/widget/ImageView;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpAdContainerView:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    return-void
.end method

.method public final setAdpcAdContainerView(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->adpcAdContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btExerciseCourse:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFeedBack:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFirmwareRepair:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btFont:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btPermissionSetting:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btThemeSwitch:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btUiRepair:Landroid/view/View;

    return-void
.end method

.method public final setBtUserInfo(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->btUserInfo:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->ivRemind:Landroid/widget/ImageView;

    return-void
.end method

.method public final setMOnClick(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setVisibility(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/item/MainBottomItem;->isVisibility:Z

    return-void
.end method
