.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 4

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;->access$getMBleScanner(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    new-instance v0, Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setDeviceName(Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setKeepBond(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    invoke-virtual {v0, v1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setDisableNotification(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const/4 p1, 0x3

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setNumberOfRetries(I)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;->access$getMLatest$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setZip(Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    const-class p1, Lcom/sma/smartv3/ble/DfuService;

    invoke-virtual {v0, v2, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->start(Landroid/content/Context;Ljava/lang/Class;)Lno/nordicsemi/android/dfu/DfuServiceController;

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
