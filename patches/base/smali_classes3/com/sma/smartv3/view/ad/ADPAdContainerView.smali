.class public Lcom/sma/smartv3/view/ad/ADPAdContainerView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;,
        Lcom/sma/smartv3/view/ad/ADPAdContainerView$HostActivityObserver;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "ADPAdContainerView"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private adUnitId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private autoLoad:Z

.field private isAdLoaded:Z

.field private listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mHostActivityObserver:Landroidx/lifecycle/LifecycleEventObserver;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final makeSureToHandleLifecycleMessage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private parentMayHaveAListView:Z

.field private showADBanner:Lcom/sma/smartv3/biz/ad/ADPAdBanner;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final showOnConditionMessage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final transparent:Landroid/graphics/drawable/ColorDrawable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->Companion:Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p3, "showOnCondition lambda returned false, AdContainerView will not load an Ad."

    iput-object p3, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showOnConditionMessage:Ljava/lang/String;

    .line 5
    const-string p3, "Make sure to call the resume, pause, destroy lifecycle methods."

    iput-object p3, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->makeSureToHandleLifecycleMessage:Ljava/lang/String;

    .line 6
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    .line 7
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->transparent:Landroid/graphics/drawable/ColorDrawable;

    .line 8
    instance-of v1, p1, Landroidx/lifecycle/LifecycleOwner;

    if-eqz v1, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->isMainThread()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 10
    move-object p3, p1

    check-cast p3, Landroidx/lifecycle/LifecycleOwner;

    invoke-interface {p3}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p3

    new-instance v1, Lcom/sma/smartv3/view/ad/ADPAdContainerView$HostActivityObserver;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$HostActivityObserver;-><init>(Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-virtual {p3, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    goto :goto_0

    .line 11
    :cond_0
    sget-object v1, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->Companion:Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Context is not a FragmentActivity. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;->access$logDebug(Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;Ljava/lang/String;)V

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    .line 13
    sget-object p3, Lcom/sma/smartv3/R$styleable;->AdContainerView:[I

    .line 14
    invoke-virtual {p1, p2, p3, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 15
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p2

    :goto_1
    iput-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->autoLoad:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic OXO1()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->pauseAd$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XIi00iiXO()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->resumeAd$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getMHostActivityObserver$p(Lcom/sma/smartv3/view/ad/ADPAdContainerView;)Landroidx/lifecycle/LifecycleEventObserver;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->mHostActivityObserver:Landroidx/lifecycle/LifecycleEventObserver;

    return-object p0
.end method

.method private final isMainThread()Z
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static synthetic loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_4

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: loadAdView"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final pauseAd$lambda$0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final resumeAd$lambda$0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final addUploadADPAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/ad/ADPAdListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;-><init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    return-void
.end method

.method public final destroyAd()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->isAdLoaded:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showADBanner:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->destroy()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    return-object v0
.end method

.method public final getAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutoLoad()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->autoLoad:Z

    return v0
.end method

.method public final getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    return-object v0
.end method

.method public final getMakeSureToHandleLifecycleMessage$app_smart_time_pro_google_play_v2UniversalRelease()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->makeSureToHandleLifecycleMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->parentMayHaveAListView:Z

    return v0
.end method

.method public final getShowOnConditionMessage$app_smart_time_pro_google_play_v2UniversalRelease()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showOnConditionMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getTransparent$app_smart_time_pro_google_play_v2UniversalRelease()Landroid/graphics/drawable/ColorDrawable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->transparent:Landroid/graphics/drawable/ColorDrawable;

    return-object v0
.end method

.method public final isAdLoaded$app_smart_time_pro_google_play_v2UniversalRelease()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->isAdLoaded:Z

    return v0
.end method

.method public final loadAdView(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->parentMayHaveAListView:Z

    if-eqz p4, :cond_1

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_1

    sget-object p2, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->Companion:Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;

    iget-object p3, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showOnConditionMessage:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;->access$logDebug(Lcom/sma/smartv3/view/ad/ADPAdContainerView$Companion;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz p2, :cond_0

    new-instance p3, Lcom/sma/smartv3/biz/ad/ADPAdError;

    const-string p4, "-1"

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showOnConditionMessage:Ljava/lang/String;

    invoke-direct {p3, p4, v0}, Lcom/sma/smartv3/biz/ad/ADPAdError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p3, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance p3, Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Landroid/app/Activity;

    new-instance v0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;-><init>(Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V

    invoke-direct {p3, p4, p1, p2, v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;-><init>(Landroid/app/Activity;Ljava/lang/String;ILcom/sma/smartv3/biz/ad/ADPAdListener;)V

    iput-object p3, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->showADBanner:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {p3, p0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->loadAd(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->parentMayHaveAListView:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->destroyAd()V

    :cond_0
    return-void
.end method

.method public final pauseAd()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXI;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/XXI;-><init>()V

    return-object v0
.end method

.method public final removeAd()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->destroyAd()V

    return-void
.end method

.method public final resumeAd()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1ii;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/X1ii;-><init>()V

    return-object v0
.end method

.method public final setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/ad/ADPAdListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XXXiXXOI()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->addUploadADPAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    return-void

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    return-void
.end method

.method public final setAdLoaded$app_smart_time_pro_google_play_v2UniversalRelease(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->isAdLoaded:Z

    return-void
.end method

.method public final setAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->adUnitId:Ljava/lang/String;

    return-void
.end method

.method public final setAutoLoad(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->autoLoad:Z

    return-void
.end method

.method public final setHostActivityObserver(Landroidx/lifecycle/LifecycleEventObserver;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/LifecycleEventObserver;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "lifecycleEventObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->mHostActivityObserver:Landroidx/lifecycle/LifecycleEventObserver;

    return-void
.end method

.method public final setListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/ad/ADPAdListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    return-void
.end method

.method public final setParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->parentMayHaveAListView:Z

    return-void
.end method
