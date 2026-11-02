.class public final Lcom/sma/smartv3/network/AppVersionLatest;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APP_NAME:Ljava/lang/String; = "appName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AppVersionLatest;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PLATFORM:Ljava/lang/String; = "platform"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/app_version/latest"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VERSION:Ljava/lang/String; = "version"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AppVersionLatest;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AppVersionLatest;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AppVersionLatest;->INSTANCE:Lcom/sma/smartv3/network/AppVersionLatest;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
