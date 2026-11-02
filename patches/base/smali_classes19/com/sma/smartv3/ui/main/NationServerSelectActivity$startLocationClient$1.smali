.class public final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->startLocationClient()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 7

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->isGetLocationCode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setGetLocationCode(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$stopLocationClient(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", onLocationChange "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p1, v2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", Location error: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->setGetLocationCode(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1;->OXO1:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$dismissLoading(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V

    return-void
.end method
