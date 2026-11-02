.class public final Lcom/sma/smartv3/network/GetMeetingTask;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetMeetingTask;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TASK_ID:Ljava/lang/String; = "taskId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ai/meetingTask/query"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetMeetingTask;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetMeetingTask;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetMeetingTask;->INSTANCE:Lcom/sma/smartv3/network/GetMeetingTask;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
