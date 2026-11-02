.class final Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/ad/ADPCAdContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "HostActivityObserver"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver$WhenMappings;
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 8
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->destroyAd()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->pauseAd()Lkotlin/jvm/functions/Function0;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->resumeAd()Lkotlin/jvm/functions/Function0;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAutoLoad()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$HostActivityObserver;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-static {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->access$getMHostActivityObserver$p(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)Landroidx/lifecycle/LifecycleEventObserver;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/LifecycleEventObserver;->onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    :cond_5
    return-void
.end method
