.class final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1"
    f = "NationServerSelectActivity.kt"
    i = {
        0x0
    }
    l = {
        0x155
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $location:Lcom/sma/smartv3/location/CustomLocation;

.field private synthetic L$0:Ljava/lang/Object;

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
            "Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    iget-object v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    invoke-direct {v0, v1, v2, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;

    iget-object v2, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    iget-object v4, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->$location:Lcom/sma/smartv3/location/CustomLocation;

    const/4 v5, 0x0

    invoke-direct {p1, v2, v4, v5}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1;-><init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/coroutines/Continuation;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->label:I

    const-wide/16 v2, 0x1f40

    invoke-static {v2, v3, p1, p0}, Lkotlinx/coroutines/TimeoutKt;->O00(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1;->this$0:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", Geocoder timeout or failed, fallback to locale"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method
