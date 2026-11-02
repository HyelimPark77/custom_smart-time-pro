.class final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V
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
    c = "com.sma.smartv3.ui.device.DownLoadMapsActivity$onCalculateZoom$1"
    f = "DownLoadMapsActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->label:I

    if-nez v1, :cond_17

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$isInChinaMainland$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z

    move-result v1

    const-wide v8, 0x40c8f38000000000L    # 12775.0

    const-wide v16, 0x40b7700000000000L    # 6000.0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const-wide v18, 0x40b3880000000000L    # 5000.0

    const-wide v6, 0x40d86a0000000000L    # 25000.0

    const-wide v20, 0x40d9640000000000L    # 26000.0

    const/16 v10, 0xa

    const/4 v11, 0x1

    const-wide v22, 0x40e86a0000000000L    # 50000.0

    const/4 v12, 0x0

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v1

    new-instance v13, Landroid/graphics/Point;

    const-wide v24, 0x40e7ed0000000000L    # 49000.0

    iget-object v14, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v14}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v14

    invoke-virtual {v14}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v14

    float-to-int v14, v14

    iget-object v15, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v15}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v15

    invoke-virtual {v15}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v15

    float-to-int v15, v15

    invoke-direct {v13, v14, v15}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v13}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v1

    iget-object v13, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v13}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v13}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v13

    new-instance v14, Landroid/graphics/Point;

    iget-object v15, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v15}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v15

    invoke-virtual {v15}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v15

    float-to-int v15, v15

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {v14, v15, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v13, v14}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v3, v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$calculateDistance(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)F

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getTargetDistanceType()I

    move-result v2

    if-eq v2, v11, :cond_7

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_1

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto/16 :goto_7

    :cond_1
    float-to-double v1, v1

    cmpg-double v3, v24, v1

    if-gtz v3, :cond_2

    cmpg-double v1, v1, v22

    if-gtz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    if-ge v1, v10, :cond_3

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v1, v11

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1, v6, v7}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto/16 :goto_7

    :cond_3
    :goto_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto/16 :goto_7

    :cond_4
    float-to-double v1, v1

    cmpg-double v3, v6, v1

    if-gtz v3, :cond_5

    cmpg-double v1, v1, v20

    if-gtz v1, :cond_5

    goto :goto_1

    :cond_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    if-ge v1, v10, :cond_6

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v1, v11

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1, v8, v9}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto/16 :goto_7

    :cond_6
    :goto_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto/16 :goto_7

    :cond_7
    float-to-double v1, v1

    cmpg-double v3, v18, v1

    if-gtz v3, :cond_8

    cmpg-double v1, v1, v16

    if-gtz v1, :cond_8

    goto :goto_2

    :cond_8
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    if-ge v1, v10, :cond_9

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v1, v11

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const-wide v2, 0x40a5ae0000000000L    # 2775.0

    invoke-static {v1, v2, v3}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto/16 :goto_7

    :cond_9
    :goto_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v1, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto/16 :goto_7

    :cond_a
    const-wide v24, 0x40e7ed0000000000L    # 49000.0

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    const-string v3, "mGoogleMap"

    if-nez v1, :cond_b

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_b
    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v1

    const-string v13, "getUiSettings(...)"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/google/android/gms/maps/UiSettings;->setScrollGesturesEnabled(Z)V

    invoke-virtual {v1, v12}, Lcom/google/android/gms/maps/UiSettings;->setZoomGesturesEnabled(Z)V

    iget-object v13, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v13}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v13

    if-nez v13, :cond_c

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v13, 0x0

    :cond_c
    invoke-virtual {v13}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v13

    new-instance v14, Landroid/graphics/Point;

    iget-object v15, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v15}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v15

    invoke-virtual {v15}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v15

    float-to-int v15, v15

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {v14, v15, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v13, v14}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    const-string v13, "fromScreenLocation(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v14}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v14

    if-nez v14, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v14, 0x0

    :cond_d
    invoke-virtual {v14}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v3

    new-instance v14, Landroid/graphics/Point;

    iget-object v15, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v15}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v15

    invoke-virtual {v15}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v15

    float-to-int v15, v15

    iget-object v8, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v8

    float-to-int v8, v8

    invoke-direct {v14, v15, v8}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3, v14}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v8, v2, v3}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->calculateDistanceGoogle(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)F

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getTargetDistanceType()I

    move-result v3

    if-eq v3, v11, :cond_14

    if-eq v3, v5, :cond_11

    if-eq v3, v4, :cond_e

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto/16 :goto_6

    :cond_e
    float-to-double v2, v2

    cmpg-double v4, v24, v2

    if-gtz v4, :cond_f

    cmpg-double v2, v2, v22

    if-gtz v2, :cond_f

    goto :goto_3

    :cond_f
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    if-ge v2, v10, :cond_10

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v2, v11

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v2, v6, v7}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto/16 :goto_6

    :cond_10
    :goto_3
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto :goto_6

    :cond_11
    float-to-double v2, v2

    cmpg-double v4, v6, v2

    if-gtz v4, :cond_12

    cmpg-double v2, v2, v20

    if-gtz v2, :cond_12

    goto :goto_4

    :cond_12
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    if-ge v2, v10, :cond_13

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v2, v11

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const-wide v3, 0x40c8f38000000000L    # 12775.0

    invoke-static {v2, v3, v4}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto :goto_6

    :cond_13
    :goto_4
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    goto :goto_6

    :cond_14
    float-to-double v2, v2

    cmpg-double v4, v18, v2

    if-gtz v4, :cond_15

    cmpg-double v2, v2, v16

    if-gtz v2, :cond_15

    goto :goto_5

    :cond_15
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    if-ge v2, v10, :cond_16

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber()I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    add-int/2addr v2, v11

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    const-wide v3, 0x40a5ae0000000000L    # 2775.0

    invoke-static {v2, v3, v4}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    goto :goto_6

    :cond_16
    :goto_5
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setTargetDistanceType(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;->this$0:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-virtual {v2, v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setNeedCalculateNumber(I)V

    :goto_6
    invoke-virtual {v1, v11}, Lcom/google/android/gms/maps/UiSettings;->setScrollGesturesEnabled(Z)V

    invoke-virtual {v1, v11}, Lcom/google/android/gms/maps/UiSettings;->setZoomGesturesEnabled(Z)V

    :goto_7
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1

    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
