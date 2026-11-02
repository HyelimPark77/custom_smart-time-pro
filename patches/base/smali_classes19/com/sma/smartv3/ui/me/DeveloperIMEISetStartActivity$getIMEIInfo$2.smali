.class public final Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->getIMEIInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/android/mltcode/paycertificationapi/IiXI010i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->iO(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Shutdown success! Force closeConnection!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IiXI010i;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$setMCurIMEICheckAvailableData$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/android/mltcode/paycertificationapi/IiXI010i;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getIMEIInfo handleResponse -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IiXI010i;->iO()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IiXI010i;->iO()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->XIi00iiXO:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " getIMEIInfo handleResponse -> Shutdown directly"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SHUTDOWN:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi1O0X1O;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/Oi1O0X1O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/IiXI010i;->iO()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$sendIMEI(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v1, "\u6ca1\u6709\u53ef\u7528\u7684IMEI!..."

    invoke-static {v1, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " getIMEIInfo handleResponse -> no IMEI"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$setMCurIMEICheckAvailableData$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;Lcom/android/mltcode/paycertificationapi/IiXI010i;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getIMEIInfo -> error! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IiXI010i;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$getIMEIInfo$2;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IiXI010i;)V

    return-void
.end method
