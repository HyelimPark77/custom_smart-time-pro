.class public final Lcom/sma/smartv3/ui/device/WeChatPayActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IWrite;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/WeChatPayActivity;->initAliAgent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onWrite([B)Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/bluetrum/fota/utils/HexUtils;->bytesToHex([B)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " initAliAgent -> onWrite=="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->THIRD_PARTY_DATA:Lcom/szabh/smable3/BleKey;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, p1, v2}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    move-result p1

    return p1

    :cond_0
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setDisableStreamLog(Z)V

    return v0
.end method
