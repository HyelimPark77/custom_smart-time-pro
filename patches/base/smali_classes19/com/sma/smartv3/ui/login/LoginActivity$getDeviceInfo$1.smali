.class public final Lcom/sma/smartv3/ui/login/LoginActivity$getDeviceInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/LoginActivity;->getDeviceInfo(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/BleDevice;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/LoginActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/LoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/LoginActivity$getDeviceInfo$1;->OXO1:Lcom/sma/smartv3/ui/login/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/BleDevice;)V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->OXO1:Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->iOO1ii1(Lcom/sma/smartv3/model/BleDevice;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/LoginActivity$getDeviceInfo$1;->OXO1:Lcom/sma/smartv3/ui/login/LoginActivity;

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->XX(Landroid/app/Activity;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "ALREADY_LOGIN"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/LoginActivity$getDeviceInfo$1;->OXO1:Lcom/sma/smartv3/ui/login/LoginActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/BleDevice;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/LoginActivity$getDeviceInfo$1;->OXO1(Lcom/sma/smartv3/model/BleDevice;)V

    return-void
.end method
