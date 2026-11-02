.class public final Lcom/sma/smartv3/model/UploadDownloadInfoData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/UploadDownloadInfoData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/model/UploadDownloadInfoData$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_BUSINESS:I = 0x3

.field public static final TYPE_DYNAMIC:I = 0x1

.field public static final TYPE_EXERCISE:I = 0x2

.field public static final TYPE_ILLUSTRATION:I = 0x6

.field public static final TYPE_MACHINERY:I = 0x4

.field public static final TYPE_OTHER:I = 0x0

.field public static final TYPE_SIMPLE:I = 0x5


# instance fields
.field private bleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private eleId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private fileCategory:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private filePath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private fileSize:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private projectId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/UploadDownloadInfoData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/UploadDownloadInfoData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->Companion:Lcom/sma/smartv3/model/UploadDownloadInfoData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->bleName:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->projectId:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->firmwareFlag:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->filePath:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileSize:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileCategory:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->eleId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->bleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getEleId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->eleId:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileCategory()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileSize()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileSize:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->firmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getProjectId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->projectId:Ljava/lang/String;

    return-object v0
.end method

.method public final setBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->bleName:Ljava/lang/String;

    return-void
.end method

.method public final setEleId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->eleId:Ljava/lang/String;

    return-void
.end method

.method public final setFileCategory(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileCategory:Ljava/lang/String;

    return-void
.end method

.method public final setFilePath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->filePath:Ljava/lang/String;

    return-void
.end method

.method public final setFileSize(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->fileSize:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->firmwareFlag:Ljava/lang/String;

    return-void
.end method

.method public final setProjectId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadDownloadInfoData;->projectId:Ljava/lang/String;

    return-void
.end method
