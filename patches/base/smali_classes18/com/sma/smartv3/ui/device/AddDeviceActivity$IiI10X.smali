.class public final Lcom/sma/smartv3/ui/device/AddDeviceActivity$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AddDeviceActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/AddDeviceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AddDeviceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceActivity;->access$onScanStarted(Lcom/sma/smartv3/ui/device/AddDeviceActivity;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceActivity;->access$onScanStopped(Lcom/sma/smartv3/ui/device/AddDeviceActivity;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/AddDeviceActivity;->access$addBleDevice(Lcom/sma/smartv3/ui/device/AddDeviceActivity;Lcom/bestmafen/baseble/scanner/BleDevice;)V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
