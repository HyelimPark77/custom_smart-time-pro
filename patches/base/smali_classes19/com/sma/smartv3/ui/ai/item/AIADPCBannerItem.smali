.class public final Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private adContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

.field private final initEvent:Z

.field private isFirstLoad:Z

.field private isLoaded:Z

.field private isLoading:Z

.field private isVisibility:Z

.field private mViewWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const-string v0, "AIADPCBannerItem"

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->bindView$lambda$0$1(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->bindView$lambda$0$0(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setLoaded$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoaded:Z

    return-void
.end method

.method public static final synthetic access$setLoading$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoading:Z

    return-void
.end method

.method private static final bindView$lambda$0$0(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    if-ne p2, p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoaded:Z

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoading:Z

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

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoaded:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoading:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$0$1(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isFirstLoad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isFirstLoad:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoading:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Ad State : loadAdView isVisibility = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, " viewWidth:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", id:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final loadAd()V
    .locals 10

    iget v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    const/4 v1, 0x0

    const-string v2, "adContainerView"

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->adContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

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

    iget-object v3, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->adContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/high16 v4, 0x7f070000

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sub-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->adContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    goto :goto_0

    :cond_3
    move-object v3, v0

    :goto_0
    iget v5, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    const/16 v8, 0x9

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0070

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->adContainerView:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-nez p1, :cond_0

    const-string p1, "adContainerView"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;-><init>(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i010I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i010I;-><init>(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/iX;-><init>(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->initEvent:Z

    return v0
.end method

.method public final getMViewWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    return v0
.end method

.method public initView()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isLoaded:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    return-void
.end method

.method public final isVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d017c

    return v0
.end method

.method public final onAIViewVisibilityChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AD_STATE_CHANGE_AI"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State :  onAIViewVisibilityChange  isVisibility = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->loadAd()V

    :cond_0
    return-void
.end method

.method public final onAdStateChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AD_STATE_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Xi0I()Z

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> Ad State : onAdStateChange "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isFirstLoad:Z

    :cond_0
    return-void
.end method

.method public final setMViewWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->mViewWidth:I

    return-void
.end method

.method public final setVisibility(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->isVisibility:Z

    return-void
.end method
