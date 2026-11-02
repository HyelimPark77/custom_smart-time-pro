.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140bed

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->access$getMDevice$p(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140be7

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->access$setMDevice$p(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->access$getMBleScanner(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->checkFirmware()V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
