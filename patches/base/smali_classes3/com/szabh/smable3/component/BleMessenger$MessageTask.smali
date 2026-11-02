.class public final Lcom/szabh/smable3/component/BleMessenger$MessageTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/component/BleMessenger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MessageTask"
.end annotation


# instance fields
.field private mRetry:I

.field private final message:Lcom/android/mltcode/paycertificationapi/X01O0O1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field final synthetic this$0:Lcom/szabh/smable3/component/BleMessenger;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/component/BleMessenger;Lcom/android/mltcode/paycertificationapi/X01O0O1;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/component/BleMessenger;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/X01O0O1;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->mRetry:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->getMMessengerCallback()Lcom/szabh/smable3/component/BleMessengerCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    invoke-interface {v0, v1}, Lcom/szabh/smable3/component/BleMessengerCallback;->onTimeout(Lcom/android/mltcode/paycertificationapi/X01O0O1;)V

    :cond_1
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->dequeueMessage()V

    return-void

    :cond_2
    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->mRetry:I

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->mRetry:I

    if-le v1, v2, :cond_4

    :cond_3
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MessageTask -> try("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->mRetry:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "), "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    instance-of v3, v1, Lcom/android/mltcode/paycertificationapi/dg2;

    if-eqz v3, :cond_5

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v1

    iget-object v2, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v2, Lcom/android/mltcode/paycertificationapi/dg2;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/dg2;->IiI10X()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/dg2;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/dg2;->O00()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getCharacteristic(Ljava/lang/String;Ljava/lang/String;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    return-void

    :cond_5
    instance-of v3, v1, Lcom/android/mltcode/paycertificationapi/h77;

    if-eqz v3, :cond_7

    iget v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->mRetry:I

    if-le v0, v2, :cond_6

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->getMMessengerCallback()Lcom/szabh/smable3/component/BleMessengerCallback;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lcom/szabh/smable3/component/BleMessengerCallback;->onRetry()V

    :cond_6
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v1, Lcom/android/mltcode/paycertificationapi/h77;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleMessenger;->enqueueWritePackets(Lcom/android/mltcode/paycertificationapi/h77;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-static {v0}, Lcom/szabh/smable3/component/BleMessenger;->access$getMHandler$p(Lcom/szabh/smable3/component/BleMessenger;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMTimeout()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_7
    instance-of v2, v1, Lcom/android/mltcode/paycertificationapi/ib1;

    if-eqz v2, :cond_9

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v1

    iget-object v2, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v2, Lcom/android/mltcode/paycertificationapi/ib1;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/ib1;->I0IIOi()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/ib1;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/ib1;->IiI10X()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getCharacteristic(Ljava/lang/String;Ljava/lang/String;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v2, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getNotifyDescriptor(Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v3, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/ib1;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/ib1;->XOO0ii0()Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    goto :goto_0

    :cond_8
    sget-object v3, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    :goto_0
    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    iget-object v3, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/ib1;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/ib1;->XOO0ii0()Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    return-void

    :cond_9
    instance-of v2, v1, Lcom/android/mltcode/paycertificationapi/nk3;

    if-eqz v2, :cond_a

    check-cast v1, Lcom/android/mltcode/paycertificationapi/nk3;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/nk3;->XO0O10()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    return-void

    :cond_a
    instance-of v0, v1, Lcom/android/mltcode/paycertificationapi/jj3;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->message:Lcom/android/mltcode/paycertificationapi/X01O0O1;

    check-cast v1, Lcom/android/mltcode/paycertificationapi/jj3;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/jj3;->XO0O10()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->requestConnectionPriority(I)Z

    :cond_b
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;->this$0:Lcom/szabh/smable3/component/BleMessenger;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->dequeueMessage()V

    :cond_c
    :goto_1
    return-void
.end method
