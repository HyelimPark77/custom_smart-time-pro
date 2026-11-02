.class public final Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/szabh/smable3/component/BleMessengerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/smable3/component/BaseBleConnector;-><init>()V
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

    iput-object p1, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->onTimeout$lambda$0(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onTimeout$lambda$0(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/szabh/smable3/component/BleHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCommandSendTimeout(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onRetry()V
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->getMBleParser()Lcom/szabh/smable3/component/BleParser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleParser;->reset()V

    return-void
.end method

.method public onTimeout(Lcom/android/mltcode/paycertificationapi/X01O0O1;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->access$getMBleStream$p(Lcom/szabh/smable3/component/BaseBleConnector;)Lcom/szabh/smable3/entity/BleStream;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->getMBleMessenger()Lcom/szabh/smable3/component/BleMessenger;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleMessenger;->reset()V

    iget-object v0, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->access$setMBleStream(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/entity/BleStream;)V

    :cond_0
    instance-of v0, p1, Lcom/android/mltcode/paycertificationapi/h77;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/szabh/smable3/BleKey;->Companion:Lcom/szabh/smable3/BleKey$OXO1;

    check-cast p1, Lcom/android/mltcode/paycertificationapi/h77;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getInt$default([BIILjava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/BleKey$OXO1;->OXO1(I)Lcom/szabh/smable3/BleKey;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/BleKeyFlag;->Companion:Lcom/szabh/smable3/BleKeyFlag$OXO1;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object p1

    const/16 v2, 0x8

    aget-byte p1, p1, v2

    invoke-virtual {v1, p1}, Lcom/szabh/smable3/BleKeyFlag$OXO1;->OXO1(I)Lcom/szabh/smable3/BleKeyFlag;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleConnector;->getTAG()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " onCommandSendTimeout -> key="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", keyFlag="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/szabh/smable3/component/BaseBleConnector$mBleMessenger$2$1$1;->this$0:Lcom/szabh/smable3/component/BaseBleConnector;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OXX1;

    invoke-direct {v2, v0, p1}, Lcom/android/mltcode/paycertificationapi/OXX1;-><init>(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;)V

    invoke-static {v1, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->access$notifyHandlers(Lcom/szabh/smable3/component/BaseBleConnector;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method
