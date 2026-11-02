.class public final Lcom/sma/smartv3/model/UploadDownloadInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/UploadDownloadInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/file/downloadInfoCount"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/UploadDownloadInfo;

    invoke-direct {v0}, Lcom/sma/smartv3/model/UploadDownloadInfo;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/UploadDownloadInfo;->INSTANCE:Lcom/sma/smartv3/model/UploadDownloadInfo;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
