.class public final Lcom/szabh/smable3/component/BaseBleConnector$init$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/XX0XO01i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/smable3/component/BaseBleConnector;->init(Landroid/content/Context;ZZZZZILcom/szabh/smable3/component/BaseBleCache;)Lcom/szabh/smable3/component/BaseBleConnector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/szabh/smable3/component/BaseBleConnector;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/component/BaseBleConnector;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->onConnectionStateChange$lambda$2(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Landroid/bluetooth/BluetoothDevice;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->onConnectionStateChange$lambda$0(Landroid/bluetooth/BluetoothDevice;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->onCharacteristicRead$lambda$3(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->onConnectionStateChange$lambda$1(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onCharacteristicRead$lambda$3(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMtkOtaMeta()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onConnectionStateChange$lambda$0(Landroid/bluetooth/BluetoothDevice;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1, p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onConnectionStateChange$lambda$1(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lcom/szabh/smable3/component/BleHandleCallback;->onSessionStateChange(Z)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onConnectionStateChange$lambda$2(Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BleHandleCallback;->onStreamProgress$default(Lcom/szabh/smable3/component/BleHandleCallback;ZIIILcom/szabh/smable3/BleKey;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onCharacteristicChanged([B)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$handleData(Lcom/szabh/smable3/component/BaseBleConnector;[B)V

    return-void
.end method

.method public onCharacteristicRead(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 1

    const-string v0, "characteristicUuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "text"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "c6a22916-f821-18bf-9704-0266f20e80fd"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMBleCache$p(Lcom/szabh/smable3/component/BaseBleConnector;)Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "mBleCache"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, p3}, Lcom/szabh/smable3/component/BaseBleCache;->putMtkOtaMeta(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OXiI0Xii;

    invoke-direct {p2}, Lcom/android/mltcode/paycertificationapi/OXiI0Xii;-><init>()V

    invoke-static {p1, p2}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifyHandlers(Lcom/szabh/smable3/component/BaseBleConnector;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public onCharacteristicWrite(Ljava/lang/String;[B)V
    .locals 1

    const-string v0, "characteristicUuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "c6a22924-f821-18bf-9704-0266f20e80fd"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMStreamProgressCompleted$p(Lcom/szabh/smable3/component/BaseBleConnector;)I

    move-result p1

    iget-object p2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    add-int/lit8 p1, p1, 0x1

    invoke-static {p2, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMStreamProgressCompleted$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$checkStreamProgress(Lcom/szabh/smable3/component/BaseBleConnector;)V

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Z)V
    .locals 5

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iget-object v2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v2}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMTargetAddress(Lcom/szabh/smable3/component/BaseBleConnector;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    :cond_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " onDeviceConnected -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v2, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMBleState$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    iget-object v1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XXIOIO;

    invoke-direct {v2, p1}, Lcom/android/mltcode/paycertificationapi/XXIOIO;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-static {v1, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifyHandlers(Lcom/szabh/smable3/component/BaseBleConnector;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMStreamProgressTotal$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMStreamProgressCompleted$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onSessionStateChange -> false"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMReceivingCmTrace$p(Lcom/szabh/smable3/component/BaseBleConnector;Z)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMBleState$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXi01O0O;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IXi01O0O;-><init>()V

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifyHandlers(Lcom/szabh/smable3/component/BaseBleConnector;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMDataKeys$p(Lcom/szabh/smable3/component/BaseBleConnector;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMDataKeys$p(Lcom/szabh/smable3/component/BaseBleConnector;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/BleKey;

    const/4 v1, -0x2

    invoke-static {p1, v1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifySyncState(Lcom/szabh/smable3/component/BaseBleConnector;ILcom/szabh/smable3/BleKey;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMDataKeys$p(Lcom/szabh/smable3/component/BaseBleConnector;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$removeSyncTimeout(Lcom/szabh/smable3/component/BaseBleConnector;)V

    :cond_3
    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMBleStream$p(Lcom/szabh/smable3/component/BaseBleConnector;)Lcom/szabh/smable3/entity/BleStream;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiXO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IOiXO;-><init>()V

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifyHandlers(Lcom/szabh/smable3/component/BaseBleConnector;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$checkStreamProgress(Lcom/szabh/smable3/component/BaseBleConnector;)V

    :goto_0
    iget-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMBleStream(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/entity/BleStream;)V

    return-void
.end method

.method public onMtuChanged()V
    .locals 5

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMBleState$p(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$isNordicOtaMode$p(Lcom/szabh/smable3/component/BaseBleConnector;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isNeedBind()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$sendOta(Lcom/szabh/smable3/component/BaseBleConnector;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMBleCache$p(Lcom/szabh/smable3/component/BaseBleConnector;)Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "mBleCache"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v2}, Lcom/szabh/smable3/component/BaseBleConnector;->access$isRefreshDeviceInfo$p(Lcom/szabh/smable3/component/BaseBleConnector;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " DeviceInfo not null -> login"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SIFLI"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    const-string v3, "JL707"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    iget-object v2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v2, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setRefreshDeviceCache(Z)V

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMId()I

    move-result v0

    invoke-static {v1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$login(Lcom/szabh/smable3/component/BaseBleConnector;I)V

    return-void

    :cond_4
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " DeviceInfo is null or needs to be refreshed -> bind"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isNeedBind()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$init$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$bind(Lcom/szabh/smable3/component/BaseBleConnector;)V

    :cond_5
    return-void
.end method
