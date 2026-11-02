.class public final Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/UploadInfoManager;->I0iXXO()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 7

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v4

    new-instance v6, Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1$onLocationChange$1;

    invoke-direct {v6}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1$onLocationChange$1;-><init>()V

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO(DDLcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-static {v1}, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1(Lcom/sma/smartv3/biz/UploadInfoManager;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1(Lcom/sma/smartv3/biz/UploadInfoManager;)V

    return-void
.end method
