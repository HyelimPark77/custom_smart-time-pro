.class public final Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->macOtaToolsFind(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/android/mltcode/paycertificationapi/v00;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/android/mltcode/paycertificationapi/v00;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " macOtaToolsFind handleResponse -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/v00;->iO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/v00;->iO()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$sendMac(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "\u6ca1\u6709\u53ef\u7528\u7684\u5730\u5740..."

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " macOtaToolsFind handleError -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/android/mltcode/paycertificationapi/v00;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$macOtaToolsFind$2;->OXO1(Lcom/android/mltcode/paycertificationapi/v00;)V

    return-void
.end method
