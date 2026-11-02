.class public final Lcom/sma/smartv3/network/GetAISummary;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AI_MODEL:Ljava/lang/String; = "model"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final AUDIO_FILE_URL:Ljava/lang/String; = "audioFileUrl"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetAISummary;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE:Ljava/lang/String; = "language"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NOTE_TIMESTAMPS:Ljava/lang/String; = "noteTimestamps"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROMPT_ID:Ljava/lang/String; = "promptId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TEXT:Ljava/lang/String; = "text"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ai/aiSummary"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL_V2:Ljava/lang/String; = "/ai/aiSummary/v2"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL_V3:Ljava/lang/String; = "/ai/aiSummary/v3"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final diarizationEnabled:Ljava/lang/String; = "diarizationEnabled"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetAISummary;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetAISummary;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetAISummary;->INSTANCE:Lcom/sma/smartv3/network/GetAISummary;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
