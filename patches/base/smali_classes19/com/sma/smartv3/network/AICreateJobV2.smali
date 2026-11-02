.class public final Lcom/sma/smartv3/network/AICreateJobV2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AI_EXTRA:Ljava/lang/String; = "extra"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final AI_MODEL:Ljava/lang/String; = "model"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final AI_Stream:Ljava/lang/String; = "stream"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AICreateJobV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final QUERY:Ljava/lang/String; = "text"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ai/generateImg"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AICreateJobV2;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AICreateJobV2;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AICreateJobV2;->INSTANCE:Lcom/sma/smartv3/network/AICreateJobV2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
