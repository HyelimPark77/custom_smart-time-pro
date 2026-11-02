.class public final Lcom/sma/smartv3/ui/sport/TrackPlay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;,
        Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;
    }
.end annotation


# instance fields
.field public final I0IIOi:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field

.field public final I0iXXO:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IO:Z

.field public IiI10X:I

.field public O00:I

.field public final OIX0iXi:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field

.field public OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:D

.field public XO0O10:I

.field public XOO0ii0:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "onPlayListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "TrackPlay"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OXO1:Ljava/lang/String;

    const-wide v0, 0x3f1a36e2eb1c432dL    # 1.0E-4

    iput-wide v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XIi00iiXO:D

    const/16 v0, 0x1e

    iput v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->iO:I

    const/16 v1, 0x7530

    iput v1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XO0O10:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    sget-object v0, Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;->BAIDU:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XOO0ii0:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    return-void
.end method

.method public static final I1XOi1(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->onStart()V

    :cond_0
    return-void
.end method

.method public static final IIX1OXO(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    iget-boolean v4, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "get(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/sma/smartv3/model/CustomLatLng;

    if-eqz v3, :cond_0

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/ey5;

    invoke-direct {v7, p0, v6, v4}, Lcom/android/mltcode/paycertificationapi/ey5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)V

    invoke-virtual {v5, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    new-instance v6, Lcom/android/mltcode/paycertificationapi/fy5;

    invoke-direct {v6, p0, v0, v4, v1}, Lcom/android/mltcode/paycertificationapi/fy5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;Ljava/util/ArrayList;Lcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget v4, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    new-instance v5, Lcom/android/mltcode/paycertificationapi/gy5;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/gy5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hy5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/hy5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/TrackPlay;Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XiOIO(Lcom/sma/smartv3/ui/sport/TrackPlay;Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->I1XOi1(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/TrackPlay;Ljava/util/ArrayList;Lcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/TrackPlay;->iIiiO(Lcom/sma/smartv3/ui/sport/TrackPlay;Ljava/util/ArrayList;Lcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static final OiIIX101O(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " play -> stop"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->XIi00iiXO()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XX0(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->IIX1OXO(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    return-void
.end method

.method public static final XX0(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " play -> error stop"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->XIi00iiXO()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z

    return-void
.end method

.method public static final XiOIO(Lcom/sma/smartv3/ui/sport/TrackPlay;Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi(Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)D

    move-result-wide p0

    double-to-float p0, p0

    invoke-interface {v0, p0}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->iO(F)V

    :cond_0
    return-void
.end method

.method public static final iIiiO(Lcom/sma/smartv3/ui/sport/TrackPlay;Ljava/util/ArrayList;Lcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XOO0ii0:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    sget-object v1, Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;->BAIDU:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    if-ne v0, v1, :cond_0

    new-instance p3, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v2

    invoke-direct {p3, v0, v1, v2, v3}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-float v0, v0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getColor()I

    move-result p0

    invoke-interface {p3, p1, v0, p0}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->XO0O10(Ljava/util/ArrayList;FI)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v2

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0:Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;

    if-eqz p1, :cond_1

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p2

    int-to-float p2, p2

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p2, p0

    invoke-interface {p1, p3, p2}, Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;->OXO1(Ljava/util/ArrayList;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->OiIIX101O(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    return-void
.end method


# virtual methods
.method public final I0IIOi(Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)D
    .locals 7

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO(Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)D

    move-result-wide v0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v2, v0, v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide p1

    cmpl-double p1, v0, p1

    if-lez p1, :cond_0

    return-wide v3

    :cond_0
    const-wide p1, 0x4066800000000000L    # 180.0

    return-wide p1

    :cond_1
    cmpg-double v2, v0, v3

    if-nez v2, :cond_3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide p1

    cmpl-double p1, v0, p1

    if-lez p1, :cond_2

    const-wide p1, -0x3fa9800000000000L    # -90.0

    return-wide p1

    :cond_2
    const-wide p1, 0x4056800000000000L    # 90.0

    return-wide p1

    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide p1

    sub-double/2addr v5, p1

    mul-double/2addr v5, v0

    cmpg-double p1, v5, v3

    if-gez p1, :cond_4

    const/high16 p1, 0x43340000    # 180.0f

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    const/16 p2, 0xb4

    int-to-double v2, p2

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v4

    mul-double/2addr v2, v0

    float-to-double p1, p1

    add-double/2addr v2, p1

    const/16 p1, 0x5a

    int-to-double p1, p1

    sub-double/2addr v2, p1

    return-wide v2
.end method

.method public final I0iXXO(Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)D
    .locals 4

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-nez v0, :cond_0

    const-wide p1, 0x7fefffffffffffffL    # Double.MAX_VALUE

    return-wide p1

    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide p1

    sub-double/2addr v2, p1

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public final IO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    return v0
.end method

.method public final O10IXXX0X()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z

    return v0
.end method

.method public final OII(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;",
            "Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;",
            ")V"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XOO0ii0:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi:Ljava/util/ArrayList;

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XOO0ii0(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final OIX0iXi()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final OIi0(DLcom/sma/smartv3/model/CustomLatLng;)D
    .locals 4

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v2

    mul-double/2addr p1, v2

    sub-double/2addr v0, p1

    return-wide v0
.end method

.method public final OX()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z

    return-void
.end method

.method public final X0O()V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IO:Z

    iget v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->O00:I

    iget v1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XO0O10:I

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OXO1:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0IIOi:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XOO0ii0:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    iget v4, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->O00:I

    iget v5, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " play -> start ss:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " fs:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " st:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " pt:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " it:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iy5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iy5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jy5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jy5;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final X1ii(D)D
    .locals 4

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-nez v0, :cond_1

    :goto_0
    iget-wide p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XIi00iiXO:D

    return-wide p1

    :cond_1
    iget-wide v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XIi00iiXO:D

    mul-double/2addr v0, p1

    const/4 v2, 0x1

    int-to-double v2, v2

    mul-double/2addr p1, p1

    add-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    div-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public final XOO0ii0(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, v0, Lcom/sma/smartv3/ui/sport/TrackPlay;->iO:I

    mul-int/2addr v2, v3

    iput v2, v0, Lcom/sma/smartv3/ui/sport/TrackPlay;->O00:I

    iget v3, v0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XO0O10:I

    if-le v2, v3, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_b

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "get(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lcom/sma/smartv3/model/CustomLatLng;

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v0, v7, v9}, Lcom/sma/smartv3/ui/sport/TrackPlay;->I0iXXO(Lcom/sma/smartv3/model/CustomLatLng;Lcom/sma/smartv3/model/CustomLatLng;)D

    move-result-wide v10

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v14

    cmpl-double v8, v12, v14

    if-lez v8, :cond_1

    move v8, v4

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v12

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v14

    cmpl-double v12, v12, v14

    if-lez v12, :cond_2

    move v12, v4

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v0, v10, v11, v7}, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIi0(DLcom/sma/smartv3/model/CustomLatLng;)D

    move-result-wide v13

    const/4 v15, -0x1

    if-eqz v12, :cond_3

    invoke-virtual {v0, v10, v11}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XXI(D)D

    move-result-wide v16

    move-wide/from16 v4, v16

    goto :goto_3

    :cond_3
    int-to-double v4, v15

    invoke-virtual {v0, v10, v11}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XXI(D)D

    move-result-wide v18

    mul-double v4, v4, v18

    :goto_3
    if-eqz v8, :cond_4

    invoke-virtual {v0, v10, v11}, Lcom/sma/smartv3/ui/sport/TrackPlay;->X1ii(D)D

    move-result-wide v18

    move-wide/from16 v36, v18

    move/from16 v18, v3

    move-wide/from16 v19, v4

    move-wide/from16 v3, v36

    goto :goto_4

    :cond_4
    move/from16 v18, v3

    move-wide/from16 v19, v4

    int-to-double v3, v15

    invoke-virtual {v0, v10, v11}, Lcom/sma/smartv3/ui/sport/TrackPlay;->X1ii(D)D

    move-result-wide v21

    mul-double v3, v3, v21

    :goto_4
    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v21

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v23

    move-wide/from16 v26, v21

    move-wide/from16 v28, v23

    :goto_5
    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v21

    cmpl-double v5, v26, v21

    if-lez v5, :cond_5

    const/4 v5, 0x1

    goto :goto_6

    :cond_5
    const/4 v5, 0x0

    :goto_6
    xor-int/2addr v5, v8

    if-nez v5, :cond_a

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v21

    cmpl-double v5, v28, v21

    if-lez v5, :cond_6

    const/4 v5, 0x1

    goto :goto_7

    :cond_6
    const/4 v5, 0x0

    :goto_7
    xor-int/2addr v5, v12

    if-nez v5, :cond_a

    const-wide v21, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v5, v10, v21

    const-wide/16 v21, 0x0

    if-nez v5, :cond_7

    new-instance v25, Lcom/sma/smartv3/model/CustomLatLng;

    const/16 v34, 0x1c

    const/16 v35, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-wide/from16 v23, v28

    sub-double v26, v26, v3

    :goto_8
    move-object/from16 v5, v25

    goto :goto_9

    :cond_7
    move-wide/from16 v23, v28

    cmpg-double v5, v10, v21

    if-nez v5, :cond_8

    new-instance v25, Lcom/sma/smartv3/model/CustomLatLng;

    sub-double v28, v23, v19

    const/16 v34, 0x1c

    const/16 v35, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    new-instance v25, Lcom/sma/smartv3/model/CustomLatLng;

    sub-double v28, v26, v13

    div-double v28, v28, v10

    const/16 v34, 0x1c

    const/16 v35, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v25 .. v35}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sub-double v26, v26, v3

    move-wide/from16 v28, v23

    goto :goto_8

    :goto_9
    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v23

    cmpg-double v15, v23, v21

    if-nez v15, :cond_9

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v23

    cmpg-double v15, v23, v21

    if-nez v15, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getColor()I

    move-result v15

    invoke-virtual {v5, v15}, Lcom/sma/smartv3/model/CustomLatLng;->setColor(I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_a
    move/from16 v3, v18

    const/4 v4, 0x1

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v3, v0, Lcom/sma/smartv3/ui/sport/TrackPlay;->iO:I

    mul-int/2addr v1, v3

    iput v1, v0, Lcom/sma/smartv3/ui/sport/TrackPlay;->O00:I

    return-object v2
.end method

.method public final XXI(D)D
    .locals 4

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-nez v0, :cond_1

    :goto_0
    iget-wide p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XIi00iiXO:D

    return-wide p1

    :cond_1
    iget-wide v0, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->XIi00iiXO:D

    const/4 v2, 0x1

    int-to-double v2, v2

    mul-double/2addr v0, v2

    div-double/2addr v0, p1

    mul-double/2addr p1, p1

    div-double p1, v2, p1

    add-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    div-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public final XiOIii1(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/TrackPlay;->IiI10X:I

    return-void
.end method
