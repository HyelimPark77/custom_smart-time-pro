.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$getLatestFont$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->OII(Lcom/android/mltcode/paycertificationapi/O0Oiii;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
            "[",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O0Oiii;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
            "[",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getLatestFont$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getLatestFont$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getLatestFont$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getLatestFont$1;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
