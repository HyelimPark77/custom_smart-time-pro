.class final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1"
    f = "NationServerSelectActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $location:Lcom/sma/smartv3/location/CustomLocation;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/main/NationServerSelectActivity;",
            "Lcom/sma/smartv3/location/CustomLocation;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_0
    new-instance v0, Landroid/location/Geocoder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getMContext(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {v1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    invoke-virtual {v3}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->iXi1iI0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Address;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-object p1

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", Geocoder exception: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fallback to locale"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
