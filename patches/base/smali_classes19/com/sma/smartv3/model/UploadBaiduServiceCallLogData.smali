.class public final Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData$Companion;
    }
.end annotation


# static fields
.field public static final CALL_TYPE_AIGC:I = 0x1

.field public static final CALL_TYPE_NAV:I = 0x2

.field public static final CALL_TYPE_OTHER:I = 0x0

.field public static final CALL_TYPE_SCORE_GOOD:I = 0x4

.field public static final CALL_TYPE_SCORE_HIDE:I = 0x6

.field public static final CALL_TYPE_SCORE_POOR:I = 0x5

.field public static final CALL_TYPE_SCORE_SHOW:I = 0x7

.field public static final CALL_TYPE_VOICE:I = 0x3

.field public static final COUNT_ADS_CLICK_SUCCESS:I = 0x13

.field public static final COUNT_ADS_EXHIBIT_SUCCESS:I = 0x12

.field public static final COUNT_ADS_INITIALIZE_APP:I = 0x10

.field public static final COUNT_ADS_INITIALIZE_SDK:I = 0x11

.field public static final COUNT_NAV_AUTOMATIC_RETRIEVAL:I = 0x14

.field public static final COUNT_NAV_GEOGRAPHIC_DETAIL:I = 0x15

.field public static final COUNT_NAV_ROUTE_PLANNING:I = 0x16

.field public static final Companion:Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MICROSOFT_IDENTIFY:I = 0x8

.field public static final MICROSOFT_PLAY_AUDIO:I = 0xa

.field public static final MICROSOFT_TRANSLATE:I = 0x9

.field public static final PLATFORM_ANDROID:I = 0x2

.field public static final PLATFORM_IOS:I = 0x1


# instance fields
.field private appVersion:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private bleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private callTime:J

.field private callType:I

.field private firmwareFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private macAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private platform:I

.field private projectId:I

.field private remark:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->Companion:Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->bleName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->firmwareFlag:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->appVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->macAddress:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->remark:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAppVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->bleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->callTime:J

    return-wide v0
.end method

.method public final getCallType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->callType:I

    return v0
.end method

.method public final getFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->firmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMacAddress()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->macAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlatform()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->platform:I

    return v0
.end method

.method public final getProjectId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->projectId:I

    return v0
.end method

.method public final getRemark()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->remark:Ljava/lang/String;

    return-object v0
.end method

.method public final setAppVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->appVersion:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->bleName:Ljava/lang/String;

    return-void
.end method

.method public final setCallTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->callTime:J

    return-void
.end method

.method public final setCallType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->callType:I

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

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->firmwareFlag:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->macAddress:Ljava/lang/String;

    return-void
.end method

.method public final setPlatform(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->platform:I

    return-void
.end method

.method public final setProjectId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->projectId:I

    return-void
.end method

.method public final setRemark(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadBaiduServiceCallLogData;->remark:Ljava/lang/String;

    return-void
.end method
