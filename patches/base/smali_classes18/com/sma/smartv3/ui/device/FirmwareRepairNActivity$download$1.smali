.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->download(Lcom/sma/smartv3/model/FirmwareVersion;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/FirmwareVersion;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->XIi00iiXO:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->access$getMDevice$p(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->XIi00iiXO:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    new-instance v2, Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setDeviceName(Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setKeepBond(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setDisableNotification(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const/4 p1, 0x3

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setNumberOfRetries(I)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    new-instance p1, Ljava/io/File;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setZip(Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const-class p1, Lcom/sma/smartv3/ble/DfuService;

    invoke-virtual {v2, v1, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->start(Landroid/content/Context;Ljava/lang/Class;)Lno/nordicsemi/android/dfu/DfuServiceController;

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
