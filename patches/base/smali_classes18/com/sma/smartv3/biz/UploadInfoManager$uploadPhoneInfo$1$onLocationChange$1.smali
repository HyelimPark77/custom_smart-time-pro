.class public final Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1$onLocationChange$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1;->OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/WeatherRealtime;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/WeatherRealtime;)V
    .locals 0

    sget-object p1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/UploadInfoManager;->XOO0ii0()V

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

    check-cast p1, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1$onLocationChange$1;->OXO1(Lcom/sma/smartv3/model/WeatherRealtime;)V

    return-void
.end method
