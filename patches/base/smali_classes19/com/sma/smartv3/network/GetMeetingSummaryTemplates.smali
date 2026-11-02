.class public final Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STATUS:Ljava/lang/String; = "status"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STATUS_ENABLED:Ljava/lang/String; = "1"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ai/meeting-summary/templates"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;->INSTANCE:Lcom/sma/smartv3/network/GetMeetingSummaryTemplates;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
