.class public final Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertification/call/VerificationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/WeChatPayActivity;->distributionData([B)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$cancelVerifyTimeout(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onError : code = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError, code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onSuccess()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " distributionData : onSuccess "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$cancelVerifyTimeout(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$showActivated(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    return-void
.end method

.method public onUnknown(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$cancelVerifyTimeout(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/WeChatPayActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onUnknown : code = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onUnknown, code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
