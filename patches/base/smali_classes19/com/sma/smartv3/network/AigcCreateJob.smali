.class public final Lcom/sma/smartv3/network/AigcCreateJob;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IMAGE_COUNT:Ljava/lang/String; = "imageCount"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AigcCreateJob;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final QUERY:Ljava/lang/String; = "query"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STYLE:Ljava/lang/String; = "style"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/baiduDuer/aigc_create_job"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AigcCreateJob;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AigcCreateJob;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AigcCreateJob;->INSTANCE:Lcom/sma/smartv3/network/AigcCreateJob;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
