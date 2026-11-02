.class public Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/goodix/ble/libcomx/transceiver/IFrameSender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/androiddfu/goodix/DfuConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/szabh/androiddfu/goodix/DfuConnection;


# direct methods
.method public constructor <init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public sendFrame([B)Z
    .locals 3

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->READY:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sendFrame()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/X1O1O;->IiI10X([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GoodixDfu"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    move-result-object v0

    iget-object v1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    iget-object v2, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v2}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;->O10IXXX0X(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
