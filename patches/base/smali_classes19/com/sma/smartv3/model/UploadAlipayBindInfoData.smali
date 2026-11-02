.class public final Lcom/sma/smartv3/model/UploadAlipayBindInfoData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private bleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private macAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private result:I

.field private time:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->bleName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareFlag:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->macAddress:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->appVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAppVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->bleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMacAddress()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->macAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getResult()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->result:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->time:J

    return-wide v0
.end method

.method public final setAppVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->appVersion:Ljava/lang/String;

    return-void
.end method

.method public final setBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->bleName:Ljava/lang/String;

    return-void
.end method

.method public final setFirmwareFlag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareFlag:Ljava/lang/String;

    return-void
.end method

.method public final setFirmwareVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->firmwareVersion:Ljava/lang/String;

    return-void
.end method

.method public final setMacAddress(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->macAddress:Ljava/lang/String;

    return-void
.end method

.method public final setResult(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->result:I

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadAlipayBindInfoData;->time:J

    return-void
.end method
