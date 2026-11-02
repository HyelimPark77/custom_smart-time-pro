.class public final Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess()V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->XOO0ii0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->I0IIOi(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/util/ArrayList;F)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;F)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addGoogleLine(Ljava/util/ArrayList;)V

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p2, p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    const p2, 0x3f7d70a4    # 0.99f

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomIn()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomIn()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rz4;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/rz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess()V

    return-void
.end method

.method public XIi00iiXO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMLineColors()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addLine()V

    return-void
.end method

.method public XO0O10(Ljava/util/ArrayList;FI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;FI)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v0, 0x1

    if-le p3, v0, :cond_0

    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addBaiduLine(Ljava/util/ArrayList;)V

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p2, p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    const p2, 0x3f7d70a4    # 0.99f

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    invoke-static {}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomIn()Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p2

    const/16 p3, 0x3e8

    invoke-virtual {p1, p2, p3}, Lcom/baidu/mapapi/map/BaiduMap;->animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;I)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/qz4;

    invoke-direct {p3, p2}, Lcom/android/mltcode/paycertificationapi/qz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess()V

    return-void
.end method

.method public iO(F)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMColorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
