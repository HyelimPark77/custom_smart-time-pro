.class public final Lcom/szabh/smable3/component/MultiDeviceBleConnector;
.super Lcom/szabh/smable3/component/BaseBleConnector;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/szabh/smable3/component/BaseBleConnector;-><init>()V

    return-void
.end method


# virtual methods
.method public getLOG_HEADER()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMTargetAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTAG()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMTargetAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final removeCallbacksAndMessages()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->removeHandleCallbackAll()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->getMBleMessenger()Lcom/szabh/smable3/component/BleMessenger;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->release()V

    return-void
.end method
