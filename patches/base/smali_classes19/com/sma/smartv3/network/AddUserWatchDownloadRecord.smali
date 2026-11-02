.class public final Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/watchFace/install"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final WID:Ljava/lang/String; = "wid"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;->INSTANCE:Lcom/sma/smartv3/network/AddUserWatchDownloadRecord;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
