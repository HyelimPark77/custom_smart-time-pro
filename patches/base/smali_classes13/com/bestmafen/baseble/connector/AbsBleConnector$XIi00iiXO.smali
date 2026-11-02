.class public final Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/baseble/connector/AbsBleConnector;->init(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/XX0XO01i;)Lcom/bestmafen/baseble/connector/AbsBleConnector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;


# direct methods
.method public constructor <init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onScan -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onDeviceFound -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMScanner$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$XIi00iiXO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getBluetoothGatt(Lcom/bestmafen/baseble/connector/AbsBleConnector;Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
