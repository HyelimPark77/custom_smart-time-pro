.class final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onActivityResult(IILandroid/content/Intent;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onActivityResult$1"
    f = "DownLoadMapsActivity.kt"
    i = {}
    l = {
        0x279,
        0x27e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $mLatLng:Lcom/google/android/gms/maps/model/LatLng;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->$mLatLng:Lcom/google/android/gms/maps/model/LatLng;

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

    new-instance p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->$mLatLng:Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->label:I

    const-wide/16 v2, 0x64

    invoke-static {v2, v3, v0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$isInChinaMainland$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$onCalculateZoom(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    iput v4, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->label:I

    const-wide/16 v2, 0x32

    invoke-static {v2, v3, v0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    new-instance v2, Lcom/sma/smartv3/location/CustomLocation;

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->$mLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v6, v3, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const/16 v17, 0x3fc

    const/16 v18, 0x0

    move-wide v3, v4

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Lcom/sma/smartv3/location/CustomLocation;-><init>(DDDFIJLcom/sma/smartv3/location/CustomLocation$TYPE;FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$showMarkerOptions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/sma/smartv3/location/CustomLocation;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$onCalculateZoom(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
