.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/Boolean;)V
    .locals 4

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getSparkAuthorize result -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->IiI10X()Z

    move-result p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " InitResult  -> "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "\u8bbe\u5907\u672a\u6388\u6743"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getSparkAuthorize error -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string p1, "\u8bbe\u5907\u672a\u6388\u6743"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1$1;->OXO1(Ljava/lang/Boolean;)V

    return-void
.end method
