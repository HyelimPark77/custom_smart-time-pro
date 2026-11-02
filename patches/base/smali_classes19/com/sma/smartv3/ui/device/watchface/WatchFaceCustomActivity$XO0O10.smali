.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jl1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->initElementView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public initFragments()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getPointerElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "pointerElementFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "timeElementFragment"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getControlElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/ControlElementFragment;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, "controlElementFragment"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    const/4 v3, 0x3

    new-array v3, v3, [Landroidx/fragment/app/Fragment;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public provideFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
