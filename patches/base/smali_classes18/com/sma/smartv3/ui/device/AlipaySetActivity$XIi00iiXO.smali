.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;
.super Lcom/alibaba/aliagentsdk/api/IJustDataTransportAliBt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AlipaySetActivity;->initAliAgent(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-direct {p0}, Lcom/alibaba/aliagentsdk/api/IJustDataTransportAliBt;-><init>()V

    return-void
.end method


# virtual methods
.method public sendData([BLcom/alibaba/aliagentsdk/callback/ISend2BtCallback;)V
    .locals 5

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    array-length v2, p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToStr([B)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAliAgent#sendData -> size:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->THIRD_PARTY_DATA:Lcom/szabh/smable3/BleKey;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/alibaba/aliagentsdk/callback/ISend2BtCallback;->onSendSuccess()V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-interface {p2, p1, v1}, Lcom/alibaba/aliagentsdk/callback/ISend2BtCallback;->onSendFailed(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setDisableStreamLog(Z)V

    return-void
.end method

.method public setBtDataUploadCallback(Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;)V
    .locals 3

    const-string v0, "iBtDataUploadCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAliAgent#setBtDataUploadCallback -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setMBtDataUploadCallback$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;)V

    return-void
.end method
