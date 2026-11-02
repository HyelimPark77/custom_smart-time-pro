.class public final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapStatusChange(Lcom/baidu/mapapi/map/MapStatus;)V
    .locals 0

    return-void
.end method

.method public onMapStatusChangeFinish(Lcom/baidu/mapapi/map/MapStatus;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$checkZoomRestrictions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    return-void
.end method

.method public onMapStatusChangeStart(Lcom/baidu/mapapi/map/MapStatus;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onMapStatusChangeStart(Lcom/baidu/mapapi/map/MapStatus;I)V
    .locals 0

    .line 2
    return-void
.end method
